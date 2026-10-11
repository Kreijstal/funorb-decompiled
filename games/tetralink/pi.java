/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static wf field_c;
    static uf field_a;
    static String field_e;
    static String field_d;
    static String field_b;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17510) {
            field_a = (uf) null;
          }
          if (param0 != null &&
            param0.length() >= mn.field_e) {
            if (param0.length() > qf.field_i) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("pi.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= -2) {
          field_e = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_e = (String) null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_d = "Just play";
        field_e = "Unpacking models";
        field_b = "You must be a member to play with the current options.";
    }
}
