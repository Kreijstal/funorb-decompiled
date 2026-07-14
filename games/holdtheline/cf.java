/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends jj {
    static el field_r;
    static boolean field_y;
    static int field_v;
    static ah field_z;
    private Object field_x;
    static int field_q;
    static va field_u;
    static int field_w;
    static oa field_s;
    static String field_t;

    final boolean g(int param0) {
        int var2 = 119 % ((param0 - 1) / 61);
        return false;
    }

    final Object b(byte param0) {
        if (param0 != 66) {
            field_z = null;
        }
        return ((cf) this).field_x;
    }

    public static void c(byte param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        field_u = null;
        field_z = null;
        if (param0 != 109) {
            cf.c((byte) -112);
        }
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        String var3 = ld.a(false, param2, param0);
        if (!(var3 == null)) {
            return var3;
        }
        for (var4 = 0; var4 < param0.length(); var4++) {
            if (!vb.a(332243496, param0.charAt(var4))) {
                return od.field_r;
            }
        }
        if (param1 == -28) {
            return null;
        }
        field_r = null;
        return null;
    }

    final static void h(int param0) {
        int var1 = -126 / ((10 - param0) / 43);
        go.a(0, 17);
    }

    cf(Object param0, int param1) {
        super(param1);
        ((cf) this).field_x = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = false;
        field_v = 0;
        field_z = new ah();
        field_t = "Steer right";
    }
}
