package OpenClosedPrincipal;

public class  Loan {
private Double amount;
private Integer term;
private Double interestRate;
private Double totalLoan;

    public Loan(Double amount, Integer term, Double interestRate) {
        this.amount = amount;
        this.term = term;
        this.interestRate = interestRate;
    }
    public Loan(){}

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(Double totalLoan) {
        this.totalLoan = totalLoan;
    }
}
