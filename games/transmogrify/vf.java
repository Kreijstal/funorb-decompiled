/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static ti field_a;
    static hi field_b;

    final static void a(byte param0, float param1, String param2) {
        try {
            ea.field_n = param2;
            int var3_int = -91 / ((param0 - -66) / 55);
            ah.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "vf.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(pg param0, int param1, int param2, int param3) {
        try {
            dg.field_b = param2;
            if (param3 <= 96) {
                vf.a(false);
            }
            tj.field_y = param1;
            kf.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "vf.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            vf.b(false);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void b(boolean param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5 = mh.field_b;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                if (param0) {
                  break L0;
                } else {
                  field_a = null;
                  return;
                }
              } else {
                int incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                int incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                int incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                int incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                int incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                int incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                int incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                int incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1_ref, "vf.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new hi();
    }
}
