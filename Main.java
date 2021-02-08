package lesson_7;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {new Cat("Sobaka", 23),
            new Cat("Pes", 33),
            new Cat("Murik", 44),
            new Cat("Lisi`", 1),
            new Cat("Volshebniik", 14)};
    Plate plate = new Plate(13);

        for (int i = 0; i <cats.length ; i++) {
            cats[i].eat(plate);
            cats[i].checkStatus();
        }
}

    }



