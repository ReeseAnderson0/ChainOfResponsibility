public class FinanceDepartment implements DepartmentChain {
    private DepartmentChain chain;
    @Override
    public void setNextChain(DepartmentChain nextChain) { this.chain = nextChain; }

    @Override
    public Boolean HandleRequest(Request request) {
        Boolean approval = false;
        if (approval) {
            System.out.println("FinanceDepartment Approved Request");
            request.status=true;
        } else {
            System.out.println("FinanceDepartment Rejected Request");
            request.status=false;
        }
        return true;
    }
}
