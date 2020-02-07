package com.togettech.kmerdelices.ui.detail;


import com.togettech.kmerdelices.models.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}
