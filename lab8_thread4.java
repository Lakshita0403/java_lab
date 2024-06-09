class A extends Thread {
    int available = 1;
    int wanted;

    A(int wanted) {
        this.wanted = wanted;
    }

    public void run() {
        
            String name = Thread.currentThread().getName();
            
                if (available >= wanted) {
                    System.out.println(wanted + " bearth reserved for : " + name);
                }

                else {
                    System.out.println("no bearth available");
                }

                try {
                    Thread.sleep(1000);
                    available = available - wanted;
                } catch (InterruptedException e) {
                    System.out.println(e + "a except");
                }
            }
        }
    

    class lab8_thread4 {
        public static void main(String args[]) {
            A obj1 = new A(1);
            A obj2 = new A(1);

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.setName("radhe govind");
            t2.setName("krishna");
            t1.start();
            t2.start();
        }
    }

