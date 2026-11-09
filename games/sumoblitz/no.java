/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no {
    static SpriteData field_c;
    static IntrusiveDeque field_d;
    static LoginForm field_a;
    static String[] field_b;

    public static void releaseStatics(int param0) {
        if (param0 != 10) {
          return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static int parseDecimal(byte guard, CharSequence text) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -126) {
            no.releaseStatics(-92);
          }
          stackIn_3_0 = SpriteOptionRenderer.parseInt(10, text, true, (byte) -84);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("no.B(").append(guard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_d = new IntrusiveDeque();
    }
}
