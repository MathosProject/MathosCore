package tests;

import org.junit.Assert;
import mathos.ternary.Ternary;
import org.junit.Test;

public class TernaryTest {

    @Test
	public void NotTest() {
		Assert.assertEquals(Ternary.FALSE , Ternary.TRUE.Not());
	}

    @Test
	public void AndTest() {
        Assert.assertEquals(Ternary.UNKNOWN, Ternary.TRUE.And(Ternary.UNKNOWN));
    }
}
