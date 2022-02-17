import acm.graphics.GCompound;
import acm.graphics.GRect;
public class Hanger extends GCompound {
    public Hanger(double width,double height){
        add(new GRect(width,2),0,height-2);
        add(new GRect(2,height),width/4,0);
        add(new GRect(width/2,2),width/4,0);
        add(new GRect(2,height/8),width*3/4,0);
    }
}
