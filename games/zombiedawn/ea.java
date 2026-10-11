/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static tg field_c;
    static String field_d;
    static String field_b;
    static long field_a;

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20000000) {
            field_d = (String) null;
          }
          stackIn_3_0 = ch.a(param1, false, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != 82) {
          field_a = -92L;
        }
    }

    static {
        field_c = new tg();
        field_d = "Waiting for levels";
        field_a = 20000000L;
    }
}
