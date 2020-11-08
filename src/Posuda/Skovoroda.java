package Posuda;

import interfaces.*;

public class Skovoroda implements OutputObj, Posuda {
    protected String creator;
    protected int price;
    protected String style;
    private int lenght;
    private String pokritie;
    private String nameSkovorodi;

    public Skovoroda(String creator, int price, String style, int lenght, String pokritie) {
        this.creator = creator;
        this.price = price;
        this.style = style;
        this.lenght = lenght;
        this.pokritie = pokritie;
    }

    public Skovoroda(String creator, int price, String style) {
        this.creator = creator;
        this.price = price;
        this.style = style;
        this.lenght = 0;
        this.pokritie = "Norm";
    }

    public Skovoroda() {
        this.creator = "";
        this.price = 0;
        this.style = "обычный";
        this.lenght = 0;
        this.pokritie = "Norm";
    }

    public String getCreator() {
        return creator;
    }

    public int getPrice() {
        return price;
    }

    public String getStyle() {
        return style;
    }

    public int getLenght() {
        return lenght;
    }

    public String getPokritie() {
        return pokritie;
    }

    public String getNameSkovorodi() {
        return nameSkovorodi;
    }

    @Override
    public void name(String name) { this.nameSkovorodi = name; }

    @Override
    public void printInfo(Posuda object) {
        System.out.printf("Сковорода.\n" +
                "Имя: %s;\n", getNameSkovorodi());
        System.out.printf("Производитель: " + getCreator() + "\n" +
                "Цена: " + getPrice() + "\n" +
                "Стиль: " + getStyle() + "\n");
        System.out.printf("Длина ручки: %d;\n" +
                        "Тип покрытия: %s;\n",
                getLenght(), getPokritie());
        System.out.println("");
    }
}
