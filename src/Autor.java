import java.util.Objects;

public class Autor {
  private String name;
    private String serName;


    public Autor(String name, String serName) {
        this.name = name;
        this.serName = serName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }



    public void setSerName(String serName) {
        this.serName = serName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return name.equals(autor.name) && serName.equals(autor.serName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serName);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", serName='" + serName + '\'' +
                '}';
    }
}

