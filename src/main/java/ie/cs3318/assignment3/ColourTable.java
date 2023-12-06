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



    public Object evaluate() {
//        return null;
        //        String message = null;

        if (isPowerOfTwo(noOfColoursInPalette) && noOfColoursInPalette < 1025 && noOfColoursInPalette > 1) {
//                message = String.format("ColourTable can contain %s many values", noOfColoursInPalette);
                return noOfColoursInPalette;
            }
            else{
                return "Number is not within the valid range.";
            }


//        catch (Exception e) {
////            message = String.format("ColourTable can not contain %s many values", noOfColoursInPalette);
//            return e.getMessage();
//        }

//        return "Number is not valid";
    }

    static boolean isPowerOfTwo(int num)
    {
        /* First num in the below expression is
        for the case when num is 0 */
        return num != 0 && ((num & (num - 1)) == 0);
    }


        public HashSet createTable () {

        if (correctSize() == true) {
            HashSet<String> colourArray = new HashSet<>();
            return colourArray;
        } else {
            return null;
        }

    }


    public void addColour(HashSet table, String newColour){
        if (table.size() < 1025 && isValidHexCode(newColour) == true)
        table.add(newColour);

        else if (isValidHexCode(newColour) == false) {
            System.out.println("The colour code is invalid");
        }

    }

    public void getColours(HashSet table) {
        Iterator<String> itr = table.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public boolean correctSize() {
        if (isPowerOfTwo(noOfColoursInPalette) && noOfColoursInPalette < 1025 && noOfColoursInPalette > 1) {
//                message = String.format("ColourTable can contain %s many values", noOfColoursInPalette);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isValidHexCode(String newColour) {
//        if (newColour.charAt(0) != '#')
//            return false;
//
//        if (!(newColour.length() == 4 || newColour.length() == 7))
//            return false;
//
//        for (int i = 1; i < newColour.length(); i++)
//            if (!((newColour.charAt(i) >= '0' && newColour.charAt(i) <= 9)
//                    || (newColour.charAt(i) >= 'a' && newColour.charAt(i) <= 'f')
//                    || (newColour.charAt(i) >= 'A' || newColour.charAt(i) <= 'F')))
//                return false;
//
//        return true;

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

//    private int noOfColoursInPalette;
//
//    public ColourTable(int noOfColoursInPalette) {
//        if (isPowerOfTwo(noOfColoursInPalette) && noOfColoursInPalette < 1025 && noOfColoursInPalette > 1) {
//            this.noOfColoursInPalette = noOfColoursInPalette;
//            String [] colourTableArray = new String[noOfColoursInPalette];
//            colourTableArray.addColour
//
//        } else {
//            System.out.println("The table size has to be to the power of 2, greater than 1 and less then 1025.");
//        }
//
//    }
//
//
//
////    static boolean isPowerOfTwo(int num)
////    {
////        /* First num in the below expression is
////        for the case when num is 0 */
////        return num != 0 && ((num & (num - 1)) == 0);
////    }
//
//    public Object evaluate() {
////        String message = null;
//
//            if (isPowerOfTwo(noOfColoursInPalette) && noOfColoursInPalette < 1025 && noOfColoursInPalette > 1) {
////                message = String.format("ColourTable can contain %s many values", noOfColoursInPalette);
//                return noOfColoursInPalette;
//            }
//            else{
//                return "Number is not within the valid range.";
//            }
//
//
////        catch (Exception e) {
//////            message = String.format("ColourTable can not contain %s many values", noOfColoursInPalette);
////            return e.getMessage();
////        }
//
////        return "Number is not valid";
//
//    }
//
//    static boolean isPowerOfTwo(int num) {
//        /* First num in the below expression is
//        for the case when num is 0 */
//        return num != 0 && ((num & (num - 1)) == 0);
//    }
//
//    public void addColour(ColourTable colourtable, String newColour) {
//         colourtable[colourtable.length] = newColour;
//
//
//    }



    }

