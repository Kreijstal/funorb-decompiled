/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends kd {
    static long[] field_i;
    int field_j;
    static boolean[] field_h;
    static d[] field_l;
    int field_k;

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_l = null;
        if (param0 != 69) {
            field_l = null;
        }
    }

    final static boolean a(wf param0, int param1) {
        int var2 = param0.d(true);
        if (param1 != 25444) {
            Object var4 = null;
            boolean discarded$0 = f.a((wf) null, 110);
        }
        int var3 = var2 == 1 ? 1 : 0;
        return var3 != 0;
    }

    private f() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_l = new d[255];
        field_i = new long[32];
        for (var0 = 0; var0 < field_l.length; var0++) {
            field_l[var0] = new d();
        }
    }
}
