import java.sql.Array;
import java.util.ArrayList;


public class Main{

    public static void main(String[] args){

        int soldi;
        ContoCorrente conto = new ContoCorrente();



        conto.setSaldo(120);



        conto.preleva(100);

        conto.deposita(10);

        conto.preleva(1000);


        conto.getMovimenti();

        ArrayList<Integer> prova = new ArrayList<Integer>();

   /*     prova.add(121);
        prova.add(122);
        prova.remove(0);
        System.out.println(prova.get(0));
       for(int a: prova) {
            System.out.println(a);
        }*/
    }

}

/*STO IMPARANDO:
    1) Gli ArrayList aggiungono elementi direttamente alla fine, QUINDI quando ne rimuovo uno lui automaticamente aggiusta gli altri elementi da solo AD ESEMPIO:
        Movimenti è un Arraylist, ad ogni operazione aggiungo il movimento all'array, QUINDI quando supero il limite di 5 mi è sufficiente rimuovere il primo
        cosi da mantenerne l'ordine temporale.
* */