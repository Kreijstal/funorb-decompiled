/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pl {
    static Random field_d;
    static ka[] field_f;
    static ka[] field_c;
    static int field_a;
    static int[] field_b;
    static int[] field_e;

    final static vi a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        vi var7 = null;
        int var8 = TorChallenge.field_F ? 1 : 0;
        int var2 = param0.length();
        if (0 == var2) {
            return dj.field_W;
        }
        if (!((var2 ^ -1) >= -256)) {
            return uk.field_I;
        }
        String[] var3 = dl.a(param0, '.', -60);
        if (!((var3.length ^ -1) <= -3)) {
            return dj.field_W;
        }
        String[] var4 = var3;
        if (param1 != 96) {
            return null;
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ma.b(var6, (byte) -25);
            if (var7 != null) {
                return var7;
            }
        }
        return gb.a(param1 + -209, var3[-1 + var3.length]);
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (param1 == -4346) {
          var7 = 0;
          L0: while (true) {
            if (w.field_m <= var7) {
              return false;
            } else {
              L1: {
                var3 = cb.field_c[var7][0];
                var4 = cb.field_c[var7][2];
                var6 = cb.field_c[var7][3];
                var5 = cb.field_c[var7][1];
                if (param2 != var3) {
                  break L1;
                } else {
                  if (var5 == param0) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
              if (param2 == var4) {
                if (var6 == param0) {
                  return true;
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        pa.a("", 8, param1);
        ek.a((byte) -126, param1);
        if (param0 < 112) {
            field_f = null;
        }
    }

    final static void a(int param0, String param1, ka param2) {
        lj.field_f = param2;
        if (param0 != 13267) {
            field_b = null;
        }
        ia.field_l = param1;
    }

    final static boolean a(lj param0, lj param1, byte param2, lj param3) {
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        if (!param3.b(param2 ^ 8055)) {
          return false;
        } else {
          if (param3.b(5, "commonui")) {
            L0: {
              if (!param0.b(param2 + -7857)) {
                break L0;
              } else {
                if (!param0.b(param2 ^ -103, "commonui")) {
                  break L0;
                } else {
                  if (param2 == -100) {
                    L1: {
                      L2: {
                        if (!param1.b(param2 + -7857)) {
                          break L2;
                        } else {
                          if (!param1.b(5, "button.gif")) {
                            break L2;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L1;
                    }
                    return stackIn_14_0 != 0;
                  } else {
                    return true;
                  }
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -74) {
            field_a = -21;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new Random();
        field_a = 20;
        field_b = new int[]{64, 64, 96, 64, 96, 96, 64, 64, 64, 128};
        field_e = new int[]{-1, -1, -1, 0, 1, 2, 4, 5, -1, 6, 3, -1, -1, -1, -1, -1, -1, -1};
    }
}
