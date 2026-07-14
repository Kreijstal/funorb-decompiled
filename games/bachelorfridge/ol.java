/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends pu {
    static String[] field_l;

    final static rga a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = param0.length();
        if (var2 != 0) {
          if (63 < var2) {
            return rm.field_c;
          } else {
            L0: {
              if (param1 == 5431) {
                break L0;
              } else {
                field_l = null;
                var3 = 0;
                if (var2 > var3) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 != 45) {
                      if (0 == hb.field_i.indexOf(var4)) {
                        return cha.field_m;
                      } else {
                        var3++;
                        break L1;
                      }
                    } else {
                      if (0 != var3) {
                        if (var3 != -1 + var2) {
                          var3++;
                          break L1;
                        } else {
                          return cha.field_m;
                        }
                      } else {
                        return cha.field_m;
                      }
                    }
                  }
                  var3++;
                  var3++;
                  var3++;
                  break L0;
                } else {
                  return null;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var2 > var3) {
                var4 = param0.charAt(var3);
                if (var4 != 45) {
                  if (0 == (hb.field_i.indexOf(var4) ^ -1)) {
                    return cha.field_m;
                  } else {
                    var3++;
                    var3++;
                    continue L2;
                  }
                } else {
                  L3: {
                    if (0 == var3) {
                      break L3;
                    } else {
                      if (var3 == -1 + var2) {
                        break L3;
                      } else {
                        var3++;
                        var3++;
                        continue L2;
                      }
                    }
                  }
                  return cha.field_m;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return uc.field_j;
        }
    }

    public static void d(byte param0) {
        field_l = null;
        if (param0 > -18) {
            field_l = null;
        }
    }

    final static cq a(be param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return tw.a(je.b(param0, 100, 96), (byte) -36);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"single", "range", "long range", "ranged with splash", "splash", "big splash", "cone", "slash", "charge", "long charge", "jump", "big jump", "bigger splash", "board", "doughnut", "boomerang", "team", "one creature", "board edge", "mid splash", "range splash"};
    }
}
