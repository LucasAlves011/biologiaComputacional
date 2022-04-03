import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/rosalind_revc.txt"));
        String dataBase;
        StringBuilder output = new StringBuilder();

        dataBase = scanner.nextLine();

        for (int i = 0; i < dataBase.length(); i++) {
            switch (dataBase.charAt(i)) {
                case 'A' -> output.append('T');
                case 'T' -> output.append('A');
                case 'G' -> output.append('C');
                case 'C' -> output.append('G');
            }
        }
        System.out.println(output);
    }

}
