/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du {
    static jpa field_c;
    static String field_a;
    static int field_d;
    static boolean field_e;
    static String field_f;
    static String field_b;
    static boolean field_g;
    static long field_h;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        bga.field_c = null;
        var2 = -112 / ((param1 - 76) / 38);
        jia.field_a = null;
        cma.field_m = 0;
        var3 = field_d;
        field_d = ko.field_d;
        if (param0 == 51) {
          L0: {
            wg.field_l.field_n = 2;
            ko.field_d = var3;
            wg.field_l.field_a = wg.field_l.field_a + 1;
            if (wg.field_l.field_a < 2) {
              break L0;
            } else {
              if (51 != param0) {
                break L0;
              } else {
                return 2;
              }
            }
          }
          L1: {
            if (wg.field_l.field_a < 2) {
              break L1;
            } else {
              if (param0 != 50) {
                break L1;
              } else {
                return 5;
              }
            }
          }
          if (wg.field_l.field_a >= 4) {
            return 1;
          } else {
            return -1;
          }
        } else {
          if (param0 == 50) {
            L2: {
              wg.field_l.field_n = 5;
              ko.field_d = var3;
              wg.field_l.field_a = wg.field_l.field_a + 1;
              if (wg.field_l.field_a < 2) {
                break L2;
              } else {
                if (51 != param0) {
                  break L2;
                } else {
                  return 2;
                }
              }
            }
            L3: {
              if (wg.field_l.field_a < 2) {
                break L3;
              } else {
                if (param0 != 50) {
                  break L3;
                } else {
                  return 5;
                }
              }
            }
            if (wg.field_l.field_a >= 4) {
              return 1;
            } else {
              return -1;
            }
          } else {
            wg.field_l.field_n = 1;
            ko.field_d = var3;
            wg.field_l.field_a = wg.field_l.field_a + 1;
            if (wg.field_l.field_a >= 2) {
              if (51 == param0) {
                return 2;
              } else {
                if (wg.field_l.field_a >= 2) {
                  if (param0 == 50) {
                    return 5;
                  } else {
                    if (wg.field_l.field_a >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if (wg.field_l.field_a >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              if (wg.field_l.field_a >= 2) {
                if (param0 == 50) {
                  return 5;
                } else {
                  if (wg.field_l.field_a >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                if (wg.field_l.field_a >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
        field_f = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Players";
        field_b = "These walls enjoy going for walkies. Wallflowers they aren't.";
        field_f = "You can't slay these septic serpents, so steer clear. Hold <img=10><img=11> as you step over the snakes to sneak by.";
    }
}
