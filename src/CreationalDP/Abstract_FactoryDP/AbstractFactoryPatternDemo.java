package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        // sekil fabrikasi cagiriliyor

        AbstractFactory shapeFactory =  FactoryProducer.getFactory(FactoryTypes.SEKIL.name());

        Shape shape1 =  shapeFactory.getShape(Shapes.DAIRE.name());
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(Shapes.DIKDORTGEN.name());
        shape2.draw();



        // renk fabrikasi cagiriliyor

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryTypes.RENK.name());

        Color color1 = colorFactory.getColor(Colors.KIRMIZI.name());

        Color color2 = colorFactory.getColor(Colors.MAVI.name());





    }
}
