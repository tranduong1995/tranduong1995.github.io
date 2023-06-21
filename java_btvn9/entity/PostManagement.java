package entity;

import java.util.Arrays;

public class PostManagement {
    private PostType postType;


    private PostManagementDetail[] details;

    public PostManagement(Reporter reporter, PostManagementDetail[] details) {
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public PostManagementDetail[] getDetails() {
        return details;
    }

    public void setDetails(PostManagementDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "PostManagement{" +
                "postType=" + postType +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}





