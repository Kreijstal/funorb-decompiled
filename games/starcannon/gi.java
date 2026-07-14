/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_c;
    private hl[] field_d;
    static rk field_a;
    static int field_e;
    static String[] field_f;
    static qe field_b;
    static boolean field_g;

    final static hl[] a(int param0, int param1) {
        hl[] var2 = null;
        hl[] var3 = null;
        if (param0 != 4477) {
          field_g = false;
          var3 = new hl[9];
          var2 = var3;
          var3[4] = oj.a(0, param1, 64);
          return var2;
        } else {
          var3 = new hl[9];
          var2 = var3;
          var3[4] = oj.a(0, param1, 64);
          return var2;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = StarCannon.field_A;
        var1 = ki.field_j;
        var2 = ki.field_f;
        var3 = -1 + var2 * var1;
        L0: while (true) {
          if ((var3 ^ -1) > -1) {
            jj.field_A.e();
            sc.a(3, bi.field_a.field_B, 3, 30603);
            hg.field_y.b(33);
            if (param0 != 4) {
              return;
            } else {
              jj.field_A.b(0, 0, 640, 480, se.field_u);
              return;
            }
          } else {
            L1: {
              var4 = ki.field_a[var3];
              var5 = 0;
              if ((var4 & 8388608) != 8388608) {
                break L1;
              } else {
                var5 = var5 | var4 & 8323072;
                break L1;
              }
            }
            L2: {
              if ((var4 & 32768 ^ -1) != -32769) {
                break L2;
              } else {
                var5 = var5 | var4 & 32512;
                break L2;
              }
            }
            L3: {
              if ((128 & var4) != 128) {
                break L3;
              } else {
                var5 = var5 | var4 & 127;
                break L3;
              }
            }
            bi.field_a.field_B[var3] = var5 << -814369855;
            var3--;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 640) {
            hl[] discarded$0 = gi.a(-22, -65);
        }
    }

    gi(hl[] param0) {
        ((gi) this).field_d = param0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -49 % ((param2 - 30) / 40);
        ba.a(param4, ((gi) this).field_d, (byte) 43, param0, param1, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[16];
        field_c = "Highscores";
        field_a = new rk();
    }
}
