package sectionone.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    static String firstLineOfFile1(String path) throws IOException {

        BufferedReader bfd = new BufferedReader(new FileReader(path));
        try {
            return bfd.readLine();
        } finally  {
            bfd.close();
        }
    }

    static String firstLineOfFile2(String path) throws IOException {

        try (BufferedReader bfd = new BufferedReader(new FileReader(path))) {
            return bfd.readLine();
        }
    }
}
