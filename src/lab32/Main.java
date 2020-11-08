package lab32;

import Posuda.*;
import interfaces.Posuda;

class Salat extends Tarelka {

    Salat(String creator, int price, String style, int diametr) {
        super(creator, price, style, diametr);
    }

    @Override
    public void lookAtType()        //реализация абстрактного метода
    {
        System.out.printf("Это класс Salat с именем %s\n", getNameTarelki());
    }

    @Override
    public void name(String name) { setNameTarelki(name); }

    @Override
    public void printInfo(Posuda object) {
        System.out.printf("Салатница.\n" +
                "Имя: %s;\n", getNameTarelki());
        System.out.printf("Производитель: " + getCreator() + "\n" +
                "Цена: " + getPrice() + "\n" +
                "Стиль: " + getStyle() + "\n");
        System.out.printf("Диаметр: %d;\n",
                getDiametr());
        System.out.println("");
    }
}

class Bludce extends Tarelka {

    Bludce(String creator, int price, String style, int diametr) {
        super(creator, price, style, diametr);
    }

    @Override
    public void lookAtType()
    {
        System.out.printf("Это класс Bludce с именем %s\n", getNameTarelki());
    }

    @Override
    public void name(String name) { setNameTarelki(name); }

    @Override
    public void printInfo(Posuda object) {
        System.out.printf("Блюдце.\n" +
                "Имя: %s;\n", getNameTarelki());
        System.out.printf("Производитель: " + getCreator() + "\n" +
                "Цена: " + getPrice() + "\n" +
                "Стиль: " + getStyle() + "\n");
        System.out.printf("Диаметр: %d;\n",
                getDiametr());
        System.out.println("");
    }
}

public class Main {

    public static void main(String[] args) {
        Castrula castrula = new Castrula("Завод кастрюль", 100, "Цветной", 8, true);
        Skovoroda skovoroda = new Skovoroda("Завод сковородок", 80, "Черный");
        Salat salat = new Salat("Завод салатниц", 12, "Белый", 7);
        Bludce bludce = new Bludce("Завод блюдцев", 8, "Желтый", 5);

        castrula.name("Глубочайшая кастрюля");
        skovoroda.name("Просто сковорода");
        salat.name("Салатка");
        bludce.name("Блюдка");

        castrula.printInfo(castrula);
        skovoroda.printInfo(skovoroda);
        salat.printInfo(salat);
        bludce.printInfo(bludce);

        salat.lookAtType();
        bludce.lookAtType();
    }
}
