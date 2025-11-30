package services;

import java.util.ArrayList;
import java.util.List;

import db.UserDAO;
import models.Admin;
import models.Recipe;
import models.Student;
import models.User;

public class DataStore {

    public static List<User> users = new ArrayList<>();
    public static List<Recipe> recipes = new ArrayList<>();

    static {
        // Default in-memory users
        users.add(new Admin("admin", "123"));
        users.add(new Student("raj", "000"));

        // Default recipes with Veg / Non-Veg

        recipes.add(new Recipe("Butter Chicken",
                "Non-Veg",
                "Chicken, Butter, Cream, Tomato Puree, Spices",
                "1. Marinate chicken in curd, ginger-garlic paste, and spices.\n"
                        + "2. Fry the marinated chicken pieces in butter.\n"
                        + "3. Prepare gravy with butter, tomato puree, and spices.\n"
                        + "4. Add cream and simmer for 10 minutes.\n"
                        + "5. Mix chicken with gravy and cook for a few minutes."));

        recipes.add(new Recipe("Pasta Alfredo",
                "Veg",
                "Pasta, Butter, Flour, Milk, Cream, Cheese, Garlic, Salt, Pepper",
                "1. Boil pasta until al dente and keep aside.\n"
                        + "2. In a pan, melt butter and add chopped garlic.\n"
                        + "3. Add flour, cook slightly, then add milk slowly to make white sauce.\n"
                        + "4. Add cream, cheese, salt, and pepper.\n"
                        + "5. Mix boiled pasta into the sauce and serve hot."));

        recipes.add(new Recipe("Paneer Tikka Masala",
                "Veg",
                "Paneer, Curd, Spices, Onion, Tomato, Cream",
                "1. Marinate paneer cubes in curd, red chili powder, turmeric, and garam masala.\n"
                        + "2. Grill or shallow fry paneer till golden.\n"
                        + "3. Prepare onion-tomato gravy in a pan.\n"
                        + "4. Add cream and cooked paneer to the gravy.\n"
                        + "5. Simmer for 5 minutes and serve with naan or roti."));

        recipes.add(new Recipe("Veg Biryani",
                "Veg",
                "Basmati Rice, Mixed Vegetables, Biryani Masala, Saffron, Ghee",
                "1. Parboil basmati rice and keep aside.\n"
                        + "2. Saute vegetables with biryani masala in ghee.\n"
                        + "3. In a handi, layer rice and vegetables alternately.\n"
                        + "4. Add saffron milk on top and seal the pot.\n"
                        + "5. Cook on low flame (dum) for 20 minutes."));

        recipes.add(new Recipe("Masala Dosa",
                "Veg",
                "Dosa Batter, Potatoes, Onion, Mustard Seeds, Curry Leaves, Green Chilies",
                "1. Prepare potato masala by tempering mustard seeds, curry leaves, onions, and spices.\n"
                        + "2. Add boiled potatoes and mix well.\n"
                        + "3. On a hot tawa, spread dosa batter thinly.\n"
                        + "4. Place potato masala in center and fold the dosa.\n"
                        + "5. Serve hot with coconut chutney and sambar."));

        recipes.add(new Recipe("Chicken Fried Rice",
                "Non-Veg",
                "Cooked Rice, Boneless Chicken, Carrot, Capsicum, Spring Onion, Soy Sauce",
                "1. Cook chicken pieces with salt and pepper and keep aside.\n"
                        + "2. Stir fry finely chopped vegetables on high flame.\n"
                        + "3. Add cooked rice and mix with vegetables.\n"
                        + "4. Add soy sauce and toss everything together.\n"
                        + "5. Add chicken pieces, mix and serve hot."));

        recipes.add(new Recipe("Chole Bhature",
                "Veg",
                "Chickpeas, Onion, Tomato, Chole Masala, Flour, Curd, Oil",
                "1. Soak chickpeas overnight and pressure cook till soft.\n"
                        + "2. Prepare onion-tomato gravy with chole masala.\n"
                        + "3. Add boiled chole and simmer for 10–15 minutes.\n"
                        + "4. Knead dough for bhature using flour, curd, and a little oil.\n"
                        + "5. Roll and fry bhature till puffed and golden."));

        recipes.add(new Recipe("Egg Curry",
                "Non-Veg",
                "Eggs, Onion, Tomato, Ginger-Garlic Paste, Spices",
                "1. Boil eggs, peel them, and keep aside.\n"
                        + "2. Fry onions till golden, add ginger-garlic paste and tomatoes.\n"
                        + "3. Add spices like turmeric, chili powder, and garam masala.\n"
                        + "4. Add water to form gravy and boil.\n"
                        + "5. Add boiled eggs into the gravy and simmer for 5–7 minutes."));

        recipes.add(new Recipe("Aloo Paratha",
                "Veg",
                "Wheat Flour, Potatoes, Green Chilies, Coriander, Spices, Ghee",
                "1. Boil and mash potatoes.\n"
                        + "2. Add chopped green chilies, coriander, and spices to potatoes.\n"
                        + "3. Knead dough using wheat flour and water.\n"
                        + "4. Roll dough ball, stuff with potato filling, and roll again gently.\n"
                        + "5. Cook on tawa with ghee till golden on both sides."));

        recipes.add(new Recipe("Chicken Tandoori",
                "Non-Veg",
                "Chicken Legs, Curd, Lemon Juice, Tandoori Masala, Oil",
                "1. Make cuts on chicken legs for better marination.\n"
                        + "2. Prepare marinade using curd, lemon juice, tandoori masala, and salt.\n"
                        + "3. Coat chicken well and marinate for at least 4 hours (or overnight).\n"
                        + "4. Grill or bake until chicken is cooked and slightly charred.\n"
                        + "5. Serve hot with onion rings and green chutney."));

        recipes.add(new Recipe("Gulab Jamun",
                "Veg",
                "Milk Powder, Maida, Baking Powder, Milk, Sugar, Water, Cardamom",
                "1. Make a soft dough using milk powder, maida, baking powder, and milk.\n"
                        + "2. Shape into small smooth balls.\n"
                        + "3. Fry on low flame until golden brown.\n"
                        + "4. Prepare sugar syrup with sugar, water, and cardamom.\n"
                        + "5. Soak fried jamuns in warm sugar syrup for at least 30 minutes."));

        recipes.add(new Recipe("Samosa",
                "Veg",
                "Maida, Potatoes, Peas, Spices, Oil",
                "1. Prepare stiff dough using maida, oil, and water.\n"
                        + "2. Make potato-peas stuffing with spices like cumin, coriander, and garam masala.\n"
                        + "3. Roll dough, cut into semi-circles, and form cone shapes.\n"
                        + "4. Fill stuffing inside the cone and seal edges.\n"
                        + "5. Deep fry on medium flame till golden and crisp."));

        recipes.add(new Recipe("Idli Sambar",
                "Veg",
                "Idli Batter, Toor Dal, Vegetables, Tamarind, Sambar Masala",
                "1. Pour idli batter into idli moulds and steam for 10–12 minutes.\n"
                        + "2. Cook toor dal till soft.\n"
                        + "3. Prepare sambar by adding vegetables, tamarind pulp, and sambar masala to dal.\n"
                        + "4. Add a tempering of mustard seeds, curry leaves, and red chilies.\n"
                        + "5. Serve hot idlis with sambar and coconut chutney."));

        recipes.add(new Recipe("Pav Bhaji",
                "Veg",
                "Potatoes, Tomatoes, Peas, Capsicum, Pav Bhaji Masala, Butter, Pav",
                "1. Boil and mash potatoes and other vegetables.\n"
                        + "2. In a pan, cook onions, tomatoes, and capsicum with pav bhaji masala.\n"
                        + "3. Add mashed vegetables and lots of butter.\n"
                        + "4. Cook while mashing everything on tawa.\n"
                        + "5. Toast pav with butter and serve with hot bhaji, onion, and lemon."));

        recipes.add(new Recipe("Shahi Paneer",
                "Veg",
                "Paneer, Cream, Cashews, Onion, Tomato, Spices",
                "1. Soak cashews and grind into a smooth paste.\n"
                        + "2. Fry onions and tomatoes, then blend into a paste.\n"
                        + "3. Cook both pastes together with spices.\n"
                        + "4. Add cream and paneer cubes.\n"
                        + "5. Simmer on low flame and garnish with coriander."));

        recipes.add(new Recipe("Simple Vegetable Curry",
                "Veg",
                "Mixed Vegetables, Onion, Tomato, Ginger-Garlic, Spices",
                "1. Chop vegetables like carrot, beans, peas, and potato.\n"
                        + "2. Fry onions and ginger-garlic paste till golden.\n"
                        + "3. Add tomatoes and cook till soft.\n"
                        + "4. Add spices and chopped vegetables.\n"
                        + "5. Add water and cook till vegetables are soft."));
    }

    // synchronized for thread-safety
    public static synchronized void addRecipe(Recipe r) {
        recipes.add(r);
    }

    public static User login(String username, String password) {
        // 1. Pehle DB se check
        UserDAO dao = new UserDAO();
        User fromDb = dao.login(username, password);
        if (fromDb != null) {
            return fromDb;
        }

        // 2. In-memory list se check
        for (User u : users) {
            if (u.getUsername().equals(username) &&
                    u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
}
