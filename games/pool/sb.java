/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static dd[] field_c;
    static int field_d;
    static vh field_a;
    static int field_b;

    final static int a(float param0, boolean param1) {
        if (!param1) {
            sb.a((byte) -61);
            return j.a(3, param0, (byte) 126);
        }
        return j.a(3, param0, (byte) 126);
    }

    final static qb a(int param0, di param1, int param2) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 == -7575) {
              break L0;
            } else {
              discarded$2 = sb.a(0.49575117230415344f, true);
              break L0;
            }
          }
          if (jl.a((byte) 81, param1, param2)) {
            return fo.a((byte) 108);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("sb.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        Boolean discarded$0 = null;
        field_c = null;
        field_a = null;
        if (param0 < 13) {
            discarded$0 = sb.a(-47);
        }
    }

    final static Boolean a(int param0) {
        if (param0 < 107) {
            return (Boolean) null;
        }
        Boolean var1 = bq.field_q;
        bq.field_q = null;
        return var1;
    }

    static {
        field_b = 0;
    }
}
