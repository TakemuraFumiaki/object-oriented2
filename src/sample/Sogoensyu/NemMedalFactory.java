package sample.Sogoensyu;

public class NemMedalFactory extends MedalFactory{
    
    public Medal makeMedal(int a,Material material,Employee[] employees){
        super.makeMedal(a, material, employees);
        int total = 0;
        if(material.getName().equals("プラチナ")){
            Medal pratina = new Medal();
            pratina.setName("プラチナメダル");
            for(Employee emp : employees){
                total+=emp.getSalary();
            }
            pratina.setPrice(material.getCost()+(total/a)*12/10);
            return pratina;
        }else{
            Medal wood = new Medal();
            wood.setName("不良品");
            return wood;
        }
        
    }
}
