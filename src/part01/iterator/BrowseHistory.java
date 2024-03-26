package part01.iterator;

import java.util.Stack;

public class BrowseHistory {

    private Stack<String> urls = new Stack<String>();

    public void push(String url) {
        urls.push(url);
    }

    public String pop() {
        return urls.pop();
    }

    public Iterator<String> createIterator() {
        return new ListIterator();
    }

    /**
     * ListIterator
     */
    public class ListIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String current() {
            return urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }

    }

}