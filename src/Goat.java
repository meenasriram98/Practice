
public class Goat extends Animal implements ILocomotion {

	
	Goat(String name) {
		super(name);
	}

	@Override
	public String eats() {
		return "eats grass";
	}

	@Override
	protected String getSound() {		
		return "makes sound";
	}

	@Override
	public String getLocomotion() {
		return "walks";
	}

}
