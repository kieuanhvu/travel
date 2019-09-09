package com.hitex.mobicastutil.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author MaiPH
 */
public class FileCommon {

    public static void saveFile(File image, byte[] bytes) throws IOException {
        Path path = Paths.get(image.getAbsolutePath());
        image.getParentFile().mkdirs();
        Files.write(path, bytes);
    }

    public static byte[] getFile(String absPath) throws IOException {
        Path path = Paths.get(absPath);
        byte[] files = Files.readAllBytes(path);
        return files;
    }

}
