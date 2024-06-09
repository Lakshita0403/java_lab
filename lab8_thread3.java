class A extends Thread {

    String s;

    A(String s) {
        this.s = s;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(s + " " + i);
            
            // try {
            // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            // System.out.println(e);
            // }
        }
    }
}

class lab8_thread3 {
    public static void main(String args[]) {
        A obj1 = new A("cut the ticket");
        A obj2 = new A("show the ticket");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}