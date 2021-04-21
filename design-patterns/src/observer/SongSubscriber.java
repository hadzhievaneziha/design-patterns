package observer;

public class SongSubscriber implements Observer {
	private String name;
	private Observable song;
	
	public SongSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.song == null) {
			System.out.println(this.getName() + " has no song");
			return;
		}
		String latestSong = this.song.getUpdate();
		System.out.println(this.getName() + " received song: " + latestSong);
	}

	@Override
	public void setSong(Observable song) {
		this.song = song;
	}

	public String getName() {
		return name;
	}

}
