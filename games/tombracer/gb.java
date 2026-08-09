/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int field_a;

    final static void a(int param0) {
        bd var1;
        ha var2;
        if (param0 != -29711) {
          L0: {
            var2 = (ha) null;
            gb.a((oc) null, -85, (ha) null);
            var1 = (bd) ((Object) vt.field_a.c((byte) 22));
            if (var1 != null) {
              break L0;
            } else {
              var1 = new bd();
              break L0;
            }
          }
          var1.a(bea.field_g, bea.field_l, 116, bea.field_d, bea.field_h, bea.field_b, bea.field_a, bea.field_k);
          gg.field_e.b((byte) -111, var1);
          return;
        } else {
          L1: {
            var1 = (bd) ((Object) vt.field_a.c((byte) 22));
            if (var1 != null) {
              break L1;
            } else {
              var1 = new bd();
              break L1;
            }
          }
          var1.a(bea.field_g, bea.field_l, 116, bea.field_d, bea.field_h, bea.field_b, bea.field_a, bea.field_k);
          gg.field_e.b((byte) -111, var1);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ka a(oc param0, int param1, ha param2) {
        RuntimeException var3 = null;
        ka stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 128) {
                  break L1;
                } else {
                  field_a = 94;
                  break L1;
                }
              }
              stackIn_6_0 = param2.a(param0, 654255, 23, 128, 128);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("gb.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
    }
}
