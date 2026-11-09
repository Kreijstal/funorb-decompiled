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

    final static int a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -126) {
            no.releaseStatics(-92);
          }
          stackIn_3_0 = SpriteOptionRenderer.parseInt(10, param1, true, (byte) -84);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("no.B(").append(param0).append(',');
          if (param1 == null) {
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
