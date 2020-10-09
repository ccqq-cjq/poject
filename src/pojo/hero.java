package pojo;

public class hero {
    private int id;
    private String name;
    private String Q;
    private String W;
    private String E;
    private String R;

    public String getName() {
        return name;
    }

    public String getQ() {
        return Q;
    }

    public String getW() {
        return W;
    }

    public String getE() {
        return E;
    }

    public String getR() {
        return R;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQ(String q) {
        Q = q;
    }

    public void setW(String w) {
        W = w;
    }

    public void setE(String e) {
        E = e;
    }

    public void setR(String r) {
        R = r;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Q='" + Q + '\'' +
                ", W='" + W + '\'' +
                ", E='" + E + '\'' +
                ", R='" + R + '\'' +
                '}';
    }

    public hero() {
    }

    public hero(int id, String name, String q, String w, String e, String r) {
        this.id = id;
        this.name = name;
        Q = q;
        W = w;
        E = e;
        R = r;
    }
}
