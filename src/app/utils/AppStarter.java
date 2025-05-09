package app.utils;

import app.controller.AppController;
import app.service.AppService;
import app.validator.AppValidator;
import app.view.AppView;

public class AppStarter {
    AppView view = new AppView();
    AppValidator validator = new AppValidator();
    AppService service = new AppService(validator);
    AppController controller = new AppController(service, view);
    public  void startApp(){
        controller.getOutput();
    }
}
