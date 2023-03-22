package TASK2;

public abstract class Singer {
    private String name;
    private int sNumber;
    private static int counter = 1;

    public Singer(String name) {
        this.name = name;
        sNumber = counter++;
    }

    public abstract String sing();

    public static Singer loudest(Singer[] singer) {
        Singer result = null;
        int max = 0;

        for (Singer s :
                singer) {
            int tmp = s.sing().replaceAll("[^A-Z]", "").length();
            if (tmp > max) {
                max = tmp;
                result = s;
            }
        }

        return result;
    }
    public String toString() {
        return "(" + sNumber + ")" + name + ":" + sing();
    }
}
