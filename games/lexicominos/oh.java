/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_c;
    static String field_a;
    static int field_b;

    final static java.awt.Frame a(int param0, int param1, int param2, byte param3, int param4, ab param5) {
        we[] var6 = null;
        int var7 = 0;
        int var8_int = 0;
        java.awt.Frame var8 = null;
        int var9 = 0;
        we[] var10 = null;
        ei var11 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param5.b(0)) {
          L0: {
            if (-1 != (param4 ^ -1)) {
              break L0;
            } else {
              var10 = gb.a((byte) -127, param5);
              var6 = var10;
              if (var6 != null) {
                var7 = 0;
                var8_int = 0;
                L1: while (true) {
                  if (var8_int >= var10.length) {
                    if (var7 != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var10[var8_int].field_a == param1) {
                      if (param0 == var10[var8_int].field_e) {
                        L2: {
                          if (-1 == (param2 ^ -1)) {
                            break L2;
                          } else {
                            if (param2 == var10[var8_int].field_k) {
                              break L2;
                            } else {
                              var8_int++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7 == 0) {
                            break L3;
                          } else {
                            if (var10[var8_int].field_f > param4) {
                              break L3;
                            } else {
                              var8_int++;
                              continue L1;
                            }
                          }
                        }
                        param4 = var10[var8_int].field_f;
                        var7 = 1;
                        var8_int++;
                        continue L1;
                      } else {
                        var8_int++;
                        continue L1;
                      }
                    } else {
                      var8_int++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          var11 = param5.a(28460, param1, param0, param4, param2);
          var7 = -55 / ((param3 - -61) / 63);
          L4: while (true) {
            if (-1 != (var11.field_b ^ -1)) {
              var8 = (java.awt.Frame) var11.field_g;
              if (var8 != null) {
                if (-3 != (var11.field_b ^ -1)) {
                  return var8;
                } else {
                  ca.a(param5, 15232, var8);
                  return null;
                }
              } else {
                return null;
              }
            } else {
              ge.a(0, 10L);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(sh param0, int param1) {
        if (param1 >= -16) {
            field_c = null;
        }
        return param0.a((byte) -128);
    }

    final static int a(int param0, byte[] param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        int var4 = -1;
        if (param2) {
            Object var7 = null;
            java.awt.Frame discarded$0 = oh.a(-37, 109, 83, (byte) 108, 101, (ab) null);
        }
        for (var5 = param0; var5 < param3; var5++) {
            var4 = var4 >>> -2041527256 ^ d.field_c[255 & (param1[var5] ^ var4)];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final static void a(int param0, db param1, boolean param2, String param3, int param4, int param5) {
        if (param2) {
            Object var7 = null;
            java.awt.Frame discarded$0 = oh.a(-85, -81, 63, (byte) 46, 52, (ab) null);
        }
        eh.a(param4, param1, param5 + -(24 * (param3.length() - 1)), 0, param3, param0);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -85 % ((param0 - -65) / 48);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
