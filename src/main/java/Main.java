

public class Main {

    public static void main(String[] args) {
        String[] countdown = {"one", "two", "three"};
        String[] names = {"Sjaak", "Sjimmy", "Sjonny"};

        System.out.println(countdown[0]);
        System.out.println(countdown[1]);
        System.out.println(countdown[2]);
        System.out.println("boom!");

        for (String str : names) {
            System.out.println(str);
        }
        int length = countdown.length;
        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            result[i] = countdown[i] + names[i];
            System.out.println(result[i]);

        }

    }

}
