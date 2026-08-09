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
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var5 = di.field_V;
              var1 = var5;
              if (param0 == -24322) {
                break L1;
              } else {
                field_a = 8;
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "ef.A(" + param0 + ')');
        }
    }

    static {
        field_d = "The rock blaster: the last word in portable, projectile demolition at an affordable price. Press <img=21> to fire high velocity explosives at your target. It's like dynamite without the waiting. Do not fire at close range.";
        field_a = 0;
    }
}
