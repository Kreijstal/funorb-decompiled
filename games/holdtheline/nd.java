/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static boolean field_h;
    String[] field_j;
    static uf field_c;
    static int field_l;
    static String field_a;
    boolean field_i;
    boolean field_f;
    String field_d;
    static boolean field_e;
    int field_b;
    static int field_g;
    static String field_k;

    public static void a(int param0) {
        field_c = null;
        field_k = null;
        if (param0 != -4496) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(byte[] param0, int param1, byte[] param2) {
        if (param1 == 0) {
          if (param0.length != param2.length) {
            return false;
          } else {
            return kd.a(1643, param2, 0, param0, 0, param2.length);
          }
        } else {
          return true;
        }
    }

    nd(boolean param0) {
        ((nd) this).field_f = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_a = "Please check if address is correct";
        field_g = 0;
        field_k = "Player";
    }
}
