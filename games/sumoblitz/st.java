/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st extends ie {
    static mm field_z;
    static String field_B;

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        jh var7 = null;
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            var7 = gt.field_gb;
            if (var7 != null) {
                if (!this.b(param4, -1, param2, param3, param5)) {
                    return;
                }
                if (this.field_o instanceof sf) {
                    ((sf) ((Object) this.field_o)).a(var7, (st) (this), 20302);
                    gt.field_gb = null;
                    return;
                }
                if (!(var7.field_o instanceof sf)) {
                    return;
                }
                ((sf) ((Object) var7.field_o)).a(var7, (st) (this), 20302);
                gt.field_gb = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "st.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private st(int param0, int param1, int param2, int param3, mh param4, qm param5, pk param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "st.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_z = null;
        if (param0 < 111) {
            return;
        }
        field_B = null;
    }

    final static float a(int param0, float[] param1, float[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        float stackIn_1_0 = 0.0f;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -42 % ((14 - param0) / 55);
            stackIn_1_0 = param2[0] * param1[0] + param1[1] * param2[1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("st.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_z = new mm();
    }
}
