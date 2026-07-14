/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_a;

    final static boolean a(String param0, byte param1, String param2) {
        if (!bi.a(0, param2)) {
          if (nj.a(param2, (byte) 120)) {
            return false;
          } else {
            if (ek.a(-123, param2)) {
              return false;
            } else {
              if (0 == param0.length()) {
                return true;
              } else {
                if (!im.a(param2, 0, param0)) {
                  if (a.a((byte) -33, param2, param0)) {
                    return false;
                  } else {
                    if (!lm.a(param0, param2, 14965)) {
                      if (param1 > -3) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static ea[] a(String param0, bj param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a(-6, param2);
        if (param3 < 108) {
          field_a = null;
          var5 = param1.a(param0, var4, -91);
          return ki.a(var5, param1, var4, (byte) -7);
        } else {
          var5 = param1.a(param0, var4, -91);
          return ki.a(var5, param1, var4, (byte) -7);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading levels";
    }
}
