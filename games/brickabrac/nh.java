/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static mh field_a;
    static String field_d;
    static int field_b;
    static rg field_c;

    final static void a(int param0, int param1, int param2, int param3, jp[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var22 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param0 <= 0) {
                  break L1;
                } else {
                  if (param1 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param4[3] != null) {
                        stackOut_9_0 = param4[3].field_x;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param4[5] == null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param4[5].field_x;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    var7 = stackIn_13_0;
                    if (param2 == -40) {
                      L4: {
                        if (null == param4[1]) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          stackOut_16_0 = param4[1].field_z;
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_18_0;
                        if (param4[7] != null) {
                          stackOut_20_0 = param4[7].field_z;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_21_0;
                        var10 = param0 + param3;
                        var11 = param5 + param1;
                        var12 = var6_int + param3;
                        var13 = -var7 + var10;
                        var14 = var8 + param5;
                        var15 = var11 + -var9;
                        var16 = var12;
                        var17 = var13;
                        if (var16 > var17) {
                          var17 = param0 * var6_int / (var7 + var6_int) + param3;
                          var16 = param0 * var6_int / (var7 + var6_int) + param3;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        if (var19 >= var18) {
                          break L7;
                        } else {
                          var19 = param1 * var8 / (var8 + var9) + param5;
                          var18 = param1 * var8 / (var8 + var9) + param5;
                          break L7;
                        }
                      }
                      L8: {
                        lb.a(rg.field_g);
                        if (null == param4[0]) {
                          break L8;
                        } else {
                          lb.d(param3, param5, var16, var18);
                          param4[0].c(param3, param5);
                          lb.b(rg.field_g);
                          break L8;
                        }
                      }
                      L9: {
                        if (null == param4[2]) {
                          break L9;
                        } else {
                          lb.d(var17, param5, var10, var18);
                          param4[2].c(var13, param5);
                          lb.b(rg.field_g);
                          break L9;
                        }
                      }
                      L10: {
                        if (null == param4[6]) {
                          break L10;
                        } else {
                          lb.d(param3, var19, var16, var11);
                          param4[6].c(param3, var15);
                          lb.b(rg.field_g);
                          break L10;
                        }
                      }
                      L11: {
                        if (param4[8] != null) {
                          lb.d(var17, var19, var10, var11);
                          param4[8].c(var13, var15);
                          lb.b(rg.field_g);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param4[1] == null) {
                          break L12;
                        } else {
                          if (0 != param4[1].field_x) {
                            lb.d(var16, param5, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var13 <= var20) {
                                lb.b(rg.field_g);
                                break L12;
                              } else {
                                param4[1].c(var20, param5);
                                var20 = var20 + param4[1].field_x;
                                continue L13;
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (param4[7] == null) {
                          break L14;
                        } else {
                          if (param4[7].field_x != 0) {
                            lb.d(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                lb.b(rg.field_g);
                                break L14;
                              } else {
                                param4[7].c(var20, var15);
                                var20 = var20 + param4[7].field_x;
                                continue L15;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      L16: {
                        if (param4[3] == null) {
                          break L16;
                        } else {
                          if (param4[3].field_z != 0) {
                            lb.d(param3, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var20 >= var15) {
                                lb.b(rg.field_g);
                                break L16;
                              } else {
                                param4[3].c(param3, var20);
                                var20 = var20 + param4[3].field_z;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (null == param4[5]) {
                          break L18;
                        } else {
                          if (param4[5].field_z != 0) {
                            lb.d(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var15 <= var20) {
                                lb.b(rg.field_g);
                                break L18;
                              } else {
                                param4[5].c(var13, var20);
                                var20 = var20 + param4[5].field_z;
                                continue L19;
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        if (null == param4[4]) {
                          break L20;
                        } else {
                          if (param4[4].field_x == 0) {
                            break L20;
                          } else {
                            if (param4[4].field_z == 0) {
                              break L20;
                            } else {
                              lb.d(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var20 >= var15) {
                                  lb.b(rg.field_g);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var21 >= var13) {
                                      var20 = var20 + param4[4].field_z;
                                      continue L21;
                                    } else {
                                      param4[4].c(var21, var20);
                                      var21 = var21 + param4[4].field_x;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var6;
            stackOut_74_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param5 + ')');
        }
    }

    final static void a(jp[] param0, int param1, int param2, int param3, int param4, dh param5, int param6, int param7, int param8, jp[] param9, int param10, jp[] param11, int param12, byte param13, int param14) {
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        Object var17 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var15_int = param5.field_B - -param5.field_P;
              var16 = param5.field_B;
              if (param13 == -110) {
                break L1;
              } else {
                var17 = null;
                nh.a((jp[]) null, -71, 62, -50, 61, (dh) null, 97, 90, 79, (jp[]) null, 117, (jp[]) null, 81, (byte) 46, -119);
                break L1;
              }
            }
            oa.a(param3, var15_int, param10, param2, var15_int, param12, param1, param7, param4, param0, param5, param11, param8, param6, var16, false, param14, param9, param5, var16);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var15;
            stackOut_4_1 = new StringBuilder().append("nh.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param9 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param10).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param11 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        mh var6 = null;
        mh var7 = null;
        mh var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        vl var17 = null;
        int var17_int = 0;
        Object var18 = null;
        id var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        mh var21 = null;
        int[] var22 = null;
        int[] var24 = null;
        mh var25 = null;
        int[] var26 = null;
        String var27 = null;
        String var28 = null;
        int[] var29 = null;
        mh stackIn_17_0 = null;
        mh stackIn_18_0 = null;
        mh stackIn_19_0 = null;
        mh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_39_0 = 0;
        mh stackIn_157_0 = null;
        mh stackIn_158_0 = null;
        mh stackIn_159_0 = null;
        mh stackIn_160_0 = null;
        mh stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        mh stackIn_162_0 = null;
        mh stackIn_163_0 = null;
        mh stackIn_164_0 = null;
        mh stackIn_165_0 = null;
        mh stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        mh stackIn_167_0 = null;
        mh stackIn_168_0 = null;
        mh stackIn_169_0 = null;
        mh stackIn_170_0 = null;
        mh stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_16_0 = null;
        mh stackOut_17_0 = null;
        mh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        mh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        mh stackOut_156_0 = null;
        mh stackOut_157_0 = null;
        mh stackOut_158_0 = null;
        mh stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        mh stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        mh stackOut_161_0 = null;
        mh stackOut_162_0 = null;
        mh stackOut_163_0 = null;
        mh stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        mh stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        mh stackOut_166_0 = null;
        mh stackOut_167_0 = null;
        mh stackOut_168_0 = null;
        mh stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        mh stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        var18 = null;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              co.a(eg.field_m, false);
              if (o.field_e != null) {
                L2: {
                  ij.field_e.field_eb = true;
                  var21 = pf.field_h;
                  var25 = var21;
                  pf.field_h.field_cb = 0;
                  var25.field_Ib = 0;
                  dn.field_K.field_cb = 0;
                  var6 = dn.field_K;
                  var6.field_Ib = 0;
                  var7 = ke.field_e;
                  ke.field_e.field_cb = 0;
                  var7.field_Ib = 0;
                  int discarded$1 = 7;
                  if (hn.b()) {
                    L3: {
                      ba.field_v.field_Mb = ba.field_x.toUpperCase();
                      var9 = (ak.field_d.field_Ib - -2) / 2;
                      pf.field_h.a(40, ak.field_d.field_cb + -40, 0, -2 + var9, (byte) 64);
                      if (~o.field_e.field_jc < ~o.field_e.field_cc) {
                        pf.field_h.field_Mb = lq.field_a.toUpperCase();
                        pf.field_h.field_eb = true;
                        break L3;
                      } else {
                        pf.field_h.field_Mb = wg.field_d.toUpperCase();
                        pf.field_h.field_eb = false;
                        break L3;
                      }
                    }
                    L4: {
                      pf.field_h.field_Jb = fm.field_b.field_Jb;
                      if (uf.field_c > 0) {
                        L5: {
                          if (uf.field_c != 1) {
                            var10_ref_String = rd.a(mq.field_h, new String[1], (byte) 103);
                            break L5;
                          } else {
                            var10_ref_String = ei.field_g;
                            break L5;
                          }
                        }
                        pf.field_h.field_Mb = pf.field_h.field_Mb + "<br>" + var10_ref_String;
                        if ((an.field_h & 16) != 0) {
                          break L4;
                        } else {
                          if (hc.field_c) {
                            break L4;
                          } else {
                            pf.field_h.field_Jb = fm.field_b.field_Gb;
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      L7: {
                        dn.field_K.a(40, ak.field_d.field_cb + -40, var9, ak.field_d.field_Ib + -var9, (byte) 64);
                        dn.field_K.field_Mb = sn.field_r.toUpperCase();
                        var8 = dn.field_K;
                        stackOut_16_0 = dn.field_K;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (!param4) {
                          break L7;
                        } else {
                          stackOut_17_0 = (mh) (Object) stackIn_17_0;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (ic.field_b != 0L) {
                            break L7;
                          } else {
                            stackOut_18_0 = (mh) (Object) stackIn_18_0;
                            stackOut_18_1 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L6;
                          }
                        }
                      }
                      stackOut_19_0 = (mh) (Object) stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L6;
                    }
                    L8: {
                      L9: {
                        L10: {
                          stackIn_20_0.field_eb = stackIn_20_1 != 0;
                          var10 = 2;
                          if (null == br.field_bc) {
                            break L10;
                          } else {
                            L11: {
                              if (qo.field_J == null) {
                                h.field_D = new boolean[cq.field_p];
                                qo.field_J = new byte[cq.field_p];
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var11 = 0;
                            L12: while (true) {
                              if (cq.field_p <= var11) {
                                var10 = 0;
                                L13: while (true) {
                                  if (var10 >= 2) {
                                    if (2 > kb.field_Yb) {
                                      break L10;
                                    } else {
                                      if (!pe.field_l[12]) {
                                        break L10;
                                      } else {
                                        var10 = 2;
                                        break L10;
                                      }
                                    }
                                  } else {
                                    var11 = 0;
                                    var12 = 0;
                                    L14: while (true) {
                                      if (br.field_bc.length <= var12) {
                                        if (var11 == 0) {
                                          var10++;
                                          continue L13;
                                        } else {
                                          L15: {
                                            if (2 > kb.field_Yb) {
                                              break L15;
                                            } else {
                                              if (!pe.field_l[12]) {
                                                break L15;
                                              } else {
                                                var10 = 2;
                                                break L15;
                                              }
                                            }
                                          }
                                          if (var10 >= 2) {
                                            break L8;
                                          } else {
                                            dn.field_K.field_eb = false;
                                            if (!dn.field_K.field_G) {
                                              break L2;
                                            } else {
                                              var11_ref = null;
                                              var12 = 0;
                                              var13 = 0;
                                              L16: while (true) {
                                                if (~cq.field_p >= ~var13) {
                                                  break L9;
                                                } else {
                                                  L17: {
                                                    if (!h.field_D[var13]) {
                                                      break L17;
                                                    } else {
                                                      var27 = "<col=A00000>" + rg.field_b[var13] + "</col>";
                                                      if (var11_ref == null) {
                                                        var11_ref = (Object) (Object) var27;
                                                        break L17;
                                                      } else {
                                                        var11_ref = (Object) (Object) ((String) var11_ref + ", " + var27);
                                                        var12 = 1;
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  var13++;
                                                  continue L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var29 = br.field_bc[var12];
                                        var26 = var29;
                                        var24 = var26;
                                        var22 = var24;
                                        var13_ref_int__ = var22;
                                        var14 = 0;
                                        L18: while (true) {
                                          L19: {
                                            if (~var29.length >= ~var14) {
                                              var11 = 1;
                                              var14 = -1;
                                              var15 = 0;
                                              L20: while (true) {
                                                if (var15 >= var29.length) {
                                                  h.field_D[var14] = true;
                                                  break L19;
                                                } else {
                                                  L21: {
                                                    var16 = var29[var15];
                                                    if (~var16 < ~var14) {
                                                      var14 = var16;
                                                      break L21;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                  var15 += 2;
                                                  continue L20;
                                                }
                                              }
                                            } else {
                                              L22: {
                                                var15 = var29[var14];
                                                var16 = var13_ref_int__[var14 - -1];
                                                if (var15 == -1) {
                                                  L23: {
                                                    if (var10 != 0) {
                                                      stackOut_38_0 = o.field_e.field_cc;
                                                      stackIn_39_0 = stackOut_38_0;
                                                      break L23;
                                                    } else {
                                                      stackOut_37_0 = o.field_e.field_jc;
                                                      stackIn_39_0 = stackOut_37_0;
                                                      break L23;
                                                    }
                                                  }
                                                  var17_int = stackIn_39_0;
                                                  if (var17_int == var16) {
                                                    break L22;
                                                  } else {
                                                    break L19;
                                                  }
                                                } else {
                                                  if (~(o.field_e.field_Tb[var15] & 255) == ~var16) {
                                                    break L22;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              var14 += 2;
                                              continue L18;
                                            }
                                          }
                                          var12++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                h.field_D[var11] = false;
                                var11++;
                                continue L12;
                              }
                            }
                          }
                        }
                        if (var10 >= 2) {
                          break L8;
                        } else {
                          dn.field_K.field_eb = false;
                          if (!dn.field_K.field_G) {
                            break L2;
                          } else {
                            var11_ref = null;
                            var12 = 0;
                            var13 = 0;
                            L24: while (true) {
                              if (~cq.field_p >= ~var13) {
                                break L9;
                              } else {
                                L25: {
                                  if (!h.field_D[var13]) {
                                    break L25;
                                  } else {
                                    var28 = "<col=A00000>" + rg.field_b[var13] + "</col>";
                                    if (var11_ref == null) {
                                      var11_ref = (Object) (Object) var28;
                                      break L25;
                                    } else {
                                      var11_ref = (Object) (Object) ((String) var11_ref + ", " + var28);
                                      var12 = 1;
                                      break L25;
                                    }
                                  }
                                }
                                var13++;
                                continue L24;
                              }
                            }
                          }
                        }
                      }
                      L26: {
                        if (var10 != 0) {
                          var13_ref_String = bh.field_rb;
                          if (var12 != 0) {
                            var14_ref_String = ff.field_e + (String) var11_ref;
                            break L26;
                          } else {
                            var14_ref_String = rd.a(br.field_ac, new String[1], (byte) 103);
                            break L26;
                          }
                        } else {
                          var13_ref_String = eq.field_b;
                          if (var12 == 0) {
                            var14_ref_String = rd.a(gk.field_b, new String[1], (byte) 103);
                            break L26;
                          } else {
                            var14_ref_String = ki.field_g + (String) var11_ref;
                            break L26;
                          }
                        }
                      }
                      ep.field_e = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                      break L2;
                    }
                    L27: {
                      if (null != vl.field_a) {
                        break L27;
                      } else {
                        if (bl.field_F != null) {
                          break L27;
                        } else {
                          if (ld.field_v != null) {
                            break L27;
                          } else {
                            if (null != me.field_e) {
                              break L27;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L28: while (true) {
                      if (cq.field_p <= var16) {
                        var16 = 0;
                        var17 = vp.field_u.field_Rb.field_bb;
                        var18_ref = (id) (Object) var17.d(-97);
                        L29: while (true) {
                          L30: {
                            if (var18_ref == null) {
                              break L30;
                            } else {
                              L31: {
                                if (!var18_ref.i(0)) {
                                  L32: {
                                    if (var11 == 0) {
                                      break L32;
                                    } else {
                                      if (!var18_ref.field_ec) {
                                        var16 = 1;
                                        break L30;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  if (var13 > var18_ref.field_Wb) {
                                    var16 = 1;
                                    break L30;
                                  } else {
                                    if (var18_ref.field_ac < var14) {
                                      var16 = 1;
                                      break L30;
                                    } else {
                                      if ((var15 & ~var18_ref.field_Ub) > 0) {
                                        var16 = 1;
                                        break L30;
                                      } else {
                                        if (var12 == 0) {
                                          break L31;
                                        } else {
                                          var16 = 1;
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L31;
                                }
                              }
                              var18_ref = (id) (Object) var17.a((byte) 116);
                              continue L29;
                            }
                          }
                          L33: {
                            if (2 > kb.field_Yb) {
                              break L33;
                            } else {
                              if (pe.field_l[12]) {
                                var16 = 0;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          if (var16 != 0) {
                            dn.field_K.field_eb = false;
                            if (!dn.field_K.field_G) {
                              break L2;
                            } else {
                              if (sb.field_c.field_d.field_Vb == 0) {
                                ep.field_e = ei.field_a;
                                break L2;
                              } else {
                                ep.field_e = rd.a(ta.field_d, new String[1], (byte) 103);
                                break L2;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        L34: {
                          var17_int = 255 & o.field_e.field_Tb[var16];
                          if (vl.field_a == null) {
                            break L34;
                          } else {
                            if (vl.field_a[var16] != null) {
                              if (vl.field_a[var16][var17_int]) {
                                var11 = 1;
                                break L34;
                              } else {
                                break L34;
                              }
                            } else {
                              break L34;
                            }
                          }
                        }
                        L35: {
                          if (bl.field_F == null) {
                            break L35;
                          } else {
                            if (null == bl.field_F[var16]) {
                              break L35;
                            } else {
                              L36: {
                                var18_int = bl.field_F[var16][var17_int];
                                if (var18_int == 0) {
                                  break L36;
                                } else {
                                  if (ea.field_g) {
                                    break L36;
                                  } else {
                                    var11 = 1;
                                    break L36;
                                  }
                                }
                              }
                              if (var18_int <= var13) {
                                break L35;
                              } else {
                                var13 = var18_int;
                                break L35;
                              }
                            }
                          }
                        }
                        L37: {
                          if (ld.field_v == null) {
                            break L37;
                          } else {
                            if (ld.field_v[var16] != null) {
                              L38: {
                                var18_int = ld.field_v[var16][var17_int];
                                if (var18_int == 0) {
                                  break L38;
                                } else {
                                  if (!ea.field_g) {
                                    var11 = 1;
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              if (var14 >= var18_int) {
                                break L37;
                              } else {
                                var14 = var18_int;
                                break L37;
                              }
                            } else {
                              L39: {
                                if (null == me.field_e) {
                                  break L39;
                                } else {
                                  if (me.field_e[var16] == null) {
                                    break L39;
                                  } else {
                                    var15 = var15 | me.field_e[var16][var17_int];
                                    break L39;
                                  }
                                }
                              }
                              var16++;
                              continue L28;
                            }
                          }
                        }
                        L40: {
                          if (null == me.field_e) {
                            break L40;
                          } else {
                            if (me.field_e[var16] == null) {
                              break L40;
                            } else {
                              var15 = var15 | me.field_e[var16][var17_int];
                              break L40;
                            }
                          }
                        }
                        var16++;
                        continue L28;
                      }
                    }
                  } else {
                    var9_ref_String = o.field_e.field_Fc;
                    ba.field_v.field_Mb = rd.a(fm.field_a, new String[1], (byte) 103).toUpperCase();
                    ke.field_e.a(40, ak.field_d.field_cb + -40, 0, ak.field_d.field_Ib, (byte) 64);
                    ke.field_e.field_Mb = rd.a(nm.field_a, new String[1], (byte) 103);
                    var8 = ke.field_e;
                    break L2;
                  }
                }
                L41: {
                  if (0L != ic.field_b) {
                    L42: {
                      var9 = (int)(ic.field_b + -ue.a(false));
                      var9 = (var9 + 999) / 1000;
                      if (1 <= var9) {
                        break L42;
                      } else {
                        var9 = 1;
                        break L42;
                      }
                    }
                    var8.field_Mb = rd.a(mn.field_w, new String[1], (byte) 103);
                    break L41;
                  } else {
                    break L41;
                  }
                }
                um.field_b.field_Mb = rd.a(rl.field_d, new String[2], (byte) 103);
                break L1;
              } else {
                break L1;
              }
            }
            L43: {
              L44: {
                stackOut_156_0 = qa.field_w;
                stackIn_160_0 = stackOut_156_0;
                stackIn_157_0 = stackOut_156_0;
                if (!param2) {
                  break L44;
                } else {
                  stackOut_157_0 = (mh) (Object) stackIn_157_0;
                  stackIn_160_0 = stackOut_157_0;
                  stackIn_158_0 = stackOut_157_0;
                  if (param1) {
                    break L44;
                  } else {
                    stackOut_158_0 = (mh) (Object) stackIn_158_0;
                    stackIn_160_0 = stackOut_158_0;
                    stackIn_159_0 = stackOut_158_0;
                    if (hc.field_c) {
                      break L44;
                    } else {
                      stackOut_159_0 = (mh) (Object) stackIn_159_0;
                      stackOut_159_1 = 1;
                      stackIn_161_0 = stackOut_159_0;
                      stackIn_161_1 = stackOut_159_1;
                      break L43;
                    }
                  }
                }
              }
              stackOut_160_0 = (mh) (Object) stackIn_160_0;
              stackOut_160_1 = 0;
              stackIn_161_0 = stackOut_160_0;
              stackIn_161_1 = stackOut_160_1;
              break L43;
            }
            L45: {
              L46: {
                ((mh) (Object) stackIn_161_0).a(stackIn_161_1 != 0, -15211);
                stackOut_161_0 = ak.field_d;
                stackIn_165_0 = stackOut_161_0;
                stackIn_162_0 = stackOut_161_0;
                if (!param2) {
                  break L46;
                } else {
                  stackOut_162_0 = (mh) (Object) stackIn_162_0;
                  stackIn_165_0 = stackOut_162_0;
                  stackIn_163_0 = stackOut_162_0;
                  if (param1) {
                    break L46;
                  } else {
                    stackOut_163_0 = (mh) (Object) stackIn_163_0;
                    stackIn_165_0 = stackOut_163_0;
                    stackIn_164_0 = stackOut_163_0;
                    if (hc.field_c) {
                      break L46;
                    } else {
                      stackOut_164_0 = (mh) (Object) stackIn_164_0;
                      stackOut_164_1 = 1;
                      stackIn_166_0 = stackOut_164_0;
                      stackIn_166_1 = stackOut_164_1;
                      break L45;
                    }
                  }
                }
              }
              stackOut_165_0 = (mh) (Object) stackIn_165_0;
              stackOut_165_1 = 0;
              stackIn_166_0 = stackOut_165_0;
              stackIn_166_1 = stackOut_165_1;
              break L45;
            }
            L47: {
              L48: {
                ((mh) (Object) stackIn_166_0).a(stackIn_166_1 != 0, -15211);
                stackOut_166_0 = wi.field_j;
                stackIn_170_0 = stackOut_166_0;
                stackIn_167_0 = stackOut_166_0;
                if (!param2) {
                  break L48;
                } else {
                  stackOut_167_0 = (mh) (Object) stackIn_167_0;
                  stackIn_170_0 = stackOut_167_0;
                  stackIn_168_0 = stackOut_167_0;
                  if (param1) {
                    break L48;
                  } else {
                    stackOut_168_0 = (mh) (Object) stackIn_168_0;
                    stackIn_170_0 = stackOut_168_0;
                    stackIn_169_0 = stackOut_168_0;
                    if (!hc.field_c) {
                      break L48;
                    } else {
                      stackOut_169_0 = (mh) (Object) stackIn_169_0;
                      stackOut_169_1 = 1;
                      stackIn_171_0 = stackOut_169_0;
                      stackIn_171_1 = stackOut_169_1;
                      break L47;
                    }
                  }
                }
              }
              stackOut_170_0 = (mh) (Object) stackIn_170_0;
              stackOut_170_1 = 0;
              stackIn_171_0 = stackOut_170_0;
              stackIn_171_1 = stackOut_170_1;
              break L47;
            }
            L49: {
              ((mh) (Object) stackIn_171_0).a(stackIn_171_1 != 0, -15211);
              sb.field_c.field_d.i(0);
              if (null != o.field_e) {
                L50: {
                  if (ij.field_e.field_L == 0) {
                    break L50;
                  } else {
                    vg.a(o.field_e.e((byte) 123), false, param3);
                    break L50;
                  }
                }
                L51: {
                  if (pf.field_h.field_L != 0) {
                    hc.field_c = true;
                    break L51;
                  } else {
                    break L51;
                  }
                }
                L52: {
                  if (dn.field_K.field_L == 0) {
                    break L52;
                  } else {
                    sl.field_w = true;
                    break L52;
                  }
                }
                L53: {
                  if (0 != nd.field_a.field_L) {
                    hc.field_c = false;
                    break L53;
                  } else {
                    break L53;
                  }
                }
                ip.a(param3, o.field_e, false, false);
                break L49;
              } else {
                break L49;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var5, "nh.E(" + true + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        id var1_ref = null;
        om var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_ref = (id) (Object) ua.field_c.d(-50);
            L1: while (true) {
              if (var1_ref == null) {
                L2: {
                  var1_ref2 = (om) (Object) rq.field_a.d(-14);
                  if (param0 == 0) {
                    break L2;
                  } else {
                    field_b = -23;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (id) (Object) mp.field_Tb.d(-21);
                    L4: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        L5: {
                          if (var1_ref.field_ic > 0) {
                            var1_ref.field_ic = var1_ref.field_ic - 1;
                            if (var1_ref.field_ic == 0) {
                              var1_ref.field_kc = 0;
                              if (!var1_ref.i(param0)) {
                                break L5;
                              } else {
                                var1_ref.b((byte) 111);
                                break L5;
                              }
                            } else {
                              var1_ref = (id) (Object) mp.field_Tb.a((byte) 116);
                              continue L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var1_ref = (id) (Object) mp.field_Tb.a((byte) 116);
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var1_ref2.field_Wb > 0) {
                        var1_ref2.field_Wb = var1_ref2.field_Wb - 1;
                        if (var1_ref2.field_Wb == 0) {
                          var1_ref2.field_Zb = 0;
                          if (!var1_ref2.h(param0 ^ -15)) {
                            break L6;
                          } else {
                            var1_ref2.b((byte) 111);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref2 = (om) (Object) rq.field_a.a((byte) 116);
                    continue L3;
                  }
                }
              } else {
                L7: {
                  if (var1_ref.field_ic <= 0) {
                    break L7;
                  } else {
                    var1_ref.field_ic = var1_ref.field_ic - 1;
                    if (var1_ref.field_ic == 0) {
                      var1_ref.field_kc = 0;
                      if (var1_ref.i(0)) {
                        var1_ref.b((byte) 111);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                var1_ref = (id) (Object) ua.field_c.a((byte) 116);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "nh.B(" + param0 + ')');
        }
    }

    public static void b() {
        int var1 = 8;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Security";
    }
}
