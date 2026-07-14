/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static String field_d;
    static boolean field_e;
    static uk field_b;
    static int field_c;

    final static int a(int param0, byte param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = wizardrun.field_H;
          if (-3 < (param0 ^ -1)) {
            break L0;
          } else {
            if (36 < param0) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  var9 = 60 / ((54 - param1) / 63);
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L2: {
                    var9 = param2.charAt(var8);
                    if (0 == var8) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L2;
                        } else {
                          if (!param3) {
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
                      if (97 > var9) {
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
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var9 + var6 * param0;
                    if (var6 != var10 / param0) {
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
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    final static void a(int param0, vd param1, o[] param2, byte param3, o[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, o[] param12, int param13, int param14) {
        int var17 = 116 % ((-65 - param3) / 32);
        int var15 = param1.field_B + param1.field_q;
        int var16 = param1.field_q;
        we.a(480, -76, param1, param8, param2, var16, param13, param11, param1, param0, var15, param9, param10, param5, param14, var15, param6, param4, param7, param12, var16);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (!param0) {
            Object var2 = null;
            il.a(38, (vd) null, (o[]) null, (byte) 32, (o[]) null, 126, -35, -34, -69, 83, 52, -119, (o[]) null, -69, -124);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for sound effects";
        field_c = 0;
    }
}
