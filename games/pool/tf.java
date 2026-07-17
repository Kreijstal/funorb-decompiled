/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static tm field_a;
    static boolean field_d;
    int field_c;
    static String field_b;

    final static dd a(int param0, int param1) {
        if (param0 == -17104) {
          if (mp.field_V <= 0) {
            if (!ap.field_w[param1]) {
              return ua.field_r;
            } else {
              return mm.field_j;
            }
          } else {
            return ua.field_r;
          }
        } else {
          field_a = null;
          if (mp.field_V <= 0) {
            if (!ap.field_w[param1]) {
              return ua.field_r;
            } else {
              return mm.field_j;
            }
          } else {
            return ua.field_r;
          }
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (qi.field_a != 13) {
          if (qi.field_a != 102) {
            if (param0 == 15585) {
              if (null != im.field_Ub) {
                if (!im.field_Ub.a(param2, param1, 85)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            im.field_Ub.f(param0 ^ 30860);
            return true;
          }
        } else {
          th.b(-1);
          return true;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -29 / ((param0 - 26) / 35);
    }

    tf(int param0) {
        ((tf) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Player";
    }
}
