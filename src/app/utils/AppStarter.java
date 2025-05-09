package app.utils;

import app.controller.AppController;
import app.service.AppService;
import app.valid.AppValid;
import app.view.AppView;

public class AppStarter {
    AppView view = new AppView();
    AppValid validator = new AppValid();
    AppService service = new AppService(validator);
    AppController controller = new AppController(service, view);
    public  void startApp(){
        controller.getOutput();
    }
}
