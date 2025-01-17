package sample;

public class Bus extends Car {
    int price;

    void stepOnAccele(){
        super.stepOnAccele();
        price+=30;
        System.out.println("料金が"+price+"円にふえました");
    }
}
