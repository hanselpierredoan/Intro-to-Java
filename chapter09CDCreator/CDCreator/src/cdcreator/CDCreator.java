// Name: Hansel Doan
// Date: 07/27/22
// Assignment: Chapter 9 Exercise 2
// Description:
//creates three CDs with different numbers of tracks, running times, and titles. It then prints out information about each CD.
package cdcreator;

public class CDCreator {

    public static void main(String[] args) {
        CD cd1 = new CD(10, 50, "Title1");
        System.out.println("CD1");
        System.out.println("Number of tracks: " + cd1.getNumberOfTrack());
        System.out.println("Running time: " + cd1.getRunningTime());
        System.out.println("Title: " + cd1.getTitle());

        CD cd2 = new CD(12, 60, "Title2");
        System.out.println("CD2");
        System.out.println("Number of tracks: " + cd2.getNumberOfTrack());
        System.out.println("Running time: " + cd2.getRunningTime());
        System.out.println("Title: " + cd2.getTitle());

        CD cd3 = new CD(14, 70, "Title3");
        System.out.println("CD3");
        System.out.println("Number of tracks: " + cd3.getNumberOfTrack());
        System.out.println("Running time: " + cd3.getRunningTime());
        System.out.println("Title: " + cd3.getTitle());
    }
}
