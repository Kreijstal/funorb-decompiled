/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu {
    static js field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            eu.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1, long param2, int param3, int[] param4) {
        if (param1 <= -58) {
          if (param4 != null) {
            if ((param3 ^ -1) == -3) {
              if (!eea.a(param0, param2, -110)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          eu.a(true);
          if (param4 != null) {
            if ((param3 ^ -1) == -3) {
              if (!eea.a(param0, param2, -110)) {
                return false;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Type your password again to make sure it's correct";
    }
}
