/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_a;

    final static int a(int param0, de param1, int param2, d param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != null &&
            null != param1.field_i &&
            param3 != null &&
            param1.field_k == param3.field_m) {
            var4_int = param3.field_f.length;
            var5 = param1.field_i[param2].length / var4_int;
            for (var6 = param0; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (param3.field_g == param1.field_p[param2][var6] &&
                f.a(-15189, param1.field_g[param2][var6])) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param1.field_i[param2][var6 * var4_int + var7] != param3.field_f[var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_17_0 = var6;
                  return stackIn_17_0;
                }
              }
            }
            stackIn_20_0 = -1;
            return stackIn_20_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ti.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        bb.field_a.b(16564, param1);
        if (param0 != 0) {
          d var3 = (d) null;
          ti.a(72, (de) null, -117, (d) null);
        }
    }

    static {
    }
}
