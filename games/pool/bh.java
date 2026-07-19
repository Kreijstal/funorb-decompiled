/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static vh field_b;
    static String field_c;
    static jg field_a;
    static String field_d;

    final static void a(so[] param0, boolean param1, int param2, int param3, eg param4, int param5, int param6) {
        int[] discarded$2 = null;
        int[] discarded$3 = null;
        int[] var7 = null;
        RuntimeException var7_ref = null;
        eg var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var19 = null;
        int[] var20 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var8 = a.a(true, new eg(param4, false, false, false, false));
            var19 = mj.a(-31121);
            var19[0] = param5;
            var19[1] = param2;
            var19[2] = param3;
            param0[0 + param6] = hc.a(new eg(param4, false, false, false, false), var19, (byte) 101);
            var14 = mj.a(-31121);
            var10 = var14;
            var7 = var10;
            var14[2] = param3;
            var7[1] = -param2;
            var14[0] = param5;
            param0[param6 - -1] = hc.a(new eg(var8, false, false, param1, false), var14, (byte) 101);
            var20 = mj.a(-31121);
            var20[0] = param5;
            var20[1] = param2;
            var20[2] = param3;
            discarded$2 = dq.a((byte) 53, var20);
            param0[param6 + 2] = hc.a(new eg(param4, false, false, false, false), var20, (byte) 101);
            var16 = mj.a(-31121);
            var12 = var16;
            var7 = var12;
            var16[2] = param3;
            var7[1] = -param2;
            var16[0] = param5;
            discarded$3 = dq.a((byte) -115, var16);
            param0[param6 + 3] = hc.a(var8, var16, (byte) 101);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7_ref);
            stackOut_2_1 = new StringBuilder().append("bh.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(boolean param0) {
        String var2 = (String) null;
        rf.a((String) null, -128, re.field_d);
        if (param0) {
            field_a = (jg) null;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0) {
            bh.a(true);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_d = "You are on your last life!";
        field_c = "No spectators";
    }
}
