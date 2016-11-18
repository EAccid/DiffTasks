package iostream;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

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

       ////////

        Charset cset = Charset.forName("ISO-8859-1");

        Set<String> aliases = cset.aliases();
        for (String alias : aliases)
            System.out.println(alias);

    }

}
