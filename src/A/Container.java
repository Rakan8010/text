package A;

import java.util.Scanner;

public class Container {

    public static Scanner sc;
    public static SystemController systemController;

    static {
        sc = new Scanner(System.in);
        systemController = new SystemController();
    }

}
