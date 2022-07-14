public class AuthenticationServices implements DepartmentChain {
    private DepartmentChain chain;

    @Override
    public void setNextChain(DepartmentChain nextChain) { this.chain = nextChain; }

    @Override
    public Boolean HandleRequest(Request request) {
        Boolean approval = true;
        if (approval) {
            System.out.println("AuthenticationServices Approved Request");
            request.status=true;
            this.chain.HandleRequest(request);
        } else {
            System.out.println("AuthenticationServices Rejected Request");
            request.status=false;
        }
        return null;
    }
}
