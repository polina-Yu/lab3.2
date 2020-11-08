package Posuda;

import interfaces.*;

public abstract class Tarelka implements OutputObj, Posuda {
    protected String creator;
    protected int price;
    protected String style;
    private int diametr;
    private String nameTarelki;

    public Tarelka(String creator, int price, String style, int diametr) {
        this.creator = creator;
        this.price = price;
        this.style = style;
        this.diametr = diametr;
    }

    public Tarelka(String creator, int price, String style) {
        this.creator = creator;
        this.price = price;
        this.style = style;
        this.diametr = 0;
    }

    public Tarelka() {
        this.creator = "";
        this.price = 0;
        this.style = "обычный";
        this.diametr = 0;
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

    public int getDiametr() {
        return diametr;
    }

    public String getNameTarelki() {
        return nameTarelki;
    }

    public void setNameTarelki(String name) { nameTarelki = name; }

    public abstract void lookAtType();   //абстрактный метод для реализации в наследниках
}
