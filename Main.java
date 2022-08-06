package Homework.lesson7.easy;

public class Main {
    public static void main(String[] args) {

        Roses roses = new Roses();
        Flower.quantity ++;
        Tulips tulips = new Tulips();
        Flower.quantity ++;
        Carnations carnations = new Carnations();
        Flower.quantity ++;
        Peonies peonies = new Peonies();
        Flower.quantity ++;

        Flower[]flowers1 = { peonies, tulips, carnations};
        Flower[]flowers2 = {roses, carnations, tulips};
        Flower[]flowers3 = {carnations,tulips,tulips};

        int all = Flower.quantity +  flowers1.length + flowers2.length + flowers3.length;
        System.out.println("Количество созданных обьектов типа Flower " + Flower.quantity);
    }
}
