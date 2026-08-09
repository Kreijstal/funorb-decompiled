/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int field_w;
    byte[][] field_l;
    static int field_a;
    int[][] field_v;
    oc field_e;
    oc[] field_o;
    static ck field_d;
    int[] field_k;
    int field_m;
    int[] field_y;
    int field_n;
    int field_s;
    int[] field_f;
    static String field_b;
    private int[][] field_r;
    private int[] field_p;
    private byte[] field_h;
    static String field_A;
    int[] field_c;
    static w field_q;
    static ck[][] field_j;
    int[] field_B;
    static ck field_g;
    static String field_t;
    static int field_u;
    static int[] field_i;
    static String field_x;
    static String field_z;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_j = (ck[][]) null;
        field_i = null;
        field_A = null;
        field_z = null;
        field_x = null;
        field_q = null;
        field_g = null;
        field_t = null;
        if (param0 != -67) {
            field_g = (ck) null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != -1) {
            field_q = (w) null;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 1);
        var2.a(true, 0);
    }

    final static String a(ji param0, String param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        byte[] var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.a((byte) 121)) {
              L1: {
                if (param2) {
                  break L1;
                } else {
                  var5 = (byte[]) null;
                  ad.a((byte[]) null, -41, true, 8, -58, true);
                  break L1;
                }
              }
              stackIn_6_0 = param3 + " - " + param0.b((byte) -89) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ad.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(byte[] param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        uf var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var6 = we.field_b;
            var6.f(param1, -4);
            var6.field_n = var6.field_n + 1;
            var7 = var6.field_n;
            var6.a(param2, 4);
            var6.a(param2, param3);
            var8 = param4;
            if (param5) {
                var8 += 128;
            }
            var6.a(param2, var8);
            var6.a(false, param0.length, param0, 0);
            var6.b(-var7 + var6.field_n, param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ad.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(byte[] param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wl var17 = null;
        wl var18 = null;
        byte[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var17 = new wl(i.a(param0, -89));
                        var18 = var17;
                        var4 = var18.d((byte) -114);
                        if ((var4 ^ -1) > -6) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-8 <= (var4 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-7 >= (var4 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_m = 0;
                        if (var16 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_m = var18.i(param1 ^ 7553);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = var18.d((byte) -46);
                        if ((var5 & 1 ^ -1) == -1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = stackIn_12_0;
                        if ((var5 & 2) == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = stackIn_15_0;
                        if (7 <= var4) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_w = var18.e(param1 + 3);
                        if (var16 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_w = var18.f(21663);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = 0;
                        var9 = -1;
                        this.field_f = new int[this.field_w];
                        if (-8 < (var4 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (this.field_w <= var10) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        dupTemp$0 = var8 + var17.f(21663);
                        var8 = dupTemp$0;
                        this.field_f[var10] = dupTemp$0;
                        stackIn_51_0 = this.field_f[var10] ^ -1;
                        stackIn_23_0 = stackIn_51_0;
                        stackIn_51_1 = var9 ^ -1;
                        stackIn_23_1 = stackIn_51_1;
                        if (var16 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 >= stackIn_23_1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9 = this.field_f[var10];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var16 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (this.field_w <= var10) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        dupTemp$1 = var8 + var18.e(qm.b(param1, 3));
                        var8 = dupTemp$1;
                        this.field_f[var10] = dupTemp$1;
                        stackIn_51_0 = this.field_f[var10];
                        stackIn_30_0 = stackIn_51_0;
                        stackIn_51_1 = var9;
                        stackIn_30_1 = stackIn_51_1;
                        if (var16 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 <= stackIn_30_1) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = this.field_f[var10];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_n = var9 - -1;
                        this.field_y = new int[this.field_n];
                        if (var7 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_l = new byte[this.field_n][];
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_c = new int[this.field_n];
                        this.field_v = new int[this.field_n][];
                        this.field_B = new int[this.field_n];
                        this.field_k = new int[this.field_n];
                        if (var6 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_p = new int[this.field_n];
                        var10 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (this.field_n <= var10) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_p[var10] = -1;
                        var10++;
                        if (var16 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var16 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((this.field_w ^ -1) >= (var10 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_p[this.field_f[var10]] = var17.i(param1 + 7553);
                        var10++;
                        if (var16 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var16 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_e = new oc(this.field_p);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var10 = param1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = this.field_w;
                        stackIn_51_1 = var10;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 <= stackIn_51_1) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_c[this.field_f[var10]] = var17.i(7553);
                        var10++;
                        if (var16 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var16 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var7 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var10 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var10 >= this.field_w) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var22 = new byte[64];
                        var18.a(var22, 0, (byte) 125, 64);
                        this.field_l[this.field_f[var10]] = var22;
                        var10++;
                        if (var16 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var16 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (this.field_w <= var10) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.field_y[this.field_f[var10]] = var17.i(7553);
                        var10++;
                        if (var16 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var16 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-8 >= (var4 ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var10 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var10 >= this.field_w) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        this.field_B[this.field_f[var10]] = var17.e(3);
                        var10++;
                        if (var16 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var16 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var10 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (this.field_w <= var10) {
                            statePc = 88;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var11 = this.field_f[var10];
                        var12 = this.field_B[var11];
                        var8 = 0;
                        var13 = -1;
                        array$2 = new int[var12];
                        this.field_v[var11] = array$2;
                        stackIn_111_0 = 0;
                        stackIn_77_0 = stackIn_111_0;
                        if (var16 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var14 = stackIn_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((var14 ^ -1) <= (var12 ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        dupTemp$3 = var8 + var17.e(3);
                        var8 = dupTemp$3;
                        dupTemp$4 = this.field_v[var11];
                        dupTemp$4[var14] = dupTemp$3;
                        var15 = dupTemp$3;
                        stackIn_84_0 = var15 ^ -1;
                        stackIn_80_0 = stackIn_84_0;
                        stackIn_84_1 = var13 ^ -1;
                        stackIn_80_1 = stackIn_84_1;
                        if (var16 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0 >= stackIn_80_1) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var13 = var15;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.field_k[var11] = 1 + var13;
                        stackIn_84_0 = 1 + var13 ^ -1;
                        stackIn_84_1 = var12 ^ -1;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (stackIn_84_0 == stackIn_84_1) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        this.field_v[var11] = null;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var16 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var10 = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (this.field_w <= var10) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        this.field_B[this.field_f[var10]] = var17.f(21663);
                        var10++;
                        if (var16 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var16 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var10 = 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (this.field_w <= var10) {
                            statePc = 110;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var11 = this.field_f[var10];
                        var12 = this.field_B[var11];
                        var8 = 0;
                        array$5 = new int[var12];
                        this.field_v[var11] = array$5;
                        var13 = -1;
                        stackIn_111_0 = 0;
                        stackIn_98_0 = stackIn_111_0;
                        if (var16 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var14 = stackIn_98_0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if ((var14 ^ -1) <= (var12 ^ -1)) {
                            statePc = 105;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        dupTemp$6 = var8 + var17.f(21663);
                        var8 = dupTemp$6;
                        dupTemp$7 = this.field_v[var11];
                        dupTemp$7[var14] = dupTemp$6;
                        var15 = dupTemp$6;
                        stackIn_106_0 = var15;
                        stackIn_101_0 = stackIn_106_0;
                        stackIn_106_1 = var13;
                        stackIn_101_1 = stackIn_106_1;
                        if (var16 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (stackIn_101_0 > stackIn_101_1) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var13 = var15;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        this.field_k[var11] = 1 + var13;
                        stackIn_106_0 = var13 - -1;
                        stackIn_106_1 = var12;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (stackIn_106_0 == stackIn_106_1) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        this.field_v[var11] = null;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_111_0 = var6;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (stackIn_111_0 == 0) {
                            statePc = 135;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        this.field_o = new oc[var9 + 1];
                        this.field_r = new int[var9 + 1][];
                        var10 = 0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if ((this.field_w ^ -1) >= (var10 ^ -1)) {
                            statePc = 135;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var11 = this.field_f[var10];
                        var12 = this.field_B[var11];
                        array$8 = new int[this.field_k[var11]];
                        this.field_r[var11] = array$8;
                        if (var16 != 0) {
                            statePc = 136;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var13 = 0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (this.field_k[var11] <= var13) {
                            statePc = 120;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        this.field_r[var11][var13] = -1;
                        var13++;
                        if (var16 != 0) {
                            statePc = 121;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (var16 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var13 = 0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if ((var13 ^ -1) <= (var12 ^ -1)) {
                            statePc = 128;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var16 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (null != this.field_v[var11]) {
                            statePc = 126;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var14 = var13;
                        if (var16 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var14 = this.field_v[var11][var13];
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.field_r[var11][var14] = var17.i(qm.b(param1, 7553));
                        var13++;
                        if (var16 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        this.field_o[var11] = new oc(this.field_r[var11]);
                        var10++;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var16 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 131: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_133_0 = (RuntimeException) (var3);
                    stackIn_132_0 = stackIn_133_0;
                    stackIn_133_1 = new StringBuilder().append("ad.D(");
                    stackIn_132_1 = stackIn_133_1;
                    if (param0 == null) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_134_0 = (RuntimeException) ((Object) stackIn_132_0);
                    stackIn_134_1 = (StringBuilder) ((Object) stackIn_132_1);
                    stackIn_134_2 = "{...}";
                    statePc = 134;
                    continue stateLoop;
                }
                case 133: {
                    stackIn_134_0 = (RuntimeException) ((Object) stackIn_133_0);
                    stackIn_134_1 = (StringBuilder) ((Object) stackIn_133_1);
                    stackIn_134_2 = "null";
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    throw dh.a((Throwable) ((Object) stackIn_134_0), stackIn_134_2 + ',' + param1 + ')');
                }
                case 135: {
                    return;
                }
                case 136: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ad(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            this.field_s = tj.a(param0.length, 0, param0);
            if (this.field_s == param1) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (param2.length == 64) {
                      this.field_h = um.a(0, param0, 0, param0.length);
                      var4_int = 0;
                      L3: while (true) {
                        if ((var4_int ^ -1) <= -65) {
                          break L2;
                        } else {
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if ((param2[var4_int] ^ -1) == (this.field_h[var4_int] ^ -1)) {
                              var4_int++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L2;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                this.a(param0, 0);
                break L1;
              }
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("ad.<init>(");

            if (param0 == null) {
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
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_b = "Please enter a year between <%0> and <%1>";
        field_d = new ck(18, 18);
        field_j = new ck[8][];
        field_A = "<%0> wants to join";
        field_t = "Your email address is used to identify this account";
        field_u = 0;
        field_z = "Achievements This Session";
    }
}
