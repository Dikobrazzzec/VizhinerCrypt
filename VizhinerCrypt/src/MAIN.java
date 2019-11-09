import  java.util.Scanner;

public class MAIN {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,;:!? abcdefghijklmnopqrstuvwxyzЯЧСМИТЬБЮЭЪХЖДЗЩЛОШГРПНЕАВКУЫФЦЙйцукенгшщзхъэждлорпавыфячсмитьбю'@#№$%^&*()_-+=0123456789|/[]{}<>`~";
    int ValueOfModeOfProgram;
    Scanner scanner = new Scanner(System.in);
    String VariatModeProgram1 = "coding";
    String VariatModeProgram2 = "decoding";
    String ModeOfKey, key;
    boolean Controller = false;
    boolean ControlEnterKey= false;

    public static void main(String[] args) {
        MAIN Aktivator = new MAIN();
        Aktivator.ModeSwitcher();
    }

    public void ModeSwitcher() {
        while (Controller == false) {
            System.out.println("Enter mode of programm: coding or decoding");
            String ModeOfProgram = scanner.nextLine();
            if (ModeOfProgram.length() == VariatModeProgram1.length()) {
                if (ModeOfProgram.contains("coding") == true) {
                    Controller = true;
                    ValueOfModeOfProgram = 0;
                }
            }
            if (ModeOfProgram.length() == VariatModeProgram2.length()) {
                if (ModeOfProgram.contains("decoding") == true) {
                    Controller = true;
                    ValueOfModeOfProgram = 1;
                }
            }
            if (Controller == false) {
                System.out.println("Invalid value! Enter correct value");
            }
        }

            MAIN Starter = new MAIN();
            if (ValueOfModeOfProgram == 0) {
                Starter.Coding();
            }
            if (ValueOfModeOfProgram == 1) {
                Starter.Decoding();
            }
        }

    public String EnterKey() {
        while (ControlEnterKey == false) {
            System.out.println("Use standart or custome key?");
            ModeOfKey = scanner.nextLine();
            if (ModeOfKey.length() == 8) {
                if (ModeOfKey.contains("standart") == true) {
                    key = "StandartPrimitiveKey";
                    ControlEnterKey = true;
                }
            }
            if (ModeOfKey.length() == 7) {
                if (ModeOfKey.contains("custome") == true) {
                    System.out.println("You will enter your custom key");
                    System.out.println("Enter key for coding.");
                    key = scanner.nextLine();
                    ControlEnterKey = true;
                }
            }
            if (ControlEnterKey == false) {
                System.out.println("Invalid value! Please, enter correct value.");
            }
        }
        return key;
    }

    public void Coding() {
        VizhinerCoding AktivatorCoding = new VizhinerCoding();
        AktivatorCoding.Vvod();
        AktivatorCoding.MakeKey();
        AktivatorCoding.Coding();
        AktivatorCoding.print();
        AktivatorCoding.Endorno();
    }

    public void Decoding() {
        VizhinerDecoding AktivatorDecoding = new VizhinerDecoding();
        AktivatorDecoding.Vvod();
        AktivatorDecoding.MakeKey();
        AktivatorDecoding.Decoding();
        AktivatorDecoding.print();
        AktivatorDecoding.Endorno();
    }
}