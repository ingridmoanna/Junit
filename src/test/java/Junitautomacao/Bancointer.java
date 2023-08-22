package Junitautomacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		//comando para apontar o drive no navegador
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//comando para indicar o meu driver instanciado
		driver = new ChromeDriver();
		// comando para maximizar a tela 
		driver.manage().window().maximize();
		//comando abaixo é para indicar o site que quero que seja aberto 
		driver.get("https://inter.co/");
		//comando para indicar o elemento a ter interação
		driver.findElement(By.cssSelector
			("#gatsby-focus-wrapper > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void validacaodoTextoFormulario() throws InterruptedException {
	String texto;	
	Thread.sleep(10000);
	texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div.col-12.text-center.py-4.pt-lg-0 > h2")).getText();
	System.out.println(texto);
	assertEquals("Abra agora sua Conta Digital", texto);
	}

}
