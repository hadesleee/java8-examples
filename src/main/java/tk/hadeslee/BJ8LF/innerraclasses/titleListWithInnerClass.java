package tk.hadeslee.BJ8LF.innerraclasses;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Project: java8-examples
 * FileName: titleListWithInnerClass
 * Date: 2015-12-20
 * Time: 오전 12:19
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class titleListWithInnerClass {
    private ArrayList<String> titleList = new ArrayList<>();

    public void addTitle(String title) {
        titleList.add(title);
    }

    public void removeTitle(String title) {
        titleList.remove(title);
    }

    public Iterator<String> titleIterator() {
        //An anonymous class
        Iterator<String> iterator = new Iterator<String>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return (count < titleList.size());
            }

            @Override
            public String next() {
                return titleList.get(count++);
            }
        };//Anonymous inner class end here
        return iterator;
    }
}
