package observer;

public class ObserverMain {

	
	
	public static void main(String[] args) {


		Song song = new Song();
		
		Observer obs1 = new SongSubscriber("Obs 01");
		Observer obs2 = new SongSubscriber("Obs 02");
		Observer obs3 = new SongSubscriber("Obs 03");
		
		song.subscribe(obs1);
		song.subscribe(obs2);
		song.subscribe(obs3);
		
		
		song.setSong("Toosie Slide Drake");
		
		song.setSong("Azul J Balvin	");
		
		song.setSong("Come & Go (with Marshmello) Juice WRLD, Marshmello");
		

	}

}
