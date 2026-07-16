/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    int field_e;
    int field_b;
    static String field_g;
    static int[] field_c;
    int field_f;
    int field_a;
    static boolean field_d;
    static String field_h;

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          if (-1 < (param3 ^ -1)) {
            return false;
          } else {
            if (param3 <= 11) {
              L0: {
                if (1 > param2) {
                  break L0;
                } else {
                  if (rp.a(param3, param1, -126) >= param2) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -1) {
            cl.a(89);
        }
        field_c = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_g = "last week's Diamond Division winner: ";
        field_c = new int[256];
        field_d = true;
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -257) {
            field_h = "Hide players in <%0>'s game";
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_c[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1 ^ -1) != -2) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> -1481890047 ^ -306674912;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
