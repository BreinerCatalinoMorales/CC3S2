class Calculator1_1TestPregunta1_2 {
    private int nbErrors = 0;

    public void testAdd() {
        Calculator1_1 calculator = new Calculator1_1();
        double result = calculator.add(10, 50);

        if (result != 60) {
            throw new IllegalStateException("Mal resultado: " + result);
        }
    }

    public static void main(String[] args) {
        Calculator1_1TestPregunta1_2 test = new Calculator1_1TestPregunta1_2();
        try {
            test.testAdd();
        } catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw new IllegalStateException("Hay " + test.nbErrors + " error(s)");
        }
    }
}