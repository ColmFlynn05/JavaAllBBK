/**
 * A class that extends @OldPhone
 * can play games and has a ring alarm (ringtone is what I think he means)
 * can print last 10 called numbers.
 */
public class MobilePhone extends OldPhone{
    private final String[] lastNumbers = new String[10];


    @Override
    public void call(String number) {
        super.call(number);
        boolean numberAdded = false;
        for(int i = 0; i < 10; i++){
            if (lastNumbers[i] == null){
                lastNumbers[i] = number;
                numberAdded = true;
            }

        }
        if(!numberAdded){
            for(int i = 0; i < 9; i++) {
                lastNumbers[i] = lastNumbers[i++];
            }
            lastNumbers[0] = number;
        }
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
