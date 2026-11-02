/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends IntrusiveNode {
    static vh field_n;
    static int[] field_w;
    int field_m;
    static Sprite field_o;
    int field_u;
    static String checking;
    int field_l;
    static vh field_q;
    int field_p;
    int field_t;
    int field_s;
    static vh[] field_v;

    public static void c(byte param0) {
        field_w = null;
        field_v = null;
        field_o = null;
        field_q = null;
        field_n = null;
        if (param0 <= -92) {
          checking = null;
          return;
        }
        oi.c((byte) 126);
        checking = null;
    }

    private oi() throws Throwable {
        throw new Error();
    }

    static {
        field_w = new int[8192];
        checking = "Checking";
    }
}
