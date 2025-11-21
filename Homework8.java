import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Login {
    private Map<String, String> idMap = new HashMap<String, String>();
    private String targetId;
    private String targetPassword;
    private Scanner sc;

    public Login(Scanner scanner) {
        this.sc = scanner;
        idMap.put("myId", "myPass");
        idMap.put("myId2", "myPass2");
        idMap.put("myId3", "myPass3");
    }

    public void startLogin() {
        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            targetId = sc.next();
            targetId = targetId.trim();

            if (idMap.containsKey(targetId)) {
                if (checkPassword(targetId)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            } else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
            System.out.println();
        }
    }

    public boolean checkPassword(String id) {
        System.out.print("password: ");
        targetPassword = sc.next();
        targetPassword = targetPassword.trim();

        if (idMap.get(id).equals(targetPassword)) {
            return true;
        } else {
            System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            return false;
        }
    }
}

public class Homework8 {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        Login login = new Login(consoleScanner);

        login.startLogin();

        consoleScanner.close();
    }
}
