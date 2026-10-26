/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static st field_a;
    static int field_b;
    static w field_d;
    static String field_c;

    public static void a(int param0) {
        field_d = null;
        if (param0 != -12546) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static int a(CharSequence param0, byte param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 38) {
            field_d = (w) null;
          }
          int stackIn_3_0 = ro.a(10, true, -98, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("td.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new st();
        field_d = new w();
        field_c = "Play the game without logging in just yet";
    }
}
