import java.time.LocalDate;

public class Person extends Dates {
    
    //конструктор класса персон
    public Person(int year, int month, int day, String name) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
    }
    
    public String name;
    public int getWorkingDays(){ return LocalDate.now().getYear() - (year);}

}