package com.poum.kmerdelices.ui.home;

import com.poum.kmerdelices.models.Categories;
import com.poum.kmerdelices.models.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
