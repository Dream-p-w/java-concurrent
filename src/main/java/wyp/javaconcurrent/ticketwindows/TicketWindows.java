package wyp.javaconcurrent.ticketwindows;

/**
 * @author : miles wang
 * @date : 2019/9/20  5:38 PM
 *
 * 模拟银行柜台
 */
public class TicketWindows extends Thread{



    // 接待客户数量
    private static final  int Max=100;
    private final String name;
    private static int index=1;

    public TicketWindows(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index<Max){
            System.out.println("当前柜台:------>"+this.name+" 业务号 :"+index);
            index++;
        }

    }
}
