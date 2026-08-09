/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ii {
    String field_bb;
    static int field_cb;
    static int field_eb;
    static int[] field_fb;
    String field_db;
    int field_gb;
    static String[] field_hb;

    final static int c(byte param0) {
        L0: {
          if (param0 >= 5) {
            break L0;
          } else {
            rb.h(-39);
            break L0;
          }
        }
        if ((mc.field_a ^ -1) <= -3) {
          L1: {
            if (fe.field_h != 0) {
              L2: {
                if (ec.field_a != null) {
                  if (ec.field_a.a(-58)) {
                    if (!ec.field_a.b("", (byte) -102)) {
                      return 29;
                    } else {
                      if (!ec.field_a.a(0, "")) {
                        return 29;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L2;
                }
              }
              if (!fj.field_B.a(93)) {
                return 43;
              } else {
                if (fj.field_B.a(0, "commonui")) {
                  if (hf.field_a.a(-90)) {
                    if (hf.field_a.a(0, "commonui")) {
                      if (!ii.field_m.a(-47)) {
                        return 82;
                      } else {
                        if (ii.field_m.b(0)) {
                          break L1;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              }
            } else {
              if (fj.field_B.a(-46)) {
                if (fj.field_B.a(0, "commonui")) {
                  if (hf.field_a.a(-59)) {
                    if (hf.field_a.a(0, "commonui")) {
                      if (ii.field_m.a(107)) {
                        if (ii.field_m.b(0)) {
                          break L1;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final static void a(int param0, byte param1) {
        int[] array$0 = null;
        int[] array$1 = null;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        gk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var8 = 0;
        ki var9_ref_ki = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        Object var20 = null;
        ki var20_ref = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = null;
                    var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var22 = wc.field_d.a("level" + param0, "", param1 + 49);
                        var19 = var22;
                        var18 = var19;
                        var2 = var18;
                        if (var18 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var3 = new gk(var22);
                        if (var3.a((byte) 114) != el.field_a) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_6_0 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = stackIn_6_0;
                        el.a(true, var3.a((byte) 114));
                        var5 = var3.j(17277);
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var5 ^ -1) >= (var6_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var20_ref = (ki) ((Object) ri.field_b.d(param1 + 4069));
                        var20_ref.a((byte) 126, var3);
                        ri.field_b.a(-8212, var20_ref);
                        var6_int++;
                        if (var16 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var16 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = var3.j(17277);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var23 = new int[var5];
                        var21 = var23;
                        var6 = var21;
                        gb.field_o = 0;
                        var17 = new int[var5];
                        var8 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var5 ^ -1) >= (var8 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9_ref_ki = (ki) ((Object) ri.field_b.d(4011));
                        var9_ref_ki.a((byte) 116, var3);
                        stackIn_30_0 = -3;
                        stackIn_17_0 = stackIn_30_0;
                        stackIn_30_1 = var9_ref_ki.field_w ^ -1;
                        stackIn_17_1 = stackIn_30_1;
                        if (var16 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == stackIn_17_1) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (3 != var9_ref_ki.field_w) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        h.a(4, true);
                        if (var16 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (5 != var9_ref_ki.field_w) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        h.a(2, true);
                        if (var16 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        h.a(3, true);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_ref_ki.c((byte) -113);
                        var6[var8] = (int)var9_ref_ki.field_B;
                        var17[var8] = (int)var9_ref_ki.field_q;
                        if ((var9_ref_ki.field_w ^ -1) == -1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        gb.field_o = gb.field_o + 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ok.field_a.a(-8212, var9_ref_ki);
                        var8++;
                        if (var16 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = param1;
                        stackIn_30_1 = -58;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 == stackIn_30_1) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        field_hb = (String[]) null;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = var5 ^ -1;
                        stackIn_34_1 = var8 ^ -1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 >= stackIn_34_1) {
                            statePc = 43;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = var8 + -1;
                        var10 = var23[var8];
                        stackIn_44_0 = var17[var8];
                        stackIn_36_0 = stackIn_44_0;
                        if (var16 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11 = stackIn_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var9 < 0) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_34_0 = var10;
                        stackIn_39_0 = stackIn_34_0;
                        stackIn_34_1 = var23[var9];
                        stackIn_39_1 = stackIn_34_1;
                        if (var16 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= stackIn_39_1) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var6[var9 + 1] = var23[var9];
                        var17[1 + var9] = var17[var9];
                        var9--;
                        if (var16 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var6[1 + var9] = var10;
                        var17[1 + var9] = var11;
                        var8++;
                        if (var16 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8 = 15;
                        var9 = var23[0];
                        var10 = var23[0];
                        pd.field_f = new int[32];
                        ib.field_c = 0;
                        mc.field_e = new int[32][4];
                        stackIn_44_0 = var17[0];
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = stackIn_44_0;
                        var12 = 0;
                        var13 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var13 ^ -1) <= (var5 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_59_0 = var8;
                        stackIn_47_0 = stackIn_59_0;
                        stackIn_59_1 = var23[var13] - var9;
                        stackIn_47_1 = stackIn_59_1;
                        if (var16 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 >= stackIn_47_1) {
                            statePc = 55;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        pd.field_f[var12] = (var9 + var10) / 2;
                        var14 = var11 / dj.field_a[0].field_n - -1;
                        array$0 = new int[var14];
                        mc.field_e[var12] = array$0;
                        var15 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var14 <= var15) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        mc.field_e[var12][var15] = pf.a((byte) -128, 16);
                        var15++;
                        if (var16 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var16 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = var17[var13];
                        var12++;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var9 = var23[var13];
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var11 ^ -1) <= (var17[var13] ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var11 = var17[var13];
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = var23[var13];
                        var13++;
                        if (var16 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        pd.field_f[var12] = (var10 - -var9) / 2;
                        stackIn_59_0 = var11 / dj.field_a[0].field_n;
                        stackIn_59_1 = -1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var13 = stackIn_59_0 - stackIn_59_1;
                        array$1 = new int[var13];
                        mc.field_e[var12] = array$1;
                        var14 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var14 ^ -1) <= (var13 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        mc.field_e[var12][var14] = pf.a((byte) 92, 16);
                        var14++;
                        if (var16 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var16 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var12++;
                        ib.field_c = var12;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2_ref), "rb.B(" + param0 + ',' + param1 + ')');
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void i(int param0) {
        field_fb = null;
        field_hb = null;
        if (param0 > -114) {
            field_eb = -20;
        }
    }

    final static void h(int param0) {
        vh.a(ba.field_f, (byte) -125);
        if (param0 != 3591) {
            field_eb = -116;
        }
        ba.field_f.a((byte) -107, rc.field_k);
        ie.field_e.requestFocus();
        ba.field_f = null;
    }

    rb() {
        super(0L, (ii) null);
    }

    static {
        field_hb = new String[]{"Explorer in the Mist", "King of the Jungle", "Nut Cracker", "See No Monkey", "Hear No Monkey", "Speak No Monkey", "Monkeying Around", "Bad Monkey", "Naughty Monkey", "Cheeky Monkey"};
    }
}
