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
        String stackIn_10_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
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
                stackIn_10_0 = "500+";
                break L4;
              } else {
                stackIn_10_0 = Integer.toString(var12_int);
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
            stackIn_16_0 = (RuntimeException) (var12);

            stackIn_16_1 = new StringBuilder().append("fk.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final void a(boolean param0) {
        sl var2;
        int var3;
        String var4;
        ef var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String[] var11;
        int[] var12;
        int var13;
        int var14;
        String var15;
        int var16;
        String[] var17;
        String var18;
        String[] var19;
        String var20;
        String var21;
        String[] var22;
        int stackIn_15_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_75_0 = 0;
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
                      ((fm) ((Object) var2)).a(var21, 40, 150, 560, 200, 0, -1, 1, 1, var3);
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
                                stackIn_75_0 = 4246528;
                                break L5;
                              } else {
                                stackIn_75_0 = 16776992;
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
                      if (var16 == 0) {
                        continue L1;
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
                        ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                        return;
                      }
                    } else {
                      var4 = op.field_l;
                      var4 = fq.field_j;
                      var15 = var4;
                      var15 = var4;
                      ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                      return;
                    }
                  } else {
                    L8: {
                      if (var13 != 0) {
                        break L8;
                      } else {
                        var8 = 16777215;
                        var7 += 4;
                        this.a(mc.field_i.field_l, -1, var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                        break L8;
                      }
                    }
                    L9: {
                      if (var16 == 0) {
                        break L9;
                      } else {
                        var4 = op.field_l;
                        var4 = fq.field_j;
                        break L9;
                      }
                    }
                    ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                    return;
                  }
                }
              } else {
                L10: {
                  var4 = op.field_l;
                  if (var16 == 0) {
                    break L10;
                  } else {
                    var4 = fq.field_j;
                    break L10;
                  }
                }
                ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
                return;
              }
            } else {
              var4 = fq.field_j;
              ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
              return;
            }
          } else {
            L11: {
              L12: {
                if (wc.j(111)) {
                  break L12;
                } else {
                  L13: {
                    if (!mc.field_i.field_j) {
                      break L13;
                    } else {
                      L14: {
                        if (mc.field_i.field_t != null) {
                          break L14;
                        } else {
                          var4 = hk.field_g;
                          if (var16 == 0) {
                            break L11;
                          } else {
                            break L14;
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
                      L15: while (true) {
                        L16: {
                          L17: {
                            if (-11 >= (var14 ^ -1)) {
                              break L17;
                            } else {
                              var20 = var19[var14];
                              if (var16 != 0) {
                                break L16;
                              } else {
                                L18: {
                                  if (var20 != null) {
                                    L19: {
                                      L20: {
                                        if (!sf.a(1, var20)) {
                                          break L20;
                                        } else {
                                          var8 = 16728064;
                                          var13 = 1;
                                          if (var16 == 0) {
                                            break L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      L21: {
                                        if ((var14 & 1) != 0) {
                                          stackIn_39_0 = 4246528;
                                          break L21;
                                        } else {
                                          stackIn_39_0 = 16776992;
                                          break L21;
                                        }
                                      }
                                      var8 = stackIn_39_0;
                                      break L19;
                                    }
                                    var4 = "";
                                    this.a(var12[var14 * 4], var14, var5, var9, var20, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                var7 = var7 + var6;
                                var14++;
                                if (var16 == 0) {
                                  continue L15;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          if (var13 != 0) {
                            break L16;
                          } else {
                            var8 = 16777215;
                            var7 += 4;
                            this.a(mc.field_i.field_l, -1, var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                            break L16;
                          }
                        }
                        if (var16 == 0) {
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  var4 = op.field_l;
                  if (var16 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              var4 = fq.field_j;
              break L11;
            }
            ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
            return;
          }
        } else {
          L22: {
            L23: {
              if (wc.j(111)) {
                break L23;
              } else {
                L24: {
                  if (!mc.field_i.field_j) {
                    break L24;
                  } else {
                    L25: {
                      if (mc.field_i.field_t != null) {
                        break L25;
                      } else {
                        var4 = hk.field_g;
                        if (var16 == 0) {
                          break L22;
                        } else {
                          break L25;
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
                    L26: while (true) {
                      L27: {
                        L28: {
                          if (-11 >= (var14 ^ -1)) {
                            break L28;
                          } else {
                            var18 = var17[var14];
                            if (var16 != 0) {
                              break L27;
                            } else {
                              L29: {
                                if (var18 != null) {
                                  L30: {
                                    L31: {
                                      if (!sf.a(1, var18)) {
                                        break L31;
                                      } else {
                                        var8 = 16728064;
                                        var13 = 1;
                                        if (var16 == 0) {
                                          break L30;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                    L32: {
                                      if ((var14 & 1) != 0) {
                                        stackIn_15_0 = 4246528;
                                        break L32;
                                      } else {
                                        stackIn_15_0 = 16776992;
                                        break L32;
                                      }
                                    }
                                    var8 = stackIn_15_0;
                                    break L30;
                                  }
                                  var4 = "";
                                  this.a(var12[var14 * 4], var14, var5, var9, var18, var8, var12[2 + var14 * 4], var12[4 * var14 - -3], false, var7, var12[1 + 4 * var14]);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              var7 = var7 + var6;
                              var14++;
                              if (var16 == 0) {
                                continue L26;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        if (var13 != 0) {
                          break L27;
                        } else {
                          var8 = 16777215;
                          var7 += 4;
                          this.a(mc.field_i.field_l, -1, var5, var9, ta.field_lb, var8, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                          break L27;
                        }
                      }
                      if (var16 == 0) {
                        break L22;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                var4 = op.field_l;
                if (var16 == 0) {
                  break L22;
                } else {
                  break L23;
                }
              }
            }
            var4 = fq.field_j;
            break L22;
          }
          ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
    }

    private final int c(byte param0, int param1) {
        String var3;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ug var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 <= 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 >= var9) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param3[1].g(param0, param4);
                        param0 = param0 + var7;
                        if (var10 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var10 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        oo.b(ki.field_d);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = (ug) null;
                        fk.a((ug) null, false);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var5);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("fk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_15_1 = stackIn_16_1;
                    if (param3 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
