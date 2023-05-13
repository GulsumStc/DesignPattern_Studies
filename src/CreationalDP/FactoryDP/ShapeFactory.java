package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType){ // bu method bana shape uretecek
        
        if (shapeType==null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("DAIRE")){
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("DIKDORTGEN")) {

            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("KARE")) {

            return new Square();

        }
        return null;
    }



}
