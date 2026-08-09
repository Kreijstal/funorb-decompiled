/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends IOException {
    static int field_a;
    static int field_b;

    final static mi a(byte[] param0, int param1, ii[] param2) {
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[][] var21 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (256 == param2.length) {
              var17 = new int[256];
              var12 = var17;
              var11 = var12;
              var3 = var11;
              var5 = -98 / ((-28 - param1) / 54);
              var18 = new int[256];
              var13 = var18;
              var4 = var13;
              var19 = new int[256];
              var14 = var19;
              var6 = var14;
              var20 = new int[256];
              var15 = var20;
              var7 = var15;
              var21 = new byte[256][];
              var16 = var21;
              var8 = var16;
              var9 = 0;
              L1: while (true) {
                L2: {
                  if (var9 >= 256) {
                    break L2;
                  } else {
                    var11[var9] = param2[var9].field_c;
                    var4[var9] = param2[var9].field_b;
                    var6[var9] = param2[var9].field_f;
                    var7[var9] = param2[var9].field_g;
                    var8[var9] = param2[var9].field_i;
                    var9++;
                    if (var10 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_7_0 = new mi(param0, var17, var18, var19, var20, var21);
                break L0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("jd.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(byte param0) {
        int var1 = -128 / ((-25 - param0) / 47);
    }

    jd(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, ti[] param2, int param3, int param4, int param5, kg param6, int param7, int param8, ti[] param9, boolean param10) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              je.a(-11);
              if (!param10) {
                break L1;
              } else {
                field_a = -111;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jd.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ',' + param10 + ')');
        }
    }

    final static int a(int param0, hg param1, byte param2, String param3, int param4, boolean param5, hg param6) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        oa stackIn_12_0 = null;
        oa stackIn_13_0 = null;
        oa stackIn_14_0 = null;
        String stackIn_14_1 = null;
        oa stackIn_15_0 = null;
        oa stackIn_16_0 = null;
        oa stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var14 = param6.a(false);
                        var8 = param1.a(false);
                        if (param2 == -9) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -40;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (null != nk.field_b) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (gk.a(false, 127)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (lj.field_z == jk.field_y) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ch.field_f = null;
                        ff.field_D.field_h = 0;
                        if (param3 != null) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        d.field_d.field_h = 0;
                        d.field_d.a(param2 + -96, d.field_c.nextInt());
                        d.field_d.a(-103, d.field_c.nextInt());
                        stackIn_13_0 = d.field_d;
                        stackIn_12_0 = stackIn_13_0;
                        if (param6.a((byte) -121)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_14_0 = (oa) ((Object) stackIn_12_0);
                        stackIn_14_1 = "";
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = (oa) ((Object) stackIn_13_0);
                        stackIn_14_1 = (String) (var14);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((oa) (Object) stackIn_14_0).a(stackIn_14_1, 126);
                        stackIn_16_0 = d.field_d;
                        stackIn_15_0 = stackIn_16_0;
                        if (param1.a((byte) -121)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = (oa) ((Object) stackIn_15_0);
                        stackIn_17_1 = "";
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = (oa) ((Object) stackIn_16_0);
                        stackIn_17_1 = (String) (var8);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((oa) (Object) stackIn_17_0).a(stackIn_17_1, param2 ^ -117);
                        ff.field_D.f(6389, 16);
                        ff.field_D.field_h = ff.field_D.field_h + 1;
                        var9 = ff.field_D.field_h;
                        bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -108, d.field_d);
                        ff.field_D.a((byte) -42, -var9 + ff.field_D.field_h);
                        if (var13 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = 0;
                        if (param5) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = var9 | 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        d.field_d.field_h = 0;
                        d.field_d.a(param2 + -94, d.field_c.nextInt());
                        d.field_d.a(param2 ^ 110, d.field_c.nextInt());
                        d.field_d.a(var14, 123);
                        d.field_d.a(var8, 125);
                        var15 = (CharSequence) ((Object) param3);
                        d.field_d.a(ob.a((byte) 107, var15), param2 ^ -120);
                        d.field_d.c(param4, -159688920);
                        d.field_d.f(6389, param0);
                        d.field_d.f(6389, var9);
                        ff.field_D.f(6389, 18);
                        ff.field_D.field_h = ff.field_D.field_h + 2;
                        var10 = ff.field_D.field_h;
                        var11_ref_String = wk.a(ha.b(116), (byte) -45);
                        if (var11_ref_String == null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11_ref_String = "";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ff.field_D.a(92, var11_ref_String);
                        bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -123, d.field_d);
                        ff.field_D.b(-109, ff.field_D.field_h - var10);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        rb.a(-1, -377);
                        lj.field_z = vf.field_b;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (vf.field_b != lj.field_z) {
                            statePc = 39;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!ue.a(1, 0)) {
                            statePc = 39;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = nf.field_l.d((byte) 97);
                        nf.field_l.field_h = 0;
                        if (-101 < (var9 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (-106 > (var9 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        lj.field_z = aa.field_b;
                        wh.field_F = new String[var9 + -100];
                        if (var13 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-249 != (var9 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        tb.a(ha.b(param2 ^ -66), true);
                        Transmogrify.field_B = nj.field_j;
                        pc.a(1);
                        ej.field_k = false;
                        stackIn_34_0 = var9;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    try {
                        if (99 != var9) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ue.a(jk.a((byte) -114), 0);
                        ch.field_f = new Boolean(oh.a((byte) -87, nf.field_l));
                        nf.field_l.field_h = 0;
                        if (var13 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        lj.field_z = gg.field_f;
                        tg.field_a = -1;
                        ca.field_e = var9;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (aa.field_b != lj.field_z) {
                            statePc = 51;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = 2;
                        if (ue.a(var9, 0)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10 = nf.field_l.a((byte) -102);
                        nf.field_l.field_h = 0;
                        if (!ue.a(var10, 0)) {
                            statePc = 51;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = wh.field_F.length;
                        var12 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var11 <= var12) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        wh.field_F[var12] = nf.field_l.e(26);
                        var12++;
                        if (var13 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var13 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        pc.a(1);
                        ej.field_k = false;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = var11 + 100;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 50: {
                    return stackIn_50_0;
                }
                case 51: {
                    try {
                        if (gg.field_f == lj.field_z) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (ce.a(0)) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (-256 == (ca.field_e ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        Transmogrify.field_B = nf.field_l.g(param2 + 12257);
                        if (var13 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var9_ref_String = nf.field_l.j(-1640531527);
                        if (var9_ref_String == null) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        v.a(0, var9_ref_String, ha.b(114));
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        pc.a(1);
                        ej.field_k = false;
                        stackIn_61_0 = ca.field_e;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 61: {
                    return stackIn_61_0;
                }
                case 62: {
                    try {
                        if (null != nk.field_b) {
                            statePc = 71;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (ej.field_k) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var9 = lf.field_c;
                        lf.field_c = kf.field_p;
                        kf.field_p = var9;
                        ej.field_k = true;
                        if (var13 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((mc.b(true) ^ -1L) >= -30001L) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        Transmogrify.field_B = ng.field_h;
                        if (var13 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        Transmogrify.field_B = bd.field_s;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ej.field_k = false;
                        stackIn_70_0 = 249;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    return stackIn_70_0;
                }
                case 71: {
                    try {
                        stackIn_72_0 = -1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    return stackIn_72_0;
                }
                case 73: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_75_0 = (RuntimeException) (var7);
                    stackIn_74_0 = stackIn_75_0;
                    stackIn_75_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
                    stackIn_74_1 = stackIn_75_1;
                    if (param1 == null) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_76_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_76_2 = "{...}";
                    statePc = 76;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_76_2 = "null";
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',').append(param2).append(',');
                    stackIn_77_1 = stackIn_78_1;
                    if (param3 == null) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_0 = stackIn_81_0;
                    stackIn_81_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_80_1 = stackIn_81_1;
                    if (param6 == null) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_82_2 = "{...}";
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_82_2 = "null";
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw ch.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
