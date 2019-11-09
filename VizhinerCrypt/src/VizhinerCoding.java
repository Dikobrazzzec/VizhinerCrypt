import java.util.Scanner;

public class VizhinerCoding {
    String textk, keyCod;
    int lt, lk, l;
    MAIN Z = new MAIN();
    int LengthOfalphabet = Z.alphabet.length();
    String TextCoding = "";
    Scanner scanner = new Scanner(System.in);

    public void Vvod() {
        System.out.println("Enter text for coding.");
        textk = scanner.nextLine();
    }

    public void MakeKey () {
        lt = textk.length();
        System.out.println("rabotaet2");
        keyCod = Z.EnterKey();
        System.out.println(keyCod);
        lk = keyCod.length();
        System.out.println("rabotaet");
        if (lt > lk) {                          //сделать нормальный алгоритм создания ключа
            while (lt>lk){                      //длина ключа каждый раз удавивается. возможно нерациональное использование ресурсов пк
                keyCod +=keyCod;                      //length = 4, 8, 16, 32...
                lk = keyCod.length();
            }
        }                                      //charAt - возвращает символ по указанному индексу
    }                                          //кодирование C=(M+K) mod26

    public void Coding() {
        for(int k = 0; k<lt; k++ ){
            char LetterCod = textk.charAt(k);
            int ValueLetterCod = Z.alphabet.indexOf(LetterCod);
            char LetterKey = keyCod.charAt(k);
            int ValueLetterKey = Z.alphabet.indexOf(LetterKey);
            int ValueLetterCoding = (ValueLetterCod + ValueLetterKey) % LengthOfalphabet;
            char LetterCoding = Z.alphabet.charAt(ValueLetterCoding);
            TextCoding = TextCoding + LetterCoding;
        }
    }

    public void print() {
        System.out.println("Coded Text:");
        System.out.println(TextCoding);
    }

    public void Endorno () {
        System.out.println("Do you want to continue working? Answer yes or no");
        boolean controller = false;
        while (!controller) {
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
        } else {
            System.out.println("You want to continiue work with programm");
            Z.ModeSwitcher();
        }
    }
}