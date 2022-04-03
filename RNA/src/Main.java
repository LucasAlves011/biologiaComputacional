import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("src/rosalind_rna.txt");
        Scanner scanner = new Scanner(x);
        String entrada = scanner.nextLine();
        System.out.println(entrada.replaceAll("T","U"));
    }
}
