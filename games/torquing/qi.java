/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static ce field_a;
    static String[] field_e;
    static boolean field_c;
    static volatile int field_b;
    static dn field_d;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0 < 35) {
            field_d = null;
        }
    }

    final static short[] a(int param0, short[] param1, byte param2) {
        short[] var3 = null;
        short[] var4 = null;
        if (param2 != 60) {
          return null;
        } else {
          var4 = new short[param0];
          var3 = var4;
          dk.a(param1, 0, var4, 0, param0);
          return var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_b = -1;
        field_a = new ce();
    }
}
