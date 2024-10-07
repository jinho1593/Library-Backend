package egovframework.example.main.valueobject;

public class bookVO {
	
	private String isbn;          // 도서의 ISBN (기본 키)
    private String title;         // 도서 제목
    private String author;        // 저자
    private String stateType;     // 상태 (예: 대출 가능, 대출 중)
    private String categoryType;  // 카테고리 (예: 소설, 역사, 과학 등)

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    // 객체의 필드 값을 문자열로 출력하는 메서드
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", stateType='" + stateType + '\'' +
                ", categoryType='" + categoryType + '\'' +
                '}';
    }
}
