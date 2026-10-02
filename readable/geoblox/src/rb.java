/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String fullscreenCancelButtonText;
    static boolean field_c;
    static int kindFourRemovalCount;
    static v field_d;

    final static MonochromeBitmapFont a(int param0, int param1, rh param2, int param3, rh param4) {
        RuntimeException var5 = null;
        MonochromeBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            rb.a((byte) -35);
          }
          if (!mf.a(param0, param3, 107, param2)) {
            return null;
          }
          stackIn_6_0 = lc.a(4520, param4.a(param3, -28153, param0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var5);
          stackIn_9_1 = new StringBuilder().append("rb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        fullscreenCancelButtonText = null;
        int var1 = -73 % ((-60 - param0) / 48);
    }

    static {
        fullscreenCancelButtonText = "Cancel";
        field_d = null;
    }
}
