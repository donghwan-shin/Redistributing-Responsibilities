package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        // print the dot plot of two string arrays

        // draw the dot plot as a 2-dimensional array
        char[][] dotPlot = new char[sequence1.length][sequence2.length];
        for (int i = 0; i < sequence1.length; i++) {
            for (int j = 0; j < sequence2.length; j++) {
                if (sequence1[i] == sequence2[j]) {
                    dotPlot[i][j] = '+';
                } else {
                    dotPlot[i][j] = ' ';
                }
            }
        }

        // print the dot plot including headers
        for (int i = -1; i < sequence1.length; i++) {
            if (i == -1) {
                for (int j=0; j < sequence2.length; j++) {
                    System.out.print("\t" + sequence2[j]);
                }
            } else {
                for (int j = -1; j < sequence2.length; j++) {
                    if (j == -1) {
                        System.out.print(sequence1[i] + "\t");
                    } else {
                        System.out.print(dotPlot[i][j] + "\t");
                    }
                }
            }
            System.out.println();
        }
    }

}