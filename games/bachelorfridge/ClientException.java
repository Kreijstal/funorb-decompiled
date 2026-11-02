/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static Sprite[] field_b;
    static boolean field_a;
    Throwable cause;
    String context;
    static sna field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 10 / ((param0 - 26) / 60);
    }

    ClientException(Throwable param0, String param1) {
        this.cause = param0;
        this.context = param1;
    }

    static {
        field_a = true;
    }
}
