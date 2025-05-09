package app.controller;


import app.entity.Address;
import app.entity.User;
import app.service.AppService;
import app.view.AppView;

public class AppController {
    AppView view;
    AppService service;
    User user;
    Address address;

    public AppController(AppService service, AppView view) {
        this.service = service;
        this.view = view;
    }

    public void getOutput() {
        String userName = view.inputUserName();
        String street = view.getInputStreet();
        String buildingNumber = view.inputBuildingNumber();

        if (service.getValidUserName(userName)) {
            userName = service.takeFirstLetterBig(userName);
            user = new User(userName, address);
            if (service.getValidAddress(street, buildingNumber)) {
                street = service.takeFirstLetterBig(street);
                user.setAddress(street, buildingNumber);
                System.out.println(user + " " + user.getAddress());
            }
        }

    }
}
