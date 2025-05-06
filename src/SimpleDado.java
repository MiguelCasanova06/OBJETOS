
public class SimpleDado {

	private int num;
	
	public void tirar() {
		num = (int)(Math.random()*6) +1;
		System.out.println("Ha salido el número  " + num);
	}
	
	public int getUltimaTirada() {
		return num;
	}
	
	public SimpleDado() {
		this.num = 0;
	}
}
