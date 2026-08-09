/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static java.security.SecureRandom field_e;
    static String field_d;
    static uf field_c;
    static int field_a;
    static dm field_b;

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != -9474) {
            cl.a(62);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static sl a(byte param0, String param1) {
        RuntimeException var2 = null;
        sl stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 56) {
                break L1;
              } else {
                field_a = -115;
                break L1;
              }
            }
            if (tf.field_d != si.field_g) {
              L2: {
                if (si.field_g != va.field_e) {
                  break L2;
                } else {
                  if (!param1.equals(cg.field_k)) {
                    break L2;
                  } else {
                    si.field_g = uf.field_l;
                    stackIn_8_0 = me.field_g;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              si.field_g = tf.field_d;
              cg.field_k = param1;
              me.field_g = null;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("cl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return (sl) ((Object) stackIn_10_0);
        }
    }

    static {
        field_a = 10;
        field_d = "Continue";
    }
}
