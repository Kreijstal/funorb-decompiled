/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static boolean field_b;
    static byte[] field_c;
    static long field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 23) {
            an.a((byte) -15);
        }
    }

    final static int a(boolean param0, byte param1, String param2) {
        if (param1 >= 9) {
          if (!param0) {
            return pm.field_j.a(param2);
          } else {
            return jf.field_n.a(param2);
          }
        } else {
          field_a = -46L;
          if (!param0) {
            return pm.field_j.a(param2);
          } else {
            return jf.field_n.a(param2);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[520];
    }
}
