/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ja extends bb {
    static int field_P;
    private String[] field_K;
    private vc field_N;
    static String field_L;
    static String field_O;
    private mi field_M;

    final void i(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int statePc = 0;
        int var2 = 0;
        eg var3 = null;
        ne var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        qa var17 = null;
        Object var18 = null;
        eg var18_ref = null;
        String var22 = null;
        ne var23 = null;
        pi var24 = null;
        mi var25 = null;
        Object var26 = null;
        String var27 = null;
        ne var28 = null;
        pi var29 = null;
        mi var30 = null;
        eg var31 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var26 = null;
                    var16 = fleas.field_A ? 1 : 0;
                    this.field_N = new vc();
                    var2 = 0;
                    if (param0 == 424) {
                        statePc = 25;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var17 = (qa) null;
                    this.a(-109, 29, (qa) null, (byte) 12);
                    var18_ref = (eg) ((Object) this.field_p);
                    var3 = var18_ref;
                    var23 = var18_ref.a((qa) (this), (byte) -35);
                    var4 = var23;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = this.field_i.indexOf("<hotspot=", var2);
                    stackIn_3_0 = -1;
                    stackIn_3_1 = var5;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var7 = this.field_i.indexOf(">", var5);
                    var22 = this.field_i.substring(var5 - -9, var7);
                    var7 = Integer.parseInt(var22);
                    var2 = this.field_i.indexOf("</hotspot>", var5);
                    var8 = var23.b(var5, -1);
                    var9 = var23.b(var2, -1);
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
                    if (var9 < var11) {
                        statePc = 23;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var24 = var23.field_c[var11];
                    stackIn_3_0 = var8 ^ -1;
                    stackIn_11_0 = stackIn_3_0;
                    stackIn_3_1 = var11 ^ -1;
                    stackIn_11_1 = stackIn_3_1;
                    if (var16 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 == stackIn_11_1) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = var24.field_d[0];
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = var23.c(-1, var5);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var13 = stackIn_14_0;
                    if (var11 == var9) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var24 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_19_0 = var24.field_d[var24.field_d.length - 1];
                    statePc = 19;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = var23.c(-1, var2);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var14 = stackIn_19_0;
                    var25 = new mi(var7, var13, var24.field_a, -var13 + var14, Math.max(var18_ref.a((byte) 127), -var24.field_a + var24.field_c));
                    if (var10 != null) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((mi) (var10)).field_q = var25;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var10 = var25;
                    this.field_N.a(false, var25);
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
                        statePc = 2;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 25: {
                    var31 = (eg) ((Object) this.field_p);
                    var28 = var31.a((qa) (this), (byte) -35);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var5 = this.field_i.indexOf("<hotspot=", var2);
                    stackIn_27_0 = -1;
                    stackIn_27_1 = var5;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 != stackIn_27_1) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 29: {
                    var7 = this.field_i.indexOf(">", var5);
                    var27 = this.field_i.substring(var5 - -9, var7);
                    var7 = Integer.parseInt(var27);
                    var2 = this.field_i.indexOf("</hotspot>", var5);
                    var8 = var28.b(var5, -1);
                    var9 = var28.b(var2, -1);
                    var10 = null;
                    if (var16 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    var11 = var8;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var9 < var11) {
                        statePc = 46;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var29 = var28.field_c[var11];
                    stackIn_27_0 = var8 ^ -1;
                    stackIn_34_0 = stackIn_27_0;
                    stackIn_27_1 = var11 ^ -1;
                    stackIn_34_1 = stackIn_27_1;
                    if (var16 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (stackIn_34_0 == stackIn_34_1) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = var29.field_d[0];
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = var28.c(-1, var5);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var13 = stackIn_37_0;
                    if (var11 == var9) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var29 == null) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_42_0 = var29.field_d[var29.field_d.length - 1];
                    statePc = 42;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = var28.c(-1, var2);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var14 = stackIn_42_0;
                    var30 = new mi(var7, var13, var29.field_a, -var13 + var14, Math.max(var31.a((byte) 127), -var29.field_a + var29.field_c));
                    if (var10 != null) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((mi) (var10)).field_q = var30;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var10 = var30;
                    this.field_N.a(false, var30);
                    var11++;
                    if (var16 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var16 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.b(55, 20, false, -78);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (this.field_K == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 < this.field_K.length) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = new String[param2 - -1];
                        var4 = var7;
                        if (null == this.field_K) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 >= this.field_K.length) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7[var5] = this.field_K[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_K = var7;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_K[param2] = param1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (runtimeException);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("ja.FA(").append(param0).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param1 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ja(String param0, ch param1) {
        super(param0, (kd) null);
        this.field_M = null;
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final mi b(int param0, int param1, int param2) {
        int statePc = 0;
        mi var4 = null;
        mi var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    var4 = (mi) ((Object) this.field_N.c((byte) 47));
                    if (param2 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (mi) null;
                }
                case 2: {
                    if (var4 != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return null;
                }
                case 4: {
                    var5 = var4;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var5 == null) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var6 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param0 < var5.field_i) {
                        statePc = 13;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param1 < var5.field_j) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param0 >= var5.field_i - -var5.field_n) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var5.field_j + var5.field_l >= param1) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return var4;
                }
                case 13: {
                    var5 = var5.field_q;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4 = (mi) ((Object) this.field_N.b((byte) -105));
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var6 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -108);
              this.field_M = null;
              if (param3 <= -85) {
                break L1;
              } else {
                this.field_M = (mi) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_x) {
                break L2;
              } else {
                var5_int = ag.field_f - (param1 - -this.field_y);
                var6 = -param0 + kc.field_b + -this.field_z;
                this.field_M = this.b(var5_int, var6, -1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ja.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    String g(int param0) {
        mi discarded$3 = null;
        if (null != this.field_M) {
          if (null != this.field_K) {
            if (param0 == 4) {
              if (this.field_M.field_m >= this.field_K.length) {
                return null;
              } else {
                return this.field_K[this.field_M.field_m];
              }
            } else {
              discarded$3 = this.b(-37, 104, -16);
              if (this.field_M.field_m >= this.field_K.length) {
                return null;
              } else {
                return this.field_K[this.field_M.field_m];
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(param1, param0, param2, ((eg) ((Object) this.field_p)).b(-69, (qa) (this)), 80);
        if (param3 == -9) {
          return;
        } else {
          this.field_K = (String[]) null;
          return;
        }
    }

    public static void j(int param0) {
        field_O = null;
        if (param0 > -75) {
            return;
        }
        field_L = null;
    }

    boolean a(qa param0, int param1) {
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
            L1: {
              if (param1 <= -26) {
                break L1;
              } else {
                this.a(78, 122, -59, -72);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ja.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(424);
    }

    void b(int param0, int param1, boolean param2, int param3) {
        eg var5;
        mi var6;
        int var7;
        int var8;
        super.b(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = (eg) ((Object) this.field_p);
          var6 = this.field_M;
          if (var6 == null) {
            return;
          } else {
            var7 = var5.a(false, param1, (qa) (this));
            var8 = var5.a(param0, (qa) (this), (byte) 84);
            L0: while (true) {
              ek.a(var6.field_l + 2, -2 + (var7 - -var6.field_i), var8 + var6.field_j - 2, 1, var6.field_n + 2);
              var6 = var6.field_q;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        mi var7;
        super.a(param0, param1, param2, param3);
        var5 = param2 - this.field_y;
        var6 = -this.field_z + param0;
        var7 = this.b(var5, var6, -1);
        if (var7 == null) {
          return;
        } else {
          L0: {
            if (null != this.field_s) {
              ((dc) ((Object) this.field_s)).a(var7.field_m, (ja) (this), param3, param1 ^ 22);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    static {
        field_P = 0;
        field_O = "Close";
        field_L = "Please wait...";
    }
}
