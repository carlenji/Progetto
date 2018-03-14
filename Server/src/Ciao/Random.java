package Ciao;

public class Random {
    public String genera(){
        String seq=new String();
        int rnd = (int) (10 * Math.random());
        seq = seq + rnd;
        for(int i=0;i<9;i++ ) {
            rnd = (int) (10 * Math.random());
            seq = seq + " " + rnd;
        }
        return  seq;

    }
}
