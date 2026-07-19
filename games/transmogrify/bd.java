/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends wj {
    static String field_s;
    static String field_v;
    static pl[] field_u;
    static String field_r;
    static int field_t;
    static String[] field_p;
    static int field_q;

    bd(long param0, String param1) {
        super(param0, param1);
    }

    public static void b(boolean param0) {
        field_p = null;
        field_r = null;
        field_v = null;
        field_u = null;
        field_s = null;
        if (!param0) {
            bd.b(false);
        }
    }

    final nk a(int param0) {
        if (param0 != -184) {
            return (nk) null;
        }
        return be.field_w;
    }

    static {
        field_t = -1;
        field_s = "Error connecting to server. Please try using a different server.";
        field_r = "Waiting for languages";
        field_q = 200;
    }
}
