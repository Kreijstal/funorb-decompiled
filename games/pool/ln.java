/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ma {
    static String field_l;
    static vh field_q;
    static String[] field_r;
    static tk field_n;
    static vh[] field_v;
    static int field_o;
    static dd[] field_s;
    static int field_t;
    static boolean field_p;
    static int[] field_m;
    static so[] field_u;

    private ln() throws Throwable {
        throw new Error();
    }

    final static dd[] a(int param0, byte param1, di param2, int param3) {
        if (!vj.a(param0, param2, param3, (byte) 121)) {
            return null;
        }
        int var4 = -39 / ((param1 - -12) / 57);
        return sg.h(152);
    }

    final static void a(int[] param0, int param1, eg param2) {
        int var3 = 0;
        int var7 = Pool.field_O;
        d.a(param2, -23109);
        int var4 = (param2.field_D + param2.field_w) / 2;
        int var5 = (param2.field_y + param2.field_S) / 2;
        int var6 = (param2.field_x - -param2.field_V) / 2;
        for (var3 = 0; param2.field_g.length > var3; var3++) {
            param2.field_g[var3] = param2.field_g[var3] - var4;
        }
        for (var3 = param1; var3 < param2.field_Y.length; var3++) {
            param2.field_Y[var3] = param2.field_Y[var3] - var5;
        }
        for (var3 = 0; param2.field_q.length > var3; var3++) {
            param2.field_q[var3] = param2.field_q[var3] - var6;
        }
        param0[0] = var4;
        param0[2] = var6;
        param0[1] = var5;
        param2.a();
    }

    public static void a(int param0) {
        field_m = null;
        field_q = null;
        field_r = null;
        field_u = null;
        field_v = null;
        field_s = null;
        field_n = null;
        field_l = null;
        if (param0 != 27817) {
            field_m = null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
            field_l = null;
        }
        int discarded$0 = ph.a((byte) 118);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Hide";
        field_m = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_t = 0;
    }
}
