/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static int field_b;
    static int field_a;
    static ea[] field_c;

    final static void a(byte param0, vf param1, java.awt.Frame param2) {
        ia var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param2, true);
              L2: while (true) {
                if (var3.field_c != 0) {
                  if (-2 != (var3.field_c ^ -1)) {
                    gf.a(100L, -10309);
                    continue L1;
                  } else {
                    var3_int = -23 / ((-22 - param0) / 52);
                    param2.setVisible(false);
                    param2.dispose();
                    break L0;
                  }
                } else {
                  gf.a(10L, -10309);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("tf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 24044) {
            field_b = 66;
        }
    }

    static {
        field_a = 0;
    }
}
