/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private int field_a;
    private long[] field_e;
    static uj field_g;
    static int field_m;
    private byte[] field_n;
    static dd[] field_k;
    static String field_p;
    private long[] field_i;
    private long[] field_j;
    private int field_o;
    static float field_l;
    static String field_q;
    private long[] field_b;
    private byte[] field_c;
    static String[] field_f;
    static String field_d;
    private long[] field_h;

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= 32) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_n[var2] = (byte) 0;
                    var2++;
                    if (var3 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_a = 0;
                    this.field_o = 0;
                    this.field_c[0] = (byte) 0;
                    var2 = 0;
                    if (param0 > -91) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var2 < 8) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 14: {
                    wa.a(89);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var2 < 8) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    if (var3 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 22: {
                    this.field_a = 0;
                    this.field_o = 0;
                    this.field_c[0] = (byte) 0;
                    var2 = 0;
                    if (param0 > -91) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var2 < 8) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 25: {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                case 27: {
                    if (var3 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 30: {
                    wa.a(89);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var2 < 8) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                case 35: {
                    if (var3 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 38: {
                    if (param0 > -91) {
                        statePc = 45;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var2 < 8) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    return;
                }
                case 41: {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 43: {
                    if (var3 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                case 45: {
                    wa.a(89);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var2 < 8) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return;
                }
                case 48: {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                case 50: {
                    if (var3 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(boolean param0) {
        int var1;
        String var2;
        String var3;
        String var4;
        String var5;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        L0: {
          var1 = em.field_b;
          if (var1 < 0) {
            var1 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var1 = var1 / 50;
        if (param0) {
          L1: {
            wa.a(false, false, -70);
            if (0 != (1 & ni.field_j * 2 / 50)) {
              stackIn_13_0 = "<col=<%0>>:</col>";
              break L1;
            } else {
              stackIn_13_0 = ":";
              break L1;
            }
          }
          L2: {
            var4 = stackIn_13_0;
            var3 = var4;
            var3 = var4;
            var2 = var4;
            var3 = var2;
            var3 = var2;
            var3 = Integer.toString(var1 % 60);
            if (1 != var3.length()) {
              break L2;
            } else {
              var3 = 0 + var3;
              break L2;
            }
          }
          return var1 / 60 + var4 + var3;
        } else {
          L3: {
            if (0 != (1 & ni.field_j * 2 / 50)) {
              stackIn_7_0 = "<col=<%0>>:</col>";
              break L3;
            } else {
              stackIn_7_0 = ":";
              break L3;
            }
          }
          L4: {
            var5 = stackIn_7_0;
            var3 = var5;
            var3 = var5;
            var2 = var5;
            var3 = var2;
            var3 = var2;
            var3 = Integer.toString(var1 % 60);
            if (1 != var3.length()) {
              break L4;
            } else {
              var3 = 0 + var3;
              break L4;
            }
          }
          return var1 / 60 + var5 + var3;
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 7 & -(7 & (int)param1) + 8;
                        if (param0 < -92) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var7 = 7 & this.field_o;
                        var9 = param1;
                        var11 = 31;
                        var12 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 > var11) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var12 = var12 + (((int)var9 & 255) + (255 & this.field_n[var11]));
                        this.field_n[var11] = (byte)var12;
                        var9 = var9 >>> 8;
                        var12 = var12 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var13 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param1 ^ -1L) >= -9L) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = param2[var5_int] << var6 & 255 | (param2[1 + var5_int] & 255) >>> -var6 + 8;
                        var15 = -1;
                        var14 = var8 ^ -1;
                        if (var13 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var14 > var15) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var14 == var15) {
                            statePc = 26;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 >= 256) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_c[this.field_a] = (byte)ne.a((int) this.field_c[this.field_a], var8 >>> var7);
                        this.field_a = this.field_a + 1;
                        this.field_o = this.field_o + (8 + -var7);
                        if ((this.field_o ^ -1) != -513) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.a((byte) -125);
                        this.field_a = 0;
                        this.field_o = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_c[this.field_a] = (byte)sc.a(var8 << -var7 + 8, 255);
                        param1 = param1 - 8L;
                        this.field_o = this.field_o + var7;
                        var5_int++;
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param1 <= 0L) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8 = 255 & param2[var5_int] << var6;
                        this.field_c[this.field_a] = (byte)ne.a((int) this.field_c[this.field_a], var8 >>> var7);
                        if (var13 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (8L > param1 + (long)var7) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_o = this.field_o + (-var7 + 8);
                        param1 = param1 - (long)(8 + -var7);
                        this.field_a = this.field_a + 1;
                        if (512 == this.field_o) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.a((byte) -128);
                        this.field_a = 0;
                        this.field_o = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_c[this.field_a] = (byte)sc.a(var8 << -var7 + 8, 255);
                        this.field_o = this.field_o + (int)param1;
                        if (var13 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_o = (int)((long)this.field_o + param1);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (var5);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("wa.E(").append(param0).append(',').append(param1).append(',');
                    stackIn_31_1 = stackIn_32_1;
                    if (param2 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_p = null;
        field_d = null;
        if (param0 != -1731) {
            return;
        }
        field_f = null;
        field_g = null;
        field_q = null;
    }

    final void a(byte[] param0, int param1, byte param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_c[this.field_a] = (byte)ne.a((int) this.field_c[this.field_a], 128 >>> sc.a(7, this.field_o));
                        this.field_a = this.field_a + 1;
                        if ((this.field_a ^ -1) < -33) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-65 >= (this.field_a ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fieldTemp$0 = this.field_a;
                        this.field_a = this.field_a + 1;
                        this.field_c[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a((byte) -115);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_a = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param2 == -85) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_h = (long[]) null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (32 <= this.field_a) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fieldTemp$1 = this.field_a;
                        this.field_a = this.field_a + 1;
                        this.field_c[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        dm.a(this.field_n, 0, this.field_c, 32, 32);
                        this.a((byte) -117);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_int = 0;
                        var5 = param1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-9 >= (var4_int ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = this.field_j[var4_int];
                        param0[var5] = (byte)(int)(var6 >>> 538960760);
                        param0[1 + var5] = (byte)(int)(var6 >>> 1954047344);
                        param0[var5 + 2] = (byte)(int)(var6 >>> -1796767512);
                        param0[var5 - -3] = (byte)(int)(var6 >>> 636793824);
                        param0[4 + var5] = (byte)(int)(var6 >>> 757218776);
                        param0[var5 - -5] = (byte)(int)(var6 >>> -1341704880);
                        param0[6 + var5] = (byte)(int)(var6 >>> -850735352);
                        param0[7 + var5] = (byte)(int)var6;
                        var4_int++;
                        var5 += 8;
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var8 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_25_0 = (RuntimeException) (var4);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = new StringBuilder().append("wa.F(");
                    stackIn_24_1 = stackIn_25_1;
                    if (param0 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = -32 / ((-43 - param2) / 32);
        String var4 = (String) null;
        fl.a(param1, param0, (String) null, -22175);
    }

    private final void a(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        long dupTemp$2 = 0L;
        long arrayValue$3 = 0L;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_158_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    var2 = 0;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-9 >= (var2 ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_i[var2] = ik.a(ik.a(re.a((long)this.field_c[6 + var3], 255L) << -591758840, ik.a(re.a((long)this.field_c[var3 + 5] << 290890832, 16711680L), ik.a(ik.a(re.a(255L, (long)this.field_c[3 + var3]) << 1641855392, ik.a(ik.a(re.a((long)this.field_c[1 + var3], 255L) << -1955081744, (long)this.field_c[var3] << -2134972424), re.a(255L, (long)this.field_c[2 + var3]) << -638846808)), re.a(255L, (long)this.field_c[4 + var3]) << 2080686232))), re.a((long)this.field_c[7 + var3], 255L));
                    var3 += 8;
                    var2++;
                    if (var6 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    dupTemp$0 = this.field_j[var2];
                    arrayValue$1 = this.field_i[var2];
                    this.field_b[var2] = dupTemp$0;
                    this.field_h[var2] = ik.a(arrayValue$1, dupTemp$0);
                    var2++;
                    if (var6 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var2 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (10 < var2) {
                        statePc = 48;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_49_0 = 0;
                    stackIn_12_0 = stackIn_49_0;
                    if (var6 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_e[var3] = 0L;
                    var4 = 0;
                    stackIn_23_0 = 56;
                    stackIn_15_0 = stackIn_23_0;
                    if (var6 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a(255, (int)(this.field_b[sc.a(var3 + -var4, 7)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var6 == 0) {
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
                    var3 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var3 >= 8) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_b[var3] = this.field_e[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var6 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var3 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var3 >= 8) {
                        statePc = 40;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_e[var3] = this.field_b[var3];
                    var4 = 0;
                    stackIn_41_0 = 56;
                    stackIn_33_0 = stackIn_41_0;
                    if (var6 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var5 = stackIn_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var4 >= 8) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a((int)(this.field_h[sc.a(var3 + -var4, 7)] >>> var5), 255)]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var6 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var3++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var6 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var3 = stackIn_41_0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var3 >= 8) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_h[var3] = this.field_e[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var6 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2++;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var6 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = param0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 < -86) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    wa.a(31);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var2 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (8 > var2) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                case 54: {
                    this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return;
                }
                case 56: {
                    if (var6 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    var2 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 118;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    dupTemp$2 = this.field_j[var2];
                    arrayValue$3 = this.field_i[var2];
                    this.field_b[var2] = dupTemp$2;
                    this.field_h[var2] = ik.a(arrayValue$3, dupTemp$2);
                    var2++;
                    if (var6 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var6 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var2 = 1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (10 < var2) {
                        statePc = 101;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_102_0 = 0;
                    stackIn_65_0 = stackIn_102_0;
                    if (var6 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var3 = stackIn_65_0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_e[var3] = 0L;
                    var4 = 0;
                    stackIn_76_0 = 56;
                    stackIn_68_0 = stackIn_76_0;
                    if (var6 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var5 = stackIn_68_0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a(255, (int)(this.field_b[sc.a(var3 + -var4, 7)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var6 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var3++;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var6 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var3 = stackIn_76_0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (var3 >= 8) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    this.field_b[var3] = this.field_e[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var6 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var3 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (var3 >= 8) {
                        statePc = 93;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_e[var3] = this.field_b[var3];
                    var4 = 0;
                    stackIn_94_0 = 56;
                    stackIn_86_0 = stackIn_94_0;
                    if (var6 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var5 = stackIn_86_0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (var4 >= 8) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a((int)(this.field_h[sc.a(var3 + -var4, 7)] >>> var5), 255)]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var6 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var3++;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (var6 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackIn_94_0 = 0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var3 = stackIn_94_0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var3 >= 8) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_h[var3] = this.field_e[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var6 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var2++;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var6 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = param0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 >= -86) {
                        statePc = 111;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var2 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (8 > var2) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    return;
                }
                case 106: {
                    this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    return;
                }
                case 108: {
                    if (var6 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    return;
                }
                case 111: {
                    wa.a(31);
                    var2 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (8 > var2) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    return;
                }
                case 114: {
                    this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    return;
                }
                case 116: {
                    if (var6 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    return;
                }
                case 118: {
                    var2 = 1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (10 < var2) {
                        statePc = 157;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_158_0 = 0;
                    stackIn_121_0 = stackIn_158_0;
                    if (var6 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var3 = stackIn_121_0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 131;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_e[var3] = 0L;
                    var4 = 0;
                    stackIn_132_0 = 56;
                    stackIn_124_0 = stackIn_132_0;
                    if (var6 != 0) {
                        statePc = 132;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var5 = stackIn_124_0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a(255, (int)(this.field_b[sc.a(var3 + -var4, 7)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var6 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var3++;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (var6 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var3 = stackIn_132_0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var3 >= 8) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_b[var3] = this.field_e[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var6 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var3 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var3 >= 8) {
                        statePc = 149;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_e[var3] = this.field_b[var3];
                    var4 = 0;
                    stackIn_150_0 = 56;
                    stackIn_142_0 = stackIn_150_0;
                    if (var6 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var5 = stackIn_142_0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (var4 >= 8) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a((int)(this.field_h[sc.a(var3 + -var4, 7)] >>> var5), 255)]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 148;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var6 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var3++;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var6 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    stackIn_150_0 = 0;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var3 = stackIn_150_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (var3 >= 8) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    this.field_h[var3] = this.field_e[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 156;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var6 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var2++;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (var6 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_158_0 = param0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 < -86) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    wa.a(31);
                    var2 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (8 > var2) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    return;
                }
                case 162: {
                    this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    return;
                }
                case 164: {
                    if (var6 == 0) {
                        statePc = 160;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    return;
                }
                case 166: {
                    var2 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (8 > var2) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    return;
                }
                case 169: {
                    this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    return;
                }
                case 171: {
                    if (var6 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    wa() {
        this.field_a = 0;
        this.field_n = new byte[32];
        this.field_i = new long[8];
        this.field_j = new long[8];
        this.field_e = new long[8];
        this.field_c = new byte[64];
        this.field_h = new long[8];
        this.field_b = new long[8];
        this.field_o = 0;
    }

    static {
        field_g = new uj(3);
        field_p = "<%0>One-touch wall:<%1> Acts like a normal wall, but are destroyed after being touched once, from the side, by a flea.";
        field_f = new String[]{"Flea to the Circus", "Circus Performer", "Circus Act", "Circus Master", "Golden Fleas", "Master Flea", "Flea while you still can", "Lord of the Fleas", "Flea Lunch", "Fleadom", "Flea over troubled waters", "Frequent flea-er", "Sensi-flea", "Thought-flea", "Flea thinker", "Philoso-flea"};
        field_q = "If you do nothing the game will revert to normal view in <%0> second.";
        field_d = "Blocks can be used to bridge gaps or to block ways you don't want the fleas to go. Slopes can be chained together to help fleas reach new areas of the level. Fleas are very tough, and don't die if they fall too far. Be careful however: there are many ways for a flea to die!";
    }
}
