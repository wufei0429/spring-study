package aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class Evm {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        // 设置前景色，既二维码颜色
        Color foreColor=new Color(211, 111, 123);

        // 设置背景色
        Color backColor=new Color(112, 211, 117);
        QrCodeUtil.generate(//
                "https://www.jianshu.com/u/9ff9291b1edd", //二维码内容
                QrConfig.create().setImg("e:/logo.png"), //附带logo
                FileUtil.file("e:/qrcode.jpg")//写出到的文件
        );
    }
}
