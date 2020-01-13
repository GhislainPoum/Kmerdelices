package com.poum.kmerdelices.ui.detail;


import com.poum.kmerdelices.models.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}
