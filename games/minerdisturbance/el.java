/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    static boolean field_c;
    static String field_a;
    static String field_b;
    static char field_d;

    final static void a(int param0, int param1) {
        L0: {
          if (al.field_s == de.field_b) {
            break L0;
          } else {
            if (aa.field_e != de.field_b) {
              if (param1 == -5629) {
                if (-1 != (param0 ^ -1)) {
                  L1: {
                    if ((param0 ^ -1) == -2) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                } else {
                  L2: {
                    mm.a(false, h.field_d, 2, param1 + 5630, true, 2);
                    if ((param0 ^ -1) == -2) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                el.a(53, -55);
                if (-1 == (param0 ^ -1)) {
                  L3: {
                    mm.a(false, h.field_d, 2, param1 + 5630, true, 2);
                    if ((param0 ^ -1) == -2) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    if ((param0 ^ -1) == -2) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static ea a(int param0, int param1, bj param2, int param3) {
        if (param3 == 2) {
          if (!cn.a(param0, param3 + 256, param1, param2)) {
            return null;
          } else {
            return ti.a(0);
          }
        } else {
          el.a(115, 46);
          if (!cn.a(param0, param3 + 256, param1, param2)) {
            return null;
          } else {
            return ti.a(0);
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 2) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = '"';
        field_c = false;
        field_a = "Charge: Explosives. Works underwater.";
        field_b = "Micro drill: Allows mining in mid-air.";
    }
}
