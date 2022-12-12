package classes;

import java.util.List;

import classesAbstratas.Graphic;

public class Text extends Graphic{

    @Override
    public void add(Graphic g) {
    }

    @Override
    public void remove(Graphic g) {    
    }

    @Override
    public List<Graphic> getChilds() {
        return null;
    }

    @Override
    public void draw() {
        System.out.println("Text");
        
    }
    
}
