package ie.cs3318.assignment3;

public class ColourTable {
    private final Object noOfColoursInPalette;

    public ColourTable(int noOfColoursInPalette) {
        this.noOfColoursInPalette = noOfColoursInPalette;
    }

    public Object evaluate() {
        return noOfColoursInPalette;
    }
}
