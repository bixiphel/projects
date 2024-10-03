/* Includes various testing and statistic methods */
public class Stats {
    private long startTime; // used to hold a start time
    private long endTime; // used to hold an end time
    private int count; // used to count the number of steps it takes a number to reach one

    // Default constructor for a Stats object
    public Stats() {
        // All variables are set to zero (0) by default
        startTime = 0;
        endTime = 0;
        count = 0;
    }

    // Getters and Setters //

    /* Returns the clock is started (in ms) */
    public long getStartTime() {
        return startTime;
    }

    /* Sets the clock's start time (in ms) */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /* Returns when the clock is ended (in ms) */
    public long getEndTime() {
        return endTime;
    }

    /* Sets the end time (in ms) */
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    /* Getter for the count variable. */
    public int getCount() {
        return count;
    }

    /* Setter for the count variable. */
    public void setCount(int count) {
        this.count = count;
    }

    // Methods //

    /* Starts the stopwatch and records the starting time */
    public void startClock() {
        startTime = System.currentTimeMillis();
    }

    /* Stops the stopwatch and records the ending time */
    public void stopClock() {
        endTime = System.currentTimeMillis();
    }

    /* Returns the time from when the clock is started to when it is stopped */
    public long getTime() {
        return endTime - startTime;
    }

    /* Increments the count variable by 1. */
    public void increment() {
        setCount(getCount() + 1);
    }

}