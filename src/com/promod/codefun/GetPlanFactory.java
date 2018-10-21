package com.promod.codefun;

public class GetPlanFactory {

	
	public Plan getPlan(String planType){
		
		if(planType==null){
			
			return null;
		}
		
		if(planType.equalsIgnoreCase("CommericalPlan")) {
			
			return new CommericalPlan();
		}
		if(planType.equalsIgnoreCase("DomesticPlan")) {
			
			return new DomesticPlan();
		}
		
		return null;
	}
}
