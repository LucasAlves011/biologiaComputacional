import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/rosalind_subs.txt"));
        String dna = scanner.nextLine();
        String subs = scanner.nextLine();

        int tamanhoSubs = subs.length();
        StringBuilder positions = new StringBuilder();

        for (int i = 0; i + tamanhoSubs < dna.length(); i++) {
           if (dna.substring(i,i+tamanhoSubs).equals(subs))
               positions.append(" ").append(i + 1);
        }
        System.out.println(String.valueOf(positions).trim());
    }
}
