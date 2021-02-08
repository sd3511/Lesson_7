package lesson_7;

public class Plate {

    private int numberOfEat;


    public Plate(int numberOfEat) {

        this.numberOfEat = numberOfEat;
    }

    public boolean isNegativeEat (int food){
    if (numberOfEat-food<0){
        return false;
    }
        else return true;
}

public void addFood (int food){
        this.numberOfEat+=food;

}


}
