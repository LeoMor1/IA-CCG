package projet.ccg;

import java.io.IOException;

import projet.ccg.model.Instance;
import projet.ccg.model.InstanceParser;
import projet.ccg.model.Solution;
import projet.ccg.solver.ChocoSolver;
import projet.ccg.solver.Solver;

public class Main {
    public static void main(String[] args) throws IOException{
        Instance inst = InstanceParser.parseFile("ft06.txt");
        Solver choco = new ChocoSolver();
        Solution s1 = choco.solve(inst, 0);
    }
}
