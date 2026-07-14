/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rk extends gp {
    boolean field_u;
    boolean field_t;
    volatile boolean field_z;
    static vl[] field_w;
    static String field_x;
    static int field_y;
    static cr field_v;
    static String[] field_A;

    abstract int i(int param0);

    final static String a(byte param0, String param1, int param2) {
        if (!(-4 != (param2 ^ -1))) {
            return j.field_s;
        }
        if (param0 != -27) {
            field_A = null;
            if (!((param2 ^ -1) != -7)) {
                return sk.field_d;
            }
            if (7 == param2) {
                return sp.field_K;
            }
            if (param2 == 8) {
                return re.field_c;
            }
            if (!(param2 != 9)) {
                return ad.field_d;
            }
            if (10 == param2) {
                return cf.field_b;
            }
            if (!(param2 != -12)) {
                return fg.field_cb;
            }
            if (!(-15 != param2)) {
                return Vertigo2.a(new String[1], bk.field_b, -115);
            }
            return null;
        }
        if (!((param2 ^ -1) != -7)) {
            return sk.field_d;
        }
        if (7 == param2) {
            return sp.field_K;
        }
        if (param2 == 8) {
            return re.field_c;
        }
        if (!(param2 != 9)) {
            return ad.field_d;
        }
        if (10 == param2) {
            return cf.field_b;
        }
        if (!(param2 != -12)) {
            return fg.field_cb;
        }
        if (!(-15 != param2)) {
            return Vertigo2.a(new String[1], bk.field_b, -115);
        }
        return null;
    }

    final static void h(int param0) {
        if (param0 > -96) {
            return;
        }
        rh.b(-14, 17);
    }

    public static void a(boolean param0) {
        field_w = null;
        field_v = null;
        field_x = null;
        field_A = null;
        if (param0) {
            field_y = 77;
        }
    }

    abstract byte[] a(byte param0);

    rk() {
        ((rk) this).field_z = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_w = new vl[255];
        for (var0 = 0; field_w.length > var0; var0++) {
            field_w[var0] = new vl();
        }
        field_x = "Main Menu";
    }
}
