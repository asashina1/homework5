public class Main {
    public static void main(String[] args) {



    // Задача 1
        var keyWord = 1;
        System.out.println(keyWord);
        byte byteVariable = 2;
        System.out.println(byteVariable);
        short shortVariable = 3;
        System.out.println(shortVariable);
        int integerVariable = 4;
        System.out.println(integerVariable);
        long thatIsABigOne = 999L;
        System.out.println(thatIsABigOne);
        float withFloatingPoint = 1.1f;
        System.out.println(withFloatingPoint);
        double withDoubleAccuracy = 1.21;
        System.out.println(withDoubleAccuracy);
        char symbol = '%';
        System.out.println(symbol);
        boolean bool = false;
        System.out.println(bool);


   //Задача 2
     float firstBoxerWeight = 78.2f;
     float secondBoxerWeight = 82.7f;
     float sumOfWeights = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Суммарный вес обоих боксеров составляет " + sumOfWeights + " кг.");
        float difOfWeights = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе боксеров составляет " + difOfWeights + " кг.");



    //Задача 3
    byte numberOfBananas = 5;
    short bananaWeight = 80;

    short milkPortion = 200 / 100;
    short milkPortionWeight = 105;

    byte countOfIceCreamPackages = 2;
    short iceCreamPackageWeight = 100;

    byte countOfEggs = 4;
    byte eggWeight = 70;

    int gramsInKg = 1000;
    int milkWeight = milkPortion * milkPortionWeight;

    int totalBreakfastWeight = numberOfBananas * bananaWeight + milkWeight + countOfIceCreamPackages * iceCreamPackageWeight + countOfEggs * eggWeight;
    double reducedWeight = (double) totalBreakfastWeight / gramsInKg;
        System.out.println("Вес спорт-завтрака составил " + reducedWeight + " кг.");



    //Задача 4
    short bottomLath = 250;
    short topLath = 500;
    byte toShredWeight = 7;
    int gramInKg = 1000;

    double daysWithBottomLath = toShredWeight * Math.ceil((double) gramInKg / bottomLath);
        System.out.println((int) daysWithBottomLath + " дней потребуется, если сбрасывать по " + bottomLath + " граммов в день");
        double daysWithTopLath = toShredWeight * Math.ceil((double) gramInKg / topLath);
        System.out.println((int) daysWithTopLath + " дней потребуется, если сбрасывать по " + topLath + " граммов в день");

        double averageDaysTake = Math.ceil((daysWithTopLath + daysWithBottomLath) / 2);
        System.out.println("В среднем, чтобы скинуть " + toShredWeight + " кг, потребуется " + (int) averageDaysTake + " день");
                }
}
