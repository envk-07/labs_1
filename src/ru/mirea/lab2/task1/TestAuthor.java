package pr2.task01;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", "tolstoy@example.com", 'm');
        System.out.println(author);
        author.setEmail("leo@example.com");
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
        System.out.println(author);
    }
}
