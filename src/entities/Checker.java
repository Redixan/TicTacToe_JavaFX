package entities;

import java.util.HashMap;

public class Checker {

    private  HashMap<Integer, Integer> busyCells;


    private final int[][] variantsWins = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 5, 9},
            {3, 5, 7},
            {1, 4, 7},
            {2, 5, 7},
            {3, 6, 9}
    };


    public  void blockCell(int cell, int id) {
        busyCells.put(cell, id);
    }


    public Integer getBlockedCell(int cell) {
        return busyCells.get(cell);
    }


}
