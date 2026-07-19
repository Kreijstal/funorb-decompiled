/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends mc {
    int field_x;
    int field_r;
    int field_w;
    int field_s;
    static int field_z;
    static sj field_n;
    static volatile int field_y;
    static kc field_q;
    int field_o;
    static int field_p;
    va field_v;
    static String field_t;
    static boolean field_u;

    final static int a(int param0) {
        int discarded$0 = 0;
        if (param0 != -1) {
            discarded$0 = va.a(56);
            return (int)(1000000000L / mb.field_B);
        }
        return (int)(1000000000L / mb.field_B);
    }

    public static void b(byte param0) {
        field_n = null;
        field_t = null;
        if (param0 != 44) {
            field_n = (sj) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    va(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param1;
        this.field_s = param2;
        this.field_x = param4;
        this.field_w = param0;
        this.field_r = param3;
    }

    static {
        field_y = -1;
        field_u = false;
        field_t = "Loading sound effects";
    }
}
