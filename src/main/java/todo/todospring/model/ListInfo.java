package todo.todospring.model;

public class ListInfo {
    private int pageNum;
    private int pageInterval;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageInterval() {
        return pageInterval;
    }

    public void setPageInterval(int pageInterval) {
        this.pageInterval = pageInterval;
    }
}
