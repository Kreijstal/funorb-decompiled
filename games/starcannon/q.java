/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends rf {
    byte[] field_k;
    static String field_h;
    static boolean field_j;
    int field_f;
    long field_g;
    static String field_i;

    q(long param0, int param1, byte[] param2) {
        try {
            this.field_f = param1;
            this.field_k = param2;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "q.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 < 104) {
            q.b((byte) -41);
        }
    }

    static {
        field_j = false;
        field_h = "Your email address is used to identify this account";
        field_i = "Waiting for extra data";
    }
}
