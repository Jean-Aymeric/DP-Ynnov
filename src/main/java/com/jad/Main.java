package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Article bg1 = new BoardGame("Tainted Graal", "TG", 60, 4);
        Article bg2 = new BoardGame("Call of Cthulhu", "CC", 35, 2);
        Article meal1 = new Meal("Tacos", "TC", 6, 1000);
        Article meal2 = new Meal("Kebab", "TC", 6.5F, 1050);
        Article cl1 = new Clothe("Slip", "SL", 3, 1, "Blanc");
        Article cl2 = new Clothe("Bonnet", "BN", 15, 3, "Noir");
        Article cg1 = new CardGame("Horreur à Arkham LCG", "HA", 40, 2, true);

        List<Article> articles = new ArrayList<>();
        articles.add(bg1);
        articles.add(bg2);
        articles.add(meal1);
        articles.add(meal2);
        articles.add(cl1);
        articles.add(cl2);
        articles.add(cg1);

        Displayer displayer = new Displayer();

        for (Article article : articles) {
            displayer.display(article);
        }
    }
}