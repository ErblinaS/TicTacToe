import javax.swing.JButton;
/*Klasa Game shikon X dhe O ne rreshta,kolona dhe diagonale*/
public class Game{
	String fituesi; //deklarimi per fituesin
	public boolean lojtariNje , lojtariDy; //deklarimi i lojtareve
   //konstruktori i Game i cili merr si parametra lojtaret
	public Game(boolean lojtariNje, boolean lojtariDy) {
		this.lojtariNje = lojtariNje;
		this.lojtariDy = lojtariDy;
	}

	public boolean eshteLojtariNje() {
		return lojtariNje;
	}
		
	public void caktoLojtariNje(boolean lojtariNje) {
		this.lojtariNje = lojtariNje;
	}
	
	public boolean eshteLojtariDy() {
		return lojtariDy;
	}
	
	public void caktoLojtariDy(boolean lojtariDy) {
		this.lojtariDy = lojtariDy;
	}
	// te gjitha opsionet e mundshme 
	public boolean operation(JButton[] button){
		if(	button[0].getText().equalsIgnoreCase("O") && 
				button[1].getText().equalsIgnoreCase("O")&&
				button[2].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("O") && 
				button[3].getText().equalsIgnoreCase("O") &&
				button[6].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[8].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(		button[1].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[7].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("O") && 
				button[5].getText().equalsIgnoreCase("O") &&
				button[8].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[6].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(		button[3].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[5].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(		button[6].getText().equalsIgnoreCase("O") && 
				button[7].getText().equalsIgnoreCase("O") &&
				button[8].getText().equalsIgnoreCase("O")){
					fituesi = "(O)";
					return true; 
		}
		if(button[0].getText().equalsIgnoreCase("X") && 
				button[1].getText().equalsIgnoreCase("X") &&
				button[2].getText().equalsIgnoreCase("X")){
					fituesi = "(X)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("X") && 
				button[3].getText().equalsIgnoreCase("X") &&
				button[6].getText().equalsIgnoreCase("X")){
					fituesi = "(X)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[8].getText().equalsIgnoreCase("X")){
					fituesi = "(X)";
					return true; 
		}
		if(		button[1].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[7].getText().equalsIgnoreCase("X")){
					fituesi = "(X)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("X") && 
				button[5].getText().equalsIgnoreCase("X") &&
				button[8].getText().equalsIgnoreCase("X")){
					fituesi = "(X)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[6].getText().equalsIgnoreCase("X")){
				
					fituesi = "(X)";
					return true; 
		}
		if(		button[3].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[5].getText().equalsIgnoreCase("X")){
					fituesi = "(X)";
					return true; 
		}
		if(		button[6].getText().equalsIgnoreCase("X") && 
				button[7].getText().equalsIgnoreCase("X") &&
				button[8].getText().equalsIgnoreCase("X")){
					fituesi = "(X)";
					return true; 
		}
		return false;
	}
	
}