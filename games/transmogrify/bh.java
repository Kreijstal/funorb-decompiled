/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static int field_c;
    static int[] field_a;
    static String[] field_b;

    final static fc a(int param0, String param1) {
        if (param0 >= -64) {
            return null;
        }
        return new fc(param1);
    }

    final static ti[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 > -109) {
          field_b = null;
          return nj.a(1, param4, param2, 3, 1, param3, 103, 1, param0);
        } else {
          return nj.a(1, param4, param2, 3, 1, param3, 103, 1, param0);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 88) {
            field_c = -60;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
