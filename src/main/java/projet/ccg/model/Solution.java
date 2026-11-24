package projet.ccg.model;

public class Solution {
    private String solver;
    private long solveTimeMs;
    private int[][] start;

    public Solution(String solver, int start[][], long solveTimeMs) {
        this.solver = solver;
        this.start = start;
        this.solveTimeMs = solveTimeMs;
    }

    public String getSolver() {return this.solver;}
    public long getSolveTimeMs() {return  this.solveTimeMs;}
    public int[][] getStart() {return this.start;}
}
