class Dates {
    private int day;
    private int month;
    private int year;

    public Dates(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static int StayDays(Dates x, Dates y) {
        // method that calculates the number of nights between x and y
        return 0;
    }
}

/*
    The Room class contains the following variables.
    • roomNumber -- a value that identifies the room
    • beds -- the number of beds in the room
    • price -- the price of the room, per night
    • empty -- indicating whether or not the room is occupied.
 */

class Room {

    private int roomNumber;
    private int beds;
    private double price;
    private boolean empty;

    public Room() {

    }
}

class Client {
    private int customerID;
    private String name;
    private Dates arrive;
    private Dates leave;
    private Room bedroom;

    public Client(int id, String c, Dates dateIn, Dates dateOut, Room r) {
        setCustomerID(id);
        setName(c);
        setArrive(dateIn);
        setLeave(dateOut);
        setBedroom(r);
    }

    public void setCustomerID(int id) {
        customerID = id;
    }

    public void setName(String c) {
        name = c;
    }

    public void setArrive(Dates dateIn) {
        arrive = dateIn;
    }

    public void setLeave(Dates dateOut) {
        leave = dateOut;
    }

    public void setBedroom(Room r) {
        bedroom = r;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public Dates getArrive() {
        return arrive;
    }

    public Dates getLeave() {
        return leave;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public void bill() {
        // method that calculates the bill for this client
    }
}

class Group {
    private String name; // name of group
    private int number; // number of rooms allocated to the group

    public Group(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    int[] gRooms = new int[number];

    // array to hold room numbers allocated to the group
    public double bill(int[] gRooms) {
        // method that calculates the bill for the group
        return 0.0;
    }
}

public class M16P2 {
    public void run() {
        Client c1 = new Client(1, "placeholder @ M16 P2", new Dates(2025, 2, 5), new Dates(2025, 2, 10), new Room());
        System.out.println(c1.getName());
    }
}
