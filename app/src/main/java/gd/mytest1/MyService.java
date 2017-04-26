package gd.mytest1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaofuqi on 2017/4/21.
 */

public class MyService extends Service {
    public final String TAG = this.getClass().getSimpleName();
    //包含Book对象的list
    private List<Book> mBooks = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        mBooks.add(new Book("java", 10));
        mBooks.add(new Book("html", 11));
    }


    private final BookManager.Stub bookManager = new BookManager.Stub() {

        @Override
        public List<Book> getBooks() throws RemoteException {
            synchronized (this) {
                if (mBooks != null) {
                    return mBooks;
                }
            }
            return null;
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            synchronized (this) {
                if (book == null) {
                    book = new Book();
                }
                book.setPrice(111);
                if (!mBooks.contains(book)) {
                    mBooks.add(book);
                }

            }
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, intent.toString());
        return bookManager;
    }
}
