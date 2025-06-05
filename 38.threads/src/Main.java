class MyTask extends Thread {
    int start, end;

    MyTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Thread " + this.getName() + " - Value: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask t1 = new MyTask(1, 250);
        MyTask t2 = new MyTask(251, 500);
        MyTask t3 = new MyTask(501, 750);
        MyTask t4 = new MyTask(751, 1000);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
