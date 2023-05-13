package CreationalDP.PrototypeDP;

public class PrototypePatternDemo {


    public static void main(String[] args) {


        //1.Yol

        Soldier AvailableSoldier1=new Soldier(100,45,20,
                50,60,5,"Kilic",true);

        Soldier notAvailableSoldier1=new Soldier(100,45,20, // burada 50 field oldugunu dusunursek hepsini yazmamiz gerekecekti.
                50,60,5,"Kilic",false);


        // 2.Yol
        Soldier notAvailableSoldier2=  AvailableSoldier1.clone();

        notAvailableSoldier2.setAvailableForWar(false);

        System.out.println("-------------------------------------");
        System.out.println("NotavailableSoldier icin cikti : ");
        notAvailableSoldier1.showSoldierInfo();

        System.out.println("--------------------------------------");
        System.out.println("Clone ozelligiyle kulnilarak uretilen asker : ");
        notAvailableSoldier2.showSoldierInfo();







    }

}
