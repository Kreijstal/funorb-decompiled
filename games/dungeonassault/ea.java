/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_a;
    static String field_b;

    final static lh b() {
        int var1 = 0;
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
          var1 = -32;
          return jm.field_h;
        } else {
          var1 = -32;
          return jm.field_h;
        }
    }

    final static int[][] a(byte param0) {
        if (param0 != 13) {
            int[][] discarded$0 = ea.a((byte) 114);
            return dg.field_L;
        }
        return dg.field_L;
    }

    final static void c() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var5 = gg.field_a;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1_ref, "ea.C(" + 0 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Poison Gas";
        field_a = "Vampire Lord";
    }
}
