

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
        int arraysLength = countdown.length;
        String[] arraysCombined = new String[arraysLength];

        for (int i = 0; i < arraysLength; i++) {
            arraysCombined[i] = countdown[i] + names[i];
            System.out.println(arraysCombined[i]);
        }
    }
}
