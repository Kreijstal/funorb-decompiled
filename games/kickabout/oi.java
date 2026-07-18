/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends gn {
    static String field_h;
    static oh[] field_e;
    static String field_k;
    static String[] field_f;
    static dg field_g;
    int field_j;
    static hd field_i;

    final static boolean b(int param0) {
        int var1 = 0;
        var1 = 66 % ((param0 - -43) / 35);
        if (!jd.f(-1)) {
          if (eq.field_d <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_e = null;
        field_f = null;
        field_i = null;
        field_k = null;
        field_g = null;
    }

    final static void a(int param0) {
        if (param0 < 13) {
            oi.a(-87);
            bt.field_i = null;
            ar.field_b = null;
            return;
        }
        bt.field_i = null;
        ar.field_b = null;
    }

    oi(int param0) {
        ((oi) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Show lobby chat from my friends";
        field_k = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
