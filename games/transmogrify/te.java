/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private int[] field_g;
    private boolean field_d;
    private int field_a;
    static String field_b;
    static int[] field_c;
    private int field_e;
    static String field_f;

    final static void a(gd param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rh.field_r.a(param0, -101);
              ne.a((byte) 7, param0, param2);
              if (param1 == -10) {
                break L1;
              } else {
                te.a((byte) 61);
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

            stackIn_5_1 = new StringBuilder().append("te.H(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        boolean stackOut_2_0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    var3 = this.field_g.length;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 > param0) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this.field_d;
                    stackIn_9_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var4 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = var3 + this.field_e;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (0 != var3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = 1;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = var3 * this.field_e;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = param1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 > -38) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return var3;
                }
                case 11: {
                    field_b = (String) null;
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int discarded$1 = 0;
        L0: {
          if (this.field_a < param0) {
            this.field_a = param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 >= this.field_g.length) {
            this.c(param0, 0);
            break L1;
          } else {
            break L1;
          }
        }
        this.field_g[param0] = param1;
        if (param2 > -111) {
          discarded$1 = this.a(-66, (byte) 61);
          return;
        } else {
          return;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != -14927) {
            return 44;
        }
        if (!(this.field_a >= param0)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_g[param0];
    }

    final static void a(ti[] param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
                    var11 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var6_int = param0[0].field_r;
                        var7 = param0[2].field_r;
                        var8 = param0[1].field_r;
                        param0[0].a(param5, param2, param1);
                        param0[2].a(-var7 + param5 - -param3, param2, param1);
                        sb.a(q.field_i);
                        if (param4 >= 13) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        te.a((byte) 8);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        sb.g(param5 - -var6_int, param2, -var7 + (param5 - -param3), param2 + param0[1].field_s);
                        var9 = param5 - -var6_int;
                        var10 = param3 + param5 + -var7;
                        param5 = var9;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var10 <= param5) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param0[1].a(param5, param2, param1);
                        param5 = param5 + var8;
                        if (var11 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
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
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        sb.b(q.field_i);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var6);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("te.I(");
                    stackIn_15_1 = stackIn_16_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, byte param1) {
        this.a(1 + this.field_a, param0, param1 + -240);
        if (param1 != 118) {
            this.field_a = -79;
        }
    }

    private te() throws Throwable {
        throw new Error();
    }

    final int a(int param0) {
        gd var3;
        if (param0 != 1) {
          var3 = (gd) null;
          te.a((gd) null, (byte) -123, -32);
          return 1 + this.field_a;
        } else {
          return 1 + this.field_a;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 8) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final void a(int param0, int param1) {
        if (param1 <= param0) {
          if (param0 <= this.field_a) {
            if (param0 != this.field_a) {
              ji.a(this.field_g, param0 - -1, this.field_g, param0, this.field_a + -param0);
              this.field_a = this.field_a - 1;
              return;
            } else {
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.a(param0, (byte) -53)];
        int[] var3 = var4;
        ji.a(this.field_g, param1, var4, 0, this.field_g.length);
        this.field_g = var4;
    }

    static {
        field_b = "Username: ";
        field_c = new int[128];
        field_f = "Back";
    }
}
