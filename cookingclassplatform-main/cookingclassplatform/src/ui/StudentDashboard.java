package ui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import models.Recipe;
import services.DataStore;

public class StudentDashboard extends JFrame {

    private DefaultListModel<String> model;
    private JList<String> recipeList;
    private JComboBox<String> filterCombo;
    private List<Recipe> filteredRecipes = new ArrayList<>();

    public StudentDashboard() {
        setTitle("Student Dashboard - Cooking Learning System");
        setSize(600, 430);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Available Recipes (Filter by Veg / Non-Veg):");
        label.setBounds(20, 10, 320, 30);
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

        JButton viewBtn = new JButton("View Recipe");
        viewBtn.setBounds(380, 100, 150, 30);
        add(viewBtn);

        // Filter change listener
        filterCombo.addActionListener(e ->
                refreshRecipeList((String) filterCombo.getSelectedItem())
        );

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
