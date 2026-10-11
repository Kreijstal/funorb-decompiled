/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static int[][] field_a;
    static String field_b;

    final static int a(byte param0, int param1) {
        int var2 = 108 / ((param0 + 15) / 39);
        if (0 != (e.field_a[param1] & 41)) {
          return 512;
        }
        if (param1 != 15) {
          return 1024;
        }
        return 128;
    }

    final static void a(int param0, float param1, String param2) {
        try {
          pb.field_a = param1;
          if (param0 != 128) {
            field_a = (int[][]) null;
          }
          qi.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ud.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
          var5 = rf.field_a;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 < -78) {
            return;
          }
          ud.a(30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "ud.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (String) null;
          field_a = (int[][]) null;
          field_b = null;
          return;
        }
        field_a = (int[][]) null;
        field_b = null;
    }

    static {
    }
}
