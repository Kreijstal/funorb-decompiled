/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends t {
    static float[] field_C;
    static String field_F;
    private int field_D;
    static float[] field_H;
    static int field_I;
    static va field_B;
    static le[] field_E;
    static String field_L;
    static String field_K;
    private kf field_J;

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        na var8;
        int var9;
        int var10;
        int var11;
        le var12;
        le var13;
        le var14;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            L1: {
              L2: {
                var5 = param3 + this.field_r - -(this.field_l >> 1468482689);
                var6 = (this.field_p >> 1464415297) + this.field_e + param2;
                var8 = this.field_J.b(false);
                if (var8 == ke.field_d) {
                  break L2;
                } else {
                  if (f.field_g != var8) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  var12 = hk.field_i[0];
                  var9 = var12.field_m << -951602431;
                  var10 = var12.field_n << 591028673;
                  if (null == wi.field_e) {
                    break L4;
                  } else {
                    if (wi.field_e.field_k < var9) {
                      break L4;
                    } else {
                      if (wi.field_e.field_j < var10) {
                        break L4;
                      } else {
                        mc.a(param0 ^ -8495, wi.field_e);
                        ge.d();
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                wi.field_e = new le(var9, var10);
                mc.a(-8497, wi.field_e);
                break L3;
              }
              var12.b(112, 144, var12.field_m << 1140997188, var12.field_n << 1785401540, -this.field_D << -1405992022, 4096);
              tj.b(653);
              wi.field_e.c(-var12.field_m + var5, -var12.field_n + var6, 256);
              if (var11 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            L5: {
              if (ol.field_h == var8) {
                break L5;
              } else {
                if (var8 != wj.field_i) {
                  break L0;
                } else {
                  var13 = hk.field_i[1];
                  var13.c(var5 + -(var13.field_k >> -1966904863), -(var13.field_j >> -1192748447) + var6, 256);
                  if (var11 == 0) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var14 = hk.field_i[2];
            var14.c(-(var14.field_k >> -2106367167) + var5, var6 - (var14.field_j >> 947155105), 256);
            break L0;
          }
          return;
        }
    }

    final String a(byte param0) {
        if (!(!this.field_g)) {
            return this.field_J.b((byte) 82);
        }
        if (param0 == 54) {
            return null;
        }
        vh.a(-25);
        return null;
    }

    final static boolean a(int[] param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_25_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        nh var4_ref_nh = null;
        int var4 = 0;
        int var5_int = 0;
        nh var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (wh.field_b == dk.field_h) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var2_long = pf.a(0);
                        if (ff.field_g == 0) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1 >= (sb.field_f ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_ref_nh = (nh) ((Object) cb.field_a.a((byte) -117));
                        if (var4_ref_nh == null) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2_long > var4_ref_nh.field_e) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_ref_nh.c(-19822);
                        rc.field_f = var4_ref_nh.field_h.length;
                        MonkeyPuzzle2.field_D.field_h = 0;
                        var5_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5_int >= rc.field_f) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        MonkeyPuzzle2.field_D.field_g[var5_int] = var4_ref_nh.field_h[var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        bk.field_f = il.field_e;
                        il.field_e = hk.field_l;
                        hk.field_l = wk.field_a;
                        wk.field_a = var4_ref_nh.field_g;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        if (param1 > 120) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    try {
                        if (-1 >= (sb.field_f ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        MonkeyPuzzle2.field_D.field_h = 0;
                        stackIn_28_0 = hj.a(1, true);
                        stackIn_22_0 = stackIn_28_0;
                        if (var7 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!stackIn_22_0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    try {
                        sb.field_f = MonkeyPuzzle2.field_D.r(-118);
                        MonkeyPuzzle2.field_D.field_h = 0;
                        rc.field_f = param0[sb.field_f];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = gb.a(true);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    try {
                        if (-1 != (ff.field_g ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        bk.field_f = il.field_e;
                        il.field_e = hk.field_l;
                        hk.field_l = wk.field_a;
                        wk.field_a = sb.field_f;
                        sb.field_f = -1;
                        stackIn_33_0 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    try {
                        var4 = ff.field_g;
                        if (rc.field_l != 0.0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4 = (int)((double)var4 + pi.field_l.nextGaussian() * rc.field_l);
                        if (var4 < 0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5 = new nh(var2_long + (long)var4, sb.field_f, new byte[rc.field_f]);
                        var6 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (rc.field_f <= var6) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5.field_h[var6] = MonkeyPuzzle2.field_D.field_g[var6];
                        var6++;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var7 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        cb.field_a.a(-8212, var5);
                        sb.field_f = -1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_47_0 = (RuntimeException) (var2);
                    stackIn_46_0 = stackIn_47_0;
                    stackIn_47_1 = new StringBuilder().append("vh.D(");
                    stackIn_46_1 = stackIn_47_1;
                    if (param0 == null) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_48_2 = "{...}";
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_48_2 = "null";
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    throw la.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              var2_int = -111 / ((-67 - param1) / 48);
              ni.a((java.awt.Component) ((Object) param0), (byte) -124);
              ac.a(-117, (java.awt.Component) ((Object) param0));
              if (null == eb.field_A) {
                break L1;
              } else {
                eb.field_A.a(0, (java.awt.Component) ((Object) param0));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("vh.A(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, String param1, byte param2) {
        try {
            int var3_int = -14 % ((16 - param2) / 63);
            if (me.field_f != null) {
                me.field_f.g((byte) -75);
            }
            j.field_e = new qi(param0, param1, false, true, true);
            jh.field_C.c((byte) 67, j.field_e);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vh.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
            this.field_D = this.field_D + 1;
            if (param3 >= -13) {
                int[] var6 = (int[]) null;
                vh.a((int[]) null, (byte) -48);
            }
            super.a(param0, param1, param2, (byte) -44);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean c(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 < -23) {
            break L0;
          } else {
            field_C = (float[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (si.field_o == null) {
              break L2;
            } else {
              if (null == si.field_o.j(-50)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_I = -126;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vh.AA(");

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a(int param0) {
        field_B = null;
        field_H = null;
        field_F = null;
        field_E = null;
        field_C = null;
        field_K = null;
        if (param0 != -9473) {
            vh.a(-33);
        }
        field_L = null;
    }

    vh(kf param0) {
        try {
            this.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_F = "Fullscreen";
        field_C = new float[65536];
        field_H = new float[65536];
        for (var0 = 0; var0 < 65536; var0++) {
            field_C[var0] = (float)Math.sin(3.141592653589793 * (double)var0 / 32768.0);
            field_H[var0] = (float)Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
        field_E = new le[5];
        field_L = "Quit to website";
        field_K = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
