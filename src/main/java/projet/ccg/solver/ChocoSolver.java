package projet.ccg.solver;

import org.chocosolver.solver.variables.IntVar;

import projet.ccg.model.Instance;
import projet.ccg.model.Solution;

public class ChocoSolver implements Solver {

    @Override 
    public String name() {
        return "Choco";
    }

    @Override 
    public Solution solve(Instance instance, long timeoutMs) {
        int nJobs = instance.getNJobs();
        int nMachines = instance.getNMachines();
        int horizon = instance.horizon();

        IntVar[][] start = new IntVar[nJobs][nMachines];
        return new Solution(null, null, null);
    }
}
