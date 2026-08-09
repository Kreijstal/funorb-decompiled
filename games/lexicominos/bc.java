/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bc extends kf {
    private String[] field_G;
    private wl field_I;
    static String field_J;
    static String[] field_E;
    private ng field_K;
    static fi field_H;
    static String[] field_L;
    static dg field_F;

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        wl var7;
        super.a(param0, param1, param2, param3);
        var5 = -this.field_t + param3;
        var6 = param1 - this.field_o;
        var7 = this.a(var6, false, var5);
        if (var7 != null) {
          if (this.field_r != null) {
            ((ue) ((Object) this.field_r)).a(123, (bc) (this), var7.field_o, param2);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(boolean param0) {
        wl discarded$0 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int statePc = 0;
        int var2 = 0;
        ub var3 = null;
        ve var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        rj var12 = null;
        int var13 = 0;
        int var14 = 0;
        wl var15 = null;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Lexicominos.field_L ? 1 : 0;
                    this.field_K = new ng();
                    var2 = 0;
                    var3 = (ub) ((Object) this.field_i);
                    var4 = var3.a((w) (this), (byte) -111);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var5 = this.field_u.indexOf("<hotspot=", var2);
                    stackIn_2_0 = var5;
                    stackIn_2_1 = -1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 != stackIn_2_1) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var16 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var7 = this.field_u.indexOf(">", var5);
                    var6 = this.field_u.substring(9 + var5, var7);
                    var7 = Integer.parseInt(var6);
                    var2 = this.field_u.indexOf("</hotspot>", var5);
                    var8 = var4.a(28276, var5);
                    var9 = var4.a(28276, var2);
                    var10 = null;
                    var11 = var8;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var9 < var11) {
                        statePc = 19;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var12 = var4.field_c[var11];
                    stackIn_2_0 = var11 ^ -1;
                    stackIn_7_0 = stackIn_2_0;
                    stackIn_2_1 = var8 ^ -1;
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
                    stackIn_10_0 = var4.a((byte) -113, var5);
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = var12.field_a[0];
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var13 = stackIn_10_0;
                    if (var11 != var9) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_15_0 = var4.a((byte) -127, var2);
                    statePc = 15;
                    continue stateLoop;
                }
                case 12: {
                    if (var12 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = var12.field_a[var12.field_a.length + -1];
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var14 = stackIn_15_0;
                    var15 = new wl(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(2), var12.field_c + -var12.field_d));
                    if (var10 != null) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((wl) (var10)).field_p = var15;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    this.field_K.b(114, var15);
                    var10 = var15;
                    var11++;
                    if (var16 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var16 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (param0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    discarded$0 = this.a(68, true, 35);
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
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
              this.field_I = null;
              if (!this.field_m) {
                break L1;
              } else {
                var5_int = -this.field_t + -param3 + bk.field_b;
                var6 = -this.field_o + sh.field_e - param2;
                this.field_I = this.a(var6, false, var5_int);
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

            stackIn_5_1 = new StringBuilder().append("bc.FA(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        wl discarded$1 = null;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
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
                    var6 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == -27371) {
                            statePc = 3;
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
                        discarded$1 = this.a(-40, false, -28);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (this.field_G == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 < this.field_G.length) {
                            statePc = 14;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = new String[1 + param1];
                        var4 = var7;
                        if (null != this.field_G) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_G.length <= var5) {
                            statePc = 13;
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
                        var7[var5] = this.field_G[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_G = var7;
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
                        this.field_G[param1] = param0;
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
                    stackIn_18_1 = new StringBuilder().append("bc.S(");
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
                    throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final wl a(int param0, boolean param1, int param2) {
        wl stackIn_7_0 = null;
        wl stackIn_14_0 = null;
        int statePc = 0;
        wl var4 = null;
        wl var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    var4 = (wl) ((Object) this.field_K.a(true));
                    if (!param1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (wl) null;
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
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_14_0 = (wl) (var5);
                    stackIn_7_0 = stackIn_14_0;
                    if (var6 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0.field_j > param2) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var5.field_k > param0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var5.field_l + var5.field_j <= param2) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var5.field_k + var5.field_h < param0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var4;
                }
                case 12: {
                    var5 = var5.field_p;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (wl) ((Object) this.field_K.f(2));
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var4 = stackIn_14_0;
                    if (var6 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(boolean param0) {
        field_L = null;
        if (param0) {
          bc.e(true);
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        } else {
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        }
    }

    String b(int param0) {
        if (null != this.field_I) {
          if (this.field_G != null) {
            if (param0 >= 121) {
              if (this.field_G.length <= this.field_I.field_o) {
                return null;
              } else {
                return this.field_G[this.field_I.field_o];
              }
            } else {
              return (String) null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                bc.e(true);
                break L1;
              }
            }
            L2: {
              stackIn_4_0 = 10;

              if (param0) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 1;
                break L2;
              }
            }
            stackIn_6_0 = rk.a(stackIn_5_0, stackIn_5_1 != 0, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("bc.T(").append(param0).append(',');

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
        return stackIn_6_0;
    }

    boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 44) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var4 = (CharSequence) null;
              bc.a(false, (CharSequence) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bc.LA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != -2) {
          this.b(35);
          this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
          return;
        } else {
          this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
          return;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        wl var6;
        int var7;
        int var8;
        ub var9;
        super.a(param0, param1, param2, param3);
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          var9 = (ub) ((Object) this.field_i);
          var6 = this.field_I;
          if (var6 == null) {
            return;
          } else {
            var7 = var9.b((w) (this), 102, param2);
            var8 = var9.a((w) (this), 20340, param1);
            L0: while (true) {
              pk.a(var6.field_h + 2, -2 + (var8 + var6.field_k), var7 - -var6.field_j - 2, param0 ^ -116, var6.field_l + 2);
              var6 = var6.field_p;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    bc(String param0, rd param1) {
        super(param0, (vd) null);
        this.field_I = null;
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, true, param3, param4);
        this.f(param2);
    }

    static {
        field_J = "More suggestions";
        field_E = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_H = new fi(1);
        field_L = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = new dg();
    }
}
