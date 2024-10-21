/**
 * A class that extends @OldPhone
 * can play games and has a ring alarm (ringtone is what I think he means)
 * can print last 10 called numbers.
 */
public class MobilePhone extends OldPhone{
    private final int maxNumSaved = 10;
    private final String[] lastNumbers = new String[maxNumSaved];


    /**
     * keeps track of numbers for @printLastNumbers
     * @param number the phone number to call
     */
    @Override
    public void call(String number) {
        super.call(number);
        String movedNumber;
        String savedNumber = lastNumbers[0];

        for (int i = 1; i < maxNumSaved; i++) {
            movedNumber = lastNumbers[i];
            lastNumbers[i] = savedNumber;
            savedNumber = movedNumber;
        }
        lastNumbers[0] = number;
    }

    public void ringAlarm(String alarm){
        System.out.println(alarm);
    }
    public void playGame(String game){
        System.out.println(game);
    }
    public void printLastNumbers(){
        for (String lastNumber : lastNumbers) System.out.println(lastNumber);
    }
}
