class Course {
    protected String code;
    protected String name;

    public Course(String c, String n) {
        this.code = c;
        this.name = n;
    }

    public String getCode() {return code;}
    public String getName() {return name;}
}

class OnlineCourse extends Course {
    public OnlineCourse(String onc, String onn) {
        super(onc, onn);
    }
    @Override
    public String toString() {
        String onmsg = "Code: " + code + ", Name: " + name + ", Type: Online";
        return onmsg;
    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String offc, String offn) {
        super(offc, offn);
    }
    @Override
    public String toString() {
        String offmsg = "Code: " + code + ", Name: " + name + ", Type: Offline";
        return offmsg;
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
