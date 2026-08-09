/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur {
    static String field_c;
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        gk var2;
        field_b = null;
        if (param0 != 8192) {
          var2 = (gk) null;
          ur.a(-26, -63, -63, (gk) null);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 > -10) {
            ur.a(119);
            return true;
        }
        return true;
    }

    final static wp[] a(int param0, int param1, int param2, gk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        wp[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (tn.a(param3, (byte) -127, param2, param1)) {
              var4_int = -91 / ((34 - param0) / 38);
              stackIn_4_0 = kn.a(-125);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ur.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wp[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = new int[8192];
    }
}
