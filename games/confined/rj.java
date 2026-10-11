/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static String[] field_c;
    static int field_a;
    static byte[][] field_f;
    static bi field_b;
    static te field_e;
    static String field_d;

    public static void a(int param0) {
        field_f = (byte[][]) null;
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = -67 / ((param0 - 30) / 49);
    }

    final static boolean b(int param0) {
        if (param0 != 28404) {
          rj.a(58);
          if (rk.field_e < 10) {
            return false;
          }
          if (!fd.field_j) {
            return !kk.a(param0 ^ -28329) ? true : false;
          }
          return false;
        }
        if (rk.field_e < 10) {
          return false;
        }
        if (!fd.field_j) {
          return !kk.a(param0 ^ -28329) ? true : false;
        }
        return false;
    }

    static {
        field_e = null;
        field_a = 0;
        field_d = "<col=FFFFFF>Ready energy:</col> depleted when you use your energy weapons. If it runs out, your weapons will stop firing for a moment to allow it to recharge.";
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
