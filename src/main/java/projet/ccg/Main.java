package projet.ccg;

import projet.ccg.model.Instance;
import projet.ccg.model.Solution;
import projet.ccg.solver.ChocoSolver;
import projet.ccg.solver.Solver;

public class Main {
    public static void main(String[] args) {
        Instance inst = 
        Solver choco = new ChocoSolver();
        Solution s1 = choco.solve(null, 0)
    }
}
