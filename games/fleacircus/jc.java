/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc implements ch {
    static String field_d;
    static int field_f;
    static rh field_e;
    static String[] field_a;
    static vc field_c;
    static long field_b;

    final static int a(int param0, int param1) {
        if (param1 <= 113) {
            field_e = null;
        }
        param0 = param0 & 8191;
        if (-4097 < param0) {
            return -2049 <= param0 ? dk.field_D[4096 - param0] : dk.field_D[param0];
        }
        return -6145 < (param0 ^ -1) ? -dk.field_D[-4096 + param0] : -dk.field_D[8192 - param0];
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -37) {
            int discarded$0 = jc.a(84, 50);
        }
        field_e = null;
        field_c = null;
        field_a = null;
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int var6 = param1 + param3.field_y;
        if (param0 >= -36) {
            return;
        }
        int var7 = param3.field_z + param4;
        pj.a((byte) 127, param3.field_u, var7, var6, param3.field_j);
        dd var8 = t.field_h[1];
        if (param3 instanceof bb) {
            if (!(!((bb) (Object) param3).field_G)) {
                var8.a(var6 + (1 + (param3.field_u - var8.field_x >> -1375674303)), (-var8.field_r + param3.field_j >> -432594495) + (var7 + 1), 256);
            }
        }
        if (!(!param3.e(1))) {
            ek.a(param3.field_j - 4, 2 + var6, 2 + var7, 1, -4 + param3.field_u);
        }
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = fleas.field_A ? 1 : 0;
          if (-3 < (param0 ^ -1)) {
            break L0;
          } else {
            if ((param0 ^ -1) >= -37) {
              var4 = 0;
              if (param1 > 104) {
                var5 = 0;
                var6 = 0;
                var7 = param3.length();
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    if (var5 == 0) {
                      throw new NumberFormatException();
                    } else {
                      return var6;
                    }
                  } else {
                    L2: {
                      var9 = param3.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        if (var9 != 45) {
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
                        } else {
                          var4 = 1;
                          var8++;
                          continue L1;
                        }
                      } else {
                        break L2;
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
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 < param0) {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var9 + var6 * param0;
                      if (var10 / param0 != var6) {
                        throw new NumberFormatException();
                      } else {
                        var5 = 1;
                        var6 = var10;
                        var8++;
                        continue L1;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              } else {
                return 51;
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Error connecting to server. Please try using a different server.";
        field_c = null;
        field_f = 0;
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
