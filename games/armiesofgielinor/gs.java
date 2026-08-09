/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs implements kh {
    static int field_b;
    static boolean field_a;
    static String[] field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            ds.field_a = new wk[op.field_c[0].length];
            if (param0) {
                field_a = true;
            }
            le.field_c = new wk[op.field_c[0].length];
            rq.a((byte) -56);
            for (var1_int = 0; var1_int < op.field_c[0].length; var1_int++) {
                ds.field_a[var1_int] = new wk(vo.field_d.field_y, vo.field_d.field_v);
                le.field_c[var1_int] = new wk(im.field_y.field_y, im.field_y.field_v);
                ds.field_a[var1_int].b();
                vo.field_d.d(0, 0, op.field_c[0][var1_int]);
                le.field_c[var1_int].b();
                im.field_y.b(0, 0, op.field_c[0][var1_int]);
            }
            rf.b(-18862);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gs.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.field_q = var2.field_q + 1;
        int var3 = var2.field_q;
        var2.b(1, 2);
        var2.a(ln.field_d, 0, ln.field_d.length, 113);
        var2.b(1, nh.field_E);
        var2.b(1, sm.field_b);
        var2.a(tg.field_d, 0, tg.field_d.length, -72);
        if (param1 != -8006) {
            field_b = -111;
        }
        var2.e(-var3 + var2.field_q, 5930);
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            tm.a();
            hg.field_a = new int[260];
            fn.field_M = 11;
            var1_int = 0;
            var2 = -93 / ((-68 - param0) / 57);
            L1: while (true) {
              if (256 <= var1_int) {
                var6 = 256;
                var1_int = var6;
                L2: while (true) {
                  if (var6 >= hg.field_a.length) {
                    break L0;
                  } else {
                    hg.field_a[var6] = 255;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var3 = 15.0;
                hg.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var3) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "gs.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -29 / ((13 - param0) / 56);
        field_c = null;
    }

    final static tu a(String param0, kl param1, kl param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tu stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param1.a(param0, 106);
              var6 = param1.a((byte) -65, var5_int, param4);
              if (param3 == -53) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            stackIn_3_0 = cc.a(param1, var5_int, param2, true, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("gs.G(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int > param0.field_w) {
                L2: {
                  var6_int = 1;
                  if (param2 <= -79) {
                    break L2;
                  } else {
                    var11 = (int[]) null;
                    gs.a((byte) -58, (int[]) null);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (5 < var6_int) {
                    break L0;
                  } else {
                    L4: {
                      var7 = var6_int + (-5 + (param1 + param0.field_B)) + (param0.field_l + -(param0.field_l >> -1259089151));
                      var8 = -(var6_int * 2) + (param0.field_l >> 1935787873);
                      var9 = var6_int + (param4 + (param0.field_p + (-4 + param0.field_w >> 1633679809)));
                      if (var9 < qn.field_a) {
                        break L4;
                      } else {
                        if (qn.field_f <= var9) {
                          break L4;
                        } else {
                          L5: {
                            if (qn.field_j >= var7) {
                              break L5;
                            } else {
                              qn.field_d[var9 * qn.field_l - (-var7 - -1)] = rn.a(qn.field_d[-1 + (var7 + qn.field_l * var9)], 16711422) >> 388280961;
                              break L5;
                            }
                          }
                          if (var8 + var7 >= qn.field_e) {
                            break L4;
                          } else {
                            qn.field_d[qn.field_l * var9 + (var7 - -var8)] = rn.a(16711422, qn.field_d[qn.field_l * var9 + var7 + var8]) >> -236939711;
                            break L4;
                          }
                        }
                      }
                    }
                    qn.e(var7, var9, var8, 0);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                var7 = 152 - -(var6_int * 48 / param0.field_w);
                var8 = var7 | (var7 << -351955376 | var7 << 66422888);
                qn.e(param0.field_B + param1, var6_int + param4 - -param0.field_p, param0.field_l, var8);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("gs.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(byte param0, int[] param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        qu var4_ref_qu = null;
        int var4 = 0;
        int var5_int = 0;
        qu var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 42) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (ov.field_g != kl.field_k) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2_long = vi.b(126);
                        if (dq.field_c == 0) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 > mg.field_f) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_ref_qu = (qu) ((Object) vj.field_b.e((byte) 127));
                        if (var4_ref_qu == null) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var2_long ^ -1L) < (var4_ref_qu.field_l ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_ref_qu.d(-111);
                        fk.field_b = var4_ref_qu.field_m.length;
                        mg.field_e.field_q = 0;
                        var5_int = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (fk.field_b <= var5_int) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        mg.field_e.field_o[var5_int] = var4_ref_qu.field_m[var5_int];
                        var5_int++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        me.field_c = ba.field_F;
                        ba.field_F = sj.field_e;
                        sj.field_e = nm.field_o;
                        nm.field_o = var4_ref_qu.field_o;
                        stackIn_18_0 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    stackIn_22_0 = mg.field_f;
                    statePc = 22;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = mg.field_f;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        stackIn_22_0 = mg.field_f;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 < 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        mg.field_e.field_q = 0;
                        if (es.a(param0 ^ -83, 1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    try {
                        mg.field_f = mg.field_e.m(255);
                        mg.field_e.field_q = 0;
                        fk.field_b = param1[mg.field_f];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!jh.g(2)) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    try {
                        if (dq.field_c == 0) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var4 = dq.field_c;
                        if (0.0 == sp.field_e) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = (int)((double)var4 + iq.field_e.nextGaussian() * sp.field_e);
                        if (0 > var4) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5 = new qu(var2_long + (long)var4, mg.field_f, new byte[fk.field_b]);
                        var6 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var6 >= fk.field_b) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5.field_m[var6] = mg.field_e.field_o[var6];
                        var6++;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        vj.field_b.a((byte) -119, (tc) (var5));
                        mg.field_f = -1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        me.field_c = ba.field_F;
                        ba.field_F = sj.field_e;
                        sj.field_e = nm.field_o;
                        nm.field_o = mg.field_f;
                        mg.field_f = -1;
                        stackIn_42_0 = 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    return stackIn_42_0 != 0;
                }
                case 43: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_45_0 = (RuntimeException) (var2);
                    stackIn_44_0 = stackIn_45_0;
                    stackIn_45_1 = new StringBuilder().append("gs.A(").append(param0).append(',');
                    stackIn_44_1 = stackIn_45_1;
                    if (param1 == null) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    throw ig.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = true;
        field_c = new String[]{"This unit is not carrying any equipment.", "This unit is carrying a flag. As such, it is able to capture a single structure.", "This unit is carrying a grappling hook, enabling it attack flying units.", "This unit is wearing waders, allowing it to better traverse rivers and swamps.", "This unit is wearing boots of Elidinis, allowing it to travel very quickly over water.", "This unit is carrying a ring of life, allowing it to respawn at the nearest unoccupied allied structure when it dies."};
        field_b = 0;
    }
}
