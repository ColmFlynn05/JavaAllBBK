/**
 * abstract class that implements @Phone
 * no sure what it's supposed to do
 */
public class OldPhone implements Phone {

    @Override
    public void call(String number) {
        System.out.println("Calling: " + number);
    }
}
