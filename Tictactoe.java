import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

/*Klasa TicTacToe modelon nje grid 3x3 dhe lejon qe te luajne dy lojtare */

public class Tictactoe extends JFrame implements ActionListener{
	private JPanel boardPanel; //deklarimi i Panelit
	private JButton button[] = new JButton[9]; //deklarimi i butonave
	private JLabel tvResult; // deklarimi i Label
	private Game game; //deklarimi i klases Game
	private JButton Reset; //deklarimi i butonit reset
	private  int gameCount=0; //deklarimi i numerimit te klikimit te butonave
   //konstruktori i TicTacToe
	public Tictactoe(){
		inicializoButonat();
		shtoNePanel();
		shfaqTictactoe();
		this.add(boardPanel, BorderLayout.CENTER);
		this.add(tvResult, BorderLayout.SOUTH);
		this.add(Reset, BorderLayout.NORTH);
	}
	private void shfaqTictactoe() {    //Korniza e lojes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setTitle("Tic-Tac-Toe");
	}
      //bene inicializimin e butonave
	private void inicializoButonat(){	//Inicializon te gjitha objektet kryesore te lojes
		game = new Game(true, false);    //Inicializon gjendjen e tanishme te lojes
		boardPanel = new JPanel(); 
		boardPanel.setLayout(new GridLayout(3,3));
		tvResult = new JLabel();
		for (int i = 0; i < 9; i++) {                   //Shton nje varg te butonave
			button[i] = new JButton(""); 
			button[i].addActionListener(this);
	
   		}
		Reset = new JButton("Luani perseri"); 
      Reset.setBackground(Color.white);
      Reset.setForeground(Color.black);
		Reset.addActionListener(this);

	}
	//Shton te gjithe butonat ne loje
	private void shtoNePanel(){
		for (int i = 0; i < button.length; i++) {
		boardPanel.add(button[i]);
		}
	}
	public void actionPerformed(ActionEvent e){
   Color c=new Color(76,0,153);
      Color c1=new Color(153,0,153);
		for (int i = 0; i < button.length; i++) {  //Kontrollon butonin e kilkuar
			if(button[i]==e.getSource()){
				if(game.eshteLojtariNje()){
					button[i].setText("X");
               button[i].setBackground(c);
					game.caktoLojtariNje(false);
					game.caktoLojtariDy(true);
				}else{
					button[i].setText("O");
               button[i].setBackground(c1);
					game.caktoLojtariNje(true);
					game.caktoLojtariDy(false);
				}
				gameCount++;           //Numeron sa klikime/lojera jane luajtur
				button[i].setEnabled(false);     //pamundeson riklikimin e butonit te klikuar njehere
			}
		}

		Boolean fituesi = game.operation(button);    //Kontrollon nese dikush e ka fituar lojen
		if(fituesi){
         tvResult.setForeground(Color.black);
			tvResult.setText("Urime "+game.fituesi+" ka fituar lojen!!");
			for (int i = 0; i < button.length; i++) {
				button[i].setEnabled(false);
			}
		}else if(gameCount==9){
         tvResult.setForeground(Color.black);
			tvResult.setText("Barazim!... Provoni perseri");
		}
		if(e.getSource() == Reset){
			restartoLojen();
		}
	}
	public void restartoLojen(){
		for (int i = 0; i < button.length; i++) {
			button[i].setText("");
			button[i].setEnabled(true);
			button[i].setBackground(null);
		}
		tvResult.setText("");
		gameCount=0; 
	}
	public static void main(String[] args) {
		new Tictactoe();
	}
}