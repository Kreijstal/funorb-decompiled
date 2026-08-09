/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static int[] field_c;
    private int[][] field_b;
    private int field_d;
    static boolean field_f;
    private int field_a;
    static String field_e;

    public static void a(byte param0) {
        if (param0 != 127) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final byte[] a(byte[] param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = -55 % ((param1 - 6) / 44);
                        if (null == this.field_b) {
                            statePc = 23;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = 14 + (int)((long)this.field_a * (long)param0.length / (long)this.field_d);
                        var16 = new int[var4];
                        var14 = var16;
                        var5 = var14;
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0.length <= var8) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = param0[var8];
                        var18 = this.field_b[var7];
                        stackIn_13_0 = 0;
                        stackIn_5_0 = stackIn_13_0;
                        if (var12 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-15 >= (var11 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5[var6 - -var11] = var5[var6 - -var11] + var9 * var18[var11];
                        var11++;
                        if (var12 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var12 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = var7 + this.field_a;
                        var11 = var7 / this.field_d;
                        var6 = var6 + var11;
                        var7 = var7 - var11 * this.field_d;
                        var8++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var12 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param0 = new byte[var4];
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = stackIn_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 >= var4) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = 32768 + var16[var8] >> 488498128;
                        if (127 >= (var9 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        param0[var8] = (byte)-128;
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-128 > (var9 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param0[var8] = (byte)var9;
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        param0[var8] = (byte)127;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = (byte[]) (param0);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var3);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("ci.A(");
                    stackIn_26_1 = stackIn_27_1;
                    if (param0 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 18308) {
          return -5;
        } else {
          L0: {
            if (null == this.field_b) {
              break L0;
            } else {
              param0 = 6 - -(int)((long)this.field_a * (long)param0 / (long)this.field_d);
              break L0;
            }
          }
          return param0;
        }
    }

    final int b(int param0, int param1) {
        L0: {
          if (null == this.field_b) {
            break L0;
          } else {
            param0 = (int)((long)this.field_a * (long)param0 / (long)this.field_d);
            break L0;
          }
        }
        if (param1 != 14698) {
          this.a(6, 33);
          return param0;
        } else {
          return param0;
        }
    }

    ci(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = fleas.field_A ? 1 : 0;
                    if (param1 != param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3 = vc.a(param1, -1, param0);
                    param0 = param0 / var3;
                    param1 = param1 / var3;
                    this.field_d = param0;
                    this.field_a = param1;
                    this.field_b = new int[param0][14];
                    var4 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = var4;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 >= param0) {
                        statePc = 19;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = this.field_b[var4];
                    var6 = (double)var4 / (double)param0 + 6.0;
                    var8 = (int)Math.floor(1.0 + (var6 - 7.0));
                    if (var16 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (var8 >= 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var9 = (int)Math.ceil(var6 + 7.0);
                    if (-15 <= (var9 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var9 = 14;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var10 = (double)param1 / (double)param0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var9 <= var8) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var12 = 3.141592653589793 * (-var6 + (double)var8);
                    var14 = var10;
                    stackIn_4_0 = (-0.0001 < var12 ? -1 : (-0.0001 == var12 ? 0 : 1));
                    stackIn_14_0 = stackIn_4_0;
                    if (var16 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 > 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (0.0001 >= var12) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var14 = var14 * (Math.sin(var12) / var12);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var14 = var14 * (Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46 + 0.54);
                    var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
                    var8++;
                    if (var16 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var4++;
                    if (var16 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = true;
        field_c = new int[150];
    }
}
