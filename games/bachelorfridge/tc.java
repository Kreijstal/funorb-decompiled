/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    private int field_d;
    kv[] field_c;
    private int field_e;
    private boolean field_b;
    private int field_h;
    kv field_g;
    private int field_a;
    private int field_f;

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            Object var5 = null;
            int discarded$0 = tc.a(false, (gs) null);
        }
        if (!(!hl.field_I)) {
            return ao.field_d.a(dla.field_j, (byte) 7, gf.field_k);
        }
        if (gm.field_k) {
            return wi.a(93, param1, param0);
        }
        if (kf.a(param1, (byte) -89, param0)) {
            return true;
        }
        if (sea.field_j) {
            return false;
        }
        return vaa.a(param2, 1, param1);
    }

    final void a(int param0, tc param1) {
        if (param0 != 8) {
            return;
        }
        param1.field_g = ((tc) this).field_g;
        param1.field_a = ((tc) this).field_a;
        param1.field_b = ((tc) this).field_b;
        param1.field_c = ((tc) this).field_c;
        param1.field_f = ((tc) this).field_f;
        param1.field_e = ((tc) this).field_e;
        param1.field_d = ((tc) this).field_d;
        param1.field_h = ((tc) this).field_h;
    }

    final tc a(byte param0, int param1) {
        ((tc) this).field_d = param1;
        if (param0 != 0) {
            ((tc) this).field_d = 23;
        }
        return (tc) this;
    }

    final tc a(kv[] param0, byte param1) {
        if (param1 != -40) {
            tc.a(-101, -18);
        }
        ((tc) this).field_c = param0;
        return (tc) this;
    }

    final static void b(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        ma var4_ref_ma = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ma var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = BachelorFridge.field_y;
        aca.field_g = new int[]{0, 0, param0, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = gaa.field_i.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              var3 = aca.field_g[9] >> -1863010744;
              var4 = aca.field_g[10] >> 1294333320;
              var5 = aca.field_g[11] >> -1277511928;
              var6 = ur.field_d << -2001635196;
              var7 = 0;
              var8 = via.a(var6, (byte) 59) >> -101413400;
              var9 = ft.a(var6, (byte) -128) >> 455402216;
              if (-1 == mk.field_p) {
                break L1;
              } else {
                if (gd.field_m != -1) {
                  var9 = -128;
                  var7 = mk.field_p - 320;
                  var8 = -gd.field_m + 240;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
            var7 = (int)((double)var7 * var10);
            var9 = (int)((double)var9 * var10);
            var8 = (int)((double)var8 * var10);
            var12 = -var3 + var7;
            var13 = var8 - var4;
            var14 = var9 - var5;
            var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 - -(var14 * var14))));
            var14 = (int)((double)var14 * var10);
            var13 = (int)((double)var13 * var10);
            var12 = (int)((double)var12 * var10);
            var15 = 0;
            L2: while (true) {
              if (gaa.field_i.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L3: while (true) {
                  if (var17_int >= gaa.field_i.length) {
                    var23[var16] = -2147483648;
                    var17 = gaa.field_i[var16];
                    rda.a(var16, 11259);
                    var18 = 0;
                    L4: while (true) {
                      if (3 <= var18) {
                        pt.a(true, aca.field_g, var17, false, (byte) -121, false, dl.field_j);
                        cc.a(var7, var9, var13, var8, var17, (byte) -98, var14, var12);
                        var15++;
                        continue L2;
                      } else {
                        dl.field_j[var18] = dl.field_j[var18] + bd.field_l[var15][var18];
                        var18++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var23[var17_int] > var23[var16]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L3;
                    } else {
                      var17_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_ma = gaa.field_i[var3];
            var4_ref_ma.b(108);
            rda.a(var3, 11259);
            var5 = var4_ref_ma.field_u - -var4_ref_ma.field_A >> 212630753;
            var6 = var4_ref_ma.field_B + var4_ref_ma.field_G >> 1448206465;
            var7 = var4_ref_ma.field_I + var4_ref_ma.field_q >> 1536167201;
            var8 = aca.field_g[9] >> -1614374494;
            var9 = aca.field_g[10] >> -347036702;
            var10_int = aca.field_g[11] >> 1037235906;
            var11 = dl.field_j[3] * var8 + (var9 * dl.field_j[4] + dl.field_j[5] * var10_int) >> -1391277522;
            var12 = var10_int * dl.field_j[8] + dl.field_j[6] * var8 + dl.field_j[7] * var9 >> 2066465070;
            var13 = dl.field_j[11] * var10_int + dl.field_j[9] * var8 + dl.field_j[10] * var9 >> -449279090;
            var2[var3] = var13 * var7 + var6 * var12 + var11 * var5 >> 571051824;
            var3++;
            continue L0;
          }
        }
    }

    final void a(int param0) {
        ((tc) this).field_h = 0;
        ((tc) this).field_e = -1;
        ((tc) this).field_f = 0;
        if (param0 != 11) {
            ((tc) this).field_g = null;
        }
        ((tc) this).field_g = null;
        ((tc) this).field_c = null;
        ((tc) this).field_d = 0;
        ((tc) this).field_a = 256;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = BachelorFridge.field_y;
                        if (wn.field_p) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            if (param0 == 24215) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var8 = null;
                            int discarded$2 = tc.a(true, (gs) null);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) ac.a(param1, "getcookies", (byte) 64);
                            var4 = fda.a(-1, ';', var3);
                            var5 = 0;
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
                            if (var4.length <= var5) {
                                statePc = 15;
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
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 12;
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
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 10;
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
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var2_ref = caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, wd param1, wj param2, int param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        po stackIn_20_0 = null;
        String stackIn_20_1 = null;
        po stackIn_21_0 = null;
        String stackIn_21_1 = null;
        po stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        po stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        po stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        po stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        po stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        po stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        po stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        po stackOut_19_0 = null;
        String stackOut_19_1 = null;
        po stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        po stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        po stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        po stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        po stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        po stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        po stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        po stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        L0: {
          hp.a(param2.field_p, param4 + param2.field_s, (byte) -5, param2.field_q, ((tc) this).field_c, param2.field_v + param0);
          if (null != ((tc) this).field_g) {
            L1: {
              var6_int = param4 + (param2.field_s + ((tc) this).field_f);
              var7 = param0 - (-param2.field_v + -((tc) this).field_d);
              if (param1.field_m != 1) {
                break L1;
              } else {
                var6_int = var6_int + (-((tc) this).field_g.field_n + param2.field_p) / 2;
                break L1;
              }
            }
            L2: {
              if (-3 != (param1.field_m ^ -1)) {
                break L2;
              } else {
                var6_int = var6_int + (param2.field_p - ((tc) this).field_g.field_n);
                break L2;
              }
            }
            L3: {
              if (1 == param1.field_g) {
                var7 = var7 + (param2.field_q + -((tc) this).field_g.field_o) / 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1.field_g == 2) {
                var7 = var7 + (param2.field_q - ((tc) this).field_g.field_o);
                break L4;
              } else {
                break L4;
              }
            }
            ((tc) this).field_g.e(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        L5: {
          if (param3 < -17) {
            break L5;
          } else {
            ((tc) this).field_a = 54;
            break L5;
          }
        }
        L6: {
          var6 = param1.c(param2, 1);
          if (var6 == null) {
            break L6;
          } else {
            if (null == param1.field_l) {
              break L6;
            } else {
              if ((((tc) this).field_h ^ -1) <= -1) {
                L7: {
                  stackOut_19_0 = param1.field_l;
                  stackOut_19_1 = (String) var6;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  if (((tc) this).field_f == -2147483648) {
                    stackOut_21_0 = (po) (Object) stackIn_21_0;
                    stackOut_21_1 = (String) (Object) stackIn_21_1;
                    stackOut_21_2 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    break L7;
                  } else {
                    stackOut_20_0 = (po) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = ((tc) this).field_f;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    break L7;
                  }
                }
                L8: {
                  stackOut_22_0 = (po) (Object) stackIn_22_0;
                  stackOut_22_1 = (String) (Object) stackIn_22_1;
                  stackOut_22_2 = stackIn_22_2 + param1.field_i + param2.field_s + param4;
                  stackOut_22_3 = param1.field_j;
                  stackOut_22_4 = param2.field_v + param0;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_24_3 = stackOut_22_3;
                  stackIn_24_4 = stackOut_22_4;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  stackIn_23_3 = stackOut_22_3;
                  stackIn_23_4 = stackOut_22_4;
                  if (((tc) this).field_d != -2147483648) {
                    stackOut_24_0 = (po) (Object) stackIn_24_0;
                    stackOut_24_1 = (String) (Object) stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = stackIn_24_3;
                    stackOut_24_4 = stackIn_24_4;
                    stackOut_24_5 = ((tc) this).field_d;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    stackIn_25_4 = stackOut_24_4;
                    stackIn_25_5 = stackOut_24_5;
                    break L8;
                  } else {
                    stackOut_23_0 = (po) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = stackIn_23_4;
                    stackOut_23_5 = 0;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    stackIn_25_4 = stackOut_23_4;
                    stackIn_25_5 = stackOut_23_5;
                    break L8;
                  }
                }
                L9: {
                  stackOut_25_0 = (po) (Object) stackIn_25_0;
                  stackOut_25_1 = (String) (Object) stackIn_25_1;
                  stackOut_25_2 = stackIn_25_2;
                  stackOut_25_3 = stackIn_25_3 + (stackIn_25_4 - -stackIn_25_5);
                  stackOut_25_4 = -param1.field_s + param2.field_p - param1.field_i;
                  stackOut_25_5 = param2.field_q + (-param1.field_j - param1.field_r);
                  stackOut_25_6 = ((tc) this).field_h;
                  stackOut_25_7 = ((tc) this).field_e;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  stackIn_27_3 = stackOut_25_3;
                  stackIn_27_4 = stackOut_25_4;
                  stackIn_27_5 = stackOut_25_5;
                  stackIn_27_6 = stackOut_25_6;
                  stackIn_27_7 = stackOut_25_7;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  stackIn_26_3 = stackOut_25_3;
                  stackIn_26_4 = stackOut_25_4;
                  stackIn_26_5 = stackOut_25_5;
                  stackIn_26_6 = stackOut_25_6;
                  stackIn_26_7 = stackOut_25_7;
                  if ((((tc) this).field_a ^ -1) == 2147483647) {
                    stackOut_27_0 = (po) (Object) stackIn_27_0;
                    stackOut_27_1 = (String) (Object) stackIn_27_1;
                    stackOut_27_2 = stackIn_27_2;
                    stackOut_27_3 = stackIn_27_3;
                    stackOut_27_4 = stackIn_27_4;
                    stackOut_27_5 = stackIn_27_5;
                    stackOut_27_6 = stackIn_27_6;
                    stackOut_27_7 = stackIn_27_7;
                    stackOut_27_8 = 256;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    stackIn_28_3 = stackOut_27_3;
                    stackIn_28_4 = stackOut_27_4;
                    stackIn_28_5 = stackOut_27_5;
                    stackIn_28_6 = stackOut_27_6;
                    stackIn_28_7 = stackOut_27_7;
                    stackIn_28_8 = stackOut_27_8;
                    break L9;
                  } else {
                    stackOut_26_0 = (po) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = ((tc) this).field_a;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    stackIn_28_2 = stackOut_26_2;
                    stackIn_28_3 = stackOut_26_3;
                    stackIn_28_4 = stackOut_26_4;
                    stackIn_28_5 = stackOut_26_5;
                    stackIn_28_6 = stackOut_26_6;
                    stackIn_28_7 = stackOut_26_7;
                    stackIn_28_8 = stackOut_26_8;
                    break L9;
                  }
                }
                int discarded$1 = ((po) (Object) stackIn_28_0).a((String) (Object) stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param1.field_m, param1.field_g, param1.field_c);
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
    }

    final tc a(boolean param0, int param1) {
        ((tc) this).field_b = param0 ? true : false;
        if (param1 != -2147483648) {
            ((tc) this).field_c = null;
        }
        return (tc) this;
    }

    final tc b(byte param0, int param1) {
        if (param0 != -88) {
            ((tc) this).field_f = 97;
        }
        ((tc) this).field_f = param1;
        return (tc) this;
    }

    final void a(wd param0, int param1, wj param2, byte param3, tc param4, int param5) {
        if (((tc) this).field_b) {
            param4.a(param5, param0, param2, -118, param1);
            param4.a(11);
        }
        if (!(((tc) this).field_a == -2147483648)) {
            param4.field_a = ((tc) this).field_a;
        }
        if (!(-1 > ((tc) this).field_e)) {
            param4.field_e = ((tc) this).field_e;
        }
        if (((tc) this).field_c != null) {
            param4.field_c = ((tc) this).field_c;
        }
        if (!((((tc) this).field_h ^ -1) > 0)) {
            param4.field_h = ((tc) this).field_h;
        }
        if (!(null == ((tc) this).field_g)) {
            param4.field_g = ((tc) this).field_g;
        }
        if (!(-2147483648 == ((tc) this).field_f)) {
            param4.field_f = ((tc) this).field_f;
        }
        if (!(((tc) this).field_d == -2147483648)) {
            param4.field_d = ((tc) this).field_d;
        }
        int var7 = -38 % ((param3 - -21) / 35);
    }

    final tc b(int param0, int param1) {
        if (param1 != -25251) {
            ((tc) this).field_g = null;
        }
        ((tc) this).field_h = param0;
        return (tc) this;
    }

    final tc c(int param0, int param1) {
        ((tc) this).field_e = param1;
        if (param0 <= 113) {
            return null;
        }
        return (tc) this;
    }

    final static int a(boolean param0, gs param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          var2 = vq.field_w;
          if ((param1.field_p ^ -1) != -3) {
            if (-5 != (param1.field_p ^ -1)) {
              if (ge.field_F == param1.field_a) {
                var2 = jaa.field_u[param1.field_p];
                break L0;
              } else {
                var2 = wp.field_q[param1.field_p];
                break L0;
              }
            } else {
              var2 = wp.field_q[param1.field_p];
              break L0;
            }
          } else {
            if (!param1.field_i) {
              L1: {
                if (param1.field_m != 0) {
                  break L1;
                } else {
                  if (param1.field_j != 0) {
                    break L1;
                  } else {
                    var2 = jaa.field_u[param1.field_p];
                    break L0;
                  }
                }
              }
              var2 = wp.field_q[param1.field_p];
              break L0;
            } else {
              var2 = vq.field_w;
              break L0;
            }
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            tc.a(104, 4);
            break L2;
          }
        }
        return var2;
    }

    tc() {
        ((tc) this).field_d = -2147483648;
        ((tc) this).field_c = null;
        ((tc) this).field_b = false;
        ((tc) this).field_g = null;
        ((tc) this).field_a = -2147483648;
        ((tc) this).field_f = -2147483648;
        ((tc) this).field_h = -2;
        ((tc) this).field_e = -2;
    }

    final static void a(int param0, int param1) {
        int var3 = BachelorFridge.field_y;
        gea var4 = (gea) (Object) wd.field_t.b((byte) 90);
        while (var4 != null) {
            tca.a(var4, 5, param0);
            var4 = (gea) (Object) wd.field_t.c(0);
        }
        if (param1 != -16482) {
            return;
        }
        rg var5 = (rg) (Object) rp.field_C.b((byte) 90);
        while (var5 != null) {
            kr.a(93, var5, param0);
            var5 = (rg) (Object) rp.field_C.c(0);
        }
    }

    static {
    }
}
