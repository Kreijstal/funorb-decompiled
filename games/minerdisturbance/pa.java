/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_d;
    static int field_c;
    static rc[] field_a;
    static int[][] field_b;

    final static ed a(byte param0) {
        if (!(ic.field_l != mc.field_t)) {
            throw new IllegalStateException();
        }
        if (param0 >= -19) {
            return (ed) null;
        }
        if (!(kd.field_p != ic.field_l)) {
            ic.field_l = mc.field_t;
            return vk.field_g;
        }
        return null;
    }

    public static void a(int param0) {
        field_b = (int[][]) null;
        if (param0 != 3) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, String param1, float param2) {
        RuntimeException runtimeException = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              bj.field_c = param1;
              oe.field_d = param2;
              if (param0) {
                break L1;
              } else {
                var4 = (String) null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("pa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    static {
        field_a = new rc[3];
    }
}
