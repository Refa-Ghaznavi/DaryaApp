package com.example.daryaapp.model;

import java.util.List;

public class AllCategory {
    String categoryTitle;
    String categorySeeMore;
    List<CategoryItem> categoryItemList;

    public AllCategory(String categoryTitle, String categorySeeMore, List<CategoryItem> categoryItemList) {
        this.categoryTitle = categoryTitle;
        this.categorySeeMore = categorySeeMore;
        this.categoryItemList = categoryItemList;
    }

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategorySeeMore() {
        return categorySeeMore;
    }

    public void setCategorySeeMore(String categorySeeMore) {
        this.categorySeeMore = categorySeeMore;
    }
}
