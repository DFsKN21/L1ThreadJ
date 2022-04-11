package com.company;

public class SomeT extends Thread{
    private final int id;
    private final BreakT breakT;

    public SomeT(int id, BreakT breakThread) {
        this.id = id;
        this.breakT = breakThread;
    }

    @Override
    public void run() {
        long sum = 0;
        int count = 1;

        boolean isStop;// false
        do{
            sum = sum + 1;
            count = count + 1; // кількість доданків

            isStop = breakT.StopThread();
        } while (!isStop);
        System.out.println("Number thread: "+ (char)27 + "[32m"+ id + (char)27 +"[0m" + ", sum = " + (char)27+"[33m"+ sum + (char)27+"[0m" + ", number of terms: "+  (char)27+"[34m"+ count + (char)27+"[0m");

    }
}
