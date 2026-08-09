/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static long[] field_d;
    static bm field_g;
    static String[] field_a;
    static int[] field_b;
    static String[] field_e;
    static int field_c;
    static bd field_f;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        int var1 = -101 % ((param0 - -3) / 42);
        field_e = null;
        field_d = null;
        field_f = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var4 = (CharSequence) ((Object) var2);
                if (-1L != (l.a(var4, (byte) 93) ^ -1L)) {
                  var3 = 82 / ((-27 - param0) / 48);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("bm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = new long[32];
        field_a = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_g = new bm();
        field_b = nf.a(false);
        field_e = new String[]{"Health pack", "Big health pack", "<unused>", "Explosive charge", "Lost key", "<unused>", "<unused>", "<unused>", "<unused>", "<unused>", "<unused>", "Security pass"};
        field_c = 0;
    }
}
