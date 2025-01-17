package com.jad;

public class Displayer {
    public void display(Article article) {
        System.out.println("===================================");
        System.out.println("Article : " + article.getCode() + " " + article.getName());
        article.isDisplayed(this);
        System.out.println(article.getPrice() + " €");
    }

    public void display(Meal article) {
        System.out.println("Calories : " + article.getNbCalories());
    }

    public void display(BoardGame article) {
        System.out.println("Nb players : " + article.getNbPlayers());
    }

    public void display(CardGame article) {
        System.out.println("Nb players : " + article.getNbPlayers());
        System.out.println("Collectible : " + article.isCollectible());
    }

    public void display(Clothe article) {
        System.out.println("Size : " + article.getSize());
    }
}
