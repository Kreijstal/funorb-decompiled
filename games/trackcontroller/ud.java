/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static int[][] field_a;
    static String field_b;

    final static int a(byte param0, int param1) {
        int var2 = 108 / ((param0 - -15) / 39);
        if (0 != (e.field_a[param1] & 41)) {
            return 512;
        }
        if (!(param1 == 15)) {
            return 1024;
        }
        return 128;
    }

    final static void a(int param0, float param1, String param2) {
        try {
            pb.field_a = param1;
            if (param0 != 128) {
                field_a = null;
            }
            qi.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ud.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var5 = rf.field_a;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                if (param0 < -78) {
                  break L0;
                } else {
                  ud.a(30);
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
          throw sl.a((Throwable) (Object) var1_ref, "ud.C(" + param0 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    static {
    }
}
