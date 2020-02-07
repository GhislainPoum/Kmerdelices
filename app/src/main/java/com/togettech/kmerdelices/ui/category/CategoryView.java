package com.togettech.kmerdelices.ui.category;



import com.togettech.kmerdelices.models.Meals;

import java.util.List;

public interface CategoryView {
    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
