/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static boolean field_a;

    final static rh a(int param0, su param1) {
        rh var2 = null;
        RuntimeException var2_ref = null;
        su var3 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new rh(param1, param1);
              di.field_M.a(param0 ^ -23077, var2);
              if (param0 == -23159) {
                break L1;
              } else {
                var3 = (su) null;
                w.a(117, (su) null);
                break L1;
              }
            }
            qn.field_b.b(param1);
            stackIn_3_0 = (rh) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("w.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
