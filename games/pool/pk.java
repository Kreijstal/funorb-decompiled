/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static vh field_a;
    static String field_c;
    static dd field_b;

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 1 % ((param1 - 27) / 33);
          stackIn_1_0 = fe.a(false, (byte) 70, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("pk.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 77 % ((1 - param0) / 46);
        field_a = null;
    }

    final static boolean b(byte param0) {
        if (param0 != 109) {
          field_a = (vh) null;
          if (fk.field_ab < 10) {
            return false;
          }
          if (!gk.field_kb) {
            return !mg.a(-114) ? true : false;
          }
          return false;
        }
        if (fk.field_ab < 10) {
          return false;
        }
        if (!gk.field_kb) {
          return !mg.a(-114) ? true : false;
        }
        return false;
    }

    static {
        field_c = "Match by...";
    }
}
