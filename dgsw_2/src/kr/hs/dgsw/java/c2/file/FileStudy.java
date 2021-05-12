package kr.hs.dgsw.java.c2.file;

import java.io.File;
import java.util.Date;

public class FileStudy {
    public static void main(String[] args) {

        try {
            File file = new File("c:/dgsw_2/abc.txt");
            boolean exist = file.exists(); // 파일이 존재하는 가
            System.out.println("exist : " + exist);

            file = new File("c:/dgsw_2/가나다.txt");
            boolean result = file.createNewFile(); // 파일 생성
            System.out.println("createNewFile : " + result);

            file.delete();

            File dir = new File("c:/dgsw_2/sub");
            result = dir.mkdir(); // 폴더 생성
            System.out.println("mkdir : " + result);

            dir.delete();

            File hello = new File("c:/dgsw_2/hello");
            System.out.println("isFile : " + hello.isFile()); // 파일인가 아닌가
            System.out.println("isDirectory : " + hello.isDirectory()); // 폴더인가 아닌가

            System.out.println("getName : " + hello.getName()); // 이름
            System.out.println("getAbsolutePath : " + hello.getAbsolutePath()); // 경로
            System.out.println("length : " + hello.length()); // 사이즈
            System.out.println("lastModified : " + hello.lastModified()); // 마지막 수정 시간

            long lastModified = hello.lastModified(); // 마지막 수정시간  (Date Type)
            Date date = new Date(lastModified);
            System.out.println("lastModified : " + date.toString());

            String parent = hello.getParent();
            System.out.println("getParent : "  + parent);

            dir = new File("C:/dgsw_2");
            File[] list = dir.listFiles();


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
