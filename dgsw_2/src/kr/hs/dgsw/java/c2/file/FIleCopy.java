package kr.hs.dgsw.java.c2.file;

import java.io.*;

public class FIleCopy {
    public void copySlow(String source, String target) throws  Exception{
        long before = System.currentTimeMillis();

        File sourceFile = new File(source);
        File targetFile = new File(target);

        InputStream is = new FileInputStream(sourceFile);
        OutputStream os = new FileOutputStream(targetFile);

        while (is.available() > 0){
            int value = is.read();
            os.write(value);
        }

        is.close();
        os.close();

        long after = System.currentTimeMillis();
        System.out.println("시간 : " + (after - before));
    }

    public void copyFast(String source, String target) throws  Exception{
        long before = System.currentTimeMillis();

        File sourceFile = new File(source);
        File targetFile = new File(target);

        InputStream is = new FileInputStream(sourceFile);
        OutputStream os = new FileOutputStream(targetFile);

        byte[] buffer = new byte[1024];

        while (is.available() > 0){
            int length = is.read(buffer);
            os.write(buffer, 0, length);
        }

        is.close();
        os.close();

        long after = System.currentTimeMillis();
        System.out.println("시간 : " + (after - before));
    }

    public static void main(String[] args) {
        FIleCopy copy = new FIleCopy();

        try {
            copy.copySlow("C:/dgsw_2/img.gif", "C:/dgsw_2/이미지.gif");
            copy.copyFast("C:/dgsw_2/img.gif", "C:/dgsw_2/이미지.gif");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
