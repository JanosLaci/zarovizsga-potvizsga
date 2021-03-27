package hu.nive.ujratervezes.zarovizsga.words;

public class Words {
    public boolean hasMoreDigits(String s){

        int digitCounter = 0;

        for (char arrayElement : s.toCharArray()) if (Character.isDigit(arrayElement)) digitCounter += 1;

        return digitCounter / (float) s.length() > 0.5; }




    /* {
        char[] charArrayFromString = s.toCharArray();
        int totalCharNumber = charArrayFromString.length;
        int digitCounter = 0;

        for (char arrayElement :
                charArrayFromString) {
            if (Character.isDigit(arrayElement)) digitCounter += 1;
        }
        // egész osztás elkerülése típus-kényszerítéssel
        // nem dob kivételt 0, azaz 0.0 esetén sem
        return digitCounter / (float) totalCharNumber > 0.5;
    }

    public static void main(String[] args) {

        Words words = new Words();
        System.out.println(words.hasMoreDigits("1"));
        System.out.println(words.hasMoreDigits("11a"));
        System.out.println(words.hasMoreDigits("111aa"));
        System.out.println(words.hasMoreDigits("1aa111"));
        System.out.println(words.hasMoreDigits(""));
        System.out.println(words.hasMoreDigits("1a"));

        System.out.println("1 /  0.0 > 0.5 eredménye:");

        System.out.println(1 /  0.0 > 0.5);


    }*/

}
