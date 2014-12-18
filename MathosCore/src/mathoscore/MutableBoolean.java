package mathoscore;

/**
 * A class that simulates a mutable boolean.
 *
 */
public class MutableBoolean {

	private boolean bool;
	
	/**
	 * Initialises a new MutableBoolean with the value "false".
	 */
	public MutableBoolean()
	{
		bool = false;
	}
	
	/**
	 * Initialises a new MutableBoolean
	 * @param bool The value of the boolean: true or false.
	 */
	public MutableBoolean(boolean bool)
	{
		this.bool = bool;
	}
	
	/**
	 * Gets the value of the bool.
	 * @return Either true or false.
	 */
	public boolean getValue()
	{
		return bool;
	}
	
	/**
	 * Sets a new value for the bool.
	 * @param newBool
	 */
	public void setValue(boolean newBool)
	{
		bool = newBool;
	}
	
	
	
}