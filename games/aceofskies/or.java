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
        ll dupTemp$6 = tn.a(param4, param1, true);
        var6[6] = dupTemp$6;
        var5[3] = dupTemp$6;
        var5[2] = dupTemp$6;
        var5[1] = dupTemp$6;
        var5[0] = dupTemp$6;
        if (param0 < -28) {
          ll dupTemp$7 = tn.a(param2, param1, true);
          var6[8] = dupTemp$7;
          var5[7] = dupTemp$7;
          var5[5] = dupTemp$7;
          if (param3 != 0) {
            var6[4] = tn.a(param3, 64, true);
            return var5;
          } else {
            return var5;
          }
        } else {
          or.a((byte) 107);
          ll dupTemp$8 = tn.a(param2, param1, true);
          var6[8] = dupTemp$8;
          var5[7] = dupTemp$8;
          var5[5] = dupTemp$8;
          if (param3 == 0) {
            return var5;
          } else {
            var6[4] = tn.a(param3, 64, true);
            return var5;
          }
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
