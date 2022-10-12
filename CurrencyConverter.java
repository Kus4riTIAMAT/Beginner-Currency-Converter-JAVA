import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {
    static void konversiuang() {
        double amount, code, rupiah, dollar, euro, yen, ringgit;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner duit = new Scanner(System.in);

        System.out.println("Mau convert mata uang apa nih?");

        System.out.println("Pilih antara opsi 1 - 5 ya");

        System.out.println("1:Dollar\t2:Euro\t3:Yen\t4:Rupiah\t5:Ringgit ");
        code = duit.nextInt();

        if (code == 1 || code == 2 || code == 3 || code == 4 || code == 5) { // (code == 1) && (code == 2) && (code ==
                                                                             // 3) && (code == 4) && (code == 5) {
            System.out.println("Berapa banyak duit yang mau di convert???");
            amount = duit.nextFloat();
            if (code == 1) {
                // untuk DOLLAR
                euro = amount * 0.87;
                System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

                yen = amount * 111.087;
                System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");

                rupiah = amount * 14.9101;
                System.out.println("Your " + amount + " Dollar is : " + f.format(rupiah) + " Rupiah");

                ringgit = amount * 4.17;
                System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");

            } else if (code == 2) {
                // untuk EURO
                dollar = amount * 1.14;
                System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");

                yen = amount * 127.32;
                System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");

                rupiah = amount * 14.808;
                System.out.println("Your " + amount + " euro is : " + f.format(rupiah) + " Rupiah");

                ringgit = amount * 4.78;
                System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");

            } else if (code == 3) {
                // untuk YEN
                dollar = amount * 0.008;
                System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");

                euro = amount * 0.007;
                System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");

                rupiah = amount * 115;
                System.out.println("Your " + amount + " yen is : " + f.format(rupiah) + " rupiah");

                ringgit = amount * 0.037;
                System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
            } else if (code == 4) {
                // untuk RUPIAH
                dollar = amount * 0.0000669;
                System.out.println("Your " + amount + " rupiah is : " + f.format(dollar) + " Dollar");

                euro = amount * 0.000068;
                System.out.println("Your " + amount + " rupiah is : " + f.format(euro) + " Euro");

                ringgit = amount * 0.00030;
                System.out.println("Your " + amount + " rupiah is : " + f.format(ringgit) + " ringgit");

                yen = amount * 0.0097;
                System.out.println("Your " + amount + " rupiah is : " + f.format(yen) + " yen");
            } else if (code == 5) {
                // For Ringgit Conversion
                dollar = amount * 0.239;
                System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");

                euro = amount * 0.209;
                System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");

                yen = amount * 26.63;
                System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");

                rupiah = amount * 3.32194;
                System.out.println("Your " + amount + " ringgit is : " + f.format(rupiah) + " rupiah");
            } else {
                System.out.println("afa");
            }
        } else {
            String hasil;
            Scanner input = new Scanner(System.in);
            System.out.println("mau coba lagi? (apabila mau ketikkan iya) ");
            System.out.println("iya/tidak");
            hasil = input.next();
            while (hasil == "iya") {
                konversiuang();
            }
        }
        loop();

    }

    static void loop() {
        String y;
        Scanner another = new Scanner(System.in);
        System.out.println("Do another money convertion?");
        y = another.next();
        if (y.equalsIgnoreCase("y") || y.equalsIgnoreCase("yes")) {
            konversiuang();
        } else {
            System.out.println("Oke Terimakasih telah mencoba");
        }

    }

    public static void main(String[] args) {
        String program;
        Scanner input = new Scanner(System.in);
        System.out.println("hi, selamat datang di program baru aku, mau jalanin programnya?");
        System.out.println("Program Writed by Dymi!");
        System.out.println(" ");
        System.out.println("                   # ########    #       "); // 1
        System.out.println("  #######          #        #   ######## "); // 2
        System.out.println("     #            #        #   #    #    "); // 3
        System.out.println("     #           #       ##   #    #     "); // 4
        System.out.println("     #         ##      ## #       #      "); // 5
        System.out.println("     #       ##       ##   #     #       "); // 6
        System.out.println("########## ##        #      #   #        "); // 7
        System.out.println(" ");
        System.out.println("ketik iya/y untuk menjalankan program!");
        program = input.next();
        if (program.equalsIgnoreCase("y") || program.equalsIgnoreCase("yes")) {
            konversiuang();
        } else {
            System.out.println("  oke lain kali coba ya! by : Dymi Kavindra!");
            System.out.println(" ");
            System.out.println("                   # ########    #       "); // 1
            System.out.println("  #######          #        #   ######## "); // 2
            System.out.println("     #            #        #   #    #    "); // 3
            System.out.println("     #           #       ##   #    #     "); // 4
            System.out.println("     #         ##      ## #       #      "); // 5
            System.out.println("     #       ##       ##   #     #       "); // 6
            System.out.println("########## ##        #      #   #        "); // 7
            System.out.println(" ");
        }
    }

}