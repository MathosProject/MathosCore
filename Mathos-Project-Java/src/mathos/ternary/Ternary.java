package mathos.ternary;

/**
 * A class that simulates a ternary states (true - unknown - false).
 *
 * @author Artem Los (arteml@kth.se), Mathos Project.
 */
public enum Ternary {
	TRUE(1), 
	UNKNOWN(0),
	FALSE(-1);
	
	Ternary(int val) {}
	
	/**
	 * Converts a ternary object to a boolean (either "true" or "false"), without the "unknown" case.
	 * @return True if ternary==TRUE, and False otherwise.
	 */
	public boolean ToBoolean()
	{
		return this == TRUE;
	}
	
	/**
	 * Converts a boolean (either "true" or "false") to a ternary.
	 * @param value The boolean.
	 * @return An equivalent ternary.
	 */
	public static Ternary FromBoolean(boolean value)
	{
        return value ? TRUE : FALSE;
	}

	/**
	 * TRUE = 1,
	 * UNKNOWN = 0,
	 * FALSE = -1.
	 * @return Returns a number based on the current value.
	 */
	public Number GetNumber()
	{
		switch (this) {
		case TRUE:
			return 1;
		case UNKNOWN:
			return 0;
		case FALSE:
			return -1;
		default:
			//should never occur
			return -1;
		}
	}
	
	/**
	 * Compares two numbers ("A<B" operator) using ternary logic.
	 * @param numberA The first number.
	 * @param numberB The second number.
	 * @return Either true (numberA < numberB), unknown (numberA == numberB) or false (numberA > numberB).
	 */
	public Ternary LessThan(double numberA, double numberB)
	{
		if( numberA < numberB)
			return Ternary.TRUE;
		else if (numberA == numberB)
			return Ternary.UNKNOWN;
		else
			return Ternary.FALSE;
	}
	
	/**
	 * Compares two numbers ("A>B" operator) using ternary logic.
	 * @param numberA The first number.
	 * @param numberB The second number.
	 * @return Either true (numberA > numberB), unknown (numberA == numberB) or false (numberA < numberB).
	 */
	public Ternary GreaterThan(double numberA, double numberB)
	{
		if( numberA > numberB)
			return Ternary.TRUE;
		else if (numberA == numberB)
			return Ternary.UNKNOWN;
		else
			return Ternary.FALSE;
	}
	
	/**
	 * Performs the NOT (negation).
	 * @return TRUE -> FALSE, FALSE -> TRUE, UNKNOWN -> UNKNOWN.
	 */
	public Ternary Not()
	{
		switch(this)
		{
			case TRUE:
				return Ternary.FALSE;
			case FALSE:
				return Ternary.TRUE;
			default:
				//this is the case when val = 0.
				return Ternary.UNKNOWN;
		}
	}
	
	/**
	 * Performs the AND operation.
	 * @param secondParameter Second parameter to compare to
	 * @return TRUE and UNKNOWN -> UNKNOWN, FALSE and UNKNOWN -> FALSE, UNKNOWN and UNKNOWN -> UNKNOWN. In all other cases, usual boolean logic is applied.
	 */
	public Ternary And(Ternary secondParameter)
	{
		if(this == UNKNOWN || secondParameter == UNKNOWN)
		{
			if(this == TRUE || (this == UNKNOWN && secondParameter == TRUE))
				return UNKNOWN;
			else if(this == FALSE || (this == UNKNOWN && secondParameter == FALSE))
				return FALSE;
			else if (this == UNKNOWN && secondParameter == UNKNOWN)
				return UNKNOWN;
			else
				//this should never happen.
				return UNKNOWN;
		}
		else
            return Ternary.FromBoolean(this.ToBoolean() && secondParameter.ToBoolean());
	}
	
	/**
	 * Performs the OR operation.
	 * @param secondParameter Second parameter to compare to
	 * @return TRUE and UNKNOWN -> TRUE, FALSE and UNKNOWN -> UNKNOWN, UNKNOWN and UNKNOWN -> UNKNOWN. In all other cases, usual boolean logic is applied.
	 */
	public Ternary Or(Ternary secondParameter)
	{
		if(this == UNKNOWN || secondParameter == UNKNOWN)
		{
			if(this == TRUE || (this == UNKNOWN && secondParameter == TRUE))
				return TRUE;
			else if(this == FALSE || (this == UNKNOWN && secondParameter == FALSE))
				return UNKNOWN;
			else if (this == UNKNOWN && secondParameter == UNKNOWN)
				return UNKNOWN;
			else
				//this should never happen.
				return UNKNOWN;
		}
		else
            return Ternary.FromBoolean(this.ToBoolean() || secondParameter.ToBoolean());
	}
	
	/**
	 * Performs the XOR operation.
	 * @param secondParameter Second parameter to compare to
	 * @return TRUE and UNKNOWN -> UNKNOWN, FALSE and UNKNOWN -> UNKNOWN, UNKNOWN and UNKNOWN -> UNKNOWN. In all other cases, usual boolean logic is applied.
	 */
	public Ternary Xor(Ternary secondParameter)
	{
		if(this == UNKNOWN || secondParameter == UNKNOWN)
		{
			if(this == TRUE || (this == UNKNOWN && secondParameter == TRUE))
				return UNKNOWN;
			else if(this == FALSE || (this == UNKNOWN && secondParameter == FALSE))
				return UNKNOWN;
			else if (this == UNKNOWN && secondParameter == UNKNOWN)
				return UNKNOWN;
			else
				//this should never happen.
				return UNKNOWN;
		}
		else
            return Ternary.FromBoolean(this.ToBoolean() ^ secondParameter.ToBoolean());
	}
}
