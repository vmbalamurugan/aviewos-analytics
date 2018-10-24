package com.avios.hackathon.domain;

import java.util.List;

/**
 * Created by t594957 on 10/24/2018.
 */
public class City {

    private List<Image> images;
    private String name;
    private String details;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
