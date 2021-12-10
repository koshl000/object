package chap02;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreeened;
    
    public Screening(Movie movie,int sequence,LocalDateTime whenScreened){
        this.movie=movie;
        this.sequence=sequence;
        this.whenScreeened=whenScreened;
    }

    public LocalDateTime getStartTime(){
        return whenScreeened;
    }

    public boolean isSquence(int sequence){
        return this.sequence==sequence;
    }

    public Money getMovieFee(){
        return movie.getFee();
    }

    public Reservation reserve(Customer customer,int audienceCount){
        return new Reservation(customer,this,calculateFee(audienceCount),audienceCount);
    }
    private Money calculateFee(int audienceCount){
        return movie.calculateMovieFee(this).times(audienceCount);
    }
    
}
