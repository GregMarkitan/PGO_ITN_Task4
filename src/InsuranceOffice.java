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

	public void printCheaperThan(double threshold) {
		System.out.println("\nPolicies cheaper than " + threshold);
			for (Policy policy : policies) {
				if (policy.calculateFinalPremium() < threshold) {
					System.out.println(policy);
				}
			}
		}
	
	public void printReport() {
		System.out.println("----------" + name + "----------");

		for (Policy policy : policies) {
			System.out.println(policy);
		}

		System.out.println("--------------------------------");
		System.out.println("Policies: " + policies.size());
		System.out.println("Total Premium: " + calculateTotalPremium());
		System.out.println("Renewal Forecast: " + calculateTotalRenewalForecast());
		System.out.println("High-Risk Policies: " + countHighRiskPolicies());
		System.out.println("--------------------------------");
	}

}
