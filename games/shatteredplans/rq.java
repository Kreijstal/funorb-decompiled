/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq implements iq {
    static String field_c;
    static int[] field_j;
    static int field_i;
    static int field_e;
    static qr field_b;
    private nq field_f;
    static bc field_g;
    static String field_h;
    private int field_a;
    private int field_d;

    public static void b(int param0) {
        field_c = null;
        if (param0 >= -47) {
            return;
        }
        try {
            field_h = null;
            field_g = null;
            field_j = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "rq.B(" + param0 + ')');
        }
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_k) {
                  break L2;
                } else {
                  if (!param0.f(1)) {
                    stackIn_8_0 = 2188450;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_8_0 = 3249872;
              break L1;
            }
            L3: {
              var6_int = stackIn_8_0;
              this.field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_s + "</u>", param1 - -param0.field_m, param3 - -param0.field_q, param0.field_x, param0.field_n, var6_int, -1, this.field_a, this.field_d, this.field_f.field_q + this.field_f.field_J);
              if (!param0.f(1)) {
                break L3;
              } else {
                L4: {
                  L5: {
                    var7 = this.field_f.c(param0.field_s);
                    var8 = this.field_f.field_J + this.field_f.field_q;
                    var9 = param0.field_m + param1;
                    if (-3 != (this.field_a ^ -1)) {
                      break L5;
                    } else {
                      var9 = var9 + (-var7 + param0.field_x);
                      if (var11 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((this.field_a ^ -1) == -2) {
                    var9 = var9 + (-var7 + param0.field_x >> 2024047073);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  L7: {
                    var10 = param0.field_q + param3;
                    if (-3 == (this.field_d ^ -1)) {
                      break L7;
                    } else {
                      if (-2 == (this.field_d ^ -1)) {
                        var10 = var10 + (-var8 + param0.field_n >> -57161311);
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var10 = var10 + (param0.field_n - var8);
                  break L6;
                }
                dd.a(var8, 1, var7 + 4, -2 + var9, var10 + 2);
                break L3;
              }
            }
            L8: {
              if (param4 == 12) {
                break L8;
              } else {
                rq.a(true, -120, true);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("rq.E(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static bi[] a(int param0) {
        bi[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        bi[] stackIn_14_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = new bi[en.field_c];
                        var2 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 >= en.field_c) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = mc.field_s[var2] * cm.field_g[var2];
                        var4 = hd.field_q[var2];
                        var5 = new int[var3];
                        stackIn_13_0 = 0;
                        stackIn_4_0 = stackIn_13_0;
                        if (var7 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var6 ^ -1) <= (var3 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5[var6] = eo.field_fb[we.a(255, (int) var4[var6])];
                        var6++;
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var1[var2] = new bi(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], var5);
                        var2++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = param0 + param0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        pd.a(stackIn_13_0);
                        stackIn_14_0 = (bi[]) (var1);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw r.a((Throwable) ((Object) var1_ref), "rq.C(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ve a(boolean param0, int param1, boolean param2) {
        ub stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        ub stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        ub stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_21_0 = 0;
        qr stackIn_44_0 = null;
        qr stackIn_46_0 = null;
        qr stackIn_47_0 = null;
        String stackIn_47_1 = null;
        qr stackIn_48_0 = null;
        qr stackIn_50_0 = null;
        qr stackIn_51_0 = null;
        String stackIn_51_1 = null;
        int stackIn_55_0 = 0;
        Object stackIn_102_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pf var4 = null;
        Object var5 = null;
        Object var6 = null;
        ve var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        fc var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = d.field_a.field_Db;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = param1 * ((cr.field_c + 2) * 3);
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = cr.field_c + 2;
                        stackIn_2_2 = stackIn_4_2;
                        if (hp.field_l != d.field_a.field_Db) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (ub) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (ub) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((ub) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3 != 0, -103, param2, 2) ? 1 : 0;
                        var4 = d.field_a.field_Eb.field_M;
                        if (param0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_e = 100;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = null;
                        if (2 == po.field_b) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        cg.field_A.field_s = false;
                        rj.field_p.field_z = ea.field_d;
                        if (-2 != (po.field_b ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        d.field_a.field_Db.field_zb.field_z = km.field_X;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        d.field_a.field_Db.field_zb.field_z = tb.field_c;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_21_0 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        fj.a(stackIn_21_0 != 0, d.field_a.field_Eb);
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        cg.field_A.field_s = true;
                        rj.field_p.field_z = re.a(af.field_b, 4371, new String[]{jo.field_d});
                        d.field_a.field_Db.field_zb.field_z = null;
                        var6 = null;
                        var7 = (ve) ((Object) var4.d(0));
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var7 == null) {
                            statePc = 95;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null != var7.field_M) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7.field_Cb = new qr(0L, ek.field_E);
                        var7.a(4, var7.field_Cb);
                        var7.field_Fb = new qr(0L, oj.field_zb);
                        var7.a(4, var7.field_Fb);
                        var7.field_Db = new qr(0L, ek.field_E);
                        var7.a(4, var7.field_Db);
                        var7.field_Fb.field_y = 2;
                        var8 = 1;
                        var7.e((byte) -125);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7.field_K = d.field_a.field_Eb.field_K;
                        var9 = 0;
                        if (var7.field_xb != null) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        if (var19 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (jo.field_d != var7.field_xb) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var12 = 0;
                        if (var7.field_Bb == null) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var7.field_Bb.equals("")) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7.field_Db.field_pb = ke.field_i;
                        var7.field_Db.field_jb = var11;
                        var7.field_Db.a(ke.field_i.field_o + 3, cr.field_c, (byte) 88, var9, 0);
                        var12 = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7.field_Fb.field_x = var10;
                        var7.field_Cb.field_x = var10;
                        var7.field_Fb.field_jb = var11;
                        var7.field_Cb.field_jb = var11;
                        var7.field_Fb.field_qb = var11;
                        var7.field_Cb.field_qb = var11;
                        var7.field_Fb.field_ab = var11;
                        var7.field_Cb.field_ab = var11;
                        var13 = 0;
                        var14 = -2 + var7.field_K - 80;
                        if (var12 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var13 = 3 + ke.field_i.field_o;
                        var14 = var14 - var13;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = var7.field_Cb;
                        stackIn_44_0 = stackIn_46_0;
                        if (var14 > 0) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_47_0 = (qr) ((Object) stackIn_44_0);
                        stackIn_47_1 = var7.field_Ab;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = (qr) ((Object) stackIn_46_0);
                        stackIn_47_1 = nq.a(var7.field_Cb.field_nb, var7.field_Ab, var14);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_47_0.field_z = stackIn_47_1;
                        var7.field_Cb.a(var14, cr.field_c, (byte) 110, var9, var13);
                        stackIn_50_0 = var7.field_Fb;
                        stackIn_48_0 = stackIn_50_0;
                        if (null != var7.field_xb) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_51_0 = (qr) ((Object) stackIn_48_0);
                        stackIn_51_1 = jj.field_p;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = (qr) ((Object) stackIn_50_0);
                        stackIn_51_1 = var7.field_xb;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_51_0.field_z = stackIn_51_1;
                        var7.field_Fb.a(80, cr.field_c, (byte) 109, var9, -80 + var7.field_K);
                        if (var7.field_Cb.field_z.equals(var7.field_Ab)) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 103;
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
                        statePc = 103;
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var15 = stackIn_55_0;
                        var9 = var9 + cr.field_c;
                        if (var3_int != 0) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7.field_gb = -var7.field_mb + var9;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var8 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        d.field_a.field_Eb.a(2, (qr) (var6), var7, (byte) 98);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var7.field_Db == null) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var7.field_Db.field_L) {
                            statePc = 92;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((var7.field_rb ^ -1) == -1) {
                            statePc = 83;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var16 = var7.field_Ab;
                        tp.a((int[]) null, 0L, (String) null, var16, 293, d.field_a.field_Db, var7, -1, -1);
                        if (null == var7.field_xb) {
                            statePc = 82;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (fs.a(62, hp.field_m.field_k)) {
                            statePc = 82;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!bg.field_g) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (!ae.field_b) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var17 = hp.field_m;
                        var18 = re.a(tk.field_B, 4371, new String[]{var16});
                        var17.field_j.a(1, 8, var18);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var17 = hp.field_m;
                        var18 = re.a(se.field_e, 4371, new String[]{var16});
                        var17.field_j.a(1, 18, var18);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var5 = var7;
                        if (var19 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (!var7.field_Cb.field_L) {
                            statePc = 94;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var15 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        dn.field_k = var7.field_Ab;
                        if (var19 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        dn.field_k = var7.field_Bb;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var6 = var7;
                        var7 = (ve) ((Object) var4.a((byte) -71));
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (-1 == (d.field_a.field_Fb.field_rb ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        lg.field_e = new jp(d.field_a.field_Fb.field_B, d.field_a.field_Fb.field_N, d.field_a.field_Fb.field_K, d.field_a.field_Fb.field_mb, km.field_A, h.field_v, ii.field_u, ii.field_u);
                        ia.field_b = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (0 == d.field_a.field_yb.field_rb) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        lg.field_e = new jp(d.field_a.field_yb.field_B, d.field_a.field_yb.field_N, d.field_a.field_yb.field_K, d.field_a.field_yb.field_mb, on.field_f, h.field_v, ii.field_u, ii.field_u);
                        ia.field_b = 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = var5;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    return (ve) ((Object) stackIn_102_0);
                }
                case 103: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw r.a((Throwable) ((Object) var3), "rq.D(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public rq() {
        try {
            this.field_f = gn.field_u;
            this.field_a = 1;
            this.field_d = 1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "rq.<init>()");
        }
    }

    rq(nq param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_f = param0;
            this.field_a = param1;
            this.field_d = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("rq.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                mg.field_C = false;
                var1_int = -1 / ((-28 - param0) / 57);
                tl.field_z = null;
                if (!el.field_b) {
                  break L2;
                } else {
                  ji.field_G.p(-7011);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var2 = tf.field_n;
                if ((var2 ^ -1) >= -1) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (1 == var2) {
                        break L5;
                      } else {
                        tl.field_z = re.a(ia.field_M, 4371, new String[]{Integer.toString(var2)});
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    tl.field_z = kf.field_h;
                    break L4;
                  }
                  tl.field_z = lr.a(88, new CharSequence[]{(CharSequence) ((Object) tl.field_z), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) pr.field_b)});
                  break L3;
                }
              }
              ji.field_G.i((byte) -104);
              ig.a(7655);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "rq.A(" + param0 + ')');
        }
    }

    static {
        field_i = 0;
        field_e = 0;
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_h = "Waiting for fonts";
        field_c = "Fleets lost";
    }
}
