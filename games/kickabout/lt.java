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
        if (param0 < -114) {
          field_a = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
        lt.a(107);
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static int a(byte param0) {
        if (param0 != 40) {
          return -111;
        }
        return 1;
    }

    final static int[] a(int param0, int param1, la[] param2, int param3, int param4, int param5, int param6, int param7) {
        int[] stackIn_2_0 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        la[] var9 = null;
        try {
          ao.field_b[1] = param5;
          ao.field_b[5] = param7;
          ao.field_b[3] = param0;
          ao.field_b[0] = param6;
          ao.field_b[4] = param1;
          ao.field_b[2] = param4;
          if (!pe.a(param2, (byte) -124, ao.field_b)) {
            stackIn_2_0 = ao.field_b;
            return stackIn_2_0;
          }
          ao.field_b[0] = ao.field_b[0] + ao.field_b[3];
          if (!pe.a(param2, (byte) -104, ao.field_b)) {
            ao.field_b[0] = param6;
            ao.field_b[3] = -ao.field_b[3];
          }
          ao.field_b[1] = ao.field_b[1] + ao.field_b[4];
          if (!pe.a(param2, (byte) -61, ao.field_b)) {
            ao.field_b[1] = param5;
            ao.field_b[4] = -ao.field_b[4];
          }
          ao.field_b[2] = ao.field_b[2] + ao.field_b[5];
          if (param3 >= -51) {
            var9 = (la[]) null;
            lt.a(-23, 65, (la[]) null, -116, 62, 0, -89, 61);
          }
          if (!pe.a(param2, (byte) -85, ao.field_b)) {
            ao.field_b[5] = -ao.field_b[5];
            ao.field_b[2] = param4;
          }
          stackIn_13_0 = ao.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("lt.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_e = "time";
        field_b = "Final";
    }
}
