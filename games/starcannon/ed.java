/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends c {
    private int field_l;
    private c field_m;
    static java.math.BigInteger field_j;
    static hl field_k;
    static tc field_q;
    static int field_p;
    static int field_n;
    static hl[] field_o;

    public static void b(byte param0) {
        field_k = null;
        if (param0 != -61) {
            return;
        }
        field_o = null;
        field_q = null;
        field_j = null;
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        if (param0 != -1) {
          return null;
        } else {
          var4 = param1.indexOf(param3);
          L0: while (true) {
            if (-1 == var4) {
              return param1;
            } else {
              param1 = param1.substring(0, var4) + param2 + param1.substring(param3.length() + var4);
              var4 = param1.indexOf(param3, param2.length() + var4);
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, qe param3, int param4, int param5, int param6, int param7, int param8, int param9, hl param10) {
        int var11 = -45 / ((param5 - 9) / 47);
        ue.field_e = param0;
        nd.field_k = param2;
        w.field_v = param6;
        cb.field_f = param9;
        gi.field_e = param7;
        td.field_p = param1;
        eh.field_h = param4;
        re.field_l = param10;
    }

    final c a() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        if (!(param2 >= ((ed) this).field_l)) {
            ((ed) this).field_l = ((ed) this).field_l - param2;
            return;
        }
        param2 = param2 - ((ed) this).field_l;
        param1 = param1 + ((ed) this).field_l;
        ((ed) this).field_m.field_d = ((ed) this).field_d;
        ((ed) this).field_l = 0;
        ((ed) this).field_m.field_a = ((ed) this).field_a;
        ((ed) this).field_d.field_a = (rf) (Object) ((ed) this).field_m;
        ((ed) this).field_a.field_d = (rf) (Object) ((ed) this).field_m;
        ((ed) this).field_a = null;
        ((ed) this).field_d = null;
        if (!(param2 <= 0)) {
            ((ed) this).field_m.a(param0, param1, param2);
        }
    }

    final int b() {
        return 0;
    }

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = StarCannon.field_A;
        var7 = jf.field_a;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        var2 = 0;
        var3 = var7.length;
        if (param0 > -120) {
          field_k = null;
          L0: while (true) {
            if (var3 > var2) {
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var3 > var2) {
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    ed(c param0, int param1) {
        ((ed) this).field_m = param0;
        ((ed) this).field_f = ((ed) this).field_m.field_f;
        ((ed) this).field_l = param1;
    }

    final c c() {
        return null;
    }

    final void a(int param0) {
        if (!(((ed) this).field_l <= param0)) {
            ((ed) this).field_l = ((ed) this).field_l - param0;
            return;
        }
        param0 = param0 - ((ed) this).field_l;
        ((ed) this).field_m.field_d = ((ed) this).field_d;
        ((ed) this).field_l = 0;
        ((ed) this).field_m.field_a = ((ed) this).field_a;
        ((ed) this).field_d.field_a = (rf) (Object) ((ed) this).field_m;
        ((ed) this).field_a.field_d = (rf) (Object) ((ed) this).field_m;
        ((ed) this).field_d = null;
        ((ed) this).field_a = null;
        if (!((param0 ^ -1) >= -1)) {
            ((ed) this).field_m.a(param0);
        }
    }

    final int d() {
        return ((ed) this).field_m.d();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new java.math.BigInteger("65537");
    }
}
