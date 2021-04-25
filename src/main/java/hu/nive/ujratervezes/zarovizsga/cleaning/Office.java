package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    private String officeAddress;
    private int officeArea;
    private int numberOfFloors;


    public Office(String inputAddress, int inputArea, int inputNoOfFloors) {

        this.officeAddress = inputAddress;
        this.officeArea = inputArea;
        this.numberOfFloors = inputNoOfFloors;

    }

    public String getAddress() {
        return officeAddress;
    }

    public int clean() {
        return 100 * officeArea * numberOfFloors;
    }
}
