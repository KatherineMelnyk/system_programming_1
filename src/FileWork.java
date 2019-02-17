import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class FileWork {

    public static void main(String[] args) throws Exception {
        File file =
                new File("/home/cyberstar/IdeaProjects/Intresting/src/Text/t.txt");
        try {
            Scanner sc = new Scanner(file);

            String temp = "";
            String[] subStr;
            String delimeter = "\\W"; // Разделитель
            Dictionary words = new Hashtable();

            while (sc.hasNextLine()) {

                temp = sc.nextLine();
                subStr = temp.split(delimeter);

                for (int i = 0; i < subStr.length; i++) {
                    int count = subStr[i].toLowerCase().replaceAll("a|e|i|o|y|u", "").length();
                    if (count < subStr[i].length() - count) {
                        words.put(subStr[i], true);
                    }
                }
            }
            for (Enumeration k = words.keys(); k.hasMoreElements(); ) {
                System.out.println(k.nextElement());
            }
        } catch (FileNotFoundException e) {
            System.out.format("Could not find file '%s'.%n", file);
            System.exit(1);
        }
    }
}

