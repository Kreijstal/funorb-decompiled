/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends tc {
    static String field_m;
    int field_n;
    static String field_p;
    int field_o;
    static int field_l;
    static int field_k;

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 == -1432128863) {
              L1: while (true) {
                param2--;
                if (0 > param2) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var9 = param3;
                  var5 = var9;
                  var6 = param0;
                  var7 = param4;
                  var9[var6] = var7 - -rn.a(var9[var6] >> -1432128863, 8355711);
                  param0++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("tf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_p = null;
        if (!param0) {
            return;
        }
        field_m = (String) null;
    }

    final static void a(int param0, nt param1, byte param2) {
        bv var3 = null;
        try {
            var3 = vl.field_n;
            var3.h(32161, param0);
            var3.b(1, param1.field_o);
            if (param2 != -64) {
                field_m = (String) null;
            }
            var3.b(1, param1.field_q);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var3 = null;
        long var4 = 0L;
        at.field_a = true;
        String var2 = "tuhstatbut";
        if (param0 != -99) {
            return;
        }
        try {
            var3 = "rvnadlm";
            var4 = -1L;
            tc.a(param1, var3, (byte) 120, var2, var4);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    tf(int param0, int param1) {
        this.field_o = param1;
        this.field_n = param0;
    }

    static {
        field_p = "Resign";
        field_m = "Confirm Password: ";
        field_k = 0;
    }
}
