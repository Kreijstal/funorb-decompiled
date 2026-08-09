/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static na field_a;

    final static void b(boolean param0) {
        if (el.field_o.field_Y) {
          if (param0) {
            mf.a(false);
            return;
          } else {
            return;
          }
        } else {
          fj.field_m = fj.field_m + 1;
          if (!param0) {
            return;
          } else {
            mf.a(false);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = (na) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, int param1, int param2, rh param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param3.a(param1, -28153, param0);
            var4 = var5;
            if (param2 >= 102) {
              if (var5 == null) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                hf.a(true, var5);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4_ref);

            stackIn_11_1 = new StringBuilder().append("mf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0 != 0;
          }
        }
    }

    static {
    }
}
