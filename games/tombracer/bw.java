/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw {
    static int[] field_b;
    static iu field_a;

    final static Object a(int param0, byte[] param1, boolean param2) {
        ie var3 = null;
        if (param0 == 270) {
          if (param1 != null) {
            if ((param1.length ^ -1) < -137) {
              var3 = new ie();
              ((qu) (Object) var3).a(true, param1);
              return (Object) (Object) var3;
            } else {
              if (param2) {
                return (Object) (Object) lh.a(param1, 6711);
              } else {
                return (Object) (Object) param1;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 < 108) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_a = new iu(270, 70);
    }
}
