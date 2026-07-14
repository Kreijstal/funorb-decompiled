/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends en {
    static String[] field_e;
    static cn field_f;
    static long[] field_g;
    private wb field_d;

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_g = null;
        if (!param0) {
            Object var2 = null;
            cn discarded$0 = jf.a(18, (nh) null, -123, (byte) -39);
        }
    }

    private final cn c(byte param0) {
        if (param0 < 18) {
            ((jf) this).field_d = null;
        } else {
            jh.c();
        }
        jh.c();
        jh.c();
        int var2 = 4 + ((jf) this).field_d.field_c.field_y + la.field_b.b(((jf) this).field_d.field_b);
        int var3 = la.field_b.field_H - -la.field_b.field_E;
        if (((jf) this).field_d.field_c.field_v > var3) {
            var3 = ((jf) this).field_d.field_c.field_v;
        }
        cn var4 = new cn(var2, var3);
        var4.e();
        ((jf) this).field_d.field_c.c(0, la.field_b.field_H - ((jf) this).field_d.field_c.field_v >> -185047103, ((jf) this).field_d.field_a);
        la.field_b.b(ck.field_H.a(((jf) this).field_d.field_b, (byte) -48), 4 + ((jf) this).field_d.field_c.field_y, la.field_b.field_H, ((jf) this).field_d.field_a, -1);
        jh.b();
        return var4;
    }

    final static cn a(int param0, nh param1, int param2, byte param3) {
        if (param3 != 41) {
            return null;
        }
        if (!kk.a(param1, 1, param2, param0)) {
            return null;
        }
        return ff.a((byte) 86);
    }

    final void a(int param0, sa param1) {
        cn var3 = this.c((byte) 44);
        param1.a(var3, param0, false, -5, param1.field_y - var3.field_v >> -465314207);
    }

    final cn b(byte param0) {
        int var2 = -24 / ((-58 - param0) / 35);
        return this.c((byte) 25);
    }

    jf(wb param0) {
        ((jf) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Immortality", "Deaths are treated as incapacitation."};
        field_g = new long[32];
    }
}
