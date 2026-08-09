/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends h {
    private int field_o;
    static int field_u;
    private ti[] field_q;
    private int field_t;
    static int field_r;
    private int field_s;
    static int field_p;

    final static ti[] a(int param0, int param1) {
        ti[] var2;
        ti[] var3;
        var3 = new ti[9];
        var2 = var3;
        if (param0 <= 59) {
          qa.b(126);
          var3[4] = cd.a(param1, 64, (byte) -51);
          return var2;
        } else {
          var3[4] = cd.a(param1, 64, (byte) -51);
          return var2;
        }
    }

    final static void b(int param0) {
        ba.a(114, param0);
    }

    final static void c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = mh.field_b[0];
                        if (param0 == 1702) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_u = 119;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (mh.field_b.length <= var2) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = mh.field_b[var2];
                        ji.a(i.field_b, var2 << -821295740, i.field_b, var1_int, var3);
                        var1_int = var1_int + var3;
                        var2++;
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var1), "qa.D(" + param0 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private qa(int param0, int param1, int param2) {
        this.field_t = param1;
        this.field_i = rh.field_q;
        this.field_q = mc.field_b;
        this.field_s = param0;
        this.field_o = param2;
    }

    public qa() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            L1: {
              var6_int = -26 % ((51 - param3) / 47);
              if (!param4.field_g) {
                if (param4.b((byte) 45)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_6_0;
              if (!(param4 instanceof lj)) {
                break L2;
              } else {
                param2 = param2 & ((lj) ((Object) param4)).field_t;
                break L2;
              }
            }
            L3: {
              if (!param2) {
                stackIn_13_0 = this.field_o;
                break L3;
              } else {
                if (var7 != 0) {
                  stackIn_13_0 = this.field_t;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_s;
                  break L3;
                }
              }
            }
            L4: {
              var8 = stackIn_13_0;
              te.a(this.field_q, var8, (param4.field_h + -this.field_q[0].field_s >> 506172609) + (param1 - -param4.field_n), param4.field_l, (byte) 15, param4.field_p + param0);
              if (!param2) {
                stackIn_16_0 = 7105644;
                break L4;
              } else {
                stackIn_16_0 = 16777215;
                break L4;
              }
            }
            var9 = stackIn_16_0;
            this.field_i.a(param4.field_k, param0 - -param4.field_p, param4.field_n + (param1 - 2), param4.field_l, param4.field_h, var9, -1, 1, 1, this.field_i.field_y);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("qa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_p = 64;
    }
}
