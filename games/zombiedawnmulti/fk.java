/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends nc {
    static String field_l;
    static int[] field_m;
    static String field_o;
    static th field_n;

    public static void e(int param0) {
        field_o = null;
        field_n = null;
        field_l = null;
        field_m = null;
        if (param0 != 225) {
            field_l = (String) null;
        }
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                param2.a(param1 + 1 + ". ", 60, param9, param5, param3);
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
              param2.c(var14, 60, param9, param5, param3);
              var15 = Integer.toString(param0);
              param2.b(var15, nq.field_q[1], param9, param5, param3);
              if (-501 >= (var12_int ^ -1)) {
                stackOut_9_0 = "500+";
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = Integer.toString(var12_int);
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            L5: {
              var16 = stackIn_10_0;
              var13 = var16;
              param2.b(var16, nq.field_q[2], param9, param5, param3);
              var17 = param10 + "%";
              if (!param8) {
                break L5;
              } else {
                fk.e(53);
                break L5;
              }
            }
            param2.b(var17, nq.field_q[3], param9, param5, param3);
            var18 = param7 + "%";
            param2.b(var18, nq.field_q[4], param9, param5, param3);
            var19 = param6 + "%";
            param2.b(var19, nq.field_q[5], param9, param5, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var12 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var12);
            stackOut_14_1 = new StringBuilder().append("fk.E(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final void a(boolean param0) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
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
        String var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String var18 = null;
        String[] var19 = null;
        String var20 = null;
        String var21 = null;
        String[] var22 = null;
        int stackIn_15_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        var2 = ah.field_e;
        var3 = ((fm) ((Object) var2)).field_C + ((fm) ((Object) var2)).field_r;
        if (mc.field_i == null) {
          if (!wc.j(114)) {
            mc.field_i = qm.b(117, 7, 0, 10);
            if (!wc.j(111)) {
              if (mc.field_i.field_j) {
                L0: {
                  if (mc.field_i.field_t != null) {
                    break L0;
                  } else {
                    var21 = hk.field_g;
                    if (var16 != 0) {
                      break L0;
                    } else {
                      discarded$7 = ((fm) ((Object) var2)).a(var21, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                      return;
                    }
                  }
                }
                var5 = pb.field_e;
                var6 = ((fm) ((Object) var5)).field_r + ((fm) ((Object) var5)).field_C - -1;
                var7 = var6 + 150;
                var8 = 16777215;
                var9 = 0;
                oo.f(30, var7 + -35, 580, ((fm) ((Object) var2)).field_C + (((fm) ((Object) var2)).field_r - -1), 0, 64);
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
                var22 = mc.field_i.field_t[sd.field_F];
                var11 = var22;
                var12 = mc.field_i.field_k[sd.field_F];
                var13 = 0;
                var14 = 0;
                L1: while (true) {
                  if (-11 < (var14 ^ -1)) {
                    var15 = var22[var14];
                    var4 = var15;
                    var15 = var4;
                    if (var16 == 0) {
                      L2: {
                        if (var15 != null) {
                          L3: {
                            L4: {
                              if (!sf.a(1, var15)) {
                                break L4;
                              } else {
                                var8 = 16728064;
                                var13 = 1;
                                if (var16 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              if ((var14 & 1) != 0) {
                                stackOut_74_0 = 4246528;
                                stackIn_75_0 = stackOut_74_0;
                                break L5;
                              } else {
                                stackOut_73_0 = 16776992;
                                stackIn_75_0 = stackOut_73_0;
                                break L5;
                              }
                            }
                            var8 = stackIn_75_0;
                            break L3;
                          }
                          var4 = "";
                          this.a(var12[var14 * 4], var14, var5, var9, var15, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var7 + var6;
                      var14++;
                      continue L1;
                    } else {
                      var4 = op.field_l;
                      var4 = fq.field_j;
                      var15 = var4;
                      var15 = var4;
                      discarded$8 = ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                      return;
                    }
                  } else {
                    L6: {
                      if (var13 != 0) {
                        break L6;
                      } else {
                        var8 = 16777215;
                        var7 += 4;
                        this.a(mc.field_i.field_l, -1, var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                        break L6;
                      }
                    }
                    L7: {
                      if (var16 == 0) {
                        break L7;
                      } else {
                        var4 = op.field_l;
                        var4 = fq.field_j;
                        break L7;
                      }
                    }
                    discarded$9 = ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                    return;
                  }
                }
              } else {
                L8: {
                  var4 = op.field_l;
                  if (var16 == 0) {
                    break L8;
                  } else {
                    var4 = fq.field_j;
                    break L8;
                  }
                }
                discarded$10 = ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                return;
              }
            } else {
              var4 = fq.field_j;
              discarded$11 = ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
              return;
            }
          } else {
            L9: {
              L10: {
                if (wc.j(111)) {
                  break L10;
                } else {
                  L11: {
                    if (!mc.field_i.field_j) {
                      break L11;
                    } else {
                      L12: {
                        if (mc.field_i.field_t != null) {
                          break L12;
                        } else {
                          var4 = hk.field_g;
                          if (var16 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var5 = pb.field_e;
                      var6 = ((fm) ((Object) var5)).field_r + ((fm) ((Object) var5)).field_C - -1;
                      var7 = var6 + 150;
                      var8 = 16777215;
                      var9 = 0;
                      oo.f(30, var7 + -35, 580, ((fm) ((Object) var2)).field_C + (((fm) ((Object) var2)).field_r - -1), 0, 64);
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
                      L13: while (true) {
                        L14: {
                          if (-11 >= (var14 ^ -1)) {
                            if (var13 != 0) {
                              break L14;
                            } else {
                              var8 = 16777215;
                              var7 += 4;
                              this.a(mc.field_i.field_l, -1, var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                              break L14;
                            }
                          } else {
                            var20 = var19[var14];
                            if (var16 != 0) {
                              break L14;
                            } else {
                              L15: {
                                if (var20 != null) {
                                  L16: {
                                    L17: {
                                      if (!sf.a(1, var20)) {
                                        break L17;
                                      } else {
                                        var8 = 16728064;
                                        var13 = 1;
                                        if (var16 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L18: {
                                      if ((var14 & 1) != 0) {
                                        stackOut_38_0 = 4246528;
                                        stackIn_39_0 = stackOut_38_0;
                                        break L18;
                                      } else {
                                        stackOut_37_0 = 16776992;
                                        stackIn_39_0 = stackOut_37_0;
                                        break L18;
                                      }
                                    }
                                    var8 = stackIn_39_0;
                                    break L16;
                                  }
                                  var4 = "";
                                  this.a(var12[var14 * 4], var14, var5, var9, var20, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              var7 = var7 + var6;
                              var14++;
                              continue L13;
                            }
                          }
                        }
                        if (var16 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  var4 = op.field_l;
                  if (var16 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var4 = fq.field_j;
              break L9;
            }
            discarded$12 = ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
            return;
          }
        } else {
          L19: {
            L20: {
              if (wc.j(111)) {
                break L20;
              } else {
                L21: {
                  if (!mc.field_i.field_j) {
                    break L21;
                  } else {
                    L22: {
                      if (mc.field_i.field_t != null) {
                        break L22;
                      } else {
                        var4 = hk.field_g;
                        if (var16 == 0) {
                          break L19;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var5 = pb.field_e;
                    var6 = ((fm) ((Object) var5)).field_r + ((fm) ((Object) var5)).field_C - -1;
                    var7 = var6 + 150;
                    var8 = 16777215;
                    var9 = 0;
                    oo.f(30, var7 + -35, 580, ((fm) ((Object) var2)).field_C + (((fm) ((Object) var2)).field_r - -1), 0, 64);
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
                    L23: while (true) {
                      L24: {
                        if (-11 >= (var14 ^ -1)) {
                          if (var13 != 0) {
                            break L24;
                          } else {
                            var8 = 16777215;
                            var7 += 4;
                            this.a(mc.field_i.field_l, -1, var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                            break L24;
                          }
                        } else {
                          var18 = var17[var14];
                          if (var16 != 0) {
                            break L24;
                          } else {
                            L25: {
                              if (var18 != null) {
                                L26: {
                                  L27: {
                                    if (!sf.a(1, var18)) {
                                      break L27;
                                    } else {
                                      var8 = 16728064;
                                      var13 = 1;
                                      if (var16 == 0) {
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  L28: {
                                    if ((var14 & 1) != 0) {
                                      stackOut_14_0 = 4246528;
                                      stackIn_15_0 = stackOut_14_0;
                                      break L28;
                                    } else {
                                      stackOut_13_0 = 16776992;
                                      stackIn_15_0 = stackOut_13_0;
                                      break L28;
                                    }
                                  }
                                  var8 = stackIn_15_0;
                                  break L26;
                                }
                                var4 = "";
                                this.a(var12[var14 * 4], var14, var5, var9, var18, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            var7 = var7 + var6;
                            var14++;
                            continue L23;
                          }
                        }
                      }
                      if (var16 == 0) {
                        break L19;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
                var4 = op.field_l;
                if (var16 == 0) {
                  break L19;
                } else {
                  break L20;
                }
              }
            }
            var4 = fq.field_j;
            break L19;
          }
          discarded$13 = ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
    }

    private final int c(byte param0, int param1) {
        String var3 = null;
        if (param0 != -95) {
          field_m = (int[]) null;
          var3 = we.field_g[this.field_j[param1]];
          return 20 + ah.field_e.a(var3);
        } else {
          var3 = we.field_g[this.field_j[param1]];
          return 20 + ah.field_e.a(var3);
        }
    }

    final int d(int param0, int param1) {
        this.field_i = 50;
        if (param0 < -65) {
          this.field_a = -this.field_i + 640;
          if (!wc.j(91)) {
            if (-3 < (param1 ^ -1)) {
              if (-1 != (param1 ^ -1)) {
                return this.field_a;
              } else {
                return this.field_i - -this.c((byte) -95, 0);
              }
            } else {
              if (param1 == 0) {
                return 450;
              } else {
                return 640;
              }
            }
          } else {
            if (param1 == 0) {
              return 450;
            } else {
              return 640;
            }
          }
        } else {
          field_l = (String) null;
          this.field_a = -this.field_i + 640;
          if (!wc.j(91)) {
            if (-3 < (param1 ^ -1)) {
              if (-1 != (param1 ^ -1)) {
                return this.field_a;
              } else {
                return this.field_i - -this.c((byte) -95, 0);
              }
            } else {
              if (param1 == 0) {
                return 450;
              } else {
                return 640;
              }
            }
          } else {
            if (param1 == 0) {
              return 450;
            } else {
              return 640;
            }
          }
        }
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
        ug var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                    L3: {
                      if (param0 >= var9) {
                        oo.b(ki.field_d);
                        break L3;
                      } else {
                        param3[1].g(param0, param4);
                        param0 = param0 + var7;
                        if (var10 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    L4: {
                      if (param2) {
                        break L4;
                      } else {
                        var11 = (ug) null;
                        fk.a((ug) null, false);
                        break L4;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("fk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(ug param0, boolean param1) {
        try {
            ih.a(param1, 256, param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1) {
        this.field_i = 50;
        if (param0 == -118) {
          this.field_a = -this.field_i + 640;
          if (wc.j(96)) {
            if (param1 != 0) {
              return 450;
            } else {
              return 0;
            }
          } else {
            if ((param1 ^ -1) > -3) {
              if (0 != param1) {
                return this.field_a - this.c((byte) -95, 1);
              } else {
                return this.field_i;
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
          field_o = (String) null;
          this.field_a = -this.field_i + 640;
          if (!wc.j(96)) {
            if ((param1 ^ -1) > -3) {
              if (0 != param1) {
                return this.field_a - this.c((byte) -95, 1);
              } else {
                return this.field_i;
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
            field_l = (String) null;
            mc.field_i = null;
            return;
        }
        mc.field_i = null;
    }

    static {
        field_m = new int[8192];
        field_o = "Starve them.";
        field_l = "Deadly";
        field_n = new th();
    }
}
