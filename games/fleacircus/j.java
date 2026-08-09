/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends ne {
    private int field_m;
    static String field_l;
    private fa field_k;
    static String field_h;
    private String field_j;
    static volatile boolean field_e;
    static int field_g;
    private int field_r;
    private int field_i;
    private int field_n;
    private boolean field_p;
    static String[] field_o;
    static int field_f;
    private int field_q;

    public static void a(int param0) {
        field_l = null;
        field_o = null;
        field_h = null;
        if (param0 >= -89) {
            rh var2 = (rh) null;
            j.a((rh) null, (rh) null, -107, (rh) null);
        }
    }

    final static int a(int param0, int param1, String param2, String param3, byte param4, String param5, boolean param6) {
        ad var7 = null;
        RuntimeException var7_ref = null;
        ad var8 = null;
        int var9 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new ad(param5);
            var8 = new ad(param3);
            var9 = -9 / ((param4 - -67) / 33);
            stackIn_1_0 = ak.a(param1, 15021, param6, var7, param0, param2, var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("j.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2, String param3, fa param4) {
        pi var7 = null;
        pi var8 = null;
        if (param3 == null) {
            this.field_c = null;
            return;
        }
        if (param4 == this.field_k && this.field_p && (this.field_n ^ -1) == -3 && null != this.field_j && this.field_j.equals(param3)) {
            return;
        }
        try {
            this.field_n = 2;
            this.field_k = param4;
            this.field_p = true;
            this.field_j = param3;
            var7 = this.a(param3, (byte) -74, param1, param4);
            var8 = var7;
            var8.field_d[param2] = param0 - param4.b(param3);
            var7.field_d[param3.length()] = param0;
            cd.a(param3, param4, var8, param2 + 30988, 0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "j.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(rh param0, rh param1, int param2, rh param3) {
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        bi[] var5 = null;
        bi[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        bi[] var10 = null;
        int var11_int = 0;
        dd var11 = null;
        dd var12 = null;
        int var13 = 0;
        bi[] var14 = null;
        dd var15 = null;
        int[][] var16 = null;
        dd var17 = null;
        dd var18 = null;
        int[][] var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        uh.field_m = of.a("frame_top", "commonui", param0, 101);
                        ki.field_c = of.a("frame_bottom", "commonui", param0, 85);
                        if (param2 == 31760) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ha.field_i = kl.a(252, param0, "commonui", "jagex_logo_grey");
                        ng.field_h = of.a("button", "commonui", param0, 61);
                        t.field_h = bg.a("validation", param0, (byte) 7, "commonui");
                        nb.field_c = (fa) ((Object) fi.a(param0, param1, "commonui", "arezzo12", (byte) 82));
                        ug.field_e = (fa) ((Object) fi.a(param0, param1, "commonui", "arezzo14", (byte) 82));
                        rg.field_o = (fa) ((Object) fi.a(param0, param1, "commonui", "arezzo14bold", (byte) 82));
                        var17 = new dd(param3.a(0, "", "button.gif"), (java.awt.Component) ((Object) ol.field_e));
                        hm.a("dropdown", param0, (byte) -42, "commonui");
                        var5 = fb.a(param0, (byte) 45, "commonui", "screen_options");
                        k.field_c = new bi[4];
                        lg.field_c = new bi[4];
                        hh.field_a = new bi[4];
                        var6 = new bi[][]{lg.field_c, k.field_c, hh.field_a};
                        var19 = new int[4][];
                        var16 = var19;
                        var7 = var16;
                        var7[0] = var5[0].field_l;
                        var8 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var19.length <= var8) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7[var8] = (int[]) ((Object) var19[0].clone());
                        var8++;
                        if (var13 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var13 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = var5[0].field_k[0];
                        var19[2][var8] = 16777215;
                        var19[1][var8] = 2394342;
                        var19[3][var8] = 4767999;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 >= 3) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14 = var6[var9];
                        var10 = var14;
                        stackIn_20_0 = 0;
                        stackIn_12_0 = stackIn_20_0;
                        if (var13 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11_int = stackIn_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var11_int >= var14.length) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var14[var11_int] = uk.a((byte) 84, var19[var11_int], var5[var9]);
                        var11_int++;
                        if (var13 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var13 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var13 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = var17.field_t;
                        we.a(-111);
                        var17.f();
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        gb.e(stackIn_20_0, 0, gb.field_d, gb.field_k);
                        var15 = new dd(var9, var9);
                        var18 = var15;
                        var18.f();
                        var17.f(0, 0);
                        var11 = new dd(var9, var9);
                        var11.f();
                        var17.f(-var17.field_w + var9, 0);
                        var12 = new dd(var17.field_w + -(2 * var9), var9);
                        var12.f();
                        var17.f(-var9, 0);
                        ia.a(-125);
                        ng.field_h = new dd[]{var15, var12, var11};
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("j.H(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param3 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw pf.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(fa param0, int param1, String param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        pi var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (this.field_k != param0) {
                  break L1;
                } else {
                  if (!this.field_p) {
                    break L1;
                  } else {
                    if ((this.field_n ^ -1) != -2) {
                      break L1;
                    } else {
                      if (null == this.field_j) {
                        break L1;
                      } else {
                        if (this.field_j.equals(param2)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              this.field_k = param0;
              this.field_p = true;
              this.field_n = 1;
              var8 = this.a(param2, (byte) -74, param4, param0);
              var7 = param0.b(param2);
              var8.field_d[0] = param3 - (var7 >> 986168641);
              var8.field_d[param2.length()] = param3 - -(var7 >> -1271554303);
              cd.a(param2, param0, var8, 30988, 0);
              if (param1 > 45) {
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_r = 7;
                return;
              }
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("j.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final pi a(String param0, byte param1, int param2, fa param3) {
        pi var5 = null;
        RuntimeException var5_ref = null;
        rh var6 = null;
        pi var7 = null;
        pi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -74) {
                break L1;
              } else {
                var6 = (rh) null;
                j.a((rh) null, (rh) null, -66, (rh) null);
                break L1;
              }
            }
            var7 = new pi(param2 + -param3.field_H, param3.field_K + param2, param0.length());
            var5 = var7;
            this.field_c = new pi[]{var7};
            stackIn_3_0 = (pi) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("j.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(boolean param0, int param1, int param2, fa param3, String param4, int param5, int param6, int param7) {
        pi stackIn_40_0;
        pi stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        pi stackIn_41_0 = null;
        pi stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        String stackIn_45_0;
        fa stackIn_45_1;
        pi stackIn_45_2;
        int stackIn_45_3;
        String stackIn_46_0;
        fa stackIn_46_1;
        pi stackIn_46_2;
        int stackIn_46_3;
        int stackIn_46_4;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        pi var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                param1 = param3.field_N;
                break L1;
              } else {
                break L1;
              }
            }
            if (param4 == null) {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_k != param3) {
                  break L2;
                } else {
                  if (this.field_p) {
                    break L2;
                  } else {
                    if (param2 != this.field_n) {
                      break L2;
                    } else {
                      if (this.field_i != param6) {
                        break L2;
                      } else {
                        if (param1 != this.field_m) {
                          break L2;
                        } else {
                          if (param7 != this.field_r) {
                            break L2;
                          } else {
                            if (param5 != this.field_q) {
                              break L2;
                            } else {
                              if (this.field_j == null) {
                                break L2;
                              } else {
                                if (!this.field_j.equals(param4)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_r = param7;
              this.field_k = param3;
              this.field_j = param4;
              this.field_p = false;
              this.field_m = param1;
              this.field_n = param2;
              this.field_i = param6;
              this.field_q = param5;
              if (param0) {
                L3: {
                  var16 = new String[1 + param3.a(param4, param5)];
                  var17 = var16;
                  var10 = Math.max(1, param3.a(param4, new int[]{param5}, var17));
                  if (this.field_i != 3) {
                    break L3;
                  } else {
                    if (-2 != (var10 ^ -1)) {
                      break L3;
                    } else {
                      this.field_i = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (-1 == (this.field_i ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        if ((this.field_i ^ -1) != -2) {
                          break L6;
                        } else {
                          var11 = param3.field_H - -(this.field_r - var10 * this.field_m >> -61668671);
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (this.field_i == 2) {
                          break L7;
                        } else {
                          L8: {
                            var12 = (this.field_r - var10 * this.field_m) / (var10 - -1);
                            if (0 > var12) {
                              var12 = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var11 = var12 + param3.field_H;
                          this.field_m = this.field_m + var12;
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = -(this.field_m * var10) + this.field_r - param3.field_K;
                      if (var15 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param3.field_H;
                  break L4;
                }
                this.field_c = new pi[var10];
                var12 = 0;
                L9: while (true) {
                  L10: {
                    if (var10 <= var12) {
                      break L10;
                    } else {
                      var13 = var16[var12];
                      if (var15 == 0) {
                        L11: {
                          stackIn_40_0 = null;

                          stackIn_40_1 = null;

                          stackIn_40_2 = var11 + -param3.field_H;

                          stackIn_40_3 = var11 + param3.field_K;

                          if (var13 != null) {
                            stackIn_41_0 = null;
                            stackIn_41_1 = null;
                            stackIn_41_2 = stackIn_40_2;
                            stackIn_41_3 = stackIn_40_3;
                            stackIn_41_4 = var13.length();
                            break L11;
                          } else {
                            stackIn_41_0 = null;
                            stackIn_41_1 = null;
                            stackIn_41_2 = stackIn_40_2;
                            stackIn_41_3 = stackIn_40_3;
                            stackIn_41_4 = 0;
                            break L11;
                          }
                        }
                        L12: {
                          var14 = new pi(stackIn_41_2, stackIn_41_3, stackIn_41_4);
                          var14.field_d[0] = 0;
                          if (var13 != null) {
                            L13: {
                              var14.field_d[var13.length()] = param3.b(var13);
                              stackIn_45_0 = (String) (var13);

                              stackIn_45_1 = (fa) (param3);

                              stackIn_45_2 = (pi) (var14);

                              stackIn_45_3 = 30988;

                              if ((param2 ^ -1) != -4) {
                                stackIn_46_0 = (String) ((Object) stackIn_45_0);
                                stackIn_46_1 = (fa) ((Object) stackIn_45_1);
                                stackIn_46_2 = (pi) ((Object) stackIn_45_2);
                                stackIn_46_3 = stackIn_45_3;
                                stackIn_46_4 = 0;
                                break L13;
                              } else {
                                stackIn_46_0 = (String) ((Object) stackIn_45_0);
                                stackIn_46_1 = (fa) ((Object) stackIn_45_1);
                                stackIn_46_2 = (pi) ((Object) stackIn_45_2);
                                stackIn_46_3 = stackIn_45_3;
                                stackIn_46_4 = this.a(param3.b(var13), var13, 0, param5);
                                break L13;
                              }
                            }
                            cd.a(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var11 = var11 + param1;
                        this.field_c[var12] = var14;
                        var12++;
                        if (var15 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var9);

            stackIn_51_1 = new StringBuilder().append("j.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L14;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');

            if (param4 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L15;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L15;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_52_0), stackIn_55_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(String param0, int param1, fa param2, boolean param3, int param4) {
        pi var7 = null;
        pi var8 = null;
        if (!(param0 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_k == param2 && this.field_p && this.field_n == 0 && null != this.field_j && this.field_j.equals(param0)) {
            return;
        }
        try {
            this.field_n = 0;
            this.field_k = param2;
            this.field_p = param3 ? true : false;
            this.field_j = param0;
            var7 = this.a(param0, (byte) -74, param4, param2);
            var8 = var7;
            var7.field_d[0] = param1;
            var8.field_d[param0.length()] = param2.b(param0) + param1;
            cd.a(param0, param2, var8, 30988, 0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "j.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public j() {
    }

    static {
        field_l = "<%0>Green Switches:<%1> cause all the recessed walls to slide out and become normal wall blocks. Warning: fleas standing in the way are crushed and die!";
        field_h = "Left slope: ";
        field_e = true;
        field_f = 0;
    }
}
