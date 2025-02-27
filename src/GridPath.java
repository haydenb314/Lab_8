public class GridPath {
    /**
     * Initialized in the constructor with distinct values that never change
     */
    private int[][] grid = {
            {12, 30, 40, 25, 5},
            {11, 3, 22, 15, 43},
            {7, 2, 9, 4, 0},
            {8, 33, 18, 6, 1},
    };

    /**
     * Returns the Location representing a neighbor of the grid element at row and col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public Location getNextLoc(int row, int col) {

        //checks if we are on the right edge
        if ((row + 1) > (grid.length - 1)) {
            return new Location(row, col + 1);
        }

        //checks if we are on the bottom edge
        if (col + 1 > (grid[0].length - 1)) {
            return new Location(row + 1, col);
        }


        int downNeighbor = grid[row + 1][col];
        int rightNeighbor = grid[row][col + 1];

        if (rightNeighbor < downNeighbor) {
            return new Location(row, col + 1);
        } else if (downNeighbor < rightNeighbor){
            return new Location(row + 1, col);
        }

        return new Location(0, 0);

    }

    /**
     * Computes and returns the sum of all values on a path through grid, as described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public int sumPath(int row, int col)  {
        int total = grid[row][col];
        int amountOfRuns = ((grid.length - 1) - row) + ((grid[0].length - 1) - col);

        Location currentLoc;
        int currentRow = row;
        int currentCol = col;

        for (int i = 0; i < amountOfRuns; i++) {
            currentLoc = getNextLoc(currentRow, currentCol);
            total += grid[currentLoc.getRow()][currentLoc.getCol()];

            currentRow = currentLoc.getRow();
            currentCol = currentLoc.getCol();
        }
        return total;
    }
}