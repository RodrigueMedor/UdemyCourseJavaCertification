package test2;

public class SecurityCodeChech {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int accountNumberToCheck){
        if(accountNumberToCheck == getSecurityCode())
            return true;
        else
            return false;
    }

}
