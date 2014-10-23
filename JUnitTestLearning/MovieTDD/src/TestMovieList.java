import junit.framework.*;


public class TestMovieList extends TestCase 
{
	MovieList movieList;
	Movie starWars, starTrek, stargate;
	protected void setUp() 
	{
		 movieList = new MovieList();
		 starWars = new Movie("Star Wars");
		 starTrek = new Movie("Star Trek");
		 stargate = null;
	}

	
	
	public void testEmptyListSize() 
	{
		assertEquals("Size of empty movie list should be 0.", 0, movieList.size()); 
	}
	
	public void testSizeAfterAddingOne() 
	{
		 movieList.add(starWars);
		 assertEquals("Size of one item list should be 1.", 1, movieList.size());
	}
	
	public void testSizeAfterAddingTwo() 
	{
		 MovieList twoItemList = movieList;
		 twoItemList.add(starWars);
		 twoItemList.add(starTrek);
		 assertEquals("Size of a two item list should be 2.", 2, twoItemList.size());
	}
	
	public void testContents() 
	{
		 movieList.add(starWars);
		 movieList.add(starTrek);
		 assertTrue("List should contain starWars.", movieList.contains(starWars));
		 assertTrue("List should contain starTrek.", movieList.contains(starTrek));
		 assertFalse("List should not contain stargate.", movieList.contains(stargate));
	}

	 
	


	
	public static void main(String[] args) {
			junit.textui.TestRunner.run(TestMovieList.class);
	}
}