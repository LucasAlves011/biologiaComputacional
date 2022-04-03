import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Aminoacido alaninas = new Aminoacido("Alalina",'A', List.of("GCU","GCC","GCA","GCG"));
        Aminoacido argininas = new Aminoacido("Arginina",'R', List.of("CGU","CGC","CGA","CGG","AGA","AGG"));
        Aminoacido asparaginas = new Aminoacido("Asparagina",'N', List.of("AAU","AAC"));
        Aminoacido acidosAsparticos = new Aminoacido("Ácido Aspártico",'D', List.of("GAU","GAC"));
        Aminoacido acidosGlutamicos = new Aminoacido("Ácido Glutâmico",'E', List.of("GAA","GAG"));
        Aminoacido cisteinas = new Aminoacido("Cisteína",'C', List.of("UGU","UGC"));
        Aminoacido glicinas = new Aminoacido("Glicina",'G', List.of("GGU","GGC","GGA","GGG"));
        Aminoacido glutaminas = new Aminoacido("Glutamina",'Q', List.of("CAA","CAG"));
        Aminoacido histidinas = new Aminoacido("Histidina",'H', List.of("CAU","CAC"));
        Aminoacido isoleucinas = new Aminoacido("Isoleucina",'I', List.of("AUU","AUC","AUA"));
        Aminoacido leucinas = new Aminoacido("Leucina",'L', List.of("UUA","UUG","CUU","CUC","CUA","CUG"));
        Aminoacido lisinas = new Aminoacido("Lisina",'K', List.of("AAA","AAG"));
        Aminoacido metioninas = new Aminoacido("Metionina",'M', List.of("AUG")); // CODON DE INICIAÇÃO
        Aminoacido fenilalaninas = new Aminoacido("Fenilalanina",'F', List.of("UUU","UUC"));
        Aminoacido prolinas = new Aminoacido("Prolinas",'P', List.of("CCU","CCC","CCA","CCG"));
        Aminoacido serinas = new Aminoacido("Serina",'S', List.of("UCU","UCC","UCA","UCG","AGU","AGC"));
        Aminoacido tirosinas = new Aminoacido("Tirosina",'Y', List.of("UAU","UAC"));
        Aminoacido treoninas = new Aminoacido("Treonina",'T', List.of("ACU","ACC","ACA","ACG"));
        Aminoacido triptofanos = new Aminoacido("Triptofano",'W', List.of("UGG"));
        Aminoacido valinas = new Aminoacido("Valina",'V', List.of("GUU","GUC","GUA","GUG"));
        Aminoacido codonsParada = new Aminoacido("Codons de Parada",'\n', List.of("UAA","UAG","UGA")); //CONDOS DE PARADA

        ArrayList<Aminoacido> aminoacidos = new ArrayList<>(List.of(alaninas, argininas, asparaginas, acidosAsparticos, acidosGlutamicos, cisteinas,
                glicinas,glutaminas,histidinas,isoleucinas,leucinas,lisinas,metioninas,fenilalaninas,prolinas,serinas,tirosinas,
                treoninas,treoninas,triptofanos,valinas,codonsParada));

        StringBuilder output  = new StringBuilder();
        StringBuilder codonBuilder = new StringBuilder();

        Scanner scanner = new Scanner(new File("src/rosalind_prot.txt"));

        String dataBase = scanner.nextLine();

        for (int i = 0; i < dataBase.length(); i += 3) {
                codonBuilder.append(dataBase.charAt(i));
                codonBuilder.append(dataBase.charAt(i + 1));
                codonBuilder.append(dataBase.charAt(i + 2));
                output.append(aminoacidos.stream().filter(n -> n.getCodons().contains(String.valueOf(codonBuilder))).map(Aminoacido::getAbbreviation).toList().get(0));
                codonBuilder.delete(0,3);
        }
        System.out.println(output);
    }
}
