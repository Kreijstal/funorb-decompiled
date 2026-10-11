/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_b;
    static boolean field_a;

    final static int a(of param0, int param1, id param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != null &&
            param0.field_m != null &&
            param2 != null &&
            param0.field_p == param2.field_l) {
            if (param1 != -1) {
              field_a = true;
            }
            var4_int = param2.field_q.length;
            var5 = param0.field_m[param3].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (param0.field_r[param3][var6] == param2.field_s &&
                ea.a(param0.field_o[param3][var6], (byte) -25)) {
                for (var7 = 0; var4_int > var7; var7++) {
                  if (param2.field_q[var7] != param0.field_m[param3][var6 * var4_int + var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_19_0 = var6;
                  return stackIn_19_0;
                }
              }
            }
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("kp.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -1) {
          field_b = null;
          return;
        }
        id var2 = (id) null;
        kp.a((of) null, -64, (id) null, -29);
        field_b = null;
    }

    final static void a(int param0, id param1, int param2) {
        try {
          if (param2 <= 60) {
            id var4 = (id) null;
            kp.a((of) null, 14, (id) null, -12);
          }
          ow.field_f.a((ms) (param1), (byte) 39);
          km.a((byte) 69, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "kp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Classic";
        field_a = false;
    }
}
