/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static rj field_c;
    static ka field_e;
    static lj field_f;
    static k field_a;
    static k field_d;
    static String field_b;
    static int field_g;

    final static boolean a(int param0, lj param1, int param2, int param3) {
        byte[] var5 = param1.c(param2, param3, param0 ^ param0);
        byte[] var4 = var5;
        if (!(var5 != null)) {
            return false;
        }
        ba.a(var5, 0);
        return true;
    }

    final static ka[] a(int param0, String param1, String param2, lj param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 > -126) {
          field_a = null;
          var4 = param3.a(param2, 115);
          var5 = param3.a(var4, param1, (byte) 82);
          return rl.a(var5, var4, param3, (byte) 17);
        } else {
          var4 = param3.a(param2, 115);
          var5 = param3.a(var4, param1, (byte) 82);
          return rl.a(var5, var4, param3, (byte) 17);
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != -7351) {
            return true;
        }
        return df.a(param1, 0, false);
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 > -34) {
            return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
    }

    final static void a(java.awt.Canvas param0, boolean param1) {
        L0: {
          ad.a((java.awt.Component) (Object) param0, 0);
          kj.a((byte) 54, (java.awt.Component) (Object) param0);
          if (null != ef.field_l) {
            ef.field_l.a((java.awt.Component) (Object) param0, (byte) 112);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          lk.a(-102);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new rj();
        field_e = new ka(160, 160);
        field_a = new k(12, 0, 1, 0);
        field_d = new k(11, 0, 1, 2);
    }
}
