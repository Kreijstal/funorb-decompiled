/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static he[] field_g;
    static String field_b;
    static he[] field_f;
    static String field_a;
    int[] field_h;
    bf[] field_c;
    static he[] field_e;
    static String field_d;

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ae.a(1, pf.field_f, cc.field_B, gg.field_b, true, 0, param1);
        int var3 = 77 / ((param0 - 21) / 63);
        for (var2 = 0; gg.field_b > var2; var2++) {
            bj.field_a[var2 + param1] = var2;
        }
        ae.a(1, mh.field_b, ha.field_c, gg.field_b - -param1, false, param1, param1 - -param1);
        if (gg.field_b > param1) {
            gg.field_b = param1;
        }
    }

    mk() {
        ((mk) this).field_c = new bf[8000];
    }

    mk(byte[] param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        od var14 = null;
        od var15 = null;
        L0: {
          ((mk) this).field_c = new bf[8000];
          var14 = new od(param0);
          var15 = var14;
          var4 = var15.l(31760);
          if (0 != var4) {
            break L0;
          } else {
            var5 = var15.h(-123);
            var6 = var15.h(-91);
            ((mk) this).field_h = new int[var5];
            byte discarded$5 = var15.n(-75);
            var7 = 0;
            L1: while (true) {
              if (var7 >= var5) {
                var7 = 0;
                L2: while (true) {
                  if (var6 <= var7) {
                    break L0;
                  } else {
                    L3: {
                      var8 = var15.n(89);
                      var9 = var15.n(118);
                      var11 = var15.h(102);
                      if (param1 == 0) {
                        break L3;
                      } else {
                        L4: {
                          if ((var8 ^ -1) == -6) {
                            break L4;
                          } else {
                            if (11 == var8) {
                              break L4;
                            } else {
                              if (var8 == -18) {
                                break L4;
                              } else {
                                if (-19 == var8) {
                                  break L4;
                                } else {
                                  if (42 != var8) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var9 = param1;
                        break L3;
                      }
                    }
                    var10 = 0;
                    var12 = var15.j(-788751192);
                    if (var8 >= 0) {
                      ((mk) this).field_c[var7] = new bf(var8, var9, var10, var11, var12, false);
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                ((mk) this).field_h[var7] = var14.j(-788751192);
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = new he[8];
        field_a = "Cycle weapon";
        field_d = "Creating your account";
    }
}
