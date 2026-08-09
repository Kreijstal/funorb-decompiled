/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends dk {
    private int field_G;
    private fa field_H;
    static ak field_I;
    private String field_M;
    private int field_L;
    static int field_O;
    private int field_J;
    static wd field_K;
    static long field_P;
    private boolean field_E;
    static String[] field_N;
    static wh field_F;

    ml(int param0, int param1, int param2, int param3, qa param4, boolean param5, int param6, int param7, fa param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ch) null, (kd) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((ml) (this)).field_E = stackIn_4_1 != 0;
                this.field_J = param7;
                this.field_M = param10;
                this.field_A = param4;
                this.field_L = param6;
                this.field_H = param8;
                this.field_G = param9;
                var12_int = -this.field_J + this.field_L;
                var13 = this.field_H.b(param10, var12_int, this.field_H.field_H) - -(this.field_J * 2);
                if (param3 < var13) {
                  break L3;
                } else {
                  var13 = param3;
                  if (!fleas.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.a(param0, param2, param1, var13, 80);
              break L2;
            }
            L4: {
              if (this.field_E) {
                stackIn_10_0 = 0;
                break L4;
              } else {
                stackIn_10_0 = this.field_J * 2 + this.field_L;
                break L4;
              }
            }
            var14 = stackIn_10_0;
            this.field_A.a(var14, -this.field_L + (param2 - this.field_J * 3), this.field_J - -(var13 + -param3 >> 960240129), -(this.field_J * 2) + param3, 80);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final String g(int param0) {
        int var2 = this.field_A.field_x ? 1 : 0;
        this.field_A.field_x = this.field_x;
        String var3 = this.field_A.g(param0);
        this.field_A.field_x = var2 != 0 ? true : false;
        return var3;
    }

    final static void d(byte param0) {
        if (!ci.field_f) {
          throw new IllegalStateException();
        } else {
          tb.field_c = true;
          if (param0 <= 38) {
            return;
          } else {
            ae.a(false, (byte) 96);
            bh.field_t = 0;
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        hg var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (hg) ((Object) ak.field_d.c((byte) 47));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ec.a(var4, (byte) 30, param0);
                        var4 = (hg) ((Object) ak.field_d.b((byte) -105));
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == 960240129) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_F = (wh) null;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var2), "ml.AA(" + param0 + ',' + param1 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void j(int param0) {
        field_K = null;
        if (param0 != 1) {
          field_P = -1L;
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        } else {
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        }
    }

    final static void i(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ql var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = (ql) ((Object) mi.field_r.c((byte) 47));
                        if (param0 < -36) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_N = (String[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var3 == null) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        rd.a(var3, 115, 5);
                        var3 = (ql) ((Object) mi.field_r.b((byte) -105));
                        if (var2 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1), "ml.EA(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = param1 + this.field_y;
        int var6 = this.field_z - -param0;
        super.b(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var7 = !this.field_E ? 0 : -(2 * this.field_J) + (this.field_u - this.field_L);
        this.field_H.a(this.field_M, this.field_J + var5 - -var7, var6 - -this.field_J, -this.field_J + this.field_L, -(2 * this.field_J) + this.field_j, this.field_G, -1, !this.field_E ? 2 : 0, 1, this.field_H.field_H);
    }

    final static void a(int param0, int param1, dd[] param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 >= param4) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var6_int = param2[0].field_x;
                        var7 = param2[2].field_x;
                        var8 = param2[1].field_x;
                        param2[0].e(param0, param3, param5);
                        param2[2].e(-var7 + param0 + param4, param3, param5);
                        gb.a(ng.field_a);
                        gb.g(param0 + var6_int, param3, param0 - (-param4 - -var7), param3 + param2[param1].field_r);
                        var9 = var6_int + param0;
                        var10 = param0 + param4 - var7;
                        param0 = var9;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var10 <= param0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param2[1].e(param0, param3, param5);
                        param0 = param0 + var8;
                        if (var11 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        gb.b(ng.field_a);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var6);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("ml.CA(").append(param0).append(',').append(param1).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param2 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_I = new ak();
        field_O = 40;
        field_N = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_K = new wd();
        field_F = new wh("email");
    }
}
