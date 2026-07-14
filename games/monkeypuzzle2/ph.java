/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static te field_b;
    static le field_d;
    static String field_a;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 1) {
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        int var3 = 0;
        if (!bg.a(4826, param2)) {
          if (sg.a(param2, false)) {
            return false;
          } else {
            if (tl.a(0, param2)) {
              return false;
            } else {
              if (0 != param0.length()) {
                if (qj.a(param2, false, param0)) {
                  return false;
                } else {
                  var3 = -121 % ((param1 - 42) / 59);
                  if (!ue.a(param2, param0, (byte) -84)) {
                    if (di.a(95, param0, param2)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new te(14, 0, 4, 1);
        field_a = "Next";
    }
}
