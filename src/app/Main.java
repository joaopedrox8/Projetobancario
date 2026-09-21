package app;
import model.Despesa;
import java.time.LocalDate;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        ArrayList<Despesa> despesas = new ArrayList<>();

        despesas.add(new Despesa("Mercado", 250.00, LocalDate.of(2026, 9, 15), "alimentacao"));
        despesas.add(new Despesa("Internet", 100.00, LocalDate.of(2026, 9, 11), "contas"));
        despesas.add(new Despesa("Energia", 210.00, LocalDate.of(2026, 9, 12), "contas"));

        double total = 0;

        for(Despesa despesa : despesas){
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Valor: " +despesa.getValor());
            System.out.println("Data: " +despesa.getData());
            System.out.println("Categoria: " +despesa.getCategoria());
            total = total + despesa.getValor();

            System.out.println("Total: " + total);
        }


    }

}