import org.junit.jupiter.api.*;

public class Jtest {

    Jtest() {
        System.out.println("constructor called for each method by default");
    }

    @BeforeAll
    static void before() {
        System.out.println("Before All methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each method");
    }

    @Test
    void normal() {
        System.out.println("Test case is running");
    }

    @Test
    void normal1() {
        System.out.println("Test case is running");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After Each method");
    }

    @AfterAll
    static void after() {
        System.out.println("After All methods");
    }
}