
package com.jforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ParaCekmeSteps {

	int hesapAcilisMiktari;
	int cekilenParaMiktari;
	int yatırılanParaMiktari;

	@Given( "^Bankada şu kadar param var (\\d+)TRY$" )
	public void hesabimdakiPara( int hesapAcilisMiktari ) throws Throwable {
		this.hesapAcilisMiktari = hesapAcilisMiktari;
	}

	@When( "^(\\d+)TRY miktarında para çekersem$" )
	public void hesabimdanParaCek( int cekilenParaMiktari ) throws Throwable {
		this.cekilenParaMiktari = cekilenParaMiktari;
	}

	@When( "^(\\d+)TRY miktarında para yatırılırsa$" )
	public void tryMiktarındaParaYatırırsam( int yatırılanParaMiktari ) throws Throwable {
		this.yatırılanParaMiktari = yatırılanParaMiktari;
	}

	@Then( "^Hesabımda da kalan miktarında bu olması beklerim : (\\d+)TRY$" )
	public void hesabımdaDaKalanMiktarındaBuOlmasıBeklerimTRY( int hesabimdaKalan ) throws Throwable {
		int kalanMiktar = hesapAcilisMiktari - cekilenParaMiktari;
		Assert.assertEquals(kalanMiktar, hesabimdaKalan);
	}

}
