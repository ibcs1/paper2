class Visits {
    private String hotelCode; // id of the hotel
    private int days; // number of days of the visit
    public Visits(String h, int d) {
        hotelCode = h;
        days = d; }
    public int getDays() {
        return days;
    }
}

class Points {
    private String memberId; // id of the hotel customer
    private int totalPoints; // this year's points
    private int bonusPoints; // any bonus points given to this year's new member
    private String statusNow; // current(this year's)status
    private String statusNextYear; // following year's status
    private Visits[] allVisits = new Visits[366];//details of each visit during this year
    int y; // number of visits this year
    public Points(String id) // constructor for new member
    {
        memberId = id;
        bonusPoints = 0;
        y = 0;
        statusNow = "Bronze";
    }
    //constructor for new member given bonus points (valid for current year only)
    public Points(String id, int bp)
    {
        memberId = id;
        bonusPoints = bp; // multiples of 1000 - maximum number is 5000
        y = 0;
        statusNow = "Bronze";
    }
    // all the accessor and mutator methods are present but not shown
    public Visits getAllVisits(int v)
    {
        return allVisits[v];
    }
    public void addVisit(Visits v) // adds a new Visit object to the array
    {
        allVisits[y] = v;
        y = y + 1; }
    public void isGold()   {
        // code missing
    }
    public void calculateTotalPoints(){
        // code missing
    }
    public void daysMissing(){
        // code missing
    }
}


public class M18P2 {
    public void run() {
        Points[] allPoints = new Points[10000]; // declared globally
        allPoints[0] = new Points("m100");
        allPoints[1] = new Points("m101",5000);
        allPoints[2] = new Points("m102",2000);
        Visits v1 = new Visits("h003", 3);
        Visits v2 = new Visits("h013", 1);
        Visits v3 = new Visits("h013", 2);
        Visits v4 = new Visits("h005", 6);
        allPoints[0].addVisit(v1);
        allPoints[0].addVisit(v2);
        allPoints[0].addVisit(v3);
        allPoints[0].addVisit(v4);
        allPoints[1].addVisit(v1);
        allPoints[1].addVisit(new Visits("h004",6));
    }
}
