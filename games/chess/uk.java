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
        int var4 = 0;
        qk.field_h = param3;
        pg.field_s = param0;
        nc.field_T = 0;
        if (param2 != 28333) {
            uk.c(-83);
        }
        if (!(qk.field_h != 0)) {
            pg.field_s = qk.field_h;
            ma.field_D = false;
        }
        if (!(!da.a(qk.field_h, true))) {
            var4 = 0;
            ae.field_e[qk.field_h].a((byte) 123, param1, var4);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        oj[] var5 = null;
        if (this.field_h.length <= this.field_o) {
            var5 = new oj[this.field_o + 8];
            ne.a(this.field_h, 0, var5, 0, this.field_h.length);
            this.field_h = var5;
        }
        this.field_h[this.field_o] = new oj(param2, param0, param3);
        this.field_o = this.field_o + 1;
        if (param1 != 0) {
            this.d(-125, 44);
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_e = true;
        }
        field_c = null;
    }

    final int b(int param0) {
        if (param0 != 0) {
            this.field_j = 58;
        }
        return this.field_m;
    }

    final static void a(boolean param0, int param1) {
        rn.field_a = param1;
        if (param0) {
            uk.a(83, false, 26, 15);
        }
    }

    final void a(un param0, p param1, boolean param2) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
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
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new RuntimeException("Version number too recent");
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (var4_int == 0) {
                            statePc = 20;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var4_int ^ -1) != -2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw new RuntimeException("Version number too old");
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4_int == 2) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-4 != (var4_int ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = param1.c(param2);
                        var6 = param1.d((byte) 118);
                        var8 = param1.d((byte) 118);
                        var10 = param1.g(0);
                        if (param0 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param0.field_e = (int)(50L * (var6 / 1000L));
                        param0.field_B.field_f = var10;
                        param0.field_v = (int)(var8 / 1000L * 50L);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var11 >= var5) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = param1.i(-123);
                        var13 = param1.i(-103);
                        var14 = param1.i(-97);
                        this.a((byte) 19, var14, var12, var13);
                        var11++;
                        if (var15 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var15 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var15 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw new RuntimeException("Version number too old");
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw new RuntimeException("Version number too old");
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("uk.IA(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw fk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[] var11 = null;
        boolean[] var12 = null;
        boolean stackIn_9_0 = false;
        int stackIn_14_0 = 0;
        boolean stackOut_8_0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Chess.field_G;
                    var4 = this.field_m;
                    if (param2 == -12) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return true;
                }
                case 2: {
                    var12 = new boolean[this.field_d.length];
                    var11 = var12;
                    var5 = var11;
                    ne.a(this.field_d, 0, var5, 0, var12.length);
                    var6 = this.field_f[param1];
                    if (var6 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var7 = var6 & 16773120;
                    if (param0 == var7) {
                        statePc = 6;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(param1, true, -1);
                    var8 = 0;
                    var9 = 63;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var9 ^ -1) > -1) {
                        statePc = 13;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = this.field_d[var9];
                    stackIn_14_0 = stackOut_8_0 ? 1 : 0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var10 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (!stackIn_9_0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var8 = 1;
                    if (var10 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9--;
                    if (var10 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = var8;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.a(2, var12, var4);
                    return true;
                }
                case 17: {
                    this.a(2, var12, var4);
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean e(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean[] var12 = null;
        boolean[] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Chess.field_G;
                    var3 = -1;
                    var4 = 63;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 < (var4 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5_int = this.field_f[var4];
                    stackIn_12_0 = 0;
                    stackIn_3_0 = stackIn_12_0;
                    stackIn_12_1 = var5_int;
                    stackIn_3_1 = stackIn_12_1;
                    if (var11 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = 16773120 & var5_int;
                    var7 = -16773121 & var5_int;
                    if (param0 != var6) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (6 == var7) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = var4;
                    if (var11 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4--;
                    if (var11 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = var3;
                    stackIn_12_1 = -1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((stackIn_12_0 ^ stackIn_12_1) != 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return true;
                }
                case 14: {
                    var4 = this.field_m;
                    if (param1 >= 49) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return true;
                }
                case 16: {
                    var13 = new boolean[this.field_d.length];
                    var12 = var13;
                    var5 = var12;
                    ne.a(this.field_d, 0, var5, 0, var13.length);
                    var6 = 0;
                    var7 = 63;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((var7 ^ -1) <= -1) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.a(2, var13, var4);
                    return var6 != 0;
                }
                case 19: {
                    stackIn_21_0 = var6;
                    stackIn_20_0 = stackIn_21_0;
                    if (var11 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    if (stackIn_21_0 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var8 = this.field_f[var7];
                    if (-1 != (var8 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var9 = 16773120 & var8;
                    if (param0 != var9) {
                        statePc = 26;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.a(var7, false, -1);
                    var10 = this.field_d[var3] ? 1 : 0;
                    if (var10 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var6 = 1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var7--;
                    if (var11 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.a(2, var13, var4);
                    return var6 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var17 = Chess.field_G;
        var5 = this.field_f[param2];
        var6 = 16773120 & var5;
        var7 = var5 & -16773121;
        var8 = param2 / 8;
        var9 = param2 % 8;
        var10 = param3 / 8;
        var11 = param3 % 8;
        var12 = var9 + -var11;
        var13 = this.field_f[param3];
        if (param0 == 19) {
          L0: {
            L1: {
              var14 = var13 & 16773120;
              if (var7 == 1) {
                break L1;
              } else {
                if (var13 != 0) {
                  break L1;
                } else {
                  if (var6 != 0) {
                    if ((var6 ^ -1) != -4097) {
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (var6 == 0) {
              break L0;
            } else {
              if (var6 != 4096) {
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var15 = -16773121 & var13;
            if ((var15 ^ -1) == -5) {
              L3: {
                if (var14 == 4096) {
                  break L3;
                } else {
                  L4: {
                    if (7 != var11) {
                      break L4;
                    } else {
                      this.field_n[0] = false;
                      break L4;
                    }
                  }
                  if (var11 != 0) {
                    break L2;
                  } else {
                    this.field_n[1] = false;
                    if (var17 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (var11 == 0) {
                  this.field_n[3] = false;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var11 == 7) {
                this.field_n[2] = false;
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          L6: {
            if (-4097 != (var6 ^ -1)) {
              break L6;
            } else {
              L7: {
                this.field_k = -1;
                if ((var7 ^ -1) == -2) {
                  L8: {
                    if (-7 != (var8 ^ -1)) {
                      break L8;
                    } else {
                      if (var10 == 4) {
                        this.field_l = var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var10 != 0) {
                      break L9;
                    } else {
                      var5 = var6 | param1;
                      break L9;
                    }
                  }
                  if (this.field_b == param3) {
                    var16 = 8 + param3;
                    var13 = this.field_f[var16];
                    this.field_f[var16] = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L10: {
                if (-5 != (var7 ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    if (var9 != 0) {
                      break L11;
                    } else {
                      this.field_n[3] = false;
                      break L11;
                    }
                  }
                  if (-8 != (var9 ^ -1)) {
                    break L10;
                  } else {
                    this.field_n[2] = false;
                    break L10;
                  }
                }
              }
              if (var7 != 6) {
                break L6;
              } else {
                L12: {
                  this.field_n[2] = false;
                  this.field_n[3] = false;
                  if ((var12 ^ -1) != -3) {
                    break L12;
                  } else {
                    this.field_f[(param2 - -param3) / 2] = this.field_f[56];
                    this.field_f[56] = 0;
                    if (var17 == 0) {
                      break L6;
                    } else {
                      break L12;
                    }
                  }
                }
                if ((var12 ^ -1) == 1) {
                  this.field_f[(param2 - -param3) / 2] = this.field_f[63];
                  this.field_f[63] = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
          }
          L13: {
            if (0 == var6) {
              L14: {
                this.field_l = -1;
                if ((var7 ^ -1) != -2) {
                  break L14;
                } else {
                  L15: {
                    if (7 == var10) {
                      var5 = param1 | var6;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var8 != 1) {
                      break L16;
                    } else {
                      if (var10 != 3) {
                        break L16;
                      } else {
                        this.field_k = var9;
                        break L16;
                      }
                    }
                  }
                  if (this.field_b != param3) {
                    break L14;
                  } else {
                    var16 = param3 + -8;
                    var13 = this.field_f[var16];
                    this.field_f[var16] = 0;
                    break L14;
                  }
                }
              }
              L17: {
                if (4 == var7) {
                  L18: {
                    if (var9 != 7) {
                      break L18;
                    } else {
                      this.field_n[0] = false;
                      break L18;
                    }
                  }
                  if (-1 == (var9 ^ -1)) {
                    this.field_n[1] = false;
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              if (-7 == (var7 ^ -1)) {
                L19: {
                  this.field_n[1] = false;
                  this.field_n[0] = false;
                  if (2 == var12) {
                    break L19;
                  } else {
                    L20: {
                      if (1 != (var12 ^ -1)) {
                        break L20;
                      } else {
                        this.field_f[(param3 + param2) / 2] = this.field_f[7];
                        this.field_f[7] = 0;
                        if (var17 == 0) {
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    this.field_b = -1;
                    this.field_f[param3] = var5;
                    this.field_f[param2] = 0;
                    this.d(3, var13);
                    this.a(param3, 0, param2, param1);
                    this.a(-1, false, -1);
                    t.field_Q = true;
                    break L13;
                  }
                }
                this.field_f[(param2 - -param3) / 2] = this.field_f[0];
                this.field_f[0] = 0;
                this.field_b = -1;
                this.field_f[param3] = var5;
                this.field_f[param2] = 0;
                this.d(3, var13);
                this.a(param3, 0, param2, param1);
                this.a(-1, false, -1);
                t.field_Q = true;
                break L13;
              } else {
                this.field_b = -1;
                this.field_f[param3] = var5;
                this.field_f[param2] = 0;
                this.d(3, var13);
                this.a(param3, 0, param2, param1);
                this.a(-1, false, -1);
                t.field_Q = true;
                break L13;
              }
            } else {
              this.field_b = -1;
              this.field_f[param3] = var5;
              this.field_f[param2] = 0;
              this.d(3, var13);
              this.a(param3, 0, param2, param1);
              this.a(-1, false, -1);
              t.field_Q = true;
              break L13;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_265_0 = 0;
        int stackIn_265_1 = 0;
        int stackIn_268_0 = 0;
        int stackIn_268_1 = 0;
        int stackIn_276_0 = 0;
        int stackIn_276_1 = 0;
        int stackIn_306_0 = 0;
        int stackIn_306_1 = 0;
        int stackIn_309_0 = 0;
        int stackIn_309_1 = 0;
        int stackIn_317_0 = 0;
        int stackIn_317_1 = 0;
        int stackIn_347_0 = 0;
        int stackIn_347_1 = 0;
        int stackIn_350_0 = 0;
        int stackIn_350_1 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int statePc = 0;
        int var4 = 0;
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
                    var4 = -1 + this.field_d.length;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (0 > var4) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_d[var4] = false;
                    var4--;
                    if (var29 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var29 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_m = param0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_m >= 0) {
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
                    if (this.field_m > this.field_f.length) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    var4 = this.field_f[this.field_m];
                    if (-1 == (var4 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    var5 = var4 & 16773120;
                    var6 = -16773121 & var4;
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
                        statePc = 24;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (4 == var27) {
                        statePc = 89;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var27 == 2) {
                        statePc = 116;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-4 == (var27 ^ -1)) {
                        statePc = 129;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var27 != 5) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var29 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var27 ^ -1) != -7) {
                        statePc = 236;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var29 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var5 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = -1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = 1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var22 = stackIn_27_0;
                    var11 = var8 + var22;
                    var23 = 1;
                    var27 = -1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (-2 > (var27 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var10 = var7 - -var27;
                    stackIn_67_0 = -1;
                    stackIn_30_0 = stackIn_67_0;
                    stackIn_67_1 = var10 ^ -1;
                    stackIn_30_1 = stackIn_67_1;
                    if (var29 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 < stackIn_30_1) {
                        statePc = 40;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var10 >= 8) {
                        statePc = 40;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var9 = var10 - -(var11 * 8);
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (var27 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (-1 == (var12 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var13 == var5) {
                        statePc = 40;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.a(-1, var9, param1);
                    if (var29 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (0 == var12) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var23 = 0;
                    if (var29 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var23 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var24 = -1;
                    if (0 != var5) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var24 = this.field_l;
                    if (var29 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var24 = this.field_k;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-1 == var24) {
                        statePc = 236;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var27 = var7 + -var24;
                    if (1 == var27) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var27 == -1) {
                        statePc = 49;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var5 != 4096) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (3 != var8) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var11 = var8 - 1;
                    var9 = 8 * var11 + var24;
                    this.field_b = var9;
                    this.a(param2 + 0, var9, param1);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var5 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (4 != var8) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var11 = var8 + 1;
                    var9 = var11 * 8 + var24;
                    this.field_b = var9;
                    this.a(-1, var9, param1);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var29 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var27 = 0;
                    stackIn_57_0 = 4;
                    stackIn_57_1 = var27;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0 <= stackIn_57_1) {
                        statePc = 115;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var28 = var17[var27];
                    if (0 > var28) {
                        statePc = 351;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_57_0 = var28 ^ -1;
                    stackIn_61_0 = stackIn_57_0;
                    stackIn_57_1 = -9;
                    stackIn_61_1 = stackIn_57_1;
                    if (var29 != 0) {
                        statePc = 57;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 <= stackIn_61_1) {
                        statePc = 351;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var15 == 0) {
                        statePc = 351;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var27 == 0) {
                        statePc = 300;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (2 != var27) {
                        statePc = 241;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = var8;
                    stackIn_67_1 = 1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 != stackIn_67_1) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var5 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if ((var8 ^ -1) != -7) {
                        statePc = 75;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (4096 != var5) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var11 = 2 * var22 + var8;
                    var9 = var11 * 8 + var7;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (0 != var12) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    this.a(param2 ^ 0, var9, param1);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var24 = -1;
                    if (0 != var5) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var24 = this.field_l;
                    if (var29 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var24 = this.field_k;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (-1 == var24) {
                        statePc = 236;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var27 = var7 + -var24;
                    if (1 == var27) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var27 == -1) {
                        statePc = 82;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var5 != 4096) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (3 != var8) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var11 = var8 - 1;
                    var9 = 8 * var11 + var24;
                    this.field_b = var9;
                    this.a(param2 + 0, var9, param1);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var5 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (4 != var8) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var11 = var8 + 1;
                    var9 = var11 * 8 + var24;
                    this.field_b = var9;
                    this.a(-1, var9, param1);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var29 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var27 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    stackIn_91_0 = 4;
                    stackIn_91_1 = var27;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 <= stackIn_91_1) {
                        statePc = 115;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var28 = var17[var27];
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (0 > var28) {
                        statePc = 114;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_91_0 = var28 ^ -1;
                    stackIn_96_0 = stackIn_91_0;
                    stackIn_91_1 = -9;
                    stackIn_96_1 = stackIn_91_1;
                    if (var29 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (stackIn_96_0 <= stackIn_96_1) {
                        statePc = 114;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var15 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var27 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (2 != var27) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var9 = var28 + 8 * var8;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (var9 != this.field_m) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (var29 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var13 != var5) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var29 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var15 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var28 = var28 + var16[var27];
                    if (var29 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var29 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var27 = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (8 <= var27) {
                        statePc = 128;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var11 = var20[var27] + var8;
                    var10 = var7 + var21[var27];
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if ((var11 ^ -1) > -1) {
                        statePc = 127;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (8 <= var11) {
                        statePc = 127;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 127;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (8 <= var10) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var9 = 8 * var11 + var10;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (var14 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (var5 != var13) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var29 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var27 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = 4;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0 <= var27) {
                        statePc = 147;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var11 = var18[var27] + var8;
                    var10 = var7 + var19[var27];
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var15 = 1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (var15 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackIn_131_0 = var11;
                    stackIn_136_0 = stackIn_131_0;
                    if (var29 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (stackIn_136_0 < 0) {
                        statePc = 146;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if ((var11 ^ -1) <= -9) {
                        statePc = 146;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 146;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (8 <= var10) {
                        statePc = 146;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var9 = var11 * 8 + var10;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 == (var12 ^ -1)) {
                        statePc = 145;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (var5 != var13) {
                        statePc = 144;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (var29 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var15 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    this.a(-1, var9, param1);
                    var10 = var10 + var19[var27];
                    var11 = var11 + var18[var27];
                    if (var29 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var29 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var27 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    stackIn_150_0 = var27 ^ -1;
                    stackIn_150_1 = -5;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (stackIn_150_0 <= stackIn_150_1) {
                        statePc = 170;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var15 = 1;
                    stackIn_171_0 = var17[var27];
                    stackIn_152_0 = stackIn_171_0;
                    if (var29 != 0) {
                        statePc = 171;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var28 = stackIn_152_0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var28 < 0) {
                        statePc = 169;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_150_0 = var28 ^ -1;
                    stackIn_155_0 = stackIn_150_0;
                    stackIn_150_1 = -9;
                    stackIn_155_1 = stackIn_150_1;
                    if (var29 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (stackIn_155_0 <= stackIn_155_1) {
                        statePc = 169;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (var15 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (0 == var27) {
                        statePc = 160;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (var27 != 2) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var9 = var7 + var28 * 8;
                    if (var29 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var9 = 8 * var8 + var28;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (this.field_m == var9) {
                        statePc = 168;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var12 = this.field_f[var9];
                    var13 = 16773120 & var12;
                    var14 = var12 & -16773121;
                    if (var12 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (var5 == var13) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var15 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    this.a(-1, var9, param1);
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var28 = var28 + var16[var27];
                    if (var29 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackIn_171_0 = 0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    var27 = stackIn_171_0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = var27 ^ -1;
                    stackIn_173_1 = -5;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 <= stackIn_173_1) {
                        statePc = 188;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var10 = var19[var27] + var7;
                    var11 = var18[var27] + var8;
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var15 = 1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (var15 == 0) {
                        statePc = 187;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    stackIn_173_0 = var11 ^ -1;
                    stackIn_178_0 = stackIn_173_0;
                    stackIn_173_1 = -1;
                    stackIn_178_1 = stackIn_173_1;
                    if (var29 != 0) {
                        statePc = 173;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (stackIn_178_0 > stackIn_178_1) {
                        statePc = 187;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (var11 >= 8) {
                        statePc = 187;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 187;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (-9 >= (var10 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var9 = 8 * var11 + var10;
                    var12 = this.field_f[var9];
                    var14 = var12 & -16773121;
                    var13 = var12 & 16773120;
                    if (0 != var12) {
                        statePc = 184;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (var13 == var5) {
                        statePc = 187;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var15 = 0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    this.a(-1, var9, param1);
                    var10 = var10 + var19[var27];
                    var11 = var11 + var18[var27];
                    if (var29 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var29 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var26 = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
                    var25 = new int[]{1, 1, 1, 0, -1, -1, -1, 0};
                    var27 = 0;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (var27 >= 8) {
                        statePc = 201;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var10 = var26[var27] + var7;
                    var11 = var25[var27] + var8;
                    stackIn_202_0 = var11;
                    stackIn_192_0 = stackIn_202_0;
                    if (var29 != 0) {
                        statePc = 202;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (stackIn_192_0 < 0) {
                        statePc = 200;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var11 >= 8) {
                        statePc = 200;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (var10 < 0) {
                        statePc = 200;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (var10 >= 8) {
                        statePc = 200;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var9 = var10 + var11 * 8;
                    var12 = this.field_f[var9];
                    var14 = var12 & -16773121;
                    var13 = 16773120 & var12;
                    if (var14 == 0) {
                        statePc = 199;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (var13 == var5) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    this.a(-1, var9, param1);
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 190;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    stackIn_202_0 = 4096;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (stackIn_202_0 != var5) {
                        statePc = 218;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (!param1) {
                        statePc = 218;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (!this.e(4096, 52)) {
                        statePc = 206;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (!this.field_n[3]) {
                        statePc = 213;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (this.field_d[-1 + this.field_m]) {
                        statePc = 209;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (this.field_f[this.field_m + -2] != 0) {
                        statePc = 213;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (0 == this.field_f[this.field_m - 3]) {
                        statePc = 212;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 212: {
                    this.a(param2 + 0, -2 + this.field_m, param1);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (!this.field_n[2]) {
                        statePc = 218;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (this.field_d[this.field_m + 1]) {
                        statePc = 216;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (this.field_f[this.field_m + 2] != 0) {
                        statePc = 218;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    this.a(-1, 2 + this.field_m, param1);
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    if (0 != var5) {
                        statePc = 236;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (!param1) {
                        statePc = 236;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (!this.e(0, 82)) {
                        statePc = 222;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (!this.field_n[1]) {
                        statePc = 229;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (this.field_d[-1 + this.field_m]) {
                        statePc = 225;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (-1 != (this.field_f[this.field_m + -2] ^ -1)) {
                        statePc = 229;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (-1 == (this.field_f[this.field_m - 3] ^ -1)) {
                        statePc = 228;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 228: {
                    this.a(-1, this.field_m + -2, param1);
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (!this.field_n[0]) {
                        statePc = 236;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (this.field_d[this.field_m + 1]) {
                        statePc = 232;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (this.field_f[this.field_m - -2] == 0) {
                        statePc = 234;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 234: {
                    this.a(-1, 2 + this.field_m, param1);
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    return;
                }
                case 239: {
                    if (2 != var27) {
                        statePc = 241;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 241: {
                    var9 = var28 + 8 * var8;
                    statePc = 257;
                    continue stateLoop;
                }
                case 243: {
                    if (var29 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (var29 == 0) {
                        statePc = 269;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var28 = var28 + var16[var27];
                    if (var29 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 251: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 249;
                    continue stateLoop;
                }
                case 252: {
                    var15 = 0;
                    statePc = 251;
                    continue stateLoop;
                }
                case 253: {
                    if (var13 != var5) {
                        statePc = 252;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 253;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (var9 != this.field_m) {
                        statePc = 255;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 257;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (var27 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (var15 == 0) {
                        statePc = 269;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (stackIn_265_0 <= stackIn_265_1) {
                        statePc = 269;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 267: {
                    stackIn_276_0 = var28 ^ -1;
                    stackIn_268_0 = stackIn_276_0;
                    stackIn_276_1 = -9;
                    stackIn_268_1 = stackIn_276_1;
                    if (var29 != 0) {
                        statePc = 276;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    stackIn_265_0 = stackIn_268_0;
                    stackIn_265_1 = stackIn_268_1;
                    statePc = 265;
                    continue stateLoop;
                }
                case 269: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (0 > var28) {
                        statePc = 269;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var28 = var17[var27];
                    statePc = 271;
                    continue stateLoop;
                }
                case 274: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (stackIn_276_0 <= stackIn_276_1) {
                        statePc = 115;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 278: {
                    stackIn_276_0 = 4;
                    stackIn_276_1 = var27;
                    statePc = 276;
                    continue stateLoop;
                }
                case 280: {
                    if (2 != var27) {
                        statePc = 282;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var9 = var28 + 8 * var8;
                    statePc = 298;
                    continue stateLoop;
                }
                case 284: {
                    if (var29 == 0) {
                        statePc = 290;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (var29 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var28 = var28 + var16[var27];
                    if (var29 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 292: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 290;
                    continue stateLoop;
                }
                case 293: {
                    var15 = 0;
                    statePc = 292;
                    continue stateLoop;
                }
                case 294: {
                    if (var13 != var5) {
                        statePc = 293;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 294;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (var9 != this.field_m) {
                        statePc = 296;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 298;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (var27 == 0) {
                        statePc = 300;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (var15 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (stackIn_306_0 <= stackIn_306_1) {
                        statePc = 310;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 308: {
                    stackIn_317_0 = var28 ^ -1;
                    stackIn_309_0 = stackIn_317_0;
                    stackIn_317_1 = -9;
                    stackIn_309_1 = stackIn_317_1;
                    if (var29 != 0) {
                        statePc = 317;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    stackIn_306_0 = stackIn_309_0;
                    stackIn_306_1 = stackIn_309_1;
                    statePc = 306;
                    continue stateLoop;
                }
                case 310: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 319;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (0 > var28) {
                        statePc = 310;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 314: {
                    var28 = var17[var27];
                    statePc = 312;
                    continue stateLoop;
                }
                case 315: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (stackIn_317_0 <= stackIn_317_1) {
                        statePc = 115;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 319: {
                    stackIn_317_0 = 4;
                    stackIn_317_1 = var27;
                    statePc = 317;
                    continue stateLoop;
                }
                case 321: {
                    if (2 != var27) {
                        statePc = 323;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var9 = var28 + 8 * var8;
                    statePc = 339;
                    continue stateLoop;
                }
                case 325: {
                    if (var29 == 0) {
                        statePc = 331;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (var29 == 0) {
                        statePc = 351;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var28 = var28 + var16[var27];
                    if (var29 == 0) {
                        statePc = 353;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 333: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 331;
                    continue stateLoop;
                }
                case 334: {
                    var15 = 0;
                    statePc = 333;
                    continue stateLoop;
                }
                case 335: {
                    if (var13 != var5) {
                        statePc = 334;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 337: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 335;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (var9 != this.field_m) {
                        statePc = 337;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 339;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if (var27 == 0) {
                        statePc = 341;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (var15 == 0) {
                        statePc = 351;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 347: {
                    if (stackIn_347_0 <= stackIn_347_1) {
                        statePc = 351;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 349: {
                    stackIn_358_0 = var28 ^ -1;
                    stackIn_350_0 = stackIn_358_0;
                    stackIn_358_1 = -9;
                    stackIn_350_1 = stackIn_358_1;
                    if (var29 != 0) {
                        statePc = 358;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    stackIn_347_0 = stackIn_350_0;
                    stackIn_347_1 = stackIn_350_1;
                    statePc = 347;
                    continue stateLoop;
                }
                case 351: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 360;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 353: {
                    if (0 > var28) {
                        statePc = 351;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var28 = var17[var27];
                    statePc = 353;
                    continue stateLoop;
                }
                case 356: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (stackIn_358_0 <= stackIn_358_1) {
                        statePc = 115;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 360: {
                    stackIn_358_0 = 4;
                    stackIn_358_1 = var27;
                    statePc = 358;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        boolean[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.a(94, -75, 79, -71);
            break L0;
          }
        }
        var4 = this.field_m;
        if (var4 >= 0) {
          L1: {
            if (-65 >= (var4 ^ -1)) {
              break L1;
            } else {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if ((param1 ^ -1) <= -65) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (!param2) {
                        break L3;
                      } else {
                        L4: {
                          var5 = 16773120 & this.field_f[var4];
                          var6 = this.field_f[param1];
                          this.field_f[param1] = this.field_f[var4];
                          this.field_f[var4] = 0;
                          var7 = this.e(var5, param0 + 105) ? 1 : 0;
                          this.field_f[var4] = this.field_f[param1];
                          this.field_f[param1] = var6;
                          stackIn_12_0 = this.field_d;

                          stackIn_12_1 = param1;

                          if (var7 != 0) {
                            stackIn_13_0 = (boolean[]) ((Object) stackIn_12_0);
                            stackIn_13_1 = stackIn_12_1;
                            stackIn_13_2 = 0;
                            break L4;
                          } else {
                            stackIn_13_0 = (boolean[]) ((Object) stackIn_12_0);
                            stackIn_13_1 = stackIn_12_1;
                            stackIn_13_2 = 1;
                            break L4;
                          }
                        }
                        stackIn_13_0[stackIn_13_1] = stackIn_13_2 != 0;
                        if (Chess.field_G == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_d[param1] = true;
                    break L2;
                  }
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, int param1) {
        byte[] stackIn_4_0 = null;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Chess.field_G;
                    if (-1 == (param1 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = 16773120 & param1;
                    var4 = param1 & -16773121;
                    if ((var3 ^ -1) == -4097) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_4_0 = this.field_i;
                    statePc = 4;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = this.field_g;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var5 = stackIn_4_0;
                    var6 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var5[var6] == 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6++;
                    if (var7 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var7 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param0 == 3) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.a(-43, 1, false);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5[var6] = (byte)var4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean[] param1, int param2) {
        try {
            this.field_m = param2;
            this.field_d = param1;
            if (param0 != 2) {
                uk.a(true, 82);
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "uk.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 < -105) {
          if (!this.e(param1, 97)) {
            if (!this.c(param1, -105)) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 9550) {
            field_a = (String) null;
        }
        return this.field_f[param0];
    }

    private final boolean c(int param0, int param1) {
        int var3;
        boolean[] var4;
        int var5;
        int var6;
        boolean stackIn_6_0 = false;
        L0: {
          var6 = Chess.field_G;
          var3 = this.field_m;
          var4 = new boolean[this.field_d.length];
          ne.a(this.field_d, 0, var4, 0, var4.length);
          var5 = 63;
          if (param1 <= -103) {
            break L0;
          } else {
            uk.c(-10);
            break L0;
          }
        }
        L1: while (true) {
          if (-1 >= (var5 ^ -1)) {
            stackIn_6_0 = this.a(param0, var5, (byte) -12);

            if (var6 == 0) {
              if (stackIn_6_0) {
                return true;
              } else {
                var5--;
                if (var6 == 0) {
                  continue L1;
                } else {
                  this.a(2, var4, var3);
                  return false;
                }
              }
            } else {
              return stackIn_6_0;
            }
          } else {
            this.a(2, var4, var3);
            return false;
          }
        }
    }

    final boolean a(int param0) {
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int statePc = 0;
        int var2 = 0;
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
                    if (0 <= this.field_m) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    if ((this.field_m ^ -1) > -65) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return false;
                }
                case 5: {
                    var2 = this.field_f[this.field_m];
                    var3 = 16773120 & var2;
                    var4 = var2 & -16773121;
                    var5 = this.field_m % 8;
                    var6 = this.field_m / param0;
                    if ((var4 ^ -1) == -2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return false;
                }
                case 7: {
                    if (0 != var3) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var6 != 6) {
                        statePc = 22;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var7 = -1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var7 > 1) {
                        statePc = 20;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var8 = var6 - -1;
                    var9 = var5 + var7;
                    stackIn_13_0 = 0;
                    stackIn_12_0 = stackIn_13_0;
                    if (var11 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    if (stackIn_13_0 > var9) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (8 > var9) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var11 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = var8 * 8 + var9;
                    if (!this.field_d[var10]) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return true;
                }
                case 19: {
                    var7++;
                    if (var11 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var11 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return false;
                }
                case 22: {
                    if (-4097 == (var3 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return false;
                }
                case 24: {
                    if ((var6 ^ -1) == -2) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return false;
                }
                case 26: {
                    var7 = -1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (-2 <= (var7 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return false;
                }
                case 29: {
                    var8 = -1 + var6;
                    var9 = var5 + var7;
                    stackIn_31_0 = var9 ^ -1;
                    stackIn_30_0 = stackIn_31_0;
                    if (var11 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    if (stackIn_31_0 > -1) {
                        statePc = 37;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var9 < 8) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var11 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var10 = var8 * 8 + var9;
                    if (!this.field_d[var10]) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return true;
                }
                case 37: {
                    var7++;
                    if (var11 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        if (param0 < -89) {
          var2 = 0;
          if (this.field_h.length == 0) {
            return -1;
          } else {
            L0: while (true) {
              L1: {
                if (var2 >= this.field_h.length) {
                  break L1;
                } else {
                  if (null == this.field_h[var2]) {
                    break L1;
                  } else {
                    var2++;
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return -120;
        }
    }

    final boolean a(byte param0, int param1) {
        L0: {
          if (param0 == 61) {
            break L0;
          } else {
            uk.a(true, -111);
            break L0;
          }
        }
        if (this.e(param1, 97)) {
          if (!this.c(param1, -111)) {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
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
        ne.a(df.field_i, 0, this.field_f, 0, df.field_i.length);
    }

    static {
        field_e = false;
    }
}
