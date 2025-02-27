public class Main {
    public static void main(String[] args) {
//        int[][] grid = {
//                {12, 3, 4, 13, 5},
//                {11, 21, 2, 14, 16},
//                {7, 8, 9, 15, 0},
//                {10, 17, 20, 19, 1},
//                {18, 22, 30, 25, 6}
//        };

        int[][] grid = {
                {12, 30, 40, 25, 5},
                {11, 3, 22, 15, 43},
                {7, 2, 9, 4, 0},
                {8, 33, 18, 6, 1},
        };



        GridPath gp = new GridPath();
        Location loc = gp.getNextLoc(2, 4);
        System.out.println(
            loc.getRow() + " " + loc.getCol() + "\n" +
            grid[loc.getRow()][loc.getCol()]
        );

        System.out.println();
        System.out.println(gp.sumPath(3, 0));

    }
}