package com.gupaoedu.michael;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("11");
    }

    public static void main(String[] args) {
        new Thread(new RunnableDemo()).start();
    }
}
