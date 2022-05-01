import java.util.*;

public class SquareDrawer2 {
    List<Integer> targetList ;

    public SquareDrawer2() {
        targetList = new ArrayList<>();
    };

    public void addEdgeLength(int edgeLength) {
        targetList.add(edgeLength);
    }

    public String drawSquares() {
        //Algorithm
        // 1. Sort the target list inputted by user
        // 2. Find max size in the list to determine the outer square 's length
        // 3 Loop the row by the max length of square in the target list
        // 4. For the first row, we can add # with the maximum length
        // 5. For the other row, we need to know different size of square
        // 5.1 for each size of square, if it is not reached their length, we can only fill the right edge
        // 5.2 otherwise, we need to fill the bottom edge of the square
        // Sorry for coding style, it can be beautified and broken down smaller pieces and easier for you to read
        // Thanks for giving me opportunies to have this coding test.
        Collections.sort(targetList);
        //Arrays.sort(targetList); // run time : nlogn
        int maxSizeOfSquare = targetList.get(targetList.size()-1);
        StringBuilder result = new StringBuilder();
        String startString = "#".repeat(maxSizeOfSquare); // run times n

        int rowIdx = 0;
        int targetIdx = 0;
        while (rowIdx < maxSizeOfSquare) { // run times n
            if (rowIdx == 0 || rowIdx == maxSizeOfSquare-1) {
                result.append(startString);
            } else if (rowIdx != 0) {
                int minSize = targetList.get(targetIdx);
                if (minSize-1 == 0) {
                    // unit square
                    targetIdx ++;
                    minSize = targetList.get(targetIdx);
                }

                StringBuilder rowResult = new StringBuilder(" ".repeat(maxSizeOfSquare));
                rowResult.setCharAt(0, '#');

                if (rowIdx < minSize-1) {
                    for (int j=targetIdx; j < targetList.size(); j++) {
                        rowResult.setCharAt(targetList.get(j)-1, '#');
                    }
                } else if (rowIdx == minSize - 1) {
                    for (int k=1; k < minSize; k++) {
                        rowResult.setCharAt(k, '#');
                    }
                    targetIdx = targetIdx + 1; // Move to next target
                    for (int j=targetIdx; j < targetList.size(); j++) {
                        rowResult.setCharAt(targetList.get(j)-1, '#');
                    }
                }
                result.append(rowResult);
            }

            if (rowIdx != maxSizeOfSquare-1) {
                result.append("\n");
            }
            //By the end of the loop , we must add 1 rowIdx
            rowIdx++;
        }
        return result.toString();
    }


    public static void main(String[] args) {
        // Input the array
        SquareDrawer2 squareDrawer = new SquareDrawer2();
        squareDrawer.addEdgeLength(5);
        squareDrawer.addEdgeLength(1);
        System.out.print(squareDrawer.drawSquares());


    }
}
