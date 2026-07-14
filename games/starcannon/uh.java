/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uh extends rf {
    static p field_g;
    uh field_m;
    long field_j;
    uh field_f;
    static volatile int field_i;
    static pf field_k;
    static String[] field_h;
    static vi field_l;

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = StarCannon.field_A;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = param1; param0 > var4; var4++) {
            var6[var4] = param2;
        }
        return new String(var6);
    }

    final static String a(int param0, byte[] param1) {
        if (param0 <= 111) {
          field_h = null;
          return va.a(0, 83, param1, param1.length);
        } else {
          return va.a(0, 83, param1, param1.length);
        }
    }

    public static void b(byte param0) {
        int var1 = -50 % ((param0 - 2) / 46);
        field_l = null;
        field_k = null;
        field_g = null;
        field_h = null;
    }

    final static hl c(byte param0) {
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        hl var4 = null;
        int var5 = 0;
        var5 = StarCannon.field_A;
        var1 = gg.field_d[0] * gh.field_C[0];
        var2 = og.field_c[0];
        var3 = new int[var1];
        var4_int = 0;
        L0: while (true) {
          if (var1 <= var4_int) {
            var4 = new hl(td.field_m, gb.field_w, fc.field_d[0], qd.field_H[0], gg.field_d[0], gh.field_C[0], var3);
            if (param0 < 2) {
              field_i = 55;
              rc.b((byte) -121);
              return var4;
            } else {
              rc.b((byte) -121);
              return var4;
            }
          } else {
            var3[var4_int] = of.field_g[w.a(255, (int) var2[var4_int])];
            var4_int++;
            continue L0;
          }
        }
    }

    protected uh() {
    }

    final void a(int param0) {
        if (!(((uh) this).field_f != null)) {
            return;
        }
        ((uh) this).field_f.field_m = ((uh) this).field_m;
        ((uh) this).field_m.field_f = ((uh) this).field_f;
        ((uh) this).field_f = null;
        ((uh) this).field_m = null;
        if (param0 != -6242) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new p();
        field_i = 0;
    }
}
