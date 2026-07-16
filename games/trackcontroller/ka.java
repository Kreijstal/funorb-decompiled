/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static boolean field_a;
    static ja field_d;
    static int[] field_f;
    static String field_e;
    static int field_c;
    static ba field_b;

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = TrackController.field_F ? 1 : 0;
        char[] var10 = new char[param3];
        char[] var4 = var10;
        int var5 = 0;
        if (param1 != -129) {
            return null;
        }
        for (var6 = 0; var6 < param3; var6++) {
            var7 = param2[param0 + var6] & 255;
            if (var7 != 0) {
                if ((var7 ^ -1) <= -129) {
                    if (!(-161 >= (var7 ^ -1))) {
                        var8 = h.field_e[var7 + -128];
                        if (var8 == 0) {
                            var8 = 63;
                        }
                        var7 = var8;
                    }
                }
                int incrementValue$0 = var5;
                var5++;
                var10[incrementValue$0] = (char)var7;
            }
        }
        return new String(var10, 0, var5);
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        if (param0 != null) {
          L0: {
            var3 = param0.length();
            if (param2 < var3) {
              break L0;
            } else {
              if (-13 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = r.a(param0, param2 ^ 11133);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (-2 < (var4.length() ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (sf.a(var4.charAt(0), -33)) {
                          break L2;
                        } else {
                          if (sf.a(var4.charAt(-1 + var4.length()), param2 ^ 33)) {
                            break L2;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L3: while (true) {
                              if (var6 >= param0.length()) {
                                if (-1 < var5) {
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                L4: {
                                  var7 = param0.charAt(var6);
                                  if (!sf.a((char) var7, -33)) {
                                    var5 = 0;
                                    break L4;
                                  } else {
                                    var5++;
                                    break L4;
                                  }
                                }
                                if (var5 <= -3) {
                                  if (!param1) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      return false;
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

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        if (!param0) {
            field_b = null;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ja();
        field_e = "Show my scores only.";
        field_b = new ba();
    }
}
