/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends gi {
    static String[] field_i;
    static int[] field_j;
    byte[] field_h;

    public static void a(byte param0) {
        field_j = null;
        field_i = null;
        if (param0 != -4) {
            field_i = (String[]) null;
        }
    }

    ga(byte[] param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new int[]{13, 13, 15, 17, 20, 26, 27, 30, 71, 32, 72, 38, 40, 43, 46, 50, 54, 60, 67, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, -1, -1, -1, -1, 13, 40, 27, 13, 15, 27, 32, 54, 40, 40, 40, 54, 15, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, -1, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69};
    }
}
