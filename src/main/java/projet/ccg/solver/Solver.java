package projet.ccg.solver;

import projet.ccg.model.Instance;
import projet.ccg.model.Solution;

public interface Solver {
    String name();
    Solution solve(Instance instance, long timeoutMs);
}
