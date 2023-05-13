package CreationalDP.Abstract_FactoryDP;

public class ColorFactory extends AbstractFactory {


    @Override
  Color getColor(String color) {

        if (color==null){
            return null;

        }

        if (color.equalsIgnoreCase(Colors.KIRMIZI.name())){
            return new Red();
        }else if (color.equalsIgnoreCase(Colors.YESIL.name())){
            return new Green();
        } else if (color.equalsIgnoreCase(Colors.MAVI.name())) {
            return new Blue();
        }

        return  null;

    }


    @Override
   public Shape getShape(String shapeType) { // bu class shape uzerinden herhangi birsey yapmayacak null olara birakiyorum
        return null;
    }
}
