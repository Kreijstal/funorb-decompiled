/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static nh field_d;
    static String[] field_e;
    static gk field_c;
    static String field_g;
    static sa field_a;
    static int field_f;
    static String[] field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 >= 28) {
          field_g = null;
          field_a = null;
          return;
        }
        field_b = (String[]) null;
        field_g = null;
        field_a = null;
    }

    final static vi a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        vi var5 = null;
        vi stackIn_4_0 = null;
        vi stackIn_7_0 = null;
        vi stackIn_10_0 = null;
        vi stackIn_13_0 = null;
        vi stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            0 != param0.length()) {
            var2_int = param0.indexOf('@');
            if (param1 != -3303) {
              stackIn_7_0 = (vi) null;
              return stackIn_7_0;
            }
            if (var2_int == -1) {
              stackIn_10_0 = qj.field_e;
              return stackIn_10_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = qg.b((byte) 71, var3);
            if (var5 == null) {
              stackIn_15_0 = pd.a(var4, param1 ^ 3302);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = dm.field_A;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("bc.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "No highscores";
        field_a = new sa(14, 0, 4, 1);
    }
}
