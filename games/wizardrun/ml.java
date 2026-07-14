/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ml extends rk {
    static String field_p;
    boolean field_r;
    boolean field_q;
    volatile boolean field_s;
    static int field_t;
    static ji field_u;

    abstract byte[] d(int param0);

    final static ll a(byte param0) {
        int var1 = 57 / ((43 - param0) / 33);
        if (!(we.field_d != null)) {
            we.field_d = new ll(e.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, e.field_b.field_M, -1, 2147483647, true);
        }
        return we.field_d;
    }

    public static void e(int param0) {
        field_p = null;
        int var1 = -27 / ((param0 - -7) / 56);
        field_u = null;
    }

    final static db[] a(kl param0, int param1, int param2, int param3) {
        if (h.a(param3, param1, param0, -116)) {
          if (param2 != -26955) {
            ll discarded$2 = ml.a((byte) 21);
            return hj.a(100);
          } else {
            return hj.a(100);
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 11579568) {
            return;
        }
        di.a(false, param1, 117);
    }

    final static void a(dc param0, int param1, int param2) {
        v.field_d.a((wl) (Object) param0, false);
        if (param2 != -1) {
            return;
        }
        de.a(-14149, param1, param0);
    }

    abstract int c(boolean param0);

    ml() {
        ((ml) this).field_s = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Suggested names: ";
    }
}
