package srp;

/**
 * @author Daniel Jari
 * version 1.0.0
 * This Class does not follow RSP - Single responsible Principle.
 * A class/method should only have one responsibility
 * <p>
 * To refactor this class to follow SRP,
 * split it into smaller, more focused classes, each responsible for a single task.
 */

public class BankServiceOLD {
    String loanType = "";
    String medium = "";
    public long deposit(long amount, String AccountNo){
         return 0;
    }

    public long withDraw(long amount, String accountNo){
        return 0;
    }
    public void PrintInfo() {

    }

    public void getLoanInfo(){

        if(loanType.equals("house")){
            // do this
        }
        if (loanType.equals("personal")){
            // do this
        }
        if(loanType.equals("car")){
            // do this
        }
    }

    public void sendInfoToUser(String medium){

        if(medium.equals("email")){
            //MailSenderAPI
        }
    }


}
