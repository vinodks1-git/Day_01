class Goal_Parser {
    public static void main(String[] args) {
        String command = "G()(al)";

        String result = command.replace("()", "o");
        result = result.replace("(al)", "al");

        System.out.println(result);
    }
}