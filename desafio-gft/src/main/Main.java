package main;

import java.time.LocalDate;

import classes.Bootcamp;
import classes.Curso;
import classes.Dev;
import classes.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso MYQSL");
		curso1.setDescricao("Descri��o do curso MySql");
		curso1.setCargaHoraria(40);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JAVA");
		curso2.setDescricao("Descri��o do curso JAVA");
		curso2.setCargaHoraria(60);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria JPA");
		mentoria.setDescricao("Descri��o da mentoria JPA");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootaCamp GFT Java developer");
		bootcamp.setDescricao("Descri��o Java Developer da GFT");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVeras = new Dev();
		devVeras.setNome("Ant�nio Veras");
		devVeras.increverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos de Ant�nio Veras " + devVeras.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos de Ant�nio Veras " + devVeras.getConteudosConcluidos());
		System.out.println("XP: " + devVeras.calcularTotalXp());
		
		System.out.println("************************************");
		
		
	}

}
