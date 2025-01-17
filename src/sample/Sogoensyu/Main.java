package sample.Sogoensyu;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("山田", 200000);
        employees[1] = new Employee("海田", 220000);
        employees[2] = new Employee("川田", 240000);

        Material[] materials = new Material[5];
        materials[0] = new Material("金", 10000);
        materials[1] = new Material("銀", 5000);
        materials[2] = new Material("銅", 1000);
        materials[3] = new Material("木", 500);
        materials[4] = new Material("プラチナ", 20000);

        int a = materials.length;

        MedalFactory medalFactory =  new MedalFactory();

        Medal kin = medalFactory.makeMedal(a,materials[0],employees);
        Medal gin = medalFactory.makeMedal(a,materials[1],employees);
        Medal dou = medalFactory.makeMedal(a,materials[2],employees);
        Medal ki = medalFactory.makeMedal(a,materials[3],employees);
        Medal pra = medalFactory.makeMedal(a,materials[4],employees);

        System.out.println("製品名 :"+kin.getName()+" /価格："+ kin.getPrice()+"円");
        System.out.println("製品名 :"+gin.getName()+" /価格："+ gin.getPrice()+"円");
        System.out.println("製品名 :"+dou.getName()+" /価格："+ dou.getPrice()+"円");
        System.out.println("製品名 :"+ki.getName()+" /価格："+ ki.getPrice()+"円");
        System.out.println("製品名 :"+pra.getName()+" /価格："+ pra.getPrice()+"円");
      
    }
}
