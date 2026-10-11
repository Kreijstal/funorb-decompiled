/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static double field_c;
    static String field_a;
    static String field_d;
    static bi field_b;

    public static void a(byte param0) {
        int var1 = -40 / ((-70 - param0) / 52);
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var3 = 0;
        ce stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        ce var2 = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          var1_int = 0;
          if (param0 != -11) {
            return;
          }
          while (var1_int < 10) {
            if (fb.field_d[var1_int] != null) {
              if ((ih.field_a & 1 << var1_int) == 0) {
                stackIn_10_0 = pn.field_a;
              } else {
                stackIn_10_0 = vg.field_I;
              }
              var2 = stackIn_10_0;
              var2.c(fb.field_d[var1_int], sc.field_d[var1_int], uh.field_g[var1_int] >> 4, 16777215, -1);
            }
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ne.B(" + param0 + ')');
        }
    }

    static {
        field_c = Math.atan2(1.0, 0.0);
        field_a = "Homing energy weapons";
        field_d = "Connection restored.";
    }
}
