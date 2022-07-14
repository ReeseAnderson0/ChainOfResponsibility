public class LegalizationsServicesDepartment implements DepartmentChain {
    private DepartmentChain chain;
    @Override
    public void setNextChain(DepartmentChain nextChain) { this.chain = nextChain; }

    @Override
    public Boolean HandleRequest(Request request) {
        boolean approval = true;
        if (approval) {
            System.out.println("LegalizationsServicesDepartment Approved Request");
            request.status=true;
            this.chain.HandleRequest(request);
        } else {
            System.out.println("LegalizationsServicesDepartment Rejected Request");
            request.status=false;
        }
        return null;
    }
}
