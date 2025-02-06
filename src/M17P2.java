// HL ONLY
class Node {
    Node left; Node right; int data;
    Node(int newData) {
        left = null;
        right = null;
        data = newData;
    }
}

// SL + HL
class Sales // each object contains details of one sale
{
    private String itemId; // id of the item
    private double value; // the price of one item
    private int quantity; // the number of the items sold

    // constructor missing
    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public Sales(String i, double v, int q) {
        //
    }
}

class SalesPerson // each object contains details of one salesperson
{
    private String id;
    private Sales[] salesHistory; // details of the different sales
    private int count = 0; // number of sales made

    //constructor for a new salesperson
    public SalesPerson(String id) {
        // code missing
        salesHistory = new Sales[3];
    }

    // constructor for a salesperson transferred (together with
    // their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c) {
        // code missing
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count = count + 1;
    }

    public double calcTotalSales() // calculates total sales for the // salesperson
    {
        // code missing
        return 0.0;
    }

    public Sales largestSale() // calculates the sale with the largest // value
    {
        // code missing
        return new Sales("N/A", 0.0, -1);
    }

    // code missing
    public Sales getSalesHistory(int n) {
        return new Sales("N/A", 0.0, -1);
    }
}

public class M17P2 {
    public void run() {
        SalesPerson[] salesPeople = new SalesPerson[6];
        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");
        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
        System.out.println(salesPeople[2].getId());
        System.out.println(salesPeople[0].getCount());
        System.out.println(salesPeople[1].getSalesHistory(0).getValue());
        System.out.println(salesPeople[0].calcTotalSales());
    }
}
