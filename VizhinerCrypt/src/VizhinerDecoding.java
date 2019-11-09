import java.util.Scanner;
                                    //раскодирование m=(c+n-k) mod n; c - закодированный символ ; n - кол-во букв в алфавите ; k - буква ключа. charAt возвращает символ по указанному значению; indexOf возвращает порядковый номер заданного символа
public class VizhinerDecoding {
    String textd, keyDecoding;
    String TextDecode = "";
    Scanner scanner = new Scanner(System.in);
    MAIN Z = new MAIN();
    int lt, lk, k, l;

    public void Vvod() {
        System.out.println("Enter text for decoding");
        textd = scanner.nextLine();
    }

    public void MakeKey() {
        lt = textd.length();
        keyDecoding = Z.EnterKey();
        lk = keyDecoding.length();
        if (lk < lt) {
            keyDecoding+=keyDecoding;
            lk = keyDecoding.length();
        }
    }

    public void Decoding() {
        int LengthOfalphabet = Z.alphabet.length();
        for (k = 0; k < lt; k++) {
           char LetterDecoding = textd.charAt(k);
           int ValueLetterDecoding = Z.alphabet.indexOf(LetterDecoding);
           char LetterkeyDecoding = keyDecoding.charAt(k);
           int ValueLetterkeyDecoding = Z.alphabet.indexOf(LetterkeyDecoding);
           int ValueLetterDecode = (ValueLetterDecoding + LengthOfalphabet - ValueLetterkeyDecoding) % LengthOfalphabet;
           char LetterDecode = Z.alphabet.charAt(ValueLetterDecode);
           TextDecode += LetterDecode;
        }
    }

    public void print () {
        System.out.println("Decode text:");
        System.out.println(TextDecode);
    }

    public void Endorno () {
        System.out.println("Do you want to continue working? Answer yes or no");
        boolean controller = false;
        while (controller == false) {
            String EndController = scanner.nextLine();
            if (EndController.length() == 2) {
                if (EndController.contains("no") == true) {
                    l = 0;
                    controller = true;
                }
            }
            if (EndController.length() == 3) {
                if (EndController.contains("yes") == true) {
                    l = 1;
                    controller = true;
                }
            }
        }
        if (l==0) {
            System.out.println("Goodbuy.");
        } else  {
            System.out.println("You want to continiue work with programm");
            Z.ModeSwitcher();
        }
    }
}