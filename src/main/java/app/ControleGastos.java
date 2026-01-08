package app;

import java.util.ArrayList;

public class ControleGastos {
    ArrayList<Registro> registros = new ArrayList<>();

    public void adicionarGasto(String descricao, double valor){
        Registro gasto = new Registro(descricao, valor, "SAÍDA");
        registros.add(gasto);
    }

    public void adicionarGanho(String descricao, double valor){
        Registro ganho = new Registro(descricao, valor, "ENTRADA");
        registros.add(ganho);
    }

    public void listarRegistros(){

        if (registros.isEmpty()){
            System.out.println("Nenhum registro encontrado");
            return;
        }

        System.out.println("\n==============================");
        System.out.println(" Registros: ");
        System.out.println("==============================");
        for (Registro r : registros) {
            System.out.println(
                "[" + r.tipo + "] " + r.descricao + " -R$ " + r.valor
            );
        }
    }
    public void mostrarSaldo(){
        double totalEntrada = 0;
        double totalSaida = 0;

        for (Registro r : registros) {
            if (r.tipo.equals("ENTRADA")){
                totalEntrada += r.valor;
            } else if (r.tipo.equals("SAÍDA")) {
                totalSaida += r.valor;
            }
        }

        double saldo = totalEntrada - totalSaida;

        System.out.println("\n==============================");
        System.out.println(" Saldo ");
        System.out.println("==============================");
        System.out.println("Total de Entradas: R$ " + totalEntrada);
        System.out.println("Total de Saídas: R$ " + totalSaida);
        System.out.println("Saldo Final: R$ " + saldo);
    }
}
