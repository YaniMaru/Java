package seminar06.Homework;

public class Notebook {
    int id, ram, hdd, diagonal, price;
    String model, os, color;

    public Notebook(int id, String model, int ram, int hdd, String os, int diagonal, String color, int price) {
        this.id = id;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.diagonal = diagonal;
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "\n=========================\n" +
                "Бренд: " + model +
                "\nобъем оперативной памяти: " + ram +
                "\nhdd накопитель: " + hdd + " гб" +
                "\nдиагональ экрана: " + diagonal +
                "\noперационная система: " + os +
                "\nцвет: " + color +
                "\nцена:" + price;
    }

}
