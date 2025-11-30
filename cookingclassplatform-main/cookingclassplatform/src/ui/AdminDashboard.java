package ui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import models.Recipe;
import services.DataStore;

public class AdminDashboard extends JFrame {

    private DefaultListModel<String> model;
    private JList<String> recipeList;
    private JComboBox<String> filterCombo;
    private List<Recipe> filteredRecipes = new ArrayList<>();

    public AdminDashboard() {
        setTitle("Admin Dashboard - Cooking Learning System");
        setSize(600, 430);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Manage Recipes (Filter by Veg / Non-Veg):");
        label.setBounds(20, 10, 300, 30);
        add(label);

        // Filter ComboBox
        String[] filterOptions = {"All", "Veg", "Non-Veg"};
        filterCombo = new JComboBox<>(filterOptions);
        filterCombo.setBounds(350, 10, 200, 30);
        add(filterCombo);

        model = new DefaultListModel<>();
        recipeList = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(recipeList);
        scrollPane.setBounds(20, 50, 320, 280);
        add(scrollPane);

        JButton addBtn = new JButton("Add Recipe");
        addBtn.setBounds(380, 80, 150, 30);
        add(addBtn);

        JButton viewBtn = new JButton("View Recipe");
        viewBtn.setBounds(380, 130, 150, 30);
        add(viewBtn);

        // Filter change listener
        filterCombo.addActionListener(e ->
                refreshRecipeList((String) filterCombo.getSelectedItem())
        );

        // Add recipe button
        addBtn.addActionListener(e -> {
            String title = JOptionPane.showInputDialog(this, "Recipe Title:");
            if (title != null && !title.trim().isEmpty()) {
                String[] typeOptions = {"Veg", "Non-Veg"};
                String type = (String) JOptionPane.showInputDialog(
                        this,
                        "Select Recipe Type:",
                        "Recipe Type",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        typeOptions,
                        typeOptions[0]
                );

                if (type == null || type.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Recipe type is required.");
                    return;
                }

                String ingredients = JOptionPane.showInputDialog(this, "Ingredients:");
                if (ingredients == null || ingredients.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ingredients are required.");
                    return;
                }

                String steps = JOptionPane.showInputDialog(this, "Steps:");
                if (steps == null || steps.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Steps are required.");
                    return;
                }

                Recipe r = new Recipe(title.trim(), type.trim(), ingredients.trim(), steps.trim());
                DataStore.addRecipe(r);
                // Refresh list according to current filter
                refreshRecipeList((String) filterCombo.getSelectedItem());
            }
        });

        // View recipe button
        viewBtn.addActionListener(e -> {
            int index = recipeList.getSelectedIndex();
            if (index >= 0 && index < filteredRecipes.size()) {
                Recipe selectedRecipe = filteredRecipes.get(index);
                new RecipeDetailsUI(selectedRecipe);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a recipe first.");
            }
        });

        // Initial load
        refreshRecipeList("All");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void refreshRecipeList(String filter) {
        model.clear();
        filteredRecipes.clear();

        for (Recipe r : DataStore.recipes) {
            if ("All".equalsIgnoreCase(filter)
                    || r.getType().equalsIgnoreCase(filter)) {
                filteredRecipes.add(r);
                model.addElement(r.getTitle() + " (" + r.getType() + ")");
            }
        }
    }
}
