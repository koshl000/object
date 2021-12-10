package chap01;
public class Bag {
    private long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0l;
        }else{
            minusAmount(amount);
            setTicket(ticket);
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }
    
    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasTicket() {
        return ticket != null;
    }


    private void minusAmount(long amount) {
        this.amount -= amount;
    }

    private void plusAmount(long amount) {
        this.amount -= amount;
    }
}
