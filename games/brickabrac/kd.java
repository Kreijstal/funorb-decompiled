/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_c;
    static String field_b;
    static String[] field_d;
    static String field_a;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (!param0) {
          field_b = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static pb a(int param0, int param1, byte param2) {
        int var3 = 117 / ((param2 - 38) / 63);
        return so.a(0, param1, param0, cr.field_N);
    }

    final static boolean a(int param0, wq param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.l(param0 + 257);
          stackIn_3_0 = (~var2_int != param0) ? 0 : 1;
          var3 = stackIn_3_0;
          stackIn_4_0 = var3;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("kd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_b = "Unable to add friend - system busy";
        field_a = "Please wait...";
    }
}
