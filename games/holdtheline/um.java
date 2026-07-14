/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static ll field_d;
    static String field_b;
    static String field_c;
    static fd field_a;
    static String field_f;
    static go field_e;

    final static k a(int param0, gn param1, gn param2, int param3, int param4) {
        if (qg.a(param3, param0, (byte) -27, param1)) {
          if (param4 != 0) {
            return null;
          } else {
            return fe.a(param2.a(param3, true, param0), 1092937296);
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var8 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var14 = null;
        char[] var16 = null;
        char[] var17 = null;
        char[] var18 = null;
        var5 = HoldTheLine.field_D;
        if (param1 <= param0) {
          if (160 > param1) {
            if (param1 != 0) {
              var18 = ja.field_Qb;
              var12 = var18;
              var6 = var12;
              var2 = var6;
              var3 = 0;
              L0: while (true) {
                if (var18.length > var3) {
                  var4 = var18[var3];
                  if (var4 != param1) {
                    var3++;
                    continue L0;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            if (param1 > 255) {
              if (param1 != 0) {
                var17 = ja.field_Qb;
                var11 = var17;
                var6 = var11;
                var2 = var6;
                var3 = 0;
                if (var17.length > var3) {
                  var4 = var17[var3];
                  if (var4 != param1) {
                    var3++;
                    var3++;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          if (param1 >= 128) {
            if (160 > param1) {
              if (param1 != 0) {
                var16 = ja.field_Qb;
                var10 = var16;
                var6 = var10;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var16.length > var3) {
                    var4 = var16[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 255) {
                if (param1 != 0) {
                  var14 = ja.field_Qb;
                  var8 = var14;
                  var6 = var8;
                  var2 = var6;
                  var3 = 0;
                  L2: while (true) {
                    if (var14.length > var3) {
                      var4 = var14[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L2;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 <= 1) {
          um.a(119);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Go Back";
        field_d = new ll();
        field_a = new fd();
        field_f = "Loading sound effects";
    }
}
