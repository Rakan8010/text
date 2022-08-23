package A;

import A.Controller;
import A.Request;

public class SystemController implements Controller {

    @Override
    public void exeute(Request request) {
        switch (request.getTarget()){
            case "exit":
                exitApplication();
                break;
            default:
            break;
        }
    }
    public void exitApplication(){
        System.out.println("어플리케이션을 종료합니다");
    }
}
