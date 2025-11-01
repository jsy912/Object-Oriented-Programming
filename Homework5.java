class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer (String ccp, String cmo, String chd, String cco, String cpo) {
        cpu = ccp;
        memory = cmo;
        hd = chd;
        color = cco;
        power = cpo;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println(" CPU: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor (String msi, String mco, String mpo) {
        monitorSize = msi;
        color = mco;
        power = mpo;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println(" Size: " + monitorSize);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(String ccp, String cmo, String chd, String cco, String cpo, String msi, String mco, String mpo) {
        this.computer = new Computer(ccp, cmo, chd, cco, cpo);
        this.monitor = new Monitor(msi, mco, mpo);
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer("Core i7", "32GB", "2TB", "흰색", "700W", "32인치", "검은색", "45W");

        pc.turnOn();
        pc.printInfo();
    }
}
