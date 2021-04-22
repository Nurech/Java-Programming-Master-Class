package MiscExercises;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class MooncascadeSecretMessageCopy {

    //TODO part 1 find common letters that matches english words
    public static void main(String[] args) throws IOException {

        // assign words to lists of words by their length
        // use only correct sized letter to decipher
        ArrayList<String> listOfLines1 = new ArrayList<>();
        ArrayList<String> listOfLines2 = new ArrayList<>();
        ArrayList<String> listOfLines3 = new ArrayList<>();
        ArrayList<String> listOfLines4 = new ArrayList<>();
        ArrayList<String> listOfLines5 = new ArrayList<>();
        ArrayList<String> listOfLines6 = new ArrayList<>();
        ArrayList<String> listOfLinesElse = new ArrayList<>();
        //58k english words
        //http://www.mieliestronk.com/corncob_lowercase.txt
        BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\Udemy\\JavaMasterclass\\src\\MiscExercises\\words2.txt"));
        String line = bufReader.readLine();
        while ((line != null)) {
            // add only if less than 7 in size
            if (line.length() == 1) {
                listOfLines1.add(line);
                line = bufReader.readLine();
            } else if (line.length() == 2) {
                listOfLines2.add(line);
                line = bufReader.readLine();
            } else if (line.length() == 3) {
                listOfLines3.add(line);
                line = bufReader.readLine();
            } else if (line.length() == 4) {
                listOfLines4.add(line);
                line = bufReader.readLine();
            } else if (line.length() == 5) {
                listOfLines5.add(line);
                line = bufReader.readLine();
            } else if (line.length() == 6) {
                listOfLines6.add(line);
                line = bufReader.readLine();
            } else {
                listOfLinesElse.add(line);
                line = bufReader.readLine();
            }
        }
        bufReader.close();

//        //https://mooncascade.com/career
//        char[] msg = {125, 66, 69, 10, 67, 89, 10, 94, 66, 79, 10, 75, 95, 94, 66, 69, 88, 10, 69, 76, 10, 8, 126, 66, 79, 10, 98, 67, 94, 73, 66, 66, 67, 65, 79, 88, 13, 89, 10, 109, 95, 67, 78, 79, 10, 94, 69, 10, 94, 66, 79, 10, 109, 75, 70, 75, 82, 83, 8, 21, 10, 122, 70, 79, 75, 89, 79, 10, 89, 79, 68, 78, 10, 83, 69, 95, 88, 10, 75, 68, 89, 93, 79, 88, 10, 94, 69, 10, 64, 69, 72, 89, 106, 71, 69, 69, 68, 73, 75, 89, 73, 75, 78, 79, 4, 73, 69, 71, 6, 10, 93, 67, 94, 66, 10, 83, 69, 95, 88, 10, 105, 124, 10, 69, 88, 10, 102, 67, 68, 65, 79, 78, 99, 68, 10, 127, 120, 102, 4};
//        for (char c : msg) {
//            System.out.print(c + " ");

        boolean answer = false;
        while (!answer) {
            // a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
            char[] options = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            // random letter to decipher
            // replace letter with 0 in alphabet to exclude letter duplication when deciphering
            Random r = new Random();
            int random125 = r.nextInt(25);
            char randomChar125 = options[random125];
            options[random125] = '0';

            int random66 = r.nextInt(25);
            char randomChar66 = options[random66];
            options[random66] = '0';

            int random69 = r.nextInt(25);
            char randomChar69 = options[random69];
            options[random69] = '0';

            int random67 = r.nextInt(25);
            char randomChar67 = options[random67];
            options[random67] = '0';

            int random89 = r.nextInt(25);
            char randomChar89 = options[random89];
            options[random89] = '0';

            int random94 = r.nextInt(25);
            char randomChar94 = options[random94];
            options[random94] = '0';

            int random79 = r.nextInt(25);
            char randomChar79 = options[random79];
            options[random79] = '0';

            int random75 = r.nextInt(25);
            char randomChar75 = options[random75];
            options[random75] = '0';

            int random95 = r.nextInt(25);
            char randomChar95 = options[random95];
            options[random95] = '0';

            int random88 = r.nextInt(25);
            char randomChar88 = options[random88];
            options[random88] = '0';

            int random76 = r.nextInt(25);
            char randomChar76 = options[random76];
            options[random76] = '0';

            char[] word1 = {randomChar125, randomChar66, randomChar69};
            char[] word2 = {randomChar67, randomChar89};
            char[] word3 = {randomChar94, randomChar66, randomChar79};
            char[] word4 = {randomChar75, randomChar95, randomChar94, randomChar66, randomChar69, randomChar88};
            char[] word5 = {randomChar69, randomChar76};

            String str1 = String.valueOf(word1);
            String str2 = String.valueOf(word2);
            String str3 = String.valueOf(word3);
            String str4 = String.valueOf(word4);
            String str5 = String.valueOf(word5);

            // if has word has 0 (duplicate letter from random) then don't solve
            if (!((str1.contains("0")) || (str2.contains("0")) || (str3.contains("0")) || (str4.contains("0")) || (str5.contains("0")))) {
                // if str1, str2, str3, str4, str5 is english word
                // and letter replacement matches on all words then print
                for (String line1 : listOfLines3) {
                    if (str1.equals(line1)) {
                        for (String line2 : listOfLines2) {
                            if (str2.equals(line2)) {
                                for (String line3 : listOfLines3) {
                                    if (str3.equals(line3)) {
                                        for (String line4 : listOfLines6) {
                                            if (str4.equals(line4)) {
                                                for (String line5 : listOfLines2) {
                                                    if (str5.equals(line5)) {
                                                        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    //TODO use substitution over all letters

/*      } B E
        C Y
        ^ B O
        K _ ^ B E X
        E L
        ~ B O
        Y
        m _ C N O
        ^ E
        ^ B O
        m K F K R S 
        z F O K Y O
        Y O D N
        S E _ X
        K D Y ] O X
        ^ E
        @ E H Y j G E E D I K Y I K N O  I E G 
        ] C ^ B
        S E _ X
        i |
        E X
        f C D A O N c D
         x f */

}
