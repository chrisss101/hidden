package setup;

public class hiddenWord {
    static String hidden;
    public hiddenWord(String hidden) {
        this.hidden = hidden;
    }
    public static String getHint(String guess) {
        String hint = "";
        for(int i = 0;i<hidden.length();i++) {
            if (guess.substring(i,i+1) == hidden.substring(i,i+1)) {
                hint+= hidden.substring(i,i+1);
            }
        }
    }
}
