package IA.ProbIA5;

import java.util.Arrays;

import static java.lang.Math.abs;

/**
 * Created by bejar on 17/01/17.
 */
public class ProbIA5Board {
    /* Class independent from AIMA classes
       - It has to implement the state of the problem and its operators
     *

    /* State data structure
        vector with the parity of the coins (we can assume 0 = heads, 1 = tails
     */

    private int [] board;
    private static int [] solution;

    /* Constructor */
    public ProbIA5Board(int []init, int[] goal) {

        board = new int[init.length];
        solution = new int[init.length];

        for (int i = 0; i< init.length; i++) {
            board[i] = init[i];
            solution[i] = goal[i];
        }

    }

    /* vvvvv TO COMPLETE vvvvv */
    public void flip_it(int i){
        board[i] = abs(board[i] - 1);
        board[(i + 1)%5] = abs(board[(i + 1)%5] - 1);
    }

    /* Heuristic function */
    public double heuristic(){

        double distance = 0.0;
        for (int i = 0; i < board.length; ++i) distance += board[i] != solution[i] ? 1 : 0;

        return distance;
    }

     /* Goal test */
     public boolean is_goal(){
         return Arrays.equals(board, solution);
     }

     /* auxiliary functions */

     // Some functions will be needed for creating a copy of the state

    public ProbIA5Board copy() {
        return new ProbIA5Board(board, solution);
    }


    /* ^^^^^ TO COMPLETE ^^^^^ */

}
