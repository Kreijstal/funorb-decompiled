/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la implements ok {
    static String field_e;
    static int field_f;
    static boolean field_a;
    static vn field_b;
    static kc field_c;
    static int field_d;

    public static void a(byte param0) {
        int var1 = 2 / ((-60 - param0) / 56);
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param2 < -22) {
          if (param1) {
            de.e(0, 0, de.field_e, de.field_j, 0, 192);
            lm.a((byte) -29, param1);
            return;
          } else {
            de.b();
            lm.a((byte) -29, param1);
            return;
          }
        } else {
          return;
        }
    }

    final static int[] b(byte param0) {
        if (param0 != 12) {
            return (int[]) null;
        }
        return new int[8];
    }

    static {
        field_e = "Members";
        field_f = 0;
        field_b = new vn();
    }
}
