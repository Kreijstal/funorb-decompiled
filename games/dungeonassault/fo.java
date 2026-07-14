/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    static int[] field_c;
    static nn field_d;
    static int field_b;
    static cn field_a;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != -73) {
            field_a = null;
        }
    }

    final static cn[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        cn[] var1 = new cn[dk.field_d];
        for (var2 = param0; var2 < dk.field_d; var2++) {
            var3 = jn.field_k[var2] * jc.field_f[var2];
            var4 = ub.field_q[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = uo.field_b[nb.a(255, (int) var4[var6])];
            }
            var1[var2] = new cn(ce.field_x, tb.field_i, hg.field_t[var2], fe.field_g[var2], jc.field_f[var2], jn.field_k[var2], var5);
        }
        sb.a(500);
        return var1;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var2 = 0;
        if (param0 >= -124) {
            field_c = null;
        }
        if (param1 < ib.field_d * (-1 + ib.field_j)) {
            var2 = ib.field_j * (param1 / (-1 + ib.field_j)) + param1 % (-1 + ib.field_j);
            var3 = 1 + var2;
        } else {
            var2 = -(ib.field_d * (-1 + ib.field_j)) + param1;
            var3 = var2 + ib.field_j;
        }
        int var4 = ue.field_j[var2];
        int var5 = ue.field_j[var3];
        if (!(var5 == var4)) {
            bo.field_Jb.a(param1, -116);
            lm.a(var5, (byte) -113, var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = rb.b(16777215, 8421504, 64);
    }
}
