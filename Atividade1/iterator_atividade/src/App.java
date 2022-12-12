import classes.VideoItem;
import classes.VideoIterator;
import interfaces.Iterator;

public class App {

	public static void main(String[] args) {
		VideoItem [] videoItens = new VideoItem[4];
		
		videoItens[0] = new VideoItem("Velozes e Furiosos", 15.5);
		videoItens[1] = new VideoItem("A Barraca do Beijo", 12.5);
		videoItens[2] = new VideoItem("Joao e Maria", 8.5);
		videoItens[3] = new VideoItem("Se beber nao case", 6.0);
		
		Iterator videoIterator = new VideoIterator(videoItens);
		
		while (videoIterator.hasNext()) {
			VideoItem videoItem = (VideoItem)videoIterator.next();
			System.out.println(videoItem.nome+" = R$ "+videoItem.preco);
		}
	}

}
