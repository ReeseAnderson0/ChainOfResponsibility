public interface DepartmentChain {
    void setNextChain(DepartmentChain nextChain);
    Boolean HandleRequest(Request request);
}
