package projet.ccg.model;

public class Instance {
    private final String name;
    private final int[][] machine;
    private final int[][] duration;
    private final int nJobs;
    private final int nMachines;

    public Instance(String name, int[][] machine, int[][] duration) {
        this.name = name;
        this.machine = machine; // pour le job j et la tache i du job on utilise la machine numero machine[j][i]
        this.duration = duration; // pour le job j et la tache i du job cela dure duration[j][i]
        this.nJobs = machine.length;
        this.nMachines = machine[0].length;
    }

    public String getName()      { return name; }
    public int getNJobs()        { return nJobs; }
    public int getNMachines()    { return nMachines; }
    public int getMachine(int j, int k)    { return machine[j][k]; }
    public int getDuration(int j, int k)   { return duration[j][k]; }

    /** Somme de toutes les durées, le max de temps possible*/
    public int horizon() {
        int h = 0;
        for (int j = 0; j < nJobs; j++)
            for (int k = 0; k < nMachines; k++)
                h += duration[j][k];
        return h;
    }
}
