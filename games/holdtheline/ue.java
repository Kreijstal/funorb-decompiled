/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = tc.field_j * tc.field_c - 1;
            L1: while (true) {
              if (var2_int < 0) {
                break L0;
              } else {
                var3 = tc.field_b[var2_int];
                var4 = 16711935 & var3;
                var3 = var3 & 65280;
                var4 = var4 * param1;
                var4 = var4 & -16711936;
                var3 = var3 * param1;
                var3 = var3 & 16711680;
                var3 = var3 | var4;
                tc.field_b[var2_int] = var3 >>> 8;
                var2_int--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "ue.A(" + 8911 + ',' + param1 + ')');
        }
    }

    final static hj a(boolean param0) {
        int var4_int = 0;
        int var5 = HoldTheLine.field_D;
        int var1 = ad.field_d[0] * nk.field_K[0];
        byte[] var2 = lk.field_e[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = dd.field_E[pk.a(255, (int) var2[var4_int])];
        }
        hj var4 = new hj(bo.field_b, ih.field_o, la.field_j[0], wb.field_g[0], nk.field_K[0], ad.field_d[0], var3);
        tk.a(false);
        return var4;
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
