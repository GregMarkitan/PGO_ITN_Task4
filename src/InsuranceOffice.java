class InsuranceOffice {
	private String name;
	private ArrayList<Policy> policies;

	public InsuranceOffice(String name) {
		this.name = name;
		this.policies = new ArrayList<>();
    }
	public void addPolicy(Policy policy) {
		policies.add(policy);
	}
	public double calculateTotalPremium() {
		double total = 0;
		for (Policy policy : policies) {
		total += policy.calculateFinalPremium();
		}

	return Math.round(total * 100.0) / 100.0;
	}
	
	public double calculateTotalRenewalForecast() {
		double total = 0;
		for (Policy policy : policies) {
		total += policy.calculateRenewalPremium();
		}

	return Math.round(total * 100.0) / 100.0;
	}

	public int countHighRiskPolicies() {
		int count = 0;
		for (Policy policy : policies) {
			if (policy.getRiskSummary().contains("High")) {
				count++;
			}
		}

	return count;
	}
	
	public Policy findByNumber(String policyNumber) {
		for (Policy policy : policies) {
			if (policy.getPolicyNumber().equals(policyNumber)) {
				return policy;
			}
		}

	return null;
	}

}
