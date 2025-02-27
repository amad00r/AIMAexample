package IA.ProbIA5;

import aima.search.framework.SuccessorFunction;
import aima.search.framework.Successor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bejar on 17/01/17
 */
public class ProbIA5SuccesorFunction implements SuccessorFunction {
    public List<Successor> getSuccessors(Object state) {
        ArrayList<Successor> retval = new ArrayList<>();
        ProbIA5Board board = (ProbIA5Board) state;

        for (int i = 0; i < board.getSize() - 1; i++) {
            ProbIA5Board newBoard = board.copy();
            newBoard.flip_it(i);
            retval.add(new Successor("flip " + i + " " + (i + 1)%board.getSize(), newBoard));
        }
        return retval;
    }
}
