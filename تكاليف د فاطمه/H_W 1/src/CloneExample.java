//2-Suppose that we create an array A of GameEntry objects, which has an integer scores field,
// and we clone A and store the result in an array B. If we then immediately set A[4].
// score equal to 550, what is the score value of the GameEntry object referenced by B[4]?
class GameEntry implements Cloneable {
    private int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneExample {
    public static void main(String[] args) {
        GameEntry[] S = new GameEntry[5];
        for (int z = 0; z < S.length; z++) {
            S[z] = new GameEntry(z * 100);
        }

        GameEntry[] R = S.clone();

        S[4].setScore(550);

        System.out.println("Score value of GameEntry object referenced by B[4]: " + R[4].getScore());
    }
}
