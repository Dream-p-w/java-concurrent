package wyp.javaconcurrent.ticketwindows;

/**
 * @author : miles wang
 * @date : 2019/9/20  5:43 PM
 *
 * 这里new了3个线程，有3个线程示例，3个数据不共通，我们只能使用static
 */
public class Bank  {

    public static void main(String[] args) throws  Exception{
        TicketWindows ticketWindows1 = new TicketWindows("1号柜台开始干事");
        TicketWindows ticketWindows2 = new TicketWindows("2号柜台开始干事");
        TicketWindows ticketWindows3 = new TicketWindows("3号柜台开始干事");


        ticketWindows1.start();
        ticketWindows2.start();
        ticketWindows3.start();
    }
}
