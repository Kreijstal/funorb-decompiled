/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dp extends pj {
    dp() {
    }

    final static String b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          var2 = param0 * 20;
          var3 = var2 / 1000;
          var4 = var3 / 60;
          var3 = var3 % 60;
          if ((var4 ^ -1) > -11) {
            var5 = "0" + var4;
            break L0;
          } else {
            var5 = "" + var4;
            break L0;
          }
        }
        L1: {
          var7 = var5 + ":";
          if (10 <= var3) {
            var5 = var7 + var3;
            break L1;
          } else {
            var5 = var7 + "0" + var3;
            break L1;
          }
        }
        if (param1 != -23620) {
          int discarded$2 = dp.a(-100, 64);
          return var5;
        } else {
          return var5;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -26346) {
          var2 = param1;
          if (0 != var2) {
            if (var2 != -2) {
              if (-3 != var2) {
                if (var2 != -4) {
                  if (-5 != var2) {
                    if (var2 != 5) {
                      return 6710886;
                    } else {
                      return 3394764;
                    }
                  } else {
                    return 13382604;
                  }
                } else {
                  return 13421619;
                }
              } else {
                return 3355596;
              }
            } else {
              return 13382451;
            }
          } else {
            return 3394611;
          }
        } else {
          int discarded$5 = dp.a(47, 26);
          var2 = param1;
          if (0 != var2) {
            if (var2 != -2) {
              if (-3 != var2) {
                if (var2 != -4) {
                  if (-5 != var2) {
                    if (var2 != 5) {
                      return 6710886;
                    } else {
                      return 3394764;
                    }
                  } else {
                    return 13382604;
                  }
                } else {
                  return 13421619;
                }
              } else {
                return 3355596;
              }
            } else {
              return 13382451;
            }
          } else {
            return 3394611;
          }
        }
    }

    static {
    }
}
