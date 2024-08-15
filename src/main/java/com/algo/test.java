package com.algo;

public class test {

    public static void main(String[] args) {


        new Thread(new RunnableThread()).start();

        new ExtendsThread().start();
    }



    static class RunnableThread implements Runnable {

        @Override
        public void run() {
            System.out.println("RunnableThread run");
        }
    }

    static class ExtendsThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("ExtendsThread run");
        }
    }
}
