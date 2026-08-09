/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends d {
    private Object field_u;
    static ce field_v;

    en(Object param0, int param1) {
        super(param1);
        try {
            this.field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "en.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void e(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        og var3_ref = null;
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
        df var14 = null;
        int[][] var18 = null;
        var3 = null;
        var12 = Torquing.field_u;
        try {
          L0: {
            var14 = kj.field_d;
            var2 = var14.i((byte) -101);
            var3_ref = (og) ((Object) bh.field_c.b(0));
            L1: while (true) {
              L2: {
                if (var3_ref == null) {
                  break L2;
                } else {
                  if (var2 != var3_ref.field_j) {
                    var3_ref = (og) ((Object) bh.field_c.f(-24059));
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3_ref == null) {
                ih.b(true);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param0 == 50) {
                  L3: {
                    var4 = var14.i((byte) -101);
                    if (0 != var4) {
                      var5 = var3_ref.field_l;
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
                              var18 = new int[2][var5 * 4];
                              var8 = vg.field_o;
                              var9 = 0;
                              var10 = 0;
                              L6: while (true) {
                                if (var9 >= var8) {
                                  var9 = 0;
                                  var13 = 0;
                                  var10 = var13;
                                  L7: while (true) {
                                    if (var9 >= var8) {
                                      var3_ref.f(0);
                                      break L3;
                                    } else {
                                      L8: {
                                        var11 = lp.field_g[var9 + var5];
                                        var6[1][var13] = vl.field_d[var11];
                                        var18[1][var13 * 4] = il.field_o[var11];
                                        var18[1][4 * var13 + 1] = wh.field_y[var11];
                                        var18[1][2 + var13 * 4] = vo.field_d[var11];
                                        var18[1][4 * var13 - -3] = vp.field_F[var11];
                                        if (bn.a(vl.field_d[var11], -17310)) {
                                          if (-1 == (vp.field_F[var11] + wh.field_y[var11] - -vo.field_d[var11] ^ -1)) {
                                            var6[1][var13] = null;
                                            var13--;
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var13++;
                                      var9++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  L9: {
                                    var11 = lp.field_g[var9];
                                    var6[0][var10] = vl.field_d[var11];
                                    var18[0][4 * var10] = il.field_o[var11];
                                    var18[0][var10 * 4 + 1] = wh.field_y[var11];
                                    var18[0][4 * var10 - -2] = vo.field_d[var11];
                                    var18[0][var10 * 4 - -3] = vp.field_F[var11];
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
                                ke.a(225225318, var14);
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
                          vl.field_d[var6_int] = var14.h((byte) 124);
                          var6_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var3_ref.f(0);
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "en.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final Object b(int param0) {
        if (param0 != 12) {
            return (Object) null;
        }
        return this.field_u;
    }

    final boolean c(byte param0) {
        if (param0 != 37) {
            this.b(-74);
            return false;
        }
        return false;
    }

    public static void c(int param0) {
        if (param0 != 1) {
            return;
        }
        field_v = null;
    }

    static {
        field_v = new ce();
    }
}
