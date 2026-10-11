/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int[] field_a;
    static int[] field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = rk.a(param1, 5);
          if (param2 == ~param0.indexOf(param1) &&
            param0.indexOf(var3) == -1) {
            stackIn_12_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
            return stackIn_12_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hj.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -5928) {
          field_b = (int[]) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_a = new int[2];
        field_b = new int[128];
    }
}
