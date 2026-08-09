/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wf {
    static int field_m;
    static sh field_u;
    static sh field_p;
    static long field_k;
    private int field_q;
    static int field_r;
    static cc[] field_o;
    private pe field_n;
    static int field_t;
    static db[] field_l;
    static int field_s;

    final int i(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != -76) {
          field_u = (sh) null;
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$2] - this.field_n.c(0) & 255;
        } else {
          fieldTemp$3 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$3] - this.field_n.c(0) & 255;
        }
    }

    final void f(int param0) {
        this.field_h = (this.field_q - -7) / param0;
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 >= 56) {
              L1: {
                if (null == bg.field_b) {
                  break L1;
                } else {
                  bg.field_b.field_C.a(param1, false);
                  break L1;
                }
              }
              L2: {
                if (null == hd.field_a) {
                  break L2;
                } else {
                  hd.field_a.field_F.a(param1, false);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("th.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 + this.field_n.c(param1));
    }

    final void e(int param0) {
        if (param0 != 10) {
            return;
        }
        this.field_q = 8 * this.field_h;
    }

    final int g(int param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    var3 = this.field_q >> 558169987;
                    if (param1 == 26527) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_r = 53;
                    statePc = 17;
                    continue stateLoop;
                }
                case 2: {
                    var4 = -(7 & this.field_q) + 8;
                    var5 = 0;
                    this.field_q = this.field_q + param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param0 > var4) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param0 != var4) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = var5 + (this.field_j[var3] & bd.field_j[var4]);
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return var5;
                }
                case 9: {
                    incrementValue$2 = var3;
                    var3++;
                    var5 = var5 + ((bd.field_j[var4] & this.field_j[incrementValue$2]) << -var4 + param0);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                    return var5;
                }
                case 12: {
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (param0 != var4) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5 = var5 + (this.field_j[var3] & bd.field_j[var4]);
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return var5;
                }
                case 17: {
                    var4 = -(7 & this.field_q) + 8;
                    var5 = 0;
                    this.field_q = this.field_q + param0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (param0 > var4) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (param0 != var4) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var5 + (this.field_j[var3] & bd.field_j[var4]);
                    if (var6 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return var5;
                }
                case 23: {
                    incrementValue$3 = var3;
                    var3++;
                    var5 = var5 + ((bd.field_j[var4] & this.field_j[incrementValue$3]) << -var4 + param0);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                    return var5;
                }
                case 26: {
                    if (var6 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (param0 != var4) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5 = var5 + (this.field_j[var3] & bd.field_j[var4]);
                    if (var6 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    th(byte[] param0) {
        super(param0);
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 8) {
              stackIn_4_0 = ti.a(param2, param0, 18, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 116;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("th.J(");

            if (param0 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void j(byte param0) {
        field_l = null;
        field_u = null;
        field_o = null;
        field_p = null;
        int var1 = -42 % ((-6 - param0) / 50);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = -69 % ((-4 - param2) / 32);
                        var6 = 0;
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
                        if (param0 <= var6) {
                            statePc = 12;
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
                        fieldTemp$1 = this.field_h;
                        this.field_h = this.field_h + 1;
                        param3[var6 - -param1] = (byte)(this.field_j[fieldTemp$1] + -this.field_n.c(0));
                        var6++;
                        if (var7 == 0) {
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
                        if (var7 == 0) {
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var5);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("th.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_9_1 = stackIn_10_1;
                    if (param3 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int[] param0, int param1) {
        try {
            int var3_int = 18 / ((param1 - -36) / 50);
            this.field_n = new pe(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "th.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    th(int param0) {
        super(param0);
    }

    static {
        field_o = new cc[10];
    }
}
