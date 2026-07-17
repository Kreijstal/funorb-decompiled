/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends ic {
    static int field_p;
    static od field_n;
    private ug field_s;
    vd field_q;
    static int field_l;
    ec field_r;
    static String field_m;
    static nh field_o;

    final int d() {
        return 0;
    }

    final ic c() {
        cc var1 = null;
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        L0: while (true) {
          var1 = (cc) (Object) ((am) this).field_q.e(0);
          if (var1 != null) {
            if (var1.field_D != null) {
              return (ic) (Object) var1.field_D;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final ic a() {
        cc var1 = null;
        var1 = (cc) (Object) ((am) this).field_q.h(-11151);
        if (var1 != null) {
          if (var1.field_D != null) {
            return (ic) (Object) var1.field_D;
          } else {
            return ((am) this).c();
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, nh[] param3, int param4, int param5) {
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              return;
            } else {
              L1: {
                if (0 >= param2) {
                  break L1;
                } else {
                  if (0 >= param1) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param3[3]) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = param3[3].field_z;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null == param3[5]) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = param3[5].field_z;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (param3[1] == null) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = param3[1].field_C;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (null == param3[7]) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = param3[7].field_C;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_20_0;
                      var10 = param2 + param5;
                      var11 = param0 - -param1;
                      var12 = var6_int + param5;
                      var13 = var10 + -var7;
                      var14 = param0 - -var8;
                      var15 = var11 + -var9;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = param2 * var6_int / (var7 + var6_int) + param5;
                        var16 = param2 * var6_int / (var7 + var6_int) + param5;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      wj.b(tg.field_i);
                      if (var18 <= var19) {
                        break L7;
                      } else {
                        var19 = var8 * param1 / (var8 - -var9) + param0;
                        var18 = var8 * param1 / (var8 - -var9) + param0;
                        break L7;
                      }
                    }
                    L8: {
                      if (param3[0] != null) {
                        wj.d(param5, param0, var16, var18);
                        param3[0].d(param5, param0);
                        wj.a(tg.field_i);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param3[2] == null) {
                        break L9;
                      } else {
                        wj.d(var17, param0, var10, var18);
                        param3[2].d(var13, param0);
                        wj.a(tg.field_i);
                        break L9;
                      }
                    }
                    L10: {
                      if (null != param3[6]) {
                        wj.d(param5, var19, var16, var11);
                        param3[6].d(param5, var15);
                        wj.a(tg.field_i);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param3[8]) {
                        break L11;
                      } else {
                        wj.d(var17, var19, var10, var11);
                        param3[8].d(var13, var15);
                        wj.a(tg.field_i);
                        break L11;
                      }
                    }
                    L12: {
                      if (param3[1] == null) {
                        break L12;
                      } else {
                        if (0 != param3[1].field_z) {
                          wj.d(var16, param0, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              wj.a(tg.field_i);
                              break L12;
                            } else {
                              param3[1].d(var20, param0);
                              var20 = var20 + param3[1].field_z;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (param3[7] == null) {
                        break L14;
                      } else {
                        if (param3[7].field_z != 0) {
                          wj.d(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var13 <= var20) {
                              wj.a(tg.field_i);
                              break L14;
                            } else {
                              param3[7].d(var20, var15);
                              var20 = var20 + param3[7].field_z;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param3[3]) {
                        break L16;
                      } else {
                        if (param3[3].field_C == 0) {
                          break L16;
                        } else {
                          wj.d(param5, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var20 >= var15) {
                              wj.a(tg.field_i);
                              break L16;
                            } else {
                              param3[3].d(param5, var20);
                              var20 = var20 + param3[3].field_C;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (null == param3[5]) {
                        break L18;
                      } else {
                        if (param3[5].field_C != 0) {
                          wj.d(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              wj.a(tg.field_i);
                              break L18;
                            } else {
                              param3[5].d(var13, var20);
                              var20 = var20 + param3[5].field_C;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (null == param3[4]) {
                        break L20;
                      } else {
                        if (param3[4].field_z == 0) {
                          break L20;
                        } else {
                          if (param3[4].field_C == 0) {
                            break L20;
                          } else {
                            wj.d(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                wj.a(tg.field_i);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param3[4].field_C;
                                    continue L21;
                                  } else {
                                    param3[4].d(var21, var20);
                                    var21 = var21 + param3[4].field_z;
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
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var6;
            stackOut_73_1 = new StringBuilder().append("am.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L23;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L23;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + 14673 + 44 + param5 + 41);
        }
    }

    final static String h() {
        if (!(null != oa.field_d)) {
            return "";
        }
        return null;
    }

    final static void g(int param0) {
        oa.field_d = dh.field_N.b((byte) -53);
        CharSequence var2 = (CharSequence) (Object) oa.field_d;
        tf.field_pb = rh.a(119, var2);
        if (param0 != 11) {
            am.g(-127);
        }
    }

    private final void a(int param0, int param1, cc param2, byte param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ag var11 = null;
        int var12 = 0;
        ug stackIn_10_0 = null;
        cc stackIn_10_1 = null;
        ug stackIn_11_0 = null;
        cc stackIn_11_1 = null;
        ug stackIn_12_0 = null;
        cc stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ug stackOut_9_0 = null;
        cc stackOut_9_1 = null;
        ug stackOut_11_0 = null;
        cc stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        ug stackOut_10_0 = null;
        cc stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & ((am) this).field_s.field_C[param2.field_u]) == 0) {
                break L1;
              } else {
                if (param2.field_k >= 0) {
                  break L1;
                } else {
                  var7_int = ((am) this).field_s.field_B[param2.field_u] / id.field_d;
                  L2: while (true) {
                    var8 = (-param2.field_i + 1048575 - -var7_int) / var7_int;
                    if (param1 >= var8) {
                      L3: {
                        param2.field_D.b(param4, param0, var8);
                        param0 = param0 + var8;
                        param2.field_i = param2.field_i + (var8 * var7_int - 1048576);
                        param1 = param1 - var8;
                        var9 = id.field_d / 100;
                        var10 = 262144 / var7_int;
                        if (var9 <= var10) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param2.field_D;
                        if (((am) this).field_s.field_E[param2.field_u] == 0) {
                          param2.field_D = ag.b(param2.field_C, var11.j(), var11.e(), var11.h());
                          break L4;
                        } else {
                          L5: {
                            param2.field_D = ag.b(param2.field_C, var11.j(), 0, var11.h());
                            stackOut_9_0 = ((am) this).field_s;
                            stackOut_9_1 = (cc) param2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (param2.field_o.field_p[param2.field_F] >= 0) {
                              stackOut_11_0 = (ug) (Object) stackIn_11_0;
                              stackOut_11_1 = (cc) (Object) stackIn_11_1;
                              stackOut_11_2 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              break L5;
                            } else {
                              stackOut_10_0 = (ug) (Object) stackIn_10_0;
                              stackOut_10_1 = (cc) (Object) stackIn_10_1;
                              stackOut_10_2 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              break L5;
                            }
                          }
                          ((ug) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2 != 0, (byte) -88);
                          param2.field_D.e(var9, var11.e());
                          break L4;
                        }
                      }
                      L6: {
                        if (param2.field_o.field_p[param2.field_F] >= 0) {
                          break L6;
                        } else {
                          param2.field_D.f(-1);
                          break L6;
                        }
                      }
                      var11.k(var9);
                      var11.b(param4, param0, param5 - param0);
                      if (var11.g()) {
                        ((am) this).field_r.a((ic) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    } else {
                      param2.field_i = param2.field_i + param1 * var7_int;
                      break L1;
                    }
                  }
                }
              }
            }
            param2.field_D.b(param4, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("am.J(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(97).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param5 + 41);
        }
    }

    private final void a(int param0, cc param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ug stackIn_8_0 = null;
        cc stackIn_8_1 = null;
        ug stackIn_9_0 = null;
        cc stackIn_9_1 = null;
        ug stackIn_10_0 = null;
        cc stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ug stackOut_7_0 = null;
        cc stackOut_7_1 = null;
        ug stackOut_9_0 = null;
        cc stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        ug stackOut_8_0 = null;
        cc stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if ((((am) this).field_s.field_C[param1.field_u] & 4) == 0) {
                break L1;
              } else {
                if (0 > param1.field_k) {
                  var4_int = ((am) this).field_s.field_B[param1.field_u] / id.field_d;
                  var5 = (var4_int + (1048575 + -param1.field_i)) / var4_int;
                  param1.field_i = param2 * var4_int + param1.field_i & 1048575;
                  if (var5 <= param2) {
                    L2: {
                      if (((am) this).field_s.field_E[param1.field_u] != 0) {
                        L3: {
                          param1.field_D = ag.b(param1.field_C, param1.field_D.j(), 0, param1.field_D.h());
                          stackOut_7_0 = ((am) this).field_s;
                          stackOut_7_1 = (cc) param1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if (0 <= param1.field_o.field_p[param1.field_F]) {
                            stackOut_9_0 = (ug) (Object) stackIn_9_0;
                            stackOut_9_1 = (cc) (Object) stackIn_9_1;
                            stackOut_9_2 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L3;
                          } else {
                            stackOut_8_0 = (ug) (Object) stackIn_8_0;
                            stackOut_8_1 = (cc) (Object) stackIn_8_1;
                            stackOut_8_2 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            break L3;
                          }
                        }
                        ((ug) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0, (byte) -102);
                        break L2;
                      } else {
                        param1.field_D = ag.b(param1.field_C, param1.field_D.j(), param1.field_D.e(), param1.field_D.h());
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param1.field_o.field_p[param1.field_F]) {
                        param1.field_D.f(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param2 = param1.field_i / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param0 < -24) {
              param1.field_D.d(param2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("am.F(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        cc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            ((am) this).field_r.b(param0, param1, param2);
            var6 = (cc) (Object) ((am) this).field_q.h(-11151);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((am) this).field_s.a(-128, var6)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_l >= var5) {
                        this.a(var4_int, var5, var6, (byte) 97, param0, var5 + var4_int);
                        var6.field_l = var6.field_l - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var6.field_l, var6, (byte) 97, param0, var4_int - -var5);
                        var5 = var5 - var6.field_l;
                        var4_int = var4_int + var6.field_l;
                        if (!((am) this).field_s.a(var4_int, param0, -128, var6, var5)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = (cc) (Object) ((am) this).field_q.e(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("am.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void f() {
        field_o = null;
        field_m = null;
        field_n = null;
    }

    final void d(int param0) {
        int var2 = 0;
        cc var3 = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((am) this).field_r.d(param0);
        var3 = (cc) (Object) ((am) this).field_q.h(-11151);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((am) this).field_s.a(-124, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_l >= var2) {
                    this.a(-59, var3, var2);
                    var3.field_l = var3.field_l - var2;
                    break L1;
                  } else {
                    this.a(-127, var3, var3.field_l);
                    var2 = var2 - var3.field_l;
                    if (((am) this).field_s.a(0, (int[]) null, -128, var3, var2)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (cc) (Object) ((am) this).field_q.e(0);
            continue L0;
          }
        }
    }

    final static void e() {
        L0: {
          L1: {
            if (af.field_b == 10) {
              break L1;
            } else {
              int discarded$2 = 1;
              if (hc.a()) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          re.a(true);
          af.field_b = 11;
          break L0;
        }
        kl.field_S = true;
    }

    am(ug param0) {
        ((am) this).field_q = new vd();
        ((am) this).field_r = new ec();
        try {
            ((am) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "am.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 75;
        field_p = field_l / 2;
        field_n = new od(256);
    }
}
