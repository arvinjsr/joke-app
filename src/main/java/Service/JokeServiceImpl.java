package Service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes)
	{
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
				}
	@Override
	public String GetJokes() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

	
}
