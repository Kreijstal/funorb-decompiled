/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends ca {
    static String field_u;
    int field_g;
    int field_r;
    int field_m;
    int field_k;
    static volatile int field_p;
    static hj field_i;
    int field_n;
    static String field_s;
    int[] field_o;
    int field_t;
    static int field_l;
    static String field_j;
    int field_f;
    static dj field_q;
    long field_h;

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (nh.a(false, param0)) {
            return true;
          } else {
            if (param1 == -22118) {
              if (param0 != 45) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
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
            } else {
              field_l = -96;
              if (param0 != 45) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
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
          }
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        field_q = null;
        field_u = null;
        if (param0) {
          vg.c(true);
          field_s = null;
          field_i = null;
          return;
        } else {
          field_s = null;
          field_i = null;
          return;
        }
    }

    vg(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((vg) this).field_k = param1;
        ((vg) this).field_r = param5;
        uk.field_a = uk.field_a + 1;
        ((vg) this).field_t = uk.field_a & 65535;
        ((vg) this).field_g = param0;
        ((vg) this).field_o = param6;
        ((vg) this).field_m = param3;
        ((vg) this).field_f = param4;
        ((vg) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_u = "Waiting for sound effects";
        field_s = "Resume Game";
        field_j = "Please check if address is correct";
    }
}
