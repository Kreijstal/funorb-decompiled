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
        da var1;
        L0: while (true) {
          var1 = (da) ((Object) this.field_j.c(33));
          if (var1 != null) {
            if (null != var1.field_F) {
              return (lq) ((Object) var1.field_F);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final lq c() {
        da var1 = (da) ((Object) this.field_j.g(24009));
        if (var1 == null) {
            return null;
        }
        if (var1.field_F != null) {
            return (lq) ((Object) var1.field_F);
        }
        return this.b();
    }

    final void a(int param0) {
        int var2;
        da var3;
        int var4;
        boolean stackIn_3_0 = false;
        var4 = Kickabout.field_G;
        this.field_i.a(param0);
        var3 = (da) ((Object) this.field_j.g(24009));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            stackIn_3_0 = this.field_l.a(-25102, var3);
            L1: {
              if (!stackIn_3_0) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_B >= var2) {
                    this.a(var2, var3, (byte) 46);
                    var3.field_B = var3.field_B - var2;
                    break L1;
                  } else {
                    this.a(var3.field_B, var3, (byte) -105);
                    var2 = var2 - var3.field_B;
                    if (this.field_l.a(-123, var2, 0, var3, (int[]) null)) {
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
            var3 = (da) ((Object) this.field_j.c(33));
            continue L0;
          }
        }
    }

    private final void a(int param0, da param1, byte param2) {
        ru stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        da stackIn_7_2 = null;
        ru stackIn_8_0;
        int stackIn_8_1;
        da stackIn_8_2;
        int stackIn_8_3;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              var4_int = 65 / ((-22 - param2) / 49);
              if ((4 & this.field_l.field_i[param1.field_q]) == 0) {
                break L1;
              } else {
                if (param1.field_s >= 0) {
                  break L1;
                } else {
                  var5 = this.field_l.field_o[param1.field_q] / uh.field_i;
                  var6 = (1048575 - -var5 - param1.field_r) / var5;
                  param1.field_r = param0 * var5 + param1.field_r & 1048575;
                  if (var6 <= param0) {
                    L2: {
                      if (this.field_l.field_s[param1.field_q] == 0) {
                        param1.field_F = vm.b(param1.field_y, param1.field_F.e(), param1.field_F.m(), param1.field_F.k());
                        break L2;
                      } else {
                        L3: {
                          param1.field_F = vm.b(param1.field_y, param1.field_F.e(), 0, param1.field_F.k());
                          stackIn_7_0 = this.field_l;

                          stackIn_7_1 = 0;

                          stackIn_7_2 = (da) (param1);

                          if (-1 >= (param1.field_g.field_r[param1.field_e] ^ -1)) {
                            stackIn_8_0 = (ru) ((Object) stackIn_7_0);
                            stackIn_8_1 = stackIn_7_1;
                            stackIn_8_2 = (da) ((Object) stackIn_7_2);
                            stackIn_8_3 = 0;
                            break L3;
                          } else {
                            stackIn_8_0 = (ru) ((Object) stackIn_7_0);
                            stackIn_8_1 = stackIn_7_1;
                            stackIn_8_2 = (da) ((Object) stackIn_7_2);
                            stackIn_8_3 = 1;
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
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("pp.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        da var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            this.field_i.a(param0, param1, param2);
            var6 = (da) ((Object) this.field_j.g(24009));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_l.a(-25102, var6);
                L2: {
                  if (!stackIn_4_0) {
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
                        if (this.field_l.a(-30, var5, var4_int, var6, param0)) {
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
                var6 = (da) ((Object) this.field_j.c(33));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("pp.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("pp.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void b(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        ut stackIn_9_0 = null;
        ut stackIn_15_0 = null;
        oh[] stackIn_25_0;
        int stackIn_25_1;
        oh stackIn_25_2;
        oh stackIn_25_3;
        oh[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        oh stackIn_26_2 = null;
        oh stackIn_26_3 = null;
        ut stackIn_26_4 = null;
        oh[] stackIn_28_0;
        int stackIn_28_1;
        oh stackIn_28_2;
        oh stackIn_28_3;
        oh[] stackIn_29_0;
        int stackIn_29_1;
        oh stackIn_29_2;
        oh stackIn_29_3;
        ut stackIn_29_4;
        ut stackIn_35_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        ut var2 = null;
        int var2_int = 0;
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
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                if (0 != rm.field_C) {
                  L2: {
                    if ((rm.field_C ^ -1) != -2) {
                      if (-3 != (rm.field_C ^ -1)) {
                        if (-4 == (rm.field_C ^ -1)) {
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
                                  stackIn_35_0 = ng.field_j[0];
                                  break L5;
                                } else {
                                  stackIn_35_0 = ng.field_j[1];
                                  break L5;
                                }
                              }
                              L6: {
                                var7 = stackIn_35_0;
                                var8 = el.a(29430, 50, 130 * var6 + -300);
                                var9 = el.a(29430, 50, -290);
                                if (-1 == (1 & var6 ^ -1)) {
                                  var9 += 1674;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              incrementValue$0 = var5;
                              var5++;
                              oi.field_e[incrementValue$0] = new oh(var7, var8, var9);
                              var6++;
                              continue L4;
                            }
                          }
                        } else {
                          L7: {
                            var7_int = el.a(param0 + 29429, 20, -170);
                            var8 = -50 + var6 / 2 * 400;
                            if ((1 & var6 ^ -1) != -1) {
                              var8 = var8 + el.a(29430, 20, 120);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            incrementValue$1 = var5;
                            var5++;
                            stackIn_25_0 = oi.field_e;

                            stackIn_25_1 = incrementValue$1;

                            stackIn_25_2 = null;

                            stackIn_25_3 = null;

                            if (-1 != (var6 ^ -1)) {
                              stackIn_26_0 = (oh[]) ((Object) stackIn_25_0);
                              stackIn_26_1 = stackIn_25_1;
                              stackIn_26_2 = null;
                              stackIn_26_3 = null;
                              stackIn_26_4 = (ut) (var13);
                              break L8;
                            } else {
                              stackIn_26_0 = (oh[]) ((Object) stackIn_25_0);
                              stackIn_26_1 = stackIn_25_1;
                              stackIn_26_2 = null;
                              stackIn_26_3 = null;
                              stackIn_26_4 = (ut) (var2);
                              break L8;
                            }
                          }
                          L9: {
                            stackIn_26_0[stackIn_26_1] = new oh(stackIn_26_4, var7_int, var8);
                            incrementValue$2 = var5;
                            var5++;
                            stackIn_28_0 = oi.field_e;

                            stackIn_28_1 = incrementValue$2;

                            stackIn_28_2 = null;

                            stackIn_28_3 = null;

                            if (-1 != (var6 ^ -1)) {
                              stackIn_29_0 = (oh[]) ((Object) stackIn_28_0);
                              stackIn_29_1 = stackIn_28_1;
                              stackIn_29_2 = null;
                              stackIn_29_3 = null;
                              stackIn_29_4 = (ut) (var14);
                              break L9;
                            } else {
                              stackIn_29_0 = (oh[]) ((Object) stackIn_28_0);
                              stackIn_29_1 = stackIn_28_1;
                              stackIn_29_2 = null;
                              stackIn_29_3 = null;
                              stackIn_29_4 = (ut) (var4);
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
                  incrementValue$3 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$3] = new oh(ao.field_c, -100, -100);
                  incrementValue$4 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$4] = new oh(pi.field_a, 60, -180);
                  incrementValue$5 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$5] = new oh(ng.field_j[0], 280, -280);
                  incrementValue$6 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$6] = new oh(ao.field_c, -190, 1184);
                  incrementValue$7 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$7] = new oh(pi.field_a, -280, 994);
                  incrementValue$8 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$8] = new oh(pi.field_a, -160, 1047);
                  incrementValue$9 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$9] = new oh(ng.field_j[0], 660, -260);
                  incrementValue$10 = var1_int;
                  var1_int++;
                  oi.field_e[incrementValue$10] = new oh(ng.field_j[1], 800, -240);
                  var2_int = 0;
                  L10: while (true) {
                    if (var2_int >= 8) {
                      var2_int = 0;
                      L11: while (true) {
                        if (-17 >= (var2_int ^ -1)) {
                          incrementValue$11 = var1_int;
                          var1_int++;
                          oi.field_e[incrementValue$11] = new oh(ng.field_j[0], 650, 1354);
                          incrementValue$12 = var1_int;
                          var1_int++;
                          oi.field_e[incrementValue$12] = new oh(ng.field_j[1], 800, 1364);
                          break L1;
                        } else {
                          L12: {
                            if ((p.a((byte) -24, 2) ^ -1) != -2) {
                              stackIn_15_0 = ng.field_j[1];
                              break L12;
                            } else {
                              stackIn_15_0 = ng.field_j[0];
                              break L12;
                            }
                          }
                          var12 = stackIn_15_0;
                          var7 = var12;
                          var7 = var12;
                          var3 = var12;
                          var4_int = el.a(29430, 70, 976);
                          var5 = el.a(29430, 1, -200 + 100 * var2_int);
                          incrementValue$13 = var1_int;
                          var1_int++;
                          oi.field_e[incrementValue$13] = new oh(var12, var4_int, var5);
                          var2_int++;
                          continue L11;
                        }
                      }
                    } else {
                      L13: {
                        if ((p.a((byte) -24, 2) ^ -1) == -2) {
                          stackIn_9_0 = ng.field_j[0];
                          break L13;
                        } else {
                          stackIn_9_0 = ng.field_j[1];
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
                      incrementValue$14 = var1_int;
                      var1_int++;
                      oi.field_e[incrementValue$14] = new oh(var11, var4_int, var5);
                      var2_int++;
                      continue L10;
                    }
                  }
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
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "pp.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int[] param3, da param4, int param5) {
        ru stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        da stackIn_11_2 = null;
        ru stackIn_12_0;
        int stackIn_12_1;
        da stackIn_12_2;
        int stackIn_12_3;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vm var11 = null;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if ((this.field_l.field_i[param4.field_q] & 4) == param0) {
                break L1;
              } else {
                if (0 <= param4.field_s) {
                  break L1;
                } else {
                  var7_int = this.field_l.field_o[param4.field_q] / uh.field_i;
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
                        if (this.field_l.field_s[param4.field_q] != 0) {
                          L5: {
                            param4.field_F = vm.b(param4.field_y, var11.e(), 0, var11.k());
                            stackIn_11_0 = this.field_l;

                            stackIn_11_1 = 0;

                            stackIn_11_2 = (da) (param4);

                            if (0 <= param4.field_g.field_r[param4.field_e]) {
                              stackIn_12_0 = (ru) ((Object) stackIn_11_0);
                              stackIn_12_1 = stackIn_11_1;
                              stackIn_12_2 = (da) ((Object) stackIn_11_2);
                              stackIn_12_3 = 0;
                              break L5;
                            } else {
                              stackIn_12_0 = (ru) ((Object) stackIn_11_0);
                              stackIn_12_1 = stackIn_11_1;
                              stackIn_12_2 = (da) ((Object) stackIn_11_2);
                              stackIn_12_3 = 1;
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
                        this.field_i.a(var11);
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
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("pp.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_k = null;
        if (param0) {
            field_k = (String) null;
        }
    }

    pp(ru param0) {
        this.field_j = new tf();
        this.field_i = new gq();
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "pp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "click to";
        field_m = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
