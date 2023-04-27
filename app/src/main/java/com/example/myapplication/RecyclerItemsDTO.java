package com.example.myapplication;

public class RecyclerItemsDTO {


    String languages;
    int images;

    public RecyclerItemsDTO(String languages, int images) {
        this.languages = languages;
        this.images = images;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
