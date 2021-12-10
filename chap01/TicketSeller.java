package chap01;
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // public TicketOffice getTicketOffice(){
    // return ticketOffice;
    // }
    public void sellTo(Audience audience) {
        // if(audience.getBag().hasInvitation()){
        // Ticket ticket=ticketOffice.getTicket();
        // audience.getBag().setTicket(ticket);
        // }else{
        // Ticket ticket=ticketOffice.getTicket();
        // audience.getBag().minusAmount(ticket.getFee());
        // ticketoff.plusAmount(ticket.getFee());
        // audience.getBag().setTicket(ticket);;
        // }
        
        // ticketOffice.sellTicketTo(audience);
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
