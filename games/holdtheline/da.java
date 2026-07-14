/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends th {
    static da field_p;
    private int field_q;
    private int field_t;
    static String field_s;
    private wn field_r;
    static int[] field_u;

    final void h(byte param0) {
        if (8 > ((da) this).field_t) {
            ((da) this).field_l = ((da) this).field_l + 1;
            ((da) this).field_t = 8;
        }
        if (param0 != 0) {
            field_s = null;
        }
    }

    final int h(int param0, int param1) {
        int var6 = HoldTheLine.field_D;
        int var3 = ((da) this).field_q >> -69987869;
        int var4 = 8 + -(((da) this).field_q & param1);
        int var5 = 0;
        ((da) this).field_q = ((da) this).field_q + param0;
        while (param0 > var4) {
            var3++;
            var5 = var5 + ((vd.field_c[var4] & ((da) this).field_i[var3]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((da) this).field_i[var3] >> -param0 + var4 & vd.field_c[param0]);
        } else {
            var5 = var5 + (vd.field_c[var4] & ((da) this).field_i[var3]);
        }
        return var5;
    }

    public static void m(int param0) {
        field_p = null;
        field_s = null;
        int var1 = 121 / ((29 - param0) / 58);
        field_u = null;
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        for (var5 = 0; var5 < param1; var5++) {
            ((da) this).field_l = ((da) this).field_l + 1;
            param0[param2 + var5] = (byte)(((da) this).field_i[((da) this).field_l] + -((da) this).field_r.c(256));
        }
        if (!param3) {
            field_p = null;
        }
    }

    final void c(byte param0, int param1) {
        ((da) this).field_l = ((da) this).field_l + 1;
        ((da) this).field_i[((da) this).field_l] = (byte)(param1 + ((da) this).field_r.c(wb.a((int) param0, 289)));
        if (param0 != 33) {
            ((da) this).field_q = -105;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = HoldTheLine.field_D;
        param2 = param2 & vd.field_c[param1];
        int var4 = 39 % ((14 - param0) / 57);
        while (((da) this).field_t < param1) {
            param1 = param1 - ((da) this).field_t;
            ((da) this).field_l = ((da) this).field_l + 1;
            ((da) this).field_i[((da) this).field_l] = (byte)(((da) this).field_i[((da) this).field_l] + (param2 >>> param1));
            ((da) this).field_i[((da) this).field_l] = (byte) 0;
            ((da) this).field_t = 8;
        }
        if (param1 == ((da) this).field_t) {
            ((da) this).field_l = ((da) this).field_l + 1;
            ((da) this).field_i[((da) this).field_l] = (byte)(((da) this).field_i[((da) this).field_l] + param2);
            ((da) this).field_i[((da) this).field_l] = (byte) 0;
            ((da) this).field_t = 8;
        } else {
            ((da) this).field_t = ((da) this).field_t - param1;
            ((da) this).field_i[((da) this).field_l] = (byte)(((da) this).field_i[((da) this).field_l] + (param2 << ((da) this).field_t));
        }
    }

    final void l(int param0) {
        if (param0 > -6) {
            ((da) this).field_r = null;
        }
        ((da) this).field_l = (((da) this).field_q - -7) / 8;
    }

    final void i(byte param0) {
        ((da) this).field_i[((da) this).field_l] = (byte)param0;
        ((da) this).field_t = 8;
    }

    final static void a(boolean param0, String param1, int param2) {
        gn.field_g = param0 ? true : false;
        aa.field_k = true;
        if (param2 != 22676) {
            return;
        }
        sb.field_c = new ab(ka.field_b, de.field_I, param1, ci.field_o, gn.field_g);
        ka.field_b.a((n) (Object) sb.field_c, false);
    }

    final void a(int[] param0, boolean param1) {
        ((da) this).field_r = new wn(param0);
        if (param1) {
            int discarded$0 = ((da) this).g((byte) 92);
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            field_u = null;
        }
        ((da) this).field_q = ((da) this).field_l * 8;
    }

    da(int param0) {
        super(param0);
    }

    final int g(byte param0) {
        int var2 = 82 % ((param0 - 21) / 52);
        ((da) this).field_l = ((da) this).field_l + 1;
        return ((da) this).field_i[((da) this).field_l] - ((da) this).field_r.c(256) & 255;
    }

    da(byte[] param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Resume";
    }
}
