package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("folder/file.zip");
        Path filesToZip = Paths.get("folder/subfolder1/subsubfolder1");
        zip(fileZip, filesToZip);
    }

    private static void zip(Path fileZip, Path filesToZip) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)) {
            for(Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Zip File Created.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
