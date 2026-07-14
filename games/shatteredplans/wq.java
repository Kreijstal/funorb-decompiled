/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    boolean field_a;
    static String field_c;
    String field_b;
    String field_d;

    final static Object a(boolean param0, byte param1, byte[] param2) {
        cb var3 = null;
        if (param2 != null) {
          if (-137 > (param2.length ^ -1)) {
            var3 = new cb();
            ((le) (Object) var3).a(param2, (byte) 95);
            return (Object) (Object) var3;
          } else {
            if (param1 < -124) {
              if (param0) {
                return (Object) (Object) ck.a(param2, false);
              } else {
                return (Object) (Object) param2;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 68 / ((44 - param0) / 56);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "System captured<br><col=2F5FBF>(In colony colour)</col>";
    }
}
