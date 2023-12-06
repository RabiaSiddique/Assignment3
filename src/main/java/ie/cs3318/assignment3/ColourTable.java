package ie.cs3318.assignment3;


public class ColourTable {
    private final int noOfColoursInPalette;

    public ColourTable(int noOfColoursInPalette) {
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

    public void addColour(String newColour) {
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

