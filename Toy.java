package test_java;

// import java.io.ObjectStreamException;
import java.util.Objects;

public class Toy {
    private int id;
    private String name;

    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * object equality implementation overrides equals(), hashCode();
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Toy toy = (Toy) obj;
        return (id == toy.id) && (name.equals(toy.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
