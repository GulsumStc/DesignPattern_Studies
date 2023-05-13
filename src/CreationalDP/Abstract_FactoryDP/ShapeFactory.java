package CreationalDP.Abstract_FactoryDP;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){ // bu method bana shape uretecek
        
        if (shapeType==null){
            return null;
        }

        if (shapeType.equalsIgnoreCase(Shapes.DAIRE.name())){
            return new Circle();

        } else if (shapeType.equalsIgnoreCase(Shapes.DIKDORTGEN.name())) {

            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(Shapes.KARE.name())) {

            return new Square();

        }
        return null;
    }


    @Override
   public Color getColor(String color) {
        return null;
    }
}
