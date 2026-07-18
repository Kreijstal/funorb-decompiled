/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends ve {
    static String field_B;
    be field_x;
    static ll[] field_v;
    byte[] field_z;
    static eg field_C;
    static String field_G;
    static String field_I;
    static String field_D;
    static qb[] field_E;
    static ql field_y;
    int field_A;
    static int field_F;
    static lg field_w;
    static ll[] field_H;
    static qb[] field_u;

    final static void a(int param0, int param1, boolean param2, int param3) {
        L0: {
          if (0 != param3) {
            break L0;
          } else {
            if (param1 != on.field_h) {
              ui.field_s = true;
              on.field_h = param1;
              ub.a(param0, false);
              break L0;
            } else {
              if (param3 == 1) {
                if (ra.field_m != param1) {
                  ui.field_s = true;
                  ra.field_m = param1;
                  ub.a(param0, false);
                  if (2 == param3) {
                    if (param1 == hd.field_b) {
                      return;
                    } else {
                      hd.field_b = param1;
                      ui.field_s = true;
                      ub.a(param0, false);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (2 == param3) {
                    if (param1 == hd.field_b) {
                      return;
                    } else {
                      hd.field_b = param1;
                      ui.field_s = true;
                      ub.a(param0, false);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (2 == param3) {
                  if (param1 == hd.field_b) {
                    return;
                  } else {
                    hd.field_b = param1;
                    ui.field_s = true;
                    ub.a(param0, false);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        L1: {
          if (param3 != 1) {
            break L1;
          } else {
            if (ra.field_m == param1) {
              break L1;
            } else {
              ui.field_s = true;
              ra.field_m = param1;
              ub.a(param0, false);
              if (2 == param3) {
                if (param1 == hd.field_b) {
                  return;
                } else {
                  hd.field_b = param1;
                  ui.field_s = true;
                  ub.a(param0, false);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (2 == param3) {
          if (param1 == hd.field_b) {
            return;
          } else {
            hd.field_b = param1;
            ui.field_s = true;
            ub.a(param0, false);
            return;
          }
        } else {
          return;
        }
    }

    final byte[] c(int param0) {
        if (!((ea) this).field_p) {
          if (param0 > -11) {
            byte[] discarded$2 = ((ea) this).c(-122);
            return ((ea) this).field_z;
          } else {
            return ((ea) this).field_z;
          }
        } else {
          throw new RuntimeException();
        }
    }

    public static void f(byte param0) {
        field_v = null;
        field_B = null;
        field_u = null;
        field_C = null;
        int var1 = 14;
        field_H = null;
        field_I = null;
        field_y = null;
        field_G = null;
        field_w = null;
        field_D = null;
        field_E = null;
    }

    final int e(byte param0) {
        if (param0 > -71) {
            field_B = null;
            if (!(!((ea) this).field_p)) {
                return 0;
            }
            return 100;
        }
        if (!(!((ea) this).field_p)) {
            return 0;
        }
        return 100;
    }

    ea() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "To Customer Support";
        field_G = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_I = "Declined";
        field_D = "Checking";
        field_y = new ql("email");
        field_F = 20;
    }
}
