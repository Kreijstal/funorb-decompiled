/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends va {
    static String[] field_q;
    private int field_p;
    static o field_s;
    private ti field_r;

    final static ai a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        ai var9 = new ai(param8, param7, param6, param0, param5, param2, param1);
        fh.field_t.a((wl) (Object) var9, false);
        og.a(var9, param3, param4 + -160);
        if (param4 != 99) {
            Object var10 = null;
            ua discarded$0 = mg.a(88, (byte[]) null);
            return var9;
        }
        return var9;
    }

    final static ua a(int param0, byte[] param1) {
        int var2 = 97 / ((param0 - -30) / 48);
        if (param1 == null) {
            return null;
        }
        ua var3 = new ua(param1, ph.field_q, ne.field_h, cg.field_k, tf.field_b, ic.field_b, mf.field_j);
        eb.a(0);
        return var3;
    }

    mg(int param0) {
        super(param0);
    }

    public static void h(byte param0) {
        if (param0 != -102) {
            field_s = null;
            field_s = null;
            field_q = null;
            return;
        }
        field_s = null;
        field_q = null;
    }

    final void i(byte param0) {
        ((mg) this).field_m = (((mg) this).field_p - -7) / 8;
        if (param0 != -31) {
            field_q = null;
        }
    }

    final int m(int param0) {
        int var2 = -128 % ((param0 - -9) / 54);
        int fieldTemp$0 = ((mg) this).field_m;
        ((mg) this).field_m = ((mg) this).field_m + 1;
        return 255 & ((mg) this).field_k[fieldTemp$0] - ((mg) this).field_r.b((byte) 73);
    }

    final void c(byte param0, int param1) {
        int var3 = -41 / ((-1 - param0) / 44);
        int fieldTemp$0 = ((mg) this).field_m;
        ((mg) this).field_m = ((mg) this).field_m + 1;
        ((mg) this).field_k[fieldTemp$0] = (byte)(((mg) this).field_r.b((byte) 60) + param1);
    }

    final void l(int param0) {
        if (param0 != 19967) {
            return;
        }
        ((mg) this).field_p = ((mg) this).field_m * 8;
    }

    mg(byte[] param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        for (var5 = param2; var5 < param1; var5++) {
            int fieldTemp$0 = ((mg) this).field_m;
            ((mg) this).field_m = ((mg) this).field_m + 1;
            param3[var5 + param0] = (byte)(((mg) this).field_k[fieldTemp$0] + -((mg) this).field_r.b((byte) 125));
        }
    }

    final void a(int[] param0, byte param1) {
        if (param1 != 109) {
            return;
        }
        ((mg) this).field_r = new ti(param0);
    }

    final int g(int param0, int param1) {
        int var6 = wizardrun.field_H;
        if (param1 != -11719) {
            return 35;
        }
        int var3 = ((mg) this).field_p >> 1965781667;
        int var4 = 8 + -(((mg) this).field_p & 7);
        int var5 = 0;
        ((mg) this).field_p = ((mg) this).field_p + param0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((mg) this).field_k[incrementValue$0] & lj.field_b[var4]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 == param0) {
            var5 = var5 + (lj.field_b[var4] & ((mg) this).field_k[var3]);
        } else {
            var5 = var5 + (((mg) this).field_k[var3] >> var4 - param0 & lj.field_b[param0]);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
