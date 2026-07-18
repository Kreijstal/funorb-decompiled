/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static int field_a;

    final static void a(kk param0, byte param1) {
        qj var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new qj(param0.a("final_frame.jpg", -1, ""), (java.awt.Component) (Object) ki.field_f);
            var3 = var2.field_t;
            var4 = var2.field_q;
            nk.b(false);
            ej.field_d = new qj(var3, var4 * 3 / 4);
            ej.field_d.a();
            var2.h(0, 0);
            jd.field_g = new qj(var3, var4 + -ej.field_d.field_q);
            jd.field_g.a();
            var2.h(0, -ej.field_d.field_q);
            jd.field_g.field_o = ej.field_d.field_q;
            ch.m(26);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "cl.D(" + (param0 != null ? "{...}" : "null") + ',' + -123 + ')');
        }
    }

    final static void a(qj[] param0, int param1, int param2, int param3, int param4, int param5) {
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var22 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              return;
            } else {
              L1: {
                if (param4 <= 0) {
                  break L1;
                } else {
                  if (param2 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param0[3] != null) {
                        stackOut_10_0 = param0[3].field_s;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (param0[5] != null) {
                        stackOut_13_0 = param0[5].field_s;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (param0[1] != null) {
                        stackOut_16_0 = param0[1].field_v;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (null != param0[7]) {
                        stackOut_19_0 = param0[7].field_v;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_20_0;
                      var10 = param1 - -param4;
                      var11 = param2 + param3;
                      var12 = param1 + var6_int;
                      var13 = -var7 + var10;
                      var14 = var8 + param3;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 < var16) {
                        var17 = param1 - -(param4 * var6_int / (var6_int + var7));
                        var16 = param1 - -(param4 * var6_int / (var6_int + var7));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      ll.a(bf.field_a);
                      if (var19 < var18) {
                        var19 = var8 * param2 / (var8 + var9) + param3;
                        var18 = var8 * param2 / (var8 + var9) + param3;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param0[0] == null) {
                        break L8;
                      } else {
                        ll.b(param1, param3, var16, var18);
                        param0[0].e(param1, param3);
                        ll.b(bf.field_a);
                        break L8;
                      }
                    }
                    L9: {
                      if (param0[2] == null) {
                        break L9;
                      } else {
                        ll.b(var17, param3, var10, var18);
                        param0[2].e(var13, param3);
                        ll.b(bf.field_a);
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[6] != null) {
                        ll.b(param1, var19, var16, var11);
                        param0[6].e(param1, var15);
                        ll.b(bf.field_a);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[8] != null) {
                        ll.b(var17, var19, var10, var11);
                        param0[8].e(var13, var15);
                        ll.b(bf.field_a);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param0[1] == null) {
                        break L12;
                      } else {
                        if (param0[1].field_s != 0) {
                          ll.b(var16, param3, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              ll.b(bf.field_a);
                              break L12;
                            } else {
                              param0[1].e(var20, param3);
                              var20 = var20 + param0[1].field_s;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (null == param0[7]) {
                        break L14;
                      } else {
                        if (param0[7].field_s != 0) {
                          ll.b(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              ll.b(bf.field_a);
                              break L14;
                            } else {
                              param0[7].e(var20, var15);
                              var20 = var20 + param0[7].field_s;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param0[3]) {
                        break L16;
                      } else {
                        if (param0[3].field_v == 0) {
                          break L16;
                        } else {
                          ll.b(param1, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              ll.b(bf.field_a);
                              break L16;
                            } else {
                              param0[3].e(param1, var20);
                              var20 = var20 + param0[3].field_v;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (null == param0[5]) {
                        break L18;
                      } else {
                        if (param0[5].field_v != 0) {
                          ll.b(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var20 >= var15) {
                              ll.b(bf.field_a);
                              break L18;
                            } else {
                              param0[5].e(var13, var20);
                              var20 = var20 + param0[5].field_v;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param0[param5] == null) {
                        break L20;
                      } else {
                        if (0 == param0[4].field_s) {
                          break L20;
                        } else {
                          if (0 != param0[4].field_v) {
                            ll.b(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                ll.b(bf.field_a);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param0[4].field_v;
                                    continue L21;
                                  } else {
                                    param0[4].e(var21, var20);
                                    var21 = var21 + param0[4].field_s;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
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
            stackOut_75_0 = (RuntimeException) var6;
            stackOut_75_1 = new StringBuilder().append("cl.C(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L23;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L23;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        jf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (jf) (Object) ei.field_m.b(2);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                rd.a(var4, 4, 7);
                var4 = (jf) (Object) ei.field_m.a(10);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "cl.A(" + 7 + ',' + 7 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param2;
            L1: while (true) {
              if (param1 <= var5) {
                var4_int = ~var4_int;
                stackOut_4_0 = var4_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4_int = lj.field_e[(param3[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("cl.B(").append(1).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 250;
    }
}
