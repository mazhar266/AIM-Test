package net.authorize.util;


import junit.framework.Assert;
import net.authorize.data.creditcard.CardType;

import org.junit.Before;
import org.junit.Test;

public class LuhnTest {

	private String[] visaAccountNumbers = {"4111111111111111",
			"4222222222222",
			"4012888888881881"};
	private String[] masterCardAccountNumbers = {"5555555555554444",
			"5105105105105100"};
	private String[] americanExpressAccountNumbers = {"378282246310005",
			"371449635398431",
			"378734493671000"};
	private String[] discoverAccountNumbers = {"6011111111111117",
			"6011000990139424"};
	private String[] dinersClubAccountNumbers = {"30569309025904",
			"38520000023237"};
	private String[] jcbAccountNumbers = {"3530111333300000",
			"3566002020360505"};

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testVisa() {
		for(String cardNumber : visaAccountNumbers) {
			Assert.assertEquals(CardType.VISA, Luhn.getCardType(cardNumber));
		}
	}

	@Test
	public void testMasterCard() {
		for(String cardNumber : masterCardAccountNumbers) {
			Assert.assertEquals(CardType.MASTER_CARD, Luhn.getCardType(cardNumber));
		}
	}

	@Test
	public void testAmericanExpress() {
		for(String cardNumber : americanExpressAccountNumbers) {
			Assert.assertEquals(CardType.AMERICAN_EXPRESS, Luhn.getCardType(cardNumber));
		}
	}

	@Test
	public void testDiscover() {
		for(String cardNumber : discoverAccountNumbers) {
			Assert.assertEquals(CardType.DISCOVER, Luhn.getCardType(cardNumber));
		}
	}

	@Test
	public void testDinersClub() {
		for(String cardNumber : dinersClubAccountNumbers) {
			Assert.assertEquals(CardType.DINERS_CLUB, Luhn.getCardType(cardNumber));
		}
	}

	@Test
	public void testJCB() {
		for(String cardNumber : jcbAccountNumbers) {
			Assert.assertEquals(CardType.JCB, Luhn.getCardType(cardNumber));
		}
	}
}
