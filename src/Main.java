import org.junit.Test;

public class Main {
    @Test
    public void prop() {
        solve();
    }

    public void solve() {
        String[] array;
        String prop = "Culegere de probleme pentru concursuri";
        array = prop.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }

        }
    }

}
