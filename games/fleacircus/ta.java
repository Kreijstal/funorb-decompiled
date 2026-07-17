/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends pa {
    static String field_s;
    static int field_y;
    int field_q;
    int field_w;
    static dd[] field_z;
    static int field_u;
    int field_t;
    int field_v;
    int field_x;
    int field_r;

    public static void c(byte param0) {
        int var1 = -2;
        field_z = null;
        field_s = null;
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4) {
        return ud.a(0, 3, 4715, 1, 1, 0, 65793, 1, 0);
    }

    final static String f(int param0) {
        return ae.field_a.h(0);
    }

    final static void a(boolean param0, int param1) {
        uc.field_c.a(param0, 10518);
    }

    ta() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "<%0>Balloons & Landing Pad:<%1> Each balloon caries a single flea up to a landing pad.";
        field_u = 0;
    }
}
