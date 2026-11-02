/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static String field_e;
    static String field_d;
    static String field_b;
    String context;
    Throwable cause;
    static int field_c;

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        int var1 = 1 / ((3 - param0) / 33);
        field_d = null;
    }

    ClientException(Throwable param0, String param1) {
        this.cause = param0;
        this.context = param1;
    }

    static {
        field_d = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_e = "Phoenix device";
        field_b = "(Including <%0>)";
        field_c = -1;
    }
}
