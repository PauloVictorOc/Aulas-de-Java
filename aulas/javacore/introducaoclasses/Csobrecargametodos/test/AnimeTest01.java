package javacore.introducaoclasses.Csobrecargametodos.test;

import javacore.introducaoclasses.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Afro Samurai", "Tv", 24, "Ação");
        anime.imprime();

    }
}
