package cn.tedu.qr;

import qr.CreateQR;

public class QR {
    public static void main(String[] args) {
        CreateQR.make(120,120,
                "http://act.codeboy.com",
                "d:/qr.png");
    }
}
