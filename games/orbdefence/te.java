/*
 * Decompiled by CFR-JS 0.4.0.
 */
class te extends s {
    static String field_J;
    static int field_O;
    static boolean field_G;
    private String[] field_K;
    static String field_L;
    private cc field_H;
    static String[] field_N;
    private im field_I;
    static fk field_M;

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 53) {
            return;
        }
        this.a(param3, param0, ((rj) ((Object) this.field_j)).b((pj) (this), true), (byte) -90, param2);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -127);
    }

    te(String param0, td param1) {
        super(param0, (ag) null);
        this.field_H = null;
        try {
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 2) {
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
                    return;
                }
                case 3: {
                    try {
                        if (null == this.field_K) {
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
                        if (this.field_K.length <= param0) {
                            statePc = 6;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = new String[param0 - -1];
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
                        this.field_K[param0] = param1;
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
                    stackIn_17_1 = new StringBuilder().append("te.R(").append(param0).append(',');
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
                    throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int statePc = 0;
        int var2 = 0;
        rj var3 = null;
        dm var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ed var12 = null;
        int var13 = 0;
        int var14 = 0;
        cc var15 = null;
        int var16 = 0;
        pj var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = OrbDefence.field_D ? 1 : 0;
                    this.field_I = new im();
                    var2 = 0;
                    var3 = (rj) ((Object) this.field_j);
                    var4 = var3.a((pj) (this), true);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var5 = this.field_l.indexOf("<hotspot=", var2);
                    stackIn_2_0 = var5;
                    stackIn_2_1 = -1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 == stackIn_2_1) {
                        statePc = 19;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var7 = this.field_l.indexOf(">", var5);
                    var6 = this.field_l.substring(9 + var5, var7);
                    var7 = Integer.parseInt(var6);
                    var2 = this.field_l.indexOf("</hotspot>", var5);
                    var8 = var4.a(var5, (byte) 107);
                    var9 = var4.a(var2, (byte) 107);
                    var10 = null;
                    stackIn_20_0 = var8;
                    stackIn_4_0 = stackIn_20_0;
                    if (var16 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var11 = stackIn_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var11 > var9) {
                        statePc = 18;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var12 = var4.field_c[var11];
                    stackIn_2_0 = var11;
                    stackIn_7_0 = stackIn_2_0;
                    stackIn_2_1 = var8;
                    stackIn_7_1 = stackIn_2_1;
                    if (var16 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 != stackIn_7_1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = var4.a(param0 ^ 12, var5);
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = var12.field_g[0];
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var13 = stackIn_10_0;
                    if (var9 != var11) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_15_0 = var4.a(param0 + 32, var2);
                    statePc = 15;
                    continue stateLoop;
                }
                case 12: {
                    if (var12 != null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = var12.field_g[var12.field_g.length - 1];
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var14 = stackIn_15_0;
                    var15 = new cc(var7, var13, var12.field_f, -var13 + var14, Math.max(var3.a((byte) -128), -var12.field_f + var12.field_c));
                    if (var10 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((cc) (var10)).field_p = var15;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    this.field_I.a(-92, var15);
                    var10 = var15;
                    var11++;
                    if (var16 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var16 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = param0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 != -127) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    var17 = (pj) null;
                    this.a(-25, (pj) null);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int j(int param0) {
        if (param0 != 2) {
            te.k(-128);
            return h.field_H;
        }
        return h.field_H;
    }

    void a(int param0, int param1, int param2, int param3) {
        cc discarded$4 = null;
        cc var6;
        int var7;
        int var8;
        rj var10;
        rj var11;
        super.a(param0, param1, param2 + 0, param3);
        if (param2 == 1048575) {
          if (-1 != (param1 ^ -1)) {
            return;
          } else {
            L0: {
              var11 = (rj) ((Object) this.field_j);
              var6 = this.field_H;
              if (var6 != null) {
                var7 = var11.a((pj) (this), param3, (byte) 54);
                var8 = var11.a((pj) (this), 9534, param0);
                L1: while (true) {
                  wh.a(var6.field_s + 2, false, -2 + var7 - -var6.field_o, var6.field_n + 2, -2 + var8 - -var6.field_g);
                  var6 = var6.field_p;
                  if (var6 != null) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          discarded$4 = this.a(-110, 35, 78);
          if (-1 != (param1 ^ -1)) {
            return;
          } else {
            L2: {
              var10 = (rj) ((Object) this.field_j);
              var6 = this.field_H;
              if (var6 != null) {
                var7 = var10.a((pj) (this), param3, (byte) 54);
                var8 = var10.a((pj) (this), 9534, param0);
                L3: while (true) {
                  wh.a(var6.field_s + 2, false, -2 + var7 - -var6.field_o, var6.field_n + 2, -2 + var8 - -var6.field_g);
                  var6 = var6.field_p;
                  if (var6 != null) {
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
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
              this.field_H = null;
              if (!this.field_t) {
                break L1;
              } else {
                var5_int = ua.field_a + -param2 + -this.field_s;
                var6 = vl.field_d - param3 + -this.field_n;
                this.field_H = this.a(-2, var6, var5_int);
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

            stackIn_5_1 = new StringBuilder().append("te.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, pj param1) {
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
              if (param0 == -81) {
                break L1;
              } else {
                this.b(-120, 119, 43, -76);
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

            stackIn_6_1 = new StringBuilder().append("te.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    String g(int param0) {
        if (param0 == -8235) {
          if (this.field_H != null) {
            if (this.field_K != null) {
              if (this.field_K.length <= this.field_H.field_q) {
                return null;
              } else {
                return this.field_K[this.field_H.field_q];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    private final cc a(int param0, int param1, int param2) {
        cc var4 = null;
        cc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    var4 = (cc) ((Object) this.field_I.b((byte) -22));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 == null) {
                        statePc = 20;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var6 == 0) {
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
                        statePc = 19;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var8 = var5.field_o;
                    var7 = param2;
                    if (var6 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var7 < var8) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var7 == var8) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_L = (String) null;
                    return null;
                }
                case 11: {
                    return null;
                }
                case 13: {
                    if (var5.field_g > param1) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var5.field_s + var5.field_o <= param2) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var5.field_g + var5.field_n >= param1) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return var4;
                }
                case 18: {
                    var5 = var5.field_p;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var4 = (cc) ((Object) this.field_I.d(param0 ^ -853));
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (param0 == -2) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    field_L = (String) null;
                    return null;
                }
                case 22: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void k(int param0) {
        field_N = null;
        field_J = null;
        field_M = null;
        if (param0 != -3213) {
            te.k(-125);
            field_L = null;
            return;
        }
        field_L = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        cc var7;
        super.b(param0 ^ 0, param1, param2, param3);
        if (param0 == 84) {
          var5 = -this.field_s + param3;
          var6 = -this.field_n + param1;
          var7 = this.a(param0 ^ -86, var6, var5);
          if (var7 != null) {
            if (null == this.field_h) {
              return;
            } else {
              ((ff) ((Object) this.field_h)).a(param2, var7.field_q, (byte) 101, (te) (this));
              return;
            }
          } else {
            return;
          }
        } else {
          this.a(93, (byte) 51, 88, -37);
          var5 = -this.field_s + param3;
          var6 = -this.field_n + param1;
          var7 = this.a(param0 ^ -86, var6, var5);
          if (var7 == null) {
            return;
          } else {
            L0: {
              if (null != this.field_h) {
                ((ff) ((Object) this.field_h)).a(param2, var7.field_q, (byte) 101, (te) (this));
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    static {
        field_J = "to return to the normal view.";
        field_G = false;
        field_N = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_L = "Please enter your age in years";
        field_M = new fk(0);
    }
}
