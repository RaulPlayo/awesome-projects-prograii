package core;

import java.util.ArrayList;

public class Thread {
    public static void main(String[] args) {

        World world = new World(mazesData);
    }

    private static int[] NPCsPerMap = { 1 };
    private static String[][][] mazesData = {
            {
                    { "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL",
                            "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL",
                            "WALL", "WALL", "WALL", "WALL", "WALL" },
                    { "WALL", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS",
                            "WALL", "WATER", "WATER", "WATER", "TROUBLEDWATER", "WALL", "TROUBLEDWATER",
                            "TROUBLEDWATER", "TROUBLEDWATER", "WATER", "WALL", "SAND", "GRASS", "MEDIUMGRASS", "TREE",
                            "MEDIUMGRASS", "TREE", "MEDIUMGRASS", "MEDIUMGRASS", "WALL" },
                    { "WALL", "SAND", "WALL", "TALLGRASS", "WALL", "WALL", "WALL", "WALL", "WALL", "TALLGRASS", "WATER",
                            "TROUBLEDWATER", "TROUBLEDWATER", "WALL", "TROUBLEDWATER", "TROUBLEDWATER", "TROUBLEDWATER",
                            "WATER", "WALL", "SAND", "SAND", "WALL", "WALL", "WALL", "MEDIUMGRASS", "GRASS",
                            "MEDIUMGRASS", "WALL" },
                    { "WALL", "SAND", "WALL", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS",
                            "MEDIUMGRASS", "WATER", "WALL", "WALL", "WALL", "WALL", "TROUBLEDWATER", "TROUBLEDWATER",
                            "TROUBLEDWATER", "WATER", "WALL", "WALL", "WALL", "WALL", "SAND", "SAND", "SAND", "SAND",
                            "GRASS", "WALL" },
                    { "WALL", "SAND", "WALL", "WALL", "WALL", "WALL", "WALL", "WATER", "WATER", "WATER", "WATER",
                            "TROUBLEDWATER", "TROUBLEDWATER", "WALL", "WALL", "TROUBLEDWATER", "TROUBLEDWATER", "WATER",
                            "WALL", "SAND", "SAND", "WALL", "SAND", "WATER", "WATER", "WATER", "WATER", "WALL" },
                    { "WALL", "SAND", "WALL", "GRASS", "MEDIUMGRASS", "WALL", "MEDIUMGRASS", "SAND", "SAND", "SAND",
                            "WATER", "WATER", "WATER", "WATER", "WALL", "WATER", "WATER", "WATER", "SAND", "SAND",
                            "SAND", "WALL", "WATER", "WALL", "WALL", "WALL", "WALL", "WALL" },
                    { "WALL", "SAND", "ROAD", "GRASS", "GRASS", "WALL", "ROAD", "ROAD", "SAND", "SAND", "SAND", "WALL",
                            "SAND", "WATER", "WALL", "WATER", "SAND", "SAND", "SAND", "SAND", "SAND", "WALL", "WATER",
                            "WATER", "WATER", "TROUBLEDWATER", "TROUBLEDWATER", "WALL" },
                    { "WALL", "ROAD", "ROAD", "ROAD", "ROAD", "WALL", "ROAD", "ROAD", "ROAD", "ROAD", "ROAD", "WALL",
                            "ROAD", "SAND", "WALL", "WALL", "WALL", "WALL", "SAND", "ROAD", "ROAD", "ROAD", "WATER",
                            "WATER", "WATER", "WATER", "TROUBLEDWATER", "WALL" },
                    { "WALL", "TALLGRASS", "ROAD", "ROAD", "ROAD", "WALL", "ROAD", "WALL", "GRASS", "GRASS", "TREE",
                            "WALL", "ROAD", "ROAD", "WALL", "ROAD", "ROAD", "ROAD", "ROAD", "TREE", "ROAD", "ROAD",
                            "ROAD", "ROAD", "WATER", "WATER", "TROUBLEDWATER", "WALL" },
                    { "WALL", "TALLGRASS", "ROAD", "GRASS", "GRASS", "WALL", "GRASS", "WALL", "GRASS", "TREE", "GRASS",
                            "WALL", "GRASS", "GRASS", "WALL", "GRASS", "TREE", "GRASS", "GRASS", "GRASS", "GRASS",
                            "GRASS", "ROAD", "SAND", "SAND", "WATER", "WATER", "WALL" },
                    { "WALL", "TALLGRASS", "WALL", "TREE", "GRASS", "GRASS", "GRASS", "WALL", "MEDIUMGRASS", "SAND",
                            "WALL", "WALL", "WALL", "GRASS", "GRASS", "GRASS", "GRASS", "WALL", "WALL", "WALL", "WALL",
                            "WALL", "ROAD", "WALL", "SAND", "WATER", "WATER", "WALL" },
                    { "WALL", "WALL", "WALL", "GRASS", "GRASS", "TREE", "GRASS", "WALL", "SAND", "TREE", "SAND", "SAND",
                            "WALL", "SAND", "SAND", "SAND", "SAND", "WALL", "MEDIUMGRASS", "WALL", "MEDIUMGRASS",
                            "GRASS", "ROAD", "WALL", "SAND", "WATER", "WATER", "WALL" },
                    { "WALL", "TALLGRASS", "WALL", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS",
                            "MEDIUMGRASS", "MEDIUMGRASS", "WALL", "SAND", "SAND", "WALL", "SAND", "WALL", "SAND",
                            "WALL", "WALL", "MEDIUMGRASS", "WALL", "GRASS", "GRASS", "ROAD", "WALL", "SAND", "SAND",
                            "WATER", "WALL" },
                    { "WALL", "TALLGRASS", "ROAD", "MEDIUMGRASS", "MEDIUMGRASS", "TREE", "MEDIUMGRASS", "TREE",
                            "MEDIUMGRASS", "WALL", "SAND", "SAND", "SAND", "SAND", "WALL", "SAND", "SAND", "WALL",
                            "MEDIUMGRASS", "WALL", "MEDIUMGRASS", "GRASS", "ROAD", "WALL", "SAND", "SAND", "SAND",
                            "WALL" },
                    { "WALL", "TALLGRASS", "WALL", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS",
                            "MEDIUMGRASS", "MEDIUMGRASS", "WALL", "SAND", "WALL", "SAND", "WALL", "WALL", "WALL",
                            "SAND", "WALL", "MEDIUMGRASS", "TREE", "GRASS", "GRASS", "ROAD", "WALL", "WALL", "WALL",
                            "GRASS", "WALL" },
                    { "WALL", "WALL", "WALL", "TREE", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TREE", "WALL",
                            "TALLGRASS", "WALL", "WALL", "SAND", "SAND", "WALL", "WALL", "WALL", "WALL", "GRASS",
                            "GRASS", "WALL", "WALL", "WALL", "WALL", "GRASS", "WALL", "MEDIUMGRASS", "WALL" },
                    { "WALL", "TALLGRASS", "WALL", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS",
                            "WALL", "TALLGRASS", "TALLGRASS", "WALL", "SAND", "SAND", "SAND", "SAND", "SAND", "WALL",
                            "GRASS", "TREE", "GRASS", "GRASS", "ROAD", "WALL", "GRASS", "WALL", "MEDIUMGRASS", "WALL" },
                    { "WALL", "TALLGRASS", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "TREE", "TALLGRASS",
                            "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "GRASS", "GRASS", "MEDIUMGRASS",
                            "MEDIUMGRASS", "MEDIUMGRASS", "WALL", "MEDIUMGRASS", "WALL", "GRASS", "WALL" },
                    { "WALL", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS",
                            "TALLGRASS", "TALLGRASS", "TALLGRASS", "TALLGRASS", "MEDIUMGRASS", "MEDIUMGRASS",
                            "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS", "GRASS", "GRASS", "MEDIUMGRASS", "MEDIUMGRASS",
                            "MEDIUMGRASS", "MEDIUMGRASS", "WALL", "MEDIUMGRASS", "MEDIUMGRASS", "MEDIUMGRASS", "WALL" },
                    { "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL",
                            "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL", "WALL",
                            "WALL", "WALL", "WALL", "WALL", "WALL" }
            }
    };
}
