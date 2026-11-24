package projet.ccg.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class InstanceParser {
    private InstanceParser() { }

    public static Instance parseFile(String path) throws IOException{
        InputStream input = InstanceParser.class.getClassLoader().getResourceAsStream(path);
        if (input == null) {
            throw new IOException("Instance introuvable dans les ressources : " + path);
        }
        String name = path.substring(path.lastIndexOf('/') + 1);

        return parse(new Scanner(input), name);
    }

    private static int readInt(Scanner sc, String subject) {
        if (!sc.hasNextInt()) {
            throw new InputMismatchException(
                "Attendu un entier (" 
                + subject 
                + "), trouvé : " 
                + (sc.hasNext() ? sc.next() : "fin de fichier")
            );
        }
        return sc.nextInt();
    }

    public static Instance parse(Scanner sc, String name) {
        int nJobs = readInt(sc, "nombre de jobs");
        int nMachines = readInt(sc, "nombre de machines");
        int[][]    
    }
}
