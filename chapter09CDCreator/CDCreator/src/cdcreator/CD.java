// Name: Hansel Doan
// Date: 07/27/22
// Assignment: Chapter 9 Exercise 2
// Description: Creates a class called CD that has three fields: 
// numberOfTrack, runningTime, and title. 
// There are also three methods: getNumberOfTrack, getRunningTime, and getTitle. These methods return the values of the corresponding fields.
package cdcreator;

public class CD {

    private final int numberOfTrack;
    private final int runningTime;
    private final String title;

    public CD(int numberOfTrack, int runningTime, String title) {
        this.numberOfTrack = numberOfTrack;
        this.runningTime = runningTime;
        this.title = title;
    }

    public int getNumberOfTrack() {
        return numberOfTrack;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public String getTitle() {
        return title;
    }
}
