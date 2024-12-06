public class Tasksheet112 {
    //Using Primitives
    //Instruction: Create all of the primitives (except long and double) with different values. 
    //Concatenate them into a string and  print it to the screen so it will print: H3110 w0r1d 2.0 true

    public static void main(String[] args) {
        byte zero = 0;          // byte
        short h = 72;           // short
        int three = 3;          // int
        float twoPointZero = 2.0f; // float
        char one = '1';         // char
        boolean isTrue = true;  // boolean

        // To print "H3110 w0r1d 2.0 true"
        String output = "" + (char)h + three + one + one + zero + " w" + zero + "r" + one + "d " + twoPointZero + " " + isTrue;
        
        System.out.println(output);
    }
}