/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends gg {
    static String field_k;
    static int field_l;
    static o[] field_i;
    static na field_j;
    static String field_h;

    private wi() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          if (-3 < (param3 ^ -1)) {
            break L0;
          } else {
            if (36 < param3) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              if (param0 == -913) {
                var6 = 0;
                var7 = param2.length();
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param2.charAt(var8);
                      if (var8 == 0) {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param1) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
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
                      if (var9 < 97) {
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
                    if (param3 <= var9) {
                      return false;
                    } else {
                      L6: {
                        if (var4 == 0) {
                          break L6;
                        } else {
                          var9 = -var9;
                          break L6;
                        }
                      }
                      var10 = var6 * param3 + var9;
                      if (var10 / param3 == var6) {
                        var5 = 1;
                        var6 = var10;
                        var8++;
                        continue L1;
                      } else {
                        return false;
                      }
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

    final static void c(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(114, param0);
        var2.c(75, 0);
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != -26923) {
            int discarded$0 = wi.b(-104, -27);
        }
        field_i = null;
        field_j = null;
        field_k = null;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (param1 < 0) {
              break L1;
            } else {
              if (param1 >= 65536) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var2 += 16;
          param1 = param1 >>> 16;
          break L0;
        }
        L2: {
          if ((param1 ^ -1) > -257) {
            break L2;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L2;
          }
        }
        L3: {
          if (-17 >= (param1 ^ -1)) {
            param1 = param1 >>> 4;
            var2 += 4;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 < 4) {
            break L4;
          } else {
            var2 += 2;
            param1 = param1 >>> 2;
            break L4;
          }
        }
        if (param0 >= 72) {
          L5: {
            if (param1 < 1) {
              break L5;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L5;
            }
          }
          return param1 + var2;
        } else {
          return -3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 250;
        field_k = "Type your password again to make sure it's correct";
        field_h = "Updates will sent to the email address you've given";
    }
}
