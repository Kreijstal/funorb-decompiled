/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static int[] field_a;
    static int field_b;
    static String field_c;

    final static gk[] a(boolean param0, cm param1, int param2, int param3) {
        if (wa.a((byte) 30, param3, param2, param1)) {
          if (!param0) {
            field_a = null;
            return ij.i(-71);
          } else {
            return ij.i(-71);
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 8192) {
            return;
        }
        field_c = null;
    }

    final static int a(byte param0) {
        if (param0 > -68) {
            return -121;
        }
        return hb.field_b + -hl.field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_c = "Research into <col=00ffff>laser weapons</col> is needed before the <%0> can be engineered.";
    }
}
