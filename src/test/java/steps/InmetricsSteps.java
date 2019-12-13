package steps;

import org.junit.Test;

import factory.WebDriverFactory;
import pageobject.InmetricsPage;

public class InmetricsSteps  extends WebDriverFactory{
	
	


	Hooks hs = new Hooks();
@Test
public void TesteInmetrics () throws InterruptedException {
	//Abrir o chrome e entrar no site da inmetrics
	hs.setUp();
	//Instanciar a Pagina da inmetrics onde fica os metodos com os elementos dos botões da pagina
    InmetricsPage inmetrics = new InmetricsPage();
    inmetrics
    .ClickBotãoCarreira()
    .ClickBotãoConfiraVagas();
	
	
}
}
