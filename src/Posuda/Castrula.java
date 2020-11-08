package Posuda;

import interfaces.*;

public class Castrula implements OutputObj, Posuda {      //Реализация интерфейсов
    protected String creator;
    protected int price;
    protected String style;
    private int volume;
    private boolean hasCrishka;
    private String nameCastruli;

    public Castrula(String creator, int price, String style, int volume, boolean hasCrishka) {
        this.creator = creator;
        this.price = price;
        this.style = style;
        this.volume = volume;
        this.hasCrishka = hasCrishka;
    }

    public Castrula(String creator, int price, String style) {
        this.creator = creator;
        this.price = price;
        this.style = style;
        this.volume = 0;
        this.hasCrishka = false;
    }

    public Castrula() {
        this.creator = "";
        this.price = 0;
        this.style = "обычный";
        this.volume = 0;
        this.hasCrishka = false;
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

    public int getVolume() {
        return volume;
    }

    public boolean hasCrishka() {
        return hasCrishka;
    }

    public String getNameCastruli() {
        return nameCastruli;
    }

    @Override
    public void name(String name) {
        this.nameCastruli = name;
    }      //реализация метода интерфейса

    @Override
    public void printInfo(Posuda object) {
        System.out.printf("Кастрюля.\n" +
                "Имя: %s;\n", getNameCastruli());
        System.out.printf("Производитель: " + getCreator() + "\n" +
                "Цена: " + getPrice() + "\n" +
                "Стиль: " + getStyle() + "\n");
        System.out.printf("Объём: %d;\n" +
                        "Наличие крышки: %s;\n",
                getVolume(), hasCrishka());
        System.out.println("");
    }
}
