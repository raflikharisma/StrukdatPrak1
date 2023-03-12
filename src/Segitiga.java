import java.util.Scanner;


public class Segitiga<T extends  Number, A extends Number> {

    private  final T tinggi;
    private final A alas;

    public Segitiga(T tinggi, A alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }
public int getResultAsInt(){
        return (int) (tinggi.intValue() * alas.intValue() * 0.5);
}

public double getResultAsDouble(){
        return tinggi.doubleValue() * alas.doubleValue() * 0.5;
}

    public static void main(String[] args) {

        int pilih;
        int userNumber;
        double userDouble;
        Scanner userInput = new Scanner(System.in);
        System.out.println("===HITUNG LUAS SEGITIGA===");
        System.out.println("Mau menampilkan hasil luas dalam bentuk? :");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        pilih = userInput.nextInt();
        if (pilih == 1) {
            System.out.println("Masukkan Nilai Alas dan Tinggi secara berurutan ");
            userNumber = userInput.nextInt();
            Segitiga<Integer, Integer> toInteger = new Segitiga<>(userNumber, userNumber);
            System.out.println("Luas Segitiga = " + toInteger.getResultAsInt());
        }else if(pilih == 2){
            System.out.println("Masukkan Nilai Alas dan Tinggi secara berurutan ");
            userDouble = userInput.nextDouble();
            Segitiga<Double, Double> toDouble = new Segitiga<>(userDouble, userDouble);
            System.out.println("Luas Segitiga = " + toDouble.getResultAsDouble());
        }


    }


}
