package strategy;

public class DeveloperTeamStrategy  implements TaskDistributionStrategy{
	
	private String task;
	private String totalWorkHour;
	
	public DeveloperTeamStrategy(String task, String totalWorkHour) {
		this.task = task;
		this.totalWorkHour = totalWorkHour;
	}

	@Override
	public void taskDistribute(String teamName) {
		System.out.println("Team " +teamName 
				+" team and their task is "+this.task 
				+" , they worked total: "+this.totalWorkHour+" hour(s).");
		
	}
	
	

}
