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

}
