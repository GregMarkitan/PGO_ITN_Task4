class Policy {
	private String policyNumber;
	private String clientName;
	private double basePremium;
	private int riskLevel;
	private double vehicleValue;
	private boolean hasAlarm;
	private boolean claimFreeClient;

	private static int createdPolicyCount = 0;
	private static final double ADMINISTRATIVE_FEE = 100.0;

	public Policy(String policyNumber, String clientName, double basePremium, int riskLevel, double vehicleValue, boolean hasAlarm, boolean claimFreeClient) {
		this.policyNumber = policyNumber;
		this.clientName = clientName;
		this.basePremium = basePremium;
		this.riskLevel = riskLevel;
		this.vehicleValue = vehicleValue;
		this.hasAlarm = hasAlarm;
		this.claimFreeClient = claimFreeClient;

		createdPolicyCount++;
	}
	public String getPolicyNumber() {
	return policyNumber;
	}

	public String getClientName() {
	return clientName;
	}

	public double calculateFinalPremium() {
		double premium = basePremium + ADMINISTRATIVE_FEE;
		premium += riskLevel * 120;
		if (vehicleValue > 60000) {
			premium += 200;
        	}

		if (hasAlarm) {
			premium -= 100;
		}

		if (claimFreeClient) {
			premium *= 0.90;
		}

		if (premium < basePremium) {
			premium = basePremium;
		}

		return Math.round(premium * 100.0) / 100.0;
	}


}
