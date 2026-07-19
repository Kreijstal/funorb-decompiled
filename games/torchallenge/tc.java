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
            throw oj.a((Throwable) ((Object) runtimeException), "tc.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = 124 % ((param0 - -32) / 63);
        if (null != te.field_b) {
          var2 = te.field_b;
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
        field_m = (int[][]) null;
        if (param0 < 97) {
            field_m = (int[][]) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        field_m = new int[][]{new int[]{-1, 0, 1}, new int[]{-1, 0}, new int[]{-1, 0, 1, -1}, new int[]{-1, -1, -1, -1, -1, -1}, new int[]{-1, 0, 1}, new int[]{-1}, new int[]{-1, -1, -1, -1, -1, -1}};
    }
}
