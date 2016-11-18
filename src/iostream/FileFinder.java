package iostream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileFinder {

    private List<String> filenames = new ArrayList<>();

    public List findFiles(String textFilter) {
        addFilteredFilenamesInternalStorage(textFilter);
        addFilteredFilenamesExternalStorage(textFilter);
        return filenames;
    }

    private void addFilteredFilenamesInternalStorage(String textFilter) {
//        addFilteredFilenames(Environment.getDataDirectory());
        addFilteredFilenames(new File("."), textFilter);
    }

    private void addFilteredFilenamesExternalStorage(String textFilter) {
//        addFilteredFilenames(Environment.getDataDirectory());
    }

    private void addFilteredFilenames(File dir, String textFilter) {
        for (File file : dir.listFiles())
            if (file.isDirectory())
                addFilteredFilenames(file, textFilter);
            else {
                Pattern pattern = Pattern.compile("(.*)" + textFilter.toLowerCase() + "(.*)");
                if (pattern.matcher(file.getName().toLowerCase()).matches())
                    filenames.add(file.getPath());
            }
    }

    public static void main(final String[] args) {

        List<String> bookFilteredList;
        FileFinder fileFinder = new FileFinder();
        bookFilteredList = fileFinder.findFiles("te");

        for (Object dirItem : bookFilteredList)
            System.out.println(dirItem);
    }

}

