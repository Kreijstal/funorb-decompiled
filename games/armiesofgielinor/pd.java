/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int[] field_a;
    static int[] field_g;
    static String field_b;
    static je field_c;
    static int field_e;
    static js field_d;
    static String field_f;

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 < 37) {
          field_c = null;
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 + param3 + param2 <= qn.field_g) {
            return param3 + param2;
        }
        if (!(param2 + -param0 < param1)) {
            return -param0 + param2;
        }
        return -param0 + qn.field_g;
    }

    final static boolean a(String param0, int param1) {
        if (param0 != null) {
          if (param0.length() >= eb.field_b) {
            if (param0.length() <= db.field_g) {
              if (param1 != 0) {
                field_g = null;
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, vh param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = -123 % ((-11 - param3) / 50);
        if (0 == param0) {
          if (param1 != 0) {
            var5 = param0 & 255;
            var6 = param1 & 255;
            param2.b(true, var6 | var5 << -1406552632);
            return;
          } else {
            param2.b(true, 0);
            return;
          }
        } else {
          var5 = param0 & 255;
          var6 = param1 & 255;
          param2.b(true, var6 | var5 << -1406552632);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[4];
        field_f = "Close";
    }
}
