package CreationalDP.PrototypeDP.Practice;

public class PrototypePatternDemo2 {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println(shape1);
        System.out.println("Shape: "+ shape1.getType());

        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape);
        shape.setType("Diktortgen");
        System.out.println("Shape: "+ shape.getType());

        System.out.println(ShapeCache.shapeMap);




        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("Shape: "+ shape2.getType());




    }

}
