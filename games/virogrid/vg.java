/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends ec {
    static String field_E;
    static String[] field_J;
    static i field_B;
    static v field_H;
    static String[] field_F;
    static ic field_I;

    public static void f(int param0) {
        field_E = null;
        field_H = null;
        if (param0 > -100) {
            return;
        }
        field_B = null;
        field_F = null;
        field_I = null;
        field_J = null;
    }

    private vg(int param0, int param1, int param2, int param3, ol param4, cd param5, fi param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_x = param6;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        ce var7 = null;
        RuntimeException var7_ref = null;
        ce var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param5 > 73) {
              L1: {
                super.a(param0, param1, param2, param3, param4, 125);
                var8 = ra.field_b;
                var7 = var8;
                if (var8 == null) {
                  break L1;
                } else {
                  if (this.a(param4, param1, param0, (byte) 46, param2)) {
                    if (this.field_o instanceof ik) {
                      ((ik) ((Object) this.field_o)).a(82, (vg) (this), var8);
                      ra.field_b = null;
                      return;
                    } else {
                      if (!(var8.field_o instanceof ik)) {
                        break L1;
                      } else {
                        ((ik) ((Object) var8.field_o)).a(120, (vg) (this), var8);
                        ra.field_b = null;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7_ref);
            stackOut_10_1 = new StringBuilder().append("vg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_E = "Your turn";
        field_J = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
