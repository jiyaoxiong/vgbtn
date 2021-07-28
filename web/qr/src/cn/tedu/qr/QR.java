package cn.tedu.qr;

import qr.CreateQR;

public class QR {
    public static void main(String[] args) {
        int width = 150;
        int height = 150;
        String url = "https://maoyan.com/cshop/158401435/";
        String fileName = "F:/qr.png";

        CreateQR.make(width,height,url,fileName);
        System.out.println("二维码创建成功");
    }
}
