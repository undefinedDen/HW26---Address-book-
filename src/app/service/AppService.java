package app.service;

import app.exception.AppEmptyException;
import app.exception.AppUserInputException;
import app.valid.AppValid;

public class AppService {
    AppValid validator;

    public AppService(AppValid validator) {
        this.validator = validator;
    }

    public boolean getValidUserName(String userName){
        try{
            validator.validateEmptyUser(userName);
            validator.validateUserNameFormat(userName);
            return true;
        }catch(AppEmptyException | AppUserInputException e){
            System.out.print(e.getMessage());
            return false;
        }
    }
    public boolean getValidAddress(String street, String buildingNumber) {
        try {
            validator.validateEmptyAddress(street,buildingNumber);
            validator.validateFormatAddress(street, buildingNumber);
            return true;
        } catch (AppEmptyException | AppUserInputException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public String takeFirstLetterBig(String word){
       return word.substring(0,1).toUpperCase() + word.substring(1);
    }
}
