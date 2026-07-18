/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static byte[] field_e;
    static String field_c;
    static String field_d;
    static ce field_b;
    static int[] field_a;

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        if (param0 != 8742) {
          field_d = null;
          param1 = param1 | param1 >>> 16;
          return param1 - -1;
        } else {
          param1 = param1 | param1 >>> 16;
          return param1 - -1;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, hn param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hg var7 = null;
        hg var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var7 = gk.field_g;
            var8 = var7;
            var8.g(3, 8);
            var8.field_l = var8.field_l + 1;
            var4 = var8.field_l;
            var8.a(1, -113);
            var8.a((byte) -111, param2.field_j);
            var8.a((byte) 122, param2.field_g);
            var8.a((byte) -119, param2.field_l);
            var8.a(param2.field_t, (byte) -42);
            var8.a(param2.field_m, (byte) -42);
            var8.a(param2.field_r, (byte) -42);
            var8.a(param2.field_k, (byte) -42);
            var8.a(param2.field_o.length, -67);
            var5 = 0;
            L1: while (true) {
              if (param2.field_o.length <= var5) {
                int discarded$1 = var8.b((byte) -111, var4);
                var8.b(var8.field_l - var4, -1);
                break L0;
              } else {
                var7.a(param2.field_o[var5], (byte) -42);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ra.D(").append(3).append(',').append(1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (he.field_Xb != null) {
            he.field_Xb.a(param1, 24960);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0>'s game";
        field_d = "Join <%0>'s game";
        field_e = new byte[]{(byte) 7, (byte) 3};
        field_a = new int[]{7, 9, 11};
    }
}
