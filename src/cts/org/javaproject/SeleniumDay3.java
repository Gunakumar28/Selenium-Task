package cts.org.javaproject;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDay3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Task1
	/*	driver.navigate().to("https://www.amazon.in/");
	
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtbox.sendKeys("iphone");
		
	    WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    btn.click();    */
		//task2
		
	/*	driver.get("https://www.facebook.com/");
		
		WebElement txtboxemail = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[1]"));
	    txtboxemail.sendKeys("ram12");
	    
	    WebElement txtpass = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]"));
	    txtpass.sendKeys("halal");
	    
	    WebElement btnclick = driver.findElement(By.xpath("//button[@value='1']"));
	    btnclick.click();
		*/
		
		//task3
		
	/*	driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtfirstname.sendKeys("ramG");
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	     txtlastname.sendKeys("kumar");
	     WebElement txtboxaddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
	     txtboxaddress.sendKeys("no.2,thoraipakkam,chennai");
	     WebElement txtboxemail = driver.findElement(By.xpath("//input[@type='email']"));
	     txtboxemail.sendKeys("gnakmar12@gmail.com");
	     WebElement txtphone = driver.findElement(By.xpath("//input[@type='tel']"));
	     txtphone.sendKeys("7339234846");
	     WebElement btngender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	     btngender.click();
	     WebElement btnhoppiies = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	     btnhoppiies.click();
	     WebElement txtboxlangage = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
	     txtboxlangage.click();
	     WebElement btnlangages = driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[1]"));
	     btnlangages.click();
	     WebElement txtboxskills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
	     txtboxskills.sendKeys("java");                                   */
		
		//task5
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btninterviewqestion = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		btninterviewqestion.click();
		
		WebElement btnctsclick = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		btnctsclick.click();                   */
	//task6
		/*
		driver.get(" https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement btnlogin = driver.findElement(By.xpath("//div[@id='signin-block']"));
		btnlogin.click();
		WebElement btnsignp = driver.findElement(By.xpath("(//ul[@class='config-list'])[1]]"));
		btnsignp.click();            */
		
		//task7
	/*	driver.get("https://www.cleartrip.com/trains");
		WebElement txtboxfrom = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtboxfrom.sendKeys("kumbakonam");
		
		WebElement txtboxto = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtboxto.sendKeys("chennai");
		
		WebElement btnsearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnsearch.click();                  */
		
		//task8
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnmodelresume = driver.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));
		btnmodelresume.click();
		
		WebElement btnmodelresme1 = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
	     btnmodelresme1.click();               */
		
		
		//task9
	/*	driver.get("https://www.flipkart.com/");
		WebElement txtboxemail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    txtboxemail.sendKeys("prathap12");
	    WebElement txtboxpass = driver.findElement(By.xpath("(//input[@type='password'])"));
	    txtboxpass.sendKeys("9677445588");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])"));
		btnlogin.click();          */
		
		
		//task10
	/*	driver.get("https://www.amazon.in/");
		WebElement btnmobile = driver.findElement(By.xpath("// a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
		btnmobile.click();
		WebElement btnclick = driver.findElement(By.xpath("//img[@alt='OP8T']"));
		btnclick.click();                     */
		
		//task11
	/*	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtboxfirstname = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		txtboxfirstname.sendKeys("rajini");
		
		WebElement txtboxlastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtboxlastname.sendKeys("dass");
		
		WebElement txtboxemail = driver.findElement(By.xpath("(//input[@type='email'])"));
		txtboxemail.sendKeys("rajinidass12@gmail.com");
		
		WebElement txtpass = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]"));
		txtpass.sendKeys("leen555");
		
		WebElement txtconfmpass = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]"));
		txtconfmpass.sendKeys("leen555");
		
		WebElement btnshowpass = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
		btnshowpass.click();
		
		WebElement btnnext = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]"));
		btnnext.click();                */
		
		//tassk12
	/*	driver.get("https://www.snapdeal.com/");
		WebElement btnsignin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		 btnsignin.click();                  */
		
		//task13
	/*	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	  	WebElement txtboxmobilenmber = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtboxmobilenmber.sendKeys("+919565845844");
		
		WebElement btnlogin = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnlogin.click();                    */
		
		
		//task14
	/*	driver.get(" https://www.swiggy.com/");
		WebElement btnsignin = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnsignin.click();
		
		WebElement txtboxphno = driver.findElement(By.xpath("(//input[@class='_381fS'])[1]"));
		txtboxphno.sendKeys("9677885544");
		
		WebElement txtboxname = driver.findElement(By.xpath("(//input[@class='_381fS'])[2]"));
		txtboxname.sendKeys("rajini");
		
		WebElement txtboxemailcom = driver.findElement(By.xpath("(//input[@class='_381fS'])[3]"));
		txtboxemailcom.sendKeys("rajanikhan12");
		
		WebElement txtboxpass = driver.findElement(By.xpath("(//input[@class='_381fS'])[4]"));
		txtboxpass.sendKeys("rajani12");
		

		WebElement btncontinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btncontinue.click();                                                                                */
		
		//day 4 task 1 Print Greens Technologys Software Training Centers in Chennai
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement txtGreens = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		String text = txtGreens.getText();
		System.out.println(text);    */
		//task 2 Print paragaraph starts with vel murugan.
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnTrainer = driver.findElement(By.id("home-tab"));
		btnTrainer.click();
		
		WebElement txtVel = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan')][2]"));
		String textParagraph = txtVel.getText();
		System.out.println(textParagraph);*/
		
		//task 3  Print the adayar branch address
		/*driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtAddress = driver.findElement(By.xpath("(//ul[@class='address'])[1]"));
		String txt = txtAddress.getText();
		System.out.println(txt);*/
		
		//task 4 Print the omr branch address
		/*  driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtAddress = driver.findElement(By.xpath("(//ul[@class='address'])[2]"));
		String txt = txtAddress.getText();
		System.out.println(txt);            */
		
		//tassk 5 Print the paragraph starts with Greens Technology
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement txtpara = driver.findElement(By.xpath("//p[contains(text(),'is a leading Training and Placements company in Chennai')]"));
		String txtgreens = txtpara.getText();
		System.out.println(txtgreens);        */
		//driver.quit();

		//task6 Print the email and password which was entered by user
	/*	driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("rajini");
		String txtFbEmail = txtEmail.getAttribute("value");
		System.out.println(txtFbEmail);
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("454454");
		String txtFbPass = txtPass.getAttribute("value");
		System.out.println(txtFbPass);                    */
		
		//tassk 7 Search greens velmurugan and click the 1st link.
	/*	driver.get("http://www.google.com/");
		WebElement txtgoogle = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txtgoogle.sendKeys("greens velmurugan",Keys.ENTER);
		WebElement btngreenslink = driver.findElement(By.xpath("(//div[@class='dbg0pd'])[1]"));
		btngreenslink.click();                */
		
		//Task 8 Print the UserName and Password that you are entered.
	/*	driver.get(" http://adactinhotelapp.com/");
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='username']"));
		txtusername.sendKeys("ragahavan");
		String txtname = txtusername.getAttribute("value");
		System.out.println(txtname);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("123*564");
		String textpass = txtpassword.getAttribute("value");
		System.out.println(textpass);                                                 */
		
		//Task9 Search any product and click 1st product
	/*	driver.get("https://www.snapdeal.com/");
		WebElement txtboxsnapdeal = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		txtboxsnapdeal.sendKeys("mobile",Keys.ENTER);
		WebElement link1 = driver.findElement(By.xpath("//p[@title='VOTO V3 ( 16GB , 2 GB ) Rose Gold']"));
		link1.click();                                                 */
		
		//task10  Search any product and click 1st product
	/*	driver.get("https://www.flipkart.com/");
		WebElement btnExit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnExit.click();
		WebElement txtSearchbox = driver.findElement(By.xpath("//input[@name='q']"));
		txtSearchbox.sendKeys("mac book",Keys.ENTER);
		WebElement btnFirstlink = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		btnFirstlink.click();                                                                                        */
		
		//Task 11
	/*	driver.get("https://www.flipkart.com/");
		WebElement txtEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtEmail.sendKeys("rajinikhan");
		String txtboxEmail = txtEmail.getAttribute("value");
		System.out.println(txtboxEmail);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("789456");
		String textbox = txtPassword.getAttribute("value");
		System.out.println(textbox);
		WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnlogin.click();                                                                                                */
		
		//task12
		/*driver.get("https://www.shopclues.com/wholesale.html");
		WebElement txtsearchbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		txtsearchbox.sendKeys("addidas shoes",Keys.ENTER);
		WebElement btnfirstlink = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/adidas-shark-boost-running-and-training-shoes-grey-150759127.html']"));
		btnfirstlink.click();*/
		   
		
		//day5 //task01
     /*   driver.get("http://demo.guru99.com/test/drag_drop.html");
	    driver.manage().window().maximize();
	    WebElement txtbank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	    Actions acc = new Actions(driver);
	    WebElement desigination = driver.findElement(By.xpath("//ol[@id='bank']"));
	    acc.dragAndDrop(txtbank, desigination).perform();
	    
	    WebElement txtamount = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement desgi = driver.findElement(By.xpath("//ol[@id='amt7']"));
		Actions dep = new Actions(driver);
		dep.dragAndDrop(txtamount, desgi ).perform();  
		
		WebElement txtsales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement destxt = driver.findElement(By.id("loan"));
		Actions sale= new Actions(driver);
		sale.dragAndDrop(txtsales, destxt);
		
		WebElement txtamt = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement desgntn = driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions desg =new Actions(driver);
		desg.dragAndDrop(txtamt, desgntn).perform();                             */            
		
		//task2
