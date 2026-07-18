/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static int[] field_a;
    static String field_b;

    final static ak a(int param0, int param1, int param2, int param3, int param4) {
        ak var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var5 = (ak) (Object) hd.field_d.g(32073);
        L0: while (true) {
          if (var5 != null) {
            if (param0 != var5.field_g) {
              var5 = (ak) (Object) hd.field_d.a(false);
              continue L0;
            } else {
              return var5;
            }
          } else {
            var5 = new ak();
            var5.field_j = 1;
            var5.field_h = 10;
            var5.field_g = param0;
            hd.field_d.b(0, (jb) (Object) var5);
            j.a(var5, 3, false);
            return var5;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 102) {
            jp.a((byte) 44);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_b = "Push the rock to kill this spider.";
    }
}
