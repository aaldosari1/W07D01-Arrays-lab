class Grades {
    public static void main(String[] args) {

        int[] myTestResults = {
            66,
            75,
            80,
            83,
            94
        };

        int ave = 0;
        int total = 0;

        for (int i = 0; i < myTestResults.length; i++) {
            total += myTestResults[i];

        }
        ave = total / 5;
        System.out.println("The average score is: " + ave);

        if (ave >= 80) {
            System.out.println("The letter grade is: A");
        } else if (ave <= 79 && ave > 70) {
            System.out.println("The letter grade is: B");
        } else if (ave <= 69 && ave > 60) {
            System.out.println("The letter grade is: C");
        } else if (ave <= 59 && ave > 50) {
            System.out.println("The letter grade is: D");
        } else
            System.out.println("The letter grade is: F");



    }
}