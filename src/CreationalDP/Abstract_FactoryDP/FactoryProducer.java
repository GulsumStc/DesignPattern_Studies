package CreationalDP.Abstract_FactoryDP;

public class FactoryProducer {


    public static AbstractFactory getFactory(String choice){

        if (choice.equalsIgnoreCase(FactoryTypes.SEKIL.name())){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase(FactoryTypes.RENK.name())){
            return new ColorFactory();

        }
        return null;
    }

}
