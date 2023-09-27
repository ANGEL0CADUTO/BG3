
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ContoCorrente {

    //Dichiarazione ATTRIBUTI
    private int saldo;
    private ArrayList<Integer> movimenti;

    //COSTRUTTORI (il primo è il costruttore di DEFAULT, cioè quando apro un conto senza passargli nessun argomento, l'altro è se gli passo il saldo)
    public ContoCorrente(){
        this.movimenti = new ArrayList<Integer>(); //lui DEVE essere inizializzato altrimenti darà errore nella funzione getMovimenti, siccome potrebbe essere NULL
    }
    public ContoCorrente(int saldo){

        this.saldo = saldo;
        this.movimenti = new ArrayList<Integer>();
    }


    //GET e SET (si fanno (credo)SEMPRE, se crei degli oggetti con dei valori, devi esserne in grado di cambiarne il valore e di prenderlo
    public int getSaldo(){
        return this.saldo;
    }
    public void setSaldo(int saldo){

        this.saldo = saldo;

    }

    public void getMovimenti() {

        String descrizione;
        int contatore = 1;

        if(movimenti.size() == 0){
            System.out.println("Non sono state ancora effettuate operazioni");
        }
        else {
            for (int a : movimenti) {
                descrizione = String.format("Numero:  %d  Valore: %d ",contatore,a); //utile per formattare le stringhe in maniera carina, ce ne sono diversi, io ho utilizzato questo perchè è praticamente uguale a C
                System.out.println(descrizione);
                contatore++;
            }
        }

    }

    //METODI non banali
    public void preleva(int soldi){
        if(soldi > this.saldo){
            System.out.println("Mi spiace comunicarti che sei povero");
        }
        else{
            this.saldo = this.saldo - soldi;
            System.out.println("Prelievo effettuato con successo");
        }

        if(movimenti.size() < 5){
            movimenti.add(-soldi);
        }
        else{
            movimenti.remove(0);
            movimenti.add(-soldi);
        }


    }

    public void deposita(int soldi){
        this.saldo = this.saldo + soldi;
        System.out.println("Deposito effettuato con successo");
        if(movimenti.size() < 5){
            movimenti.add(soldi);
        }
        else{
            movimenti.remove(0);
            movimenti.add(soldi);

        }
    }

}
