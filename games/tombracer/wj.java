/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static jpa field_a;
    static String field_b;

    final static void a(cga param0, int param1, int param2) {
        kh var5 = null;
        int var4 = 0;
        try {
            if (param2 > -116) {
                wj.a((byte) 1);
            }
            var5 = ql.field_k;
            var5.k(param1, -2988);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.i(1, 0);
            var5.i(param0.field_j, 0);
            var5.i(param0.field_o, 0);
            var5.a(param0.field_k, (byte) -42);
            var5.a(param0.field_h, (byte) -20);
            var5.a(param0.field_m, (byte) -123);
            var5.a(param0.field_n, (byte) 92);
            int discarded$0 = var5.g(var4, 64);
            var5.d(var5.field_h - var4, (byte) 16);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wj.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        String var7 = null;
        if (bta.field_q != param3) {
            var7 = lw.field_i;
        } else {
            var7 = jaa.field_a;
        }
        lba.a(param6, param5, param1, (byte) 53, param0, param2, var7, param4);
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 35) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Treasure Values";
    }
}
