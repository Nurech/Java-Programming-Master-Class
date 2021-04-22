package MiscExercises;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;


public class Moon {
    public static void main(String[] args) {
        //https://mooncascade.com/career

        // STEP 1
        // iterate to see
        int words = 0;
        char[] msg = {125, 66, 69, 10, 67, 89, 10, 94, 66, 79, 10, 75, 95, 94, 66, 69, 88, 10, 69, 76, 10, 8, 126, 66, 79, 10, 98, 67, 94, 73, 66, 66, 67, 65, 79, 88, 13, 89, 10, 109, 95, 67, 78, 79, 10, 94, 69, 10, 94, 66, 79, 10, 109, 75, 70, 75, 82, 83, 8, 21, 10, 122, 70, 79, 75, 89, 79, 10, 89, 79, 68, 78, 10, 83, 69, 95, 88, 10, 75, 68, 89, 93, 79, 88, 10, 94, 69, 10, 64, 69, 72, 89, 106, 71, 69, 69, 68, 73, 75, 89, 73, 75, 78, 79, 4, 73, 69, 71, 6, 10, 93, 67, 94, 66, 10, 83, 69, 95, 88, 10, 105, 124, 10, 69, 88, 10, 102, 67, 68, 65, 79, 78, 99, 68, 10, 127, 120, 102, 4};
        for (char c : msg) {
            System.out.print(c + " ");
        }

//        } B E
//        C Y
//        ^ B O
//        K _ ^ B E X
//        E L
//        ~ B O
//        Y
//        m _ C N O
//        ^ E
//        ^ B O
//        m K F K R S 
//        z F O K Y O
//        Y O D N
//        S E _ X
//        K D Y ] O X
//        ^ E
//        @ E H Y j G E E D I K Y I K N O  I E G 
//        ] C ^ B
//        S E _ X
//        i |
//        E X
//        f C D A O N c D
//         x f 

        // STEP 2
        // replace symbols with unique letters from alphabet, that wasn't used in original message
        String replacedSentance = new String(msg);
        StringBuilder s = new StringBuilder(replacedSentance.length());
        CharacterIterator it = new StringCharacterIterator(replacedSentance);
        for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
            switch (ch) {
                // message uses more unique characters than english alphabet has, indicating message has symbols in it
                case '}' -> s.append("P");
                case '^' -> s.append("Q");
                case '_' -> s.append("T");
                case '\b' -> s.append("\"");
                case '~' -> s.append("V");
                case ']' -> s.append("W");
                case '\u0015' -> s.append("X");
                case '\u0006' -> s.append("Y");
                case '\u0004' -> s.append(".");
                case '@' -> s.append("J");
                case 'j' -> s.append("@");
                case '|' -> s.append("U");
                case '\u007F' -> s.append("Z");
                default -> s.append(ch);
            }
        }

       s.toString();

//        PBE
//        CY
//        QBO
//        KTQBEX
//        EL
//        "VBO
//        bCQIBBCAOX
//        Y
//        mTCNO
//        QE
//        QBO
//        mKFKRS"X
//        zFOKYO
//        YODN
//        SETX
//        KDYWOX
//        QE
//        JEHY@GEEDIKYIKNO.IEGY
//        WCQB
//        SETX
//        iU
//        EX
//        fCDAONcD
//        Zxf.

        // STEP 3 SUBSTITUTION
        // use substitution https://www.guballa.de/substitution-solver
        // TODO further substitution in switch case could yield better results

        //XHO
        //IS
        //THE
        //AUTHOR
        //OF
        //"PHE
        //hITCHHIVER
        //S
        //qUIDE
        //TO
        //THE
        //qALAZY"R
        //gLEASE
        //SEND
        //YOUR
        //ANSWER
        //TO
        //JOBS@MOONCASCADE.COMS
        //WITH
        //YOUR
        //cK
        //OR
        //lINVEDiN
        //Grl.

        //WHO IS THE AUTHOR OF "THE HITCHHIKER'S GUIDE TO THE GALAXY" PLEASE SEND YOUR ANSWER TO JOBS@MOONCASCADE.COM WITH YOUR CV OR LINKEDIN URL.
        //DOUGLAS ADAMS
    }
}
