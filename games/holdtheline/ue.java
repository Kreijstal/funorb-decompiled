/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        if (param0 != 8911) {
          ue.a(16);
          var2 = tc.field_j * tc.field_c - 1;
          L0: while (true) {
            if (var2 < 0) {
              return;
            } else {
              var3 = tc.field_b[var2];
              var4 = 16711935 & var3;
              var3 = var3 & 65280;
              var4 = var4 * param1;
              var4 = var4 & -16711936;
              var3 = var3 * param1;
              var3 = var3 & 16711680;
              var3 = var3 | var4;
              tc.field_b[var2] = var3 >>> 2094978856;
              var2--;
              continue L0;
            }
          }
        } else {
          var2 = tc.field_j * tc.field_c - 1;
          L1: while (true) {
            if (var2 < 0) {
              return;
            } else {
              var3 = tc.field_b[var2];
              var4 = 16711935 & var3;
              var3 = var3 & 65280;
              var4 = var4 * param1;
              var4 = var4 & -16711936;
              var3 = var3 * param1;
              var3 = var3 & 16711680;
              var3 = var3 | var4;
              tc.field_b[var2] = var3 >>> 2094978856;
              var2--;
              continue L1;
            }
          }
        }
    }

    final static hj a(boolean param0) {
        int var1 = 0;
        int[] var3 = null;
        int var4_int = 0;
        hj var4 = null;
        int var5 = 0;
        int[] var7 = null;
        byte[] var8 = null;
        int[] var9 = null;
        var5 = HoldTheLine.field_D;
        var1 = ad.field_d[0] * nk.field_K[0];
        var8 = lk.field_e[0];
        var9 = new int[var1];
        var7 = var9;
        var3 = var7;
        if (!param0) {
          field_b = null;
          var4_int = 0;
          L0: while (true) {
            if (var1 <= var4_int) {
              var4 = new hj(bo.field_b, ih.field_o, la.field_j[0], wb.field_g[0], nk.field_K[0], ad.field_d[0], var9);
              tk.a(false);
              return var4;
            } else {
              var3[var4_int] = dd.field_E[pk.a(255, (int) var8[var4_int])];
              var4_int++;
              continue L0;
            }
          }
        } else {
          var4_int = 0;
          L1: while (true) {
            if (var1 <= var4_int) {
              var4 = new hj(bo.field_b, ih.field_o, la.field_j[0], wb.field_g[0], nk.field_K[0], ad.field_d[0], var9);
              tk.a(false);
              return var4;
            } else {
              var3[var4_int] = dd.field_E[pk.a(255, (int) var8[var4_int])];
              var4_int++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 19857) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Next course: ";
        field_b = "start using this feature.";
        field_a = "Just play";
    }
}
