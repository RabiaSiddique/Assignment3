package ie.cs3318.assignment3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTableTest {
    //    @Test
    @ParameterizedTest
    @ValueSource(ints = {1024, 2, 32})
    public void createTable(int value) {
        ColourTable colourTable = new ColourTable(value);

        colourTable.correctSize();

        HashSet colourArray = colourTable.createTable();

        System.out.println("Is Valid HexCode" + "- " + colourTable.isValidHexCode("#9253cb"));

        colourTable.addColour(colourArray, "#9253cb");

        colourTable.addColour(colourArray, "#5343cb");

        colourTable.getColours(colourArray);

        System.out.println("Size" + "- " + colourTable.getSize(colourArray));
    }

    @ParameterizedTest
    @ValueSource(ints = {4})
    public void inValidHexCode(int value) {
        ColourTable colourTable = new ColourTable(value);

        colourTable.correctSize();

        HashSet colourArray = colourTable.createTable();

        System.out.println("Is Valid HexCode" + "- " + colourTable.isValidHexCode("#zzzzzz"));

        colourTable.addColour(colourArray, "#zzzzzz");

        colourTable.getColours(colourArray);
        System.out.println("Size" + "- " + colourTable.getSize(colourArray));

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 1754, 1})
    public void tableNotFollowingSizeGuidelinesSoNullPointer(int value)
    {
        assertThrows(NullPointerException.class, () ->
        {
            ColourTable colourTable = new ColourTable(value);

            HashSet colourArray = colourTable.createTable();
            colourTable.addColour(colourArray, "#9253cb");

        });
    }
}





