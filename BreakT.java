package com.company;

public class BreakT implements Runnable{
    private boolean stopT = false;
    @Override
    public void run() {
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopT = true;
    }

    synchronized public boolean StopThread() {

        return stopT;
    }
}
