package com.togettech.kmerdelices.ui.home;

import com.togettech.kmerdelices.models.Categories;
import com.togettech.kmerdelices.models.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
