/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends li {
    int[] field_n;
    static int field_r;
    static String field_q;
    int field_p;
    boolean field_o;

    final static boolean a(int param0, int param1, int param2, r param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        if (param0 == 124) {
          var5 = param3.a(param1, param2, (byte) -119);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            lc.a(59, var5);
            return true;
          }
        } else {
          hq.a(true);
          var5 = param3.a(param1, param2, (byte) -119);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            lc.a(59, var5);
            return true;
          }
        }
    }

    public static void a(boolean param0) {
        field_q = null;
        if (param0) {
            field_r = 80;
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (qg.field_G + -640) / 2;
        var3 = ld.field_b * ld.field_b;
        if (param1 >= -126) {
          hq.a(false);
          var4 = var3 + -(param0 * param0);
          hk.field_o.a(94, 199, -124 + (bi.field_j + -90), 90, var2 + -(var4 * 199 / var3));
          lb.field_c.a(118, 438, bi.field_j - 124, 0, var4 * 438 / var3 + (202 + var2));
          return;
        } else {
          var4 = var3 + -(param0 * param0);
          hk.field_o.a(94, 199, -124 + (bi.field_j + -90), 90, var2 + -(var4 * 199 / var3));
          lb.field_c.a(118, 438, bi.field_j - 124, 0, var4 * 438 / var3 + (202 + var2));
          return;
        }
    }

    hq() {
        ((hq) this).field_o = false;
    }

    final static er[] a(er[] param0, int param1) {
        int var2 = 0;
        er var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 != 202) {
          var5 = null;
          boolean discarded$2 = hq.a(33, -77, -100, (r) null);
          var2 = 0;
          L0: while (true) {
            if (param0.length <= var2) {
              return param0;
            } else {
              var3 = param0[var2];
              param0[var2].field_z = 0;
              var3.field_C = 0;
              param0[var2].field_x = param0[var2].field_y;
              param0[var2].field_B = param0[var2].field_t;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          L1: while (true) {
            if (param0.length <= var2) {
              return param0;
            } else {
              var3 = param0[var2];
              param0[var2].field_z = 0;
              var3.field_C = 0;
              param0[var2].field_x = param0[var2].field_y;
              param0[var2].field_B = param0[var2].field_t;
              var2++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "<%0> has entered another game.";
    }
}
