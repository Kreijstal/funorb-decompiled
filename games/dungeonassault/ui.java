/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_b;
    static int field_a;

    final static String a(int param0, int param1) {
        String var3 = null;
        String var2_ref = null;
        if (param1 != 19435) {
            String discarded$0 = ui.a(65, -11);
        }
        String var2 = ll.field_m[param0];
        if (param0 == -11) {
            if (g.field_Hb != -1) {
                // if_icmpeq L79
                // if_icmpeq L79
                // if_icmpeq L79
                // if_icmpeq L79
                // if_icmpeq L79
            } else {
                var2 = ll.field_m[9];
            }
        }
        if (!(-29 != param0)) {
            var3 = gl.field_Lb ? go.field_V : ql.field_g;
            var2_ref = uf.field_b + var3;
        }
        return var2_ref;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        al var4 = null;
        fn var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        wj var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        var26 = DungeonAssault.field_K;
        if (param0 == 30592) {
          L0: {
            var27 = ra.field_c;
            var2 = var27.c(true);
            if (var2 != 0) {
              if ((var2 ^ -1) == -2) {
                var3 = var27.k(param0 + -30592);
                var4_ref = (fn) (Object) cb.field_a.e(-24172);
                L1: while (true) {
                  L2: {
                    if (var4_ref == null) {
                      break L2;
                    } else {
                      if (var3 == var4_ref.field_r) {
                        break L2;
                      } else {
                        var4_ref = (fn) (Object) cb.field_a.a(4);
                        continue L1;
                      }
                    }
                  }
                  if (var4_ref != null) {
                    var4_ref.a(false);
                    break L0;
                  } else {
                    tl.a(-96);
                    return;
                  }
                }
              } else {
                sm.a((Throwable) null, 1, "HS1: " + sj.l(192));
                tl.a(-33);
                break L0;
              }
            } else {
              var3 = var27.k(param0 + -30592);
              var4 = (al) (Object) hg.field_n.e(-24172);
              L3: while (true) {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    if (var3 != var4.field_k) {
                      var4 = (al) (Object) hg.field_n.a(param0 ^ 30596);
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var4 != null) {
                  var5 = var27.c(true);
                  if (-1 != (var5 ^ -1)) {
                    var6 = var4.field_l;
                    lg.field_x[0].field_d = null;
                    lg.field_x[0].field_e = false;
                    lg.field_x[0].field_a = tc.field_u;
                    var7 = var4.field_p;
                    var8_int = 1;
                    L5: while (true) {
                      if (var5 <= var8_int) {
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var34 = new long[3][var6];
                        var35 = new int[3][var7 * var6];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.c(true);
                        if (var18 > 0) {
                          var19 = 0;
                          L6: while (true) {
                            if (var18 > var19) {
                              L7: {
                                var20 = var27.c(true);
                                var21 = lg.field_x[var20].field_a;
                                var22 = var27.c((byte) 89);
                                var24 = var27.field_o;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = lg.field_x[var20].field_d;
                                  var34[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L8: while (true) {
                                    if (var7 <= var25) {
                                      break L7;
                                    } else {
                                      var15++;
                                      var35[0][var15] = var27.h(-99);
                                      var25++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              L9: {
                                if (var21 == null) {
                                  break L9;
                                } else {
                                  if (eh.a(true, var21)) {
                                    var8[1][var13] = tc.field_u;
                                    var9[1][var13] = null;
                                    var34[1][var13] = var22;
                                    var27.field_o = var24;
                                    var13++;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var7 <= var25) {
                                        break L9;
                                      } else {
                                        var16++;
                                        var35[1][var16] = var27.h(-37);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!lg.field_x[var20].field_e) {
                                  lg.field_x[var20].field_e = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = lg.field_x[var20].field_d;
                                  var34[2][var14] = var22;
                                  var27.field_o = var24;
                                  var14++;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var25 < var7) {
                                      var17++;
                                      var35[2][var17] = var27.h(md.b(param0, -30643));
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            } else {
                              var4.a(false);
                              break L0;
                            }
                          }
                        } else {
                          var4.a(false);
                          break L0;
                        }
                      } else {
                        lg.field_x[var8_int].field_a = var27.d(-122);
                        lg.field_x[var8_int].field_e = false;
                        if (var27.c(true) != 1) {
                          lg.field_x[var8_int].field_d = null;
                          var8_int++;
                          continue L5;
                        } else {
                          lg.field_x[var8_int].field_d = var27.d(-125);
                          var8_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    var4.a(false);
                    break L0;
                  }
                } else {
                  tl.a(-68);
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
    }
}
