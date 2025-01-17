package sample;

public class Car {
    protected int speed;
    protected String name;
    private boolean flg;

    

    Car(){
    }

    Car(int speed,String name){
        this.speed=speed;
        this.name=name;
    }

    void stepOnAccele(){
        speed=speed+10;
        System.out.println("スピードが"+speed+"km/hにふえまっした");
    }

    void stepOnBreak(){
        speed=speed -10;
        System.out.println("スピードが"+speed+"km/hに減りました");
    }

    public int getSpeed(){
        return this.speed;
    }

    public String getName(){
        return this.name;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void setName(String name){
        this.name=name;
    }

    public boolean isFlg() {
        return flg;
    }

    public void setFlg(boolean flg) {
        this.flg = flg;
    }


}
