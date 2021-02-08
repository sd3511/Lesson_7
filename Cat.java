package lesson_7;



public class Cat {
    private boolean isHungry = true;
    private String name;
    private int appetite;

    public Cat( String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
public void eat (Plate plate){
        if (isHungry && plate.isNegativeEat(appetite)){
            isHungry = false;
        }
}
  public  void checkStatus() {
        if (isHungry==false){
            System.out.println("Кот "+ name +" сыт");
        }
        else{
            System.out.println("Кот "+ name +" голоден");
        }
    }




}
