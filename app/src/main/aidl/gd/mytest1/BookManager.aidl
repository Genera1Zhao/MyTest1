// BookManager.aidl
package gd.mytest1;

// Declare any non-default types here with import statements
import gd.mytest1.Book;
interface BookManager {
 //所有的返回值前都不需要加任何东西，不管是什么数据类型
    List<Book> getBooks();

    //传参时除了Java基本类型以及String，CharSequence之外的类型
    void addBook(in Book book);
}
