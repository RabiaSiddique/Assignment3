package ie.cs3318.assignment3;


import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColourTable {
    private final int noOfColoursInPalette;

    public ColourTable(int noOfColoursInPalette){
        this.noOfColoursInPalette = noOfColoursInPalette;
    }

    // Code from: https://www.geeksforgeeks.org/java-program-to-find-whether-a-no-is-power-of-two/
    static boolean isPowerOfTwo(int num)
    {
        /* First num in the below expression is
        for the case when num is 0 */
        return num != 0 && ((num & (num - 1)) == 0);
    }

    public HashSet createTable ()
    {
    if (correctSize()) {
        return new HashSet<String>();
    } else {
        return null;
    }
    }


    public void addColour(HashSet table, String newColour){
        if (table.size() < 1025 && isValidHexCode(newColour)) {
            table.add(newColour);
        }

        else if (!isValidHexCode(newColour)) {
            System.out.println("The colour code is invalid");
        }

    }

    public void getColours(HashSet table) {
        for (String s : (Iterable<String>) table) {
            System.out.println(s);
        }
    }

    public boolean correctSize() {
        return isPowerOfTwo(noOfColoursInPalette) && noOfColoursInPalette < 1025 && noOfColoursInPalette > 1;
    }

    // Code from: https://www.geeksforgeeks.org/how-to-validate-hexadecimal-color-code-using-regular-expression/
    public boolean isValidHexCode(String newColour) {
        // Regex to check valid hexadecimal color code.
        String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (newColour == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(newColour);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    public int getSize(HashSet colourArray) {
        return colourArray.size();
    }
}

