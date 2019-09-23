package wyp.javaconcurrent.ticketwindows;

import org.springframework.context.annotation.Primary;

import javax.crypto.MacSpi;

/**
 * @author : miles wang
 * @date : 2019/9/23  10:09 AM
 *
 *  runnale接口
 * 把可执行的逻辑  抽取出来
 */
public class TicketWindows2  implements  Runnable{

    private  Integer  Max=50;
    private  Integer index=0;

    @Override
    public void run() {
        while (index< Max){

            System.out.println(Thread.currentThread()+"当前票号"+index++);
        }
    }
}
