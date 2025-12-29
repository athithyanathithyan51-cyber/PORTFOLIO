class Test {
    public static void main(String args[]) {
        int x;
        try {
            x = Integer.parseInt(args[0]);
            System.out.println("Inside try block: " + x);
        } 
        catch (NumberFormatException e) {
            x = 20;
            System.out.println("Inside catch block: " + x);
        }
    }
}
