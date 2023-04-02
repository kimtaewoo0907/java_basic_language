package Thread;

public class LibraryMultiThread implements Runnable {
    static int book_total = 100;
    @Override
    public void run() {
        borrowBooks();
    }
    public synchronized static void borrowBooks() {
        if(LibraryMultiThread.book_total<=0) {
            return;
        }
        System.out.println("대출완료");
        book_total -= 1;
        System.out.println("현재 남아있는 책 수량은 " + book_total);
    }
}
