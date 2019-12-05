public class helloWorld{
		public static void main (String args []){
			System.out.println("Hello Dunia");
			mobil bmw = new mobil();//kita bangun object mobil bmw
			bmw.merk = "BMW i3000";
			bmw.maju();
			
			mobil fordShelby = new mobil();
			fordShelby.merk = "Ford Mustang Shelby";
			fordShelby.maju();
		}
}

class mobil{
	//atribut
	public String merk;
	//methode
	public void maju(){
		System.out.println("Mobil "+this.merk+" Maju!!!! pfftt....");
	}
}