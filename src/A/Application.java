package A;

import java.util.Scanner;

public class Application {
    private Scanner sc = Container.sc;
    private boolean isRunning = true;

    public void run(){
        while(isRunning) {
            System.out.println("명령어 :");
            String inputUri = sc.nextLine().trim();

            Request request = new Request(inputUri);

            Container container = getController(request.getControllerCode());
        if(controller != null)
            controller.
        }



        public Container getController(String code){
            switch (code){
                case "System":
                    return; Container.systemController;
                default:

            }


            }


    }
}
