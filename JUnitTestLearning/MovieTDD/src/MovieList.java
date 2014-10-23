import javax.swing.DefaultListModel;


public class MovieList extends DefaultListModel<Movie>
{

	public MovieList()
	{
		super();
	}
	
	public void add(Movie name)
	{
		addElement(name);
	}
	
	public int size()
	{
		return getSize();
	}

}
