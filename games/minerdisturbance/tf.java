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
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        var4 = MinerDisturbance.field_ab;
        try {
          while (true) {
            var3 = param1.a(param2, true);
            while (var3.field_c == 0) {
              gf.a(10L, -10309);
            }
            if (var3.field_c != 1) {
              gf.a(100L, -10309);
              continue;
            }
            break;
          }
          var3_int = -23 / ((-22 - param0) / 52);
          param2.setVisible(false);
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("tf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
