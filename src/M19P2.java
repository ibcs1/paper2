/*
Swimmer
- String name
- String school
- String[5] eventID - double[5] time
+ constructor
+ accessor and mutator methods
+ addTimes()

Race
- Swimmer[8] swimmer - double[8] time
+ constructor
+ accessor and mutator methods
+ addSwimmers()
+ addTimes()
 */

//
class Race {
    public Race () {
        // missing code
    }
}

class Event {
    private String eventID;
    private int numberOfRaces;
    private Race[] races;
    private Race finals;

    public Event(String ID, int numberOfRaces) {
        eventID = ID;
        races = new Race[numberOfRaces];
        for (int i = 0; i < numberOfRaces; i++) {
            races[i] = new Race();
        }
        finals = new Race();
    }

    public void addSwimmers() {
        // fills the qualifying heats with swimmers
    }

    public void fillFinals() {
        // fills the finals race with the best 8 from the qualifying heats
    }
    // more methods()
}

public class M19P2 {
    public void run() {
        Event free100 = new Event("100 m free style",2);
    }
}
