package sample.Sogoensyu;

public class MedalFactory {
    private Employee[] employees;

    public Medal makeMedal(int a,Material material,Employee[] employees){
        int total = 0;
        if(material.getName().equals("金")){
            Medal gold = new Medal();
            gold.setName("金メダル");
            for(Employee emp : employees){
                total+=emp.getSalary();
            }
            gold.setPrice(material.getCost()+(total/a)*12/10);
            return gold;
        }else if(material.getName().equals("銀")){
            Medal silver = new Medal();
            silver.setName("銀メダル");
            for(Employee emp : employees){
                total+=emp.getSalary();
            }
            silver.setPrice(material.getCost()+(total/a)*12/10);
             return silver;
        }else if(material.getName().equals("銅")){
            Medal bronze = new Medal();
            bronze.setName("銅メダル");
            for(Employee emp : employees){
                total+=emp.getSalary();
            }
            bronze.setPrice(material.getCost()+(total/a)*12/10);
            return bronze;
        }else{
            Medal wood = new Medal();
            wood.setName("不良品");
            return wood;
        }
    }


    
}
