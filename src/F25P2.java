/*
    2025-02-06 IB CS Java Practice
 */

class School {
    private String title;
    private String address;

    private Student[] students;
    private Teacher[] teachers;

    public School(String title, String address) {
        this.title = title;
        this.address = address;

        this.students = new Student[500];
        this.teachers = new Teacher[80];
    }

    public String getTitle() {
        return title + " @ " + address;
    }
}

class Teacher {
    private String name;
    private String surname;
    private String subject;

    public Teacher(String name, String surname, String subject) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
}

class Subject {
    private String title;
    private String grade;
    private Teacher teacher;

    public Subject(String title, String grade, Teacher teacher) {
        this.title = title;
        this.grade = grade;
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}

class Student {
    private String name;
    private String surname;
    private String year; // klase
    private int [] grades; // pazymiai
    private Subject [] subjects; // dalykai
    // grades
    // subjects

    public Student(String name, String surname, String year, int[] grades, Subject[] subjects) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
        this.subjects = subjects;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Subject getFavoriteSubject() {
        return this.subjects[0];
    }
}

public class F25P2 {
    public void run() {
        System.out.println("Pasiruoses darbui.");

        School school = new School("VPG", "Kiekviena diena ten pat");

        Teacher t1 = new Teacher("Kestutis", "Maciulaitis", "Si Es");
        Teacher t2 = new Teacher("Vardas", "Pavarde", "History");
        Teacher t3 = new Teacher("Auksinis", "Kardas", "Filosofija");

        System.out.println(school.getTitle());

        Subject[] subjects = new Subject[]{
                new Subject("Si Es", "12", t1)
        };

        Student s1 = new Student("N1", "S1", "Year 1", new int[]{5, 6, 9}, subjects);

        System.out.println(s1.getFavoriteSubject().getTeacher().getName());

//        s1.dis

        // DONE sukurti mokyklos klase, priskirti pavadinima ir adresa
        // DONE sukurti tris mokytojus su savo informacija
        // DONE-ISH sukurti tris studentus su savo informacija, prideti subjects
        // apjungti koda ir informacija i veikiancia programa

        // program turi isvesti:
        // - 2 studenta pagel eile
        // - jo mokytoja ir mokytojo informacija
        // - studento mokomuosiuos dalykus
    }
}
