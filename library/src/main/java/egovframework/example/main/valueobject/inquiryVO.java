package egovframework.example.main.valueobject;

import java.util.Date;

public class inquiryVO {
    private int inquiryId;    
    private String title;      
    private String content;    
    private String stateType;
    private Date createDate;   
    private String categoryType;  

    public int getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(int inquiryId) {
        this.inquiryId = inquiryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getStateType() {  
        return stateType;
    }

    public void setStateType(String stateType) {  
        this.stateType = stateType;
    }

    @Override
    public String toString() {
        return "inquiryId=" + inquiryId + ", title=" + title + ", content=" + content
                + ", createDate=" + createDate + ", categoryType=" + categoryType + ", stateType=" + stateType + "";
    }
}
