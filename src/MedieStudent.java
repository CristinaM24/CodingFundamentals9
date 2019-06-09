public class MedieStudent {
    private String nume;
    private String[] materie;
    private int[][] note;

    public MedieStudent(String nume, String[] materie, int[][] note) {
        this.nume = nume;
        this.materie = materie;
        this.note = note;
    }

    int[] calculeazaMediile() {
        int[] medii = new int[note.length];
        for (int i = 0; i < note.length; i++) {
            int sum = 0;
            for (int j = 0; j < note[i].length; j++) {
                sum+= note[i][j];
            }
            medii[i] = (int) Math.round((double)sum/ note[i].length);
        }

        return medii;
    }
    private  boolean esteCorijent() {
        int[] medii=calculeazaMediile();
        for (int i=0; i<medii.length;i++) {
            if(medii[i]<5)
                return true;
        }
        return false;
    }
    public void mediaAnuala() {
        if(esteCorijent())
            System.out.println("Elevul "+nume+" este corijent");
        else {
            int[] medii=calculeazaMediile();
            int sum=0;
            for(int medie:medii)
                sum+=medie;
            System.out.println("Media anuala"+(int) Math.round((double)sum/medii.length));

        }
    }

    public String toString() {
        String output ="Elevul "+nume + " are mediile :\n";
            int[] medii=calculeazaMediile();
        for (int i = 0; i < materie.length; i++) {
            output+="\t"+materie[i]+ " : " +medii[i]+"\n";
        }
        return output;
    }
}