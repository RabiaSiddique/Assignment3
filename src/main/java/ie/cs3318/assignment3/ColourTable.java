package ie.cs3318.assignment3;


import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColourTable {
    private final int noOfColoursInPalette;

    public ColourTable(int noOfColoursInPalette){
        this.noOfColoursInPalette = noOfColoursInPalette;
    }

    /**
     * Checks if the given integer is a power of two.
     *
     * @param num The integer to be checked.
     * @return {@code true} if the given number is a power of two, {@code false} otherwise.
     */
    // Code from: https://www.geeksforgeeks.org/java-program-to-find-whether-a-no-is-power-of-two/
    static boolean isPowerOfTwo(int num)
    {
        /* First num in the below expression is
        for the case when num is 0 */
        return num != 0 && ((num & (num - 1)) == 0);
    }

    /**
     * Creates a HashSet<String> if the size condition is correct.
     *
     * @return A new HashSet<String> if the size condition is correct; otherwise, returns null.
     */
    public HashSet createTable ()
    {
    if (correctSize()) {
        return new HashSet<String>();
    } else {
        return null;
    }
    }

    /**
     * Adds a new color to the provided HashSet if the size condition is met and the color code is valid.
     * Prints an error message if the color code is invalid.
     *
     * @param table      The HashSet to which the new color is to be added.
     * @param newColour  The color code to be added.
     */
    public void addColour(HashSet table, String newColour){
        if (table.size() < 1025 && isValidHexCode(newColour)) {
            table.add(newColour);
        }

        else if (!isValidHexCode(newColour)) {
            System.out.println("The colour code is invalid");
        }

    }

    /**
     * Prints each color in the provided HashSet to the console.
     *
     * @param table The HashSet containing the colors to be printed.
     */
    public void getColours(HashSet table) {
        for (String s : (Iterable<String>) table) {
            System.out.println(s);
        }
    }

    /**
     * Checks if the number of colors in the palette is a valid size.
     *
     * @return {@code true} if the number of colors is a power of two, less than 1025, and greater than 1;
     *         {@code false} otherwise.
     */
    public boolean correctSize() {
        return isPowerOfTwo(noOfColoursInPalette) && noOfColoursInPalette < 1025 && noOfColoursInPalette > 1;
    }

    /**
     * Checks if the given string represents a valid hexadecimal color code.
     *
     * @param newColour The color code to be validated.
     * @return {@code true} if the color code is a valid hexadecimal representation (e.g., "#RRGGBB" or "#RGB");
     *         {@code false} otherwise.
     */
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

    /**
     * Returns the number of elements in the provided HashSet.
     *
     * @param colourArray The HashSet for which the size is to be determined.
     * @return The number of elements in the HashSet.
     */
    public int getSize(HashSet colourArray) {
        return colourArray.size();
    }
}

