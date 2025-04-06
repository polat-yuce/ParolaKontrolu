import java.util.Scanner;
public class ParolaKontrol {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan şifre girişi al
            System.out.print("Lütfen bir şifre girin: ");
            String sifre = scanner.nextLine();

            // Şifreyi kontrol et ve sonucu ekrana yazdır
            if (gucluParolaKontrol(sifre)) {
                System.out.println("Güçlü parola! ✅ ");
            } else {
                System.out.println("Parola zayıf! ❌");
            }
            // Scanner'ı kapat
            scanner.close();
        }
        // Güçlü parola kontrol işlevi
        public static boolean gucluParolaKontrol(String sifre) {
            // Parolanın uzunluğunu kontrol et
            if (sifre.length() < 8) {
                return false;
            }

            // Parolanın en az bir büyük harf, bir küçük harf, bir rakam ve bir özel karakter içerip içermediğini kontrol et
            boolean buyukHarfVar = false, kucukHarfVar = false, rakamVar = false, ozelKarakterVar = false;

            for (char karakter : sifre.toCharArray()) {
                if (Character.isUpperCase(karakter)) {
                    buyukHarfVar = true;
                } else if (Character.isLowerCase(karakter)) {
                    kucukHarfVar = true;
                } else if (Character.isDigit(karakter)) {
                    rakamVar = true;
                } else if ("!@#$%^&*()_+-= {}[];:' ,<.>/?".indexOf(karakter) != -1) {
                    ozelKarakterVar = true;
                }
            }
            // Tüm kriterleri kontrol et
            return buyukHarfVar && kucukHarfVar && rakamVar && ozelKarakterVar;
        }
    }
    //  TODO
    //      isDigit(): Bir karakterin ondalık (0-9) rakam olup olmadığını kontrol eden bir metodun adıdır.
    //                 Bu metot genellikle karakterlerin sayısal olup olmadığını kontrol etmek için kullanılır.
    //                 Java programlama dilinde Character sınıfının bir metodu olarak kullanılır.
    //      isLowerCase(): Bir karakterin küçük harf olup olmadığını kontrol eden bir metodun adıdır.
    //                     Bu metod, genellikle karakterin küçük harf olup olmadığını kontrol etmek için kullanılır.
    //                     Java programlama dilinde Character sınıfının bir metodu olarak kullanılır.
    //      isUpperCase(): Bir karakterin büyük harf olup olmadığını kontrol eden bir Java metodunun adıdır.
    //                     Bu metod, genellikle bir karakterin büyük harf olup olmadığını kontrol etmek için kullanılır.
    //                     Java programlama dilinde Character sınıfının bir metodu olarak kullanılır.
    //      toCharArray(): Bir metin dizesini karakter dizisine dönüştürmek için kullanılan bir metotdur.
    //                     Java programlama dilinde yaygın olarak kullanılır.
    //                     Bu metot, bir String nesnesindeki karakterleri bir diziye atar.
