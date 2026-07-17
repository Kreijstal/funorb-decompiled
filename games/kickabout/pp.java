/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends lq {
    static String field_k;
    static String field_m;
    private ru field_l;
    tf field_j;
    gq field_i;

    final int d() {
        return 0;
    }

    final lq b() {
        da var1 = null;
        L0: while (true) {
          var1 = (da) (Object) ((pp) this).field_j.c(33);
          if (var1 != null) {
            if (null != var1.field_F) {
              return (lq) (Object) var1.field_F;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final lq c() {
        da var1 = (da) (Object) ((pp) this).field_j.g(24009);
        if (var1 == null) {
            return null;
        }
        if (var1.field_F != null) {
            return (lq) (Object) var1.field_F;
        }
        return ((pp) this).b();
    }

    final void a(int param0) {
        int var2 = 0;
        da var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        ((pp) this).field_i.a(param0);
        var3 = (da) (Object) ((pp) this).field_j.g(24009);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((pp) this).field_l.a(-25102, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_B >= var2) {
                    this.a(var2, var3, (byte) 46);
                    var3.field_B = var3.field_B - var2;
                    break L1;
                  } else {
                    this.a(var3.field_B, var3, (byte) -105);
                    var2 = var2 - var3.field_B;
                    if (((pp) this).field_l.a(-123, var2, 0, var3, (int[]) null)) {
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
            var3 = (da) (Object) ((pp) this).field_j.c(33);
            continue L0;
          }
        }
    }

    private final void a(int param0, da param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ru stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        da stackIn_6_2 = null;
        ru stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        da stackIn_7_2 = null;
        ru stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        da stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ru stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        da stackOut_5_2 = null;
        ru stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        da stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        ru stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        da stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var4_int = 65 / ((-22 - param2) / 49);
              if ((4 & ((pp) this).field_l.field_i[param1.field_q]) == 0) {
                break L1;
              } else {
                if (param1.field_s >= 0) {
                  break L1;
                } else {
                  var5 = ((pp) this).field_l.field_o[param1.field_q] / uh.field_i;
                  var6 = (1048575 - -var5 - param1.field_r) / var5;
                  param1.field_r = param0 * var5 + param1.field_r & 1048575;
                  if (var6 <= param0) {
                    L2: {
                      if (((pp) this).field_l.field_s[param1.field_q] == 0) {
                        param1.field_F = vm.b(param1.field_y, param1.field_F.e(), param1.field_F.m(), param1.field_F.k());
                        break L2;
                      } else {
                        L3: {
                          param1.field_F = vm.b(param1.field_y, param1.field_F.e(), 0, param1.field_F.k());
                          stackOut_5_0 = ((pp) this).field_l;
                          stackOut_5_1 = 0;
                          stackOut_5_2 = (da) param1;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          stackIn_6_2 = stackOut_5_2;
                          if (param1.field_g.field_r[param1.field_e] >= 0) {
                            stackOut_7_0 = (ru) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (da) (Object) stackIn_7_2;
                            stackOut_7_3 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            stackIn_8_3 = stackOut_7_3;
                            break L3;
                          } else {
                            stackOut_6_0 = (ru) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = (da) (Object) stackIn_6_2;
                            stackOut_6_3 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            stackIn_8_3 = stackOut_6_3;
                            break L3;
                          }
                        }
                        ((ru) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2, stackIn_8_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param1.field_g.field_r[param1.field_e]) {
                        param1.field_F.g(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param1.field_r / var5;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param1.field_F.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("pp.A(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        da var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            ((pp) this).field_i.a(param0, param1, param2);
            var6 = (da) (Object) ((pp) this).field_j.g(24009);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((pp) this).field_l.a(-25102, var6)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_B) {
                        this.a(0, var5, var4_int, param0, var6, var5 + var4_int);
                        var6.field_B = var6.field_B - var5;
                        break L2;
                      } else {
                        this.a(0, var6.field_B, var4_int, param0, var6, var5 + var4_int);
                        var4_int = var4_int + var6.field_B;
                        var5 = var5 - var6.field_B;
                        if (((pp) this).field_l.a(-30, var5, var4_int, var6, param0)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (da) (Object) ((pp) this).field_j.c(33);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("pp.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 18267) {
                break L1;
              } else {
                pp.b(-60);
                break L1;
              }
            }
            L2: {
              if (null == wm.field_u) {
                break L2;
              } else {
                wm.field_u.field_L.a(param1, -48);
                break L2;
              }
            }
            L3: {
              if (ki.field_n == null) {
                break L3;
              } else {
                ki.field_n.field_G.a(param1, -71);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("pp.I(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2_int = 0;
        ut var2 = null;
        ut var3 = null;
        ut var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ut var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ut var11 = null;
        ut var12 = null;
        ut var13 = null;
        ut var14 = null;
        ut stackIn_9_0 = null;
        ut stackIn_15_0 = null;
        oh[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        oh stackIn_24_2 = null;
        oh stackIn_24_3 = null;
        oh[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        oh stackIn_25_2 = null;
        oh stackIn_25_3 = null;
        oh[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        oh stackIn_26_2 = null;
        oh stackIn_26_3 = null;
        ut stackIn_26_4 = null;
        oh[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        oh stackIn_27_2 = null;
        oh stackIn_27_3 = null;
        oh[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        oh stackIn_28_2 = null;
        oh stackIn_28_3 = null;
        oh[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        oh stackIn_29_2 = null;
        oh stackIn_29_3 = null;
        ut stackIn_29_4 = null;
        ut stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        ut stackOut_34_0 = null;
        ut stackOut_33_0 = null;
        oh[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        oh stackOut_23_2 = null;
        oh stackOut_23_3 = null;
        oh[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        oh stackOut_25_2 = null;
        oh stackOut_25_3 = null;
        ut stackOut_25_4 = null;
        oh[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        oh stackOut_24_2 = null;
        oh stackOut_24_3 = null;
        ut stackOut_24_4 = null;
        oh[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        oh stackOut_26_2 = null;
        oh stackOut_26_3 = null;
        oh[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        oh stackOut_28_2 = null;
        oh stackOut_28_3 = null;
        ut stackOut_28_4 = null;
        oh[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        oh stackOut_27_2 = null;
        oh stackOut_27_3 = null;
        ut stackOut_27_4 = null;
        ut stackOut_14_0 = null;
        ut stackOut_13_0 = null;
        ut stackOut_8_0 = null;
        ut stackOut_7_0 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                if (0 != rm.field_C) {
                  L2: {
                    if (rm.field_C != 1) {
                      if (rm.field_C != 2) {
                        if (rm.field_C == 3) {
                          oi.field_e = new oh[]{};
                          break L2;
                        } else {
                          break L1;
                        }
                      } else {
                        oi.field_e = new oh[9];
                        oi.field_e[0] = new oh(ng.field_j[0], -345, 132);
                        oi.field_e[1] = new oh(ng.field_j[1], -157, 510);
                        oi.field_e[2] = new oh(ng.field_j[1], -170, 1294);
                        oi.field_e[3] = new oh(ng.field_j[0], -245, 1384);
                        oi.field_e[4] = new oh(ng.field_j[0], 690, -220);
                        oi.field_e[5] = new oh(ng.field_j[1], 1086, 910);
                        oi.field_e[6] = new oh(ng.field_j[0], 920, 1294);
                        oi.field_e[7] = new oh(tm.field_w, -150, 940);
                        oi.field_e[8] = new oh(tm.field_w, 925, 214);
                        break L1;
                      }
                    } else {
                      var13 = bn.field_E[0];
                      var7 = var13;
                      var7 = var13;
                      var2 = bn.field_E[1];
                      var7 = var2;
                      var7 = var2;
                      var14 = bn.field_E[2];
                      var7 = var14;
                      var7 = var14;
                      var4 = bn.field_E[3];
                      var7 = var4;
                      var7 = var4;
                      oi.field_e = new oh[28];
                      var5 = 0;
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= 8) {
                          var6 = 0;
                          L4: while (true) {
                            if (var6 >= 12) {
                              break L2;
                            } else {
                              L5: {
                                if (p.a((byte) -24, 2) == 0) {
                                  stackOut_34_0 = ng.field_j[0];
                                  stackIn_35_0 = stackOut_34_0;
                                  break L5;
                                } else {
                                  stackOut_33_0 = ng.field_j[1];
                                  stackIn_35_0 = stackOut_33_0;
                                  break L5;
                                }
                              }
                              L6: {
                                var7 = stackIn_35_0;
                                var8 = el.a(29430, 50, 130 * var6 + -300);
                                var9 = el.a(29430, 50, -290);
                                if ((1 & var6) == 0) {
                                  var9 += 1674;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              int incrementValue$15 = var5;
                              var5++;
                              oi.field_e[incrementValue$15] = new oh(var7, var8, var9);
                              var6++;
                              continue L4;
                            }
                          }
                        } else {
                          L7: {
                            var7_int = el.a(param0 + 29429, 20, -170);
                            var8 = -50 + var6 / 2 * 400;
                            if ((1 & var6) != 0) {
                              var8 = var8 + el.a(29430, 20, 120);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            int incrementValue$16 = var5;
                            var5++;
                            stackOut_23_0 = oi.field_e;
                            stackOut_23_1 = incrementValue$16;
                            stackOut_23_2 = null;
                            stackOut_23_3 = null;
                            stackIn_25_0 = stackOut_23_0;
                            stackIn_25_1 = stackOut_23_1;
                            stackIn_25_2 = stackOut_23_2;
                            stackIn_25_3 = stackOut_23_3;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            stackIn_24_2 = stackOut_23_2;
                            stackIn_24_3 = stackOut_23_3;
                            if (var6 != 0) {
                              stackOut_25_0 = (oh[]) (Object) stackIn_25_0;
                              stackOut_25_1 = stackIn_25_1;
                              stackOut_25_2 = null;
                              stackOut_25_3 = null;
                              stackOut_25_4 = (ut) var13;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              stackIn_26_2 = stackOut_25_2;
                              stackIn_26_3 = stackOut_25_3;
                              stackIn_26_4 = stackOut_25_4;
                              break L8;
                            } else {
                              stackOut_24_0 = (oh[]) (Object) stackIn_24_0;
                              stackOut_24_1 = stackIn_24_1;
                              stackOut_24_2 = null;
                              stackOut_24_3 = null;
                              stackOut_24_4 = (ut) var2;
                              stackIn_26_0 = stackOut_24_0;
                              stackIn_26_1 = stackOut_24_1;
                              stackIn_26_2 = stackOut_24_2;
                              stackIn_26_3 = stackOut_24_3;
                              stackIn_26_4 = stackOut_24_4;
                              break L8;
                            }
                          }
                          L9: {
                            stackIn_26_0[stackIn_26_1] = new oh(stackIn_26_4, var7_int, var8);
                            int incrementValue$17 = var5;
                            var5++;
                            stackOut_26_0 = oi.field_e;
                            stackOut_26_1 = incrementValue$17;
                            stackOut_26_2 = null;
                            stackOut_26_3 = null;
                            stackIn_28_0 = stackOut_26_0;
                            stackIn_28_1 = stackOut_26_1;
                            stackIn_28_2 = stackOut_26_2;
                            stackIn_28_3 = stackOut_26_3;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            stackIn_27_2 = stackOut_26_2;
                            stackIn_27_3 = stackOut_26_3;
                            if (var6 != 0) {
                              stackOut_28_0 = (oh[]) (Object) stackIn_28_0;
                              stackOut_28_1 = stackIn_28_1;
                              stackOut_28_2 = null;
                              stackOut_28_3 = null;
                              stackOut_28_4 = (ut) var14;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              stackIn_29_2 = stackOut_28_2;
                              stackIn_29_3 = stackOut_28_3;
                              stackIn_29_4 = stackOut_28_4;
                              break L9;
                            } else {
                              stackOut_27_0 = (oh[]) (Object) stackIn_27_0;
                              stackOut_27_1 = stackIn_27_1;
                              stackOut_27_2 = null;
                              stackOut_27_3 = null;
                              stackOut_27_4 = (ut) var4;
                              stackIn_29_0 = stackOut_27_0;
                              stackIn_29_1 = stackOut_27_1;
                              stackIn_29_2 = stackOut_27_2;
                              stackIn_29_3 = stackOut_27_3;
                              stackIn_29_4 = stackOut_27_4;
                              break L9;
                            }
                          }
                          stackIn_29_0[stackIn_29_1] = new oh(stackIn_29_4, 896 - var7_int + -20, var8);
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                  break L1;
                } else {
                  oi.field_e = new oh[34];
                  var1_int = 0;
                  int incrementValue$18 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$18] = new oh(ao.field_c, -100, -100);
                  int incrementValue$19 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$19] = new oh(pi.field_a, 60, -180);
                  int incrementValue$20 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$20] = new oh(ng.field_j[0], 280, -280);
                  int incrementValue$21 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$21] = new oh(ao.field_c, -190, 1184);
                  int incrementValue$22 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$22] = new oh(pi.field_a, -280, 994);
                  int incrementValue$23 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$23] = new oh(pi.field_a, -160, 1047);
                  int incrementValue$24 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$24] = new oh(ng.field_j[0], 660, -260);
                  int incrementValue$25 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$25] = new oh(ng.field_j[1], 800, -240);
                  var2_int = 0;
                  L10: while (true) {
                    if (var2_int >= 8) {
                      var2_int = 0;
                      L11: while (true) {
                        if (var2_int >= 16) {
                          int incrementValue$26 = var1_int;
                          var1_int++;
                          oi.field_e[incrementValue$26] = new oh(ng.field_j[0], 650, 1354);
                          int incrementValue$27 = var1_int;
                          var1_int++;
                          oi.field_e[incrementValue$27] = new oh(ng.field_j[1], 800, 1364);
                          break L1;
                        } else {
                          L12: {
                            if (p.a((byte) -24, 2) != 1) {
                              stackOut_14_0 = ng.field_j[1];
                              stackIn_15_0 = stackOut_14_0;
                              break L12;
                            } else {
                              stackOut_13_0 = ng.field_j[0];
                              stackIn_15_0 = stackOut_13_0;
                              break L12;
                            }
                          }
                          var12 = stackIn_15_0;
                          var7 = var12;
                          var7 = var12;
                          var3 = var12;
                          var4_int = el.a(29430, 70, 976);
                          var5 = el.a(29430, 1, -200 + 100 * var2_int);
                          int incrementValue$28 = var1_int;
                          var1_int++;
                          oi.field_e[incrementValue$28] = new oh(var12, var4_int, var5);
                          var2_int++;
                          continue L11;
                        }
                      }
                    } else {
                      L13: {
                        if (p.a((byte) -24, 2) == 1) {
                          stackOut_8_0 = ng.field_j[0];
                          stackIn_9_0 = stackOut_8_0;
                          break L13;
                        } else {
                          stackOut_7_0 = ng.field_j[1];
                          stackIn_9_0 = stackOut_7_0;
                          break L13;
                        }
                      }
                      var11 = stackIn_9_0;
                      var13 = var11;
                      var7 = var13;
                      var13 = var11;
                      var3 = var11;
                      var4_int = el.a(29430, 70, -220);
                      var5 = el.a(29430, 10, var2_int * 110 + -20);
                      int incrementValue$29 = var1_int;
                      var1_int++;
                      oi.field_e[incrementValue$29] = new oh(var11, var4_int, var5);
                      var2_int++;
                      continue L10;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "pp.H(" + param0 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int[] param3, da param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vm var11 = null;
        int var12 = 0;
        ru stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        da stackIn_10_2 = null;
        ru stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        da stackIn_11_2 = null;
        ru stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        da stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        ru stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        da stackOut_9_2 = null;
        ru stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        da stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        ru stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        da stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if ((((pp) this).field_l.field_i[param4.field_q] & 4) == param0) {
                break L1;
              } else {
                if (0 <= param4.field_s) {
                  break L1;
                } else {
                  var7_int = ((pp) this).field_l.field_o[param4.field_q] / uh.field_i;
                  L2: while (true) {
                    var8 = (var7_int + 1048575 - param4.field_r) / var7_int;
                    if (param1 < var8) {
                      param4.field_r = param4.field_r + param1 * var7_int;
                      break L1;
                    } else {
                      L3: {
                        param4.field_F.a(param3, param2, var8);
                        param1 = param1 - var8;
                        param4.field_r = param4.field_r + (var7_int * var8 - 1048576);
                        param2 = param2 + var8;
                        var9 = uh.field_i / 100;
                        var10 = 262144 / var7_int;
                        if (var9 <= var10) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param4.field_F;
                        if (((pp) this).field_l.field_s[param4.field_q] != 0) {
                          L5: {
                            param4.field_F = vm.b(param4.field_y, var11.e(), 0, var11.k());
                            stackOut_9_0 = ((pp) this).field_l;
                            stackOut_9_1 = 0;
                            stackOut_9_2 = (da) param4;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            if (0 <= param4.field_g.field_r[param4.field_e]) {
                              stackOut_11_0 = (ru) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = (da) (Object) stackIn_11_2;
                              stackOut_11_3 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              stackIn_12_3 = stackOut_11_3;
                              break L5;
                            } else {
                              stackOut_10_0 = (ru) (Object) stackIn_10_0;
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = (da) (Object) stackIn_10_2;
                              stackOut_10_3 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              stackIn_12_3 = stackOut_10_3;
                              break L5;
                            }
                          }
                          ((ru) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2, stackIn_12_3 != 0);
                          param4.field_F.c(var9, var11.m());
                          break L4;
                        } else {
                          param4.field_F = vm.b(param4.field_y, var11.e(), var11.m(), var11.k());
                          break L4;
                        }
                      }
                      L6: {
                        if (param4.field_g.field_r[param4.field_e] < 0) {
                          param4.field_F.g(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.e(var9);
                      var11.a(param3, param2, -param2 + param5);
                      if (!var11.n()) {
                        continue L2;
                      } else {
                        ((pp) this).field_i.a((lq) (Object) var11);
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            param4.field_F.a(param3, param2, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("pp.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param5 + 41);
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_k = null;
    }

    pp(ru param0) {
        ((pp) this).field_j = new tf();
        ((pp) this).field_i = new gq();
        try {
            ((pp) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pp.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "click to";
        field_m = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
