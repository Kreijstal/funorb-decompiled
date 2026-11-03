/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    static String field_a;
    static Sprite field_b;

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4) {
        Sprite[] var6 = new Sprite[9];
        Sprite[] var5 = var6;
        Sprite dupTemp$0 = ik.b(param3, param1, param2 + 25976);
        var5[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        Sprite dupTemp$1 = ik.b(param3, param0, 2);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param2 == -25974) {
          if (param4 != 0) {
            var5[4] = ik.b(64, param4, lt.a(param2, -25976));
          }
          return var5;
        }
        field_a = (String) null;
        if (param4 != 0) {
          var5[4] = ik.b(64, param4, lt.a(param2, -25976));
        }
        return var5;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 <= 3) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
