package pack1;

public class AccessDemo {
    public int pubVar = 10;
    protected int protVar = 20;
    int defVar = 30; // default (package-private)
    private int privVar = 40;

    public void showAll() {
        System.out.println("Accessing from within same class (AccessDemo):");
        System.out.println("public: " + pubVar + ", protected: " + protVar + ", default: " + defVar + ", private: " + privVar);
    }
}

