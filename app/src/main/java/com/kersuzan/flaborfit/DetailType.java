package com.kersuzan.flaborfit;

enum DetailType {
    Weight,
    Yoga,
    Cardio;

    public String getTitle() {
        String title = "";

        switch (this) {
            case Weight:
                title = "Weight Lifting";
                break;
            case Cardio:
                title = "Cardio";
                break;
            case Yoga:
                title = "Yoga";
                break;
        }

        return title;
    }


}
