/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.fatec.poo;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Disciplina {
    String nome;
    String ementa;
    int ciclo;
    int nota;

    public Disciplina(String nome, String ementa, int ciclo) {
        this.nome = nome;
        this.ementa = ementa;
        this.ciclo = ciclo;
    }
    
    private static ArrayList<Disciplina> disciplina;
    
    public static ArrayList<Disciplina> getList(){
    
        if(disciplina==null){
        
            disciplina = new ArrayList<>();
            disciplina.add(new Disciplina("Gestão de Projetos","Definição de projeto segundo concepção difundida pelas melhores"
                    + " práticas de gestão de projetos. Histórico do desenvolvimento do conjunto de conhecimentos de gestão de "
                    + "projetos. Comparação ente o gerenciamento por projetos com o gerenciamento tradicional. O ciclo de vida "
                    + "de um projeto. Os fatores de sucesso e insucesso de projetos e sua mensuração. As nove de conhecimento "
                    + "para a gestão de projetos e seus processos : Integração, Escopo, Tempo, Custo, Qualidade, Recursos Humanos,"
                    + " Comunicações, Riscos e Aquisições.",5));
            disciplina.add(new Disciplina("Estágio Supervisionado em Análise e Desenvolvimento de Sistemas","Aplicar os "
                    + "conhecimentos teóricos adquiridos no curso de Análise e Desenvolvimento de Sistemas o em situações reais "
                    + "de desempenho da futura profissão. Realizar atividades práticas, relacionadas à Tecnologia em Análise e"
                    + " Desenvolvimento de Sistemas, desenvolvidas em ambientes profissionais, sob orientação e supervisão de um"
                    + " docente da Faculdade e um responsável no local de estágio. Equiparam-se ao estágio, as atividades de"
                    + " extensão, de monitorias, prática profissionais, iniciação científica e/ou desenvolvimento tecnológico e "
                    + "inovação* na educação superior, desenvolvidas pelo estudante com a devida apresentação de documentos "
                    + "inerentes ao processo. * As atividades de pesquisa aplicada desenvolvidas em projetos de Iniciação"
                    + " Científica e/ou Iniciação em Desenvolvimento Tecnológico e Inovação, se executadas, podem ser"
                    + " consideradas como Estágio Curricular, desde que sejam comprovadas, no mínimo, as cargas horárias totais "
                    + "respectivas a cada atividade respeitando as devidas formas de apresentação e documentos comprobatórios”."
                    ,5));
            disciplina.add(new Disciplina("Ética e Responsabilidade Profissional","Ética; comportamento profissional ético. "
                    + "Moral e Direito. Conceitos, princípios e normas de direito público e privado aplicados à atividade "
                    + "empresarial e ao exercício profissional; legislação de informática.",6));
            disciplina.add(new Disciplina("Laboratório de Banco de Dados (Escolha 1)","Tecnologias emergentes de mercado "
                    + "que serão aplicadas em laboratório",5));
            disciplina.add(new Disciplina("Laboratório de Engenharia de Software","Desenvolvimento de um software utilizando os "
                    + "conhecimentos adquiridos ao longo do curso. A elaboração deve abordar as disciplinas de requisitos,"
                    + " análise e projeto, implementação, implantação e gerência de projetos. O processo de desenvolvimento,"
                    + " assim como a técnica fica a critério de acordo entre professor e aluno.",5));
            disciplina.add(new Disciplina("Programação para Dispositivos Móveis","Ambientes de programação para dispositivos"
                    + " móveis. Emuladores. Interface gráfica, serviços baseados em localização, armazenamento de dados"
                    + " persistentes, serviços de telefonia e comunicação entre processos. Desenvolvimento de aplicações com "
                    + "J2ME.",5));
            disciplina.add(new Disciplina("Redes de Computadores","Comunicação de Dados. Topologia e Características Físicas de"
                    + " Redes. Redes Locais de Longa Distância. Redes de Alta Velocidade. Protocolos e Serviços de Comunicação."
                    + "Camadas de Sistemas Abertos. Sistemas Operacionais de Redes. Interconexão de redes. Avaliação de "
                    + "Desempenho. Estrutura e Funcionamento da Internet.",5));
            disciplina.add(new Disciplina("Trabalho de Graduação I","O estudante elaborará, sob a orientação de docente, um "
                    + "Trabalho de Graduação, e o apresentará perante uma banca examinadora. As disciplinas de Projetos deverão"
                    + " subsidiar o trabalho de graduação, com temas e propostas de projetos, casos, etc.",5));
            disciplina.add(new Disciplina("Programação Orientada a Objetos","Conceitos e evolução da tecnologia de orientação "
                    + "a objetos. Limitações e diferenças entre o paradigma da programação estruturada em relação à orientação"
                    + "a objetos. Conceito de objeto, classe, métodos, atributos, herança, polimorfismo, agregação, associação,"
                    + " dependência, encapsulamento, mensagem e suas respectivas notações na linguagem padrão de representação"
                    + " da orientação a objetos. Implementação de algoritmos orientado a objetos utilizando linguagens de "
                    + "programação. Aplicação e uso das estruturas fundamentais da orientação a objetos.",4));
        
        }
        
        return disciplina;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
