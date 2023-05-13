package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "Merhaba";

    public static SingletonObject   insatance = new SingletonObject();

    /*
    Bu, "SingletonObject" sınıfından bir örnek oluşturan ve "instance" olarak adlandırılan bir static değişkendir.
    Bu değişken, Singleton tasarım deseninde sınıfın yalnızca bir örneğini tutmak için kullanılır.

    Bu nedenle, "instance" bir değişkendir ve "SingletonObject" sınıfının yalnızca bir örneğini temsil eder.
    Bu örnek, sınıfın diğer tüm öğeleri için tek bir nokta sağlayarak, tüm uygulama boyunca paylaşılabilir.
     */

    /*
    Singleton design pattern duzenleyebilmek icin
     1-  constructor'i private'a cekerim
     2-  bu classtan statik bir sekilde instance olusturacak method yazarim

     */

    public static SingletonObject getInstance(){
        return insatance;
    }


    // parameteresiz cont private'a cektim. Interview'de cikabilir
    // Parametresiz const neden private'a cekeriz diye???
    // 1- O objenin newlenmesini istemiyorumdum
    // 2 - objenin singleton scope'ta objenin uretilmesini istiyorumdur
    // Dolayisiyla o class icinde o classtan static bir sekilde o classin instanceini olusturacak method yazarim
    // ve parametresiz const private'a cekerim
    private SingletonObject(){

    }

    public void changeMessage(){
        this.message = this.message+" Batch 130-131-138";
        System.out.println(message);
    }


}
