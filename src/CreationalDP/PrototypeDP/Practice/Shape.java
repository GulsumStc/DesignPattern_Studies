package CreationalDP.PrototypeDP.Practice;

import java.time.Year;

public  abstract class Shape  implements Cloneable {


    private String id;

    protected String type;



    abstract void draw();

    //getter setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




    @Override
    protected Shape clone() {

        Shape clone = null;

        try {
            clone = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }



}
