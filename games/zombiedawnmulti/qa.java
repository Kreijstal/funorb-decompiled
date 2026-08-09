/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qa extends br {
    static String field_m;
    static String field_g;
    qa field_p;
    static String field_n;
    static String field_j;
    static long field_i;
    static int field_h;
    static int field_o;
    qa field_k;
    static int[] field_f;
    long field_l;

    public static void a(byte param0) {
        field_j = null;
        field_m = null;
        field_n = null;
        field_g = null;
        field_f = null;
        if (param0 != 43) {
            field_g = (String) null;
        }
    }

    final boolean c(int param0) {
        if (null == this.field_p) {
            return false;
        }
        if (param0 != 0) {
            field_i = -71L;
            return true;
        }
        return true;
    }

    final long d(int param0) {
        if (param0 > -60) {
            return -16L;
        }
        return this.field_l;
    }

    final void a(byte param0, long param1) {
        if (!(null == this.field_p)) {
            throw new RuntimeException();
        }
        this.field_l = param1;
        if (param0 != -85) {
            field_g = (String) null;
        }
    }

    final void a(int param0) {
        if (!(this.field_p != null)) {
            return;
        }
        this.field_p.field_k = this.field_k;
        this.field_k.field_p = this.field_p;
        if (param0 != -4564) {
            this.a((byte) -27, 73L);
        }
        this.field_k = null;
        this.field_p = null;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int statePc = 0;
        int var9 = 0;
        ja[] var10 = null;
        ja[] var11_ref_ja__ = null;
        int var11 = 0;
        int var12 = 0;
        ja var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ZombieDawnMulti.field_E ? 1 : 0;
                    var9 = param7 + (param2 + param8);
                    var10 = new ja[]{new ja(var9, var9), new ja(param3, var9), new ja(var9, var9), new ja(var9, param3), new ja(64, 64), new ja(var9, param3), new ja(var9, var9), new ja(param3, var9), new ja(var9, var9)};
                    var11_ref_ja__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var11_ref_ja__.length <= var12) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_ja__[var12];
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
                    if (var14 >= var13.field_B.length) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_B[var14] = param1;
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
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param2 <= var11) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var9 <= var12) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_B[(var9 - (var11 - -1)) * var9 - -var12] = param0;
                    var10[8].field_B[var12 + var9 * (-1 + (var9 - var11))] = param0;
                    var10[2].field_B[var12 * var9 - -var9 + (-1 - var11)] = param0;
                    var10[8].field_B[-var11 + (-1 + var9 + var12 * var9)] = param0;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = var11;
                    stackIn_24_1 = param2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 >= stackIn_24_1) {
                        statePc = 34;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_35_0 = 0;
                    stackIn_26_0 = stackIn_35_0;
                    if (var15 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var12) {
                        statePc = 33;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_B[var12 - -(var11 * var9)] = param6;
                    var10[0].field_B[var9 * var12 - -var11] = param6;
                    stackIn_24_0 = var9 + -var11;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = var12;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 > stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10[2].field_B[var12 - -(var9 * var11)] = param6;
                    var10[6].field_B[var11 + var9 * var12] = param6;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
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
                    if (var11 >= param3) {
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
                    if (param2 <= var12) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10[7].field_B[var11 + (-1 + var9 + -var12) * param3] = param0;
                    var10[5].field_B[var9 - (1 + var12 - var9 * var11)] = param0;
                    var10[1].field_B[var12 * param3 + var11] = param6;
                    var10[3].field_B[var12 + var9 * var11] = param6;
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
                    stackIn_46_0 = param4;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 > 59) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    qa.a((byte) -29);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var11 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (param3 >> 179000001 <= var11) {
                        statePc = 57;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var12 >= param8) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var10[1].field_B[(-var12 + (var9 + -1)) * param3 - -var11] = param5;
                    var10[3].field_B[var9 + -1 + -var12 + var9 * var11] = param5;
                    var10[7].field_B[param3 * var12 + var11] = param5;
                    var10[5].field_B[var9 * var11 + var12] = param5;
                    var12++;
                    if (var15 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var15 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var11++;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var15 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var4 = 11 % ((-85 - param0) / 36);
            var3 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1.length() <= var3) {
                    break L3;
                  } else {
                    stackIn_9_0 = var2_int;

                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_9_0 == param1.charAt(var3)) {
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackIn_6_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_9_0 = 1;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("qa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    protected qa() {
    }

    static {
        field_n = "Find opponent";
        field_j = "Shortcut Reference";
        field_m = "Please enter your date of birth to enable chat:";
        field_g = "Account created successfully!";
        field_o = 15;
        field_f = new int[4];
    }
}
