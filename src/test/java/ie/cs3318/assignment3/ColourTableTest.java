package ie.cs3318.assignment3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColourTableTest {
//    @Test
    @ParameterizedTest
    @ValueSource(ints = {1024, 2, 1, 1025, 87})
    public void createTable(int value){
        ColourTable colourTable = new ColourTable(value);

        assertEquals(value, colourTable.evaluate());

        colourTable.correctSize(value);

        HashSet colourArray = colourTable.createTable();

        colourTable.addColour(colourArray, "FFFFFF");

        colourTable.addColour(colourArray, "FFFFF1");

        colourTable.getColours(colourArray);
//        assertEquals(1024, "[FFFFFF]", colourTable.evaluate());
    };


//    @ParameterizedTest
//    @ValueSource( strings = {"a"})
//    public void checkingException(int value) throws ParameterResolutionException, ArgumentConversionException, NumberFormatException {
//        ColourTable colourTable = new ColourTable(value);
//        assertEquals(value, colourTable.evaluate());
////        assertEquals(1024, "[FFFFFF]", colourTable.evaluate());
//    }

//    public void addColour(){
//        colourTable.addColour("${colour}");
//        colourTable.set("colour", "FFFFFF");
//    }



}
