/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static rd field_e;
    int field_c;
    static bm field_d;
    int field_b;
    static bd field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, oj param1, int param2) {
        lf[] var8 = null;
        lf[] var3 = null;
        int var4 = 0;
        lf var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        if (param2 != 18459) {
            Object var7 = null;
            nd.a(78, (oj) null, -25);
            var8 = md.field_g;
            var3 = var8;
            for (var4 = 0; var4 < var8.length; var4++) {
                var5 = var8[var4];
                var5.a(param0, 576, param1);
                var5.b(61);
            }
            return;
        }
        var8 = md.field_g;
        var3 = var8;
        for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            var5.a(param0, 576, param1);
            var5.b(61);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0 != 30401) {
            field_d = null;
        }
    }

    final static ii a(int param0, String param1) {
        if (c.field_a.d((byte) -16)) {
            if (param1.equals((Object) (Object) c.field_a.a((byte) -34))) {
                if (param0 != 3888) {
                    return null;
                }
                return c.field_a;
            }
            c.field_a = ta.a(false, param1);
        }
        if (param0 != 3888) {
            return null;
        }
        return c.field_a;
    }

    nd(int param0, int param1, int param2, int param3) {
        ((nd) this).field_b = param3;
        ((nd) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bm();
    }
}
