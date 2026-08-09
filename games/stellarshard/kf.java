/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf implements uk {
    static String field_c;
    static li field_a;
    static String field_d;
    static int[] field_b;

    final static void a(java.awt.Frame param0, int param1, ej param2) {
        re var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        n var5 = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(param0, (byte) -107);
              L2: while (true) {
                if (var3.field_f != 0) {
                  if (-2 != (var3.field_f ^ -1)) {
                    jj.a((byte) -128, 100L);
                    continue L1;
                  } else {
                    L3: {
                      param0.setVisible(false);
                      param0.dispose();
                      if (param1 == 16711935) {
                        break L3;
                      } else {
                        var5 = (n) null;
                        kf.a(-121, 1, -112, -24, -75, 3, (n) null, -21);
                        break L3;
                      }
                    }
                    break L0;
                  }
                } else {
                  jj.a((byte) -123, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("kf.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 65280) {
            field_c = (String) null;
        }
        return ce.field_e;
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 <= 36) {
            field_a = (li) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, n param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        wh stackIn_37_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
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
        wh var21 = null;
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
        int var44 = 0;
        n var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        var40 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param6;
                if (var45.field_g == null) {
                  break L2;
                } else {
                  if (-2 <= (var45.field_N ^ -1)) {
                    break L2;
                  } else {
                    var61 = var45.field_g;
                    k.a(var61, 0, tg.field_a, false, 0);
                    break L1;
                  }
                }
              }
              vj.b((byte) 124);
              break L1;
            }
            var55 = new int[param6.field_D];
            var50 = var55;
            var41 = var50;
            var8 = var41;
            var65 = new int[param6.field_D];
            var64 = hc.field_f;
            var63 = le.field_m;
            var62 = fl.field_d;
            var13 = 0;
            L3: while (true) {
              if (param6.field_D <= var13) {
                var14 = -37 / ((param0 - -16) / 33);
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= ld.field_A) {
                    break L0;
                  } else {
                    L5: {
                      var14 = ki.field_z[var44];
                      var15 = param6.field_l[var14];
                      var16 = param6.field_z[var14];
                      var17 = param6.field_m[var14];
                      if (hc.field_f.length > param6.field_M[var14]) {
                        stackIn_24_0 = param6.field_M[var14];
                        break L5;
                      } else {
                        stackIn_24_0 = -1;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_24_0;
                      if (hc.field_f.length > param6.field_h[var14]) {
                        stackIn_27_0 = param6.field_h[var14];
                        break L6;
                      } else {
                        stackIn_27_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_27_0;
                      if (hc.field_f.length > param6.field_v[var14]) {
                        stackIn_30_0 = param6.field_v[var14];
                        break L7;
                      } else {
                        stackIn_30_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_30_0;
                        if (e.field_d == null) {
                          break L9;
                        } else {
                          if (param6.field_c == null) {
                            break L9;
                          } else {
                            if (param6.field_c.length <= var14) {
                              break L9;
                            } else {
                              if (param6.field_c[var14] == -1) {
                                break L9;
                              } else {
                                if (param6.field_c[var14] >= e.field_d.length) {
                                  break L9;
                                } else {
                                  stackIn_37_0 = e.field_d[param6.field_c[var14]];
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_37_0 = null;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21 = stackIn_37_0;
                        var22 = nh.field_d[var15];
                        var23 = od.field_s[var15];
                        var24 = nh.field_d[var16];
                        var25 = od.field_s[var16];
                        var26 = nh.field_d[var17];
                        var27 = od.field_s[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21 == null) {
                                stackIn_47_0 = 8355711;
                                break L12;
                              } else {
                                stackIn_47_0 = var21.field_b;
                                break L12;
                              }
                            }
                            var30 = stackIn_47_0;
                            var31 = var30 & 16711935;
                            var32 = 65280 & var30;
                            var33 = var28 * var32 >>> -1230997720 & -2013200640 | var31 * var28 >>> 811325768 & -2130771713;
                            var33 = var33 + var29 * 65793;
                            dd.a(-31548, var26, (16711422 & var33) >> -847710143, var24, var22, var27, var23, var25);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21 != null) {
                          stackIn_43_0 = var21.field_b;
                          break L13;
                        } else {
                          stackIn_43_0 = 8355711;
                          break L13;
                        }
                      }
                      var34 = stackIn_43_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = -1677656320 & var28 * var36 >>> -2047540056 | var35 * var28 >>> 2112748680 & 1241448703;
                      var38 = (-16711803 & var29 * var35) >>> 910681000 | var36 * var29 >>> 1917283592 & -1191117056;
                      var39 = -838795520 & var36 * var30 >>> 1545521928 | (var30 * var35 & -16711794) >>> -1197269496;
                      var38 = var38 + var32 * 65793;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + 65793 * var33;
                      ke.a(255 & var38, var25, (var37 & 65430) >> -983845752, var38 >> -940626896, var26, 255 & var39, var39 >> -1658041072, 10, var27, var37 >> -758340016, 255 & var38 >> -30459544, var22, var23, var24, (65386 & var39) >> -1796689304, 255 & var37);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param7 * var62[var13] + (var63[var13] * param1 + var64[var13] * param3) >> 198471976;
                  if (0 > var14) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 >= 0) {
                    if ((var14 ^ -1) <= -129) {
                      stackIn_15_0 = 256;
                      break L15;
                    } else {
                      stackIn_15_0 = var14 + 128;
                      break L15;
                    }
                  } else {
                    stackIn_15_0 = 128;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = param5 * var62[var13] + param4 * var64[var13] - -(param2 * var63[var13]) >> -191165080;
                  stackIn_17_0 = ol.field_g;

                  if (0 <= var15) {
                    stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                    stackIn_18_1 = var15;
                    break L16;
                  } else {
                    stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                    stackIn_18_1 = -var15;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = var14 * (256 + -var15) >>> -893742872;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8_ref = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var8_ref);

            stackIn_52_1 = new StringBuilder().append("kf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L17;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L17;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param7 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        pb var8 = null;
        try {
          L0: {
            L1: {
              var6_int = param1 - -param3.field_w;
              var7 = param2 - -param3.field_k;
              nd.a(param3.field_p, var7, param3.field_t, var6_int, (byte) -103);
              var8 = ah.field_p[1];
              if (!(param3 instanceof ig)) {
                break L1;
              } else {
                if (!((ig) ((Object) param3)).field_z) {
                  break L1;
                } else {
                  var8.d(1 + (var6_int - -(-var8.field_w + param3.field_p >> -1459428383)), (-var8.field_x + param3.field_t >> -330493791) + 1 + var7, 256);
                  break L1;
                }
              }
            }
            if (param4 == 4549) {
              L2: {
                if (param3.e(0)) {
                  og.a(2 + var6_int, (byte) 105, -4 + param3.field_p, -4 + param3.field_t, 2 + var7);
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("kf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String b(int param0) {
        if (param0 != -940626896) {
            field_c = (String) null;
        }
        return kl.field_o;
    }

    static {
        field_c = "Start level ";
        field_a = new li(10, 2, 2, 0);
        field_b = new int[8192];
    }
}
