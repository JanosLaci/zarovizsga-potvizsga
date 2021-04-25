package hu.nive.ujratervezes.zarovizsga.cleaning;

public class CleaningServiceMain {

    public static void main(String[] args) {

        CleaningService service = new CleaningService();

            service.add(new House("Bp. Fo ut 1.", 1));
            service.add(new House("Bp. Fo ut 2.", 3));
            service.add(new Office("Bp. Fo ut 3.", 300, 3));
            service.add(new Office("Bp. Fo ut 4.", 300, 4));

        System.out.println(service.getCleanables().get(3).clean());


        int result = service.cleanOnlyOffices();
        System.out.println(result);

    }

}
