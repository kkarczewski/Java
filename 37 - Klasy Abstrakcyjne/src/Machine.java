public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//deklaracja pustej metody jak w Interfejsach
	//cia�o w podklasach
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	public void run(){
		start();
		doStuff();
		shutdown();
	}
	
	
}
