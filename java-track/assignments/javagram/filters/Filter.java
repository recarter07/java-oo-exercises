package javagram.filters;

// import picture
import javagram.Picture;

public interface Filter {

// process picture
	public Picture process(Picture original);
	
}

// this is only for all involved, if nothing else,
//   do this: process the imported picture