/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends d {
    private Object field_u;
    static ce field_v;

    en(Object param0, int param1) {
        super(param1);
        try {
            ((en) this).field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "en.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        og var3 = null;
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
        df var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Torquing.field_u;
        try {
          L0: {
            var15 = kj.field_d;
            var2 = var15.i((byte) -101);
            var3 = (og) (Object) bh.field_c.b(0);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_j) {
                    var3 = (og) (Object) bh.field_c.f(-24059);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                ih.b(true);
                return;
              } else {
                L3: {
                  var4 = var15.i((byte) -101);
                  if (0 != var4) {
                    var5 = var3.field_l;
                    vl.field_d[0] = re.field_e;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        jn.a(var5, 3328, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            ao.a(8191, var5);
                            var6 = new String[2][var5];
                            var19 = new int[2][var5 * 4];
                            var8 = vg.field_o;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var13 >= var8) {
                                    var3.f(0);
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = lp.field_g[var13 + var5];
                                      var6[1][var14] = vl.field_d[var11];
                                      var19[1][var14 * 4] = il.field_o[var11];
                                      var19[1][4 * var14 + 1] = wh.field_y[var11];
                                      var19[1][2 + var14 * 4] = vo.field_d[var11];
                                      var19[1][4 * var14 - -3] = vp.field_F[var11];
                                      if (bn.a(vl.field_d[var11], -17310)) {
                                        if (vp.field_F[var11] + wh.field_y[var11] - -vo.field_d[var11] == 0) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = lp.field_g[var9];
                                  var6[0][var10] = vl.field_d[var11];
                                  var19[0][4 * var10] = il.field_o[var11];
                                  var19[0][var10 * 4 + 1] = wh.field_y[var11];
                                  var19[0][4 * var10 - -2] = vo.field_d[var11];
                                  var19[0][var10 * 4 - -3] = vp.field_F[var11];
                                  if (bn.a(vl.field_d[var11], -17310)) {
                                    if (wh.field_y[var11] + (vo.field_d[var11] + vp.field_F[var11]) != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              ke.a(225225318, (fj) (Object) var15);
                              if (var6_int == 0) {
                                hb.a(eg.field_w, qc.field_bb, false, bf.field_c, um.field_p, var6_int);
                                break L10;
                              } else {
                                hb.a(eg.field_w, qc.field_bb, false, bf.field_c, um.field_p, var6_int);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        vl.field_d[var6_int] = var15.h((byte) 124);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.f(0);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "en.F(" + 50 + ')');
        }
    }

    final Object b(int param0) {
        if (param0 != 12) {
            return null;
        }
        return ((en) this).field_u;
    }

    final boolean c(byte param0) {
        if (param0 != 37) {
            Object discarded$0 = ((en) this).b(-74);
            return false;
        }
        return false;
    }

    public static void c(int param0) {
        field_v = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new ce();
    }
}
