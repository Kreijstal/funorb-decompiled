/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_d;
    private int field_b;
    private int field_c;
    private boolean field_a;
    static int field_f;
    static String field_g;
    private int[] field_h;
    static String field_i;
    static int[] field_e;

    final void b(int param0, int param1) {
        this.a((byte) -102, param0, this.field_c + 1);
        if (param1 >= -58) {
            this.d(6, 81);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        L0: {
          L1: {
            var17 = MonkeyPuzzle2.field_F ? 1 : 0;
            if ((param2 ^ -1) >= (param5 ^ -1)) {
              break L1;
            } else {
              L2: {
                if (param2 < param0) {
                  break L2;
                } else {
                  L3: {
                    if ((param0 ^ -1) < (param5 ^ -1)) {
                      break L3;
                    } else {
                      hk.a(param3, param1, ge.field_i, param11, param2, param10, param13, param15, param8, param7, param6, param9, param0, param5, param12, param14, -972948528);
                      if (var17 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  hk.a(param11, param1, ge.field_i, param3, param2, param7, param13, param14, param8, param10, param9, param6, param5, param0, param12, param15, -972948528);
                  if (var17 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              hk.a(param1, param11, ge.field_i, param3, param0, param13, param7, param12, param6, param10, param9, param8, param5, param2, param14, param15, param4 + -972948620);
              if (var17 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L4: {
            if (param5 < param0) {
              break L4;
            } else {
              L5: {
                if ((param0 ^ -1) < (param2 ^ -1)) {
                  break L5;
                } else {
                  hk.a(param1, param3, ge.field_i, param11, param5, param13, param10, param12, param9, param7, param6, param8, param0, param2, param15, param14, -972948528);
                  if (var17 == 0) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              hk.a(param11, param3, ge.field_i, param1, param5, param7, param10, param14, param9, param13, param8, param6, param2, param0, param15, param12, -972948528);
              if (var17 == 0) {
                break L0;
              } else {
                break L4;
              }
            }
          }
          hk.a(param3, param11, ge.field_i, param1, param0, param10, param7, param15, param6, param13, param8, param9, param2, param5, param14, param12, param4 ^ -972948596);
          break L0;
        }
        L6: {
          if (param4 == 92) {
            break L6;
          } else {
            oi.a(-117, 1, -102, -125, (byte) -77, -28, -81, -29, -117, 64, -77, -95, -125, -71, 10, -90);
            break L6;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (!((this.field_c ^ -1) <= (param2 ^ -1))) {
            this.field_c = param2;
        }
        if ((param2 ^ -1) <= (this.field_h.length ^ -1)) {
            this.c(param2, 537);
        }
        if (param0 > -73) {
            field_g = (String) null;
        }
        this.field_h[param2] = param1;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_d = null;
        field_e = null;
        if (param0 >= -78) {
            oi.a(-14);
        }
    }

    final int d(int param0, int param1) {
        if (!(this.field_c >= param1)) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 != -22544) {
            return 125;
        }
        return this.field_h[param1];
    }

    private final void c(int param0, int param1) {
        if (param1 != 537) {
            return;
        }
        int[] var4 = new int[this.a(64, param0)];
        int[] var3 = var4;
        gl.a(this.field_h, 0, var4, 0, this.field_h.length);
        this.field_h = var4;
    }

    final int b(int param0) {
        if (param0 != -1) {
            oi.a(-69, 61, -53, 117, (byte) -106, 42, -64, 124, -57, -110, 103, -105, 63, 4, -77, 36);
        }
        return this.field_c - -1;
    }

    final static void a(int param0) {
        hi.field_b = gg.b(-11451);
        wg.field_j = new kj();
        if (param0 != -2) {
            oi.a(-67);
        }
        ll.a((byte) 91, true, true);
    }

    final void a(byte param0, int param1) {
        if (param1 < 0 || this.field_c < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 != this.field_c) {
            gl.a(this.field_h, param1 - -1, this.field_h, param1, this.field_c + -param1);
        }
        int var3 = -21 / ((2 - param0) / 57);
        this.field_c = this.field_c - 1;
    }

    private oi() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_98_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ki var4_ref_ki = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ki var9_ref_ki = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16_ref = null;
        ki var16_ref_ki = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Object var19 = null;
        ki var19_ref = null;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16_ref = null;
                    var19 = null;
                    var20 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 148;
                        var2 = 1;
                        var3 = -42 / ((param0 - -12) / 41);
                        var4_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4_ref_ki == null) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_11_0 = var2;
                        stackIn_4_0 = stackIn_11_0;
                        if (var20 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = 0;
                        var4_ref_ki.field_q = -100.0f;
                        var4_ref_ki.field_B = -100.0f;
                        if (var20 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_ref_ki.f(-7);
                        var4_ref_ki.field_B = 602.0f;
                        var4_ref_ki.field_q = (float)var1_int;
                        var1_int += 59;
                        if (-7 == (var4_ref_ki.field_w ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        h.a(1, true);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                        if (var20 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = -7;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 >= (wd.field_h.b(-113) ^ -1)) {
                            statePc = 126;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!hd.field_u.e(11253)) {
                            statePc = 126;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (ub.field_a) {
                            statePc = 126;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (lc.field_f) {
                            statePc = 126;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        var9_ref_ki = (ki) ((Object) ok.field_a.a((byte) -117));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9_ref_ki == null) {
                            statePc = 30;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_34_0 = 2;
                        stackIn_18_0 = stackIn_34_0;
                        stackIn_34_1 = var9_ref_ki.field_l;
                        stackIn_18_1 = stackIn_34_1;
                        if (var20 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 != stackIn_18_1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (4 != var9_ref_ki.field_l) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9_ref_ki.field_l != 1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (0 == var9_ref_ki.field_l) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var9_ref_ki.field_l ^ -1) != -4) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5 = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_ref_ki = (ki) ((Object) ok.field_a.d((byte) 63));
                        if (var20 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var8 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = stackIn_33_0;
                        stackIn_34_1 = var5;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_36_0 = stackIn_34_0;
                        stackIn_35_0 = stackIn_36_0;
                        if (stackIn_34_1 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = stackIn_35_0;
                        stackIn_37_1 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = stackIn_36_0;
                        stackIn_37_1 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_39_0 = stackIn_37_0 + stackIn_37_1;
                        stackIn_38_0 = stackIn_39_0;
                        if (var4 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = stackIn_38_0;
                        stackIn_40_1 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = stackIn_39_0;
                        stackIn_40_1 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_42_0 = stackIn_40_0 + stackIn_40_1;
                        stackIn_41_0 = stackIn_42_0;
                        if (var7 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_43_0 = stackIn_41_0;
                        stackIn_43_1 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = stackIn_42_0;
                        stackIn_43_1 = 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_45_0 = stackIn_43_0;
                        stackIn_44_0 = stackIn_45_0;
                        stackIn_45_1 = stackIn_43_1;
                        stackIn_44_1 = stackIn_45_1;
                        if (var6 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_46_0 = stackIn_44_0;
                        stackIn_46_1 = stackIn_44_1;
                        stackIn_46_2 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = stackIn_45_0;
                        stackIn_46_1 = stackIn_45_1;
                        stackIn_46_2 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = stackIn_46_0 + (stackIn_46_1 + stackIn_46_2);
                        var10 = 0;
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16_ref_ki = (ki) ((Object) wd.field_h.c(-1));
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var16_ref_ki == null) {
                            statePc = 75;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_76_0 = -7;
                        stackIn_49_0 = stackIn_76_0;
                        stackIn_76_1 = var16_ref_ki.field_w ^ -1;
                        stackIn_49_1 = stackIn_76_1;
                        if (var20 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 == stackIn_49_1) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var10++;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var17 = var16_ref_ki.field_l;
                        if ((var17 ^ -1) != -5) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var20 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var17 ^ -1) == -2) {
                            statePc = 67;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (3 != var17) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var20 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (-1 != (var17 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var20 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (2 != var17) {
                            statePc = 74;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var20 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12++;
                        if (var20 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var11++;
                        if (var20 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var13++;
                        if (var20 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var14++;
                        if (var20 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var15++;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var16_ref_ki = (ki) ((Object) wd.field_h.a(true));
                        if (var20 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = var12;
                        stackIn_76_1 = 2;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0 <= stackIn_76_1) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var9 > 1) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var4 = 0;
                        var9--;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (-3 <= (var11 ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (1 < var9) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7 = 0;
                        var9--;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var15 ^ -1) >= -3) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (1 >= var9) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var9--;
                        var8 = 0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if ((var13 ^ -1) >= -3) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((var9 ^ -1) >= -2) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var9--;
                        var5 = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (-3 <= (var14 ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((var9 ^ -1) < -2) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var9--;
                        var6 = 0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var9 > 0) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 95: {
                    return;
                }
                case 96: {
                    stackIn_98_0 = -7;
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    try {
                        stackIn_98_0 = -7;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (stackIn_98_0 >= (wd.field_h.b(-65) ^ -1)) {
                            statePc = 126;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var16 = -1;
                        var17 = pf.a((byte) 22, var9);
                        var18 = -1;
                        if (var20 != 0) {
                            statePc = 127;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var7 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var18++;
                        if ((var17 ^ -1) != (var18 ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var16 = 1;
                        if (var20 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (var4 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var18++;
                        if ((var17 ^ -1) == (var18 ^ -1)) {
                            statePc = 116;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var5 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var18++;
                        if (var17 == var18) {
                            statePc = 115;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var6 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var18++;
                        if ((var17 ^ -1) != (var18 ^ -1)) {
                            statePc = 112;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var16 = 0;
                        if (var20 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var8 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var18++;
                        if (var18 != var17) {
                            statePc = 117;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var16 = 2;
                        if (var20 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var16 = 3;
                        if (var20 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var16 = 4;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var19_ref = (ki) ((Object) ri.field_b.d(4011));
                        if (Math.random() < 0.95) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if ((dc.field_c ^ -1) > -4) {
                            statePc = 122;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((var10 ^ -1) < -2) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var19_ref.a(6, var16, -1);
                        h.a(1, true);
                        if (var20 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var19_ref.a(1, var16, -1);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var19_ref.field_q = -100.0f;
                        var19_ref.field_B = -100.0f;
                        wd.field_h.a(-8212, var19_ref);
                        if (var20 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 125: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "oi.J(" + param0 + ')');
                }
                case 126: {
                    return;
                }
                case 127: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param0 > 34) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    oi.a(118);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = this.field_h.length;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 > param1) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_11_0 = this.field_a;
                    stackIn_5_0 = stackIn_11_0;
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!stackIn_5_0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((var3 ^ -1) != -1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = 1;
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = var3 * this.field_b;
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var3 = var3 + this.field_b;
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return var3;
                }
                case 11: {
                    return stackIn_11_0 ? 1 : 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = "Just play";
        field_f = -1;
        field_i = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = new int[128];
        field_g = "Create a free Account";
    }
}
