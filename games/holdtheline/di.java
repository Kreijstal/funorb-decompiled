/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class di extends ln {
    int field_u;
    int field_v;
    static fd field_q;
    static int[] field_p;
    int field_y;
    int field_x;
    int field_s;
    static hj field_t;
    static int field_r;
    static String field_w;
    int field_o;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_o << 738434211;
        param3 = (param3 << -1604764060) - -(param0 & var6);
        int var7 = this.field_v << 1358884195;
        param4 = (param4 << 1730408772) + (15 & var7);
        this.a(var6, var7, param3, param4, param1, param2);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    public static void f(int param0) {
        field_q = null;
        field_p = null;
        field_t = null;
        if (param0 != -13503) {
            field_w = (String) null;
            field_w = null;
            return;
        }
        field_w = null;
    }

    di() {
    }

    static {
        field_q = new fd();
        field_w = "Hold the Line";
    }
}
