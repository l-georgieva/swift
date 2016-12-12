package task2_ListRelativeFileStructure;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by ASUS on 12.12.2016 г..
 */
public class Task2_ListRelativeFileStructure {
    public static void main(String[] args) {
        DirectoryStream<Path> stream = null;

        try (DirectoryStream<Path> ds =
                     Files.newDirectoryStream(FileSystems.getDefault().getPath("C:\\Users\\ASUS\\Desktop\\Swift"))) {
            int count = 0;
            for (Path p : ds) {

                System.out.println(p.getFileName());
                //System.out.println(p1.toAbsolutePath().getRoot());
                //ystem.out.println(p1.getFileName());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



