interface Test {
    void read();
}

class Demo2 {
    public static void main(String[] args) {
        Test t = () -> {
            try {
                throw new Exception("Error!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };

        t.read();
    }
}