/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends mt {
    static int[] field_d;
    static long field_b;
    static int[] field_c;

    final tu a(ff param0, int param1) {
        RuntimeException var3 = null;
        tu stackIn_2_0 = null;
        wg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -25077) {
            stackIn_4_0 = new wg(param0);
            return (tu) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (tu) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ic.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    public ic() {
    }

    static {
        field_d = new int[4];
    }
}
