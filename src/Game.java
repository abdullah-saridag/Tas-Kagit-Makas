import java.util.Random;
public class Game {
    String t = "Taş";
    String m = "Makas";
    String k = "Kağıt";
    String Player1;
    String Player2;
    void Player1 (){
        Random random = new Random();
        int randomSeçim = random.nextInt(3);
        if(randomSeçim == 0  ){
            Player1 = t;
        }
        else if (randomSeçim == 2){
            Player1 = k;
        }
        else {
            Player1 = m;
        }

    }
    void Player2 (){
        Random random = new Random();
        int randomSeçim = random.nextInt(3);
        if(randomSeçim == 0  ){
            Player2 = t;
        }
        else if (randomSeçim == 2){
            Player2 = k;
        }
        else {
            Player2 = m;
        }

    }

    void game(){

        int score1 = 0;
        int score2 = 0;
        while (score1 < 3 && score2 < 3) {
            Player1();
            Player2();
            if(Player1.equals(t) && Player2.equals(k) ){
                System.out.println("Player1 Taş , Player2 Kağıt ");
                System.out.println("Player 2 Kazandı");
                score2 ++;
            } else if (Player1.equals(k) && Player2.equals(t)) {
                System.out.println("Player1 Kağıt , Player2 Taş");
                System.out.println("Player 1 Kazandı");
                score1 ++;
            } else if (Player1.equals(m)&& Player2.equals(k)) {
                System.out.println("Player1 Makas , Player2 Kağıt");
                System.out.println("Player 1 Kazandı");
                score1 ++;
            }else if (Player1.equals(t)&& Player2.equals(m)){
                System.out.println("Player1 Taş , Player2 Makas");
                System.out.println("Player 1 Kazandı");
                score1 ++;
            }else if (Player1.equals(k)&& Player2.equals(m)){
                System.out.println("Player1 Kağıt , Player2 Makas");
                System.out.println("Player 2 Kazandı");
                score2 ++;
            }else if (Player1.equals(m)&& Player2.equals(t)){
                System.out.println("Player1 Makas , Player2 Taş");
                System.out.println("Player 2 Kazandı");
                score2 ++;
            }else {
                System.out.println("Bu raund berabere");
            }
            System.out.println("Score 1: " + score1);
            System.out.println("Score 2: " + score2);
        }
        if (score1 == 3){
            System.out.println("Player1 oyunu kazandı");
        } else {
            System.out.println("Player2 oyunu kazandı");
        }

    }
}
