package knijarnica;

public enum BookType {
    CHILDREN_BOOK("Children's Book"),
    COMIC_BOOK("Comic Book"),
    BOOK("Book");

    private final String displayName;

    BookType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
