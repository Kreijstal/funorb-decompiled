/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uk {
    private int field_b;
    int[] field_f;
    static String field_a;
    byte[] field_i;
    private boolean[] field_n;
    static boolean field_e;
    int field_l;
    static ci field_c;
    int field_k;
    byte[] field_g;
    int field_m;
    int field_j;
    boolean[] field_d;
    int field_o;
    oj[] field_h;

    final static void a(int param0, boolean param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              qk.field_h = param3;
              pg.field_s = param0;
              nc.field_T = 0;
              if (param2 == 28333) {
                break L1;
              } else {
                uk.c(-83);
                break L1;
              }
            }
            L2: {
              if (qk.field_h == 0) {
                pg.field_s = qk.field_h;
                ma.field_D = false;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (da.a(qk.field_h, true)) {
                var4_int = 0;
                ae.field_e[qk.field_h].a((byte) 123, param1, var4_int);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "uk.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        oj[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_h.length > this.field_o) {
                break L1;
              } else {
                var5 = new oj[this.field_o + 8];
                ne.a(this.field_h, 0, var5, 0, this.field_h.length);
                this.field_h = var5;
                break L1;
              }
            }
            L2: {
              this.field_h[this.field_o] = new oj(param2, param0, param3);
              this.field_o = this.field_o + 1;
              if (param1 == 0) {
                break L2;
              } else {
                this.d(-125, 44);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "uk.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_a = null;
              if (param0 == -1) {
                break L1;
              } else {
                field_e = true;
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "uk.AB(" + param0 + ')');
        }
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_j = 58;
                break L1;
              }
            }
            stackIn_4_0 = this.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "uk.BB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, int param1) {
        try {
            rn.field_a = param1;
            if (param0) {
                uk.a(83, false, 26, 15);
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "uk.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(un param0, p param1, boolean param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.i(-124);
                        if (3 < var4_int) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("Version number too recent");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (var4_int == 0) {
                            statePc = 29;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var4_int ^ -1) != -2) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("Version number too old");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4_int == 2) {
                            statePc = 27;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-4 != (var4_int ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 = param1.c(param2);
                        var6 = param1.d((byte) 118);
                        var8 = param1.d((byte) 118);
                        var10 = param1.g(0);
                        if (param0 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param0.field_e = (int)(50L * (var6 / 1000L));
                        param0.field_B.field_f = var10;
                        param0.field_v = (int)(var8 / 1000L * 50L);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var11 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var11 ^ -1) <= (var5 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12 = param1.i(-123);
                        var13 = param1.i(-103);
                        var14 = param1.i(-97);
                        this.a((byte) 19, var14, var12, var13);
                        var11++;
                        if (var15 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var15 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var15 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw new RuntimeException("Version number too old");
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw new RuntimeException("Version number too old");
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var4);
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("uk.IA(");
                    stackIn_32_1 = stackIn_34_1;
                    if (param0 == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_0 = stackIn_38_0;
                    stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
                    stackIn_36_1 = stackIn_38_1;
                    if (param1 == null) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw fk.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean[] var5 = null;
        int var6 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = this.field_m;
                        if (param2 == -12) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var5 = new boolean[this.field_d.length];
                        ne.a(this.field_d, 0, var5, 0, var5.length);
                        var6 = this.field_f[param1];
                        if (var6 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = var6 & 16773120;
                        if (param0 == var7) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.a(param1, true, -1);
                        var8 = 0;
                        var9 = 63;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var9 ^ -1) > -1) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this.field_d[var9];
                        stackIn_21_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var10 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!stackIn_13_0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = 1;
                        if (var10 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9--;
                        if (var10 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var8;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a(2, var5, var4_int);
                        stackIn_24_0 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        this.a(2, var5, var4_int);
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw fk.a((Throwable) ((Object) var4), "uk.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean e(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_41_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = -1;
                        var4 = 63;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 < (var4 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = this.field_f[var4];
                        stackIn_19_0 = 0;
                        stackIn_4_0 = stackIn_19_0;
                        stackIn_19_1 = var5_int;
                        stackIn_4_1 = stackIn_19_1;
                        if (var11 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != stackIn_4_1) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = 16773120 & var5_int;
                        var7 = -16773121 & var5_int;
                        if ((param0 ^ -1) != (var6 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (6 == var7) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_int = var4;
                        if (var11 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4--;
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = var3_int;
                        stackIn_19_1 = -1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((stackIn_19_0 ^ stackIn_19_1) != 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    try {
                        var4 = this.field_m;
                        if (param1 >= 49) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        var5 = new boolean[this.field_d.length];
                        ne.a(this.field_d, 0, var5, 0, var5.length);
                        var6 = 0;
                        var7 = 63;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var7 ^ -1) > -1) {
                            statePc = 40;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_41_0 = var6;
                        stackIn_28_0 = stackIn_41_0;
                        if (var11 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var8 = this.field_f[var7];
                        if (-1 != (var8 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = 16773120 & var8;
                        if (param0 != var9) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.a(var7, false, -1);
                        var10 = this.field_d[var3_int] ? 1 : 0;
                        if (var10 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6 = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7--;
                        if (var11 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.a(2, var5, var4);
                        stackIn_41_0 = var6;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0 != 0;
                }
                case 42: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw fk.a((Throwable) ((Object) var3), "uk.WA(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = Chess.field_G;
        try {
          L0: {
            var5_int = this.field_f[param2];
            var6 = 16773120 & var5_int;
            var7 = var5_int & -16773121;
            var8 = param2 / 8;
            var9 = param2 % 8;
            var10 = param3 / 8;
            var11 = param3 % 8;
            var12 = var9 + -var11;
            var13 = this.field_f[param3];
            if (param0 == 19) {
              L1: {
                L2: {
                  var14 = var13 & 16773120;
                  if (var7 == 1) {
                    break L2;
                  } else {
                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (var6 != 0) {
                        if ((var6 ^ -1) != -4097) {
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                if (var6 == 0) {
                  break L1;
                } else {
                  if (var6 != 4096) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var15 = -16773121 & var13;
                if ((var15 ^ -1) == -5) {
                  L4: {
                    if (var14 == 4096) {
                      break L4;
                    } else {
                      L5: {
                        if (7 != var11) {
                          break L5;
                        } else {
                          this.field_n[0] = false;
                          break L5;
                        }
                      }
                      if (var11 != 0) {
                        break L3;
                      } else {
                        this.field_n[1] = false;
                        if (var17 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L6: {
                    if (var11 == 0) {
                      this.field_n[3] = false;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (var11 == 7) {
                    this.field_n[2] = false;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L7: {
                if (-4097 != (var6 ^ -1)) {
                  break L7;
                } else {
                  L8: {
                    this.field_k = -1;
                    if ((var7 ^ -1) == -2) {
                      L9: {
                        if (-7 != (var8 ^ -1)) {
                          break L9;
                        } else {
                          if (var10 == 4) {
                            this.field_l = var9;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if ((var10 ^ -1) != -1) {
                          break L10;
                        } else {
                          var5_int = var6 | param1;
                          break L10;
                        }
                      }
                      if (this.field_b == param3) {
                        var16 = 8 + param3;
                        var13 = this.field_f[var16];
                        this.field_f[var16] = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    if (-5 != (var7 ^ -1)) {
                      break L11;
                    } else {
                      L12: {
                        if ((var9 ^ -1) != -1) {
                          break L12;
                        } else {
                          this.field_n[3] = false;
                          break L12;
                        }
                      }
                      if (-8 != (var9 ^ -1)) {
                        break L11;
                      } else {
                        this.field_n[2] = false;
                        break L11;
                      }
                    }
                  }
                  if (var7 != 6) {
                    break L7;
                  } else {
                    L13: {
                      this.field_n[2] = false;
                      this.field_n[3] = false;
                      if ((var12 ^ -1) != -3) {
                        break L13;
                      } else {
                        this.field_f[(param2 - -param3) / 2] = this.field_f[56];
                        this.field_f[56] = 0;
                        if (var17 == 0) {
                          break L7;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if ((var12 ^ -1) == 1) {
                      this.field_f[(param2 - -param3) / 2] = this.field_f[63];
                      this.field_f[63] = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L14: {
                if (0 == var6) {
                  L15: {
                    this.field_l = -1;
                    if ((var7 ^ -1) != -2) {
                      break L15;
                    } else {
                      L16: {
                        if (7 == var10) {
                          var5_int = param1 | var6;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (var8 != 1) {
                          break L17;
                        } else {
                          if (var10 != 3) {
                            break L17;
                          } else {
                            this.field_k = var9;
                            break L17;
                          }
                        }
                      }
                      if ((this.field_b ^ -1) != (param3 ^ -1)) {
                        break L15;
                      } else {
                        var16 = param3 + -8;
                        var13 = this.field_f[var16];
                        this.field_f[var16] = 0;
                        break L15;
                      }
                    }
                  }
                  L18: {
                    if (4 == var7) {
                      L19: {
                        if (var9 != 7) {
                          break L19;
                        } else {
                          this.field_n[0] = false;
                          break L19;
                        }
                      }
                      if (-1 == (var9 ^ -1)) {
                        this.field_n[1] = false;
                        break L18;
                      } else {
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                  if (-7 == (var7 ^ -1)) {
                    L20: {
                      this.field_n[1] = false;
                      this.field_n[0] = false;
                      if (2 == var12) {
                        break L20;
                      } else {
                        if (1 != (var12 ^ -1)) {
                          break L14;
                        } else {
                          this.field_f[(param3 + param2) / 2] = this.field_f[7];
                          this.field_f[7] = 0;
                          if (var17 == 0) {
                            break L14;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    this.field_f[(param2 - -param3) / 2] = this.field_f[0];
                    this.field_f[0] = 0;
                    break L14;
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
              this.field_b = -1;
              this.field_f[param3] = var5_int;
              this.field_f[param2] = 0;
              this.d(3, var13);
              this.a(param3, 0, param2, param1);
              this.a(-1, false, -1);
              t.field_Q = true;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var5), "uk.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_172_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        int stackIn_202_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_227_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        int stackIn_234_0 = 0;
        int stackIn_234_1 = 0;
        int stackIn_255_0 = 0;
        int stackIn_275_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var29 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var4_int = -1 + this.field_d.length;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 > var4_int) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_d[var4_int] = false;
                    var4_int--;
                    if (var29 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var29 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_m = param0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_m < 0) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((this.field_m ^ -1) < (this.field_f.length ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    var4_int = this.field_f[this.field_m];
                    if (-1 == (var4_int ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    var5 = var4_int & 16773120;
                    var6 = -16773121 & var4_int;
                    var7 = this.field_m % 8;
                    var8 = this.field_m / 8;
                    var15 = 1;
                    var16 = new int[]{1, 1, -1, -1};
                    var17 = new int[]{var8, var7, var8, var7};
                    var18 = new int[]{1, 1, -1, -1};
                    var19 = new int[]{1, -1, 1, -1};
                    var20 = new int[]{2, 2, 1, -1, -2, -2, -1, 1};
                    var21 = new int[]{param2, 1, 2, 2, 1, -1, -2, -2};
                    var27 = var6;
                    if (var27 == 1) {
                        statePc = 41;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (4 == var27) {
                        statePc = 111;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var27 == 2) {
                        statePc = 146;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-4 == (var27 ^ -1)) {
                        statePc = 170;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var27 != 5) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var29 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((var27 ^ -1) != -7) {
                        statePc = 340;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var29 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((var5 ^ -1) == -1) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_47_0 = -1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var22 = stackIn_47_0;
                    var11 = var8 + var22;
                    var23 = 1;
                    var27 = -1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (-2 > (var27 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var10 = var7 - -var27;
                    stackIn_77_0 = -1;
                    stackIn_50_0 = stackIn_77_0;
                    stackIn_77_1 = var10 ^ -1;
                    stackIn_50_1 = stackIn_77_1;
                    if (var29 != 0) {
                        statePc = 77;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0 < stackIn_50_1) {
                        statePc = 72;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var10 >= 8) {
                        statePc = 72;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var9 = var10 - -(var11 * 8);
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (var27 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (-1 == (var12 ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if ((var13 ^ -1) == (var5 ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.a(-1, var9, param1);
                    if (var29 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (0 == var12) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var23 = 0;
                    if (var29 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var23 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = var8;
                    stackIn_77_1 = 1;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (stackIn_77_0 != stackIn_77_1) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((var5 ^ -1) == -1) {
                        statePc = 87;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((var8 ^ -1) != -7) {
                        statePc = 90;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (4096 != var5) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var11 = 2 * var22 + var8;
                    var9 = var11 * 8 + var7;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (0 != var12) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.a(param2 ^ 0, var9, param1);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var24 = -1;
                    if (0 != var5) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var24 = this.field_l;
                    if (var29 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var24 = this.field_k;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (-1 == var24) {
                        statePc = 340;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var27 = var7 + -var24;
                    if (1 == var27) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var27 == -1) {
                        statePc = 100;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var5 != 4096) {
                        statePc = 105;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (3 != var8) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var11 = var8 - 1;
                    var9 = 8 * var11 + var24;
                    this.field_b = var9;
                    this.a(param2 + 0, var9, param1);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var5 ^ -1) != -1) {
                        statePc = 110;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (4 != var8) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var11 = var8 + 1;
                    var9 = var11 * 8 + var24;
                    this.field_b = var9;
                    this.a(-1, var9, param1);
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (var29 == 0) {
                        statePc = 340;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var27 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    stackIn_113_0 = 4;
                    stackIn_113_1 = var27;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (stackIn_113_0 <= stackIn_113_1) {
                        statePc = 145;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var28 = var17[var27];
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (0 > var28) {
                        statePc = 144;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_113_0 = var28 ^ -1;
                    stackIn_118_0 = stackIn_113_0;
                    stackIn_113_1 = -9;
                    stackIn_118_1 = stackIn_113_1;
                    if (var29 != 0) {
                        statePc = 113;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 <= stackIn_118_1) {
                        statePc = 144;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (var15 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var27 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (2 != var27) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var9 = var28 + 8 * var8;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (var9 != this.field_m) {
                        statePc = 134;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (var29 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var13 != var5) {
                        statePc = 141;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (var29 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var15 = 0;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var28 = var28 + var16[var27];
                    if (var29 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var29 == 0) {
                        statePc = 340;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var27 = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (8 <= var27) {
                        statePc = 169;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var11 = var20[var27] + var8;
                    var10 = var7 + var21[var27];
                    if (var29 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if ((var11 ^ -1) > -1) {
                        statePc = 168;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (8 <= var11) {
                        statePc = 168;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 168;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (8 <= var10) {
                        statePc = 168;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var9 = 8 * var11 + var10;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (var14 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (var5 != var13) {
                        statePc = 167;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 167: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var29 == 0) {
                        statePc = 340;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var27 = 0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    stackIn_172_0 = 4;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (stackIn_172_0 <= var27) {
                        statePc = 197;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var11 = var18[var27] + var8;
                    var10 = var7 + var19[var27];
                    if (var29 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var15 = 1;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (var15 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackIn_172_0 = var11;
                    stackIn_177_0 = stackIn_172_0;
                    if (var29 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (stackIn_177_0 < 0) {
                        statePc = 196;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if ((var11 ^ -1) <= -9) {
                        statePc = 196;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 196;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (8 <= var10) {
                        statePc = 196;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var9 = var11 * 8 + var10;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 == (var12 ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var5 != var13) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var29 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var15 = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    this.a(-1, var9, param1);
                    var10 = var10 + var19[var27];
                    var11 = var11 + var18[var27];
                    if (var29 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (var29 == 0) {
                        statePc = 340;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var27 = 0;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    stackIn_200_0 = var27 ^ -1;
                    stackIn_200_1 = -5;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (stackIn_200_0 <= stackIn_200_1) {
                        statePc = 226;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var15 = 1;
                    stackIn_227_0 = var17[var27];
                    stackIn_202_0 = stackIn_227_0;
                    if (var29 != 0) {
                        statePc = 227;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var28 = stackIn_202_0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (var28 < 0) {
                        statePc = 225;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    stackIn_200_0 = var28 ^ -1;
                    stackIn_205_0 = stackIn_200_0;
                    stackIn_200_1 = -9;
                    stackIn_205_1 = stackIn_200_1;
                    if (var29 != 0) {
                        statePc = 200;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (stackIn_205_0 <= stackIn_205_1) {
                        statePc = 225;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (var15 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (0 == var27) {
                        statePc = 215;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (var27 != 2) {
                        statePc = 216;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var9 = var7 + var28 * 8;
                    if (var29 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var9 = 8 * var8 + var28;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if ((this.field_m ^ -1) == (var9 ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var12 = this.field_f[var9];
                    var13 = 16773120 & var12;
                    var14 = var12 & -16773121;
                    if (var12 != 0) {
                        statePc = 221;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if ((var5 ^ -1) == (var13 ^ -1)) {
                        statePc = 225;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var15 = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    this.a(-1, var9, param1);
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    var28 = var28 + var16[var27];
                    if (var29 == 0) {
                        statePc = 203;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 199;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    stackIn_227_0 = 0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    var27 = stackIn_227_0;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    stackIn_229_0 = var27 ^ -1;
                    stackIn_229_1 = -5;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (stackIn_229_0 <= stackIn_229_1) {
                        statePc = 251;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var10 = var19[var27] + var7;
                    var11 = var18[var27] + var8;
                    if (var29 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var15 = 1;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (var15 == 0) {
                        statePc = 250;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    stackIn_229_0 = var11 ^ -1;
                    stackIn_234_0 = stackIn_229_0;
                    stackIn_229_1 = -1;
                    stackIn_234_1 = stackIn_229_1;
                    if (var29 != 0) {
                        statePc = 229;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (stackIn_234_0 > stackIn_234_1) {
                        statePc = 250;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (var11 >= 8) {
                        statePc = 250;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 250;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (-9 >= (var10 ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var9 = 8 * var11 + var10;
                    var12 = this.field_f[var9];
                    var14 = var12 & -16773121;
                    var13 = var12 & 16773120;
                    if (0 != var12) {
                        statePc = 247;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (var13 == var5) {
                        statePc = 250;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var15 = 0;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    this.a(-1, var9, param1);
                    var10 = var10 + var19[var27];
                    var11 = var11 + var18[var27];
                    if (var29 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 228;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (var29 == 0) {
                        statePc = 340;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var26 = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
                    var25 = new int[]{1, 1, 1, 0, -1, -1, -1, 0};
                    var27 = 0;
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if (var27 >= 8) {
                        statePc = 274;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var10 = var26[var27] + var7;
                    var11 = var25[var27] + var8;
                    stackIn_275_0 = var11;
                    stackIn_255_0 = stackIn_275_0;
                    if (var29 != 0) {
                        statePc = 275;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (stackIn_255_0 < 0) {
                        statePc = 273;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (var11 >= 8) {
                        statePc = 273;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (var10 < 0) {
                        statePc = 273;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (var10 >= 8) {
                        statePc = 273;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var9 = var10 + var11 * 8;
                    var12 = this.field_f[var9];
                    var14 = var12 & -16773121;
                    var13 = 16773120 & var12;
                    if (var14 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (var13 == var5) {
                        statePc = 273;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    this.a(-1, var9, param1);
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    stackIn_275_0 = 4096;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    if (stackIn_275_0 != var5) {
                        statePc = 306;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (!param1) {
                        statePc = 306;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if (!this.e(4096, 52)) {
                        statePc = 284;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (!this.field_n[3]) {
                        statePc = 297;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (this.field_d[-1 + this.field_m]) {
                        statePc = 290;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (this.field_f[this.field_m + -2] != 0) {
                        statePc = 297;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (0 == this.field_f[this.field_m - 3]) {
                        statePc = 296;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 296: {
                    this.a(param2 + 0, -2 + this.field_m, param1);
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    if (!this.field_n[2]) {
                        statePc = 306;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (this.field_d[this.field_m + 1]) {
                        statePc = 303;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if ((this.field_f[this.field_m + 2] ^ -1) != -1) {
                        statePc = 306;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    this.a(-1, 2 + this.field_m, param1);
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (0 != var5) {
                        statePc = 340;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (!param1) {
                        statePc = 340;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (!this.e(0, 82)) {
                        statePc = 315;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (!this.field_n[1]) {
                        statePc = 328;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (this.field_d[-1 + this.field_m]) {
                        statePc = 321;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 321: {
                    if (-1 != (this.field_f[this.field_m + -2] ^ -1)) {
                        statePc = 328;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (-1 == (this.field_f[this.field_m - 3] ^ -1)) {
                        statePc = 327;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 327: {
                    this.a(-1, this.field_m + -2, param1);
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (!this.field_n[0]) {
                        statePc = 340;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (this.field_d[this.field_m + 1]) {
                        statePc = 334;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if ((this.field_f[this.field_m - -2] ^ -1) == -1) {
                        statePc = 337;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 337: {
                    this.a(-1, 2 + this.field_m, param1);
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.a(94, -75, 79, -71);
                break L1;
              }
            }
            L2: {
              var4_int = this.field_m;
              if (var4_int < 0) {
                break L2;
              } else {
                if (-65 >= (var4_int ^ -1)) {
                  break L2;
                } else {
                  if ((param1 ^ -1) > -1) {
                    break L2;
                  } else {
                    if ((param1 ^ -1) <= -65) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (!param2) {
                            break L4;
                          } else {
                            L5: {
                              var5 = 16773120 & this.field_f[var4_int];
                              var6 = this.field_f[param1];
                              this.field_f[param1] = this.field_f[var4_int];
                              this.field_f[var4_int] = 0;
                              var7 = this.e(var5, param0 + 105) ? 1 : 0;
                              this.field_f[var4_int] = this.field_f[param1];
                              this.field_f[param1] = var6;
                              stackIn_20_0 = this.field_d;

                              stackIn_20_1 = param1;

                              if (var7 != 0) {
                                stackIn_21_0 = (boolean[]) ((Object) stackIn_20_0);
                                stackIn_21_1 = stackIn_20_1;
                                stackIn_21_2 = 0;
                                break L5;
                              } else {
                                stackIn_21_0 = (boolean[]) ((Object) stackIn_20_0);
                                stackIn_21_1 = stackIn_20_1;
                                stackIn_21_2 = 1;
                                break L5;
                              }
                            }
                            stackIn_21_0[stackIn_21_1] = stackIn_21_2 != 0;
                            if (Chess.field_G == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        this.field_d[param1] = true;
                        break L3;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "uk.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        byte[] stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 != (param1 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var3_int = 16773120 & param1;
                        var4 = param1 & -16773121;
                        if ((var3_int ^ -1) == -4097) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_7_0 = this.field_i;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = this.field_g;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = stackIn_7_0;
                        var6 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5[var6] == 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6++;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0 == 3) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.a(-43, 1, false);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5[var6] = (byte)var4;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fk.a((Throwable) ((Object) runtimeException), "uk.QA(" + param0 + ',' + param1 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_m = param2;
              this.field_d = param1;
              if (param0 == 2) {
                break L1;
              } else {
                uk.a(true, 82);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("uk.KA(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -105) {
              L1: {
                if (this.e(param1, 97)) {
                  break L1;
                } else {
                  if (this.c(param1, -105)) {
                    break L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.OA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 9550) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = this.field_f[param0];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.NA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean c(int param0, int param1) {
        int var3_int = 0;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        RuntimeException var3 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              var3_int = this.field_m;
              var4 = new boolean[this.field_d.length];
              ne.a(this.field_d, 0, var4, 0, var4.length);
              var5 = 63;
              if (param1 <= -103) {
                break L1;
              } else {
                uk.c(-10);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (-1 < (var5 ^ -1)) {
                    break L4;
                  } else {
                    stackOut_5_0 = this.a(param0, var5, (byte) -12);
                    stackIn_14_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0) {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var5--;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.a(2, var4, var3_int);
                stackIn_14_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.MA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 > this.field_m) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((this.field_m ^ -1) > -65) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var2_int = this.field_f[this.field_m];
                        var3 = 16773120 & var2_int;
                        var4 = var2_int & -16773121;
                        var5 = this.field_m % 8;
                        var6 = this.field_m / param0;
                        if ((var4 ^ -1) != -2) {
                            statePc = 53;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 != var3) {
                            statePc = 31;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 != 6) {
                            statePc = 31;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = -1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7 > 1) {
                            statePc = 30;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = var6 - -1;
                        var9 = var5 + var7;
                        stackIn_54_0 = 0;
                        stackIn_17_0 = stackIn_54_0;
                        if (var11 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 > var9) {
                            statePc = 29;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (8 > var9) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var11 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10 = var8 * 8 + var9;
                        if (!this.field_d[var10]) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 29: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var11 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-4097 != (var3 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var6 ^ -1) != -2) {
                            statePc = 53;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7 = -1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-2 > (var7 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8 = -1 + var6;
                        var9 = var5 + var7;
                        stackIn_54_0 = var9 ^ -1;
                        stackIn_40_0 = stackIn_54_0;
                        if (var11 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 > -1) {
                            statePc = 52;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var9 < 8) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var11 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var10 = var8 * 8 + var9;
                        if (!this.field_d[var10]) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return stackIn_51_0 != 0;
                }
                case 52: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    return stackIn_54_0 != 0;
                }
                case 55: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fk.a((Throwable) ((Object) var2), "uk.UA(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            if (param0 < -89) {
              var2_int = 0;
              if (this.field_h.length != 0) {
                L1: while (true) {
                  L2: {
                    if ((var2_int ^ -1) <= (this.field_h.length ^ -1)) {
                      break L2;
                    } else {
                      if (null == this.field_h[var2_int]) {
                        break L2;
                      } else {
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackIn_13_0 = var2_int;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = -120;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "uk.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 61) {
                break L1;
              } else {
                uk.a(true, -111);
                break L1;
              }
            }
            L2: {
              if (!this.e(param1, 97)) {
                break L2;
              } else {
                if (this.c(param1, -111)) {
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_10_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.TA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    uk() {
        this.field_b = -1;
        this.field_i = new byte[16];
        this.field_l = -1;
        this.field_k = -1;
        this.field_n = new boolean[]{true, true, true, true};
        this.field_g = new byte[16];
        this.field_f = new int[df.field_i.length];
        this.field_m = -1;
        this.field_d = new boolean[64];
        this.field_j = -1;
        this.field_o = 0;
        this.field_h = new oj[]{};
        try {
            ne.a(df.field_i, 0, this.field_f, 0, df.field_i.length);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "uk.<init>()");
        }
    }

    static {
        field_e = false;
    }
}
