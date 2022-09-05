

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
        public String toString() {
            return "автор: " + name + " " + serName;
        }
    }

