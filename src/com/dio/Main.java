import java.time.LocalDate;

import com.dio.Bootcamp;
import com.dio.Conteudo;
import com.dio.Curso;
import com.dio.Dev;
import com.dio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Curso curso3 = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev desenvolvedor1 = new Dev();
        Dev desenvolvedor2 = new Dev();

        desenvolvedor1.setNome("João");
        desenvolvedor2.setNome("Maria");

        curso1.setTitulo("Java para iniciantes");
        curso1.setDescricao("Curso de introdução a programação java");
        curso1.setCargaHoraria(15);

        curso2.setTitulo("Java intermediário");
        curso2.setDescricao("Avance no seu aprendizado java");
        curso2.setCargaHoraria(10);

        curso3.setTitulo("Java avançado");
        curso3.setDescricao("Aprenda as melhores práticas de programação java");
        curso3.setCargaHoraria(6);

        mentoria.setTitulo("Java turbo");
        mentoria.setDescricao("Lance até um foguete com programação Java");
        mentoria.setDataDeInicio(LocalDate.now());

        bootcamp.setName("Bootcamp X-Mobile");
        bootcamp.setDescription("Bootcamp de treinamento promovido pela empresa X-Mobile");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        desenvolvedor1.inscreverNoBootcamp(bootcamp);
        desenvolvedor1.progredir();

        System.out.println("Conteúdos inscritos: "+desenvolvedor1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: "+desenvolvedor1.getConteudosConcluidos());
        System.out.println("Calculo do XP: "+desenvolvedor1.calcularXp());

    }
}