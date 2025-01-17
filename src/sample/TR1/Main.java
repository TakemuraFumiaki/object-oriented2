package sample.TR1;

public class Main {
    public static void main(String[] args) {
        Manager[] managers = new Manager[3];
        managers[0] = new Manager("Taro Yamada",101,80000.0,"Sales");
        managers[1] = new Manager("Hanako Suzuki",102,90000.0,"Marketing");
        managers[2] = new Manager("Ichiro Tanaka",103,85000.0,"HR");

        for(Manager manager: managers){
            manager.intoro();
            
        }
    }

}
