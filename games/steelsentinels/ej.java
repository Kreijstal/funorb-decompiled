/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends we {
    static String field_z;
    static int field_y;
    static String field_w;
    static String field_C;
    private ic field_A;
    static int field_v;
    static String field_u;
    static cm field_t;
    static String field_E;
    static int field_B;
    static String field_x;
    ul field_F;
    static int field_H;
    static String field_s;
    static int field_D;
    wg field_G;

    final void d(int param0) {
        int var2 = 0;
        hj var3 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        this.field_G.d(param0);
        var3 = (hj) ((Object) this.field_F.e(13058));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!this.field_A.a(var3, false)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_K) {
                    this.a(110, var3, var2);
                    var3.field_K = var3.field_K - var2;
                    break L1;
                  } else {
                    this.a(-105, var3, var3.field_K);
                    var2 = var2 - var3.field_K;
                    if (!this.field_A.a(var2, 0, 7139, var3, (int[]) null)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (hj) ((Object) this.field_F.a((byte) -28));
            continue L0;
          }
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_w = null;
        field_x = null;
        field_E = null;
        field_t = null;
        field_u = null;
        if (param0 >= -62) {
            ej.e(-110);
        }
        field_z = null;
        field_s = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (pb.field_i > param1) {
                param2 = param2 - (pb.field_i + -param1);
                param1 = pb.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param5 == 40) {
                break L2;
              } else {
                field_t = (cm) null;
                break L2;
              }
            }
            L3: {
              if (pb.field_b >= param2 + param1) {
                break L3;
              } else {
                param2 = pb.field_b + -param1;
                break L3;
              }
            }
            L4: {
              if (pb.field_l > param4) {
                param0 = param0 - (pb.field_l + -param4);
                param4 = pb.field_l;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (pb.field_d < param0 + param4) {
                param0 = pb.field_d - param4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((param2 ^ -1) >= -1) {
                break L6;
              } else {
                if (0 < param0) {
                  var6_int = param4 * pb.field_c + param1;
                  var7 = -param2 + pb.field_c;
                  param4 = -param0;
                  L7: while (true) {
                    if (-1 >= (param4 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param1 = -param2;
                      L8: while (true) {
                        if ((param1 ^ -1) <= -1) {
                          var6_int = var6_int + var7;
                          param4++;
                          continue L7;
                        } else {
                          var8 = pb.field_g[var6_int];
                          if ((var8 & 65280) >> -2059790200 > param3) {
                            L9: {
                              if ((var8 >> 1075212912 & 255) <= (var8 & 65280) >> -905764632) {
                                L10: {
                                  var9 = (var8 >> -94955057 & 510) + -60;
                                  if ((var9 ^ -1) < -256) {
                                    var9 = 255;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var10 = 65280 & var8;
                                var10 = (var10 >> -1549321119) + -(var10 >> 811447557) & 65280;
                                var11 = var8 >> -776543165 & 31;
                                pb.field_g[var6_int] = vn.a(vn.a(var9 << -1697145264, var10), var11);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var6_int++;
                            param1++;
                            continue L8;
                          } else {
                            var6_int++;
                            param1++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "ej.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj var6 = null;
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
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            this.field_G.a(param0, param1, param2);
            var6 = (hj) ((Object) this.field_F.e(13058));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_A.a(var6, false)) {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var5 <= var6.field_K) {
                        this.a(var4_int, var5, (byte) -112, var6, param0, var5 + var4_int);
                        var6.field_K = var6.field_K - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var6.field_K, (byte) 32, var6, param0, var5 + var4_int);
                        var4_int = var4_int + var6.field_K;
                        var5 = var5 - var6.field_K;
                        if (this.field_A.a(var5, var4_int, 7139, var6, param0)) {
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
                var6 = (hj) ((Object) this.field_F.a((byte) -37));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("ej.K(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a() {
        return 0;
    }

    final we b() {
        hj var1 = null;
        L0: while (true) {
          var1 = (hj) ((Object) this.field_F.a((byte) -122));
          if (var1 != null) {
            if (null != var1.field_A) {
              return (we) ((Object) var1.field_A);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, hj param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ic stackIn_7_0 = null;
        ic stackIn_8_0 = null;
        ic stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_6_0 = null;
        ic stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ic stackOut_7_0 = null;
        int stackOut_7_1 = 0;
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
              if (-1 == (this.field_A.field_F[param1.field_t] & 4 ^ -1)) {
                break L1;
              } else {
                if (-1 >= (param1.field_J ^ -1)) {
                  break L1;
                } else {
                  var4_int = this.field_A.field_u[param1.field_t] / tb.field_g;
                  var5 = (1048575 + var4_int - param1.field_v) / var4_int;
                  param1.field_v = 1048575 & param1.field_v + param2 * var4_int;
                  if (param2 >= var5) {
                    L2: {
                      if (-1 != (this.field_A.field_L[param1.field_t] ^ -1)) {
                        L3: {
                          param1.field_A = em.a(param1.field_q, param1.field_A.j(), 0, param1.field_A.i());
                          stackOut_6_0 = this.field_A;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (param1.field_N.field_p[param1.field_z] >= 0) {
                            stackOut_8_0 = (ic) ((Object) stackIn_8_0);
                            stackOut_8_1 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            break L3;
                          } else {
                            stackOut_7_0 = (ic) ((Object) stackIn_7_0);
                            stackOut_7_1 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            break L3;
                          }
                        }
                        ((ic) (Object) stackIn_9_0).a(stackIn_9_1 != 0, 111, param1);
                        break L2;
                      } else {
                        param1.field_A = em.a(param1.field_q, param1.field_A.j(), param1.field_A.f(), param1.field_A.i());
                        break L2;
                      }
                    }
                    L4: {
                      if (-1 >= (param1.field_N.field_p[param1.field_z] ^ -1)) {
                        break L4;
                      } else {
                        param1.field_A.h(-1);
                        break L4;
                      }
                    }
                    param2 = param1.field_v / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param1.field_A.d(param2);
            var4_int = 109 / ((12 - param0) / 60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("ej.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, hj param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        em var12 = null;
        int var13 = 0;
        ic stackIn_12_0 = null;
        ic stackIn_13_0 = null;
        ic stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_11_0 = null;
        ic stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ic stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var7_int = -21 % ((-50 - param2) / 62);
              if (-1 == (this.field_A.field_F[param3.field_t] & 4 ^ -1)) {
                break L1;
              } else {
                if (0 > param3.field_J) {
                  var8 = this.field_A.field_u[param3.field_t] / tb.field_g;
                  L2: while (true) {
                    var9 = (-param3.field_v + (var8 + 1048575)) / var8;
                    if (var9 > param1) {
                      param3.field_v = param3.field_v + param1 * var8;
                      break L1;
                    } else {
                      L3: {
                        param3.field_A.a(param4, param0, var9);
                        param0 = param0 + var9;
                        param1 = param1 - var9;
                        param3.field_v = param3.field_v + (-1048576 + var8 * var9);
                        var10 = tb.field_g / 100;
                        var11 = 262144 / var8;
                        if (var11 < var10) {
                          var10 = var11;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var12 = param3.field_A;
                        if (-1 != (this.field_A.field_L[param3.field_t] ^ -1)) {
                          L5: {
                            param3.field_A = em.a(param3.field_q, var12.j(), 0, var12.i());
                            stackOut_11_0 = this.field_A;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (-1 >= (param3.field_N.field_p[param3.field_z] ^ -1)) {
                              stackOut_13_0 = (ic) ((Object) stackIn_13_0);
                              stackOut_13_1 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L5;
                            } else {
                              stackOut_12_0 = (ic) ((Object) stackIn_12_0);
                              stackOut_12_1 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              break L5;
                            }
                          }
                          ((ic) (Object) stackIn_14_0).a(stackIn_14_1 != 0, -59, param3);
                          param3.field_A.b(var10, var12.f());
                          break L4;
                        } else {
                          param3.field_A = em.a(param3.field_q, var12.j(), var12.f(), var12.i());
                          break L4;
                        }
                      }
                      L6: {
                        if ((param3.field_N.field_p[param3.field_z] ^ -1) > -1) {
                          param3.field_A.h(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var12.g(var10);
                      var12.a(param4, param0, param5 + -param0);
                      if (var12.l()) {
                        this.field_G.b(var12);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param3.field_A.a(param4, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var7);
            stackOut_24_1 = new StringBuilder().append("ej.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param5 + ')');
        }
    }

    final static boolean f(int param0) {
        if (null != jb.field_B) {
            return true;
        }
        if (!kd.field_x.a("benefits", (byte) 90)) {
            return false;
        }
        jb.field_B = rl.a(kd.field_x, "benefits", "members_benefits_borders", false);
        if (param0 > -126) {
            return true;
        }
        el.field_ac = rl.a(kd.field_x, "benefits", "members_benefits_price", false);
        bc.field_qb = rl.a(kd.field_x, "benefits", "members_benefits_logo", false);
        pg.field_v = cf.a("members_benefits_screenshots", "benefits", (byte) -73, kd.field_x);
        vc.a(uj.field_h, jb.field_B, false);
        ha.a(16744576, 2, (byte) 120, va.field_j, -2400, el.field_ac, 80, 40, 15, 80, 40);
        uh.a(1, pg.field_v);
        qa.a(bc.field_qb, (byte) 69);
        return true;
    }

    final we d() {
        hj var1 = (hj) ((Object) this.field_F.e(13058));
        if (var1 == null) {
            return null;
        }
        if (null != var1.field_A) {
            return (we) ((Object) var1.field_A);
        }
        return this.b();
    }

    ej(ic param0) {
        this.field_F = new ul();
        this.field_G = new wg();
        try {
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = "STANDARD";
        field_z = "This password contains your email address, and would be easy to guess";
        field_E = "NONE";
        field_u = "Show players in <%0>'s game";
        field_v = 1;
        field_H = 0;
        field_x = "Asking to join <%0>'s game...";
        field_s = "You have discovered the following items:";
        field_w = "Kick";
    }
}
