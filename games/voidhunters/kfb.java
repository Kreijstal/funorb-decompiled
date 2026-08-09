/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kfb extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                kfb.a(0.19481031596660614f, 0.738810122013092f, -13, -0.6636441349983215f);
                break L1;
              }
            }
            stackIn_3_0 = new nc(tcb.field_q);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kfb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static float a(float param0, float param1, int param2, float param3) {
        if (param2 >= -2) {
          kfb.a(0.4492854177951813f, 1.439752459526062f, -120, 2.3633742332458496f);
          return param3 + (-param3 + param0) * param1;
        } else {
          return param3 + (-param3 + param0) * param1;
        }
    }

    kfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
