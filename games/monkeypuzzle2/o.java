/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static int field_b;
    private int field_g;
    private int[][] field_e;
    static te field_d;
    private int field_f;
    static int field_a;
    static int field_c;

    public static void a(byte param0) {
        int var1 = -60 % ((0 - param0) / 62);
        field_d = null;
    }

    final int a(int param0, int param1) {
        byte[] var4;
        L0: {
          if (this.field_e != null) {
            param0 = (int)((long)this.field_g * (long)param0 / (long)this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -70) {
          var4 = (byte[]) null;
          this.a(true, (byte[]) null);
          return param0;
        } else {
          return param0;
        }
    }

    final static le[] a(boolean param0) {
        le[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var1 = new le[eg.field_c];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= eg.field_c) {
                        statePc = 11;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = ra.field_ab[var2] * da.field_c[var2];
                    var13 = cb.field_b[var2];
                    var11 = new int[var3];
                    var9 = var11;
                    var5 = var9;
                    stackIn_12_0 = 0;
                    stackIn_3_0 = stackIn_12_0;
                    if (var7 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var3 <= var6) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5[var6] = fk.field_d[ch.a((int) var13[var6], 255)];
                    var6++;
                    if (var7 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var11);
                    var2++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var11);
                    var2++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    gb.a(-85);
                    stackIn_12_0 = param0 ? 1 : 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 != 1) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return var1;
                }
                case 14: {
                    return (le[]) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, byte param1) {
        L0: {
          if (null != this.field_e) {
            param0 = 6 - -(int)((long)this.field_g * (long)param0 / (long)this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= 20) {
          field_b = -31;
          return param0;
        } else {
          return param0;
        }
    }

    final byte[] a(boolean param0, byte[] param1) {
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        byte[] stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var12 = (byte[]) null;
                        this.a(false, (byte[]) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == this.field_e) {
                            statePc = 25;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3_int = 14 + (int)((long)this.field_g * (long)param1.length / (long)this.field_f);
                        var16 = new int[var3_int];
                        var14 = var16;
                        var4 = var14;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 >= param1.length) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = param1[var7];
                        var18 = this.field_e[var6];
                        stackIn_15_0 = 0;
                        stackIn_7_0 = stackIn_15_0;
                        if (var11 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-15 >= (var10 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var18[var10];
                        var10++;
                        if (var11 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = var6 + this.field_g;
                        var10 = var6 / this.field_f;
                        var6 = var6 - this.field_f * var10;
                        var5 = var5 + var10;
                        var7++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var11 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        param1 = new byte[var3_int];
                        stackIn_15_0 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = stackIn_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var3_int <= var7) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = 32768 + var16[var7] >> 1514084656;
                        if (127 < (var8 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (127 < var8) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param1[var7] = (byte)var8;
                        if (var11 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        param1[var7] = (byte)127;
                        if (var11 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param1[var7] = (byte)-128;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = (byte[]) (param1);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var3);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("o.C(").append(param0).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param1 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            param0.addMouseListener(we.field_n);
            param0.addMouseMotionListener(we.field_n);
            param0.addFocusListener(we.field_n);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "o.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static de a(int param0, int param1, int param2, int param3, int param4) {
        de var5;
        int var6;
        int var7;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var5 = (de) ((Object) qa.field_d.a((byte) -117));
        var6 = -26 / ((11 - param4) / 54);
        L0: while (true) {
          if (var5 != null) {
            stackIn_5_0 = param0 ^ -1;

            stackIn_5_1 = var5.field_k ^ -1;

            if (var7 == 0) {
              if (stackIn_5_0 != stackIn_5_1) {
                var5 = (de) ((Object) qa.field_d.d((byte) 63));
                if (var7 == 0) {
                  continue L0;
                } else {
                  var5 = new de();
                  var5.field_e = param3;
                  var5.field_h = param1;
                  var5.field_k = param0;
                  qa.field_d.a(-8212, var5);
                  w.a(-95, param2, var5);
                  return var5;
                }
              } else {
                return var5;
              }
            } else {
              w.a(stackIn_5_0, stackIn_5_1, var5);
              return var5;
            }
          } else {
            var5 = new de();
            var5.field_e = param3;
            var5.field_h = param1;
            var5.field_k = param0;
            qa.field_d.a(-8212, var5);
            w.a(-95, param2, var5);
            return var5;
          }
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 76) {
              stackIn_4_0 = gf.field_b.a(param1, "", 62);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("o.F(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    o(int param0, int param1) {
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
                    var16 = MonkeyPuzzle2.field_F ? 1 : 0;
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
                    var3 = ed.a(param0, param1, 0);
                    param1 = param1 / var3;
                    param0 = param0 / var3;
                    this.field_g = param1;
                    this.field_f = param0;
                    this.field_e = new int[param0][14];
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
                    var5 = this.field_e[var4];
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
                    if ((var8 ^ -1) <= -1) {
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
                    var12 = ((double)var8 - var6) * 3.141592653589793;
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
                    if (var12 <= 0.0001) {
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
                    var14 = var14 * (0.46 * Math.cos(0.2243994752564138 * (-var6 + (double)var8)) + 0.54);
                    var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
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
        field_b = 0;
        field_d = new te(10, 2, 2, 0);
    }
}
