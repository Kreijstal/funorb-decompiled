/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class or {
    static String[] field_b;
    static int field_a;
    static volatile boolean field_c;

    protected or() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        if (param0 < 4) {
            or.a((byte) -22);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static ll[] a(byte param0, int param1, int param2, int param3, int param4) {
        ll[] var5 = null;
        ll[] var6 = null;
        var6 = new ll[9];
        var5 = var6;
        int discarded$10 = 1;
        ll dupTemp$11 = tn.a(param4, 1);
        var5[6] = dupTemp$11;
        var5[3] = dupTemp$11;
        var5[2] = dupTemp$11;
        var5[1] = dupTemp$11;
        var5[0] = dupTemp$11;
        int discarded$12 = 1;
        ll dupTemp$13 = tn.a(param2, 1);
        var5[8] = dupTemp$13;
        var5[7] = dupTemp$13;
        var5[5] = dupTemp$13;
        if (param3 != 0) {
          int discarded$14 = 1;
          var6[4] = tn.a(param3, 64);
          return var5;
        } else {
          return var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = false;
    }
}
