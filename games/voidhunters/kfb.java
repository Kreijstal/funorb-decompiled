/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kfb extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            kfb.a(0.19481031596660614f, 0.738810122013092f, -13, -0.6636441349983215f);
          }
          stackIn_3_0 = new nc(tcb.field_q);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kfb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static float a(float param0, float param1, int param2, float param3) {
        if (param2 < -2) {
          return param3 + (-param3 + param0) * param1;
        }
        kfb.a(0.4492854177951813f, 1.439752459526062f, -120, 2.3633742332458496f);
        return param3 + (-param3 + param0) * param1;
    }

    kfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
