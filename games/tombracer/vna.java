/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vna {
    static nh field_c;
    static su field_a;
    static String[][] field_d;
    vg field_e;
    private vg field_b;

    final vg a(int param0, vg param1) {
        vg var3 = null;
        RuntimeException var3_ref = null;
        vg stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        vg stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  var3 = param1;
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.field_e.field_a;
              break L1;
            }
            if (param0 == -13854) {
              if (this.field_e != var3) {
                this.field_b = var3.field_a;
                stackIn_10_0 = (vg) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_b = null;
                stackIn_8_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = (vg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("vna.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vg) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final void a(byte param0, vg param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (null == param1.field_e) {
                break L1;
              } else {
                param1.p(47);
                break L1;
              }
            }
            L2: {
              param1.field_a = this.field_e.field_a;
              param1.field_e = this.field_e;
              if (param0 >= 87) {
                break L2;
              } else {
                this.f(54);
                break L2;
              }
            }
            param1.field_e.field_a = param1;
            param1.field_a.field_e = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("vna.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final vg c(byte param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        vg stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vg stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = this.field_e.field_e;
            if (param0 == 22) {
              if (var2 != this.field_e) {
                var2.p(2);
                stackIn_7_0 = (vg) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (vg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vg) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static mu a(boolean param0, int param1, int param2) {
        iv stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        iv stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_7_2 = false;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        iv stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_8_2 = false;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        jea stackIn_44_0 = null;
        jea stackIn_46_0 = null;
        jea stackIn_47_0 = null;
        String stackIn_47_1 = null;
        jea stackIn_48_0 = null;
        jea stackIn_50_0 = null;
        jea stackIn_51_0 = null;
        String stackIn_51_1 = null;
        int stackIn_55_0 = 0;
        Object stackIn_107_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vna var4 = null;
        Object var5 = null;
        Object var6 = null;
        mu var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        lja var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 <= -114) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vna.a(false, -16, -77);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_7_0 = dn.field_b.field_vb;
                        stackIn_5_0 = stackIn_7_0;
                        stackIn_7_1 = 2;
                        stackIn_5_1 = stackIn_7_1;
                        stackIn_7_2 = param0;
                        stackIn_5_2 = stackIn_7_2;
                        stackIn_7_3 = 71;
                        stackIn_5_3 = stackIn_7_3;
                        stackIn_7_4 = 3 * ((2 + di.field_a) * param1);
                        stackIn_5_4 = stackIn_7_4;
                        stackIn_7_5 = di.field_a - -2;
                        stackIn_5_5 = stackIn_7_5;
                        if (dn.field_b.field_vb != lu.field_b) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = (iv) ((Object) stackIn_5_0);
                        stackIn_8_1 = stackIn_5_1;
                        stackIn_8_2 = stackIn_5_2;
                        stackIn_8_3 = stackIn_5_3;
                        stackIn_8_4 = stackIn_5_4;
                        stackIn_8_5 = stackIn_5_5;
                        stackIn_8_6 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = (iv) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = stackIn_7_2;
                        stackIn_8_3 = stackIn_7_3;
                        stackIn_8_4 = stackIn_7_4;
                        stackIn_8_5 = stackIn_7_5;
                        stackIn_8_6 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3_int = ((iv) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5, stackIn_8_6 != 0) ? 1 : 0;
                        var4 = dn.field_b.field_tb.field_J;
                        var5 = null;
                        if (-3 == (ae.field_g ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        is.field_yb.field_r = dt.field_n;
                        dqa.field_e.field_X = false;
                        if (-2 == (ae.field_g ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dn.field_b.field_vb.field_vb.field_r = nl.field_c;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        dn.field_b.field_vb.field_vb.field_r = tna.field_b;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        vsa.a(-106, dn.field_b.field_tb);
                        if (var19 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        dqa.field_e.field_X = true;
                        is.field_yb.field_r = gl.a((byte) 99, uba.field_h, new String[]{ol.field_b});
                        dn.field_b.field_vb.field_vb.field_r = null;
                        var6 = null;
                        var7 = (mu) ((Object) var4.f(-80));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == null) {
                            statePc = 97;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null != var7.field_J) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7.field_xb = new jea(0L, lta.field_a);
                        var7.b(-128, var7.field_xb);
                        var7.field_Ab = new jea(0L, iea.field_g);
                        var7.b(-123, var7.field_Ab);
                        var7.field_zb = new jea(0L, lta.field_a);
                        var7.b(-128, var7.field_zb);
                        var7.field_Ab.field_z = 2;
                        var8 = 1;
                        var7.a(-10966);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7.field_G = dn.field_b.field_tb.field_G;
                        var9 = 0;
                        if (var7.field_Cb == null) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var7.field_Cb == ol.field_b) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 16737894;
                        var10 = 13369344;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = 0;
                        if (null == var7.field_vb) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!var7.field_vb.equals("")) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7.field_zb.field_R = bfa.field_e;
                        var7.field_zb.field_ab = var11;
                        var12 = 1;
                        var7.field_zb.a(3 + bfa.field_e.field_n, di.field_a, -23776, var9, 0);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7.field_Ab.field_gb = var11;
                        var7.field_xb.field_gb = var11;
                        var7.field_Ab.field_ab = var11;
                        var7.field_xb.field_ab = var11;
                        var7.field_Ab.field_ib = var10;
                        var7.field_xb.field_ib = var10;
                        var7.field_Ab.field_N = var11;
                        var7.field_xb.field_N = var11;
                        var13 = 0;
                        var14 = var7.field_G - 80 + -2;
                        if (var12 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var13 = 3 + bfa.field_e.field_n;
                        var14 = var14 - var13;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = var7.field_xb;
                        stackIn_44_0 = stackIn_46_0;
                        if (-1 <= (var14 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_47_0 = (jea) ((Object) stackIn_44_0);
                        stackIn_47_1 = il.a(var7.field_xb.field_H, var7.field_tb, var14);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = (jea) ((Object) stackIn_46_0);
                        stackIn_47_1 = var7.field_tb;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_47_0.field_r = stackIn_47_1;
                        var7.field_xb.a(var14, di.field_a, -23776, var9, var13);
                        stackIn_50_0 = var7.field_Ab;
                        stackIn_48_0 = stackIn_50_0;
                        if (var7.field_Cb == null) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_51_0 = (jea) ((Object) stackIn_48_0);
                        stackIn_51_1 = var7.field_Cb;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = (jea) ((Object) stackIn_50_0);
                        stackIn_51_1 = gd.field_K;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_51_0.field_r = stackIn_51_1;
                        var7.field_Ab.a(80, di.field_a, -23776, var9, -80 + var7.field_G);
                        if (var7.field_xb.field_r.equals(var7.field_tb)) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_55_0 = 1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var15 = stackIn_55_0;
                        var9 = var9 + di.field_a;
                        if (var3_int == 0) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var7.field_O = -var7.field_t + var9;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var8 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        dn.field_b.field_tb.a(2, (jea) (var6), var7, (byte) -122);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var6 = var7;
                        if (var7.field_zb == null) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var7.field_zb.field_o) {
                            statePc = 94;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-1 == (var7.field_y ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var16 = var7.field_tb;
                        paa.a(dn.field_b.field_vb, -1, var16, 0L, -11635, (int[]) null, var7, -1, (String) null);
                        if (var7.field_Cb == null) {
                            statePc = 84;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (ab.a(hka.field_b.field_i, (byte) -13)) {
                            statePc = 84;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (!fua.field_g) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (!ok.field_s) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var17 = hka.field_b;
                        var18 = gl.a((byte) 114, fj.field_b, new String[]{var16});
                        var17.field_f.a((byte) -79, 8, var18);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var17 = hka.field_b;
                        var18 = gl.a((byte) 86, ob.field_f, new String[]{var16});
                        var17.field_f.a((byte) -97, 18, var18);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var5 = var7;
                        if (var19 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!var7.field_xb.field_o) {
                            statePc = 96;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var15 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        qda.field_b = var7.field_tb;
                        if (var19 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        qda.field_b = var7.field_vb;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var7 = (mu) ((Object) var4.e(111));
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((dn.field_b.field_yb.field_y ^ -1) != -1) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        bl.field_a = new is(dn.field_b.field_yb.field_q, dn.field_b.field_yb.field_A, dn.field_b.field_yb.field_G, dn.field_b.field_yb.field_t, tr.field_c, lw.field_a, kua.field_i, kua.field_i);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        cn.field_k = 0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (0 != dn.field_b.field_wb.field_y) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        bl.field_a = new is(dn.field_b.field_wb.field_q, dn.field_b.field_wb.field_A, dn.field_b.field_wb.field_G, dn.field_b.field_wb.field_t, ro.field_q, lw.field_a, kua.field_i, kua.field_i);
                        cn.field_k = 1;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackIn_107_0 = var5;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    return (mu) ((Object) stackIn_107_0);
                }
                case 108: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var3), "vna.B(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final vg a(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vg stackIn_5_0 = null;
        vg stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = this.field_b;
            if (this.field_e != var2) {
              if (param0 == -1) {
                this.field_b = var2.field_e;
                stackIn_7_0 = (vg) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (vg) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_b = null;
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vg) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        vg var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -16) {
              var2_int = 0;
              var3 = this.field_e.field_a;
              L1: while (true) {
                L2: {
                  if (var3 == this.field_e) {
                    break L2;
                  } else {
                    var2_int++;
                    var3 = var3.field_a;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 34;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "vna.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final boolean d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 14) {
                break L1;
              } else {
                field_a = (su) null;
                break L1;
              }
            }
            L2: {
              if (this.field_e != this.field_e.field_a) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "vna.I(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final vg c(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_4_0 = null;
        vg stackIn_6_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = this.field_e.field_a;
            var3 = -30 % ((-37 - param0) / 59);
            if (this.field_e == var2) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2.p(64);
              stackIn_6_0 = (vg) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vg) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void b(byte param0, vg param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 < -45) {
                break L1;
              } else {
                vna.a(true, 11, -23);
                break L1;
              }
            }
            L2: {
              if (null == param1.field_e) {
                break L2;
              } else {
                param1.p(111);
                break L2;
              }
            }
            param1.field_a = this.field_e;
            param1.field_e = this.field_e.field_e;
            param1.field_e.field_a = param1;
            param1.field_a.field_e = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("vna.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final vg f(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        vg stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vg stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = this.field_e.field_a;
            if (param0 == -80) {
              if (this.field_e != var2) {
                this.field_b = var2.field_a;
                stackIn_7_0 = (vg) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_b = null;
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (vg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vg) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 > 87) {
                break L1;
              } else {
                field_c = (nh) null;
                break L1;
              }
            }
            field_d = (String[][]) null;
            field_c = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "vna.G(" + param0 + ')');
        }
    }

    final vg b(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        vg stackIn_7_0 = null;
        vg stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = this.field_e.field_e;
            if (this.field_e == var2) {
              this.field_b = null;
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 3) {
                this.field_b = var2.field_e;
                stackIn_9_0 = (vg) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = (vg) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vg) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final void d(int param0) {
        RuntimeException runtimeException = null;
        vg var2 = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = this.field_e.field_a;
                        if (this.field_e == var2) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2.p(param0 ^ 119);
                        if (var3 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var3 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 == 8) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a(-64);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_b = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "vna.N(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final vg e(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        vg stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = this.field_b;
            if (var2 == this.field_e) {
              this.field_b = null;
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 >= 106) {
                  break L1;
                } else {
                  this.field_b = (vg) null;
                  break L1;
                }
              }
              this.field_b = var2.field_a;
              stackIn_9_0 = (vg) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vg) ((Object) stackIn_4_0);
        } else {
          return stackIn_9_0;
        }
    }

    public vna() {
        this.field_e = new vg();
        try {
            this.field_e.field_e = this.field_e;
            this.field_e.field_a = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vna.<init>()");
        }
    }

    static {
        field_d = new String[11][];
        field_a = new su(10, 2, 2, 0);
    }
}
