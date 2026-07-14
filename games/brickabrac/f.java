/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static String field_b;
    static mh field_a;
    static hj field_c;

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        eg var4_ref_eg = null;
        long var4 = 0L;
        int var5 = 0;
        sp var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
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
        pi var27 = null;
        L0: {
          var26 = BrickABrac.field_J ? 1 : 0;
          if (param0 == 7) {
            break L0;
          } else {
            f.a(-30);
            break L0;
          }
        }
        L1: {
          var27 = jl.field_e;
          var2 = var27.l(255);
          if (0 != var2) {
            if (-2 == (var2 ^ -1)) {
              var3 = var27.i(param0 + 65273);
              var4 = var27.g(-32768);
              var6 = (sp) (Object) tm.field_f.d(-60);
              L2: while (true) {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    if (var6.field_m == var3) {
                      break L3;
                    } else {
                      var6 = (sp) (Object) tm.field_f.a((byte) 116);
                      continue L2;
                    }
                  }
                }
                if (var6 != null) {
                  var6.field_p = var4;
                  var6.b((byte) 111);
                  break L1;
                } else {
                  hn.a((byte) 53);
                  return;
                }
              }
            } else {
              rk.a("HS1: " + eq.c((byte) -96), (Throwable) null, param0 ^ 102);
              hn.a((byte) 70);
              break L1;
            }
          } else {
            var3 = var27.i(65280);
            var4_ref_eg = (eg) (Object) qc.field_n.d(-105);
            L4: while (true) {
              L5: {
                if (var4_ref_eg == null) {
                  break L5;
                } else {
                  if (var4_ref_eg.field_l != var3) {
                    var4_ref_eg = (eg) (Object) qc.field_n.a((byte) 116);
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (var4_ref_eg != null) {
                L6: {
                  var5 = var27.l(param0 ^ 248);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    var6_int = var4_ref_eg.field_q;
                    nb.field_b[0].field_b = null;
                    nb.field_b[0].field_c = tb.field_cb;
                    var7 = var4_ref_eg.field_p;
                    nb.field_b[0].field_d = false;
                    var8_int = 1;
                    L7: while (true) {
                      if (var5 <= var8_int) {
                        var4_ref_eg.field_i = new String[3][var6_int];
                        var8 = new String[3][var6_int];
                        var9 = new String[3][var6_int];
                        var4_ref_eg.field_r = new long[3][var6_int];
                        var10 = new long[3][var6_int];
                        var4_ref_eg.field_n = new int[3][var6_int * var7];
                        var11 = new int[3][var6_int * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.l(param0 ^ 248);
                        if (0 >= var18) {
                          break L6;
                        } else {
                          var19 = 0;
                          L8: while (true) {
                            if (var19 >= var18) {
                              break L6;
                            } else {
                              L9: {
                                var20 = var27.l(255);
                                var21 = nb.field_b[var20].field_c;
                                var22 = var27.g(-32768);
                                var24 = var27.field_l;
                                if (var6_int > var19) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = nb.field_b[var20].field_b;
                                  var10[0][var12] = var22;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var25 >= var7) {
                                      var12++;
                                      break L9;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var27.e(255);
                                      var25++;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L11: {
                                if (var21 == null) {
                                  break L11;
                                } else {
                                  if (ci.a(var21, param0 ^ -88)) {
                                    var8[1][var13] = tb.field_cb;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var27.field_l = var24;
                                    var25 = 0;
                                    L12: while (true) {
                                      if (var25 >= var7) {
                                        break L11;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var27.e(255);
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var14 < var6_int) {
                                if (!nb.field_b[var20].field_d) {
                                  nb.field_b[var20].field_d = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = nb.field_b[var20].field_b;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var27.field_l = var24;
                                  var25 = 0;
                                  L13: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var27.e(255);
                                      var25++;
                                      continue L13;
                                    } else {
                                      var19++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L8;
                                }
                              } else {
                                var19++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        nb.field_b[var8_int].field_c = var27.d(-1);
                        nb.field_b[var8_int].field_d = false;
                        if (var27.l(param0 ^ 248) == 1) {
                          nb.field_b[var8_int].field_b = var27.d(-1);
                          var8_int++;
                          continue L7;
                        } else {
                          nb.field_b[var8_int].field_b = null;
                          var8_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                var4_ref_eg.field_o = true;
                var4_ref_eg.b((byte) 111);
                break L1;
              } else {
                hn.a((byte) 127);
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
            f.a((byte) 116);
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Level Select";
    }
}
