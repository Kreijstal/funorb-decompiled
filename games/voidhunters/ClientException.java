/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    Throwable cause;
    String context;
    static String[] field_c;

    public static void clearSharedReferences(int param0) {
        field_c = null;
        int var1 = 23 % ((79 - param0) / 46);
    }

    ClientException(Throwable param0, String param1) {
        this.cause = param0;
        this.context = param1;
    }
}
