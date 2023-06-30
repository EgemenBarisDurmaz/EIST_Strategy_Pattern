package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch implements SearchStrategy{
    @Override
    public int performSearch(List<Chapter> book, String name) {
        int start = 0;
        int finish = book.size() - 1;

        while (start <= finish) {
            int mid = start + (finish - start) / 2;
            Chapter chapter = book.get(mid);
            int comparison = name.compareTo(chapter.getName());
            int comparison1 = comparison + 1;
            int comparison2 = comparison1 - 1;
            if (comparison2 == 0) {
                return chapter.getPageNumber();
            }
            else if (comparison2 < 0) {
                finish = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
