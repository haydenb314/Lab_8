public class Main {
    public static void main(String[] args) {
         int[][] grid = {
                {12, 3, 40, 25, 5},
                {11, 3, 22, 15, 43},
                {7, 2, 9, 4, 0},
                {8, 33, 18, 6, 1}
        };




        GridPath gp = new GridPath();
        Location loc = gp.getNextLoc(4, 3);
        System.out.println(
            loc.getRow() + " " + loc.getCol() + "\n" +
            grid[loc.getRow()][loc.getCol()]
        );

    }
}