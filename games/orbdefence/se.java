/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends mg {
    private int field_p;
    private re field_o;
    static String field_n;

    final void m(int param0) {
        ((se) this).field_i = (param0 + ((se) this).field_p) / 8;
    }

    final int h(int param0, int param1) {
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var3 = ((se) this).field_p >> -369527613;
        int var4 = -(((se) this).field_p & 7) + param1;
        int var5 = 0;
        ((se) this).field_p = ((se) this).field_p + param0;
        while (param0 > var4) {
            var3++;
            var5 = var5 + ((sk.field_I[var4] & ((se) this).field_j[var3]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((se) this).field_j[var3] >> -param0 + var4 & sk.field_I[param0]);
        } else {
            var5 = var5 + (sk.field_I[var4] & ((se) this).field_j[var3]);
        }
        return var5;
    }

    final int o(int param0) {
        if (param0 >= -22) {
            int discarded$0 = ((se) this).h(69, 70);
            ((se) this).field_i = ((se) this).field_i + 1;
            return ((se) this).field_j[((se) this).field_i] + -((se) this).field_o.a(128) & 255;
        }
        ((se) this).field_i = ((se) this).field_i + 1;
        return ((se) this).field_j[((se) this).field_i] + -((se) this).field_o.a(128) & 255;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        int var5 = 6 % ((33 - param0) / 61);
        for (var6 = 0; var6 < param3; var6++) {
            ((se) this).field_i = ((se) this).field_i + 1;
            param2[var6 + param1] = (byte)(((se) this).field_j[((se) this).field_i] + -((se) this).field_o.a(128));
        }
    }

    public static void e(boolean param0) {
        field_n = null;
        if (param0) {
            Object var2 = null;
            se.a((String) null, (byte) -75, 110);
        }
    }

    final void i(int param0, int param1) {
        ((se) this).field_i = ((se) this).field_i + 1;
        ((se) this).field_j[((se) this).field_i] = (byte)(((se) this).field_o.a(128) + param0);
        int var3 = -34 / ((21 - param1) / 58);
    }

    final static void a(gj param0, int param1, int param2) {
        se var3 = null;
        if (param2 >= -37) {
            field_n = null;
            var3 = uk.field_b;
            var3.i(param1, -116);
            var3.a(5, -9);
            var3.a(0, -30);
            var3.b((byte) -60, param0.field_o);
            var3.a(param0.field_m, -4);
            var3.a(param0.field_n, -79);
            return;
        }
        var3 = uk.field_b;
        var3.i(param1, -116);
        var3.a(5, -9);
        var3.a(0, -30);
        var3.b((byte) -60, param0.field_o);
        var3.a(param0.field_m, -4);
        var3.a(param0.field_n, -79);
    }

    final void n(int param0) {
        ((se) this).field_p = ((se) this).field_i * 8;
        if (param0 != 9471) {
            ((se) this).field_o = null;
        }
    }

    final static void a(String param0, byte param1, int param2) {
        int var3 = 0;
        oe.field_p = false;
        ca.field_b = false;
        if (oj.field_q == null) {
            var3 = -102 % ((param1 - -27) / 52);
            return;
        }
        if (!oj.field_q.field_A) {
            var3 = -102 % ((param1 - -27) / 52);
            return;
        }
        if (param2 == 8) {
            if (!vh.field_j) {
                param0 = ii.field_e;
            } else {
                param0 = km.field_b;
            }
            param2 = 2;
            ig.field_ib.a(127, vh.field_k);
        }
        var3 = 1;
        if ((param2 ^ -1) == -11) {
            var3 = 0;
            dc.a((byte) -108);
        }
        if (var3 != 0) {
            if (!(!ca.field_b)) {
                param0 = t.a(-415993727, new String[1], kg.field_g);
            }
            if (!(!jc.field_j)) {
                param0 = mh.field_f;
            }
            oj.field_q.a(-92, param2, param0);
        }
        if (256 == param2) {
            var3 = -102 % ((param1 - -27) / 52);
            return;
        }
        if (param2 == 10) {
            var3 = -102 % ((param1 - -27) / 52);
            return;
        }
        if (!vh.field_j) {
            ig.field_ib.m(-114);
            var3 = -102 % ((param1 - -27) / 52);
            return;
        }
        var3 = -102 % ((param1 - -27) / 52);
    }

    se(byte[] param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        ((se) this).field_o = new re(param0);
        if (param1 != 3777) {
            ((se) this).field_o = null;
        }
    }

    se(int param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "From only <%0>/month";
    }
}
