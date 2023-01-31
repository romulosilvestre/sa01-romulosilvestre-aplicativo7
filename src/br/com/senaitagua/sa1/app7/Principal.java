package br.com.senaitagua.sa1.app7;

import javax.swing.JOptionPane;
import  br.com.senaitagua.sa1.bo.EstoqueBO;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entrada de dados
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira peça"));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda peça"));
        double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira peça"));
        double p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta peça"));
        double p5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quinta peça"));
        
        //instânciar (sem IoC - Inversão de Controle)
        EstoqueBO ebo = new EstoqueBO();
        
        //chamar e mostrar (festaaaaa!!!!!!)
        JOptionPane.showMessageDialog(null, ebo.somarPecas(p1, p2, p3, p4, p5));
	}

}
