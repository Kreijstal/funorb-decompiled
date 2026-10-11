/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static jb[] field_b;
    static String field_a;
    static int[] field_c;
    static bd field_d;

    final static void a(int param0, int param1, int param2, p param3) {
        int var4_int = 0;
        try {
          var4_int = -(param3.field_e * 32) + 256;
          int var5 = -125 % ((-44 - param2) / 49);
          lg.field_k.a(true, var4_int, (int)param3.field_c, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "fg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(ic param0, int param1, boolean param2, jd param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        p var9 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0 != null &&
            null != param0.field_l &&
            param3 != null &&
            param0.field_j == param3.field_t) {
            var4_int = param3.field_w.length;
            var5 = param0.field_l[param1].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param3.field_k == ~param0.field_i[param1][var6] &&
                pc.a(14088, param0.field_p[param1][var6])) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param3.field_w[var7] != param0.field_l[param1][var6 * var4_int + var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_18_0 = var6;
                  return stackIn_18_0;
                }
              }
            }
            if (param2) {
              var9 = (p) null;
              fg.a(81, -66, -114, (p) null);
            }
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("fg.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static java.awt.Container b(byte param0) {
        if (null != md.field_n) {
          return (java.awt.Container) ((Object) md.field_n);
        }
        if (param0 != -31) {
          field_b = (jb[]) null;
        }
        return (java.awt.Container) ((Object) bn.c(-1));
    }

    final static bd a(String param0, String param1, gb param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bd stackIn_2_0 = null;
        bd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a((byte) -2, param0);
          if (param3) {
            stackIn_2_0 = (bd) null;
            return stackIn_2_0;
          }
          var5 = param2.a(var4_int, param1, -1);
          stackIn_4_0 = ac.a(var4_int, var5, (byte) -118, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fg.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        int var1 = -49 % ((param0 + 55) / 38);
        field_c = null;
    }

    final static boolean a(int param0) {
        if (param0 != 32) {
          fg.a((byte) 107);
        }
        return sj.field_a.a(-26720);
    }

    static {
        field_b = new jb[27];
        field_a = "Please enter your age in years";
        field_c = new int[]{3, 4};
    }
}
