/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends gk {
    private ol field_j;
    private int field_i;
    static le[][] field_m;
    static int field_n;
    static int[] field_k;
    static int[] field_l;

    final void b(boolean param0, int param1) {
        ((hb) this).field_h = ((hb) this).field_h + 1;
        ((hb) this).field_g[((hb) this).field_h] = (byte)(param1 + ((hb) this).field_j.c(0));
        if (!param0) {
            ((hb) this).field_i = -91;
        }
    }

    final void a(int[] param0, int param1) {
        if (param1 != 0) {
            hb.b((byte) 106, 53);
        }
        ((hb) this).field_j = new ol(param0);
    }

    final void p(int param0) {
        ((hb) this).field_i = param0 * ((hb) this).field_h;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        nc.field_b[fd.field_n] = param1;
        hl.field_f[fd.field_n] = fd.field_n;
        gi.field_e[fd.field_n] = param3;
        if (param3 > kj.field_G) {
            fe.field_g = param3;
        }
        if (ah.field_j > param3) {
            rh.field_C = param3;
        }
        jc.field_a[fd.field_n] = param2;
        hf.field_c[fd.field_n] = param0;
        rb.field_fb[fd.field_n] = param5;
        int var6 = param0 + (param2 + param5);
        int var7 = var6 == 0 ? 0 : param2 * 1000 / var6;
        cj.field_c[fd.field_n] = var7;
        if (param4 != 1000) {
            field_k = null;
        }
        if (!(var7 >= rh.field_C)) {
            rh.field_C = var7;
        }
        if (fe.field_g < var7) {
            fe.field_g = var7;
        }
        fd.field_n = fd.field_n + 1;
    }

    final int r(int param0) {
        int var2 = -21 % ((-81 - param0) / 36);
        ((hb) this).field_h = ((hb) this).field_h + 1;
        return ((hb) this).field_g[((hb) this).field_h] - ((hb) this).field_j.c(0) & 255;
    }

    final static int a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          var1 = 0;
          if (!param0) {
            break L0;
          } else {
            hb.d((byte) 17);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 5) {
            return var1;
          } else {
            if (fd.field_o[var2]) {
              var1++;
              var2++;
              continue L1;
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_l = null;
        field_k = null;
        field_m = null;
        if (param0 < 108) {
            hb.b(91, true);
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 118) {
            return;
        }
        for (var5 = 0; param2 > var5; var5++) {
            ((hb) this).field_h = ((hb) this).field_h + 1;
            param3[var5 - -param1] = (byte)(((hb) this).field_g[((hb) this).field_h] + -((hb) this).field_j.c(0));
        }
    }

    final void q(int param0) {
        int var2 = -106 % ((param0 - -25) / 59);
        ((hb) this).field_h = (((hb) this).field_i + 7) / 8;
    }

    hb(byte[] param0) {
        super(param0);
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        w.a((byte) -92, kj.field_G, fd.field_n, 0, true, ah.field_j, param1);
        for (var2 = 0; var2 < fd.field_n; var2++) {
            hl.field_f[var2 + param1] = var2;
        }
        if (param0 <= 90) {
            hb.a(-29, -107, -3, 17, 7, 5);
        }
        w.a((byte) -78, fe.field_g, param1 + fd.field_n, param1, false, rh.field_C, param1 + param1);
        if (fd.field_n > param1) {
            fd.field_n = param1;
        }
    }

    hb(int param0) {
        super(param0);
    }

    final static int a(int param0, aj param1, aj param2) {
        if (param0 != -7468) {
            field_l = null;
        }
        Object var4 = null;
        return qh.a(0, param1, -1, false, param2, 0, (String) null);
    }

    final int f(int param0, int param1) {
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3 = ((hb) this).field_i >> -1303496093;
        int var4 = -(((hb) this).field_i & 7) + param0;
        int var5 = 0;
        ((hb) this).field_i = ((hb) this).field_i + param1;
        while (var4 < param1) {
            var3++;
            var5 = var5 + ((nd.field_d[var4] & ((hb) this).field_g[var3]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (((hb) this).field_g[var3] >> var4 + -param1 & nd.field_d[param1]);
        } else {
            var5 = var5 + (((hb) this).field_g[var3] & nd.field_d[var4]);
        }
        return var5;
    }

    final static void b(int param0, boolean param1) {
        int var2 = -57 % ((param0 - 52) / 40);
        cc.a(192, true, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_k = new int[256];
        field_l = new int[1024];
        field_m = new le[5][];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_k[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> -751376063;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
