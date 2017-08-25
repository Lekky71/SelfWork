package csc_assignment;

public class TimeTable {
    private int days, periods;
    private Booking[][] table ;

    public TimeTable(int days, int periods) {
        this.days = days;
        this.periods = periods;
        table = new Booking[days][periods];
    }
    public boolean makeBooking(int day, int period, Booking booking){
        if(day >=0 && day <5 && period >= 0 && period <7){
            table[day][period] = booking;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFree(int day, int period){
        if(table[day][period] == null){
            return true;
        }
        else{
            return false;
        }
    }
    public Booking getBooking(int day, int period){
        return table[day][period];
    }

    public int numberOfDays() {
        return days;
    }

    public int numberOfPeriods() {
        return periods;
    }
}
