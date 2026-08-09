/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static kk field_b;
    ga field_g;
    static String field_a;
    static hh field_j;
    ga field_e;
    ga field_k;
    ga field_c;
    ga field_d;
    ga field_i;
    ga field_f;
    static boolean field_h;

    final static void b(int param0) {
        if (!(bo.field_F == null)) {
            bo.field_F.p(0);
        }
        if (!(jb.field_r == null)) {
            jb.field_r.d(true);
        }
        if (param0 != 0) {
            ia var2 = (ia) null;
            uk.a(19, -90, 62, -122, 5, (ia) null, -13, -75);
        }
        dl.a(false);
    }

    final static void a(int param0, int[] param1, int[] param2) {
        try {
            gi.a(param0 + param1.length, param2, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_j = (hh) null;
        }
        field_j = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ia param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        ui stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ui var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        ia var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 == -16711760) {
              L1: {
                L2: {
                  var44 = param5;
                  if (var44.field_n == null) {
                    break L2;
                  } else {
                    if ((var44.field_I ^ -1) >= -2) {
                      break L2;
                    } else {
                      var60 = var44.field_n;
                      g.a(var60, 0, ul.field_I, 114, 0);
                      break L1;
                    }
                  }
                }
                od.f(46);
                break L1;
              }
              var54 = new int[param5.field_M];
              var49 = var54;
              var41 = var49;
              var8 = var41;
              var64 = new int[param5.field_M];
              var62 = oi.field_L;
              var63 = df.field_f;
              var61 = oe.field_xb;
              var13 = 0;
              L3: while (true) {
                if (param5.field_M <= var13) {
                  var13 = 0;
                  L4: while (true) {
                    if (var13 >= aj.field_d) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L5: {
                        var14 = bc.field_f[var13];
                        var15 = param5.field_e[var14];
                        var16 = param5.field_o[var14];
                        var17 = param5.field_f[var14];
                        if (param5.field_h[var14] >= oi.field_L.length) {
                          stackIn_26_0 = -1;
                          break L5;
                        } else {
                          stackIn_26_0 = param5.field_h[var14];
                          break L5;
                        }
                      }
                      L6: {
                        var18 = stackIn_26_0;
                        if (param5.field_u[var14] >= oi.field_L.length) {
                          stackIn_29_0 = -1;
                          break L6;
                        } else {
                          stackIn_29_0 = param5.field_u[var14];
                          break L6;
                        }
                      }
                      L7: {
                        var19 = stackIn_29_0;
                        if (param5.field_j[var14] < oi.field_L.length) {
                          stackIn_32_0 = param5.field_j[var14];
                          break L7;
                        } else {
                          stackIn_32_0 = -1;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          var20 = stackIn_32_0;
                          if (tj.field_y == null) {
                            break L9;
                          } else {
                            if (param5.field_m == null) {
                              break L9;
                            } else {
                              if (var14 >= param5.field_m.length) {
                                break L9;
                              } else {
                                if (param5.field_m[var14] == -1) {
                                  break L9;
                                } else {
                                  if (param5.field_m[var14] < tj.field_y.length) {
                                    stackIn_40_0 = tj.field_y[param5.field_m[var14]];
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackIn_40_0 = null;
                        break L8;
                      }
                      L10: {
                        L11: {
                          var21 = stackIn_40_0;
                          var22 = on.field_g[var15];
                          var23 = ni.field_D[var15];
                          var24 = on.field_g[var16];
                          var25 = ni.field_D[var16];
                          var26 = on.field_g[var17];
                          var27 = ni.field_D[var17];
                          if (var19 != var18) {
                            break L11;
                          } else {
                            if (var20 == var19) {
                              L12: {
                                var28 = var54[var18];
                                var29 = var64[var18];
                                if (var21 == null) {
                                  stackIn_50_0 = 8355711;
                                  break L12;
                                } else {
                                  stackIn_50_0 = var21.field_c;
                                  break L12;
                                }
                              }
                              var30 = stackIn_50_0;
                              var31 = var30 & 16711935;
                              var32 = var30 & 65280;
                              var33 = var32 * var28 >>> 598527016 & -805241088 | -2030108417 & var31 * var28 >>> -1694909368;
                              var33 = var33 + 65793 * var29;
                              rc.a(var26, var22, var27, var33 >> 176416481 & 8355711, true, var23, var24, var25);
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L13: {
                          var28 = var54[var18];
                          var29 = var54[var19];
                          var30 = var54[var20];
                          var31 = var64[var18];
                          var32 = var64[var19];
                          var33 = var64[var20];
                          if (var21 == null) {
                            stackIn_46_0 = 8355711;
                            break L13;
                          } else {
                            stackIn_46_0 = var21.field_c;
                            break L13;
                          }
                        }
                        var34 = stackIn_46_0;
                        var35 = var34 & 16711935;
                        var36 = var34 & 65280;
                        var37 = (var28 * var36 & 16711908) >>> 1566274664 | var28 * var35 >>> 277004296 & 1090453759;
                        var38 = (16711930 & var29 * var36) >>> -442202712 | -1778450177 & var35 * var29 >>> -52754904;
                        var37 = var37 + 65793 * var31;
                        var39 = (16711870 & var30 * var36) >>> -1219072504 | (var35 * var30 & -16711760) >>> 321200200;
                        var38 = var38 + 65793 * var32;
                        var39 = var39 + 65793 * var33;
                        ei.a(var24, var23, var22, 255 & var39 >> 1550883976, var38 >> -247082960, var27, var39 >> 169084592, var26, var25, -15733, 255 & var39, 255 & var37, var37 >> 1177211760, var38 & 255, (var37 & 65293) >> 848079624, 255 & var38 >> -733664248);
                        break L10;
                      }
                      var13++;
                      continue L4;
                    }
                  }
                } else {
                  L14: {
                    var14 = param6 * var61[var13] + param2 * var62[var13] - -(param7 * var63[var13]) >> 1500968808;
                    if (0 > var14) {
                      var14 = -var14;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (-1 < (var14 ^ -1)) {
                      stackIn_17_0 = 128;
                      break L15;
                    } else {
                      if (128 <= var14) {
                        stackIn_17_0 = 256;
                        break L15;
                      } else {
                        stackIn_17_0 = 128 + var14;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    var14 = stackIn_17_0;
                    var15 = param4 * var61[var13] + var62[var13] * param3 - -(param0 * var63[var13]) >> -2045117944;
                    stackIn_19_0 = pb.field_c;

                    if (var15 < 0) {
                      stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                      stackIn_20_1 = -var15;
                      break L16;
                    } else {
                      stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                      stackIn_20_1 = var15;
                      break L16;
                    }
                  }
                  var15 = stackIn_20_0[stackIn_20_1];
                  var14 = (256 + -var15) * var14 >>> -2108667064;
                  var54[var13] = var14;
                  var64[var13] = var15;
                  var13++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8_ref = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var8_ref);

            stackIn_55_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L17;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L17;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    uk() {
        this.field_e = new ga(0, 0);
        this.field_g = new ga(0, 0);
        this.field_c = new ga(0, 0);
        this.field_d = new ga(0, 0);
        this.field_k = new ga(0, 0);
        this.field_f = new ga(0, 0);
        this.field_i = new ga(0, 0);
    }

    static {
        field_a = "Score: ";
        field_h = false;
    }
}
