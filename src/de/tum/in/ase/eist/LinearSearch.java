package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch implements SearchStrategy{

    @Override
    public int performSearch(List<Chapter> book, String name) {
        for (Chapter chapter : book) {
            if (chapter.getName().equals(name)) {
                return chapter.getPageNumber();
            }
        }
        return -1;
    }
}
