/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static int field_e;
    static String field_c;
    static int field_d;
    String context;
    Throwable cause;

    public static void a(int param0) {
        if (param0 != 0) {
          field_d = 29;
          field_c = null;
          return;
        }
        field_c = null;
    }

    ClientException(Throwable param0, String param1) {
        this.context = param1;
        this.cause = param0;
    }

    static {
        field_c = "YES";
        field_e = 0;
    }
}
