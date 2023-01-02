package file;

import java.awt.*;
import java.io.File;

public class Filee {
    public static void main(String[] args) {
        try{
            //String path="Downloads\\Resume(AKASH1)";
            String path="F:\\KHUSHIDOCUMENTS\\1670245673782_SIGN.jpg";
            File file =new File(path);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
//            Process pro=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+path);
//            pro.waitFor();
            }else {
                System.out.println("file does not exits");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
