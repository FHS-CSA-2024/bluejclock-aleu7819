package src.main.java;


public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change

    //Implement 2 private NumberDisplay objects. 
    //  One for hours, one for minutes, one for seconds
    //Implement a private String for the display
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes/seconds as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplaySeconds(){
        this.hours = new NumberDisplay(24); //limit for hours
        this.minutes = new NumberDisplay (60);
        this.seconds = new NumberDisplay (60);
        updateDisplay();
    }
    //Implement a constructor that takes 3 parameters, hour, minute, second
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes/seconds as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplaySeconds(int hour, int minute, int second){
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);
        
        setTime(hour, minute, second);
    }
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
     public void timeTick() {
        seconds.increment();
        if (seconds.getValue() == 0) {  // If seconds roll over
            minutes.increment();
            
            if (minutes.getValue() == 0) {  // If minutes roll over
                hours.increment();
            
            }
        }
        updateDisplay();
    }
    //Implement a method setTime that takes in 3 parameters, hour, minute, and second
    //The method should set the hours value, minutes value, and seconds value
    //The updateDisplay method should be called before finishing
    public void setTime (int hour, int minute, int second){
        seconds.setValue(second);
        minutes.setValue(minute);
        hours.setValue(hour);
        
        updateDisplay();
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM:SS and report out the current time
    public String getTime(){
        return display;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM:SS
    private void updateDisplay() {
        display = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
    }
}
