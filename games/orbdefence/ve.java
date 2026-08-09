/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ej {
    private String field_P;
    private boolean field_R;
    static int[] field_N;
    static int field_Q;
    private String field_S;
    static jc field_O;
    private dg field_T;
    static int[] field_V;
    private boolean field_U;

    public static void f(boolean param0) {
        if (param0) {
            return;
        }
        field_N = null;
        field_V = null;
        field_O = null;
    }

    ve(sk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_P = param1;
            if (null != this.field_P) {
                var3_int = qc.field_b.a(this.field_P, 260, qc.field_b.field_H);
                this.a(150 + var3_int, (byte) -81, 300);
            }
            this.field_T = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_R = false;
            this.field_T.field_z = true;
            this.field_U = false;
            this.a(this.field_T, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        this.field_U = true;
        this.field_T.field_z = false;
        if (param0 != 1) {
            hj var3 = (hj) null;
            ve.a(62, -4, (hj) null, -58, 98, -124, (byte) 124, -112);
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4, int param5, byte param6, int param7) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        hj var20 = null;
        hj var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ul.field_i > param5) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param3 = param3 - (ul.field_i + -param5);
                        param5 = ul.field_i;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ul.field_d > param7) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1 = param1 - (ul.field_d - param7);
                        param7 = ul.field_d;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (ul.field_e < param5 - -param3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param3 = ul.field_e + -param5;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param7 - -param1 > ul.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param1 = ul.field_a + -param7;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 <= (param3 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param1 <= 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var22 = param2.f();
                        var31 = ul.field_b;
                        var10 = ul.field_f;
                        var11 = ul.field_l;
                        var30 = new int[4];
                        ul.a(var30);
                        param2.d();
                        ul.i(var30[0], var30[1], var30[2], var30[3]);
                        var13 = param5 - -(param7 * param2.field_o);
                        var14 = -param3 + param2.field_o;
                        var26 = var22.field_v;
                        var23 = var26;
                        var15 = var23;
                        if (param6 >= 52) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var20 = (hj) null;
                        ve.a(69, -127, (hj) null, 0, -117, 43, (byte) -101, -90);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var16 = param7;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var16 >= param1 + param7) {
                            statePc = 42;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var19 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17 = param5;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param5 + param3 <= var17) {
                            statePc = 40;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var18 = var26[var13];
                        stackIn_41_0 = -1;
                        stackIn_25_0 = stackIn_41_0;
                        stackIn_41_1 = var18 ^ -1;
                        stackIn_25_1 = stackIn_41_1;
                        if (var19 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == stackIn_25_1) {
                            statePc = 39;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var17 ^ -1) >= -1) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0 == var15[var13 + -1]) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 >= var16) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 == var15[var13 + -param2.field_o]) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param2.field_o - 1 <= var17) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var15[1 + var13] == 0) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var16 >= -1 + param2.field_k) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var15[param2.field_o + var13] == 0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ul.f(var17, var16, param0, param4);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var13++;
                        var17++;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = var13;
                        stackIn_41_1 = var14;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var13 = stackIn_41_0 + stackIn_41_1;
                        var16++;
                        if (var19 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var22.c(-param2.field_p, -param2.field_u);
                        ul.a(var31, var10, var11);
                        ul.b(var30);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_46_0 = (RuntimeException) (var8);
                    stackIn_45_0 = stackIn_46_0;
                    stackIn_46_1 = new StringBuilder().append("ve.K(").append(param0).append(',').append(param1).append(',');
                    stackIn_45_1 = stackIn_46_1;
                    if (param2 == null) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_47_2 = "{...}";
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_47_2 = "null";
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    throw dd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, String param1, float param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 2113632) {
              if (param0 != this.field_R) {
                L1: {
                  stackIn_6_0 = this;

                  if (!param0) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    ((ve) (this)).field_R = stackIn_7_1 != 0;
                    if (!this.field_R) {
                      break L3;
                    } else {
                      this.field_T.a(16711422, 8405024, 4210752);
                      this.field_T.field_z = true;
                      if (!OrbDefence.field_D) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_T.a(16711422, 2113632, 4210752);
                  if (!this.field_U) {
                    break L2;
                  } else {
                    this.field_T.field_z = false;
                    break L2;
                  }
                }
                this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                this.field_S = param1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                this.field_S = param1;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("ve.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        qc.field_b.c(this.field_S, param0 - -(this.field_m >> 289864865), param1 + 103, 16777215, -1);
        if (!(null == this.field_P)) {
            ul.d(param0 + 20, param1 - -113, 260, 8421504);
            qc.field_b.a(this.field_P, param0 + 20, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, qc.field_b.field_H);
        }
    }

    static {
        field_V = new int[12];
        field_N = new int[8192];
    }
}
