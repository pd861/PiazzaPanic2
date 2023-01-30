package com.team3gdx.game.food;

import java.util.HashMap;
import java.util.Map;

public class Menu {

	private static final Map<Ingredient, String> BURGER_STEPS = new HashMap<Ingredient, String>();
	static {
		BURGER_STEPS.put(Ingredients.cooked_bun, "Toast");
		BURGER_STEPS.put(Ingredients.cookedPatty, "Fry");
	}
	private static final Map<Ingredient, String> BURGER_BURNED_STEPS = new HashMap<Ingredient, String>();
	static {
		BURGER_BURNED_STEPS.put(Ingredients.cooked_bun, "Toast");
		BURGER_BURNED_STEPS.put(Ingredients.burnedPatty, "Fry");
	}
	private static final Map<Ingredient, String> SALAD_STEPS = new HashMap<Ingredient, String>();
	static {
//		saladSteps.put(Ingredients.onion, "Cut");
		SALAD_STEPS.put(Ingredients.lettuceChopped, "Cut");
		SALAD_STEPS.put(Ingredients.tomatoChopped, "Cut");
		SALAD_STEPS.put(Ingredients.onionChopped, "Cut");
	}

	public static final Map<String, Recipe> RECIPES = new HashMap<String, Recipe>();
	static {
		RECIPES.put("Burger", new Recipe("Form patty", Ingredients.unformedPatty, BURGER_STEPS, "serve together",
				"burger", true, null, 32, 32, 0));
		RECIPES.put("Burned burger", new Recipe("Form patty", Ingredients.unformedPatty, BURGER_BURNED_STEPS,
				"serve together", "burger_burned", true, null, 32, 32, 0));
		RECIPES.put("Salad", new Recipe("", null, SALAD_STEPS, "serve together", "salad", false, null, 32, 32, 0));
	}

	public static final Map<Ingredient, Ingredient> INGREDIENT_PREP = new HashMap<Ingredient, Ingredient>();
	static {
		INGREDIENT_PREP.put(Ingredients.unformedPatty, Ingredients.formedPatty);
		INGREDIENT_PREP.put(Ingredients.lettuce, Ingredients.lettuceChopped);
		INGREDIENT_PREP.put(Ingredients.tomato, Ingredients.tomatoChopped);
		INGREDIENT_PREP.put(Ingredients.onion, Ingredients.onionChopped);

	}
}
