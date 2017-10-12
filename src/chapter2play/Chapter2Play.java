/*
Daniel Plotzke
This program is for testing, learning, notetaking, and general experimentation.
 */
package chapter2play;

/**
 *
 * @author Daniel
 */
import java.util.Scanner; // Part of: Input and Output
import javax.swing.JOptionPane; // Part of : (Special Topic: Dialog Boxes)
public class Chapter2Play 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {   
    int cansPerPack = 6;
    double cansPerPack2 = 6;
    System.out.println(cansPerPack);
    int cansPerCrate = 4 * cansPerPack;
    System.out.println(cansPerCrate);

    /* D
    Double type is used for floating-point variables. (ex. 0.5), rather than whole 
    numbers used in integers (ex. 1.0). 
    */
    
    double alpha = 0.5;
    System.out.println(alpha);
    double beta = 1;
    System.out.println(beta);
    /* 
    Only use double type if it is a must (uses additional computing 
    power and memory).
    */
    
    int thousand = 100000;
    System.out.println(thousand);
    
    // Don't use commas or spaces between thousand numbers.
    // Use only decimal notation when dealing with fractions.
    
    int _5 = 5;
    
    
    // Assignment
    
    cansPerPack = 8;
    System.out.println(cansPerPack);
    int total = 0;
    int bottles = 6;
    int bottleVolume = 2;
    System.out.println(total);
    total = total + bottleVolume;
    System.out.println(total);
    
    
    // Constants
    final int _FINAL = 3;
    
    // Final types cannot be changed once they are assigned a value. 
    // It is common practice to name constants with all caps.
    // Other type lowercase start, and classes with uppercase start. 
    // Good practice to assign numbers to types to add clarity. 
    
    final int _finalexp = 1; //Showing the good of adding comments.
    
    /**
 * Use this specific comment setup to list the purpose of the program. 
 * In this case:
 * This program is for testing, learning, note-taking, 
 * and general experimentation.
 */
    // Overflow: When the computation is outside of the int range. 
    // int range is around two billion
    // Solution: use double or big number type. 
    // Watch out for roundoff errors!
    
    byte _byte = 3;
    System.out.println("Original value of byte: " + _byte);
    float flo = 3.5f;
    System.out.println(flo);
    
    // types of types: int, byte, short, long, double, float, char. 
    
    double fiftyMillion = 50000000;
    
    
    // Arithmetic Operators
    _byte++;
    System.out.println("New value of incremented byte value: " +_byte);
    _byte--;
    _byte--;
    System.out.println(_byte);
    _byte = 3;
    
    // use floating-point numbers for division to get remainders.
    // otherise, remainder is dropped for only whole number. 
    
    byte intdivide = 3;
    float flodivide = 3.5f;
    float totald = intdivide / flodivide;
    System.out.println(totald);
    //byte intdivideII = 4;
    //byte totaldII = 0;
    //totaldtwo = intdivide / intdividetwo; this works, but rounds answer to 1.
    //System.out.println(totaldII);
    
    // use % in place of / if only the remainder is wanted. 
    
    float _bytedivideI = 7f;
    float _bytedivideII = 4f;
    float totaldIII = _bytedivideI / _bytedivideII;
    System.out.println(totaldIII);
    float totaldIV = _bytedivideI % _bytedivideII;
    System.out.println(totaldIV);
    
    // Piggy bank example
    
    int pennies = 1729;
    int dollars = (pennies / 100); // Converting pennies to dollars. (17 dollats)
    System.out.println(dollars);
    int change = pennies % 100;
    System.out.println(change); // Change in cents. (29 cents)
    
    // Note: Short type only works if I convert right side of equasion to short.
    // This is because java converts short variable to int by default for equasions.
    /*
    ex. short pennies = 1729;
    short dollars = (short) (pennies / 100);
    */
    
    
    // Powers and Roots
    // No symbols for powers and roots; must use methods.
    
    double root4 = Math.sqrt(4);
    System.out.println("square root of 4: " + root4);
    
    // Same thing here with float not working
    // Have to convert right side to float as well for it to work.
    // ex. float root4 = (float) Math.sqrt(4);
    
