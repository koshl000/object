package chap01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private long amount;
    private List<Ticket> tickets=new ArrayList<>();

    public TicketOffice(long amount,Ticket... tickets){
        this.amount=amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    public void minusAmount(long amount){
        this.amount-=amount;
    }

    public void plusAmount(long amount){
        this.amount+=amount;
    }

    // TicketOffice의 자유도를 높이는대신 TicketSeller->TicketOffce로 옮겨진 audience의존성을 제거
    // public void sellTicketTo(Audience audience) {
    //     plusAmount(audience.buy(getTicket()));
    // }
}
