package entity;

public class PostManagementDetail {
    private PostType postType;
    private int postsnumber;

    public PostManagementDetail(PostType postType, int postsnumber) {
        this.postType = postType;
        this.postsnumber = postsnumber;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public int getPostsnumber() {
        return postsnumber;
    }

    public void setPostsnumber(int postsnumber) {
        this.postsnumber = postsnumber;
    }

    @Override
    public String toString() {
        return "PostManagementDetail{" +
                "postType=" + postType +
                ", postsnumber=" + postsnumber +
                '}';
    }
}
