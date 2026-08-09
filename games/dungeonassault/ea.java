/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_a;
    static String field_b;

    final static lh b(int param0) {
        int var1;
        if (jm.field_h == null) {
          jm.field_h = new lh();
          jm.field_h.a(-2, lp.field_C);
          jm.field_h.field_e = 6;
          jm.field_h.field_i = 14;
          jm.field_h.field_k = 7697781;
          jm.field_h.field_j = 2763306;
          jm.field_h.field_f = ta.field_e;
          jm.field_h.field_h = 4;
          jm.field_h.field_l = 0;
          jm.field_h.field_g = 5;
          var1 = -32 / ((param0 - 70) / 46);
          return jm.field_h;
        } else {
          var1 = -32 / ((param0 - 70) / 46);
          return jm.field_h;
        }
    }

    final static int[][] a(byte param0) {
        if (param0 != 13) {
            ea.a((byte) 114);
            return dg.field_L;
        }
        return dg.field_L;
    }

    final static void c(int param0) {
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
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var5 = gg.field_a;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
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
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "ea.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            ea.a((byte) 19);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Poison Gas";
        field_a = "Vampire Lord";
    }
}
