/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends w {
    static byte[][] field_Nb;
    private w field_Vb;
    static w field_Ub;
    private w[] field_Rb;
    static ck field_Tb;
    static String field_Qb;
    int field_Pb;
    private w[] field_Sb;
    static w field_Ob;

    final void b(boolean param0) {
        w dupTemp$2 = null;
        w dupTemp$3 = null;
        int var2;
        int var3;
        int stackIn_9_0 = 0;
        var3 = client.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_Rb.length <= var2) {
                break L2;
              } else {
                stackIn_9_0 = var2 ^ -1;

                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_9_0 == (this.field_Pb ^ -1)) {
                      break L3;
                    } else {
                      if (0 != this.field_Rb[var2].field_ob) {
                        this.field_Rb[this.field_Pb].field_ab = false;
                        dupTemp$2 = this.field_Sb[this.field_Pb];
                        dupTemp$2.field_vb = dupTemp$2.field_vb + 10000;
                        this.field_Pb = var2;
                        this.field_Rb[var2].field_ab = true;
                        dupTemp$3 = this.field_Sb[var2];
                        dupTemp$3.field_vb = dupTemp$3.field_vb - 10000;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_9_0 = param0 ? 1 : 0;
            break L1;
          }
          if (stackIn_9_0 != 0) {
            this.a(-26, true, -12);
            return;
          } else {
            return;
          }
        }
    }

    public static void h(byte param0) {
        if (param0 <= 83) {
            return;
        }
        field_Nb = (byte[][]) null;
        field_Ob = null;
        field_Tb = null;
        field_Qb = null;
        field_Ub = null;
    }

    tc(long param0, w param1, String[] param2, w param3, w[] param4, int param5) {
        super(param0, (w) null);
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        w var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_Rb = new w[param2.length];
                        this.field_Vb = new w(0L, param3);
                        this.field_Sb = param4;
                        var8_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2.length <= var8_int) {
                            statePc = 5;
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
                        var9 = new w(0L, param1);
                        var9.field_Y = param2[var8_int];
                        this.field_Rb[var8_int] = var9;
                        this.a(var9, -16834);
                        var8_int++;
                        if (var10 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(this.field_Vb, -16834);
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
                        var8_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8_int >= param4.length) {
                            statePc = 10;
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
                        this.field_Vb.a(param4[var8_int], -16834);
                        var8_int++;
                        if (var10 != 0) {
                            statePc = 25;
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
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_Pb = param5;
                        this.field_Rb[param5].field_ab = true;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var8);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("tc.<init>(").append(param0).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param1 == null) {
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
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param2 == null) {
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
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param3 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param4 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        w dupTemp$1 = null;
        w dupTemp$2 = null;
        w dupTemp$3 = null;
        w dupTemp$4 = null;
        w dupTemp$5 = null;
        w dupTemp$6 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    if (param1) {
                        statePc = 36;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(-2, -35, 12, -28, 52, 1, -110);
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 >= this.field_Rb.length) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = var4 * this.field_mb / this.field_Rb.length;
                    var6 = this.field_mb * (var4 - -1) / this.field_Rb.length;
                    this.field_Rb[var4].field_vb = var5;
                    this.field_Rb[var4].field_Ib = 0;
                    this.field_Rb[var4].field_mb = var6 + -var5;
                    this.field_Rb[var4].field_N = param2;
                    var4++;
                    if (var7 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var4 < this.field_Sb.length) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (var4 == this.field_Pb) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    dupTemp$1 = this.field_Sb[var4];
                    dupTemp$1.field_vb = dupTemp$1.field_vb + 10000;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 14: {
                    if (var7 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
                    var4 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var4 < this.field_Sb.length) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    if (var4 == this.field_Pb) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    dupTemp$2 = this.field_Sb[var4];
                    dupTemp$2.field_vb = dupTemp$2.field_vb + 10000;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 26: {
                    this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
                    var4 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var4 < this.field_Sb.length) {
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
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
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
                    if (var4 == this.field_Pb) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    dupTemp$3 = this.field_Sb[var4];
                    dupTemp$3.field_vb = dupTemp$3.field_vb + 10000;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                case 36: {
                    var4 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var4 >= this.field_Rb.length) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var5 = var4 * this.field_mb / this.field_Rb.length;
                    var6 = this.field_mb * (var4 - -1) / this.field_Rb.length;
                    this.field_Rb[var4].field_vb = var5;
                    this.field_Rb[var4].field_Ib = 0;
                    this.field_Rb[var4].field_mb = var6 + -var5;
                    this.field_Rb[var4].field_N = param2;
                    var4++;
                    if (var7 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var7 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
                    var4 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var4 < this.field_Sb.length) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    return;
                }
                case 44: {
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                case 46: {
                    if (var4 == this.field_Pb) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    dupTemp$4 = this.field_Sb[var4];
                    dupTemp$4.field_vb = dupTemp$4.field_vb + 10000;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                case 50: {
                    this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
                    var4 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var4 < this.field_Sb.length) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return;
                }
                case 53: {
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return;
                }
                case 55: {
                    if (var4 == this.field_Pb) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    dupTemp$5 = this.field_Sb[var4];
                    dupTemp$5.field_vb = dupTemp$5.field_vb + 10000;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    return;
                }
                case 59: {
                    var4 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var4 < this.field_Sb.length) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    return;
                }
                case 62: {
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    return;
                }
                case 64: {
                    if (var4 == this.field_Pb) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    dupTemp$6 = this.field_Sb[var4];
                    dupTemp$6.field_vb = dupTemp$6.field_vb + 10000;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static w g(byte param0) {
        if (param0 != 98) {
            return (w) null;
        }
        return dm.a((byte) 108);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= -44) {
          this.a(4, true, -41);
          this.field_N = param0;
          this.field_mb = param2;
          this.field_vb = param5;
          this.field_Ib = param1;
          this.a(param3, true, param4);
          return;
        } else {
          this.field_N = param0;
          this.field_mb = param2;
          this.field_vb = param5;
          this.field_Ib = param1;
          this.a(param3, true, param4);
          return;
        }
    }

    final static int a(int param0, hl param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = ij.field_c;
                if (-3 == (param1.field_m ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (4 != param1.field_m) {
                      break L3;
                    } else {
                      var2_int = ul.field_c[param1.field_m];
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param1.field_r != uc.field_g) {
                      break L4;
                    } else {
                      var2_int = tl.field_q[param1.field_m];
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2_int = ul.field_c[param1.field_m];
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (!param1.field_j) {
                  break L5;
                } else {
                  var2_int = ij.field_c;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                L7: {
                  if (param1.field_i != 0) {
                    break L7;
                  } else {
                    if (-1 == (param1.field_n ^ -1)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var2_int = ul.field_c[param1.field_m];
                if (var3 == 0) {
                  break L1;
                } else {
                  break L6;
                }
              }
              var2_int = tl.field_q[param1.field_m];
              break L1;
            }
            L8: {
              if (param0 == 4636) {
                break L8;
              } else {
                tc.g((byte) 85);
                break L8;
              }
            }
            stackIn_17_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("tc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    static {
    }
}
