// Java Program to illustrate Type Conversion

// Importing input output classes
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing variables to values
        // but to different data types
        long a = 3;
        byte b = 2;
        double c = 2.0;

        // Type Conversion
        // As long and byte data types are converted to
        // double return type
        double final_datatype = (a + b + c);

        // Printing the sum of all three initialized values
        System.out.print("converted:"+final_datatype+"\n");
        // Declaring an Integer datatype
        int d = 3;

        // Casting to Large datatype
        double db = (double)d;

        // Print and display the casted value
        System.out.println(db);

        // Narrow Casting conversion
        int db1 = (int)db;
        
        // Print an display narrow casted value
        System.out.println("casted:"+db1);
    }
}