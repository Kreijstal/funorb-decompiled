/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw extends gn {
    static double field_f;
    static int field_i;
    static boolean field_k;
    byte[] field_g;
    private static int[] field_h;
    private static int[] field_e;
    static float field_j;

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 <= 83) {
            field_e = null;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        if (param0 != null) {
          var3 = param0.length();
          if (var3 >= 1) {
            if (12 >= var3) {
              var4 = mo.a(0, param0);
              if (var4 != null) {
                if (1 <= var4.length()) {
                  if (!ca.a(false, var4.charAt(0))) {
                    if (!ca.a(false, var4.charAt(-1 + var4.length()))) {
                      if (param1 == -26200) {
                        var5 = 0;
                        var6 = 0;
                        L0: while (true) {
                          if (param0.length() <= var6) {
                            if (0 < var5) {
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            L1: {
                              var7 = param0.charAt(var6);
                              if (!ca.a(false, (char) var7)) {
                                var5 = 0;
                                break L1;
                              } else {
                                var5++;
                                break L1;
                              }
                            }
                            if (-3 < (var5 ^ -1)) {
                              var6++;
                              var6++;
                              continue L0;
                            } else {
                              if (!param2) {
                                return false;
                              } else {
                                var6++;
                                continue L0;
                              }
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static ki a(int param0, int param1, int param2, byte param3, byte param4) {
        int var5 = -103 / ((-46 - param2) / 36);
        return new ki(2, param0, param1, param4, param3);
    }

    hw(byte[] param0) {
        ((hw) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = 16384.0;
        field_i = (int)field_f >> -2034772605;
        field_h = new int[255];
        for (var0 = 0; 255 > var0; var0++) {
            field_h[var0] = hf.a(var0 << -256553616, var0 << 888537512);
        }
        field_e = new int[255];
        for (var0 = 0; -256 < (var0 ^ -1); var0++) {
            field_e[var0] = hf.a(var0 << -638493872, var0);
        }
    }
}
