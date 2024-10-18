import java.time.LocalDate;
import java.util.ArrayList;

import br.com.dio.desafio.Conteudo;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        System.out.println();
        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" Descrição curso Java");
        curso1.setCargaHoraria( 8);

        Curso curso2 = new Curso();
        System.out.println();
        curso2.setTitulo(" Curso Js");
        curso2.setDescricao(" Descrição curso Js");
        curso2.setCargaHoraria( 4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo(" Mentoria Java");
        mentoria1.setDescricao(" Descrição mentoria Java");
        mentoria1.setDate(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo(" Mentoria Js");
        mentoria2.setDescricao(" Descrição mentoria Js");
        mentoria2.setDate(LocalDate.now());

        /*System.out.println();
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println();
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println();*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Java Developer ");
        bootcamp.setDescricao(" Descrição Bootcamp Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("------------------");

        Dev devWallisson = new Dev();
        devWallisson.setNome(" Wallisson ");
        devWallisson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscrito Wallisson:"+ devWallisson.getConteudosInscritos());
        devWallisson.progredir();
        devWallisson.progredir();
        devWallisson.progredir();
        System.out.println("----");
        System.out.println("Conteudos inscrito Wallisson:"+ devWallisson.getConteudosInscritos());
        System.out.println("Conteudos concluidos Wallisson:"+devWallisson.getConteudosConcluidos());
        System.out.println("XP:"+devWallisson.calcularTotalXp());


        System.out.println("---------------");

        Dev devSophia = new Dev();
        devSophia.setNome(" Sophia ");
        devSophia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscrito Sophia:"+ devSophia.getConteudosInscritos());
        devSophia.progredir();
        devSophia.progredir();
        System.out.println("----");
        System.out.println("Conteudo inscrito Sophia:"+ devSophia.getConteudosInscritos());
        System.out.println("Conteudos concluidos Sophia:"+devSophia.getConteudosConcluidos());
        System.out.println("XP:"+devSophia.calcularTotalXp());


    }
}
