package app.valid;

import app.exception.AppEmptyException;
import app.exception.AppUserInputException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppValid {

    public void validateEmptyAddress(String streetName, String buildingNumber) throws AppEmptyException {
        if (streetName.trim().isEmpty() || buildingNumber.trim().isEmpty()) {
            throw new AppEmptyException(" lines of address is empty");
        }
    }

    public void validateFormatAddress(String streetName, String buildingNumber) throws AppUserInputException {
        if (isContainingLetters(streetName)) {
            throw new AppUserInputException("Street must contains only letters!!!");
        }
        if (!isContainingNumbers(buildingNumber)) {
            throw new AppUserInputException("Building number can contains only numbers and symbol \"/\"!!!");
        }
    }
    public void validateUserNameFormat(String userName) throws AppUserInputException{
        if(isContainingLetters(userName)){
            throw new AppUserInputException("User name must contains only letters without symbols and numbers!");
        }
    }
    public void validateEmptyUser(String userName) throws AppEmptyException {
        if (userName.trim().isEmpty()) {
            throw new AppEmptyException("Line \"User name\" is Empty");
        }
    }


    private boolean isContainingLetters(String name) {
        Pattern pattern = Pattern.compile("a-zA-Z");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    private boolean isContainingNumbers(String buildingNumber) {
        Pattern pattern = Pattern.compile("^[0-9/]*$");
        Matcher matcher = pattern.matcher(buildingNumber);
        return matcher.find();
    }

}
