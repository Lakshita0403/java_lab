
class exception_twocatch {
    public static void main(String[] args) {
        int n = args.length;
        try {
            int marks[] = { 1, 2, 3, 4, 5 };
            System.out.println(marks[5]);
            System.out.println(n);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
            // ae.printStackTrace();
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            // e.printStackTrace();
        } finally {
            System.out.println("error");
        }

    }
}
