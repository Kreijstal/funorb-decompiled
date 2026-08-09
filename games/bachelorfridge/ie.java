/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static int[] field_b;
    static int field_a;

    final static pp a(lu param0, boolean param1) {
        RuntimeException var2 = null;
        lu var3 = null;
        dh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var3 = (lu) null;
                ie.a((lu) null, true);
                break L1;
              }
            }
            stackIn_3_0 = new dh();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ie.B(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (pp) ((Object) stackIn_3_0);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            lu var2 = (lu) null;
            ie.a((lu) null, true);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = new int[4];
        field_a = 0;
    }
}
