/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ega {
    static int field_c;
    static String field_d;
    static int field_b;
    static nh field_e;
    private static String[] field_a;

    final static boolean a(int param0, CharSequence param1, boolean param2, boolean param3) {
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
          var11 = TombRacer.field_G ? 1 : 0;
          if ((param0 ^ -1) > -3) {
            break L0;
          } else {
            if ((param0 ^ -1) < -37) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param1.length();
                var8 = 0;
                if (param2) {
                  break L1;
                } else {
                  var12 = null;
                  boolean discarded$1 = ega.a(-127, (CharSequence) null, true, false);
                  break L1;
                }
              }
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (0 != var8) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
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
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var9 < 97) {
                      return false;
                    } else {
                      if (122 >= var9) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 >= param0) {
                    return false;
                  } else {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var10 / param0 != var6) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 2) {
            field_e = null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "No spectators";
        field_a = new String[2];
        field_a[0] = "Skeleton";
    }
}
