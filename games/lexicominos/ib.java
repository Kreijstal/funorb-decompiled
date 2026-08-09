/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements rd {
    static jb[] field_a;
    static String field_i;
    private int field_k;
    private int field_j;
    private int field_f;
    private int field_h;
    private int field_l;
    private le field_c;
    static String field_b;
    private int field_e;
    static int[] field_g;
    private int field_d;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException runtimeException = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ae var14 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof ae) {
                stackIn_3_0 = (w) (param3);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var14 = (ae) ((Object) stackIn_3_0);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param4 == -3284) {
              L3: {
                lf.a(param1 - -param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, this.field_j);
                var7 = var14.field_L + (param1 + param3.field_t);
                var8 = var14.field_F + (param3.field_o + param0);
                lf.c(var7, var8, var14.field_I, this.field_k);
                if (0 == (var14.field_H ^ -1)) {
                  break L3;
                } else {
                  var9 = 3.141592653589793 * (double)var14.field_H * 2.0 / (double)var14.field_K;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                  lf.c(var11 + var7, var8 - -var12, 1, this.field_h);
                  break L3;
                }
              }
              L4: {
                lf.c(var7, var8, 2, 1);
                var9 = (double)var14.field_G * 3.141592653589793 * 2.0 / (double)var14.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                lf.b(var7, var8, var11 + var7, var8 - -var12, 1);
                if (null == this.field_c) {
                  break L4;
                } else {
                  var13 = var14.field_L - (-var14.field_I + -this.field_d);
                  this.field_c.a(param3.field_u, var13 + (param1 + param3.field_t), param3.field_o + param0 + this.field_f, param3.field_j + -this.field_d + -var13, param3.field_v - (this.field_d << 784973377), this.field_e, this.field_l, 1, 1, 0);
                  break L4;
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
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_i = null;
        field_g = null;
        if (!param0) {
            return;
        }
        ib.a(true);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 < -36) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    param2--;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        param2--;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 < 0) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = param1;
                        var5 = var9;
                        var6 = param0;
                        var7 = param3;
                        var9[var6] = (vg.a(var9[var6], 16711422) >> -334453343) + var7;
                        param0++;
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var5_ref);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("ib.C(").append(param0).append(',');
                    stackIn_12_1 = stackIn_13_1;
                    if (param1 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ib(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_h = param6;
            this.field_k = param5;
            this.field_c = param0;
            this.field_d = param1;
            this.field_j = param7;
            this.field_e = param3;
            this.field_f = param2;
            this.field_l = param4;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_i = "The account name you use to access RuneScape and other Jagex.com games";
        field_g = new int[]{0, 0, 0, 10, 40, 125, 250, 500, 1000};
    }
}
