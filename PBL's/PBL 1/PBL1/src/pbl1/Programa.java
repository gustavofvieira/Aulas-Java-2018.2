/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Calculadora de Frequência Cardíaca-alvo
P1 - Ao realizar exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua
frequência permanece dentro de um intervalo seguro, sugerido pelos seus treinadores e médicos. Segundo a
AMerican Heart Assossiation (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para
calcular a frequência cardíaca máxima por minuto é 220 menos sua idade. Sua frequência cardíaca alvo é um
intervalo entre 50 - 85% da frequência cardíaca máxima. [Nota: essas formulas são estimativas fornecidas pelo
AHA. As frequências cardíacas máximas e alvo podem variar com base na sua saúde, capacidade física, idade e
sexo da pessoa. Sempre consulte um médico ou profissional da saúde qualificado antes de começar ou
modificar um programa de exercícios físicos.

Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome e data de
nascimento da pessoa (Consistindo em atributos separados para mês, dia e ano de nascimento).
Sua classe deve ter um construtor que recebe esses dados como parâmetros. Para cada atributo forneça métodos
set e get. A Classe deve incluir um método que calcula e retorna a idade da pessoa (em anos), um método que
calcula e retorna frequência cardíaca máxima da pessoa e um método que calcula e retorna a frequência
cardíaca alvo da pessoa.
Escreva um aplicativo Java que solicite a informação da pessoa - calcule e imprima a idade da pessoa (em
anos), intervalo de frequência cardíaca máxima e frequência cardíaca-alvo. 
*/
package pbl1;

import javax.swing.JOptionPane;

/**
 *
 * @author ACQUA
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HeartRates pessoa = new HeartRates(JOptionPane.showInputDialog("Informe nome:"),JOptionPane.showInputDialog("Informe sobrenome: "),Integer.parseInt(JOptionPane.showInputDialog("Infome dia nasc: ")),Integer.parseInt(JOptionPane.showInputDialog("Infome mes nasc: ")),Integer.parseInt(JOptionPane.showInputDialog("Infome ano nasc: ")));
        System.out.println("nome: "+pessoa.getNome()+"\nsobrenome: "+pessoa.getSobreNome()+"\nData Nascimento: "+pessoa.getDiaNasc()+"-"+pessoa.getMesNasc()+"-"+pessoa.getAnoNasc());
        
        // TODO code application logic here
    }
    
}
