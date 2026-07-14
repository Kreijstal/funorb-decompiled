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
        String var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        var2 = param1.getParameter("username");
        if (var2 != null) {
          var4 = (CharSequence) (Object) var2;
          if (-1L == (l.a(var4, (byte) 93) ^ -1L)) {
            return;
          } else {
            var3 = 82 / ((-27 - param0) / 48);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new long[32];
        field_a = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_g = new bm();
        field_b = nf.a(false);
        field_e = new String[]{"Health pack", "Big health pack", "<unused>", "Explosive charge", "Lost key", "<unused>", "<unused>", "<unused>", "<unused>", "<unused>", "<unused>", "Security pass"};
        field_c = 0;
    }
}
