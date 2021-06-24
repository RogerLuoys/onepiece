package com.luoys.onepiece;

public class NewThread implements Runnable{

    private String name;

    public NewThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(name + i);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                System.out.println("exception");
            }
        }
    }
}
