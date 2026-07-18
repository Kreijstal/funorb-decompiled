/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_d;
    static int field_c;
    static rc[] field_a;
    static int[][] field_b;

    final static ed a(byte param0) {
        RuntimeException var1 = null;
        Object stackIn_6_0 = null;
        ed stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_5_0 = null;
        try {
          L0: {
            if (ic.field_l == mc.field_t) {
              throw new IllegalStateException();
            } else {
              if (param0 < -19) {
                if (kd.field_p == ic.field_l) {
                  ic.field_l = mc.field_t;
                  stackOut_10_0 = vk.field_g;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (ed) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "pa.B(" + param0 + ')');
        }
        return (ed) (Object) stackIn_13_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 3) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "pa.D(" + param0 + ')');
        }
    }

    final static void a(boolean param0, String param1, float param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              bj.field_c = param1;
              oe.field_d = param2;
              if (param0) {
                break L1;
              } else {
                pa.a(false, (String) null, -0.23309962451457977f);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pa.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 | param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var4, "pa.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new rc[3];
    }
}