    // Covert floating point numbers to integers
    
    double convertd = 1.5;
    int convertedd = (int) convertd;
    convertedd = (int) (convertd * 2);
    System.out.println(convertedd);
    long rounded = Math.round(convertd);
    System.out.println(rounded); //rounds a floating-point number (1.5)
    
    // floating point conversion keeps original value intact. (1.5)
    // can use int here, but requires long-->int conversion on the right.
    
    int roundedII = (int) Math.round(convertd); 
    System.out.println(roundedII);
    
    // storing rounded variable in int type insread of long.
    // int and float are both 32 bit operations, and are preffered.
    // long and double are 64 bit operations, and will be preffered in the future.
    
    
    // Unintended Integer Division
    int score1 = 10;
    int score2 = 4;
    int score3 = 9;
    double average = (score1 + score2 + score3) / 3d;
//    double average = (score1 + score2 + score3) / 3.0;
//    double average = ((double)score1 + score2 + score3) / 3;

    // DO NOT do this!
//    double average = (double)(score1 + score2 + score3 / 3);
    System.out.println("average is: " + average);
    
    
    // Input and Output
    /*
    
    // Reads user int input, and then outputs to console. 
    
    System.out.print("Please enter number to be square rooted: ");
    Scanner in = new Scanner(System.in);
    int squarert = in.nextInt();
    */
    
//    Same, but with other variables.
    
//    Scanner in2 = new Scanner(System.in);
//    float threedot5 = in2.nextFloat(); 
//    double threedot6 = in2.nextDouble();
//    long three = in2.nextLong();
    
    
    //Formatted Output
    // Rounds float "price" to within 2 decimal places. 
    
    float price = 1.21596f;
    System.out.printf("Float Rounded: " + "%.2f", price);
    
    // Prints variable "five" with 5 spaces beforehand. 
    
    int five = 5;
    System.out.printf("int with space: " + "%5d", five);
    
//     Prints multiple values with single call (Note: lots of space)
    
    System.out.printf("Five: %d Price: %10.2f", five, price);
    
    // Prints new line for each new word.
    
    System.out.printf("%nHello%nWorld%n");
    
    // Printing float on it's own
    
    float ex = 3.5f;
    System.out.printf("Lone Float: " + "%f", ex);
    
    //Strings
    // Creates string harry with assigned value Harry. 
    
    String name = "Harry";
    
    // Empty string 
    
    String empty = "";
    
    // Assigns string length to int value and prints it
    // (with 1 space for clarity)
    
    int harrylength = name.length();
    System.out.printf("%n"); 
    System.out.println(harrylength);
    
    // Combining Strings (& print)
    
    String hello = "Hello ";
    String there = "There! ";
    String helloThere = hello + there;
    System.out.println(helloThere);
    
    // Mixture string combination(& print)
    
    String comboString = helloThere + "General Kenobi!";
    System.out.println(comboString);
    
    // Assigning literal text length to int (& print)
    
    int helloThereint = "Hello, There!".length();
    System.out.println(helloThereint);
    
    // Note to self: assigned value counts spaces.
    // Also, can add number value in addition to
    // word length.
    
    
    // Escape Sequences
    // Including quotation mark and backslash in strings
    
    String quotation = "He said, \"Hello\"";
    String backslash = "C:\\Temp\\Secert.txt";
    
    // How to print newline without wasting space
    // (Fuck yeah)
    
    System.out.println("*\n**\n***\n");
    
    // Strings and Characters
    // 'h' = character, value of type char.
    // "h" = string containing single character, 
    // a value of type string. 
    // char = a single character
    // string = sequence of characters (possibly just one)
    // string is an object, char is 2 bytes in unicode. 
    // Personal note: Don't use char in languages above C.
    
    
    // Special Topic: Dialog Boxes
    // Shows dialogue box
    
    String input = JOptionPane.showInputDialog( "Enter Price: ");
    
    // Use below code when needing to imput numbers instead of strings.
    
    double priceprint = Double.parseDouble(input);
    
    // Prints imputted number from user to dialogue box  
    
    JOptionPane.showMessageDialog(null, "Price: " + priceprint);
            
    
    
    
    
    }

}