package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class createLabel {
	JLabel idLab;
	JLabel idPan;

	public void create() {
	idLab = new JLabel("I D : ", JLabel.CENTER);
	idPan= new JLabel();
	idPan.add(idLab);
		
	
	}
}
