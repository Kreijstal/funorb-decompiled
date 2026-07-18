/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt {
    static ut[] field_d;
    static String field_e;
    static int[] field_a;
    static ut[] field_c;
    static String field_b;

    public static void a(int param0) {
        if (param0 >= -114) {
          lt.a(107);
          field_a = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static int a(byte param0) {
        return 1;
    }

    final static int[] a(int param0, int param1, la[] param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        Object var9 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_12_0 = null;
        int[] stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            ao.field_b[1] = param5;
            ao.field_b[5] = param7;
            ao.field_b[3] = param0;
            ao.field_b[0] = param6;
            ao.field_b[4] = param1;
            ao.field_b[2] = param4;
            if (pe.a(param2, (byte) -124, ao.field_b)) {
              L1: {
                ao.field_b[0] = ao.field_b[0] + ao.field_b[3];
                if (pe.a(param2, (byte) -104, ao.field_b)) {
                  break L1;
                } else {
                  ao.field_b[0] = param6;
                  ao.field_b[3] = -ao.field_b[3];
                  break L1;
                }
              }
              L2: {
                ao.field_b[1] = ao.field_b[1] + ao.field_b[4];
                if (pe.a(param2, (byte) -61, ao.field_b)) {
                  break L2;
                } else {
                  ao.field_b[1] = param5;
                  ao.field_b[4] = -ao.field_b[4];
                  break L2;
                }
              }
              L3: {
                ao.field_b[2] = ao.field_b[2] + ao.field_b[5];
                if (param3 < -51) {
                  break L3;
                } else {
                  var9 = null;
                  int[] discarded$1 = lt.a(-23, 65, (la[]) null, -116, 62, 0, -89, 61);
                  break L3;
                }
              }
              L4: {
                if (!pe.a(param2, (byte) -85, ao.field_b)) {
                  ao.field_b[5] = -ao.field_b[5];
                  ao.field_b[2] = param4;
                  break L4;
                } else {
                  break L4;
                }
              }
              stackOut_12_0 = ao.field_b;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = ao.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("lt.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "time";
        field_b = "Final";
    }
}
