package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {

    private String houseAddress;
    private int houseArea;

    public House(String inputAddress, int inputArea) {
        this.houseAddress = inputAddress;
        this.houseArea = inputArea;


    }

    public int clean() {

        return houseArea * 80;
    }

    public String getAddress() {

        return houseAddress;
    }
}
