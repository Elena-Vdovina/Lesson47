package homework_46;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Напишите автотесты с использованием JUnit для задачи 1 из предыдущего домашнего задания.
//
//Проверьте краевые случаи, предусмотрите разные варианты.
public class BookTitleAuthorComparatorTests {

  @Test
  public void BookTitleAuthorComparator(){
    Book book1 = new Book("DBook", "A", 34);
    Book book2 = new Book("ABook", "A", 57);
    Book book3 = new Book("DBook", "B", 25);

    List<Book> actual = new ArrayList<>();
    actual.add(book1);
    actual.add(book2);
    actual.add(book3);

    List<Book> expected = new ArrayList<>();
    expected.add(book2);
    expected.add(book1);
    expected.add(book3);

    actual.sort(new BookTitleAuthorComparator());

    assertEquals(expected, actual);
  }

}
