package widgets.base;

/**
 * The base class for all elements inside of a screenbuilder.
 */
public abstract class Component implements Fxmlify {
	public String getDisplayName() {
		
		return this.getClass().getSimpleName();
	}
}
