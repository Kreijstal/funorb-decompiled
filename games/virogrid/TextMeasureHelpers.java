/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextMeasureHelpers {
    static boolean field_b;
    static byte[] field_c;
    static long field_a;

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 < 23) {
          TextMeasureHelpers.releaseStatics((byte) -15);
        }
    }

    final static int measureText(boolean param0, byte param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 9) {
            field_a = -46L;
          }
          if (param0) {
            stackIn_6_0 = GameOptions.field_n.textWidth(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = MouseTrailPoint.field_j.textWidth(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("an.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_c = new byte[520];
    }
}
