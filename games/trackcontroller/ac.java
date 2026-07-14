/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;
    static String field_b;
    static int[] field_c;

    public static void a(int param0) {
        int var1 = 85 / ((param0 - 43) / 54);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, int param1) {
        if (param1 == -23797) {
          if (param0 != null) {
            if (param0.length() >= wl.field_j) {
              if (param0.length() <= da.field_m) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
