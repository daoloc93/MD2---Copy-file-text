import java.io.*;

public class Main {

    public static void main(String[] args) {
        String from = "C:/User/Dell/Desktop";
        String to = "C:/User/Dell/Desktop/New folder (2)";

        File source = new File(from);
        File dest = new File(to);


    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            System.out.println("dest" + is.read());
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                System.out.println("length = " + length);
            }
            System.out.println("Copy is done");
        } finally {
            is.close();
            os.close();
        }
    }
}
