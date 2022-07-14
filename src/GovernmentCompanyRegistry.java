public class GovernmentCompanyRegistry {
    private DepartmentChain c1;
    public GovernmentCompanyRegistry() {
        this.c1 = new LegalizationsServicesDepartment();
        DepartmentChain c2 = new AuthenticationServices();
        DepartmentChain c3 = new FinanceDepartment();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        Request companyRequest = new Request();

        GovernmentCompanyRegistry approvalChain = new GovernmentCompanyRegistry();
        if (manager.CreateRequest()) {
            approvalChain.c1.HandleRequest(companyRequest);
        }
        if (companyRequest.status) {
            System.out.println("\nCompany Registered");
        } else {
            System.out.println("\nCompany Rejected");
        }
    }
}
