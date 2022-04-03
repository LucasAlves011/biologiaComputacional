import java.util.HashSet;
import java.util.List;

public class Aminoacido {
    String name;
    char abbreviation;
    HashSet<String> codons = new HashSet<>();

    public Aminoacido(String name, char abbreviation, List<String> codons) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.codons.addAll(codons);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(char abbreviation) {
        this.abbreviation = abbreviation;
    }

    public HashSet<String> getCodons() {
        return codons;
    }

    public void setCodons(HashSet<String> codons) {
        this.codons = codons;
    }

    @Override
    public String toString() {
        return "Aminoacido{" +
                "name='" + name + '\'' +
                ", abbreviation=" + abbreviation +
                ", codons=" + codons +
                '}';
    }
}
