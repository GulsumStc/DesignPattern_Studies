package CreationalDP.FactoryDP;

// Ürünlerimiz için bir arayüz tanımlayalım.
interface Product {
    void operate();
}

// Concrete Product 1
class ConcreteProduct1 implements Product {
    @Override
    public void operate() {
        System.out.println("ConcreteProduct1 operates.");
    }
}

// Concrete Product 2
class ConcreteProduct2 implements Product {
    @Override
    public void operate() {
        System.out.println("ConcreteProduct2 operates.");
    }
}

// Factory sınıfımızı tanımlayalım.
class Factory {
    public static Product createProduct(String type) {
        if (type.equals("Product1")) {
            return new ConcreteProduct1();
        } else if (type.equals("Product2")) {
            return new ConcreteProduct2();
        } else {
            throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}

// Kullanım örneği
public class Example {
    public static void main(String[] args) {
        // Factory sınıfını kullanarak Concrete Product 1'i oluşturalım.
        Product product1 = Factory.createProduct("Product1");
        product1.operate(); // Output: ConcreteProduct1 operates.

        // Factory sınıfını kullanarak Concrete Product 2'yi oluşturalım.
        Product product2 = Factory.createProduct("Product2");
        product2.operate(); // Output: ConcreteProduct2 operates.
    }
}