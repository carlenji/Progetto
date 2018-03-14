package Ciao;
import java.net.*;
import java.io.*;
import java.util.*;
//import java.lang.String;

public class EchoServerClientHandler implements Runnable {
        private Socket socket;
        Login ciccio = new Login();
        Random valori = new Random();

        public EchoServerClientHandler(Socket socket, Login prova) {
            this.socket = socket;
            this.ciccio=prova;
        }
        public void run() {
            try {
                    Scanner in = new Scanner(socket.getInputStream());
                    String line = in.nextLine();        //devo leggere login
                    String user = in.nextLine();          //leggo user
                    System.out.println(user);   //STAMPO USER
                    String psw = in.nextLine();     //leggo psw
                    System.out.println(psw);      //STAMPO PSW
                    PrintWriter out = new PrintWriter(socket.getOutputStream());
                    System.out.println("aaa");





                    out.println(ciccio.verifica(user, psw));
                    out.flush();
                    String sel = in.nextLine();
                    String seq = new String();
                    int num=0;
                    while(true) {
                        if (sel.equals("partita")) {
                            do {
                                seq = valori.genera();
                                out.println(seq + " la sequenza");
                                out.flush();
                                sel = in.nextLine();
                                System.out.println(sel.equals(seq));
                                out.flush();
                                out.println(sel.equals(seq));
                                out.flush();
                                if(sel.equals(seq))
                                    num=num+1;
                            }while(sel.equals(seq));
                            ciccio.modifica(user,num);

                        }else if(sel.equals("record")){

                        }
                    }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }
