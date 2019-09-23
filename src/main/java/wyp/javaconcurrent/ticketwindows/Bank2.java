package wyp.javaconcurrent.ticketwindows;

/**
 * @author : miles wang
 * @date : 2019/9/23  10:12 AM
 *
 * 这里采用 实现 Runnale接口
 */
public class Bank2 {

    public static void main(String[] args) {
        TicketWindows2 ticketWindows2 = new TicketWindows2();

        Thread thread1 = new Thread(ticketWindows2,"第1个");
        Thread thread2 = new Thread(ticketWindows2,"第2个");
        Thread thread3 = new Thread(ticketWindows2,"第3个");


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
