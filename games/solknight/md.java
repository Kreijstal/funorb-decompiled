/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends sk {
    static long field_y;
    byte[] field_u;
    int field_w;
    static int[] field_t;
    static od[] field_s;
    static String field_v;
    bi field_x;

    final static boolean a(byte param0, dl param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -124) {
              stackIn_4_0 = param1.b((byte) -117);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("md.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final byte[] f(int param0) {
        if (this.field_m) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            field_v = (String) null;
        }
        return this.field_u;
    }

    public static void i(int param0) {
        field_s = null;
        field_v = null;
        int var1 = 60 / ((-82 - param0) / 32);
        field_t = null;
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int statePc = 0;
        int var9 = 0;
        o[] var10 = null;
        o[] var11_ref_o__ = null;
        int var11 = 0;
        int var12 = 0;
        o var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = SolKnight.field_L ? 1 : 0;
                    var9 = param4 + (param6 + param8);
                    var10 = new o[]{new o(var9, var9), new o(param7, var9), new o(var9, var9), new o(var9, param7), new o(64, 64), new o(var9, param7), new o(var9, var9), new o(param7, var9), new o(var9, var9)};
                    var11_ref_o__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var11_ref_o__.length <= var12) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_o__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var13.field_v.length <= var14) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_v[var14] = param3;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    if (param5 == -1) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return (o[]) null;
                }
                case 13: {
                    if (var11 >= param8) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_23_0 = 0;
                    stackIn_15_0 = stackIn_23_0;
                    if (var15 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var12 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var9 <= var12) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10[6].field_v[var12 + var9 * (-1 + (-var11 + var9))] = param2;
                    var10[8].field_v[var12 + (-var11 + (var9 + -1)) * var9] = param2;
                    var10[2].field_v[var9 * var12 - var11 - (1 + -var9)] = param2;
                    var10[8].field_v[var9 * var12 - (var11 + 1) - -var9] = param2;
                    var12++;
                    if (var15 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var15 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var11++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var15 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var11 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = var11;
                    stackIn_25_1 = param8;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 >= stackIn_25_1) {
                        statePc = 34;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_35_0 = 0;
                    stackIn_27_0 = stackIn_35_0;
                    if (var15 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var12 = stackIn_27_0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var12 >= var9) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var10[0].field_v[var11 * var9 + var12] = param1;
                    var10[0].field_v[var9 * var12 + var11] = param1;
                    stackIn_25_0 = var9 - var11 ^ -1;
                    stackIn_30_0 = stackIn_25_0;
                    stackIn_25_1 = var12 ^ -1;
                    stackIn_30_1 = stackIn_25_1;
                    if (var15 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 >= stackIn_30_1) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10[2].field_v[var9 * var11 + var12] = param1;
                    var10[6].field_v[var9 * var12 + var11] = param1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var11 = stackIn_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var11 >= param7) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_46_0 = 0;
                    stackIn_38_0 = stackIn_46_0;
                    if (var15 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12 = stackIn_38_0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var12 >= param8) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10[7].field_v[(-1 + (-var12 + var9)) * param7 - -var11] = param2;
                    var10[5].field_v[-var12 - -var9 + (-1 + var9 * var11)] = param2;
                    var10[1].field_v[var12 * param7 - -var11] = param1;
                    var10[3].field_v[var12 + var9 * var11] = param1;
                    var12++;
                    if (var15 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var15 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var11++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var15 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var11 = stackIn_46_0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var11 >= param7 >> -1951266271) {
                        statePc = 55;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var12 >= param4) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10[1].field_v[(-1 + (var9 - var12)) * param7 + var11] = param0;
                    var10[3].field_v[var9 * var11 - 1 - (-var9 + var12)] = param0;
                    var10[7].field_v[var11 + var12 * param7] = param0;
                    var10[5].field_v[var12 + var11 * var9] = param0;
                    var12++;
                    if (var15 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var15 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var15 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0) {
        if (!(!this.field_m)) {
            return 0;
        }
        if (param0 != -126) {
            this.a((byte) 102);
        }
        return 100;
    }

    md() {
    }

    static {
        field_t = new int[128];
    }
}
