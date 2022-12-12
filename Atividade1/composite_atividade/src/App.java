import classes.Line;
import classes.Picture;
import classes.Rectangle;
import classes.Text;
import classesAbstratas.Graphic;

public class App {
    public static void main(String[] args) throws Exception {
    
        Graphic g = new Picture();

        //primeiro bloco
        Picture p = new Picture();
        Line l = new Line();
        Rectangle r = new Rectangle();
        Text t = new Text();
        p.add(l);
        p.add(r);
        p.add(t);

        //segundo bloco
        Line l1 = new Line();
        Rectangle r1 = new Rectangle();
        g.add(p);
        g.add(l1);
        g.add(r1);
        
        g.draw();
    }
}
