package classesAndObjects.task12_15;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;


    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Author: ").append(super.getAuthor()).append(", ")
                .append("Title: ").append(super.getTitle()).append(", ")
                .append("Language: ").append(language)
                .append("Level: ").append(level)
                .append("Edition: ").append(Book.getEdition()).append(", ")
                .append("Price: ").append(super.getPrice()).append(".");
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object.getClass() != this.getClass()) return false;
        if (!super.equals(object)) return false;

        ProgrammerBook pBook = (ProgrammerBook) object;

        if (level != pBook.level) return false;
        return language != null ? language.equals(pBook.language) : pBook.language == null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (language != null ? language.hashCode() : 0);
        result = prime * result + level;
        return result;
    }
}
