/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 < 61) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static in a(int param0, String[] param1) {
        in var2 = null;
        RuntimeException var2_ref = null;
        in stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new in(false);
          if (param0 != 26663) {
            field_b = (String) null;
          }
          var2.field_c = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("p.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_a = "Your email address is used to identify this account";
    }
}
