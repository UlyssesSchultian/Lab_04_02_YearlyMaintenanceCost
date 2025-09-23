public class Main {
    public static void main(String[] args) {

        double springCost = 150.75;
        double summerCost = 200.50;
        double fallCost = 175.25;
        double winterCost = 220.00;


        double yearlyTotal = springCost + summerCost + fallCost + winterCost;


        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + yearlyTotal);
    }
}