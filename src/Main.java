public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", 1965, autor);
        warAndPeace.setPublishDate(1865);
        System.out.println(warAndPeace);
        Autor ivanSergeev = new Autor("Ivan", "Sergeev");
        Book numberOfKiller = new Book("Number of Killer", 2004, ivanSergeev);
        numberOfKiller.setPublishDate(2006);
        System.out.println(numberOfKiller);
        System.out.println(warAndPeace.hashCode() == numberOfKiller.hashCode());
        System.out.println(warAndPeace.equals(numberOfKiller));
    }
}