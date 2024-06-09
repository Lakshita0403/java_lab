class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class lab8_thread2 {
    public static void main(String args[]) {
        A obj = new A();
        Thread t1 = new Thread(obj);
        t1.setName("First name");
        t1.setPriority(6);
        System.out.println(t1);
        t1.start();
    }
}