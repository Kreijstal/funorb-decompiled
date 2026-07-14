/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wda {
    static long field_a;
    byte field_d;
    static int[][] field_c;
    static int[] field_b;
    int field_e;
    static String field_g;
    it field_f;

    final static void a(byte param0) {
        int var2 = 0;
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pf var15 = null;
        var12 = BachelorFridge.field_y;
        var15 = ig.field_m;
        var2 = var15.b(16711935);
        var3 = (ne) (Object) rg.field_f.b((byte) 90);
        if (param0 >= 98) {
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var2 != var3.field_o) {
                  var3 = (ne) (Object) rg.field_f.c(0);
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            if (var3 == null) {
              vc.a((byte) -113);
              return;
            } else {
              L2: {
                var4 = var15.b(16711935);
                if (var4 == 0) {
                  break L2;
                } else {
                  vs.field_a[0] = cha.field_l;
                  var5 = var3.field_i;
                  var6_int = 1;
                  L3: while (true) {
                    if (var4 <= var6_int) {
                      iw.a(var5, -10410, var4);
                      var6_int = 0;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          it.a(8766, var5);
                          var3.field_k = new String[2][var5];
                          var6 = new String[2][var5];
                          var3.field_g = new int[2][var5 * 4];
                          var7 = new int[2][var5 * 4];
                          var8 = ut.field_l;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var8 <= var9) {
                              var13 = 0;
                              var9 = var13;
                              var14 = 0;
                              var10 = var14;
                              L6: while (true) {
                                if (var13 >= var8) {
                                  break L2;
                                } else {
                                  var11 = fn.field_k[var5 + var13];
                                  var6[1][var14] = vs.field_a[var11];
                                  var7[1][4 * var14] = gk.field_a[var11];
                                  var7[1][4 * var14 - -1] = mba.field_a[var11];
                                  var7[1][4 * var14 - -2] = sc.field_o[var11];
                                  var7[1][4 * var14 - -3] = uda.field_X[var11];
                                  if (wb.a((byte) 52, vs.field_a[var11])) {
                                    if (sc.field_o[var11] + (mba.field_a[var11] - -uda.field_X[var11]) == 0) {
                                      var6[1][var14] = null;
                                      var14--;
                                      var13++;
                                      var14++;
                                      continue L6;
                                    } else {
                                      var13++;
                                      var14++;
                                      continue L6;
                                    }
                                  } else {
                                    var13++;
                                    var14++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = fn.field_k[var9];
                              var6[0][var10] = vs.field_a[var11];
                              var7[0][4 * var10] = gk.field_a[var11];
                              var7[0][1 + var10 * 4] = mba.field_a[var11];
                              var7[0][2 + var10 * 4] = sc.field_o[var11];
                              var7[0][3 + var10 * 4] = uda.field_X[var11];
                              if (wb.a((byte) 52, vs.field_a[var11])) {
                                if (0 == sc.field_o[var11] + mba.field_a[var11] + uda.field_X[var11]) {
                                  var6[0][var10] = null;
                                  var10--;
                                  var9++;
                                  var10++;
                                  continue L5;
                                } else {
                                  var9++;
                                  var10++;
                                  continue L5;
                                }
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          ml.a((lu) (Object) var15, 2064384);
                          if (-1 == (var6_int ^ -1)) {
                            var3.field_h = al.field_a;
                            var3.field_f = gk.field_b;
                            var3.field_l = fe.field_k;
                            var3.field_j = kka.field_g;
                            im.a(var6_int, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
                            var6_int++;
                            continue L4;
                          } else {
                            im.a(var6_int, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      vs.field_a[var6_int] = var15.g(80);
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
              var3.field_p = true;
              var3.a(false);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            return;
        }
        field_c = null;
        field_g = null;
        field_b = null;
    }

    final boolean a(boolean param0, it param1) {
        if (param1 == null) {
            return false;
        }
        if (((wda) this).field_f != null) {
            if (((wda) this).field_f.field_a) {
                return false;
            }
        }
        ((wda) this).field_f = param1;
        ((wda) this).field_f.a((byte) -83);
        if (param0) {
            field_g = null;
            return true;
        }
        return true;
    }

    wda(byte param0, int param1) {
        ((wda) this).field_d = param0;
        ((wda) this).field_e = param1;
    }

    wda(lu param0) {
        ((wda) this).field_d = param0.b(true);
        ((wda) this).field_e = param0.b(16711935);
        if (param0.b(true) != -1) {
            param0.field_g = param0.field_g - 1;
            ((wda) this).field_f = new it(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Wait...";
        field_b = new int[24];
    }
}
