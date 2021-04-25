package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CleaningServiceFirstTry {

    private List<Cleanable> cleanables = new ArrayList<>();


    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);

    }

    public List<Cleanable> getCleanables() {
        return new ArrayList<>(cleanables);
    }

    public int cleanAll() {
        int totalCleaningCost = 0;

        for (Cleanable cleanable :
                cleanables) {
            totalCleaningCost += cleanable.clean();
        }
        cleanables.clear();
        return totalCleaningCost;
    }

    public int cleanOnlyOffices() {
        int totalCleaningCostOffices = 0;

        for (Cleanable cleanable :
                cleanables) {
            //System.out.println("Feltétel előtt:");
            //System.out.println(cleanable.clean());
            if (cleanable instanceof Office){
                //System.out.println(cleanable.clean());
                totalCleaningCostOffices += cleanable.clean();
                //System.out.println(totalCleaningCostOffices);

            }

        }
        List<Cleanable> toBeRemovedList = new ArrayList<>();

        for (Cleanable cleanable :
                cleanables) {
            if (cleanable instanceof Office){
                toBeRemovedList.add(cleanable);

            }

            cleanables.removeAll(toBeRemovedList);


        }

        return totalCleaningCostOffices;
    }

    public String getAddresses() {
        StringBuilder stringBuilder = new StringBuilder();
        String prefix = "";
        for (Cleanable cleanable : cleanables) {
            stringBuilder.append(prefix);
            prefix = ", ";
            stringBuilder.append(cleanable.getAddress());
        }

        return stringBuilder.toString();
    }


    public List<Cleanable> findByAddressPart(String inputString) {
        List<Cleanable> outputList = new ArrayList<>();

        for (Cleanable cleanable :
                cleanables) {
            if (cleanable.getAddress().contains(inputString)) outputList.add(cleanable);
        }
        return outputList;
    }
}
