/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    int field_f;
    static kc field_a;
    static ba field_m;
    byte[] field_e;
    int field_g;
    int field_k;
    int field_c;
    int field_h;
    byte[] field_l;
    int field_j;
    static int field_d;
    int field_b;
    static String field_i;

    final static boolean b(int param0) {
        int var1 = 0;
        var1 = 51 % ((-1 - param0) / 32);
        if (ne.field_b != null) {
          if (!ne.field_b.b(95)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -116) {
            boolean discarded$0 = rc.b(7);
            field_m = null;
            field_i = null;
            return;
        }
        field_m = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ba(0, 2, 2, 1);
        field_i = "Fullscreen";
    }
}