/*		driver.get("http://www.amazon.in");
		WebElement btnprime = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		Actions b = new Actions(driver);
	    b.moveToElement(btnprime).perform();
	    
	    WebElement btnpop = driver.findElement(By.xpath("//a[@href='/prime?ref=in-pr-tryprime-unrec-multi-benefit']"));
	    btnpop.click();           */
		
		//task3
	/*	driver.get( "http://www.flipkart.com");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		WebElement homemouseover = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions c = new Actions(driver);
		c.moveToElement(homemouseover).perform();;
		
		Thread.sleep(3000);
		WebElement btnhomefur = driver.findElement(By.xpath("//a[@href='/home-furnishing/bath-linen/bath-towels/pr?sid=jra,jk3,wtg&marketplace=FLIPKART&otracker=nmenu_sub_Home%20%26%20Furniture_0_Bath%20Towels']"));
		btnhomefur.click();
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.xpath("//h1[text()='Bath Towels']"));
		String txtbath = txt.getText();
		System.out.println(txtbath);                                                */
		
		//task5
	/*	driver.get("https://www.shopclues.com/wholesale.html");
		WebElement btnspots = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	    Actions a= new Actions(driver);
	    a.moveToElement(btnspots).perform();
	    Thread.sleep(3000);
	    WebElement btnweight = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/nutrition-whey-protein.html?sort_by=bestsellers&sort_order=desc']"));
	    btnweight.click();              */
		
		//task6
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement txtclick = driver.findElement(By.xpath("//span[@class='fas fa-caret-down']"));
		
		Actions c = new Actions(driver);
		c.moveToElement(txtclick).perform();
		WebElement txtmouse = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		c.moveToElement(txtmouse).perform();
		WebElement seleniumclick = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		seleniumclick.click();                                              */
		
		//task7
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtclick = driver.findElement(By.xpath("//span[@class='fas fa-caret-down']"));
		
		Actions c = new Actions(driver);
		c.moveToElement(txtclick).perform();
		WebElement txtmouse = driver.findElement(By.xpath("//div[@title='Oracle']"));
		c.moveToElement(txtmouse).perform();
		WebElement oracleclick = driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/oracle-sql-plsql-training-in-chennai.html']"));
		oracleclick.click();                                             */
		
		//task8
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtclick = driver.findElement(By.xpath("//span[@class='fas fa-caret-down']"));
		Actions d = new Actions(driver);
		d.moveToElement(txtclick).perform();
		WebElement txtware = driver.findElement(By.xpath("(//div[@class='tonclickopen main-cat menu-item'])[8]"));
		d.moveToElement(txtware).perform();                                       */
		
		//task9
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtclick = driver.findElement(By.xpath("//span[@class='fas fa-caret-down']"));
		Actions d = new Actions(driver);
		d.moveToElement(txtclick).perform();
		WebElement txtRPA = driver.findElement(By.xpath("(//div[@class='tonclickopen main-cat menu-item'])[4]"));
		d.moveToElement(txtRPA).perform();
		WebElement btnclick = driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/blue-prism-training.html']"));
		btnclick.click();                                                */
		
		//task 10
	/*	driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement clickalldept = driver.findElement(By.xpath("//a[@href='//www.homedepot.com/c/site_map']"));
		Actions n = new Actions(driver);
		n.moveToElement(clickalldept).build().perform();
		WebElement clkheatandcool = driver.findElement(By.xpath("(//a[@data-level='Heating & Cooling'])[1]"));
		n.moveToElement(clkheatandcool).perform();
		WebElement clk = driver.findElement(By.xpath("//a[@href='//www.homedepot.com/b/Heating-Venting-Cooling-Air-Conditioners/N-5yc1vZc4me']"));
		n.moveToElement(clk).perform();
		WebElement btnclk = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		btnclk.click();                                                              */
		
		//task 11
	/*	driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement clickalldept = driver.findElement(By.xpath("//a[@href='//www.homedepot.com/c/site_map']"));
		Actions n = new Actions(driver);
		n.moveToElement(clickalldept).build().perform();
		Thread.sleep(2000);
		WebElement mouseover = driver.findElement(By.xpath("(//a[@href='//www.homedepot.com/b/Paint/N-5yc1vZar2d?cm_sp=d-flyout-Paint'])[1]"));
		n.moveToElement(mouseover).perform();
		WebElement mouseoverpaint = driver.findElement(By.xpath("//a[@href='//www.homedepot.com/b/Paint-Interior-Paint/N-5yc1vZbbbp']"));
		n.moveToElement(mouseoverpaint).perform();
		Thread.sleep(2000);
		WebElement btnclk = driver.findElement(By.xpath("//a[@href='//www.homedepot.com/b/Paint-Interior-Paint-Ceiling-Paint/N-5yc1vZbbbv']"));
		btnclk.click();                                                                        */
		
		//task13
	/*	driver.get("https://www.snapdeal.com/");
		WebElement snapdealmouse = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions c = new Actions(driver);
		c.moveToElement(snapdealmouse).perform();
		Thread.sleep(3000);
		WebElement btnclick = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/products/mobiles-cases-covers?q=Occasion_s%3ANewlaunch%7C&sort=plrty']"));
		btnclick.click();                                              */
		
		//task14
