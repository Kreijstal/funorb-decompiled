/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends rf {
    static String field_i;
    static int field_k;
    int[] field_j;
    static String[] field_f;
    int field_g;
    static byte[][] field_h;

    final static String a(int param0) {
        if (uh.field_k == jl.field_a) {
            return wj.field_c;
        }
        if (!qa.field_a.b(false)) {
            return qa.field_a.a((byte) 2);
        }
        if (ie.field_x == jl.field_a) {
            return qa.field_a.a((byte) 2);
        }
        if (param0 != 29084) {
            Object var2 = null;
            boolean discarded$0 = we.a((byte) -46, (CharSequence) null, false, -37);
        }
        return lc.field_hb;
    }

    private we() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (param3 < 2) {
            break L0;
          } else {
            if (36 < param3) {
              break L0;
            } else {
              if (param0 == -108) {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param1.length();
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param1.charAt(var8);
                      if (-1 != (var8 ^ -1)) {
                        break L2;
                      } else {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param2) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (var9 > 57) {
                            break L4;
                          } else {
                            var9 -= 48;
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
                          break L5;
                        } else {
                          if (var9 > 90) {
                            break L5;
                          } else {
                            var9 -= 55;
                            break L3;
                          }
                        }
                      }
                      if (97 > var9) {
                        return false;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L3;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (var9 < param3) {
                      L6: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var10 = var6 * param3 - -var9;
                      if (var6 != var10 / param3) {
                        return false;
                      } else {
                        var5 = 1;
                        var6 = var10;
                        var8++;
                        continue L1;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return true;
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    public static void b(byte param0) {
        if (param0 != 95) {
            String discarded$0 = we.a(-107);
        }
        field_f = null;
        field_h = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_f = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_h = new byte[250][];
    }
}
