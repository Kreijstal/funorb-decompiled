/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_c;
    static jj field_a;
    static String field_d;

    final static java.awt.Frame a(ej param0, int param1, int param2, int param3, int param4, int param5) {
        a[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        a[] var10 = null;
        re var11 = null;
        re var12 = null;
        java.awt.Frame var13 = null;
        re var14 = null;
        java.awt.Frame var15 = null;
        Object var16 = null;
        var16 = null;
        var9 = stellarshard.field_B;
        if (param0.a(param5 ^ -127)) {
          if (param5 == (param3 ^ -1)) {
            var10 = dl.a(param0, false);
            var6 = var10;
            if (var6 != null) {
              var7 = 0;
              var8 = 0;
              L0: while (true) {
                if (var10.length <= var8) {
                  if (var7 != 0) {
                    var14 = param0.a(param5 ^ -2019341457, param4, param2, param1, param3);
                    var11 = var14;
                    L1: while (true) {
                      if (-1 != (var14.field_f ^ -1)) {
                        var15 = (java.awt.Frame) var14.field_b;
                        if (var15 != null) {
                          if (2 == var14.field_f) {
                            kf.a(var15, param5 + 16711936, param0);
                            return null;
                          } else {
                            return var15;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        jj.a((byte) -114, 10L);
                        continue L1;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  if (var10[var8].field_f == param1) {
                    if (var10[var8].field_c == param2) {
                      L2: {
                        if (-1 == (param4 ^ -1)) {
                          break L2;
                        } else {
                          if (var10[var8].field_e == param4) {
                            break L2;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      L3: {
                        if (var7 == 0) {
                          break L3;
                        } else {
                          if (var10[var8].field_a > param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      var7 = 1;
                      param3 = var10[var8].field_a;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    var8++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var12 = param0.a(param5 ^ -2019341457, param4, param2, param1, param3);
            L4: while (true) {
              if (-1 != (var12.field_f ^ -1)) {
                var13 = (java.awt.Frame) var12.field_b;
                if (var13 != null) {
                  if (2 == var12.field_f) {
                    kf.a(var13, param5 + 16711936, param0);
                    return null;
                  } else {
                    return var13;
                  }
                } else {
                  return null;
                }
              } else {
                jj.a((byte) -114, 10L);
                continue L4;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email is valid";
    }
}
