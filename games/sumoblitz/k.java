/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_a;

    final static boolean a(ki param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = param0.a((byte) 126, param1, param2);
              var4 = var5;
              if (param3 == -23046) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (var5 == null) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              eg.a(param3 ^ -23291, var5);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("k.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(pd param0, int param1, byte param2) {
        pl var3 = null;
        try {
            if (param2 < 93) {
                field_a = (String) null;
            }
            var3 = as.field_v;
            var3.g(param1, 8);
            var3.b((byte) 111, param0.field_k);
            var3.b(-10, param0.field_o);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "k.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 28322) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = "start game";
    }
}
