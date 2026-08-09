/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    int field_c;
    int field_a;
    static String field_b;

    final static ee a(int param0, int param1, int param2, vr param3) {
        RuntimeException var4 = null;
        ee stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (g.a(param1, param0, -30744, param3)) {
              L1: {
                if (param2 == 0) {
                  break L1;
                } else {
                  aj.a((byte) -31, -21);
                  break L1;
                }
              }
              stackIn_6_0 = dr.b(param2 + -32124);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("aj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2) {
        this.field_a = param2;
        this.field_c = param1;
        if (param0 != -1) {
            field_b = (String) null;
        }
    }

    public static void a(int param0) {
        if (param0 < 41) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        vr var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -20) {
                break L1;
              } else {
                var4 = (vr) null;
                aj.a(-51, -127, 29, (vr) null);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (-30 >= (var2_int ^ -1)) {
                stackIn_10_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (qe.field_q[var2_int] != param1) {
                  var2_int++;
                  continue L2;
                } else {
                  stackIn_7_0 = var2_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aj.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_10_0;
        }
    }

    aj(int param0, int param1) {
        this.a(-1, param0, param1);
    }

    aj(aj param0) {
        try {
            this.a(-1, param0.field_c, param0.field_a);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "aj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 74 / ((11 - param0) / 63);
        return !ut.field_m.a(false) ? true : false;
    }

    static {
        field_b = "Played";
    }
}
