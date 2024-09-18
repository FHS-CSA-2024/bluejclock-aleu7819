package src.main.java;


public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change

    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24); //limit for hours
        minutes = new NumberDisplay (60);
        seconds = new NumberDisplay (60);
        updateDisplay();
    }
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        
        setTime(hour, minute, second);
    }
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    public void timeTick(){
        seconds.increment();
        if(seconds.getValue() == 0){
            minutes.increment();
        }
        
        minutes.increment(); // use the method for incremnts from number display        
        if(minutes.getValue() == 0){
            hours.increment();
        }
        
        
        updateDisplay();
    }
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    public void setTime (int hour, int minute, int second){
        seconds.setValue(second);
        minutes.setValue(minute);
        hours.setValue(hour);
        
        updateDisplay();
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime(){
        return display;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    private void updateDisplay() {
        display = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
    }
}
