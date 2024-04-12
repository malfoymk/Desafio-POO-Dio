import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {


    public static void main (String [] args){

            Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Curso de Java Ensinando POO");
            curso1.setCargaHoraria(12);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso JS");
            curso2.setDescricao("Curso pra Viadinho");
            curso2.setCargaHoraria(1);



            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria Java");
            mentoria.setDescricao("Ensinando POO");
            mentoria.setData(LocalDate.now());


            /*System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria1);
            System.out.println(mentoria2);*/

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("BootCamp Java Developer");
            bootcamp.setDescricao("BootCamp de Java");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devPatrick = new Dev();
            devPatrick.setNome("Patrick");
            devPatrick.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Incritos" + devPatrick.getConteudosInscritos());

            devPatrick.progedir();
            devPatrick.progedir();
            devPatrick.progedir();
            System.out.println("--");

            System.out.println("Conteúdos Incritos" + devPatrick.getConteudosInscritos());
            System.out.println("Conteúdos Concluidos" + devPatrick.getConteudosConcluidos());
            System.out.println("XP: " +devPatrick.calcularTotalXp());



            System.out.println("--------");


            Dev devCamila = new Dev();
            devCamila.setNome("Camila");
            devCamila.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Incritos" + devCamila.getConteudosInscritos());

            devCamila.progedir();
            devCamila.progedir();
            devCamila.progedir();
            System.out.println("--");
            System.out.println("Conteúdos Incritos" + devCamila.getConteudosInscritos());
            System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos());
            System.out.println("XP: " +devCamila.calcularTotalXp());

    }
}
