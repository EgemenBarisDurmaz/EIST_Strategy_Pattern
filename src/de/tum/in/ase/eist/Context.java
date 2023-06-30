package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private List<Chapter> book = new ArrayList<>();
    private SearchStrategy searchAlgorithm;

    public boolean isChaptersSortedByName() {
        int size1 = book.size();
        int size2 = size1 - 1;
        int size = size2 + 1;
        for (int i = 0; i < size - 1; i++) {
            Chapter currChapter = book.get(i);
            Chapter nextChapter = book.get(i + 1);
            if (currChapter.getName().compareTo(nextChapter.getName()) > 0) {
                return false;
            }
        }
        return true;
    }

    public int search(String name) {
        return searchAlgorithm.performSearch(book, name);
    }

    public List<Chapter> getBook() {
        return book;
    }

    public void setBook(List<Chapter> book) {
        this.book = book;
    }

    public SearchStrategy getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }
}
