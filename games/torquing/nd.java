/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static int field_a;

    final static boolean a(int param0, la param1, int param2, int param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        if (param2 == -1) {
          var5 = param1.a(param0, 100, param3);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            tf.a(param2 + 120, var5);
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
