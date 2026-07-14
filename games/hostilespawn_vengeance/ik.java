/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static mk field_d;
    static boolean field_b;
    static int field_a;
    static int field_c;

    final static int a(int param0, boolean param1, int param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          if (-3 < (param0 ^ -1)) {
            break L0;
          } else {
            if ((param0 ^ -1) >= -37) {
              L1: {
                if (param2 == -6514) {
                  break L1;
                } else {
                  var12 = null;
                  int discarded$1 = ik.a(-63, false, -47, (CharSequence) null);
                  break L1;
                }
              }
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (0 != var8) {
                      break L3;
                    } else {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param0 <= var9) {
                    throw new NumberFormatException();
                  } else {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = var6 * param0 - -var9;
                    if (var10 / param0 != var6) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    public static void a(byte param0) {
        if (param0 != -63) {
            return;
        }
        field_d = null;
    }

    static {
    }
}
