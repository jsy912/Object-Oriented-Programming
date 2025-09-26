import java.util.Scanner;

class Student {
    long studentNumber;
    String name;
    String major;
    long phone;
    String rePhone;

    public void setStudentNumber(long sn) {studentNumber = sn;}
    public void setName(String n) {name = n;}
    public void setMajor(String m) {major = m;}
    public void setPhone(long p) {this.phone = p;}

    public long getStudentNumber() {return studentNumber;}
    public String getName() {return name;}
    public String getMajor() {return major;}
    public String getPhone() {
        String sPhone = Long.toString(this.phone);
        String zeroPhone = "0" + sPhone;
        rePhone = zeroPhone.substring(0,3) + "-" + zeroPhone.substring(3,7) + "-" + zeroPhone.substring(7);
        return rePhone;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            long snInput = sc.nextLong();
            String nInput = sc.next();
            String mInput = sc.next();
            long pInput = sc.nextLong();

            Student student = new Student();

            student.setStudentNumber(snInput);
            student.setName(nInput);
            student.setMajor(mInput);
            student.setPhone(pInput);

            students[i] = student;
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("첫번째 학생: %d %s %s %s\n", students[0].getStudentNumber(),
                students[0].getName(),students[0].getMajor(),students[0].getPhone());
        System.out.printf("두번째 학생: %d %s %s %s\n", students[1].getStudentNumber(),
                students[1].getName(),students[1].getMajor(),students[1].getPhone());
        System.out.printf("세번째 학생: %d %s %s %s\n", students[2].getStudentNumber(),
                students[2].getName(),students[2].getMajor(),students[2].getPhone());
    }
}
