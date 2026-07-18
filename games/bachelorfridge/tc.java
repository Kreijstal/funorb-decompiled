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
        try {
            param1.field_g = ((tc) this).field_g;
            param1.field_a = ((tc) this).field_a;
            param1.field_b = ((tc) this).field_b;
            param1.field_c = ((tc) this).field_c;
            param1.field_f = ((tc) this).field_f;
            param1.field_e = ((tc) this).field_e;
            param1.field_d = ((tc) this).field_d;
            param1.field_h = ((tc) this).field_h;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tc.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final tc a(byte param0, int param1) {
        ((tc) this).field_d = param1;
        if (param0 != 0) {
            ((tc) this).field_d = 23;
        }
        return (tc) this;
    }

    final tc a(kv[] param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -40) {
                break L1;
              } else {
                tc.a(-101, -18);
                break L1;
              }
            }
            ((tc) this).field_c = param0;
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("tc.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return (tc) this;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ma var4_ref_ma = null;
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
        RuntimeException decompiledCaughtException = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            aca.field_g = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = gaa.field_i.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = aca.field_g[9] >> 8;
                  var4 = aca.field_g[10] >> 8;
                  var5 = aca.field_g[11] >> 8;
                  var6 = ur.field_d << 4;
                  var7 = 0;
                  var8 = via.a(var6, (byte) 59) >> 8;
                  var9 = ft.a(var6, (byte) -128) >> 8;
                  if (-1 == mk.field_p) {
                    break L2;
                  } else {
                    if (gd.field_m != -1) {
                      var9 = -128;
                      var7 = mk.field_p - 320;
                      var8 = -gd.field_m + 240;
                      break L2;
                    } else {
                      break L2;
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
                L3: while (true) {
                  if (gaa.field_i.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= gaa.field_i.length) {
                        var23[var16] = -2147483648;
                        var17 = gaa.field_i[var16];
                        rda.a(var16, 11259);
                        var18 = 0;
                        L5: while (true) {
                          if (3 <= var18) {
                            pt.a(true, aca.field_g, var17, false, (byte) -121, false, dl.field_j);
                            cc.a(var7, var9, var13, var8, var17, (byte) -98, var14, var12);
                            var15++;
                            continue L3;
                          } else {
                            dl.field_j[var18] = dl.field_j[var18] + bd.field_l[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var17_int] <= var23[var16]) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_ma = gaa.field_i[var3];
                var4_ref_ma.b(108);
                rda.a(var3, 11259);
                var5 = var4_ref_ma.field_u - -var4_ref_ma.field_A >> 1;
                var6 = var4_ref_ma.field_B + var4_ref_ma.field_G >> 1;
                var7 = var4_ref_ma.field_I + var4_ref_ma.field_q >> 1;
                var8 = aca.field_g[9] >> 2;
                var9 = aca.field_g[10] >> 2;
                var10_int = aca.field_g[11] >> 2;
                var11 = dl.field_j[3] * var8 + (var9 * dl.field_j[4] + dl.field_j[5] * var10_int) >> 14;
                var12 = var10_int * dl.field_j[8] + dl.field_j[6] * var8 + dl.field_j[7] * var9 >> 14;
                var13 = dl.field_j[11] * var10_int + dl.field_j[9] * var8 + dl.field_j[10] * var9 >> 14;
                var2[var3] = var13 * var7 + var6 * var12 + var11 * var5 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "tc.J(" + -8144 + ')');
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
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (wn.field_p) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
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
                        try {
                            var2_ref = caughtException;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (null == param1.getParameter("tuhstatbut")) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_19_0 = (RuntimeException) var2_ref2;
                        stackOut_19_1 = new StringBuilder().append("tc.G(").append(24215).append(',');
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param1 == null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "{...}";
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "null";
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
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
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              hp.a(param2.field_p, param4 + param2.field_s, (byte) -5, param2.field_q, ((tc) this).field_c, param2.field_v + param0);
              if (null != ((tc) this).field_g) {
                L2: {
                  var6_int = param4 + (param2.field_s + ((tc) this).field_f);
                  var7 = param0 - (-param2.field_v + -((tc) this).field_d);
                  if (param1.field_m != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-((tc) this).field_g.field_n + param2.field_p) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_m != 2) {
                    break L3;
                  } else {
                    var6_int = var6_int + (param2.field_p - ((tc) this).field_g.field_n);
                    break L3;
                  }
                }
                L4: {
                  if (1 == param1.field_g) {
                    var7 = var7 + (param2.field_q + -((tc) this).field_g.field_o) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_g == 2) {
                    var7 = var7 + (param2.field_q - ((tc) this).field_g.field_o);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((tc) this).field_g.e(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              if (param3 < -17) {
                break L6;
              } else {
                ((tc) this).field_a = 54;
                break L6;
              }
            }
            L7: {
              var6_ref = param1.c(param2, 1);
              if (var6_ref == null) {
                break L7;
              } else {
                if (null == param1.field_l) {
                  break L7;
                } else {
                  if (((tc) this).field_h >= 0) {
                    L8: {
                      stackOut_19_0 = param1.field_l;
                      stackOut_19_1 = (String) var6_ref;
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
                        break L8;
                      } else {
                        stackOut_20_0 = (po) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = ((tc) this).field_f;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        break L8;
                      }
                    }
                    L9: {
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
                        break L9;
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
                        break L9;
                      }
                    }
                    L10: {
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
                      if (((tc) this).field_a == -2147483648) {
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
                        break L10;
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
                        break L10;
                      }
                    }
                    int discarded$1 = ((po) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param1.field_m, param1.field_g, param1.field_c);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("tc.H(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          L12: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param3 + ',' + param4 + ')');
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
        RuntimeException var7 = null;
        int var7_int = 0;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (!((tc) this).field_b) {
                break L1;
              } else {
                param4.a(param5, param0, param2, -118, param1);
                param4.a(11);
                break L1;
              }
            }
            L2: {
              if (((tc) this).field_a != -2147483648) {
                param4.field_a = ((tc) this).field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 <= ((tc) this).field_e) {
                param4.field_e = ((tc) this).field_e;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((tc) this).field_c == null) {
                break L4;
              } else {
                param4.field_c = ((tc) this).field_c;
                break L4;
              }
            }
            L5: {
              if (((tc) this).field_h >= -1) {
                param4.field_h = ((tc) this).field_h;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null != ((tc) this).field_g) {
                param4.field_g = ((tc) this).field_g;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2147483648 != ((tc) this).field_f) {
                param4.field_f = ((tc) this).field_f;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((tc) this).field_d != -2147483648) {
                param4.field_d = ((tc) this).field_d;
                break L8;
              } else {
                break L8;
              }
            }
            var7_int = -38 % ((param3 - -21) / 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("tc.M(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param5 + ')');
        }
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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = vq.field_w;
              if (param1.field_p != 2) {
                if (param1.field_p != 4) {
                  if (ge.field_F == param1.field_a) {
                    var2_int = jaa.field_u[param1.field_p];
                    break L1;
                  } else {
                    var2_int = wp.field_q[param1.field_p];
                    break L1;
                  }
                } else {
                  var2_int = wp.field_q[param1.field_p];
                  break L1;
                }
              } else {
                if (!param1.field_i) {
                  L2: {
                    if (param1.field_m != 0) {
                      break L2;
                    } else {
                      if (param1.field_j != 0) {
                        break L2;
                      } else {
                        var2_int = jaa.field_u[param1.field_p];
                        break L1;
                      }
                    }
                  }
                  var2_int = wp.field_q[param1.field_p];
                  break L1;
                } else {
                  var2_int = vq.field_w;
                  break L1;
                }
              }
            }
            stackOut_13_0 = var2_int;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("tc.B(").append(false).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
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
        RuntimeException var2 = null;
        int var3 = 0;
        gea var4 = null;
        rg var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (gea) (Object) wd.field_t.b((byte) 90);
            L1: while (true) {
              if (var4 == null) {
                if (param1 == -16482) {
                  var5 = (rg) (Object) rp.field_C.b((byte) 90);
                  L2: while (true) {
                    if (var5 == null) {
                      break L0;
                    } else {
                      kr.a(93, var5, param0);
                      var5 = (rg) (Object) rp.field_C.c(0);
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                tca.a(var4, 5, param0);
                var4 = (gea) (Object) wd.field_t.c(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "tc.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }
}
