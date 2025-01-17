package sample;

public class InstantiateCar {
    public static void main(String[] args) {
        
        Car estima = new Car();

        estima.setSpeed(30);
        estima.setName("エスティマ");

        System.out.println("現在のスピード"+estima.getSpeed());
        System.out.println("車種:"+estima.getName());
    }
}
