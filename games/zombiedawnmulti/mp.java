/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mp {
    static ak field_b;
    static String field_a;
    static String field_c;
    td[] field_e;
    static String field_d;

    final int a(int param0, int param1) {
        td[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        td var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = this.field_e;
            if (param0 == 52224) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var4 ^ -1) <= (var3.length ^ -1)) {
                      break L3;
                    } else {
                      var5 = var3[var4];
                      stackIn_14_0 = param1 ^ -1;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_14_0 <= (var5.field_e.length ^ -1)) {
                          param1 = param1 - (var5.field_e.length - 1);
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackIn_11_0 = var5.field_e[param1];
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_14_0 = 0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = -3;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "mp.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int var4_int = 0;
        try {
            pm.field_R.field_j = param0;
            pm.field_R.a(param0 ^ -108, 12);
            pm.field_R.b(-114, c.field_c.nextInt());
            pm.field_R.b(-118, c.field_c.nextInt());
            pm.field_R.a(123, param2);
            pm.field_R.a(-67, param1);
            pm.field_R.a(param3, (byte) -128);
            pm.field_R.a(tp.field_v, -2628, gn.field_L);
            ma.field_a.b((byte) -35, 18);
            fieldTemp$0 = ma.field_a.field_j + 1;
            ma.field_a.field_j = ma.field_a.field_j + 1;
            var4_int = fieldTemp$0;
            ma.field_a.a(pm.field_R.field_m, pm.field_R.field_j, 0, 126);
            ma.field_a.e(72, -var4_int + ma.field_a.field_j);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mp.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -111) {
                break L1;
              } else {
                mp.a(68);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_e == null) {
                  break L3;
                } else {
                  if (-1 > (this.field_e.length ^ -1)) {
                    stackIn_10_0 = this.field_e[this.field_e.length - 1].field_h - this.field_e[0].field_d;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "mp.A(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final static ml a(int param0, boolean param1, byte param2) {
        tq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        int stackIn_2_3 = 0;
        tq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_4_3 = 0;
        tq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        cj stackIn_32_0 = null;
        cj stackIn_34_0 = null;
        cj stackIn_35_0 = null;
        String stackIn_35_1 = null;
        cj stackIn_36_0 = null;
        cj stackIn_38_0 = null;
        cj stackIn_39_0 = null;
        String stackIn_39_1 = null;
        int stackIn_43_0 = 0;
        Object stackIn_101_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        th var4 = null;
        Object var5 = null;
        Object var6 = null;
        ml var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        jb var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = eg.field_B.field_Jb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = 2;
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = param1;
                        stackIn_2_2 = stackIn_4_2;
                        stackIn_4_3 = 2 + jk.field_f;
                        stackIn_2_3 = stackIn_4_3;
                        if (eg.field_B.field_Jb != vc.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (tq) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = stackIn_2_3;
                        stackIn_5_4 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (tq) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = stackIn_4_3;
                        stackIn_5_4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((tq) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, (jk.field_f * 3 + 6) * param0, -106) ? 1 : 0;
                        var4 = eg.field_B.field_Ib.field_Cb;
                        var5 = null;
                        if (2 != ge.field_zb) {
                            statePc = 90;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        pa.field_O.field_Z = true;
                        dp.field_b.field_wb = vl.a(kg.field_m, new String[]{ta.field_ob}, 2);
                        eg.field_B.field_Jb.field_Jb.field_wb = null;
                        var6 = null;
                        var7 = (ml) ((Object) var4.c(42));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == null) {
                            statePc = 83;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null != var7.field_Cb) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7.field_Ib = new cj(0L, m.field_x);
                        var7.a((byte) 50, var7.field_Ib);
                        var7.field_Fb = new cj(0L, wc.field_H);
                        var7.a((byte) 50, var7.field_Fb);
                        var7.field_Gb = new cj(0L, m.field_x);
                        var7.a((byte) 50, var7.field_Gb);
                        var7.field_Fb.field_R = 2;
                        var7.f(-128);
                        var8 = 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7.field_zb = eg.field_B.field_Ib.field_zb;
                        var9 = 0;
                        if (var7.field_Nb != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        if (var19 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7.field_Nb != ta.field_ob) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = 0;
                        if (var7.field_Kb == null) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!var7.field_Kb.equals("")) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7.field_Gb.field_rb = pa.field_T;
                        var7.field_Gb.field_ob = var11;
                        var7.field_Gb.a(jk.field_f, var9, 3 + pa.field_T.field_z, 0, -3344);
                        var12 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7.field_Fb.field_ob = var11;
                        var7.field_Ib.field_ob = var11;
                        var7.field_Fb.field_M = var10;
                        var7.field_Ib.field_M = var10;
                        var7.field_Fb.field_Db = var11;
                        var7.field_Ib.field_Db = var11;
                        var7.field_Fb.field_xb = var11;
                        var7.field_Ib.field_xb = var11;
                        var13 = 0;
                        var14 = -80 + (var7.field_zb + -2);
                        if (var12 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var13 = 3 + pa.field_T.field_z;
                        var14 = var14 - var13;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_34_0 = var7.field_Ib;
                        stackIn_32_0 = stackIn_34_0;
                        if (0 >= var14) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_35_0 = (cj) ((Object) stackIn_32_0);
                        stackIn_35_1 = fm.a(var7.field_Ib.field_yb, var7.field_Hb, var14);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = (cj) ((Object) stackIn_34_0);
                        stackIn_35_1 = var7.field_Hb;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_35_0.field_wb = stackIn_35_1;
                        var7.field_Ib.a(jk.field_f, var9, var14, var13, -3344);
                        stackIn_38_0 = var7.field_Fb;
                        stackIn_36_0 = stackIn_38_0;
                        if (var7.field_Nb != null) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_39_0 = (cj) ((Object) stackIn_36_0);
                        stackIn_39_1 = pi.field_c;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = (cj) ((Object) stackIn_38_0);
                        stackIn_39_1 = var7.field_Nb;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_39_0.field_wb = stackIn_39_1;
                        var7.field_Fb.a(jk.field_f, var9, 80, -80 + var7.field_zb, -3344);
                        if (var7.field_Ib.field_wb.equals(var7.field_Hb)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_43_0 = 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var15 = stackIn_43_0;
                        var9 = var9 + jk.field_f;
                        if (var3_int == 0) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7.field_I = var9 - var7.field_z;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var8 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        eg.field_B.field_Ib.a(2, var7, 1300, (cj) (var6));
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var7.field_Gb == null) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var7.field_Gb.field_L) {
                            statePc = 80;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var7.field_T != 0) {
                            statePc = 67;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!var7.field_Ib.field_L) {
                            statePc = 82;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var15 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        ui.field_j = var7.field_Hb;
                        if (var19 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var16 = var7.field_Hb;
                        ve.a(0L, param2 + 315, (String) null, eg.field_B.field_Jb, var16, var7, -1, (int[]) null, -1);
                        if (var7.field_Nb == null) {
                            statePc = 79;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (cq.a(pk.field_b.field_f, -124)) {
                            statePc = 79;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (nh.field_m) {
                            statePc = 79;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (sh.field_L) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var17 = pk.field_b;
                        var18 = vl.a(jk.field_i, new String[]{var16}, 2);
                        var17.field_j.a((byte) -118, var18, 8);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var17 = pk.field_b;
                        var18 = vl.a(field_c, new String[]{var16}, param2 ^ -117);
                        var17.field_j.a((byte) -118, var18, 18);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var5 = var7;
                        if (var19 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ui.field_j = var7.field_Kb;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var6 = var7;
                        var7 = (ml) ((Object) var4.b(6));
                        if (var19 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (-1 == (eg.field_B.field_Gb.field_T ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        gi.field_i = new dk(eg.field_B.field_Gb.field_w, eg.field_B.field_Gb.field_qb, eg.field_B.field_Gb.field_zb, eg.field_B.field_Gb.field_z, ud.field_Z, kd.field_a, vo.field_m, vo.field_m);
                        ic.field_e = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((eg.field_B.field_Hb.field_T ^ -1) == -1) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        gi.field_i = new dk(eg.field_B.field_Hb.field_w, eg.field_B.field_Hb.field_qb, eg.field_B.field_Hb.field_zb, eg.field_B.field_Hb.field_z, fe.field_Q, kd.field_a, vo.field_m, vo.field_m);
                        ic.field_e = 1;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        pa.field_O.field_Z = false;
                        dp.field_b.field_wb = op.field_l;
                        if (1 != ge.field_zb) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        eg.field_B.field_Jb.field_Jb.field_wb = rg.field_D;
                        if (var19 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        eg.field_B.field_Jb.field_Jb.field_wb = hj.field_e;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        ob.a(eg.field_B.field_Ib, 41);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (param2 == -119) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        mp.a(81, true, (byte) -50);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_101_0 = var5;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    return (ml) ((Object) stackIn_101_0);
                }
                case 102: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var3), "mp.G(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param1;
                        var6 = 0;
                        var7 = param0.length();
                        var8 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var8 ^ -1) <= (var7 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = param0.charAt(var8);
                        stackIn_22_0 = 60;
                        stackIn_4_0 = stackIn_22_0;
                        stackIn_22_1 = var9;
                        stackIn_4_1 = stackIn_22_1;
                        if (var10 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != stackIn_4_1) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = 1;
                        if (var10 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var9 != 62) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (32 != var9) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_int++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = -1;
                        stackIn_22_1 = var5_int ^ -1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 > stackIn_22_1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = (param3 + -param2 << 431260488) / var5_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    try {
                        stackIn_27_0 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var5);
                    stackIn_29_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("mp.F(");
                    stackIn_29_1 = stackIn_31_1;
                    if (param0 == null) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        td var4 = null;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -126) {
                break L1;
              } else {
                this.b(-6);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((this.field_e.length ^ -1) >= (var3_int ^ -1)) {
                    break L4;
                  } else {
                    var4 = this.field_e[var3_int];
                    stackIn_16_0 = param1 ^ -1;

                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (stackIn_16_0 > (var4.field_e.length ^ -1)) {
                        stackIn_13_0 = var3_int;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        param1 = param1 - (var4.field_e.length + -1);
                        var3_int++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_16_0 = this.field_e.length;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "mp.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_13_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 12) {
            return;
        }
        try {
            field_b = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mp.H(" + param0 + ')');
        }
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var7 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        td[] var3 = null;
        int var4 = 0;
        td var5 = null;
        int var6 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -1;
              if (param0 >= 20) {
                break L1;
              } else {
                this.field_e = (td[]) null;
                break L1;
              }
            }
            L2: {
              if (null != this.field_e) {
                var3 = this.field_e;
                var4 = 0;
                L3: while (true) {
                  if ((var3.length ^ -1) >= (var4 ^ -1)) {
                    break L2;
                  } else {
                    L4: {
                      var5 = var3[var4];
                      if (null == var5) {
                        break L4;
                      } else {
                        var6 = var5.a(-27328);
                        if (var6 > var2_int) {
                          var2_int = var6;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var4++;
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackIn_16_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "mp.B(" + param0 + ')');
        }
        return stackIn_16_0;
    }

    final int a(int param0, byte param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        td var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_e) {
                break L1;
              } else {
                if ((this.field_e.length ^ -1) == -1) {
                  break L1;
                } else {
                  if (param2 >= this.field_e[0].field_d) {
                    if (param1 <= 0) {
                      if (this.field_e[this.field_e.length - 1].field_h >= param2) {
                        if (1 == this.field_e.length) {
                          stackIn_20_0 = this.field_e[0].a(false, param0);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var4_int = 0;
                          var5 = 0;
                          L2: while (true) {
                            L3: {
                              L4: {
                                if ((var5 ^ -1) <= (this.field_e.length ^ -1)) {
                                  break L4;
                                } else {
                                  var6 = this.field_e[var5];
                                  stackIn_39_0 = param2;

                                  if (var8 != 0) {
                                    break L3;
                                  } else {
                                    L5: {
                                      if (stackIn_39_0 < var6.field_d) {
                                        break L5;
                                      } else {
                                        if ((param2 ^ -1) < (var6.field_h ^ -1)) {
                                          break L5;
                                        } else {
                                          var7 = var6.a(false, param0);
                                          if (-1 == var7) {
                                            stackIn_34_0 = -1;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            stackIn_36_0 = var4_int - -var7;
                                            decompiledRegionSelector0 = 6;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                    var4_int = var4_int + (-1 + var6.field_e.length);
                                    var5++;
                                    if (var8 == 0) {
                                      continue L2;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              stackIn_39_0 = -1;
                              break L3;
                            }
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_15_0 = -1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      stackIn_12_0 = -76;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_9_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "mp.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_a = "Waiting for <%0> to start the game...";
        field_c = "Send private Quick Chat to <%0>";
        field_b = new ak();
        field_d = "Open in popup window";
    }
}
