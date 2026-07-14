/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_f;
    static String field_e;
    static int[] field_d;
    static String field_b;
    static int field_a;
    static String field_c;

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        var3 = 0;
        var4 = fc.field_a;
        L0: while (true) {
          if (rk.field_P.length <= var3) {
            if (param1 != -81) {
              return -50;
            } else {
              return -1;
            }
          } else {
            var5 = k.field_g[var3];
            if (-1 >= (var5 ^ -1)) {
              var6 = si.a(false, rk.field_P[var3], true);
              var7 = qk.field_d - (var6 >> -1844375231);
              var4 = var4 + qk.field_m;
              if (gi.a(17, param2, param0, var6 + (mb.field_c << 242737281), var4, (pa.field_Y << 1992180769) + cc.field_a, var7 - mb.field_c)) {
                return var5;
              } else {
                var4 = var4 + (qk.field_m + ((pa.field_Y << -922946463) - -cc.field_a));
                var3++;
                var3++;
                continue L0;
              }
            } else {
              var4 = var4 + ke.field_d;
              var3++;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0) {
        if (!jh.field_h) {
          if (param0 != 54) {
            int discarded$4 = ub.a(-56, (byte) 45, 35);
            return;
          } else {
            return;
          }
        } else {
          hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
          ie.field_c.a(1141039778, false);
          if (param0 == 54) {
            return;
          } else {
            int discarded$5 = ub.a(-56, (byte) 45, 35);
            return;
          }
        }
    }

    final static sb a(int param0, int param1, int param2, int param3) {
        sb var4 = null;
        var4 = new sb();
        if (param3 <= 95) {
          field_f = null;
          var4.field_q = new int[param0];
          var4.field_r = param2;
          ef.field_S.a((bh) (Object) var4, 2777);
          oi.a(-102, param1, var4);
          return var4;
        } else {
          var4.field_q = new int[param0];
          var4.field_r = param2;
          ef.field_S.a((bh) (Object) var4, 2777);
          oi.a(-102, param1, var4);
          return var4;
        }
    }

    public static void b(byte param0) {
        if (param0 > -17) {
          field_e = null;
          field_f = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_e = "Player";
        field_d = new int[36];
        field_a = 0;
        field_b = "Ready...";
    }
}
