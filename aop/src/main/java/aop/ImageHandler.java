package aop;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Aspect
public class ImageHandler {
    private static final Logger logger = LoggerFactory.getLogger(ImageHandler.class);

    @Pointcut("execution(* aop.ImageCopy.copyImage())")
    public void  handlerImage(){

    }
    @Before(value = "handlerImage()")
    public void pressTextOnImage() throws IOException {
        logger.info("开始给图片添加水印");
        File srcFile = new File("D:/bg.jpg");

        InputStream input=new FileInputStream(srcFile);
        BufferedImage srcImg= ImageIO.read(input);
        int width =srcImg.getWidth();
        int height=srcImg.getHeight();
        System.out.println("原图宽"+width+"原图高"+height);
        File destFile = new File("D:/bg1.jpg");
        Color color = new Color(211, 32, 29);
        int size=20;
        Font font = new Font("微软雅黑",Font.BOLD,size);
        String text="吴飞";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width-text.length()* size)/2,height/2-size,1.0f);
    }

    @AfterReturning("handlerImage()")
    public void grayImage(){
        logger.info("开始将图片转成黑白");
        File srcFile= new File("E:/bg1.jpg");
        File destFile= new File("E:/bg2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }

}
