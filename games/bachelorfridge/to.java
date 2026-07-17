/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    static String field_a;
    static kv field_b;

    final static kv[] a(int param0, int param1, int param2, int param3, int param4) {
        kv[] var5 = null;
        kv[] var6 = null;
        var6 = new kv[9];
        var5 = var6;
        kv dupTemp$4 = ik.b(param3, param1, param2 + 25976);
        var5[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        kv dupTemp$5 = ik.b(param3, param0, 2);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param2 != -25974) {
          L0: {
            field_a = null;
            if (param4 != 0) {
              var5[4] = ik.b(64, param4, lt.a(param2, -25976));
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            if (param4 != 0) {
              var5[4] = ik.b(64, param4, lt.a(param2, -25976));
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    static {
    }
}
