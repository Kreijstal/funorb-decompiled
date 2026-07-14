/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static long[] field_b;
    static qr field_c;
    static int field_a;

    final static void a(int[] param0, int[] param1, byte param2) {
        if (param2 < 17) {
          field_c = null;
          eo.a(param0, param1, param1.length - 1, true, 0);
          return;
        } else {
          eo.a(param0, param1, param1.length - 1, true, 0);
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != 4) {
            field_c = null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
    }
}
