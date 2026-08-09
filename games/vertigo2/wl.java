/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    final static void a(boolean param0, boolean param1, byte param2, int param3, v param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              L2: {
                he.field_u[0] = j.field_r.nextInt();
                he.field_u[1] = j.field_r.nextInt();
                he.field_u[2] = (int)(dc.field_F >> -294901600);
                iq.field_x.field_u = 0;
                he.field_u[3] = (int)dc.field_F;
                iq.field_x.e(he.field_u[0], 0);
                iq.field_x.e(he.field_u[1], 0);
                iq.field_x.e(he.field_u[2], 0);
                iq.field_x.e(he.field_u[3], 0);
                cn.a(iq.field_x, 117);
                iq.field_x.d(param3, -1783);
                param4.a(iq.field_x, 47);
                uh.field_Wb.field_u = 0;
                if (!param0) {
                  break L2;
                } else {
                  uh.field_Wb.f(18, 95);
                  if (!Vertigo2.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              uh.field_Wb.f(16, 78);
              break L1;
            }
            L3: {
              uh.field_Wb.field_u = uh.field_Wb.field_u + 2;
              var5_int = uh.field_Wb.field_u;
              uh.field_Wb.e(ng.field_c, 0);
              uh.field_Wb.a((byte) -116, ff.field_d);
              var6 = 0;
              if (!pl.field_i) {
                break L3;
              } else {
                var6 = var6 | 1;
                break L3;
              }
            }
            L4: {
              if (!lm.field_G) {
                break L4;
              } else {
                var6 = var6 | 4;
                break L4;
              }
            }
            L5: {
              if (!param1) {
                break L5;
              } else {
                var6 = var6 | 8;
                break L5;
              }
            }
            L6: {
              if (go.field_g != null) {
                var6 = var6 | 16;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              uh.field_Wb.f(var6, -127);
              var7 = vq.a(ob.e((byte) 66), (byte) 114);
              if (null != var7) {
                break L7;
              } else {
                var7 = "";
                break L7;
              }
            }
            L8: {
              uh.field_Wb.a((byte) 0, var7);
              if (go.field_g != null) {
                uh.field_Wb.a(684868900, go.field_g);
                break L8;
              } else {
                break L8;
              }
            }
            var8 = -1 % ((param2 - 22) / 34);
            mq.a(jm.field_H, uh.field_Wb, lp.field_E, 12, iq.field_x);
            uh.field_Wb.a((byte) -116, uh.field_Wb.field_u - var5_int);
            lf.d(50, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("wl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final static void a(jp param0, boolean param1, int param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 >= 49) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_int = d.b(-110, 3 * (-param2 + param4));
                        var6 = param2 * 3;
                        var7 = -10 + var5_int;
                        vq.a(256);
                        if (-1 <= (param0.field_G ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != param0.field_x) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        go.b(59);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ja.field_a = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((param0.field_w ^ -1) >= (var8 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param0.field_p[var8];
                        var10 = param0.field_L[var8];
                        var11 = param0.field_c[var8];
                        stackOut_12_0 = param1;
                        stackIn_44_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!stackIn_13_0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = nj.field_a[var9];
                        var13 = ml.field_t[var9];
                        var14 = nj.field_a[var10] + -var12;
                        var15 = -var12 + nj.field_a[var11];
                        var16 = -var13 + ml.field_t[var10];
                        var17 = ml.field_t[var11] + -var13;
                        if (-(var15 * var16) + var14 * var17 >= 0) {
                            statePc = 42;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = pk.field_v[var9];
                        if (-2147483648 == var12) {
                            statePc = 42;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var13 = pk.field_v[var10];
                        if (-2147483648 == var13) {
                            statePc = 42;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var14 = pk.field_v[var11];
                        if (var14 == -2147483648) {
                            statePc = 42;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var15 = -var6 + (var13 + var12 - -var14);
                        if (-1 < (var7 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_24_0 = var15 >> var7;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = var15 << -var7;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var16 = -stackIn_24_0 + eb.field_g.length - 1;
                        var17 = eb.field_g[var16];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1 == (var17 >> -1600212028 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16--;
                        stackIn_34_0 = var16 ^ -1;
                        stackIn_27_0 = stackIn_34_0;
                        stackIn_34_1 = -1;
                        stackIn_27_1 = stackIn_34_1;
                        if (var19 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 > stackIn_27_1) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var17 = eb.field_g[var16];
                        if (var19 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = var16 << -1510813276;
                        stackIn_34_1 = -var17;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var18 = stackIn_34_0 - stackIn_34_1;
                        ac.field_K[var18] = var8;
                        eb.field_g[var16] = var17 + 1;
                        if (param0.field_G <= 0) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param0.field_x != null) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        dupTemp$0 = param0.field_x[var8];
                        oq.field_F[dupTemp$0] = oq.field_F[dupTemp$0] + 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ja.field_a = ja.field_a + 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = param0.field_G;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 <= 0) {
                            statePc = 60;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == param0.field_x) {
                            statePc = 60;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((oq.field_F.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var10 = oq.field_F[var9];
                        oq.field_F[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_58_0 = (RuntimeException) (var5);
                    stackIn_56_0 = stackIn_58_0;
                    stackIn_58_1 = new StringBuilder().append("wl.B(");
                    stackIn_56_1 = stackIn_58_1;
                    if (param0 == null) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_59_2 = "{...}";
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_59_2 = "null";
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    throw wn.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
