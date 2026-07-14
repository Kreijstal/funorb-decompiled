/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_b;
    static int[] field_c;
    static int field_a;

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, d param4, int param5) {
        rj[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        rj[] var10 = null;
        cb var11 = null;
        var9 = Geoblox.field_C;
        if (param4.b(-26098)) {
          L0: {
            if (param1 != (param0 ^ -1)) {
              break L0;
            } else {
              var10 = vi.a(param1 ^ -112, param4);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (param3 == var10[var8].field_d) {
                      if (var10[var8].field_f == param2) {
                        L2: {
                          if (param5 == 0) {
                            break L2;
                          } else {
                            if (param5 == var10[var8].field_a) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param0 < var10[var8].field_h) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param0 = var10[var8].field_h;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          var11 = param4.a(param2, param1 ^ 1743550127, param5, param0, param3);
          L4: while (true) {
            if (var11.field_a != 0) {
              var7 = (java.awt.Frame) var11.field_b;
              if (var7 != null) {
                if (-3 != (var11.field_a ^ -1)) {
                  return var7;
                } else {
                  jk.a(var7, 10, param4);
                  return null;
                }
              } else {
                return null;
              }
            } else {
              bc.a(0, 10L);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != -8616) {
            qe.a(87);
        }
        field_c = null;
    }

    final static void b(int param0) {
        int var2 = Geoblox.field_C;
        if (ji.field_h != 0) {
            if ((ji.field_h ^ -1) > -22) {
                fa.field_b = fa.field_b + 10;
            }
        }
        fa.field_b = fa.field_b + param0;
        sa.field_b = fa.field_b / 3;
        while (fa.field_b > 3 * sa.field_b) {
            sa.field_b = sa.field_b + 1;
        }
    }

    final static void a(rh param0, rh param1, int param2) {
        if (param2 > -66) {
            Object var4 = null;
            java.awt.Frame discarded$0 = qe.a(91, -118, 58, -45, (d) null, -79);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
