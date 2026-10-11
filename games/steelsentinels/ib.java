/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static int field_b;
    static String field_a;

    final static int a(tc param0, int param1, int param2, kf param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          if (param3 != null &&
            param3.field_z != null &&
            param0 != null &&
            param3.field_C == param0.field_y) {
            var4_int = param0.field_q.length;
            var5 = param3.field_z[param2].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param3.field_D[param2][var6] == ~param0.field_D &&
                wl.a(-85, param3.field_x[param2][var6])) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param0.field_q[var7] != param3.field_z[param2][var7 + var6 * var4_int]) {
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
            if (param1 != 7047) {
              ib.a(40, -26, false, 35, 96, 13, -66);
            }
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("ib.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String var8 = null;
        int var7 = -28 % ((-18 - param4) / 48);
        if (field_b == 2) {
          var8 = ug.field_L;
        } else {
          var8 = qi.field_g;
        }
        ka.a(param2, param1, param6, param0, var8, param5, 127, param3);
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 86 % ((-49 - param0) / 56);
    }

    final static boolean a(int param0) {
        int var1 = 76 / ((0 - param0) / 33);
        return 2 <= cb.field_l ? true : false;
    }

    static {
        field_b = 0;
        field_a = "You do not have a suitable number of players for the current options.";
    }
}
