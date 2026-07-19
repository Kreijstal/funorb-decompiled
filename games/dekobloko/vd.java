/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends bh {
    static int field_n;
    static w field_s;
    static String field_o;
    static String field_r;
    static String field_q;
    int field_p;

    final static int a(int param0) {
        if (param0 != 480) {
            return 53;
        }
        return ri.field_i + -ge.field_e;
    }

    public static void c(byte param0) {
        int var1 = 9 % ((param0 - 10) / 59);
        field_q = null;
        field_r = null;
        field_s = null;
        field_o = null;
    }

    vd(int param0) {
        this.field_p = param0;
    }

    static {
        field_n = 480;
        field_o = "Unpacking graphics";
        field_r = "Lost";
    }
}
