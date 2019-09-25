import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.println("DAMANHURI");
        System.out.println("171011450174\n\n");

        System.out.print("Nilai Absen : ");
        double absen = inp.nextDouble();

        System.out.print("Nilai Tugas : ");
        double tugas = inp.nextDouble();

        System.out.print("Nilai UTS : ");
        double uts = inp.nextDouble();

        System.out.print("Nilai UAS : ");
        double uas = inp.nextDouble();

        double nilai = (absen * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40);

        System.out.println("NILAI NYA : " + nilai);
    }
}