import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner  = new Scanner(new File("src/rosalind_gc.txt"));
        FASTA saida = new FASTA();
        FASTA buffer =  new FASTA();

        String[] spliter;
        String entrada;

        while(scanner.hasNext()){
            entrada = scanner.nextLine();
            if (entrada.charAt(0) == '>' || entrada.charAt(0) == '\n'){
                if (!buffer.getSequence().isBlank()){
                    buffer.calcPercent();
                    if (buffer.getGcContent() > saida.getGcContent()){
                        copy(buffer,saida);
                    }
                }

                spliter = entrada.split(">");
                buffer.setId(spliter[1]);
                buffer.setSequence("");
                buffer.setGcContent(0);
            }else{
                buffer.appendSequence(entrada);
            }
        }
        if (!buffer.getSequence().isBlank()){
            buffer.calcPercent();
            if (buffer.getGcContent() > saida.getGcContent()){
                copy(buffer,saida);
            }
        }
        System.out.println(saida);
    }

    public static void copy(FASTA entrada, FASTA saida){
        saida.setId(entrada.getId());
        saida.setSequence(entrada.getSequence());
        saida.setGcContent(entrada.getGcContent());
    }
}
