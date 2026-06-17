# Insurance Office Console Application

## Project Description

This is a simple console-based Java application that simulates an insurance office managing vehicle insurance policies.  

---

## Project Structure

The project contains two main classes:

### 1. Policy
Represents a single insurance policy.
- It stores client and vehicle data
- Calculates the premiums on insurance
- Generates renewal premium forecasts
- Classifies risk
- Counts the amount of created policies

#### Fields:
- policy number
- client name
- base premium
- risk level
- vehicle value
- alarm system flag
- claim-free status

#### Methods:
- `calculateFinalPremium()`
- `calculateRenewalPremium()`
- `getRiskSummary()`
- `equals()`
- `toString()`
- `getCreatedPolicyCount()` (static)

---

### 2. `InsuranceOffice`
Manages a collection of policies.
- It stores all policies in an `ArrayList`
- Adds new policies
- Generates reports
- Calculates statistics
- Searches policies by number

#### Methods:
- `addPolicy(Policy policy)`
- `printReport()`
- `calculateTotalPremium()`
- `calculateTotalRenewalForecast()`
- `countHighRiskPolicies()`
- `findByNumber(String policyNumber)`
- `printCheaperThan(double threshold)`

---