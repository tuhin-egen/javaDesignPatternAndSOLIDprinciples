package strategy;

public class CompanyTaskDistributeStrategyDemo {
public static void main(String[] args) {
	
	TaskDistributionStrategy preSales = new PreSalesTeamStrategy(250000.00);
	
	TaskDistributionStrategy developer = 
			new DeveloperTeamStrategy("Pharmacy and IPD Module", "270hrs");
	
	TaskDistributionStrategy qa = new SQATeamStrategy("Blackbox", "3000");
	
	preSales.taskDistribute("Sales Team");
	developer.taskDistribute("Java Developer");
	qa.taskDistribute("SQA Team");

}
}
