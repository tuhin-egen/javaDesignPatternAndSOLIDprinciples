package strategy;

public class SQATeamStrategy implements TaskDistributionStrategy{

	private String testType;
	private String testCaseNumber;
	
	public SQATeamStrategy( String testType, String testCaseNumber) {
		this.testType = testType;
		this.testCaseNumber = testCaseNumber;
	}

	@Override
	public void taskDistribute(String teamName) {
		System.out.println("Team " +teamName 
				+" team and their Test type is "+this.testType 
				+", total number of testcase is =: "+this.testCaseNumber);
		
	}
	
	


}
