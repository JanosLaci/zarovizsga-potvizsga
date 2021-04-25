package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.*;

public class CleaningServiceIterator {

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

        Iterator<Cleanable> iterator = cleanables.iterator();

        while (iterator.hasNext()){
            Cleanable cleanable = iterator.next();

            //iterator.next() újból nem!
            if (cleanable instanceof Office){
                totalCleaningCostOffices += cleanable.clean();
                iterator.remove();
            }
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
