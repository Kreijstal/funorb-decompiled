/*
 * Decompiled by CFR-JS 0.4.0.
 */
class le extends lj {
    static sa field_A;
    private String[] field_D;
    private nj field_B;
    private qj field_E;
    static qj field_C;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-109, param1, param2, param3, param4);
        this.j(-91);
        int var6 = 112 / ((param0 - -29) / 53);
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_D == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 >= this.field_D.length) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = new String[1 + param2];
                        var8 = var7;
                        var4 = var8;
                        if (this.field_D != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 >= this.field_D.length) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7[var5] = this.field_D[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_D = var8;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param1 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.j(48);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_D[param2] = param0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (runtimeException);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("le.W(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -11) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_A = (sa) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("le.M(");

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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void j(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int statePc = 0;
        int var2 = 0;
        m var3 = null;
        ue var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ol var12 = null;
        int var13 = 0;
        int var14 = 0;
        nj var15 = null;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Transmogrify.field_A ? 1 : 0;
                    this.field_E = new qj();
                    if (param0 <= -39) {
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
                    var2 = 0;
                    var3 = (m) ((Object) this.field_q);
                    var4 = var3.a((qg) (this), -2);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var5 = this.field_k.indexOf("<hotspot=", var2);
                    stackIn_4_0 = var5;
                    stackIn_4_1 = -1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((stackIn_4_0 ^ stackIn_4_1) != 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    var7 = this.field_k.indexOf(">", var5);
                    var6 = this.field_k.substring(var5 - -9, var7);
                    var7 = Integer.parseInt(var6);
                    var2 = this.field_k.indexOf("</hotspot>", var5);
                    var8 = var4.b(-1, var5);
                    var9 = var4.b(-1, var2);
                    var10 = null;
                    if (var16 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    var11 = var8;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var11 > var9) {
                        statePc = 23;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12 = var4.field_b[var11];
                    stackIn_4_0 = var11 ^ -1;
                    stackIn_11_0 = stackIn_4_0;
                    stackIn_4_1 = var8 ^ -1;
                    stackIn_11_1 = stackIn_4_1;
                    if (var16 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 != stackIn_11_1) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = var4.c(0, var5);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = var12.field_g[0];
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var13 = stackIn_14_0;
                    if (var11 != var9) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_19_0 = var4.c(0, var2);
                    statePc = 19;
                    continue stateLoop;
                }
                case 16: {
                    if (var12 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = var12.field_g[var12.field_g.length + -1];
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var14 = stackIn_19_0;
                    var15 = new nj(var7, var13, var12.field_a, var14 - var13, Math.max(var3.a(true), -var12.field_a + var12.field_f));
                    if (var10 != null) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((nj) (var10)).field_s = var15;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.field_E.a(var15, -105);
                    var10 = var15;
                    var11++;
                    if (var16 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var16 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        nj var8;
        super.a((byte) -127, param1, param2, param3);
        var5 = -this.field_p + param3;
        var6 = param1 + -this.field_n;
        var7 = -35 / ((50 - param0) / 45);
        var8 = this.a(var6, (byte) -5, var5);
        if (var8 != null) {
          if (null == this.field_m) {
            return;
          } else {
            ((hl) ((Object) this.field_m)).a(param2, 2818, var8.field_n, (le) (this));
            return;
          }
        } else {
          return;
        }
    }

    private final nj a(int param0, byte param1, int param2) {
        nj var4 = null;
        nj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nj stackIn_3_0 = null;
        nj stackIn_4_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    var4 = (nj) ((Object) this.field_E.a((byte) -95));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 == null) {
                        statePc = 19;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_4_0 = (nj) (var4);
                    stackIn_3_0 = stackIn_4_0;
                    if (var6 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    var5 = stackIn_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var5 == null) {
                        statePc = 18;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var8 = var5.field_i ^ -1;
                    var7 = param2 ^ -1;
                    if (var6 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var7 > var8) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var7 != var8) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return null;
                }
                case 11: {
                    return (nj) null;
                }
                case 13: {
                    if (param0 < var5.field_h) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var5.field_q + var5.field_i <= param2) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var5.field_h - -var5.field_o < param0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return var4;
                }
                case 17: {
                    var5 = var5.field_s;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var4 = (nj) ((Object) this.field_E.a(true));
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (param1 != -5) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return null;
                }
                case 21: {
                    return (nj) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static Boolean d(boolean param0) {
        Boolean var1 = null;
        if (!param0) {
            field_A = (sa) null;
            var1 = ch.field_f;
            ch.field_f = null;
            return var1;
        }
        var1 = ch.field_f;
        ch.field_f = null;
        return var1;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_B = null;
              if (!this.field_g) {
                break L1;
              } else {
                var5_int = -this.field_p + oa.field_j - param3;
                var6 = -this.field_n + (bk.field_a + -param0);
                this.field_B = this.a(var6, (byte) -5, var5_int);
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

            stackIn_5_1 = new StringBuilder().append("le.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    String f(int param0) {
        if (this.field_B != null) {
          if (null != this.field_D) {
            if (this.field_B.field_n < this.field_D.length) {
              if (param0 != 4) {
                this.a(-19, 125, -68, (byte) 31);
                return this.field_D[this.field_B.field_n];
              } else {
                return this.field_D[this.field_B.field_n];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static String h(int param0) {
        int var1;
        if (rh.field_v != of.field_d) {
          if (!dl.field_l.b(-26753)) {
            return dl.field_l.a((byte) 85);
          } else {
            if (db.field_a == of.field_d) {
              return dl.field_l.a((byte) -85);
            } else {
              var1 = 25 % ((-59 - param0) / 35);
              return ob.field_F;
            }
          }
        } else {
          return hf.field_g;
        }
    }

    public static void i(int param0) {
        field_A = null;
        if (param0 != -1) {
            field_C = (qj) null;
            field_C = null;
            return;
        }
        field_C = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.a(26, param3, param0, param1, ((m) ((Object) this.field_q)).b((qg) (this), 228));
        if (param2 != -1) {
            field_C = (qj) null;
        }
    }

    le(String param0, ui param1) {
        super(param0, (ma) null);
        this.field_B = null;
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "le.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        super.a(param0, param1, param2, (byte) -31);
        if (!(-1 == (param2 ^ -1))) {
            return;
        }
        int var6 = 13 % ((param3 - 77) / 34);
        m var10 = (m) ((Object) this.field_q);
        nj var7 = this.field_B;
        if (var7 != null) {
            var8 = var10.a(9112, (qg) (this), param0);
            var9 = var10.a((qg) (this), 62, param1);
            do {
                ri.a(2 + var7.field_q, var7.field_i + (var8 - 2), -2 + var9 + var7.field_h, (byte) -120, var7.field_o - -2);
                var7 = var7.field_s;
            } while (var7 != null);
        }
    }

    static {
    }
}
