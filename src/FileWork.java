import java.util.Scanner;
import java.io.File;

public class FileWork {

        public static void main(String[] args) throws Exception
        {
            File file =
                    new File("/home/cyberstar/IdeaProjects/Intresting/src/Text/t.txt");
            Scanner sc = new Scanner(file);

            String temp = "";
            String [] subStr;
            String delimeter = "\\W"; // Разделитель

            while (sc.hasNextLine()){

                temp = sc.nextLine();
                subStr = temp.split(delimeter);

                for(int i = 0; i < subStr.length; i++) {
                        int count = subStr[i].toLowerCase().replaceAll("a|e|i|o|y|u", "").length();
                            if (count < subStr[i].length()-count) {
                                System.out.println(subStr[i]);}
                }
            }
        }

        }

