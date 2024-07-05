package locaters;


public class xpath  {
	
	
	
//	public String  URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public String  loginemail = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
	public String  loginpassword = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
	public String  loginbutton = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
	public String InvalidCredentials ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p";
	public String dashboard = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6";
	public String Required = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span";
	public String ClickAdminOptionOnDashboard = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a";
	public String ClickAddButtonOnAdminpage="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
	public String UserRole="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]";
	public String Status="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i";
	public String Password="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
	public String ConfirmPassword="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input";
	public String Username="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input";
	public String EmployeeName="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input";
	public String Savebutton="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";
	public String CancelButton="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[1]";
//	public String sucessMessageonAddUser="";
	public String ClickPIMOptionOnDashboard="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]";
	public String clickAddEmployeebutton_PIM="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a";
	public String FirstName_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input";
	public String MiddleName_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input";
	public String LastName_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input";
	public String LoginDetails_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span";
	public String userName_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input";
	public String Status_Enabled_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/span";
	public String Status_Disabled_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/label/span";
	public String Passward_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input";
	public String ConfirmPassword_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input";
	public String Savebutton_addEmployee="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";
	
	// Employee Information
	public String Enter_Employee_name_EmployeeInformation="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input";
	public String searchbutton_name_EmployeeInformation="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]";
	public String Click_Edit_icon_EmployeeInformation="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]";
	
	//personal details
	public String Other_Id="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input";
	public String Drivers_License_Number="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input";
//	public String License_Expiry_Date="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/i";
//	public String Nationality="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i";
//	public String Marital_Status="";
//	public String Date_of_Birth="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input";
	public String Gender_male="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span";
	public String Gender_female="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span";
	public String saveButton_personalDetails="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
//	public String asd="";
	
	
	
	
}
