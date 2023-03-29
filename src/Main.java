import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java inciante");
        curso1.setDescricao("Primeiros passos no Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java POO");
        curso2.setDescricao("Programação Orientada a objetos com JAVA");
        curso2.setCargahoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Avançando no Java");
        mentoria.setData(LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Imersão Java");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Felipe");
        dev1.inscreverBootCamp(bootCamp);

        System.out.println("Conteúdos Inscritos de Felipe" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();

        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos de Felipe" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Felipe" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXpTotal());

        System.out.println("----------------//------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Yamim");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos de Yasmim" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos de Yasmim" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Yasmim" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXpTotal());



    }


}
