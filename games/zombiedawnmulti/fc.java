/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    int field_e;
    int field_j;
    int[][] field_f;
    static int[] field_m;
    int field_d;
    int[][] field_k;
    int field_i;
    int[][] field_g;
    int[][] field_h;
    private int field_b;
    int[] field_l;
    static boolean[] field_c;
    static cj field_a;

    public static void b(int param0) {
        if (param0 != -1) {
            field_a = (cj) null;
        }
        field_m = null;
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        gf.field_g = 0;
        lq.field_b = 0;
        fn.field_c = 0;
        lb.field_a = nf.field_a;
        if (param0 < 121) {
          return;
        } else {
          gl.field_H = new hh(2);
          gl.field_H.a(-1, param1, -31458, al.c(bo.field_d, -1, bd.field_g));
          return;
        }
    }

    private final id a(int param0, int param1, byte param2, int param3, int param4) {
        h var6;
        fd var6_ref;
        int var6_int;
        int var7;
        wb var8;
        if (-1 != (param1 ^ -1)) {
          if (-2 != (param1 ^ -1)) {
            if (2 != param1) {
              if (3 != param1) {
                if (-5 != (param1 ^ -1)) {
                  if (param2 <= -60) {
                    return null;
                  } else {
                    this.a((byte) 54);
                    return null;
                  }
                } else {
                  var6 = new h(param0, param4, false);
                  var6.field_I = (byte)((param3 & -1073741824) >>> -294768322);
                  return (id) ((Object) var6);
                }
              } else {
                return (id) ((Object) new mg(param0, param4, param3));
              }
            } else {
              L0: {
                var6_ref = new fd(param0, param4, param3 & -1610612737);
                if (0 >= (param3 & 1073741824)) {
                  break L0;
                } else {
                  var6_ref.field_H = true;
                  break L0;
                }
              }
              L1: {
                if (0 < (param3 & 536870912)) {
                  var6_ref.field_K = true;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (id) ((Object) var6_ref);
            }
          } else {
            return (id) ((Object) pg.a(param0, (byte) -128, param3, param4));
          }
        } else {
          var6_int = 1073741823 & param3;
          var7 = (byte)(param3 >>> -1830245730 & 3);
          var8 = new wb(param0, param4, var6_int);
          var8.field_Lb = var7;
          return (id) ((Object) var8);
        }
    }

    private final int a(boolean param0, int param1) {
        if (!param0) {
            this.field_b = 72;
        }
        if (!((this.field_b ^ -1) <= -5)) {
            if (-65 < (param1 ^ -1)) {
                param1 = param1 + this.field_b * 72;
            }
        }
        return param1 << 1928751495;
    }

    th a(int param0) {
        int var2 = 0;
        th var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        id var9 = null;
        int var10 = 0;
        th stackIn_3_0 = null;
        th stackIn_6_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = 88 % ((param0 - 37) / 41);
                    var3 = new th();
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 >= this.field_l.length) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5 = this.field_l[var4];
                    var6 = this.field_l[var4 - -1];
                    var7 = this.field_l[2 + var4];
                    var8 = this.field_l[3 + var4];
                    var9 = this.a(var7, var5, (byte) -97, var6, var8);
                    stackIn_6_0 = (th) (var3);
                    stackIn_3_0 = stackIn_6_0;
                    if (var10 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((th) (Object) stackIn_3_0).a(var9, false);
                    var4 += 4;
                    if (var10 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = (th) (var3);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return stackIn_6_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(byte param0) {
        this.a(this.field_g, 9);
        this.b(this.field_g, -10);
        this.field_d = this.field_g[0].length;
        if (param0 < 120) {
          return;
        } else {
          this.field_e = this.field_g.length;
          return;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param0 != -8927) {
            this.field_h = (int[][]) null;
        }
        this.field_k[param1][param2] = cr.b(param3 ? 1 : 0, tq.b(14, this.field_k[param1][param2]));
        if (this.field_k[param1].length > param2 + 1) {
            this.field_k[param1][param2 - -1] = cr.b(tq.b(this.field_k[param1][1 + param2], -3), param3 ? 2 : 0);
        }
        if (0 < param2 + -1) {
            this.field_k[param1][-1 + param2] = cr.b(tq.b(this.field_k[param1][-1 + param2], -5), param3 ? 4 : 0);
        }
    }

    private final void b(int[][] param0, int param1) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -10) {
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
                        discarded$0 = this.a(94, -4, (byte) -2);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = param0.length;
                        stackIn_5_1 = var3_int;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 <= stackIn_5_1) {
                            statePc = 27;
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
                        if (var8 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = 0;
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
                        if (param0[0].length <= var4) {
                            statePc = 21;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = this.a(var3_int, true, var4);
                        var6 = 511 & var5 >> 627713031;
                        var7 = var5 >> 607305712 & 511;
                        stackIn_5_0 = -1;
                        stackIn_10_0 = stackIn_5_0;
                        stackIn_5_1 = -2147483648 & var5 ^ -1;
                        stackIn_10_1 = stackIn_5_1;
                        if (var8 != 0) {
                            statePc = 5;
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
                        if (stackIn_10_0 == stackIn_10_1) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-10 < (var6 ^ -1)) {
                            statePc = 14;
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
                        if (32 >= var6) {
                            statePc = 19;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-10 < (var7 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (32 >= var7) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
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
                        if (((this.a(1 + var3_int, true, var4) & 65408) >> 1483158567 ^ -1) == -17) {
                            statePc = 19;
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
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5 = var5 | 67108864;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_f[var3_int][var4] = var5;
                        var4++;
                        if (var8 == 0) {
                            statePc = 8;
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
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_25_0 = (RuntimeException) (var3);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = new StringBuilder().append("fc.D(");
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
                    throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int[][] param0, int param1) {
        id discarded$0 = null;
        int[] dupTemp$1 = null;
        int dupTemp$2 = 0;
        int[] arrayValue$3 = null;
        int[] dupTemp$4 = null;
        int dupTemp$5 = 0;
        int[] arrayValue$6 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = param0.length;
                        stackIn_3_1 = var3_int;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_20_0 = 0;
                        stackIn_5_0 = stackIn_20_0;
                        if (var6 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0[0].length <= var4) {
                            statePc = 18;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_3_0 = -1;
                        stackIn_8_0 = stackIn_3_0;
                        stackIn_3_1 = param0[var3_int][var4] & 33554432 ^ -1;
                        stackIn_8_1 = stackIn_3_1;
                        if (var6 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param0[var3_int][var4] & -2147483648) == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_14_0 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = stackIn_14_0;
                        stackIn_16_0 = this.field_h[var3_int];
                        stackIn_15_0 = stackIn_16_0;
                        stackIn_16_1 = var4;
                        stackIn_15_1 = stackIn_16_1;
                        stackIn_16_2 = this.field_k[var3_int];
                        stackIn_15_2 = stackIn_16_2;
                        stackIn_16_3 = var4;
                        stackIn_15_3 = stackIn_16_3;
                        if (var5 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = (int[]) ((Object) stackIn_15_0);
                        stackIn_17_1 = stackIn_15_1;
                        stackIn_17_2 = (int[]) ((Object) stackIn_15_2);
                        stackIn_17_3 = stackIn_15_3;
                        stackIn_17_4 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = (int[]) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = (int[]) ((Object) stackIn_16_2);
                        stackIn_17_3 = stackIn_16_3;
                        stackIn_17_4 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_17_2[stackIn_17_3] = stackIn_17_4;
                        stackIn_17_0[stackIn_17_1] = stackIn_17_4;
                        var4++;
                        if (var6 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = param1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 == 9) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        discarded$0 = this.a(106, -54, (byte) -40, 61, -65);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3_int = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = var3_int;
                        stackIn_24_1 = param0.length;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 >= stackIn_24_1) {
                            statePc = 38;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param0[0].length + -1 <= var4) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_24_0 = 1;
                        stackIn_29_0 = stackIn_24_0;
                        stackIn_24_1 = this.field_k[var3_int][var4] & 1;
                        stackIn_29_1 = stackIn_24_1;
                        if (var6 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 != stackIn_29_1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        dupTemp$1 = this.field_k[var3_int];
                        dupTemp$2 = cr.b(this.field_k[var3_int][var4 + 1], 2);
                        arrayValue$3 = this.field_h[var3_int];
                        dupTemp$1[1 + var4] = dupTemp$2;
                        arrayValue$3[1 + var4] = dupTemp$2;
                        dupTemp$4 = this.field_k[var3_int];
                        dupTemp$5 = cr.b(4, this.field_k[var3_int][-1 + var4]);
                        arrayValue$6 = this.field_h[var3_int];
                        dupTemp$4[-1 + var4] = dupTemp$5;
                        arrayValue$6[var4 + -1] = dupTemp$5;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_36_0 = (RuntimeException) (var3);
                    stackIn_35_0 = stackIn_36_0;
                    stackIn_36_1 = new StringBuilder().append("fc.I(");
                    stackIn_35_1 = stackIn_36_1;
                    if (param0 == null) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_37_2 = "{...}";
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_37_2 = "null";
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    throw fa.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = this.a((byte) 91, param2, param0);
          var4 = var4 & -67108865;
          var5 = 511 & var4 >> 506472231;
          if ((var4 & 33554432) == 0) {
            break L0;
          } else {
            if (-1 == (var5 ^ -1)) {
              L1: {
                var4 = var4 & -65409;
                if (!this.a(param2 - -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 - -1, 2)) {
                    stackIn_10_0 = 1;
                    break L1;
                  } else {
                    stackIn_10_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_10_0 = 0;
                  break L1;
                }
              }
              L2: {
                var6 = stackIn_10_0;
                var7 = this.a(param2, 3 + param0, (byte) -53) ? 1 : 0;
                var8 = this.a(param2, param0 + -1, (byte) -53) ? 1 : 0;
                if (!this.a(param2 + -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 + -1, 2)) {
                    stackIn_16_0 = 1;
                    break L2;
                  } else {
                    stackIn_16_0 = 0;
                    break L2;
                  }
                } else {
                  stackIn_16_0 = 1;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_16_0;
                if (!this.a(param2 + 1, param0, (byte) -53)) {
                  stackIn_19_0 = 0;
                  break L3;
                } else {
                  stackIn_19_0 = 1;
                  break L3;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var10 = stackIn_19_0;
                    if (!this.a(param0, param2, 2)) {
                      break L6;
                    } else {
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (!this.a(param0, param2, 2)) {
                      break L7;
                    } else {
                      if (var6 == 0) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            stackIn_27_0 = var10;

                            if (this.a(param2 - -1, 2 + param0, (byte) -53)) {
                              break L9;
                            } else {


                              if (!this.a(1 + param2, param0 + 1, (byte) -53)) {
                                stackIn_29_0 = stackIn_27_0;
                                stackIn_29_1 = 0;
                                break L8;
                              } else {

                                break L9;
                              }
                            }
                          }
                          stackIn_29_0 = stackIn_27_0;
                          stackIn_29_1 = 1;
                          break L8;
                        }
                        L10: {
                          L11: {
                            var10 = stackIn_29_0 | stackIn_29_1;
                            stackIn_32_0 = var9;

                            if (this.a(param2 - 1, 2 + param0, (byte) -53)) {
                              break L11;
                            } else {


                              if (!this.a(-1 + param2, param0 - -1, (byte) -53)) {
                                stackIn_34_0 = stackIn_32_0;
                                stackIn_34_1 = 0;
                                break L10;
                              } else {

                                break L11;
                              }
                            }
                          }
                          stackIn_34_0 = stackIn_32_0;
                          stackIn_34_1 = 1;
                          break L10;
                        }
                        L12: {
                          var9 = stackIn_34_0 | stackIn_34_1;
                          if (!this.a(param2 + 1, param0 - -1, (byte) -53)) {
                            stackIn_37_0 = 0;
                            break L12;
                          } else {
                            stackIn_37_0 = 128;
                            break L12;
                          }
                        }
                        L13: {
                          var11 = stackIn_37_0;
                          if (var7 != 0) {
                            break L13;
                          } else {
                            if (var8 != 0) {
                              break L13;
                            } else {
                              if (var9 == 0) {
                                break L13;
                              } else {
                                if (var10 == 0) {
                                  break L13;
                                } else {
                                  var4 = var4 | -var11 + this.a(true, 26);
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          if (var7 != 0) {
                            break L14;
                          } else {
                            if (var8 != 0) {
                              break L14;
                            } else {
                              if (var9 != 0) {
                                break L14;
                              } else {
                                if (var10 == 0) {
                                  break L14;
                                } else {
                                  var4 = var4 | this.a(true, 28) + -var11;
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        if (var12 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L15: {
                    if (!this.a(param2, 1 + param0, (byte) -53)) {
                      break L15;
                    } else {
                      L16: {
                        L17: {
                          if (!this.a(1 + param2, param0, (byte) -53)) {
                            break L17;
                          } else {
                            if (this.a(-1 + param2, param0, (byte) -53)) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (!this.a(param2 - -1, param0, (byte) -53)) {
                            break L18;
                          } else {
                            var4 = var4 | this.a(true, 7);
                            if (var12 == 0) {
                              break L4;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if (!this.a(param2 - 1, param0, (byte) -53)) {
                            break L19;
                          } else {
                            var4 = var4 | this.a(param1, 3);
                            if (var12 == 0) {
                              break L4;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var4 = var4 | this.a(true, 1);
                        if (var12 == 0) {
                          break L4;
                        } else {
                          break L16;
                        }
                      }
                      var4 = var4 | this.a(true, 5);
                      if (var12 == 0) {
                        break L4;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (this.a(param2, param0 + 2, (byte) -53)) {
                    L20: {
                      L21: {
                        if (!this.a(param2 - -1, param0, (byte) -53)) {
                          break L21;
                        } else {
                          if (this.a(param2 - 1, param0, (byte) -53)) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (!this.a(param2 - -1, param0, (byte) -53)) {
                          break L22;
                        } else {
                          var4 = var4 | this.a(param1, 8);
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        if (!this.a(-1 + param2, param0, (byte) -53)) {
                          break L23;
                        } else {
                          var4 = var4 | this.a(true, 4);
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var4 = var4 | this.a(true, 2);
                      if (var12 == 0) {
                        break L4;
                      } else {
                        break L20;
                      }
                    }
                    var4 = var4 | this.a(param1, 6);
                    if (var12 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
                L24: {
                  if (var7 == 0) {
                    break L24;
                  } else {
                    if (var8 == 0) {
                      break L24;
                    } else {
                      if (var9 == 0) {
                        break L24;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(param1, 9);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                }
                L25: {
                  if (var7 == 0) {
                    break L25;
                  } else {
                    if (var8 == 0) {
                      break L25;
                    } else {
                      if (var9 == 0) {
                        break L25;
                      } else {
                        if (var10 != 0) {
                          break L25;
                        } else {
                          var4 = var4 | this.a(true, 10);
                          break L25;
                        }
                      }
                    }
                  }
                }
                L26: {
                  if (var7 == 0) {
                    break L26;
                  } else {
                    if (var8 == 0) {
                      break L26;
                    } else {
                      if (var9 != 0) {
                        break L26;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(param1, 11);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                }
                L27: {
                  if (var7 == 0) {
                    break L27;
                  } else {
                    if (var8 == 0) {
                      break L27;
                    } else {
                      if (var9 != 0) {
                        break L27;
                      } else {
                        if (var10 != 0) {
                          break L27;
                        } else {
                          var4 = var4 | this.a(true, 18);
                          break L27;
                        }
                      }
                    }
                  }
                }
                L28: {
                  if (var7 == 0) {
                    break L28;
                  } else {
                    if (var8 != 0) {
                      break L28;
                    } else {
                      if (var9 == 0) {
                        break L28;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(true, 12);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                }
                L29: {
                  if (var7 == 0) {
                    break L29;
                  } else {
                    if (var8 != 0) {
                      break L29;
                    } else {
                      if (var9 == 0) {
                        break L29;
                      } else {
                        if (var10 != 0) {
                          break L29;
                        } else {
                          var4 = var4 | this.a(true, 14);
                          break L29;
                        }
                      }
                    }
                  }
                }
                L30: {
                  if (var7 == 0) {
                    break L30;
                  } else {
                    if (var8 != 0) {
                      break L30;
                    } else {
                      if (var9 != 0) {
                        break L30;
                      } else {
                        if (var10 == 0) {
                          break L30;
                        } else {
                          var4 = var4 | this.a(true, 15);
                          break L30;
                        }
                      }
                    }
                  }
                }
                L31: {
                  if (var7 == 0) {
                    break L31;
                  } else {
                    if (var8 != 0) {
                      break L31;
                    } else {
                      if (var9 != 0) {
                        break L31;
                      } else {
                        if (var10 == 0) {
                          var4 = var4 | this.a(true, 21);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                }
                L32: {
                  if (var7 != 0) {
                    break L32;
                  } else {
                    if (var8 == 0) {
                      break L32;
                    } else {
                      if (var9 == 0) {
                        break L32;
                      } else {
                        if (var10 == 0) {
                          break L32;
                        } else {
                          var4 = var4 | this.a(true, 13);
                          break L32;
                        }
                      }
                    }
                  }
                }
                L33: {
                  if (var7 != 0) {
                    break L33;
                  } else {
                    if (var8 == 0) {
                      break L33;
                    } else {
                      if (var9 == 0) {
                        break L33;
                      } else {
                        if (var10 == 0) {
                          var4 = var4 | this.a(param1, 16);
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                }
                L34: {
                  if (var7 != 0) {
                    break L34;
                  } else {
                    if (var8 == 0) {
                      break L34;
                    } else {
                      if (var9 != 0) {
                        break L34;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(param1, 17);
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                }
                L35: {
                  if (var7 != 0) {
                    break L35;
                  } else {
                    if (var8 == 0) {
                      break L35;
                    } else {
                      if (var9 != 0) {
                        break L35;
                      } else {
                        if (var10 == 0) {
                          var4 = var4 | this.a(true, 20);
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                }
                L36: {
                  if (var7 != 0) {
                    break L36;
                  } else {
                    if (var8 != 0) {
                      break L36;
                    } else {
                      if (var9 == 0) {
                        break L36;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(true, 19);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                }
                L37: {
                  if (var7 != 0) {
                    break L37;
                  } else {
                    if (var8 != 0) {
                      break L37;
                    } else {
                      if (var9 == 0) {
                        break L37;
                      } else {
                        if (var10 != 0) {
                          break L37;
                        } else {
                          var4 = var4 | this.a(true, 22);
                          break L37;
                        }
                      }
                    }
                  }
                }
                L38: {
                  if (var7 != 0) {
                    break L38;
                  } else {
                    if (var8 != 0) {
                      break L38;
                    } else {
                      if (var9 != 0) {
                        break L38;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(true, 23);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                    }
                  }
                }
                if (var7 != 0) {
                  break L4;
                } else {
                  if (var8 != 0) {
                    break L4;
                  } else {
                    if (var9 != 0) {
                      break L4;
                    } else {
                      if (var10 == 0) {
                        var4 = var4 | this.a(param1, 24);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L39: {
                if ((65408 & var4) == 0) {
                  var4 = var4 | this.a(param1, 24);
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (param1) {
                  break L40;
                } else {
                  this.a((int[][]) null, -26);
                  break L40;
                }
              }
              return var4;
            } else {
              break L0;
            }
          }
        }
        return var4;
    }

    private final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        L0: {
          if (param2 == 2) {
            break L0;
          } else {
            this.field_d = -47;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.a(param1, param0 + 1, (byte) -53)) {
              break L2;
            } else {
              if (this.a(param1, param0 + 2, (byte) -53)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void b(byte param0) {
        if (f.field_a != -vm.field_hb + 0 && -vm.field_hb + 250 != f.field_a) {
        }
        if (param0 != -9) {
            field_a = (cj) null;
        }
        f.field_a = f.field_a + 1;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int stackIn_6_0 = 0;
        if (param2 != -53) {
          return false;
        } else {
          L0: {
            L1: {
              if (0 == (this.a((byte) 82, param0, param1) & 33554432)) {
                break L1;
              } else {
                if (-65 <= (this.a((byte) 105, param0, param1) >> 670815815 & 511 ^ -1)) {
                  stackIn_6_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_6_0 = 1;
            break L0;
          }
          return stackIn_6_0 != 0;
        }
    }

    private final int a(byte param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 <= 31) {
            discarded$0 = this.a(24, -127, (byte) 25);
        }
        if (!(-1 >= (param1 ^ -1))) {
            return 0;
        }
        if (param2 < 0) {
            return 0;
        }
        if (this.field_g.length <= param2) {
            return 0;
        }
        if (!(this.field_g[0].length > param1)) {
            return 0;
        }
        return this.field_g[param2][param1];
    }

    fc(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        int fieldTemp$0 = 0;
        try {
            this.field_j = param2;
            fieldTemp$0 = eh.field_b;
            eh.field_b = eh.field_b + 1;
            this.field_i = fieldTemp$0;
            this.field_l = param1;
            this.field_b = param4;
            this.field_g = param0;
            this.field_f = new int[param0.length][param0[0].length];
            this.field_k = new int[param0.length][param0[0].length];
            this.field_h = new int[param0.length][param0[0].length];
            this.a((byte) 121);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_m = da.a(8);
    }
}
