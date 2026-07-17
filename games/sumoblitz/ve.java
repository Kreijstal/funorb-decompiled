/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve extends ms {
    private boolean field_n;
    static String field_l;
    fr field_m;
    static ri field_k;

    final boolean a(int param0) {
        if (param0 < 106) {
            ((ve) this).field_m = null;
            return ((ve) this).field_n;
        }
        return ((ve) this).field_n;
    }

    final static wg a(byte param0, on param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        wg stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2 != null) {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              var5 = 50 / ((param0 - -9) / 58);
              jaggl.OpenGL.glBindProgramARB(34336, var4_int);
              jaggl.OpenGL.glProgramRawARB(34336, 34933, param2);
              jaggl.OpenGL.glGetIntegerv(34379, jg.field_e, 0);
              if (jg.field_e[0] == -1) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                stackOut_6_0 = new wg(param1, 34336, var4_int);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (wg) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ve.F(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 34336 + 41);
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = -35;
        field_l = null;
    }

    abstract void c(int param0);

    final static ki a(int param0, boolean param1, int param2, int param3, boolean param4) {
        if (param0 != 11880) {
          ki discarded$2 = ve.a(87, true, -113, -52, false);
          return ng.a(param3, param0 ^ -11778, param1, param2, false, false);
        } else {
          return ng.a(param3, param0 ^ -11778, param1, param2, false, false);
        }
    }

    ve(fr param0) {
        try {
            ((ve) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ve.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Waiting for music";
    }
}
