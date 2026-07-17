/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends nc {
    static String field_l;
    static int[] field_m;
    static String field_o;
    static th field_n;

    public static void e() {
        field_o = null;
        field_n = null;
        field_l = null;
        field_m = null;
    }

    private final void a(int param0, int param1, fm param2, int param3, String param4, int param5, int param6, int param7, boolean param8, int param9, int param10) {
        int var12_int = 0;
        RuntimeException var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var12_int = param6 + param10 + param7;
              if (0 != var12_int) {
                param10 = (var12_int + param10 * 200) / (var12_int * 2);
                param6 = (200 * param6 + var12_int) / (var12_int * 2);
                param7 = (var12_int + param7 * 200) / (var12_int * 2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                param2.a(param1 + 1 + ". ", 60, param9, param5, 0);
                break L2;
              }
            }
            L3: {
              if ((param1 & 1) != 0) {
                break L3;
              } else {
                oo.f(30, 3 + param9, 580, 1 + (param2.field_r + param2.field_C), 0, 64);
                break L3;
              }
            }
            L4: {
              var14 = fm.a(param2, param4, 200);
              param2.c(var14, 60, param9, param5, 0);
              var15 = Integer.toString(param0);
              param2.b(var15, nq.field_q[1], param9, param5, 0);
              if (var12_int >= 500) {
                stackOut_9_0 = "500+";
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = Integer.toString(var12_int);
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            var16 = stackIn_10_0;
            var13 = var16;
            param2.b(var16, nq.field_q[2], param9, param5, 0);
            var17 = param10 + "%";
            param2.b(var17, nq.field_q[3], param9, param5, 0);
            var18 = param7 + "%";
            param2.b(var18, nq.field_q[4], param9, param5, 0);
            var19 = param6 + "%";
            param2.b(var19, nq.field_q[5], param9, param5, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("fk.E(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + 0 + 44 + param9 + 44 + param10 + 41);
        }
    }

    final void a(boolean param0) {
        sl var2 = null;
        int var3 = 0;
        String var4 = null;
        ef var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        String[] var17 = null;
        String var18 = null;
        String[] var19 = null;
        String var20 = null;
        String var21 = null;
        String[] var24 = null;
        String var25 = null;
        String var26 = null;
        int stackIn_14_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        var2 = ah.field_e;
        var3 = ((fm) (Object) var2).field_C + ((fm) (Object) var2).field_r;
        if (mc.field_i == null) {
          if (!wc.j(114)) {
            int discarded$11 = 10;
            int discarded$12 = 0;
            int discarded$13 = 7;
            int discarded$14 = 117;
            mc.field_i = qm.b();
            if (!wc.j(111)) {
              if (mc.field_i.field_j) {
                if (mc.field_i.field_t != null) {
                  var5 = pb.field_e;
                  var6 = ((fm) (Object) var5).field_r + ((fm) (Object) var5).field_C - -1;
                  var7 = var6 + 150;
                  var8 = 16777215;
                  var9 = 0;
                  oo.f(30, var7 + -35, 580, ((fm) (Object) var2).field_C + (((fm) (Object) var2).field_r - -1), 0, 64);
                  var10 = 11;
                  oo.f(30, -35 + var7, 186, 225, 0, 64);
                  oo.f(nq.field_q[2] + -58, -35 + var7, 111, 225, 0, 64);
                  oo.f(-32 + nq.field_q[4], var7 + -35, 65, 225, 0, 64);
                  ah.field_e.b(gn.field_C, nq.field_q[0], var7, var10, 1);
                  ah.field_e.b(ub.field_tb, nq.field_q[1], var7, var10, 1);
                  ah.field_e.b(ke.field_e, nq.field_q[2], var7, var10, 1);
                  ah.field_e.b("%W", nq.field_q[3], var7, var10, 1);
                  ah.field_e.b("%L", nq.field_q[4], var7, var10, 1);
                  ah.field_e.b("%D", nq.field_q[5], var7, var10, 1);
                  ak.a(586, 231, -5, 27, var7 - 38);
                  var7 = var7 + (4 + var6);
                  var4 = gb.field_d;
                  var24 = mc.field_i.field_t[sd.field_F];
                  var11 = var24;
                  var12 = mc.field_i.field_k[sd.field_F];
                  var13 = 0;
                  var14 = 0;
                  L0: while (true) {
                    if (var14 >= 10) {
                      if (var13 == 0) {
                        var8 = 16777215;
                        var7 += 4;
                        this.a(mc.field_i.field_l, -1, (fm) (Object) var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                        int discarded$15 = ((fm) (Object) var2).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                        return;
                      } else {
                        int discarded$16 = ((fm) (Object) var2).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                        return;
                      }
                    } else {
                      L1: {
                        var25 = var24[var14];
                        if (var25 != null) {
                          L2: {
                            if (!sf.a(1, var25)) {
                              L3: {
                                if ((var14 & 1) != 0) {
                                  stackOut_59_0 = 4246528;
                                  stackIn_60_0 = stackOut_59_0;
                                  break L3;
                                } else {
                                  stackOut_58_0 = 16776992;
                                  stackIn_60_0 = stackOut_58_0;
                                  break L3;
                                }
                              }
                              var8 = stackIn_60_0;
                              break L2;
                            } else {
                              var8 = 16728064;
                              var13 = 1;
                              break L2;
                            }
                          }
                          var4 = "";
                          this.a(var12[var14 * 4], var14, (fm) (Object) var5, var9, var25, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      var7 = var7 + var6;
                      var14++;
                      continue L0;
                    }
                  }
                } else {
                  var21 = hk.field_g;
                  int discarded$17 = ((fm) (Object) var2).a(var21, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                  return;
                }
              } else {
                var26 = op.field_l;
                int discarded$18 = ((fm) (Object) var2).a(var26, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                return;
              }
            } else {
              var4 = fq.field_j;
              int discarded$19 = ((fm) (Object) var2).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
              return;
            }
          } else {
            L4: {
              if (wc.j(111)) {
                var4 = fq.field_j;
                break L4;
              } else {
                if (!mc.field_i.field_j) {
                  var4 = op.field_l;
                  break L4;
                } else {
                  if (mc.field_i.field_t != null) {
                    var5 = pb.field_e;
                    var6 = ((fm) (Object) var5).field_r + ((fm) (Object) var5).field_C - -1;
                    var7 = var6 + 150;
                    var8 = 16777215;
                    var9 = 0;
                    oo.f(30, var7 + -35, 580, ((fm) (Object) var2).field_C + (((fm) (Object) var2).field_r - -1), 0, 64);
                    var10 = 11;
                    oo.f(30, -35 + var7, 186, 225, 0, 64);
                    oo.f(nq.field_q[2] + -58, -35 + var7, 111, 225, 0, 64);
                    oo.f(-32 + nq.field_q[4], var7 + -35, 65, 225, 0, 64);
                    ah.field_e.b(gn.field_C, nq.field_q[0], var7, var10, 1);
                    ah.field_e.b(ub.field_tb, nq.field_q[1], var7, var10, 1);
                    ah.field_e.b(ke.field_e, nq.field_q[2], var7, var10, 1);
                    ah.field_e.b("%W", nq.field_q[3], var7, var10, 1);
                    ah.field_e.b("%L", nq.field_q[4], var7, var10, 1);
                    ah.field_e.b("%D", nq.field_q[5], var7, var10, 1);
                    ak.a(586, 231, -5, 27, var7 - 38);
                    var7 = var7 + (4 + var6);
                    var4 = gb.field_d;
                    var19 = mc.field_i.field_t[sd.field_F];
                    var11 = var19;
                    var12 = mc.field_i.field_k[sd.field_F];
                    var13 = 0;
                    var14 = 0;
                    L5: while (true) {
                      if (var14 >= 10) {
                        if (var13 != 0) {
                          break L4;
                        } else {
                          var8 = 16777215;
                          var7 += 4;
                          this.a(mc.field_i.field_l, -1, (fm) (Object) var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                          break L4;
                        }
                      } else {
                        L6: {
                          var20 = var19[var14];
                          if (var20 != null) {
                            L7: {
                              if (!sf.a(1, var20)) {
                                L8: {
                                  if ((var14 & 1) != 0) {
                                    stackOut_35_0 = 4246528;
                                    stackIn_36_0 = stackOut_35_0;
                                    break L8;
                                  } else {
                                    stackOut_34_0 = 16776992;
                                    stackIn_36_0 = stackOut_34_0;
                                    break L8;
                                  }
                                }
                                var8 = stackIn_36_0;
                                break L7;
                              } else {
                                var8 = 16728064;
                                var13 = 1;
                                break L7;
                              }
                            }
                            var4 = "";
                            this.a(var12[var14 * 4], var14, (fm) (Object) var5, var9, var20, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var7 = var7 + var6;
                        var14++;
                        continue L5;
                      }
                    }
                  } else {
                    var4 = hk.field_g;
                    break L4;
                  }
                }
              }
            }
            int discarded$20 = ((fm) (Object) var2).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
            return;
          }
        } else {
          L9: {
            if (wc.j(111)) {
              var4 = fq.field_j;
              break L9;
            } else {
              if (!mc.field_i.field_j) {
                var4 = op.field_l;
                break L9;
              } else {
                if (mc.field_i.field_t != null) {
                  var5 = pb.field_e;
                  var6 = ((fm) (Object) var5).field_r + ((fm) (Object) var5).field_C - -1;
                  var7 = var6 + 150;
                  var8 = 16777215;
                  var9 = 0;
                  oo.f(30, var7 + -35, 580, ((fm) (Object) var2).field_C + (((fm) (Object) var2).field_r - -1), 0, 64);
                  var10 = 11;
                  oo.f(30, -35 + var7, 186, 225, 0, 64);
                  oo.f(nq.field_q[2] + -58, -35 + var7, 111, 225, 0, 64);
                  oo.f(-32 + nq.field_q[4], var7 + -35, 65, 225, 0, 64);
                  ah.field_e.b(gn.field_C, nq.field_q[0], var7, var10, 1);
                  ah.field_e.b(ub.field_tb, nq.field_q[1], var7, var10, 1);
                  ah.field_e.b(ke.field_e, nq.field_q[2], var7, var10, 1);
                  ah.field_e.b("%W", nq.field_q[3], var7, var10, 1);
                  ah.field_e.b("%L", nq.field_q[4], var7, var10, 1);
                  ah.field_e.b("%D", nq.field_q[5], var7, var10, 1);
                  ak.a(586, 231, -5, 27, var7 - 38);
                  var7 = var7 + (4 + var6);
                  var4 = gb.field_d;
                  var17 = mc.field_i.field_t[sd.field_F];
                  var12 = mc.field_i.field_k[sd.field_F];
                  var13 = 0;
                  var14 = 0;
                  L10: while (true) {
                    if (var14 >= 10) {
                      if (var13 != 0) {
                        break L9;
                      } else {
                        var8 = 16777215;
                        var7 += 4;
                        this.a(mc.field_i.field_l, -1, (fm) (Object) var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                        break L9;
                      }
                    } else {
                      L11: {
                        var18 = var17[var14];
                        if (var18 != null) {
                          L12: {
                            if (!sf.a(1, var18)) {
                              L13: {
                                if ((var14 & 1) != 0) {
                                  stackOut_13_0 = 4246528;
                                  stackIn_14_0 = stackOut_13_0;
                                  break L13;
                                } else {
                                  stackOut_12_0 = 16776992;
                                  stackIn_14_0 = stackOut_12_0;
                                  break L13;
                                }
                              }
                              var8 = stackIn_14_0;
                              break L12;
                            } else {
                              var8 = 16728064;
                              var13 = 1;
                              break L12;
                            }
                          }
                          var4 = "";
                          this.a(var12[var14 * 4], var14, (fm) (Object) var5, var9, var18, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var7 = var7 + var6;
                      var14++;
                      continue L10;
                    }
                  }
                } else {
                  var4 = hk.field_g;
                  break L9;
                }
              }
            }
          }
          int discarded$21 = ((fm) (Object) var2).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
    }

    private final int c(byte param0, int param1) {
        String var3 = we.field_g[((fk) this).field_j[param1]];
        return 20 + ah.field_e.a(var3);
    }

    final int d(int param0, int param1) {
        ((fk) this).field_i = 50;
        if (param0 >= -65) {
            field_l = null;
            ((fk) this).field_a = -((fk) this).field_i + 640;
            if (wc.j(91)) {
                if (param1 == 0) {
                    return 450;
                }
                return 640;
            }
            if (param1 >= 2) {
                if (param1 == 0) {
                    return 450;
                }
                return 640;
            }
            if (param1 != 0) {
                return ((fk) this).field_a;
            }
            return ((fk) this).field_i - -this.c((byte) -95, 0);
        }
        ((fk) this).field_a = -((fk) this).field_i + 640;
        if (wc.j(91)) {
            if (param1 == 0) {
                return 450;
            }
            return 640;
        }
        if (param1 >= 2) {
            if (param1 == 0) {
                return 450;
            }
            return 640;
        }
        if (param1 != 0) {
            return ((fk) this).field_a;
        }
        return ((fk) this).field_i - -this.c((byte) -95, 0);
    }

    fk(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final static void a(int param0, int param1, boolean param2, ja[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
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
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param1 <= 0) {
                  break L1;
                } else {
                  var5_int = param3[0].field_z;
                  var6 = param3[2].field_z;
                  var7 = param3[1].field_z;
                  param3[0].g(param0, param4);
                  param3[2].g(-var6 + (param1 + param0), param4);
                  oo.a(ki.field_d);
                  oo.e(var5_int + param0, param4, -var6 + param0 + param1, param4 + param3[1].field_u);
                  var8 = var5_int + param0;
                  var9 = param0 - -param1 + -var6;
                  param0 = var8;
                  L2: while (true) {
                    if (param0 >= var9) {
                      L3: {
                        oo.b(ki.field_d);
                        if (param2) {
                          break L3;
                        } else {
                          var11 = null;
                          fk.a((ug) null, false);
                          break L3;
                        }
                      }
                      break L0;
                    } else {
                      param3[1].g(param0, param4);
                      param0 = param0 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fk.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
    }

    final static void a(ug param0, boolean param1) {
        try {
            ih.a(param1, 256, param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "fk.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int a(byte param0, int param1) {
        ((fk) this).field_i = 50;
        if (param0 == -118) {
          ((fk) this).field_a = -((fk) this).field_i + 640;
          if (wc.j(96)) {
            if (param1 != 0) {
              return 450;
            } else {
              return 0;
            }
          } else {
            if (param1 < 2) {
              if (0 != param1) {
                return ((fk) this).field_a - this.c((byte) -95, 1);
              } else {
                return ((fk) this).field_i;
              }
            } else {
              if (param1 != 0) {
                return 450;
              } else {
                return 0;
              }
            }
          }
        } else {
          field_o = null;
          ((fk) this).field_a = -((fk) this).field_i + 640;
          if (!wc.j(96)) {
            if (param1 < 2) {
              if (0 != param1) {
                return ((fk) this).field_a - this.c((byte) -95, 1);
              } else {
                return ((fk) this).field_i;
              }
            } else {
              if (param1 != 0) {
                return 450;
              } else {
                return 0;
              }
            }
          } else {
            if (param1 != 0) {
              return 450;
            } else {
              return 0;
            }
          }
        }
    }

    final void b(byte param0) {
        if (param0 != 69) {
            field_l = null;
            mc.field_i = null;
            return;
        }
        mc.field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
        field_o = "Starve them.";
        field_l = "Deadly";
        field_n = new th();
    }
}
