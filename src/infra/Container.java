package infra;

import controller.SystemController;
import repository.MemberRepository;
import service.MenverService;

import java.util.Scanner;

public class Container {

    public static Scanner sc;
    public static SystemController systemController;
    public static MenverService memberService;
    public static MemberRepository memberRepository;

    static {
        sc = new Scanner(System.in);
        systemController = new SystemController();
    }

}