/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements cl {
    static String field_e;
    private int field_s;
    private int field_t;
    static cn field_o;
    static int field_u;
    private pj field_h;
    static String field_p;
    private int[][] field_w;
    private wm field_k;
    private cn field_f;
    private int field_q;
    static volatile boolean field_g;
    static String field_j;
    static int field_m;
    private wm field_i;
    private int field_l;
    private cn field_c;
    private rh[][] field_v;
    private cn field_b;
    static int field_r;
    private int[] field_a;
    private int[] field_n;
    private cn field_d;

    public final void a(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_c = (cn) null;
                break L1;
              }
            }
            L2: {
              if (this.field_t <= 0) {
                break L2;
              } else {
                var2_int = (this.field_t << 1122320104) / 80;
                var3 = this.field_h.field_B;
                var4 = var3 / 7;
                var5 = var3 % 7;
                var6 = -224 - (-((var5 + var4) * 32) - this.field_q);
                var7 = -24 + (24 * (var4 + -var5) + (168 + this.field_l));
                this.field_b.b(var6, var7, var2_int);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "lj.C(" + param0 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0.setFocusTraversalKeysEnabled(false);
            var2_int = -126 % ((21 - param1) / 40);
            param0.addKeyListener(in.field_C);
            param0.addFocusListener(in.field_C);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lj.N(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, ph param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 2) {
              this.a(param4.field_a, -32, param3, param2, param0);
              param4.d(param2, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("lj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void c(int param0) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_82_0 = null;
        boolean stackOut_6_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        rh[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        rh var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int var7 = 0;
        rh[] var8 = null;
        int var9 = 0;
        rh var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        if (param0 == -30876) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        discarded$0 = this.a(false, 55);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = var2_int;
                        stackIn_5_1 = 49;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= stackIn_5_1) {
                            statePc = 27;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this.field_h.field_p.a(var2_int, (byte) 122);
                        stackIn_28_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var11 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!stackIn_7_0) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_n[var2_int] = this.field_n[var2_int] + 4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_n[var2_int] > 256) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_n[var2_int] = 256;
                        if ((3 & mo.field_a) != 0) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == this.field_v[var2_int]) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = this.field_v[var2_int];
                        var4 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var3.length <= var4) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5 = var3[var4];
                        var5.field_a = var5.field_a - 1;
                        stackIn_5_0 = -236;
                        stackIn_22_0 = stackIn_5_0;
                        stackIn_5_1 = var5.field_a ^ -1;
                        stackIn_22_1 = stackIn_5_1;
                        if (var11 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 < stackIn_22_1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5.field_a = 235;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4++;
                        if (var11 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var2_int++;
                        if (var11 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = this.field_s ^ -1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (this.field_s + 160 <= mo.field_a) {
                            statePc = 61;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var2_int = mo.field_a - this.field_s;
                        if (16 <= var2_int) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_39_0 = var2_int * 16;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-73 >= (var2_int ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_39_0 = 256;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = -(2 * var2_int) + 400;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3_int = stackIn_39_0;
                        var4 = je.field_d.length;
                        var5_array = new int[var4];
                        var6 = new int[var4];
                        var7 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var7 ^ -1) <= (var4 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5_array[var7] = hj.a((byte) 113, 12582912, var3_int, je.field_d[var7]);
                        var6[var7] = hj.a((byte) 127, 65793, var3_int, rg.field_P[var7]);
                        var7++;
                        if (var11 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var11 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = -50;
                        stackIn_47_1 = var7 ^ -1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 >= stackIn_47_1) {
                            statePc = 60;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var11 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null == this.field_v[var7]) {
                            statePc = 59;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8 = this.field_v[var7];
                        var9 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((var9 ^ -1) <= (var8.length ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var10 = var8[var9];
                        var10.field_e = var5_array[this.field_a[var7]];
                        var10.field_h = var6[this.field_a[var7]];
                        stackIn_47_0 = var2_int ^ -1;
                        stackIn_55_0 = stackIn_47_0;
                        stackIn_47_1 = -121;
                        stackIn_55_1 = stackIn_47_1;
                        if (var11 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 > stackIn_55_1) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10.field_a = 256;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var9++;
                        if (var11 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var11 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var2_int = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (49 <= var2_int) {
                            statePc = 78;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_82_0 = this;
                        stackIn_64_0 = stackIn_82_0;
                        if (var11 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (((lj) (this)).field_v[var2_int] != null) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var11 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var3 = this.field_v[var2_int];
                        var4 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var4 ^ -1) <= (var3.length ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var5 = var3[var4];
                        var5.field_e = je.field_d[this.field_a[var2_int]];
                        var5.field_h = rg.field_P[this.field_a[var2_int]];
                        var4++;
                        if (var11 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var11 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var2_int++;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var11 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (-1 > (this.field_t ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_82_0 = this;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ((lj) (this)).field_t = ((lj) (this)).field_t - 1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) var2), "lj.E(" + param0 + ')');
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(boolean param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (0 < param2) {
                  break L2;
                } else {
                  if (!param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((param2 % 30 ^ -1) > -16) {
                  break L3;
                } else {
                  ec.a(this.field_l, this.field_q + -224, (byte) -72, this.field_f, 16711680, 256);
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_f.b(-224 + this.field_q, this.field_l, 256);
              break L1;
            }
            L4: {
              if (param1 == -1723) {
                break L4;
              } else {
                this.field_l = -37;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "lj.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 % 7 == 0) {
                break L1;
              } else {
                if (this.field_i.a(-(param1 / 7) + (param1 - 1), (byte) 87)) {
                  var3_int = var3_int | 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((param1 % 7 ^ -1) == -7) {
                break L2;
              } else {
                if (!this.field_i.a(-(param1 / 7) + param1, (byte) 123)) {
                  break L2;
                } else {
                  var3_int = var3_int | 2;
                  break L2;
                }
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                this.b(-31);
                break L3;
              }
            }
            L4: {
              if ((param1 ^ -1) >= -7) {
                break L4;
              } else {
                if (this.field_i.a(param1 + 35, (byte) 122)) {
                  var3_int = var3_int | 4;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (-43 >= (param1 ^ -1)) {
                break L5;
              } else {
                if (!this.field_i.a(param1 + 42, (byte) 118)) {
                  break L5;
                } else {
                  var3_int = var3_int | 8;
                  break L5;
                }
              }
            }
            stackIn_28_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "lj.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    public static void d(int param0) {
        field_j = null;
        field_p = null;
        if (param0 < 53) {
            return;
        }
        try {
            field_o = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lj.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cn var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var7 = fm.b(param1 + -29348, param3);
            if (null == var7) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (param2 == param1) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var8 = var7.field_E * param2 >> -1614342680;
                        var9 = param2 * var7.field_G >> 303333288;
                        if (param4 != 256) {
                          break L4;
                        } else {
                          var7.c(-(var8 >> -78626143) + param0, param5 + -var9, var8, var9);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7.d(param0 - (var8 >> -1992543999), -var9 + param5, var8, var9, param4);
                      break L3;
                    }
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L5: {
                  if (param4 == 256) {
                    break L5;
                  } else {
                    var7.d(-(var7.field_E >> 876227201) + param0, param5 + -var7.field_G, param4);
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                var7.h(param0 + -(var7.field_E >> 144681697), -var7.field_G + param5);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var7_ref), "lj.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = -95 % ((43 - param2) / 50);
              var6_int = this.field_h.field_h[param1].field_a;
              if (this.field_h.field_p.a(param1, (byte) 106)) {
                break L1;
              } else {
                if (-25 != (param1 ^ -1)) {
                  var6_int = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            i.field_r[var6_int].e(param4, param0 + 1, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "lj.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void b(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_69_0 = 0;
        boolean stackOut_10_0;
        boolean stackOut_39_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        jh.c();
                        if (null != this.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_c = new cn(448, 356);
                        this.field_f = new cn(480, 388);
                        this.field_f.field_w = -16;
                        this.field_f.field_A = -16;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_c.e();
                        gf.a();
                        var2_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = -8;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= (var2_int ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = 32 * (6 - var2_int);
                        var4 = var2_int * 24;
                        var5 = -var2_int + 6;
                        stackIn_33_0 = 0;
                        stackIn_8_0 = stackIn_33_0;
                        if (var8 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var6 ^ -1) <= (1 + var2_int ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = 16777215;
                        stackOut_10_0 = this.field_h.field_m.a(var5, (byte) 92);
                        stackIn_6_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var8 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_h.field_j.a(var5, (byte) 86)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 == var5) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (6 == var5) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ri.field_d[5].e(var3, var4, var7);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (6 == var5) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-49 == (var5 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ri.field_d[4].e(32 + var3, var4, var7);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.b(var4, var5, -75, var7, var3);
                        var5 += 8;
                        var6++;
                        var3 += 64;
                        if (var8 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2_int++;
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = 7;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2_int = stackIn_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 13;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 <= var2_int) {
                            statePc = 68;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3 = 32 * (-6 + var2_int);
                        var4 = var2_int * 24;
                        var5 = var2_int * 7 + -42;
                        stackIn_69_0 = 0;
                        stackIn_37_0 = stackIn_69_0;
                        if (var8 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var6 >= 13 - var2_int) {
                            statePc = 67;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7 = 16777215;
                        stackOut_39_0 = this.field_h.field_m.a(var5, (byte) 106);
                        stackIn_35_0 = stackOut_39_0 ? 1 : 0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var8 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!stackIn_40_0) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (this.field_h.field_j.a(var5, (byte) 74)) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ri.field_d[5].e(var3, var4, var7);
                        ri.field_d[4].e(var3 + 32, var4, var7);
                        this.b(var4, var5, 115, var7, var3);
                        if (var6 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-1 == (var5 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-43 == (var5 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ri.field_d[5].e(var3 - -32, 24 + var4, 0);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var6 != 12 - var2_int) {
                            statePc = 66;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (42 == var5) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (48 != var5) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ri.field_d[4].e(var3, var4 - -24, 0);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var5 += 8;
                        var6++;
                        var3 += 64;
                        if (var8 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var2_int++;
                        if (var8 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = param0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 == -20827) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        this.field_w = (int[][]) null;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        this.field_f.e();
                        gf.a();
                        this.field_c.e(16, 16, 16744448);
                        gf.d(8, 8, 0, 0, this.field_f.field_y, this.field_f.field_v);
                        this.field_c.e(16, 16, 0);
                        jh.b();
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) var2), "lj.J(" + param0 + ')');
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(byte param0) {
        try {
            int var2_int = -126 / ((4 - param0) / 45);
            this.field_s = mo.field_a;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lj.H(" + param0 + ')');
        }
    }

    public final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 19091) {
                break L1;
              } else {
                this.field_s = 60;
                break L1;
              }
            }
            L2: {
              param2 = param2 - this.field_l;
              param0 = param0 - this.field_q;
              var4_int = (3 * param0 - (-672 + 4 * (-168 + param2))) / 192;
              var5 = (param2 * 4 + param0 * 3) / 192;
              if (var4_int < 0) {
                break L2;
              } else {
                if ((var5 ^ -1) > -1) {
                  break L2;
                } else {
                  if ((var4_int ^ -1) <= -8) {
                    break L2;
                  } else {
                    if ((var5 ^ -1) <= -8) {
                      break L2;
                    } else {
                      stackIn_14_0 = var5 * 7 - -var4_int;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_16_0 = -1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "lj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_16_0;
        }
    }

    public final gg b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        gg stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param0 % 7;
              var4 = param0 / 7;
              if (param1 == -15390) {
                break L1;
              } else {
                this.a(-20, -18, 83, -99, 20, -65);
                break L1;
              }
            }
            stackIn_4_0 = new gg(-192 + (32 * (var3_int + var4) + this.field_q), 168 + (24 * (var4 + -var3_int) + this.field_l));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "lj.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(cn param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        boolean stackOut_17_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -32) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.b(-31, -114, 86, -38, -41);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != this.field_h) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10 = 256;
                        var11 = 10066329;
                        if ((gm.field_d.field_L[param2].field_a ^ -1) != -1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = 128;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6_int = var10 * (192 - -((16711680 & var11) >> -950308110)) / 255;
                        var7 = var10 * (192 - -(63 & var11 >> 505295658)) / 255;
                        var8 = var10 * ((var11 >> 573505410 & 63) + 192) / 255;
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this.field_h.field_p.a(param2, (byte) 89)) {
                            statePc = 28;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-25 != (param2 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6_int = 96;
                        var8 = 0;
                        var7 = 48;
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6_int = 0;
                        var7 = 0;
                        var8 = 0;
                        var10_ref_int__ = this.field_h.a((byte) 120, param2);
                        var11 = 0;
                        var12_ref_int__ = var10_ref_int__;
                        var13 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var12_ref_int__.length ^ -1) >= (var13 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = var12_ref_int__[var13];
                        stackOut_17_0 = this.field_h.field_p.a(var14, (byte) 80);
                        stackIn_25_0 = stackOut_17_0 ? 1 : 0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var19 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var15 = this.a((byte) -103, var14);
                        var16 = je.field_d[this.field_a[var14]];
                        var6_int = var6_int + (192 + ((16711680 & var16) >> -1756144974)) * var15 / 255;
                        var7 = var7 + (192 - -(var16 >> -1575707670 & 63)) * var15 / 255;
                        var8 = var8 + (192 - -((var16 & 255) >> -141094046)) * var15 / 255;
                        var11++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var13++;
                        if (var19 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var11;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 <= 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = 4 * var11;
                        var7 = var7 / var12;
                        var6_int = var6_int / var12;
                        var8 = var8 / var12;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7 += 16;
                        var6_int += 16;
                        var8 += 16;
                        var9 = var6_int - (-(var7 << -1366984671) - var8) >> -192553822;
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = this.a((byte) -72, param2);
                        var10 = je.field_d[this.field_a[param2]];
                        var8 = (192 + ((255 & var10) >> 1450323330)) * var9 / 255;
                        var6_int = (192 - -((var10 & 16711680) >> -684997678)) * var9 / 255;
                        var7 = var9 * ((var10 >> -230926646 & 63) + 192) / 255;
                        if ((this.field_s ^ -1) != 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = mo.field_a - this.field_s;
                        if (var11 < 200) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-17 >= (var11 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_41_0 = var11 * 16;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (72 > var11) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_41_0 = -(2 * var11) + 400;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = 256;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var12 = stackIn_41_0;
                        var8 = var8 * (256 + -var12) >>> -458713016;
                        var7 = (-var12 + 256) * var7 >>> -692228536;
                        var6_int = (var12 >> 1009643937) + ((-var12 + 256) * var6_int >>> 933025288);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10 = 0;
                        var11 = param3 + param0.field_w + gf.field_i * (param0.field_A + param4);
                        var12 = -param0.field_y + gf.field_i;
                        var14 = -param0.field_v;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var14 ^ -1) <= -1) {
                            statePc = 61;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var19 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var13 = -param0.field_y;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (-1 >= (var13 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var15 = param0.field_B[var10];
                        stackIn_54_0 = var15 ^ -1;
                        stackIn_48_0 = stackIn_54_0;
                        stackIn_54_1 = -1;
                        stackIn_48_1 = stackIn_54_1;
                        if (var19 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 == stackIn_48_1) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var16 = var15 & 16711680;
                        var17 = var15 & 65280;
                        var17 = var17 * var7;
                        var18 = 255 & var15;
                        var16 = var16 * var6_int;
                        var18 = var18 * var8;
                        var15 = 65280 & var18 | (16711680 & var17 | var16 & -16777216);
                        gf.field_b[var11] = mp.a(var15 >>> -324538328, -16777216);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11++;
                        var13++;
                        var10++;
                        if (var19 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = var11;
                        stackIn_54_1 = var12;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var11 = stackIn_54_0 + stackIn_54_1;
                        var14++;
                        if (var19 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_59_0 = (RuntimeException) (var6);
                    stackIn_57_0 = stackIn_59_0;
                    stackIn_59_1 = new StringBuilder().append("lj.R(");
                    stackIn_57_1 = stackIn_59_1;
                    if (param0 == null) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw vk.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              jh.c();
              if (this.field_d == null) {
                this.field_d = new cn(64, 68);
                this.field_b = new cn(96, 100);
                this.field_b.field_w = -16;
                this.field_b.field_A = -16;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_d.e();
              gf.a();
              var4_int = 0;
              var5 = 0;
              ri.field_d[5].e(var4_int, var5, 16777215);
              ri.field_d[4].e(var4_int + 32, var5, 16777215);
              this.b(var5, param2, -127, 16777215, var4_int);
              this.field_b.e();
              gf.a();
              this.field_d.e(16, 16, param1);
              gf.d(16, 16, 0, 0, this.field_b.field_y, this.field_b.field_v);
              this.field_d.e(16, 16, 0);
              jh.b();
              this.field_t = 80;
              if (param0 == -9398) {
                break L2;
              } else {
                this.a(-70, -121, 96, 85, 77);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "lj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        Object stackIn_35_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        hb[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            var6 = new hb[4];
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (4 <= var7) {
                      break L4;
                    } else {
                      stackIn_35_0 = this;

                      if (var8 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (((lj) (this)).field_h.field_A[var7] == null) {
                            break L5;
                          } else {
                            if ((6 & this.field_h.field_A[var7].field_o ^ -1) != -1) {
                              break L5;
                            } else {
                              incrementValue$0 = var5_int;
                              var5_int++;
                              var6[incrementValue$0] = this.field_h.field_A[var7];
                              break L5;
                            }
                          }
                        }
                        var7++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (0 == var5_int) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L6: {
                      if (-2 == (var5_int ^ -1)) {
                        break L6;
                      } else {
                        L7: {
                          if (2 == var5_int) {
                            break L7;
                          } else {
                            L8: {
                              if ((var5_int ^ -1) != -4) {
                                break L8;
                              } else {
                                this.a(param1 + 20, 256, 128, var6[0].field_c, param2, param3 + 37);
                                this.a(44 + param1, 256, 128, var6[1].field_c, param2, param3 - -37);
                                this.a(param1 + 32, 256, 128, var6[2].field_c, param2, 48 + param3);
                                if (var8 == 0) {
                                  break L2;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            this.a(param1 - -32, 256, 96, var6[0].field_c, param2, 31 + param3);
                            this.a(param1 - -16, 256, 96, var6[1].field_c, param2, param3 + 41);
                            this.a(48 + param1, 256, 96, var6[2].field_c, param2, 41 + param3);
                            this.a(32 + param1, 256, 96, var6[3].field_c, param2, 51 + param3);
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.a(22 + param1, 256, 144, var6[0].field_c, param2, 45 + param3);
                        this.a(42 + param1, 256, 144, var6[1].field_c, param2, param3 - -45);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackIn_35_0 = this;
                    break L3;
                  }
                }
                this.a(param1 - -32, 256, 192, var6[0].field_c, param2, param3 + 45);
                break L2;
              }
              var7 = -60 % ((param0 - -54) / 39);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "lj.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ai var7 = null;
        int var7_int = 0;
        cn var7_ref = null;
        int[] var7_array = null;
        rh[] var7_array2 = null;
        int var8 = 0;
        int var9_int = 0;
        rh var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == -25) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_u = -46;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != this.field_h) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = gm.field_d.field_L[param2];
                        if (qj.field_c[param2] != null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = qj.field_c[param2];
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5_int = var7.field_a;
                        var6 = 1;
                        if (var10 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = this.field_h.field_h[param2].field_a;
                        var6 = this.field_h.field_p.a(param2, (byte) 106) ? 1 : 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param2 == 24) {
                            statePc = 50;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.a(i.field_r[0], -32, param2, param0, param1 + 1);
                        if (-7 <= (param2 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7_int = param2 - 7;
                        if (!this.field_h.field_p.a(var7_int, (byte) 110)) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!this.field_i.a(var7_int + 42, (byte) 78)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ec.a(18 + param1, param0, (byte) -80, mf.field_b[0], (je.field_d[this.field_a[var7_int]] >> 146653889 & 8355711) + 8421504, this.a((byte) -11, var7_int) >> -1966915710);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-7 != (param2 % 7 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7_int = 1 + param2;
                        if (!this.field_h.field_p.a(var7_int, (byte) 93)) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!this.field_i.a(param2 + -(param2 / 7), (byte) 121)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ec.a(param1 + 18, param0, (byte) -90, mf.field_b[1], 8421504 + (8355711 & je.field_d[this.field_a[var7_int]] >> -334941183), this.a((byte) -8, var7_int) >> 1256560866);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((param2 ^ -1) <= -43) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7_int = 7 + param2;
                        if (!this.field_h.field_p.a(var7_int, (byte) 104)) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (this.field_i.a(param2 + 42, (byte) 97)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ec.a(param1 + 18, param0, (byte) -128, mf.field_b[2], (8355711 & je.field_d[this.field_a[var7_int]] >> -1841161023) + 8421504, this.a((byte) -67, var7_int) >> 454150434);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (0 == param2 % 7) {
                            statePc = 155;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7_int = -1 + param2;
                        if (!this.field_h.field_p.a(var7_int, (byte) 114)) {
                            statePc = 49;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_i.a(var7_int - var7_int / 7, (byte) 101)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ec.a(18 + param1, param0, (byte) -105, mf.field_b[3], ((je.field_d[this.field_a[var7_int]] & 16711422) >> -890446015) + 8421504, this.a((byte) -36, var7_int) >> -1342066270);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var10 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1 == (var5_int ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        i.field_r[var5_int].h(param0, param1 + 1);
                        if (var10 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var7_int = this.field_h.d(param2, 30813);
                        mc.field_w[var7_int].h(param0, 1 + param1);
                        if (var10 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (-1 != (var5_int ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var7_int = this.a(false, param2);
                        this.a(mc.field_w[var7_int], -32, param2, param0, param1 - 7);
                        if (var10 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.a(i.field_r[var5_int], -32, param2, param0, param1 + 1);
                        if (-3 != (gh.field_i[var5_int].field_g ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (this.field_h == null) {
                            statePc = 75;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (!this.field_h.field_j.a(param2, (byte) 101)) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var7_ref = jb.a((byte) -70, var5_int);
                        if (var7_ref == null) {
                            statePc = 85;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (null != this.field_h) {
                            statePc = 83;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (null == var7_ref) {
                            statePc = 85;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var8 = var7_ref.field_E * 5 >> 1647428707;
                        var9_int = var7_ref.field_G * 5 >> 1567600547;
                        var7_ref.c(param0 + (-var8 + 48 >> -278782943), 40 + (param1 + -var9_int), var8, var9_int);
                        if (var10 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7_ref.h(-(var7_ref.field_y >> 510270497) + (param0 - -32), -var7_ref.field_v + (24 + (21 + param1)));
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (this.field_h == null) {
                            statePc = 134;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (this.field_v[param2] == null) {
                            statePc = 101;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var7_array = this.field_w[param2];
                        var8 = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if ((var8 ^ -1) <= (var7_array.length ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var9_int = var7_array[var8];
                        sn.field_c[var9_int].h(param0, param1);
                        var8++;
                        if (var10 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var10 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var7_array2 = this.field_v[param2];
                        var8 = 0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if ((var7_array2.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var9 = var7_array2[var8];
                        var9.e();
                        var8++;
                        if (var10 != 0) {
                            statePc = 104;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var10 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((param2 ^ -1) < -7) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var7_int = -7 + param2;
                        if (!this.field_h.field_p.a(var7_int, (byte) 106)) {
                            statePc = 110;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (!this.field_i.a(var7_int - -42, (byte) 86)) {
                            statePc = 110;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        ec.a(18 + param1, param0, (byte) -111, mf.field_b[0], 8421504 - -((16711422 & je.field_d[this.field_a[var7_int]]) >> 558277505), this.a((byte) -39, var7_int) >> -2125722846);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (-7 != (param2 % 7 ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var7_int = param2 + 1;
                        if (!this.field_h.field_p.a(var7_int, (byte) 110)) {
                            statePc = 119;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!this.field_i.a(-(param2 / 7) + param2, (byte) 92)) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        ec.a(param1 - -18, param0, (byte) -82, mf.field_b[1], ((je.field_d[this.field_a[var7_int]] & 16711422) >> 623078305) + 8421504, this.a((byte) -57, var7_int) >> -82065854);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (-43 >= (param2 ^ -1)) {
                            statePc = 126;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var7_int = 7 + param2;
                        if (!this.field_h.field_p.a(var7_int, (byte) 93)) {
                            statePc = 126;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (!this.field_i.a(param2 + 42, (byte) 92)) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        ec.a(param1 + 18, param0, (byte) -111, mf.field_b[2], 8421504 + ((je.field_d[this.field_a[var7_int]] & 16711422) >> 131974177), this.a((byte) -56, var7_int) >> -162370494);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (param2 % 7 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var7_int = param2 + -1;
                        if (!this.field_h.field_p.a(var7_int, (byte) 69)) {
                            statePc = 134;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (this.field_i.a(var7_int + -(var7_int / 7), (byte) 67)) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        ec.a(18 + param1, param0, (byte) -104, mf.field_b[3], 8421504 - -(8355711 & je.field_d[this.field_a[var7_int]] >> 623681569), this.a((byte) -52, var7_int) >> -1825618174);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (this.field_h != null) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (this.field_h.field_q != param2) {
                            statePc = 141;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.a((byte) 56, param0, 256, param1);
                        if (var10 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if ((param2 ^ -1) != (this.field_h.field_B ^ -1)) {
                            statePc = 155;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (-3 != (gh.field_i[var5_int].field_g ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var7_ref = fm.b(-29092, this.field_h.field_u.field_c);
                        if (null == var7_ref) {
                            statePc = 152;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var7_ref.d((64 + -var7_ref.field_y >> 2048171169) + param0, -var7_ref.field_v + param1 - -45, 80);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        this.a((byte) -107, param0, 80, param1);
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 154: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) var5), "lj.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 155: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    lj(go param0, int param1, int param2) {
        this(param1, param2);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_h = param0.field_Y;
            this.field_i = this.field_h.field_v;
            this.field_a = new int[49];
            this.field_n = new int[49];
            this.field_w = new int[49][];
            this.field_v = new rh[49][];
            this.field_k = new wm(84);
            this.field_s = -1;
            this.a(15122, 0);
            this.a(15122, 6);
            this.a(15122, 42);
            this.a(15122, 48);
            this.c((byte) 125);
            this.b(-20827);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("lj.<init>(");

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
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0) {
        if (param0 != 2985) {
            return;
        }
        try {
            this.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lj.D(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        try {
            this.field_w[param1][param0] = param4;
            var6_int = 1 + this.field_q + (32 * (param1 / 7 - -(param1 % 7)) - 224 - -ud.field_w[param4]);
            int var8 = -118 / ((param2 - 32) / 44);
            var7 = -21 + r.field_b[param4] + (168 - -(24 * (-(param1 % 7) + param1 / 7))) + this.field_l;
            this.field_a[param1] = param3;
            this.field_v[param1][param0] = new rh(var6_int, var7, 20, 40, je.field_d[param3], rg.field_P[param3], 256);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lj.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void b(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_199_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        nb.field_d.h(13 + (-320 + (this.field_q + 79)), this.field_l - -13);
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (168 < var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        gf.b(-(var2_int * 4 / 3) + this.field_q, var2_int + (18 + this.field_l), 8 * var2_int / 3, 0);
                        gf.b(-(4 * var2_int / 3) + this.field_q, -var2_int + 336 + 18 + this.field_l, 8 * var2_int / 3, 0);
                        var2_int++;
                        if (var13 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == -55) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_n = (int[]) null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-8 >= (var2_int ^ -1)) {
                            statePc = 118;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = -(32 * (1 + var2_int)) + this.field_q;
                        var4 = var2_int * 24 + this.field_l;
                        var5 = -var2_int + 6;
                        stackIn_119_0 = 0;
                        stackIn_13_0 = stackIn_119_0;
                        if (var13 != 0) {
                            statePc = 119;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = stackIn_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (1 + var2_int <= var6) {
                            statePc = 116;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var13 != 0) {
                            statePc = 117;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == this.field_h) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!this.field_h.field_p.a(var5, (byte) 104)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_25_0 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 223;
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
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = stackIn_25_0;
                        if (-1 != (var6 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var5 ^ -1) == -1) {
                            statePc = 70;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var5 ^ -1) != -7) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.a(var4, 9, var3, var5, ua.field_b[5]);
                        if (var13 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = -7 + var5;
                        if (var7 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!this.field_h.field_p.a(var8, (byte) 67)) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_42_0 = 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = stackIn_42_0;
                        var10 = 5;
                        if (var9 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = this.field_i.a(42 + var8, (byte) 123) ? 1 : 0;
                        if (var11 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (this.field_h == null) {
                            statePc = 61;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (this.field_h.field_j.a(var5, (byte) 110)) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((this.field_h.field_B ^ -1) != (var5 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (this.field_h.field_j.a(var8, (byte) 103)) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var8 ^ -1) != (this.field_h.field_B ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_64_0 = 1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var12 = stackIn_64_0;
                        if (var12 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_68_0 = 3;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = 1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var10 = stackIn_68_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        this.a(var4, param0 ^ -31, var3, var5, ua.field_b[var10]);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((var2_int ^ -1) != (var6 ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var5 == 6) {
                            statePc = 115;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if ((var5 ^ -1) != -49) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        this.a(var4, 121, 32 + var3, var5, ua.field_b[4]);
                        if (var13 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var8 = var5 - -1;
                        if (var7 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (!this.field_h.field_p.a(var8, (byte) 89)) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackIn_87_0 = 1;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_87_0 = 0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var9 = stackIn_87_0;
                        var10 = 4;
                        if (var9 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var11 = this.field_i.a(-(var5 / 7) + var5, (byte) 90) ? 1 : 0;
                        if (var11 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (this.field_h == null) {
                            statePc = 106;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (this.field_h.field_j.a(var5, (byte) 66)) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var5 != this.field_h.field_B) {
                            statePc = 108;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (this.field_h.field_j.a(var8, (byte) 80)) {
                            statePc = 106;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((var8 ^ -1) != (this.field_h.field_B ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackIn_109_0 = 1;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackIn_109_0 = 0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var12 = stackIn_109_0;
                        if (var12 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_113_0 = 0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackIn_113_0 = 2;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var10 = stackIn_113_0;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.a(var4, param0 + 85, 32 + var3, var5, ua.field_b[var10]);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        this.a(var3, var4, var5, -25);
                        var6++;
                        var3 += 64;
                        var5 += 8;
                        if (var13 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var2_int++;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var13 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackIn_119_0 = 7;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var2_int = stackIn_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if ((var2_int ^ -1) <= -14) {
                            statePc = 224;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var3 = -(32 * (-var2_int + 13)) + this.field_q;
                        var4 = var2_int * 24 + this.field_l;
                        var5 = 7 * var2_int - 42;
                        if (var13 != 0) {
                            statePc = 224;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var6 = 0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (13 - var2_int <= var6) {
                            statePc = 220;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (var13 != 0) {
                            statePc = 221;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (this.field_h == null) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (!this.field_h.field_p.a(var5, (byte) 75)) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackIn_134_0 = 1;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackIn_134_0 = 0;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var7 = stackIn_134_0;
                        var8 = -7 + var5;
                        if (var7 != 0) {
                            statePc = 138;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (!this.field_h.field_p.a(var8, (byte) 122)) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackIn_141_0 = 1;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackIn_141_0 = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var9 = stackIn_141_0;
                        var10 = 5;
                        if (var9 != 0) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var11 = this.field_i.a(42 + var8, (byte) 121) ? 1 : 0;
                        if (var11 != 0) {
                            statePc = 147;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (this.field_h == null) {
                            statePc = 160;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (this.field_h.field_j.a(var5, (byte) 68)) {
                            statePc = 154;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if ((var5 ^ -1) != (this.field_h.field_B ^ -1)) {
                            statePc = 162;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (this.field_h.field_j.a(var8, (byte) 103)) {
                            statePc = 160;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if ((this.field_h.field_B ^ -1) != (var8 ^ -1)) {
                            statePc = 162;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        stackIn_163_0 = 1;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackIn_163_0 = 0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var12 = stackIn_163_0;
                        if (var12 != 0) {
                            statePc = 166;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackIn_167_0 = 3;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        stackIn_167_0 = 1;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var10 = stackIn_167_0;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var8 = var5 - -1;
                        this.a(var4, 5, var3, var5, ua.field_b[var10]);
                        var10 = 4;
                        if (var7 != 0) {
                            statePc = 172;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (!this.field_h.field_p.a(var8, (byte) 95)) {
                            statePc = 174;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackIn_175_0 = 1;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackIn_175_0 = 0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        var9 = stackIn_175_0;
                        if (var9 == 0) {
                            statePc = 200;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var11 = this.field_i.a(-(var5 / 7) + var5, (byte) 116) ? 1 : 0;
                        if (var11 != 0) {
                            statePc = 179;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (null == this.field_h) {
                            statePc = 192;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (this.field_h.field_j.a(var5, (byte) 88)) {
                            statePc = 186;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (var5 != this.field_h.field_B) {
                            statePc = 194;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (this.field_h.field_j.a(var8, (byte) 70)) {
                            statePc = 192;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (var8 != this.field_h.field_B) {
                            statePc = 194;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        stackIn_195_0 = 1;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        stackIn_195_0 = 0;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        var12 = stackIn_195_0;
                        if (var12 != 0) {
                            statePc = 198;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        stackIn_199_0 = 2;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        stackIn_199_0 = 0;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        var10 = stackIn_199_0;
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        this.a(var4, 115, var3 - -32, var5, ua.field_b[var10]);
                        this.a(var3, var4, var5, -25);
                        if (var6 != 0) {
                            statePc = 210;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        if (-1 == (var5 ^ -1)) {
                            statePc = 210;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        if (42 != var5) {
                            statePc = 209;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        ua.field_b[4].h(var3, var4 - -24);
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if ((var6 ^ -1) != (12 - var2_int ^ -1)) {
                            statePc = 219;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        if ((var5 ^ -1) == -43) {
                            statePc = 219;
                        } else {
                            statePc = 212;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        statePc = 214;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        if (-49 == (var5 ^ -1)) {
                            statePc = 219;
                        } else {
                            statePc = 215;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        ua.field_b[5].h(32 + var3, var4 + 24);
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        var3 += 64;
                        var6++;
                        var5 += 8;
                        if (var13 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        var2_int++;
                        statePc = 221;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        if (var13 == 0) {
                            statePc = 120;
                        } else {
                            statePc = 224;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 223: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) var2), "lj.G(" + param0 + ')');
                }
                case 224: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, int param1) {
        rh[] array$0 = null;
        int[] array$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            if (null == this.field_w[param1]) {
              L1: {
                var3 = this.field_h.b(param1, (byte) -36);
                var4 = 0;
                if (param0 == 15122) {
                  break L1;
                } else {
                  this.field_w = (int[][]) null;
                  break L1;
                }
              }
              var5_ref_int__ = var3;
              var6 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var6 ^ -1) <= (var5_ref_int__.length ^ -1)) {
                      break L4;
                    } else {
                      var7_int = var5_ref_int__[var6];
                      stackOut_8_0 = this.field_k.a(var7_int, (byte) 88);
                      stackIn_15_0 = stackOut_8_0 ? 1 : 0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var10 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_9_0) {
                            break L5;
                          } else {
                            var4++;
                            break L5;
                          }
                        }
                        var6++;
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_15_0 = oi.b(0, 5);
                  break L3;
                }
                L6: {
                  L7: {
                    L8: {
                      var5 = stackIn_15_0;
                      if (var4 > 0) {
                        break L8;
                      } else {
                        this.field_v[param1] = new rh[]{};
                        this.field_w[param1] = new int[]{};
                        if (var10 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    array$0 = new rh[var4];
                    this.field_v[param1] = array$0;
                    array$1 = new int[var4];
                    this.field_w[param1] = array$1;
                    var6 = 0;
                    var7 = var3;
                    var8 = 0;
                    L9: while (true) {
                      if ((var8 ^ -1) <= (var7.length ^ -1)) {
                        break L7;
                      } else {
                        var9 = var7[var8];
                        if (var10 != 0) {
                          break L6;
                        } else {
                          L10: {
                            if (this.field_k.a(var9, (byte) 93)) {
                              break L10;
                            } else {
                              L11: {
                                this.field_k.a(var9, param0 + -15183);
                                if ((var9 ^ -1) != (-(param1 / 7) + (param1 - 1) ^ -1)) {
                                  break L11;
                                } else {
                                  incrementValue$2 = var6;
                                  var6++;
                                  this.a(incrementValue$2, param1, param0 + -15007, var5, 6);
                                  break L11;
                                }
                              }
                              L12: {
                                if ((var9 ^ -1) == (param1 + -(param1 / 7) ^ -1)) {
                                  incrementValue$3 = var6;
                                  var6++;
                                  this.a(incrementValue$3, param1, 98, var5, 3);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if ((param1 + 35 ^ -1) != (var9 ^ -1)) {
                                  break L13;
                                } else {
                                  incrementValue$4 = var6;
                                  var6++;
                                  this.a(incrementValue$4, param1, param0 + -15007, var5, 1);
                                  break L13;
                                }
                              }
                              if (var9 != param1 + 42) {
                                break L10;
                              } else {
                                incrementValue$5 = var6;
                                var6++;
                                this.a(incrementValue$5, param1, 100, var5, 4);
                                break L10;
                              }
                            }
                          }
                          var8++;
                          if (var10 == 0) {
                            continue L9;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  break L6;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3_ref), "lj.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 49) {
                    break L3;
                  } else {
                    stackIn_23_0 = var2_int ^ -1;

                    stackIn_23_1 = -1;

                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_23_0 == stackIn_23_1) {
                          break L4;
                        } else {
                          if (-7 == (var2_int ^ -1)) {
                            break L4;
                          } else {
                            if (42 == var2_int) {
                              break L4;
                            } else {
                              if (-49 == (var2_int ^ -1)) {
                                break L4;
                              } else {
                                if (!this.field_h.field_p.a(var2_int, (byte) 73)) {
                                  break L4;
                                } else {
                                  this.a(15122, var2_int);
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_23_0 = param0;
                stackIn_23_1 = 123;
                break L2;
              }
              L5: {
                if (stackIn_23_0 > stackIn_23_1) {
                  break L5;
                } else {
                  this.field_c = (cn) null;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "lj.Q(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = this.field_n[param1];
                if (var3_int >= 256) {
                  break L2;
                } else {
                  var4 = (int)(256.0 * (1.0 - Math.exp((double)(-var3_int) / 40.0)));
                  var5 = (int)((1.0 - Math.cos((double)var3_int * 3.141592653589793 / 128.0)) * 64.0);
                  var3_int = var4 + var5;
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = 256;
              break L1;
            }
            L3: {
              var3_int = (int)((double)var3_int + 48.0 * te.c(param1, mo.field_a, 0.03125));
              if (param0 <= -1) {
                break L3;
              } else {
                this.field_n = (int[]) null;
                break L3;
              }
            }
            L4: {
              var3_int = var3_int >> 1;
              if (-41 >= (var3_int ^ -1)) {
                break L4;
              } else {
                var3_int = 40;
                break L4;
              }
            }
            stackIn_9_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "lj.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private lj(int param0, int param1) {
        this.field_c = null;
        this.field_d = null;
        try {
            this.field_l = -168 + param1;
            this.field_q = param0;
            this.field_i = gm.field_d.field_k;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lj.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    lj(go param0, lj param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = null;
        this.field_d = null;
        try {
          L0: {
            this.field_q = param1.field_q;
            this.field_l = param1.field_l;
            this.field_h = param0.field_Y;
            this.field_a = param1.field_a;
            this.field_n = param1.field_n;
            this.field_v = param1.field_v;
            this.field_w = param1.field_w;
            this.field_k = param1.field_k;
            this.field_s = -1;
            this.field_i = this.field_h.field_v;
            this.c((byte) 126);
            this.b(-20827);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("lj.<init>(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_u = 100;
        field_p = "Raider wins!";
        field_j = "Your initial Renown after the next reset will be increased by 100.";
        field_r = 200;
        field_g = false;
    }
}
