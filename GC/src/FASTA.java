
public class FASTA {
    String id;
    String sequence;
    float gcContent;

    public FASTA() {
        this.sequence = "";
        this.gcContent =0;
    }

    public void calcPercent(){
        String format = sequence;

        int occurrences = 0;
        for (int i = 0; i < format.length(); i++) {
            switch (format.charAt(i)) {
                case 'C', 'G' -> occurrences++;
            }
        }
        this.gcContent = (float) occurrences/format.length();
        this.gcContent *= 100;
    }

    public void appendSequence(String append){
        this.setSequence(sequence + append);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public float getGcContent() {
        return gcContent;
    }

    public void setGcContent(float gcContent) {
        this.gcContent = gcContent;
    }

    @Override
    public String toString() {
        return id + "\n" + gcContent;
    }
}
