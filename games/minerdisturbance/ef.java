/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static ea[] field_b;
    static java.awt.Canvas field_c;
    static String field_d;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 101) {
            ef.a(-123);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = MinerDisturbance.field_ab;
        var7 = di.field_V;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 != -24322) {
          field_a = 8;
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$32 = var2;
              var2++;
              var5[incrementValue$32] = 0;
              int incrementValue$33 = var2;
              var2++;
              var5[incrementValue$33] = 0;
              int incrementValue$34 = var2;
              var2++;
              var5[incrementValue$34] = 0;
              int incrementValue$35 = var2;
              var2++;
              var5[incrementValue$35] = 0;
              int incrementValue$36 = var2;
              var2++;
              var5[incrementValue$36] = 0;
              int incrementValue$37 = var2;
              var2++;
              var5[incrementValue$37] = 0;
              int incrementValue$38 = var2;
              var2++;
              var5[incrementValue$38] = 0;
              int incrementValue$39 = var2;
              var2++;
              var5[incrementValue$39] = 0;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$40 = var2;
              var2++;
              var5[incrementValue$40] = 0;
              int incrementValue$41 = var2;
              var2++;
              var5[incrementValue$41] = 0;
              int incrementValue$42 = var2;
              var2++;
              var5[incrementValue$42] = 0;
              int incrementValue$43 = var2;
              var2++;
              var5[incrementValue$43] = 0;
              int incrementValue$44 = var2;
              var2++;
              var5[incrementValue$44] = 0;
              int incrementValue$45 = var2;
              var2++;
              var5[incrementValue$45] = 0;
              int incrementValue$46 = var2;
              var2++;
              var5[incrementValue$46] = 0;
              int incrementValue$47 = var2;
              var2++;
              var5[incrementValue$47] = 0;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The rock blaster: the last word in portable, projectile demolition at an affordable price. Press <img=21> to fire high velocity explosives at your target. It's like dynamite without the waiting. Do not fire at close range.";
        field_a = 0;
    }
}
