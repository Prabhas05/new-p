package com.hrms.testscripts;
import com.hrms.lib.General;

public class Recruitment_add {
	public static void main (String args[]) {
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.Recruitment();
	obj.enterFrame();
	obj.addjobVacancy();
	obj.exitframe();
	obj.logout();
	obj.closeApplication();
		
	
	
	

}
}