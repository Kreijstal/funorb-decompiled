/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    private int[] field_b;
    static String field_c;
    static String field_a;

    public static void a(byte param0) {
        if (param0 < 42) {
            field_a = null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    gl(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if ((param0.length - -(param0.length >> -1578390015) ^ -1) > (var2 ^ -1)) {
            ((gl) this).field_b = new int[var2 + var2];
            var3 = 0;
            L1: while (true) {
              if (var2 + var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if ((param0.length ^ -1) < (var3 ^ -1)) {
                    var4 = param0[var3] & -1 + var2;
                    L3: while (true) {
                      if (((gl) this).field_b[var4 + var4 + 1] == -1) {
                        ((gl) this).field_b[var4 + var4] = param0[var3];
                        ((gl) this).field_b[1 + var4 + var4] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = -1 + var2 & var4 - -1;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((gl) this).field_b[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    final static boolean a(da param0, byte param1) {
        if (param1 != -37) {
            field_a = null;
            return param0.h(1, param1 + 44) == 1 ? true : false;
        }
        return param0.h(1, param1 + 44) == 1 ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = -1 + (((gl) this).field_b.length >> 1563688769);
        if (param1 == 24) {
          var4 = param0 & var3;
          L0: while (true) {
            var5 = ((gl) this).field_b[var4 + (var4 + 1)];
            if (-1 == var5) {
              return -1;
            } else {
              if (((gl) this).field_b[var4 + var4] == param0) {
                return var5;
              } else {
                var4 = 1 + var4 & var3;
                continue L0;
              }
            }
          }
        } else {
          return -110;
        }
    }

    final static int a(boolean param0, int param1, byte param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        if (-3 < (param1 ^ -1)) {
          throw new IllegalArgumentException("" + param1);
        } else {
          if ((param1 ^ -1) >= -37) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L0: while (true) {
              if (var7 <= var8) {
                if (var5 == 0) {
                  throw new NumberFormatException();
                } else {
                  var8 = -117 % ((-42 - param2) / 58);
                  return var6;
                }
              } else {
                L1: {
                  L2: {
                    var9 = param3.charAt(var8);
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        break L1;
                      } else {
                        if (var9 != 43) {
                          break L2;
                        } else {
                          if (!param0) {
                            break L2;
                          } else {
                            break L1;
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
                        if (90 >= var9) {
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
                        if (122 >= var9) {
                          var9 -= 87;
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if ((param1 ^ -1) >= (var9 ^ -1)) {
                    throw new NumberFormatException();
                  } else {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var6 * param1 - -var9;
                    if ((var10 / param1 ^ -1) != (var6 ^ -1)) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      break L1;
                    }
                  }
                }
                var8++;
                continue L0;
              }
            }
          } else {
            throw new IllegalArgumentException("" + param1);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email address is unavailable";
        field_a = "Total";
    }
}
