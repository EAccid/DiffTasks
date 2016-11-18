package iostream;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.util.List;

public class MainIOStream {

    public static void main(String[] args) throws Exception {
        List<String> bookFilteredList;
        FileFinder fileFinder = new FileFinder();
        bookFilteredList = fileFinder.findFiles("hp1");

        if (bookFilteredList == null) return;

        String filePath = bookFilteredList.get(0);
        System.out.println(filePath);


        FileInputStream fis = new FileInputStream(filePath);
        int bytesAvailable = fis.available();
        fis.close();
        System.out.println(bytesAvailable);

        String s = "abcde";
        char[] c = s.toCharArray();

        BufferedReader br= new BufferedReader(new CharArrayReader(c));
        System.out.println(br.lines());
        br.close();

        System.out.println(System.getProperty("user.dir"));

    }

}
