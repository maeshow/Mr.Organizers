public class Task1 {

    private static int[] RESULT = new int[Type.values().length];
    private static int TOTAL_PRICE = 12000;
    private static int NUMBER_OF_MALE = 3;
    private static int NUMBER_OF_FEMALE = 3;

    private static enum Type {
        MALE, FEMALE
    }

    public static void main(String[] args) {
        dividePrice(TOTAL_PRICE, NUMBER_OF_MALE, NUMBER_OF_FEMALE);
    }

    private static void dividePrice(int totalPrice, int numberOfMale, int numberOfFemale) {
        computePrice(totalPrice, numberOfMale, numberOfFemale);
        showResult();
    }

    private static void computePrice(int totalPrice, int numberOfMale, int numberOfFemale) {
        RESULT[Type.MALE.ordinal()] = totalPrice / (numberOfMale + numberOfFemale);
        RESULT[Type.FEMALE.ordinal()] = totalPrice / (numberOfMale + numberOfFemale);
    }

    private static void showResult() {
        showFormattedMessage(Messages.MALE, RESULT[Type.MALE.ordinal()]);
        showFormattedMessage(Messages.FEMALE, RESULT[Type.FEMALE.ordinal()]);
    }

    private static void showFormattedMessage(String message, int a) {
        System.out.format(message, a);
    }

}
