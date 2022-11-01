package strategy;

public class PreSalesTeamStrategy implements TaskDistributionStrategy{
	
	private Double taargetOfSalesAmount;
	
	
	public PreSalesTeamStrategy(Double taargetOfSalesAmount) {
		this.taargetOfSalesAmount = taargetOfSalesAmount;
	}


	@Override
	public void taskDistribute(String teamName) {
		System.out.println("Team " +teamName 
				+" team and their target is "+this.taargetOfSalesAmount);
	}
	

}
