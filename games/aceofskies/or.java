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
        ll dupTemp$1 = null;
        ll[] var6 = new ll[9];
        ll[] var5 = var6;
        ll dupTemp$0 = tn.a(param4, param1, true);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        if (param0 >= -28) {
          or.a((byte) 107);
          dupTemp$1 = tn.a(param2, param1, true);
          var6[8] = dupTemp$1;
          var5[7] = dupTemp$1;
          var5[5] = dupTemp$1;
          if (param3 != 0) {
            var6[4] = tn.a(param3, 64, true);
            return var5;
          }
          return var5;
        }
        ll dupTemp$2 = tn.a(param2, param1, true);
        var6[8] = dupTemp$2;
        var5[7] = dupTemp$2;
        var5[5] = dupTemp$2;
        if (param3 == 0) {
          return var5;
        }
        var6[4] = tn.a(param3, 64, true);
        return var5;
    }

    static {
        field_a = 0;
        field_c = false;
    }
}
