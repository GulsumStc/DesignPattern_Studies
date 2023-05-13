package CreationalDP.SingletonDP;

public class SingletonPatternDemo {

    public static void main(String[] args) {

       // SingletonObject object1 = new SingletonObject();

     SingletonObject object1 =    SingletonObject.getInstance();// tamam artik her seferinde ayni obje gelir static oldugundan ama
                                                            // hala paramatresiz const cagirabiliyorum ve new'lwywbiliyoeum
                                                            // Burada cont private'a cekiyorum


        System.out.println( "Object1 : "+object1.message);// Merhaba
        object1.changeMessage(); //"Batch 130-131-138"

        SingletonObject object2 = SingletonObject.getInstance();

        System.out.println( "Object2 : "+object2.message);// -->Merhaba Batch 130-131-138
        object2.changeMessage(); //"Batch 130-131-138"








    }

}
