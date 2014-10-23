import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMovieListWithEmptyList
{
	
	private MovieList movieList = null;
	
	@Before
	public void setUp() {
		movieList = new MovieList();
	}
	@Test
	public void Size() 
	{ 
		Assert.assertEquals("Size of empty movie list should be 0.", 0, movieList.size());
	}

}

