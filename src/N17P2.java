class Item {
    private String code;
    private String name;
    private double price;
}
// item code
// item name
// unit price before tax

class DrinkItem {
    private String itemCode;
    private int quantity;

    public DrinkItem(String x, int y) {
        itemCode = x;
        quantity =y;
    }

    public String getItemCode() {
        return itemCode;
    }
} // all acce

class Payment {
    private FoodItem[] fi = new FoodItem[100];
    private int fiCount;
    private static double foodTax = 0.2; // 20% sales tax added to
    // all food prices
    private DrinkItem[] di = new DrinkItem[100];

    private int diCount;
    private static double drinkTax = 0.1; // 10% sales tax added to

    public Payment() {
        fiCount = 0;
        diCount = 0;
    }

    public void addFoodItem(FoodItem foo) {
    }

    public int getFiCount() {
        return -1;
    }

    public void addDrinkItem(DrinkItem di) {

    }

    public int getDiCount() {
        return -1;
    }

    public DrinkItem getDi(int drink) {
        return new DrinkItem("1", 1);
//        return di[1];
    }

    public static double getFoodTax() {
        return 0.0;
    }

    // all drink prices
// all other accessor and mutator methods are included
// addFoodItem()  – this method adds a new FoodItem object
// addDrinkItem() – this method adds a new DrinkItem object
    public static double findPrice(Item[] pl, String c) {
        //code missing
        return 0.0;
    }
}

// calculateBill() – This method returns the bill (the total value of } // the items consumed for a particular table)
class FoodItem {
    private String itemCode;
    private int quantity;

    public FoodItem(String x, int y) {
        itemCode = x;
        quantity = y;
    }
} // all accessor and mutator methods are included

public class N17P2 {
    public void run() {
        Payment[] tables = new Payment[50];

        tables[1] = new Payment();
        tables[2] = new Payment();
        FoodItem a = new FoodItem("f102", 2);
        FoodItem b = new FoodItem("f100", 1);
        DrinkItem c = new DrinkItem("d102", 3);
        tables[1].addFoodItem(a);
        tables[1].addFoodItem(b);
        tables[2].addDrinkItem(c);
        tables[2].addDrinkItem(new DrinkItem("d103",1));
        System.out.println(tables[1].getFiCount());
        System.out.println(Payment.getFoodTax());
        System.out.println(tables[2].getDi(1).getItemCode());
    }
}
