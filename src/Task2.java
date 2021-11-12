public class Task2 {
    private static int[] RESULT = new int[Type.values().length];
    private static int TOTAL_PRICE = 12000;
    private static int NUMBER_OF_MALE = 3;
    private static int NUMBER_OF_FEMALE = 3;
    private static int bias = 1000;

    private static enum Type {
        MALE, FEMALE
    }

    public static void main(String[] args) {
        dividePrice(TOTAL_PRICE, NUMBER_OF_MALE, NUMBER_OF_FEMALE);
        showResult();
    }

    private static void dividePrice(int totalPrice, int numberOfMale, int numberOfFemale) {
        computePrice(totalPrice, numberOfMale, numberOfFemale);
    }

    private static void computePrice(int totalPrice, int numberOfMale, int numberOfFemale) {
        int discountedPeopleOfPrice = (totalPrice - bias * numberOfMale) / (numberOfMale + numberOfFemale);
        RESULT[Type.MALE.ordinal()] = discountedPeopleOfPrice + bias;
        RESULT[Type.FEMALE.ordinal()] = discountedPeopleOfPrice;
    }

    private static void showResult() {
        showFormattedMessage(Messages.MALE, RESULT[Type.MALE.ordinal()]);
        showFormattedMessage(Messages.FEMALE, RESULT[Type.FEMALE.ordinal()]);
    }

    private static void showFormattedMessage(String message, int a) {
        System.out.format(message, a);
    }

}
