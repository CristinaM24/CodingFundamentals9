public class Main {
    public static void main(String[] args) {
        String[] materie = {"Matematica", "Romana", "Fizica"};
        int[][] note = {{10, 10, 5}, {10, 10, 10}, {10, 10, 9}};
        MedieStudent s1 = new MedieStudent("gigel", materie, note);
        System.out.println(s1);

        int[][] notesS2 = {{10, 10, 5}, {4, 4, 5}, {10, 10, 9, 8}};
        MedieStudent s2=new MedieStudent("Ionel",materie,notesS2);
        System.out.println(s2);
        s2.mediaAnuala();

    }
}