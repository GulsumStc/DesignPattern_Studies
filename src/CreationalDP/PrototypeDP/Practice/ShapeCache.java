package CreationalDP.PrototypeDP.Practice;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {


    public static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){

        Shape cachedShape = shapeMap.get(shapeId);

        return cachedShape.clone();

    }

    public static void loadCache(){

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

    }

}
