package csc_assignment;

public class TimeTableTest {

    public static void main(String args[]){
        TimeTable timeTable = new TimeTable(5,7);
        Booking ileOla, leke, yemi;
        ileOla = new Booking("Akintola", "Ileola");
        leke = new Booking("Nacoss lib","hashCode");
        yemi = new Booking("Awolowo", "Big Uncle Yemi");
        timeTable.makeBooking(1,1,ileOla);
        timeTable.makeBooking(3,6,leke);
        timeTable.makeBooking(2,0,yemi);

        System.out.println(timeTable.isFree(3,5));
        System.out.println(timeTable.isFree(2,0));
        Booking aBoooking = timeTable.getBooking(1,1);
        System.out.println("The name of the booker is "+aBoooking.getName());
        System.out.println("The room number of the booker IS "+aBoooking.getRoom());


    }
}
