package sample;

public class Taxi extends Car{
    int price;

    void payment(){
        System.out.println("料金を"+price+"円し払いました");
        price=0;
    }

    
    void stepOnAccele(){
        super.stepOnAccele();
        price = price+90;
        System.out.println("料金が"+price+"円にふえました");
    }
}
