/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm implements cg {
    private int field_g;
    private int field_m;
    private int field_f;
    private int field_d;
    static String field_c;
    private rf field_k;
    private int field_h;
    static int[] field_e;
    static boolean field_l;
    static String field_i;
    static String field_b;
    static long field_j;
    private int field_a;

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tl var12 = null;
        vg stackIn_5_0 = null;
        vg stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        L0: {
          var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 > 94) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          if (param2 instanceof tl) {
            stackOut_4_0 = (vg) param2;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackIn_5_0 = (vg) (Object) stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var12 = (tl) (Object) stackIn_5_0;
          if (var12 == null) {
            break L2;
          } else {
            break L2;
          }
        }
        wj.f(param2.field_o + param4, param2.field_m + param3, param2.field_w, param2.field_k, ((fm) this).field_m);
        var7 = -(var12.field_L * 2) + param2.field_w;
        var8 = var12.field_L + (param4 - -param2.field_o);
        var9 = var12.field_K + (param2.field_m + param3);
        wj.g(var8, var9, var7 + var8, var9, ((fm) this).field_f);
        var10 = var12.h(-26) - 1;
        L3: while (true) {
          if (-1 < (var10 ^ -1)) {
            L4: {
              if (((fm) this).field_k == null) {
                break L4;
              } else {
                ((fm) this).field_k.b(var12.field_p, var8 - -(var7 / 2), var12.field_K + ((fm) this).field_k.field_E + var9, ((fm) this).field_a, ((fm) this).field_g);
                break L4;
              }
            }
            return;
          } else {
            wj.b(var7 * var12.a(var10, (byte) 4) / var12.i(-110) + var8, var9, ((fm) this).field_h, ((fm) this).field_d);
            var10--;
            continue L3;
          }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        b var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        lh var15 = null;
        int[][] var19 = null;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var15 = dh.field_N;
        var2 = var15.l(31760);
        var3 = (b) (Object) u.field_f.h(-11151);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var2 != var3.field_j) {
                var3 = (b) (Object) u.field_f.e(0);
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (var3 != null) {
            L2: {
              var4 = var15.l(31760);
              if (-1 != (var4 ^ -1)) {
                gd.field_d[0] = oa.field_d;
                var5 = var3.field_n;
                var6_int = 1;
                L3: while (true) {
                  if (var6_int >= var4) {
                    mg.a(var4, 83, var5);
                    var6_int = 0;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        mk.a(-91, var5);
                        var6 = new String[2][var5];
                        var19 = new int[2][4 * var5];
                        var8 = gg.field_b;
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
                                var11 = bj.field_a[var13 + var5];
                                var6[1][var14] = gd.field_d[var11];
                                var19[1][4 * var14] = rc.field_i[var11];
                                var19[1][1 + var14 * 4] = fi.field_h[var11];
                                var19[1][var14 * 4 + 2] = kk.field_a[var11];
                                var19[1][3 + var14 * 4] = qj.field_d[var11];
                                if (ta.a(6, gd.field_d[var11])) {
                                  if (0 == qj.field_d[var11] + kk.field_a[var11] + fi.field_h[var11]) {
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
                            var11 = bj.field_a[var9];
                            var6[0][var10] = gd.field_d[var11];
                            var19[0][4 * var10] = rc.field_i[var11];
                            var19[0][var10 * 4 - -1] = fi.field_h[var11];
                            var19[0][4 * var10 - -2] = kk.field_a[var11];
                            var19[0][var10 * 4 + 3] = qj.field_d[var11];
                            if (ta.a(6, gd.field_d[var11])) {
                              if (0 == qj.field_d[var11] + (kk.field_a[var11] + fi.field_h[var11])) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L5;
                              } else {
                                var10++;
                                var9++;
                                continue L5;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        qg.a((od) (Object) var15, (byte) 104);
                        if (var6_int != 0) {
                          ai.a(ah.field_K, (byte) -62, j.field_e, var6_int, d.field_b, oh.field_d);
                          var6_int++;
                          continue L4;
                        } else {
                          ai.a(ah.field_K, (byte) -128, j.field_e, var6_int, d.field_b, oh.field_d);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    gd.field_d[var6_int] = var15.b((byte) -101);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var5 = -96 / ((param0 - 11) / 43);
            var3.a(-16175);
            return;
          } else {
            eg.a((byte) 126);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = 36 % ((param0 - -27) / 49);
        field_i = null;
        field_e = null;
        field_b = null;
    }

    fm(rf param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((fm) this).field_k = param0;
        ((fm) this).field_m = param4;
        ((fm) this).field_d = param6;
        ((fm) this).field_f = param3;
        ((fm) this).field_a = param1;
        ((fm) this).field_h = param5;
        ((fm) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Move ship";
        field_i = "Your email address is used to identify this account";
        field_b = "Visit the Account Management section on the main site to view.";
        field_l = false;
    }
}
