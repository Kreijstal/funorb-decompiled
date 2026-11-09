/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StringBuilderSupport {
    static String[] yesNoLabels;
    static int field_b;
    static long field_a;

    public static void releaseStatics(int param0) {
        yesNoLabels = null;
        if (param0 != 0) {
          yesNoLabels = (String[]) null;
        }
    }

    final static StringBuilder setLength(StringBuilder builder, int guard, char fill, int length) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = builder.length();
          builder.setLength(length);
          for (var5 = var4_int; var5 < length; var5++) {
            builder.setCharAt(var5, fill);
          }
          if (guard != 60) {
            field_b = 53;
          }
          stackIn_7_0 = (StringBuilder) (builder);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("lb.A(");
          if (builder == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(',').append(fill).append(',').append(length).append(')').toString());
        }
    }

    static {
        field_b = 0;
        yesNoLabels = new String[]{"Yes", "No"};
    }
}
