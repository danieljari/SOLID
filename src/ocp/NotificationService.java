package ocp;
/**
 * @author Daniel Jari
 * version 1.0.0

 * Open closed principle - open for extension but closed for modification
 *
 *  should be able to add new functionality to the system without modifying existing code
 */
public interface NotificationService {


    public default void sendInfoToUser(String meduim) {

    }


    public default void printReport(String medium) {

    }
}
