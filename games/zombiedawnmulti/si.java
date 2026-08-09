/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends nc {
    private int[] field_y;
    private int field_x;
    private int field_v;
    private int field_m;
    private int[] field_r;
    private int field_E;
    private int field_n;
    private int[] field_A;
    private int field_p;
    private int field_w;
    static double field_C;
    static String field_D;
    private cb[] field_u;
    private int field_s;
    private String field_l;
    private kb field_z;
    private int field_t;
    private int field_B;
    private int field_q;
    private boolean field_o;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int stackIn_10_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -118) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = this.field_j.length;
                  if (var4 == 1) {
                    break L3;
                  } else {
                    if (-3 != (var4 ^ -1)) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = 1;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (0 == param1) {
                  stackIn_10_0 = 0;
                  break L4;
                } else {
                  stackIn_10_0 = 2;
                  break L4;
                }
              }
              var3 = stackIn_10_0;
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            var3 = param1;
            break L0;
          }
          L5: {
            var4 = var3;
            if (0 == var4) {
              break L5;
            } else {
              L6: {
                if (1 != var4) {
                  break L6;
                } else {
                  if (var5 == 0) {
                    return 240;
                  } else {
                    break L6;
                  }
                }
              }
              if (-3 != (var4 ^ -1)) {
                return super.a((byte) -118, param1);
              } else {
                if (var5 == 0) {
                  return 430;
                } else {
                  break L5;
                }
              }
            }
          }
          return 50;
        } else {
          return 5;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, kb param4) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int[] stackIn_16_1 = null;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rp var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_t = param0;
                        this.field_B = param1;
                        this.field_x = 50;
                        this.field_z = param4;
                        we.field_g[42] = u.field_j;
                        this.field_q = param2;
                        we.field_g[43] = ec.field_a;
                        this.field_n = 0;
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (-1 >= (fb.field_e.field_M ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((si) (this)).field_o = stackIn_4_1 != 0;
                        if ((fb.field_e.field_M ^ -1) != (this.field_q ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_l = nh.field_h;
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!this.field_o) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_l = "";
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_l = gf.field_c;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        gj.a(6962);
                        if (this.field_o) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_15_0 = this;
                        stackIn_13_0 = stackIn_15_0;
                        if (!this.field_z.field_i) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = this;
                        stackIn_14_0 = stackIn_15_0;
                        if (this.field_t <= 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_16_0 = this;
                        stackIn_16_1 = ga.field_s;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = this;
                        stackIn_16_1 = wk.field_L;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((si) (this)).field_j = stackIn_16_1;
                        if (var12 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_j = cq.field_c;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_g.a(-9049, true, this.a(-6003, bo.field_d, bd.field_g));
                        this.field_g.field_c = this.field_j.length;
                        this.field_y = (int[]) ((Object) param3.clone());
                        var6_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((this.field_y.length ^ -1) >= (var6_int ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_30_0 = -1;
                        stackIn_21_0 = stackIn_30_0;
                        stackIn_30_1 = 1 << var6_int & this.field_z.field_F ^ -1;
                        stackIn_21_1 = stackIn_30_1;
                        if (var12 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 == stackIn_21_1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_24_0 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = stackIn_24_0;
                        if (var7 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_y[var6_int] = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6_int++;
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_w = 1;
                        this.field_p = this.field_z.field_H * 20 / 1000;
                        this.field_A = new int[this.field_y.length];
                        var6_int = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = var6_int;
                        stackIn_30_1 = param3.length;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 >= stackIn_30_1) {
                            statePc = 42;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = this.field_y[var6_int];
                        stackIn_43_0 = this;
                        stackIn_32_0 = stackIn_43_0;
                        stackIn_43_1 = var7;
                        stackIn_32_1 = stackIn_43_1;
                        if (var12 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = this;
                        stackIn_33_0 = stackIn_34_0;
                        if (stackIn_32_1 < this.field_w) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_35_0 = this;
                        stackIn_35_1 = var7;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = this;
                        stackIn_35_1 = this.field_w;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((si) (this)).field_w = stackIn_35_1;
                        this.field_A[var6_int] = var6_int;
                        var8 = -1 + var6_int;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var8 ^ -1) > -1) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_30_0 = this.field_y[var6_int];
                        stackIn_38_0 = stackIn_30_0;
                        stackIn_30_1 = this.field_y[this.field_A[var8]];
                        stackIn_38_1 = stackIn_30_1;
                        if (var12 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 < stackIn_38_1) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_A[var8 + 1] = this.field_A[var8];
                        var8--;
                        if (var12 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_A[var8 - -1] = var6_int;
                        var6_int++;
                        if (var12 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = this;
                        stackIn_43_1 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((si) (this)).field_v = stackIn_43_1;
                        if (!gf.field_h) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var13 = ll.field_k;
                        var7 = var13.g((byte) -32);
                        var8 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var7 ^ -1) >= (var8 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_56_0 = ll.field_k.field_m[var8];
                        stackIn_48_0 = stackIn_56_0;
                        stackIn_56_1 = 255;
                        stackIn_48_1 = stackIn_56_1;
                        if (var12 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 != stackIn_48_1) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.e(ll.field_k.field_m[var8], param1 + 4);
                        if (255 != ll.field_k.field_g[var8]) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.e(ll.field_k.field_g[var8], 4);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_56_0 = var8;
                        stackIn_56_1 = 3;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 >= stackIn_56_1) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_63_0 = 255;
                        stackIn_58_0 = stackIn_63_0;
                        stackIn_63_1 = ll.field_k.field_s[var8];
                        stackIn_58_1 = stackIn_63_1;
                        if (var12 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 != stackIn_58_1) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.e(ll.field_k.field_s[var8], 4);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = 0;
                        stackIn_63_1 = this.field_v;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 < stackIn_63_1) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_r = new int[this.field_v];
                        var8 = this.field_t;
                        var9 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var9 >= this.field_v) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var10 = var8 / (this.field_v - var9);
                        var11 = this.field_u[var9].field_m;
                        ll.field_k.a(-126, var10, var11);
                        this.field_u[var9].a(0, var10);
                        var8 = var8 - var10;
                        this.field_r[var9] = var10;
                        var9++;
                        if (var12 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var12 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        th.b((byte) -61);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_74_0 = (RuntimeException) (var6);
                    stackIn_73_0 = stackIn_74_0;
                    stackIn_74_1 = new StringBuilder().append("si.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_73_1 = stackIn_74_1;
                    if (param3 == null) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_77_0;
                    stackIn_77_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
                    stackIn_76_1 = stackIn_77_1;
                    if (param4 == null) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    throw fa.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
                }
                case 79: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String e(int param0) {
        if (param0 >= -85) {
            return (String) null;
        }
        int var2 = this.field_p / 60;
        int var3 = this.field_p % 60;
        return var2 + ":" + (10 > var3 ? "0" : "") + var3;
    }

    final static void a(boolean param0, boolean param1, ul param2, ul param3, ul param4) {
        try {
            tg.field_g = tg.a("", !param0 ? true : false);
            tg.field_g.a(-17853, param0);
            qe.a(param4, -8995, param3, param2);
            dg.i(4);
            id.field_B = mp.field_b;
            ta.field_hb = mp.field_b;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "si.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 23697) {
            return 127;
        }
        return 430;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -64) {
            break L0;
          } else {
            this.field_v = -63;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                var4 = this.field_j[param2];
                var5 = var4;
                if ((var5 ^ -1) == -44) {
                  if (this.field_g.c(-85)) {
                    if (!this.field_o) {
                      L5: {
                        if (this.field_B != 0) {
                          stackIn_12_0 = 0;
                          break L5;
                        } else {
                          stackIn_12_0 = 1;
                          break L5;
                        }
                      }
                      L6: {


                        if ((this.field_n ^ -1) >= -1) {

                          stackIn_15_1 = 0;
                          break L6;
                        } else {

                          stackIn_15_1 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        if ((stackIn_12_0 ^ stackIn_15_1) != 0) {
                          break L7;
                        } else {
                          this.b(false, 0);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.b(false, 1);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  if ((var5 ^ -1) == -43) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_g.c(-85)) {
                ma.field_a.b((byte) -35, 61);
                if (var6 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                break L1;
              }
            }
            super.b(-110, param1, param2);
            break L1;
          }
          break L1;
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 255) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_C = 1.243267543236342;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (hl.field_e.length <= var5_int) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param4 = hl.field_e[var5_int];
                        if (var7 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = var5_int << -179841596;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$4 = param4;
                        param4--;
                        if (0 == incrementValue$4) {
                            statePc = 11;
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
                        incrementValue$5 = var6;
                        var6++;
                        param0 = ah.field_f[incrementValue$5];
                        dupTemp$6 = param2[param0];
                        dupTemp$7 = param3[dupTemp$6];
                        param3[dupTemp$6] = dupTemp$7 + 1;
                        ah.field_f[dupTemp$7] = param0;
                        if (var7 != 0) {
                            statePc = 12;
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
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (runtimeException);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("si.CA(").append(param0).append(',').append(param1).append(',');
                    stackIn_15_1 = stackIn_16_1;
                    if (param2 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param3 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param4 + ')');
                }
                case 21: {
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    si(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, wk.field_L);
        int var8_int = 0;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_B = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_u = new cb[13];
                        var8_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var8_int >= this.field_u.length) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_u[var8_int] = new cb();
                        var8_int++;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (var8);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("si.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_8_1 = stackIn_9_1;
                    if (param6 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        sl stackIn_33_0 = null;
        String stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        sl stackIn_34_0 = null;
        String stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        sl stackIn_35_0 = null;
        String stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        sl stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        sl stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        sl stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_60_0 = 0;
        ef stackIn_64_0 = null;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        ef stackIn_65_0 = null;
        String stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        ef stackIn_66_0 = null;
        String stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        ef stackIn_124_0 = null;
        String stackIn_124_1 = null;
        int stackIn_124_2 = 0;
        int stackIn_124_3 = 0;
        ef stackIn_125_0 = null;
        String stackIn_125_1 = null;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        ef stackIn_126_0 = null;
        String stackIn_126_1 = null;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        int stackIn_126_4 = 0;
        ef stackIn_130_0 = null;
        String stackIn_130_1 = null;
        int stackIn_130_2 = 0;
        int stackIn_130_3 = 0;
        ef stackIn_131_0 = null;
        String stackIn_131_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_131_3 = 0;
        ef stackIn_132_0 = null;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_132_3 = 0;
        int stackIn_132_4 = 0;
        ef stackIn_155_0 = null;
        String stackIn_155_1 = null;
        int stackIn_155_2 = 0;
        int stackIn_155_3 = 0;
        ef stackIn_156_0 = null;
        String stackIn_156_1 = null;
        int stackIn_156_2 = 0;
        int stackIn_156_3 = 0;
        ef stackIn_157_0 = null;
        String stackIn_157_1 = null;
        int stackIn_157_2 = 0;
        int stackIn_157_3 = 0;
        int stackIn_157_4 = 0;
        ef stackIn_175_0 = null;
        String stackIn_175_1 = null;
        int stackIn_175_2 = 0;
        int stackIn_175_3 = 0;
        ef stackIn_178_0 = null;
        String stackIn_178_1 = null;
        int stackIn_178_2 = 0;
        int stackIn_178_3 = 0;
        int stackIn_178_4 = 0;
        ef stackIn_179_0 = null;
        String stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        int stackIn_179_3 = 0;
        ef stackIn_181_0 = null;
        String stackIn_181_1 = null;
        int stackIn_181_2 = 0;
        int stackIn_181_3 = 0;
        int stackIn_194_0 = 0;
        int stackIn_194_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        ja var25 = null;
        int var26 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = ZombieDawnMulti.field_E ? 1 : 0;
                    super.a(param0);
                    var2 = 378;
                    var3 = 0;
                    var4 = ah.field_e.field_C + ah.field_e.field_r;
                    this.field_E = 255;
                    if (this.field_n == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = this.field_n * 255 / 33;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = 255;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var5 = stackIn_3_0;
                    if (0 == this.field_B) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_n <= 0) {
                        statePc = 83;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((this.field_B ^ -1) == -1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_9_0 = 255 - var5;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = var5;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6 = stackIn_9_0;
                    var7 = 94;
                    if (null == this.field_l) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    qp.field_w.a(dj.field_o, 90, 134, 16777215, 1, var6);
                    qp.field_w.a(qm.field_N, 478, 134, 16777215, 1, var6);
                    var8_int = 555;
                    if (this.field_z.field_i) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    qp.field_w.a(th.field_d, var8_int, 122, 16777215, 1, var6);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    qp.field_w.a(bo.field_c, var8_int, 134, 16777215, 1, var6);
                    var7 = var7 + (-5 + (1 - -pb.field_e.a(this.field_l, 0, 90, 640, 240, 65280, var3, var6, 1, 0, 30)) * var4);
                    if (205 <= var7) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7 = 205;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var9 = qb.field_h.field_e;
                    var10 = 150;
                    var11 = 0;
                    var12 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if ((var12 ^ -1) <= (this.field_z.field_t ^ -1)) {
                        statePc = 70;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var13 = this.field_A[var12];
                    stackIn_71_0 = wp.field_h.field_M;
                    stackIn_20_0 = stackIn_71_0;
                    stackIn_71_1 = var13;
                    stackIn_20_1 = stackIn_71_1;
                    if (var26 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 != stackIn_20_1) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var14 = stackIn_23_0;
                    var15 = var9 * this.field_y[var13] / this.field_w;
                    if (-1 == (this.field_z.field_F & 1 << var13 ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = 1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var16 = stackIn_26_0;
                    if (-1 == (op.field_m.field_j & 1 << var13 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var17 = stackIn_29_0;
                    if (var9 >= var15) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = var9;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = var15;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var15 = stackIn_32_0;
                    stackIn_34_0 = ah.field_e;
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = this.field_z.field_b[var13];
                    stackIn_33_1 = stackIn_34_1;
                    stackIn_34_2 = 280;
                    stackIn_33_2 = stackIn_34_2;
                    stackIn_34_3 = var10;
                    stackIn_33_3 = stackIn_34_3;
                    if (var14 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (sl) ((Object) stackIn_33_0);
                    stackIn_35_1 = (String) ((Object) stackIn_33_1);
                    stackIn_35_2 = stackIn_33_2;
                    stackIn_35_3 = stackIn_33_3;
                    stackIn_35_4 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (sl) ((Object) stackIn_34_0);
                    stackIn_35_1 = (String) ((Object) stackIn_34_1);
                    stackIn_35_2 = stackIn_34_2;
                    stackIn_35_3 = stackIn_34_3;
                    stackIn_35_4 = 6;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    ((sl) (Object) stackIn_35_0).a(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4, var3, var6);
                    if (var17 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 37: {
                    oo.e(33, var10 - 14, qp.field_w.a(ak.field_d) - -14, 15, 7, 16777215);
                    oo.b(33, -15 + var10, qp.field_w.a(ak.field_d) + 16, 17, 7, 65793);
                    qp.field_w.b(ak.field_d, 40, var10 + -2, 65793, -1, var6);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var16 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = ah.field_e;
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = Integer.toString(this.field_y[var13]);
                    stackIn_40_1 = stackIn_41_1;
                    stackIn_41_2 = 90;
                    stackIn_40_2 = stackIn_41_2;
                    stackIn_41_3 = var10 + 28;
                    stackIn_40_3 = stackIn_41_3;
                    if (var14 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = (sl) ((Object) stackIn_40_0);
                    stackIn_42_1 = (String) ((Object) stackIn_40_1);
                    stackIn_42_2 = stackIn_40_2;
                    stackIn_42_3 = stackIn_40_3;
                    stackIn_42_4 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (sl) ((Object) stackIn_41_0);
                    stackIn_42_1 = (String) ((Object) stackIn_41_1);
                    stackIn_42_2 = stackIn_41_2;
                    stackIn_42_3 = stackIn_41_3;
                    stackIn_42_4 = 6;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    ((sl) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, var3, var6);
                    if (var26 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    qp.field_w.a(io.field_d, 90, var10 - -24, 11184810, 1, var6);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    qb.field_h.a(135, 4 + var10, var6);
                    oo.h(138, 0, var15 + 138, 480);
                    stackIn_46_0 = 140;
                    stackIn_45_0 = stackIn_46_0;
                    stackIn_46_1 = 9 + var10;
                    stackIn_45_1 = stackIn_46_1;
                    stackIn_46_2 = qb.field_h.field_e - 10;
                    stackIn_45_2 = stackIn_46_2;
                    stackIn_46_3 = 16;
                    stackIn_45_3 = stackIn_46_3;
                    stackIn_46_4 = 7;
                    stackIn_45_4 = stackIn_46_4;
                    if (var14 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = stackIn_45_0;
                    stackIn_47_1 = stackIn_45_1;
                    stackIn_47_2 = stackIn_45_2;
                    stackIn_47_3 = stackIn_45_3;
                    stackIn_47_4 = stackIn_45_4;
                    stackIn_47_5 = 65535;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = stackIn_46_0;
                    stackIn_47_1 = stackIn_46_1;
                    stackIn_47_2 = stackIn_46_2;
                    stackIn_47_3 = stackIn_46_3;
                    stackIn_47_4 = stackIn_46_4;
                    stackIn_47_5 = 16711680;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    oo.b(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, var6 / 2);
                    oo.h(0, 0, 640, 480);
                    var18 = 436;
                    var19 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if ((var19 ^ -1) <= -64) {
                        statePc = 59;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (!this.field_z.b((byte) -121, var19, var13)) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_52_0 = 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var20 = stackIn_52_0;
                    stackIn_60_0 = var20;
                    stackIn_53_0 = stackIn_60_0;
                    if (var26 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (stackIn_53_0 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 55: {
                    wa.field_b[-18 + var19].c(var18, var10 + 5, var6);
                    if (!wa.field_b[var19 - 18].b(var18, 5 + var10, bd.field_g, bo.field_d)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.field_E = var19;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var18 += 28;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var19++;
                    if (var26 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var19 = op.field_m.field_o[var13];
                    var20 = op.field_m.field_v[var13];
                    stackIn_60_0 = this.field_z.field_i ? 1 : 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (stackIn_60_0 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    qp.field_w.a(Integer.toString(var20), var8_int, var10 + 22, 16777215, 1, var6);
                    if (var26 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    qp.field_w.a(Integer.toString(var20), var8_int, 15 + var10, 16777215, 1, var6);
                    stackIn_65_0 = qp.field_w;
                    stackIn_64_0 = stackIn_65_0;
                    stackIn_65_1 = eb.a(var20 - var19, true, param0);
                    stackIn_64_1 = stackIn_65_1;
                    stackIn_65_2 = var8_int - 2;
                    stackIn_64_2 = stackIn_65_2;
                    stackIn_65_3 = 30 + var10;
                    stackIn_64_3 = stackIn_65_3;
                    if ((var19 ^ -1) > (var20 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = (ef) ((Object) stackIn_64_0);
                    stackIn_66_1 = (String) ((Object) stackIn_64_1);
                    stackIn_66_2 = stackIn_64_2;
                    stackIn_66_3 = stackIn_64_3;
                    stackIn_66_4 = 16711680;
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (ef) ((Object) stackIn_65_0);
                    stackIn_66_1 = (String) ((Object) stackIn_65_1);
                    stackIn_66_2 = stackIn_65_2;
                    stackIn_66_3 = stackIn_65_3;
                    stackIn_66_4 = 65280;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    ((ef) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4, 1, var6);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var21 = op.field_m.field_D[var13][0];
                    var22 = op.field_m.field_D[var13][1];
                    var23 = 4;
                    var24 = wf.field_m / gg.field_b[var23];
                    var24 = var24 % gg.field_j[var23];
                    var24 = var24 + gg.field_l[var23];
                    am.a(var24, var22, var11, 1, var21).c(8, var10 - 11, var6);
                    var25 = am.a(var24, var22, -var11 + 1, 1, var21);
                    var25.e();
                    var11 = -var11 + 1;
                    var25.c(575, -11 + var10, var6);
                    if (var17 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    oo.g(44, 4 + var10, 47, var10 + 1, 16777215);
                    oo.g(43, 4 + var10, 46, var10 - -1, 16777215);
                    oo.g(45, var10 - -4, 48, var10 + 1, 16777215);
                    oo.g(42, var10 - -4, 45, var10 - -1, 65793);
                    oo.g(46, var10 - -4, 49, var10 - -1, 65793);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var7 = var7 + (var4 + 1);
                    var10 += 58;
                    var12++;
                    if (var26 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = var7;
                    stackIn_71_1 = 1 + var4;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var7 = stackIn_71_0 + stackIn_71_1;
                    if (!this.field_o) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    pb.field_e.a(vl.a(wi.field_o, new String[]{this.e(-95)}, 2), 320, 380, 16556032, var3, var6);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (-1 <= (this.field_n ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var7 = (255 - var6) * 120 / 256 + var6 * var2 / 256;
                    if (var26 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var7 = var2;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (this.field_o) {
                        statePc = 82;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (this.field_z.field_i) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    pb.field_e.a(aa.field_p, 320, 410, 16777096, var3, var6);
                    if (var26 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    pb.field_e.a(vl.a(ig.field_g, new String[]{Integer.toString(this.field_t)}, 2), 320, 365, 16776960, var3, var6);
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    this.f(var6, 96);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (this.field_B == 1) {
                        statePc = 86;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (-1 <= (this.field_n ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (-2 == (this.field_B ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackIn_89_0 = 255 - var5;
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = var5;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    var6 = stackIn_89_0;
                    rg.field_C.a(-40, 233, var6);
                    var7 = 0;
                    var8 = new int[]{30, 239, 448};
                    var9 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (5 <= var9) {
                        statePc = 95;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var10 = ll.field_k.field_m[var9];
                    stackIn_209_0 = 255;
                    stackIn_92_0 = stackIn_209_0;
                    stackIn_209_1 = var10;
                    stackIn_92_1 = stackIn_209_1;
                    if (var26 != 0) {
                        statePc = 209;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 == stackIn_92_1) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var7 = ga.field_v[var9];
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var9++;
                    if (var26 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var9 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (var9 >= 3) {
                        statePc = 105;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var10 = ll.field_k.field_s[var9];
                    stackIn_106_0 = 255;
                    stackIn_98_0 = stackIn_106_0;
                    stackIn_106_1 = var10;
                    stackIn_98_1 = stackIn_106_1;
                    if (var26 != 0) {
                        statePc = 106;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 != stackIn_98_1) {
                        statePc = 100;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if ((var7 ^ -1) >= (var8[var9] ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_103_0 = var7;
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = var8[var9];
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var7 = stackIn_103_0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var9++;
                    if (var26 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_106_0 = 0;
                    stackIn_106_1 = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    oo.h(stackIn_106_0, stackIn_106_1, var7, 480);
                    var9 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (var9 >= 64) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    oo.a(-176 + ((var9 / 11 + 25) * wf.field_m + 1000 * var9) % 10560, 3952, 176, var6 * 125 >> -97135736, wp.field_f);
                    var9++;
                    if (var26 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var26 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    oo.c();
                    rq.field_l.a(30, 231, var6);
                    rq.field_l.a(239, 231, var6);
                    rq.field_l.a(448, 231, var6);
                    var9 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var10 = ll.field_k.g((byte) 125);
                    var11 = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (var11 >= var10) {
                        statePc = 136;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var12 = ll.field_k.field_m[var11];
                    var13 = ll.field_k.field_g[var11];
                    na.field_I.a(-32 + ga.field_v[var11], 126, var6);
                    stackIn_194_0 = 255;
                    stackIn_115_0 = stackIn_194_0;
                    stackIn_194_1 = var12;
                    stackIn_115_1 = stackIn_194_1;
                    if (var26 != 0) {
                        statePc = 194;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (stackIn_115_0 == stackIn_115_1) {
                        statePc = 134;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (63 <= var12) {
                        statePc = 134;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    pq.field_o.a(ga.field_v[var11], 166, var6);
                    var14 = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (-9 >= (var14 ^ -1)) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    oo.a(10 + ga.field_v[var11] << 471656292, -(((var14 / 5 + 19) * wf.field_m - -(var14 * 300)) % 960) + 3728, 96, 125 * var6 >> -1958180312, wp.field_f);
                    var14++;
                    if (var26 != 0) {
                        statePc = 123;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var26 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    w.field_z.a(ga.field_v[var11], 166, var6);
                    mg.a(var12, var13, (byte) 46, 106, ll.field_k, var6, -28 + ga.field_v[var11]);
                    var14 = ll.field_k.field_t[var12];
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    var15 = cr.a(var12, -107);
                    incrementValue$0 = var9;
                    var9++;
                    stackIn_125_0 = qp.field_w;
                    stackIn_124_0 = stackIn_125_0;
                    stackIn_125_1 = eb.a(this.field_r[incrementValue$0], true, true);
                    stackIn_124_1 = stackIn_125_1;
                    stackIn_125_2 = ga.field_v[var11] - 50;
                    stackIn_124_2 = stackIn_125_2;
                    stackIn_125_3 = 123;
                    stackIn_124_3 = stackIn_125_3;
                    if ((var14 ^ -1) > (var15 ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_126_0 = (ef) ((Object) stackIn_124_0);
                    stackIn_126_1 = (String) ((Object) stackIn_124_1);
                    stackIn_126_2 = stackIn_124_2;
                    stackIn_126_3 = stackIn_124_3;
                    stackIn_126_4 = 16711680;
                    statePc = 126;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = (ef) ((Object) stackIn_125_0);
                    stackIn_126_1 = (String) ((Object) stackIn_125_1);
                    stackIn_126_2 = stackIn_125_2;
                    stackIn_126_3 = stackIn_125_3;
                    stackIn_126_4 = 16777215;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    ((ef) (Object) stackIn_126_0).b(stackIn_126_1, stackIn_126_2, stackIn_126_3, stackIn_126_4, 1, var6);
                    if (255 == var13) {
                        statePc = 133;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if ((var13 ^ -1) > -64) {
                        statePc = 129;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var14 = ll.field_k.field_t[var13];
                    var15 = cr.a(var13, -101);
                    incrementValue$1 = var9;
                    var9++;
                    stackIn_131_0 = qp.field_w;
                    stackIn_130_0 = stackIn_131_0;
                    stackIn_131_1 = eb.a(this.field_r[incrementValue$1], true, true);
                    stackIn_130_1 = stackIn_131_1;
                    stackIn_131_2 = -73 + ga.field_v[var11];
                    stackIn_130_2 = stackIn_131_2;
                    stackIn_131_3 = 111;
                    stackIn_130_3 = stackIn_131_3;
                    if (var14 >= var15) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = (ef) ((Object) stackIn_130_0);
                    stackIn_132_1 = (String) ((Object) stackIn_130_1);
                    stackIn_132_2 = stackIn_130_2;
                    stackIn_132_3 = stackIn_130_3;
                    stackIn_132_4 = 16777215;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = (ef) ((Object) stackIn_131_0);
                    stackIn_132_1 = (String) ((Object) stackIn_131_1);
                    stackIn_132_2 = stackIn_131_2;
                    stackIn_132_3 = stackIn_131_3;
                    stackIn_132_4 = 16711680;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    ((ef) (Object) stackIn_132_0).b(stackIn_132_1, stackIn_132_2, stackIn_132_3, stackIn_132_4, 1, var6);
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var26 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    tm.field_f.a(ga.field_v[var11], 166, var6);
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var11++;
                    if (var26 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var11 = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var11 >= 3) {
                        statePc = 159;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var12 = ll.field_k.field_s[var11];
                    if (var26 != 0) {
                        statePc = 160;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if ((var12 ^ -1) != -256) {
                        statePc = 142;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    wk.field_J.a(38 - -(209 * var11), 244, var6);
                    hn.field_i.a(var11 * 209 + 91, 280, var6);
                    if (var26 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    qj.field_m.a(38 + 209 * var11, 244, var6);
                    oo.h(0, 0, 640, 366);
                    var13 = 0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (16 <= var13) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    oo.a((48 + 209 * var11 << -1224495516) + 8, 4000 + (wf.field_m * (var13 / 5 + 19) + 300 * var13) % 1920, 112, 125 * var6 >> 46580680, wp.field_f);
                    var13++;
                    if (var26 != 0) {
                        statePc = 149;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var26 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var13 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (-9 >= (var13 ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    oo.a(((var13 / 5 + 19) * wf.field_m + var13 * 300) % 720 + 8 + (209 * var11 + 48 << 1302155300), 5744, 112, var6 * 125 >> -379242520, wp.field_f);
                    var13++;
                    if (var26 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var26 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    pm.field_N.a(var11 * 209 + 38, 244, var6);
                    oo.c();
                    qh.a(var12, -29990, ll.field_k, 280, var11 * 209 + 91, var6);
                    var13 = ll.field_k.field_t[var12];
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    var14 = cr.a(var12, -95);
                    incrementValue$2 = var9;
                    var9++;
                    stackIn_156_0 = qp.field_w;
                    stackIn_155_0 = stackIn_156_0;
                    stackIn_156_1 = eb.a(this.field_r[incrementValue$2], true, true);
                    stackIn_155_1 = stackIn_156_1;
                    stackIn_156_2 = 209 * var11 + 166;
                    stackIn_155_2 = stackIn_156_2;
                    stackIn_156_3 = 295;
                    stackIn_155_3 = stackIn_156_3;
                    if (var13 < var14) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_157_0 = (ef) ((Object) stackIn_155_0);
                    stackIn_157_1 = (String) ((Object) stackIn_155_1);
                    stackIn_157_2 = stackIn_155_2;
                    stackIn_157_3 = stackIn_155_3;
                    stackIn_157_4 = 16711680;
                    statePc = 157;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_157_0 = (ef) ((Object) stackIn_156_0);
                    stackIn_157_1 = (String) ((Object) stackIn_156_1);
                    stackIn_157_2 = stackIn_156_2;
                    stackIn_157_3 = stackIn_156_3;
                    stackIn_157_4 = 16777215;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    ((ef) (Object) stackIn_157_0).b(stackIn_157_1, stackIn_157_2, stackIn_157_3, stackIn_157_4, 1, var6);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var11++;
                    if (var26 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    ul.field_f.a(93, 231, var6);
                    ul.field_f.a(209, 231, var6);
                    ul.field_f.a(329, 231, var6);
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    ul.field_f.a(573, 231, var6);
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    return;
                }
                case 163: {
                    wk.field_J.a(38 - -(209 * var11), 244, var6);
                    hn.field_i.a(var11 * 209 + 91, 280, var6);
                    if (var26 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (var26 == 0) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 168: {
                    oo.a((48 + 209 * var11 << -1224495516) + 8, 4000 + (wf.field_m * (var13 / 5 + 19) + 300 * var13) % 1920, 112, 125 * var6 >> 46580680, wp.field_f);
                    var13++;
                    if (var26 != 0) {
                        statePc = 183;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var26 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 173: {
                    oo.a(((var13 / 5 + 19) * wf.field_m + var13 * 300) % 720 + 8 + (209 * var11 + 48 << 1302155300), 5744, 112, var6 * 125 >> -379242520, wp.field_f);
                    var13++;
                    if (var26 != 0) {
                        statePc = 180;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 175: {
                    stackIn_178_0 = (ef) ((Object) stackIn_175_0);
                    stackIn_178_1 = (String) ((Object) stackIn_175_1);
                    stackIn_178_2 = stackIn_175_2;
                    stackIn_178_3 = stackIn_175_3;
                    stackIn_178_4 = 16711680;
                    statePc = 178;
                    continue stateLoop;
                }
                case 176: {
                    var11++;
                    if (var26 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 178: {
                    ((ef) (Object) stackIn_178_0).b(stackIn_178_1, stackIn_178_2, stackIn_178_3, stackIn_178_4, 1, var6);
                    statePc = 176;
                    continue stateLoop;
                }
                case 179: {
                    stackIn_178_0 = (ef) ((Object) stackIn_179_0);
                    stackIn_178_1 = (String) ((Object) stackIn_179_1);
                    stackIn_178_2 = stackIn_179_2;
                    stackIn_178_3 = stackIn_179_3;
                    stackIn_178_4 = 16777215;
                    statePc = 178;
                    continue stateLoop;
                }
                case 180: {
                    var14 = cr.a(var12, -95);
                    incrementValue$3 = var9;
                    var9++;
                    stackIn_179_0 = qp.field_w;
                    stackIn_181_0 = stackIn_179_0;
                    stackIn_179_1 = eb.a(this.field_r[incrementValue$3], true, true);
                    stackIn_181_1 = stackIn_179_1;
                    stackIn_179_2 = 209 * var11 + 166;
                    stackIn_181_2 = stackIn_179_2;
                    stackIn_179_3 = 295;
                    stackIn_181_3 = stackIn_179_3;
                    if (var13 < var14) {
                        statePc = 179;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    stackIn_175_0 = (ef) ((Object) stackIn_181_0);
                    stackIn_175_1 = (String) ((Object) stackIn_181_1);
                    stackIn_175_2 = stackIn_181_2;
                    stackIn_175_3 = stackIn_181_3;
                    statePc = 175;
                    continue stateLoop;
                }
                case 182: {
                    pm.field_N.a(var11 * 209 + 38, 244, var6);
                    oo.c();
                    qh.a(var12, -29990, ll.field_k, 280, var11 * 209 + 91, var6);
                    var13 = ll.field_k.field_t[var12];
                    statePc = 180;
                    continue stateLoop;
                }
                case 183: {
                    if (-9 >= (var13 ^ -1)) {
                        statePc = 182;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var13 = 0;
                    statePc = 183;
                    continue stateLoop;
                }
                case 187: {
                    if (16 <= var13) {
                        statePc = 186;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 189: {
                    qj.field_m.a(38 + 209 * var11, 244, var6);
                    oo.h(0, 0, 640, 366);
                    var13 = 0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 190: {
                    if ((var12 ^ -1) != -256) {
                        statePc = 189;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var12 = ll.field_k.field_s[var11];
                    if (var26 != 0) {
                        statePc = 160;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (stackIn_194_0 >= stackIn_194_1) {
                        statePc = 159;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 196: {
                    stackIn_194_0 = var11;
                    stackIn_194_1 = 3;
                    statePc = 194;
                    continue stateLoop;
                }
                case 198: {
                    stackIn_201_0 = var7;
                    statePc = 201;
                    continue stateLoop;
                }
                case 199: {
                    var9++;
                    if (var26 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var7 = stackIn_201_0;
                    statePc = 199;
                    continue stateLoop;
                }
                case 202: {
                    stackIn_201_0 = var8[var9];
                    statePc = 201;
                    continue stateLoop;
                }
                case 203: {
                    if ((var7 ^ -1) >= (var8[var9] ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (stackIn_205_0 != stackIn_205_1) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var10 = ll.field_k.field_s[var9];
                    stackIn_106_0 = 255;
                    stackIn_208_0 = stackIn_106_0;
                    stackIn_106_1 = var10;
                    stackIn_208_1 = stackIn_106_1;
                    if (var26 != 0) {
                        statePc = 106;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    stackIn_205_0 = stackIn_208_0;
                    stackIn_205_1 = stackIn_208_1;
                    statePc = 205;
                    continue stateLoop;
                }
                case 209: {
                    if (stackIn_209_0 >= stackIn_209_1) {
                        statePc = 105;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackIn_209_0 = var9;
                    stackIn_209_1 = 3;
                    statePc = 209;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            field_C = 0.5614934243533339;
        }
        field_D = null;
    }

    private final void f(int param0, int param1) {
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param1 > 2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    si.d(true);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (-256 != (this.field_E ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_m = 0;
                    if (var10 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if ((this.field_m ^ -1) != -1) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (10 >= b.a(true)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_m = this.field_m + 1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_m > 0) {
                        statePc = 10;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_m = this.field_m + 2;
                    if (-256 > (this.field_m ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_m = 255;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var7 = gh.field_f[this.field_E];
                    var8 = qp.field_w.a(var7);
                    var9 = param0 * (this.field_m * 8) >> 1447045448;
                    var5 = qp.field_w.field_w;
                    if (255 < var9) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var9 = 255;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var8 <= 300) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = var5 + qp.field_w.field_w;
                    var8 = var8 / 2;
                    if (var10 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var10 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var6 = var8 - -16;
                    var3 = bd.field_g;
                    var5 += 16;
                    if (0 > var3) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var3 - -var6 ^ -1) >= -636) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var3 = 640 + -var6 - 5;
                    if (var10 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var3 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var4 = 32 + bo.field_d;
                    if ((var9 ^ -1) < -251) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    oo.b(var3 - -2, var4 + 2, var6, var5, 4, 0, var9 / 2);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    oo.b(var3, var4, var6, var5, 4, 10061892, var9);
                    qp.field_w.a(var7, var3, var4, var6, var5, 16777215, 0, var9, 1, 1, 0);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0, int param1) {
        this.field_u[this.field_v].a(this.field_v / 4 * 75 + 130, 35 - -(640 * (this.field_v % param1) / 5), param0, 70);
        this.field_v = this.field_v + 1;
    }

    private final void b(boolean param0, int param1) {
        int var3;
        int var4;
        L0: {
          L1: {
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            if ((this.field_n ^ -1) < -1) {
              break L1;
            } else {
              this.field_n = 33;
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_n = 33 + -this.field_n;
          this.field_B = this.field_s;
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            this.field_l = (String) null;
            break L2;
          }
        }
        L3: {
          L4: {
            L5: {
              L6: {
                this.field_s = param1;
                var3 = this.field_s;
                if (var3 != 1) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((var3 ^ -1) != -1) {
                break L3;
              } else {
                if (var4 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            we.field_g[43] = ip.field_c;
            if (var4 == 0) {
              break L3;
            } else {
              break L4;
            }
          }
          we.field_g[43] = ec.field_a;
          break L3;
        }
    }

    final int d(int param0, int param1) {
        int var4;
        int var5;
        int stackIn_11_0 = 0;
        int var3;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= -65) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = this.field_j.length;
                  if (-2 != (var4 ^ -1)) {
                    break L3;
                  } else {
                    if (var5 == 0) {
                      var3 = 1;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (-3 == (var4 ^ -1)) {
                  break L2;
                } else {
                  break L1;
                }
              }
              L4: {
                if ((param1 ^ -1) != -1) {
                  stackIn_11_0 = 2;
                  break L4;
                } else {
                  stackIn_11_0 = 0;
                  break L4;
                }
              }
              var3 = stackIn_11_0;
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            var3 = param1;
            break L0;
          }
          L5: {
            L6: {
              var4 = var3;
              if (0 != var4) {
                break L6;
              } else {
                if (var5 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if ((var4 ^ -1) == -2) {
              return 400;
            } else {
              if (var4 != 2) {
                return super.d(-93, param1);
              } else {
                if (var5 == 0) {
                  return 560;
                } else {
                  break L5;
                }
              }
            }
          }
          return 210;
        } else {
          return -1;
        }
    }

    final void f(int param0) {
        int var3;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            if (0 == (op.field_m.field_j & 1 << fb.field_e.field_M)) {
              break L1;
            } else {
              we.field_g[42] = ih.field_c;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (-1 <= (cm.a(op.field_m.field_j, true) ^ -1)) {
              break L2;
            } else {
              we.field_g[42] = ih.field_c;
              if (var3 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          we.field_g[42] = u.field_j;
          break L0;
        }
        L3: {
          if (param0 > 123) {
            break L3;
          } else {
            this.field_w = -88;
            break L3;
          }
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        int statePc = 0;
        cb[] var2 = null;
        int var3 = 0;
        int var5 = 0;
        cb[] var6 = null;
        cb[] var7 = null;
        cb var8 = null;
        cb var10 = null;
        cb var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    super.a(0);
                    if (this.field_n > param0) {
                        statePc = 11;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if ((this.field_B ^ -1) != -2) {
                        statePc = 29;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (0 == wf.field_m % 2) {
                        statePc = 4;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6 = this.field_u;
                    var2 = var6;
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var6.length ^ -1) >= (var3 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var8 = var6[var3];
                    var10 = var8;
                    var11 = var10;
                    var10 = var8;
                    var8.d((byte) -102);
                    var3++;
                    if (var5 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var5 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var5 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_n = this.field_n - 1;
                    if (-1 <= (this.field_n ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_B = this.field_s;
                    if (this.field_B == 0) {
                        statePc = 15;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = this.field_u;
                    var2 = var7;
                    var3 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if ((var7.length ^ -1) >= (var3 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = var7[var3];
                    var11 = var10;
                    var11 = var10;
                    var10.c((byte) 99);
                    var3++;
                    if (var5 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.field_n = this.field_n - 1;
                    if (-1 <= (this.field_n ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_B = this.field_s;
                    if (this.field_B == 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var7 = this.field_u;
                    var2 = var7;
                    var3 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var7.length ^ -1) >= (var3 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var11 = var7[var3];
                    var11.c((byte) 99);
                    var3++;
                    if (var5 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var5 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_g.field_d != 0) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (39 != this.field_j[0]) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_g.a(1, param0 ^ -1);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    fieldTemp$0 = this.field_x - 1;
                    this.field_x = this.field_x - 1;
                    if (fieldTemp$0 <= 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_C = 0.0;
        field_D = "Advertising websites";
    }
}
