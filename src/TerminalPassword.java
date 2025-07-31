// Oppgåve 5.1

import java.util.Scanner;

public class TerminalPassword {

    public static void main(String[] args) {

        String validPassword = "LeseHest123";
        String reEnterPassword = "Please reenter the password";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write in the password.");

        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(validPassword)) {
            System.out.println("Correct password!");
        } else {
            System.out.println("Wrong password. Please re-enter the password.");
            inputPassword = scanner.nextLine();
            if (inputPassword.equals(validPassword)) {
                System.out.println("Correct password!");
            } else {
                System.out.println("Wrong password. Access denied!");
            }
        }
    }
}
        /*
        - Metoden
            - Lage klasse terminalpassword
         -Passord
            - Lage variabel or passordet som brukar må skrive inn
        - Scanner
            - Scanner for å lese input frå bruker
        - Spørre bruker om passord
            - Tekst til konsoll
            - lese det brukaren skrive
            - lagre det i variabel
        - Samanlikne passordene
            - If else for å sjekke om passordet stemmer
         */


/*
Lag en ny klasse som heter TerminalPassword
o Denne klassen skal kun ha static main-metode som gjør følgende:
▪ Lagrer korrekt passord i en String variabel
▪ Oppretter en ny Scanner ved bruk av System.in
▪ Bruker Scanner-instansen for å spørre om et passord fra brukeren
▪ Sammenlign passordet brukeren skriver inn med det korrekte
passorder, og print ut til terminalen om passordet skrevet inn var
riktig eller ikke

 if (inputPassword.equals(validPassword)){
            System.out.println("Correct password!");
        } else {
                System.out.println("Wrong password. Please re-enter the password.");
                inputPassword = scanner.nextLine();
                if(inputPassword.equals(validPassword)){
                    System.out.println("Correct password!");}

        } else {
            System.out.println("Wrong password. Access denied!");}

        }
 */
