/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu extends rqa {
    static int field_p;
    static String field_o;
    static int field_q;

    nu(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(166, 124));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nu.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -10515) {
          field_o = (String) null;
        }
    }

    final static boolean e(byte param0) {
        if (param0 != 114) {
          return false;
        }
        if (null == ola.field_p) {
          return false;
        }
        if (!ola.field_p.a(false)) {
          return false;
        }
        return true;
    }

    static {
        field_p = 2048;
        field_o = "Add action (Add to custom variable)";
        field_q = 234;
    }
}
