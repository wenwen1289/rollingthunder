package com.xiangwen;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileReader;

public class GetFile {
    public static void main(String[] args)throws Exception {
        System.out.println(111);
        String path = Thread.currentThread().getContextClassLoader().getResource("cc/aa.txt").getPath();
         BufferedImage xin3= ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("cc/ok.png"));
        System.out.println(xin3);
        FileReader reader=new FileReader(path);
        char[] arr=new char[1024];
        reader.read(arr);
        System.out.println(new String(arr));
        System.out.println(path);
    }
}
