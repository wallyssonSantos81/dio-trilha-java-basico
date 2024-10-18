
package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate date;

    @Override
    public double calcular() {
        return XP_PADRAO + 20d;
    }
    
    public Mentoria() {
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" +getDescricao() +", date=" + date + "]";
    }

}
