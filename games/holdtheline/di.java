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
        int var6 = ((di) this).field_o << 3;
        param3 = (param3 << 4) - -(param0 & var6);
        int var7 = ((di) this).field_v << 3;
        param4 = (param4 << 4) + (15 & var7);
        ((di) this).a(var6, var7, param3, param4, param1, param2);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    public static void f(int param0) {
        field_q = null;
        field_p = null;
        field_t = null;
        field_w = null;
    }

    di() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new fd();
        field_w = "Hold the Line";
    }
}
