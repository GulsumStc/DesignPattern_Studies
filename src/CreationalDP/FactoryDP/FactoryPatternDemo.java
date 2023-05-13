package CreationalDP.FactoryDP;

public class FactoryPatternDemo {

    public static void main(String[] args) {

//        Circle circle1 = new Circle();
//        circle1.draw();
//
//        Square square1 = new Square();
//        square1.draw();
//
//        Rectangle rectangle1 = new Rectangle();
//        rectangle1.draw();

        //********************************
        // burada runnerclass sadece shapeFactory 'le iletisime gececek

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("DAIRE");
        shape1.draw();;


        Shape shape2 = shapeFactory.getShape("DIKDORTGEN");
        shape1.draw();;


        Shape shape3 = shapeFactory.getShape("KARE");
        shape1.draw();;



    }
}
