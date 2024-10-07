package egovframework.example.main.valueobject;

import java.util.Date;

public class loanVO {
    private int loanId;
    private Date loanDate;
    private Date dueDate;
    private Date returnDate; 
    private int extensionCount; 
    private int overdueDays; 
    private String userId;
    private String isbn;

    public int getLoanId() { return loanId; }
    public void setLoanId(int loanId) { this.loanId = loanId; }

    public Date getLoanDate() { return loanDate; }
    public void setLoanDate(Date loanDate) { this.loanDate = loanDate; }

    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }

    public Date getReturnDate() { return returnDate; } // 추가된 메서드
    public void setReturnDate(Date returnDate) { this.returnDate = returnDate; } // 추가된 메서드

    public int getExtensionCount() { return extensionCount; } // 추가된 메서드
    public void setExtensionCount(int extensionCount) { this.extensionCount = extensionCount; } // 추가된 메서드

    public int getOverdueDays() { return overdueDays; } // 추가된 메서드
    public void setOverdueDays(int overdueDays) { this.overdueDays = overdueDays; } // 추가된 메서드

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
