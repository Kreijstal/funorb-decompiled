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
        int var1 = -101 % ((param0 + 3) / 42);
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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) ((Object) var2);
            if (l.a(var4, (byte) 93) != 0L) {
              var3 = 82 / ((-27 - param0) / 48);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("bm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
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
