import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.err.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFranco = new Dev();
        devFranco.setNome("Franco");
        devFranco.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devFranco.getConteudosInscritos());
        devFranco.progredir();
        devFranco.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devFranco.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devFranco.getConteudosConcluidos());
        System.out.println("XP:" + devFranco.calcularTotalXP());


        System.out.println("----------");


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXP());
        

    }
}
