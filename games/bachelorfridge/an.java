/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends qb {
    static String field_s;
    static int field_q;
    static int field_t;
    static ee field_r;

    final static kv[] a(byte param0, vr param1, String param2, String param3) {
        kv[] var5 = pi.a(param1, -8845, param2, param3);
        kv[] var4 = var5;
        var5[1].field_n = var5[1].field_q;
        var5[3].field_o = var5[3].field_p;
        var5[5].field_o = var5[5].field_p;
        var5[7].field_n = var5[7].field_q;
        if (param0 > -118) {
            field_s = null;
        }
        return var4;
    }

    public an() {
    }

    final int[][] a(boolean param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = BachelorFridge.field_y;
        if (param0) {
            field_t = 113;
        }
        int[][] var13 = ((an) this).field_h.a(param1, -858);
        int[][] var12 = var13;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (((an) this).field_h.field_b) {
            if (((an) this).e((byte) -117)) {
                var4 = var13[0];
                var5 = var13[1];
                var6 = var13[2];
                var7 = param1 % ((an) this).field_p * ((an) this).field_p;
                for (var8 = 0; var8 < hh.field_d; var8++) {
                    var9 = ((an) this).field_n[var8 % ((an) this).field_o + var7];
                    var6[var8] = dda.a(4080, var9 << -1338161372);
                    var5[var8] = dda.a(65280, var9) >> -392936156;
                    var4[var8] = dda.a(var9 >> 1253214796, 4080);
                }
            }
        }
        return var11;
    }

    final static void a(byte[] param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        lka.field_E = qs.a(false, new lu(param0));
        if (param1 > -40) {
            an.f((byte) 123);
        }
        fw.field_h = new pd[-1 + lka.field_E.length];
        for (var2 = 1; var2 < lka.field_E.length; var2++) {
            int discarded$0 = vc.a(var2, 0, -16306);
            var3 = lka.field_E[var2][3];
            var4 = lka.field_E[var2][16];
            var5 = m.a(var2, (byte) -98, 1);
            var6 = kka.a(var2, -114, 2);
            var7 = vc.a(var2, 9, -16306);
            var8 = lt.b(28427, var2) ? 1 : 0;
            qq.a(var8 != 0, var4, var3, var5, var7, var6, var6, 29052);
        }
    }

    public static void f(byte param0) {
        field_s = null;
        if (param0 != 86) {
            Object var2 = null;
            kv[] discarded$0 = an.a((byte) 1, (vr) null, (String) null, (String) null);
        }
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Private";
        field_q = 0;
    }
}
