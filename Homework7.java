abstract class Printer {
    protected String model;
    protected int printedCount = 0;
    protected int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }
    public abstract boolean print();
}

class InkjetPrinter extends Printer{
    public InkjetPrinter(String m, int a) {super(m, a);}
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        } else if (availableCount >= 1) {
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
        else {
            System.out.println("Error");
            return false;
        }
    }
}

class LaserPrinter extends Printer{
    public LaserPrinter(String m, int a) {super(m, a);}
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        } else if (availableCount >= 1) {
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
        else {
            System.out.println("Error");
            return false;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
