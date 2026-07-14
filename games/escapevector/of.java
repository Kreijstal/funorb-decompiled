/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static String field_e;
    static java.awt.Canvas field_d;
    static int field_c;
    static rf field_f;
    static boolean field_b;
    static ed field_a;
    static fd field_g;
    static hh field_h;

    final static ed a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        ed var7 = new ed(param2, param2);
        ed var3 = var7;
        int var4 = 92 % ((param1 - 15) / 58);
        for (var5 = 0; var5 < var3.field_B.length; var5++) {
            var7.field_B[var5] = param0;
        }
        return var3;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param1 >= 28) {
            break L0;
          } else {
            boolean discarded$2 = of.a('ﾱ', (byte) 49);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (65 > param0) {
                break L3;
              } else {
                if (90 >= param0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 97) {
                break L4;
              } else {
                if (122 < param0) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static boolean a(mf param0, mf param1, mf param2, byte param3) {
        if (!param0.b(0)) {
          return false;
        } else {
          if (param0.a(0, "commonui")) {
            L0: {
              if (!param1.b(0)) {
                break L0;
              } else {
                if (!param1.a(0, "commonui")) {
                  break L0;
                } else {
                  L1: {
                    if (!param2.b(0)) {
                      break L1;
                    } else {
                      if (!param2.a(0, "button.gif")) {
                        break L1;
                      } else {
                        L2: {
                          if (param3 <= -1) {
                            break L2;
                          } else {
                            field_h = null;
                            break L2;
                          }
                        }
                        return true;
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final static lm a(int param0, String param1) {
        if (param0 != 122) {
            boolean discarded$0 = of.a('o', (byte) -83);
        }
        if (ui.field_b == dg.field_o) {
            return null;
        }
        if (ia.field_y == ui.field_b) {
            if (param1.equals((Object) (Object) tc.field_j)) {
                ui.field_b = vn.field_g;
                return co.field_a;
            }
        }
        tc.field_j = param1;
        co.field_a = null;
        ui.field_b = dg.field_o;
        return null;
    }

    final static void a(boolean param0) {
        if (param0) {
            of.a(89);
        }
        gi.field_e = null;
        gn.field_k = null;
        qe.field_a = null;
        bc.field_a = null;
        qk.field_f = null;
        qh.field_k = null;
    }

    final static int a(byte param0) {
        if (param0 >= -72) {
            of.a(-52);
        }
        return md.field_G;
    }

    public static void a(int param0) {
        if (param0 != 122) {
            return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Start Game";
        field_c = 70;
        field_f = new rf();
    }
}
