import org.junit.Test;

import static org.junit.Assert.*;

public class SquareDrawer2Test {

    @Test
    public void testAddEdgeLength() {
        SquareDrawer2 squareDrawer2 = new SquareDrawer2();
        squareDrawer2.addEdgeLength(5);
        squareDrawer2.addEdgeLength(10);
        assertEquals("Test Add edge length function is working", 2,
                squareDrawer2.targetList.size());
    }

    @Test
    public void testDrawSingleSquares() {
        SquareDrawer2 squareDrawer2 = new SquareDrawer2();
        squareDrawer2.addEdgeLength(5);
        String square = squareDrawer2.drawSquares();
        StringBuilder expectedSquareOutput = new StringBuilder();
        expectedSquareOutput.append("#####");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   #");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   #");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   #");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#####");

        assertEquals("Test Add edge length function is working", expectedSquareOutput.toString(),
                square);

    }

    @Test
    public void testDrawMultipleSquares() {
        SquareDrawer2 squareDrawer2 = new SquareDrawer2();
        squareDrawer2.addEdgeLength(5);
        squareDrawer2.addEdgeLength(7);
        String square = squareDrawer2.drawSquares();
        StringBuilder expectedSquareOutput = new StringBuilder();
        expectedSquareOutput.append("#######"); // row 0
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   # #"); // row 1
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   # #"); // row 2
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   # #"); // row 3
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("##### #"); // row 4
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#     #"); // row 5
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#######"); // row 6

        assertEquals("Test Add edge length function is working", expectedSquareOutput.toString(),
                square);

    }

    @Test
    public void testSingleUnitSquares() {
        SquareDrawer2 squareDrawer2 = new SquareDrawer2();
        squareDrawer2.addEdgeLength(1);
        String square = squareDrawer2.drawSquares();
        assertEquals("Test Add edge length function is working", "#",
                square);

    }

    @Test
    public void testMultipleSquaresWithUnitSquare() {
        SquareDrawer2 squareDrawer2 = new SquareDrawer2();
        squareDrawer2.addEdgeLength(1);
        squareDrawer2.addEdgeLength(5);

        StringBuilder expectedSquareOutput = new StringBuilder();
        expectedSquareOutput.append("#####");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   #");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   #");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#   #");
        expectedSquareOutput.append("\n");
        expectedSquareOutput.append("#####");

        String square = squareDrawer2.drawSquares();
        assertEquals("Test Add edge length function is working", expectedSquareOutput.toString(),
                square);

    }


}