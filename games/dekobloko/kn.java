/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends bh {
    int field_w;
    int field_y;
    static String field_n;
    int field_q;
    long field_o;
    int field_u;
    int[] field_s;
    int field_v;
    int field_t;
    static w field_r;
    int field_x;
    static w field_p;

    public static void a(int param0) {
        field_r = null;
        field_p = null;
        if (param0 != -1) {
            kn.a(11);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(mm param0, byte param1, int param2, String param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 == -39) {
              L1: {
                var6_int = 2;
                if (se.field_S != param0) {
                  break L1;
                } else {
                  var6_int = 1;
                  break L1;
                }
              }
              L2: {
                param0.c(param3, -var6_int + param5, -var6_int + param2, 0, -1);
                param0.c(param3, -var6_int + param5, param2, 0, -1);
                param0.c(param3, -var6_int + param5, param2 + var6_int, 0, -1);
                param0.c(param3, param5, -var6_int + param2, 0, -1);
                param0.c(param3, param5, param2 - -var6_int, 0, -1);
                param0.c(param3, param5 + var6_int, -var6_int + param2, 0, -1);
                param0.c(param3, var6_int + param5, param2, 0, -1);
                param0.c(param3, var6_int + param5, var6_int + param2, 0, -1);
                if (w.field_kb == param0) {
                  param0.c(param3, 1 + param5, param2 + -var6_int, 0, -1);
                  param0.c(param3, -1 + param5, param2 + -var6_int, 0, -1);
                  param0.c(param3, var6_int + param5, -1 + param2, 0, -1);
                  param0.c(param3, -var6_int + param5, -1 + param2, 0, -1);
                  param0.c(param3, var6_int + param5, param2 - -1, 0, -1);
                  param0.c(param3, -var6_int + param5, 1 + param2, 0, -1);
                  param0.c(param3, param5 - -1, var6_int + param2, 0, -1);
                  param0.c(param3, -1 + param5, param2 + var6_int, 0, -1);
                  break L2;
                } else {
                  break L2;
                }
              }
              param0.c(param3, param5, param2, param4, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("kn.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    kn(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            fieldTemp$0 = dk.field_a;
            dk.field_a = dk.field_a + 1;
            this.field_u = 65535 & fieldTemp$0;
            this.field_s = param6;
            this.field_v = param3;
            this.field_q = param1;
            this.field_t = param2;
            this.field_y = param5;
            this.field_w = param4;
            this.field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
