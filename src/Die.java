// A class is the formal implementation, or blueprint, of the attributes
// and behaviors of an object. 

public class Die {
    private int sides;
    private int upSide; 

    // A class contains constructors that are invoked to create objects. They have 
    // the same name as the class.

    // A signature consists of the constructor name and the formal parameter list.
    
    // Parameters allow values to be passed to the constructor to establish the initial
    // state of the object.
    public Die(int s){// <-- constructor Die and parameter s
        sides = s;
    }
    // Constructors are said to be overloaded when thare are multiple constructors
    // with the same name but a different signature. 
    public Die(){
        sides = 6;
    }

    public void roll(){
        upSide = (int) (Math.random() * 6) + 1;
    }

    public int getUpside(){
        return upSide;
    }
}
