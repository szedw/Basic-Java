public class StudyCase {
    public static void main(String[] args) {
        int hasil = 1;

        for (int i = 0; i < args.length; i++) {
            int x = Integer.parseInt(args[i]);
            hasil *= x;
        }

        if (hasil % 2 == 0) {
            System.out.println(hasil + " - Genap");
        } else {
            System.out.println(hasil + " - Ganjil");
        }
    }
}
