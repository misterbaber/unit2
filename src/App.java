public class App {
    public static void main(String[] args) throws Exception {
        
        // An object is a specific instance of a class with defined
        // attributes.
        Die d6; 

        // Objects are created using the keyword new, followed by a call 
        // to the constructor (Die())

        // The actual parameters passed to a constructor must be compatible
        // with the types identified in the formal parameter list.
        d6 = new Die(6);

        // The memory associated with an initialized referene type variable 
        // (like d6) holds an object reference value representing the address 
        // of the variable in memory. 
        System.out.println(d6);

        // The keyword null is used to indicate that a reference (d6) is not
        // yet associated with any object.
        Die d20 = null;
        System.out.println(d20);
    }
}
