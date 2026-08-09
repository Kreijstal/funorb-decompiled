/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj {
    static String field_d;
    private eb field_a;
    static int[] field_l;
    boolean field_e;
    db field_h;
    static boolean field_g;
    int field_i;
    int field_b;
    cd field_f;
    static String[] field_c;
    String field_k;
    static int[] field_j;

    final static void a(byte param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = qg.field_b;
                        var1 = var6;
                        var2 = 0;
                        var4 = -47 / ((param0 - 44) / 52);
                        var3 = var6.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 <= var2) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var6[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var6[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var6[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var6[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var6[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var6[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var6[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var6[incrementValue$15] = 0;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var1_ref), "oj.C(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static sh a(boolean param0, int param1) {
        if (param0) {
          oj.a(false, 68);
          return il.a(true, 12317, false, param1, false, 1);
        } else {
          return il.a(true, 12317, false, param1, false, 1);
        }
    }

    final void a(fc param0, int param1, char[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_a.a(param2, param0.field_I, true, 256);
              if (param1 == 0) {
                break L1;
              } else {
                field_j = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("oj.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    private final void a(int[] param0, boolean param1, char[] param2) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var15 = null;
        int[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param2.length;
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int >= var4_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0[var5_int] = this.field_a.a(param2, (byte) 106, var5_int);
                        var5_int++;
                        if (var12 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var15 = new int[var4_int];
                        var13 = var15;
                        var5 = var13;
                        var6 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4_int <= var6) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5[var6] = (-param0[var6] << 108662480) - -var6;
                        var6++;
                        if (var12 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var12 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dd.a(var15, -23588);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var18 = var5;
                        var7 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = var7;
                        stackIn_16_1 = var18.length;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 >= stackIn_16_1) {
                            statePc = 40;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = var18[var7];
                        var9 = (short)var8;
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        return;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-1 <= (param0[var9] ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = -(var8 >> -1246102960);
                        var11 = 1 + var9;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var10 + var9 <= var11) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param0[var11] = 0;
                        var11++;
                        if (var12 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var12 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var9 <= var11) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_16_0 = var9;
                        stackIn_28_0 = stackIn_16_0;
                        stackIn_16_1 = param0[var11] + var11;
                        stackIn_28_1 = stackIn_16_1;
                        if (var12 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 >= stackIn_28_1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param0[var11] = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var11++;
                        if (var12 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_35_0 = (RuntimeException) (var4);
                    stackIn_34_0 = stackIn_35_0;
                    stackIn_35_1 = new StringBuilder().append("oj.E(");
                    stackIn_34_1 = stackIn_35_1;
                    if (param0 == null) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',');
                    stackIn_37_1 = stackIn_38_1;
                    if (param2 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw ld.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -26) {
          oj.a(false, -114);
          field_d = null;
          field_l = null;
          field_j = null;
          return;
        } else {
          field_d = null;
          field_l = null;
          field_j = null;
          return;
        }
    }

    final ng a(char[][] param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_32_0 = 0;
        ng stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        ng var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5_int = 0;
        char[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        int[] var10 = null;
        ng var11 = null;
        int[] var12 = null;
        char[] var13 = null;
        int[] var14 = null;
        char[] var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var11 = new ng();
                        var3 = var11;
                        var14 = new int[param0[0].length];
                        var12 = var14;
                        var10 = var12;
                        var4 = var10;
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = param0.length;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= var5_int) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.a(var14, false, param0[var5_int]);
                        stackIn_14_0 = 0;
                        stackIn_5_0 = stackIn_14_0;
                        if (var8 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var14.length <= var6) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_3_0 = var14[var6];
                        stackIn_8_0 = stackIn_3_0;
                        if (var8 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11.b(121, pc.a(var5_int, var14[var6], (byte) 14, var6, 1));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6++;
                        if (var8 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int++;
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = new int[param0.length];
                        stackIn_14_0 = param0.length;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var15 = new char[stackIn_14_0];
                        var13 = var15;
                        var5 = var13;
                        var6 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = param0[0].length;
                        stackIn_16_1 = var6;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 <= stackIn_16_1) {
                            statePc = 31;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_32_0 = 0;
                        stackIn_18_0 = stackIn_32_0;
                        if (var8 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param0.length <= var7) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5[var7] = param0[param0.length - 1 + -var7][var6];
                        var7++;
                        if (var8 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a(var4, false, var15);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7 >= var15.length) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_16_0 = 0;
                        stackIn_27_0 = stackIn_16_0;
                        stackIn_16_1 = var4[var7];
                        stackIn_27_1 = stackIn_16_1;
                        if (var8 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == stackIn_27_1) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var3.b(param1 + -17053, pc.a(-var7 + param0.length + -1, 1, (byte) 14, var6, var4[var7]));
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6++;
                        if (var8 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = param1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 == 17161) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = (char[]) null;
                        this.a((int[]) null, true, (char[]) null);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = (ng) (var3);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return stackIn_35_0;
                }
                case 36: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_38_0 = (RuntimeException) (var3_ref);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = new StringBuilder().append("oj.B(");
                    stackIn_37_1 = stackIn_38_1;
                    if (param0 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw ld.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    oj(sh param0, sh param1, eb param2) {
        boolean stackIn_4_0 = false;
        int stackIn_12_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        cd stackIn_22_1 = null;
        int stackIn_23_0 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        boolean stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        NumberFormatException var9 = null;
        String var10 = null;
        int var11 = 0;
        String var12 = null;
        CharSequence var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_a = param2;
                        this.field_i = param2.field_g;
                        var4_int = 0;
                        var5 = null;
                        var6 = null;
                        var7 = null;
                        var8 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var8 >= param2.field_c.length) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = param2.field_c[var8][0];
                        var10 = param2.field_c[var8][1];
                        stackOut_3_0 = "lang".equals(var12);
                        stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var11 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ("font".equals(var12)) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!"fhei".equals(var12)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = var10;
                        if (var11 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!"disabled".equals(var12)) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!var10.equals("true")) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
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
                        statePc = 35;
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
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int = stackIn_12_0;
                        if (var11 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = var10;
                        if (var11 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var10;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_18_0 = this;
                        stackIn_17_0 = stackIn_18_0;
                        if (var4_int == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((oj) (this)).field_e = stackIn_19_1 != 0;
                        this.field_k = (String) (var5);
                        var13 = (CharSequence) ((Object) ("flag_" + (String) (var5)));
                        this.field_h = df.a("", ef.a(var13, (byte) -14), param0, (byte) -92);
                        stackIn_21_0 = this;
                        stackIn_20_0 = stackIn_21_0;
                        if (var6 == null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_22_0 = this;
                        stackIn_22_1 = hb.a(param1, 246, "", ef.a((CharSequence) (var6), (byte) -82), param0);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = this;
                        stackIn_22_1 = bi.field_a;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((oj) (this)).field_f = stackIn_22_1;
                        stackIn_23_0 = -1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = stackIn_23_0;
                        if (var7 != null) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var8 = si.a((byte) 115, (CharSequence) (var7));
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof NumberFormatException ? 27 : 35);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = (NumberFormatException) ((Object) caughtException);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_30_0 = this;
                        stackIn_29_0 = stackIn_30_0;
                        if (-1 == var8) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_33_0 = this;
                        stackIn_33_1 = var8;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_32_0 = this;
                        stackIn_31_0 = stackIn_32_0;
                        if (var6 != null) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = this;
                        stackIn_33_1 = pa.field_d;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = this;
                        stackIn_33_1 = this.field_f.field_E;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((oj) (this)).field_b = stackIn_33_1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_37_0 = (RuntimeException) (var4);
                    stackIn_36_0 = stackIn_37_0;
                    stackIn_37_1 = new StringBuilder().append("oj.<init>(");
                    stackIn_36_1 = stackIn_37_1;
                    if (param0 == null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_0 = stackIn_40_0;
                    stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
                    stackIn_39_1 = stackIn_40_1;
                    if (param1 == null) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_41_2 = "{...}";
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_41_2 = "null";
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_42_0 = stackIn_43_0;
                    stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
                    stackIn_42_1 = stackIn_43_1;
                    if (param2 == null) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_44_2 = "{...}";
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_44_2 = "null";
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    throw ld.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = new String[]{"Use the \"Next\" box to plan ahead.", "In \"Standard\" mode the speed at which blocks rotate and move horizontally increases, up until level 4.", "In \"Delicate\" mode the speed increases until level 8, making control of the blocks more difficult – but enabling you to react faster.", "Note that the only way to clear tiles is to make words with them."};
        field_d = "You have 1 unread message!";
    }
}
