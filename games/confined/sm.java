/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends rl {
    static mn field_y;
    ae field_B;
    static od field_A;
    int field_z;
    byte[] field_C;

    final static boolean a(int param0, hb param1) {
        int var2 = -87 / ((param0 - -63) / 59);
        return 1 == param1.g(1, 0) ? true : false;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Confined.field_J ? 1 : 0;
        if (param4 != 87) {
          field_y = null;
          L0: while (true) {
            param3--;
            if (0 <= param3) {
              var11 = param0;
              var9 = var11;
              var5 = var9;
              var6 = param2;
              var7 = param1;
              var9[var6] = var7 - -(va.a(var11[var6], 16711422) >> -1576680799);
              param2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param3--;
            if (0 <= param3) {
              var10 = param0;
              var9 = var10;
              var5 = var9;
              var6 = param2;
              var7 = param1;
              var9[var6] = var7 - -(va.a(var10[var6], 16711422) >> -1576680799);
              param2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final byte[] e(byte param0) {
        if (((sm) this).field_v) {
            throw new RuntimeException();
        }
        if (param0 < 82) {
            return null;
        }
        return ((sm) this).field_C;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        if (param2 <= -3) {
          if (-37 >= param2) {
            var4 = param1 ? 1 : 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = 0;
            L0: while (true) {
              if (var7 > var8) {
                L1: {
                  var9 = param0.charAt(var8);
                  if (0 == var8) {
                    if (var9 != 45) {
                      if (43 != var9) {
                        break L1;
                      } else {
                        if (!param3) {
                          break L1;
                        } else {
                          var8++;
                          continue L0;
                        }
                      }
                    } else {
                      var4 = 1;
                      var8++;
                      var8++;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (48 > var9) {
                      break L3;
                    } else {
                      if (var9 <= 57) {
                        var9 -= 48;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (65 > var9) {
                      break L4;
                    } else {
                      if (var9 <= 90) {
                        var9 -= 55;
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (97 > var9) {
                      break L5;
                    } else {
                      if (122 < var9) {
                        break L5;
                      } else {
                        var9 -= 87;
                        break L2;
                      }
                    }
                  }
                  return false;
                }
                if (var9 >= param2) {
                  return false;
                } else {
                  L6: {
                    if (var4 != 0) {
                      var9 = -var9;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var10 = var6 * param2 + var9;
                  if (var6 == var10 / param2) {
                    var5 = 1;
                    var6 = var10;
                    var8++;
                    continue L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return var5 != 0;
              }
            }
          } else {
            throw new IllegalArgumentException("" + param2);
          }
        } else {
          throw new IllegalArgumentException("" + param2);
        }
    }

    final int f(byte param0) {
        if (((sm) this).field_v) {
            return 0;
        }
        if (param0 != 100) {
            ((sm) this).field_z = 27;
            return 100;
        }
        return 100;
    }

    public static void g(byte param0) {
        field_A = null;
        field_y = null;
        if (param0 == 81) {
            return;
        }
        field_A = null;
    }

    sm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new mn();
    }
}