/*		driver.get("https://www.snapdeal.com/");
		WebElement snapdealmouse = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		Actions c = new Actions(driver);
		c.moveToElement(snapdealmouse).perform();
		Thread.sleep(3000);
		WebElement btnclick = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/products/womens-footwear-heeled-slipon-pump']"));
		btnclick.click();                                                 */
		
		//task15
	/*	driver.get("https://www.amazon.in/");
		WebElement mouseamazon = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions z = new Actions(driver);
		z.moveToElement(mouseamazon).perform();
		WebElement btncllk = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		btncllk.click();
		WebElement txtbox = driver.findElement(By.xpath("//input[@id='ap_email']"));
		txtbox.sendKeys("rajinikhan@123");               */
		
		//task16
	/*	driver.get("https://www.flipkart.com/");
		WebElement btnexit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        btnexit.click();
        Thread.sleep(2000);
		WebElement mouseflipkart = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions v= new Actions(driver);
		v.moveToElement(mouseflipkart).perform();
		Thread.sleep(2000);
		WebElement btnclk = driver.findElement(By.xpath("//a[@title='Flats']"));
		btnclk.click();                                                                     */
		
		//task17
	/*	driver.get("https://www.flipkart.com/");
		WebElement btnexit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        btnexit.click();
        WebElement mouseover = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
        Actions o = new Actions(driver);
        o.moveToElement(mouseover).perform();
        Thread.sleep(2000);
        WebElement btntoys = driver.findElement(By.xpath("//a[@href='/toys/remote-control-toys/pr?sid=mgl,56m&otracker=nmenu_sub_Baby%20%26%20Kids_0_Remote%20Control%20Toys']"));
        btntoys.click();                                                 */
		
		//task18
	/*	driver.get("https://www.flipkart.com/");
		WebElement btnexit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        btnexit.click();
        WebElement mouseelectronic = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions p = new Actions(driver);
		p.moveToElement(mouseelectronic).perform();
		Thread.sleep(2000);
		WebElement btnrealme = driver.findElement(By.xpath("//a[@title='Realme']"));
        btnrealme.click();
        Thread.sleep(2000);
        WebElement btnclicking = driver.findElement(By.xpath("//div[text()='Realme C12 (Power Blue, 32 GB)']"));
        btnclicking.click();                                                    */
		
		//task19
	/*	driver.get("https://www.flipkart.com/");
		WebElement btnexit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        btnexit.click();
        WebElement mouseelectronic = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions p = new Actions(driver);
		p.moveToElement(mouseelectronic).perform();
		Thread.sleep(2000);
		WebElement btnrealme = driver.findElement(By.xpath("//a[@href='/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']"));
        btnrealme.click();
        Thread.sleep(2000);
        WebElement btnclicking = driver.findElement(By.xpath("//div[text()='Redmi 9 Prime (Space Blue, 64 GB)']"));
        btnclicking.click();                                                         */
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
