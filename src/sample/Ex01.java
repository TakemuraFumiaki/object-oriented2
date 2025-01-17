package sample;

public class Ex01 {
    public static void main(String[] args) {
        Bus bus = new Bus();

        bus.speed=10;
        bus.stepOnAccele();
        bus.stepOnBreak();
        bus.stepOnBreak();

        System.out.println("スピードが"+bus.speed+"km/hになりました");

        bus.stepOnAccele();
        bus.stepOnAccele();
        bus.stepOnAccele();
        System.out.println("料金が"+bus.price+"になりました");


    }

}
