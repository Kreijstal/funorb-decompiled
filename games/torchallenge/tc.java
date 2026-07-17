/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends da {
    static int[][] field_m;
    int field_j;
    int[] field_n;
    static we field_o;
    static int field_l;
    boolean field_i;
    static boolean field_k;

    final static void a(h param0, h param1, byte param2, int param3, int param4, int param5) {
        try {
            kk.field_e = param1;
            if (param2 != 27) {
                tc.c(-10);
            }
            ai.field_a = param3;
            tf.field_f = param0;
            uc.field_Y = param5;
            ni.field_i = param4;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "tc.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = 124 % ((param0 - -32) / 63);
        if (null != te.field_b) {
          var2 = (Object) (Object) te.field_b;
          synchronized (var2) {
            L0: {
              te.field_b = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    tc() {
    }

    public static void a(int param0) {
        field_m = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[][]{new int[3], new int[2], new int[4], new int[6], new int[3], new int[1], new int[6]};
    }
}
