package infra;

import controller.MemberController;
import controller.SystemController;
import repository.MemberRepository;
import service.MemberService;

import java.util.Scanner;

public class Container {

    public static Scanner sc;
    public static Session session;
    public static SystemController systemController;
    public static MemberRepository memberRepository;
    public static MemberService memberService;
    public static MemberController memberController;

    static {
        sc = new Scanner(System.in);
        session = new Session();
        systemController = new SystemController();
        memberRepository = new MemberRepository();
        memberService = new MemberService();
        memberController = new MemberController();
    }

}