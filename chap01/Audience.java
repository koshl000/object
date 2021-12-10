package chap01;
public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag=bag;
    }
    public long buy(Ticket ticket){
        // if(bag.hasInvitation()){
        //     bag.setTicket(ticket);
        //     return 0l;
        // }else{
        //     bag.minusAmount(ticket.getFee());
        //     bag.setTicket(ticket);
        //     return ticket.getFee();
        // }
        return bag.hold(ticket);
    }
}
