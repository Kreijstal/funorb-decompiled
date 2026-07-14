/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    int field_a;
    int field_b;
    static ob field_e;
    int field_c;
    static char field_d;

    public static void a(int param0) {
        if (param0 != 10934) {
            Object var2 = null;
            boolean discarded$0 = rk.a(-99, true, (fm) null, 69);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static boolean a(int param0, boolean param1, fm param2, int param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        if (!param1) {
          var5 = param2.a(param3, param0, true);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            sd.a((byte) -95, var5);
            return true;
          }
        } else {
          return false;
        }
    }

    rk(int param0, int param1, int param2) {
        ((rk) this).field_c = param2;
        ((rk) this).field_b = param1;
        ((rk) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = '/';
    }
}
