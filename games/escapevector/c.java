/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends n {
    static ed field_n;
    private int field_r;
    static String[] field_q;
    static String field_p;
    static long[] field_t;
    static String field_o;
    static boolean field_u;
    private df field_s;

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (param1 != 19583) {
          return;
        } else {
          var5 = 0;
          L0: while (true) {
            if (param2 <= var5) {
              return;
            } else {
              ((c) this).field_m = ((c) this).field_m + 1;
              param0[param3 + var5] = (byte)(((c) this).field_g[((c) this).field_m] + -((c) this).field_s.a(1736563940));
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void m(int param0) {
        if (!(null == bk.field_r)) {
            bk.field_r.a((byte) 33);
        }
        int var1 = -128 / ((param0 - 16) / 38);
    }

    final void l(int param0) {
        ((c) this).field_r = 8 * ((c) this).field_m;
        if (param0 != -17928) {
            c.n(-97);
        }
    }

    final void o(int param0) {
        if (param0 != -3879) {
          int discarded$2 = ((c) this).j(-61, -116);
          ((c) this).field_m = (((c) this).field_r + 7) / 8;
          return;
        } else {
          ((c) this).field_m = (((c) this).field_r + 7) / 8;
          return;
        }
    }

    public static void n(int param0) {
        field_t = null;
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0 < 105) {
          c.m(19);
          field_n = null;
          return;
        } else {
          field_n = null;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
          return;
        } else {
          ((c) this).field_m = ((c) this).field_m + 1;
          ((c) this).field_g[((c) this).field_m] = (byte)(((c) this).field_s.a(1736563940) + param0);
          return;
        }
    }

    final static void p(int param0) {
        c var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        var1 = om.field_c;
        L0: while (true) {
          if (!ea.c((byte) -115)) {
            if (param0 != 11197) {
              c.p(-41);
              return;
            } else {
              return;
            }
          } else {
            var1.a(8, true);
            var1.field_m = var1.field_m + 1;
            var2 = var1.field_m + 1;
            mf.a(param0 ^ -25858, var1);
            om.field_c.e(82, var1.field_m + -var2);
            continue L0;
          }
        }
    }

    final void a(int[] param0, byte param1) {
        if (param1 < 80) {
            return;
        }
        ((c) this).field_s = new df(param0);
    }

    c(int param0) {
        super(param0);
    }

    final int k(int param0) {
        if (param0 != 8) {
          field_u = false;
          ((c) this).field_m = ((c) this).field_m + 1;
          return 255 & ((c) this).field_g[((c) this).field_m] + -((c) this).field_s.a(1736563940);
        } else {
          ((c) this).field_m = ((c) this).field_m + 1;
          return 255 & ((c) this).field_g[((c) this).field_m] + -((c) this).field_s.a(1736563940);
        }
    }

    final int j(int param0, int param1) {
        int var6 = EscapeVector.field_A;
        int var3 = ((c) this).field_r >> -1442743357;
        int var4 = -(7 & ((c) this).field_r) + param1;
        ((c) this).field_r = ((c) this).field_r + param0;
        int var5 = 0;
        while (var4 < param0) {
            var3++;
            var5 = var5 + ((((c) this).field_g[var3] & ol.field_ab[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 != param0) {
            var5 = var5 + (((c) this).field_g[var3] >> var4 + -param0 & ol.field_ab[param0]);
        } else {
            var5 = var5 + (ol.field_ab[var4] & ((c) this).field_g[var3]);
        }
        return var5;
    }

    c(byte[] param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"virtual", "virtual", "virtual", "virtual"};
        field_t = new long[32];
        field_o = "Waiting for fonts";
        field_p = "Go Back";
    }
}
