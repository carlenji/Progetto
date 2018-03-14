package Ciao;
import java.util.ArrayList;

public class Login {
    ArrayList<String> user = new ArrayList<String>();
    ArrayList<String> pass = new ArrayList<String>();
    ArrayList<Integer> rec = new ArrayList<Integer>();


    public boolean verifica(String us, String ps){
        int i;
        int j=0;
        Integer num=new Integer(0);


        i=user.indexOf(us);
        if(i==-1){
            System.out.println(i);
            user.add(us);
            System.out.println(user.get(0) + "aa");
            pass.add(ps);
            rec.add(num);
            j=1;
            return true;

        }
        else{
            if(pass.get(i).equals(ps)){
                return true;
            }
            else;
                return false;
        }

    }
    public void modifica (String us, int num){
        int i=user.indexOf(us);
        if(rec.get(i)<num)
            rec.set(i,num);
    }
    public void printRecord(){
        int i=0;
        while(user.get(i)!=null){

        }
    }
}
