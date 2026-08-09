/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ni {
    private int field_o;
    private pc field_n;
    static sf field_l;
    static String field_m;

    final void k(int param0) {
        this.field_o = param0 * this.field_i;
    }

    final void m(int param0) {
        this.field_i = (this.field_o - -7) / param0;
    }

    ih(byte[] param0) {
        super(param0);
    }

    final int f(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != 47) {
          this.m(-38);
          fieldTemp$2 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_k[fieldTemp$2] - this.field_n.a(995108848) & 255;
        } else {
          fieldTemp$3 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_k[fieldTemp$3] - this.field_n.a(995108848) & 255;
        }
    }

    public static void j(int param0) {
        field_m = null;
        if (param0 != 8) {
            return;
        }
        field_l = null;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$0] = (byte)(this.field_n.a(995108848) + param1);
        if (param0 != 8) {
            this.field_n = (pc) null;
        }
    }

    final int b(int param0, byte param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    var3 = this.field_o >> 41183555;
                    if (param1 == -87) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ih.j(33);
                    statePc = 17;
                    continue stateLoop;
                }
                case 2: {
                    var4 = 8 + -(this.field_o & 7);
                    var5 = 0;
                    this.field_o = this.field_o + param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 < param0) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 == param0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = var5 + (this.field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return var5;
                }
                case 9: {
                    incrementValue$2 = var3;
                    var3++;
                    var5 = var5 + ((ek.field_d[var4] & this.field_k[incrementValue$2]) << param0 - var4);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                    return var5;
                }
                case 12: {
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var4 == param0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5 = var5 + (this.field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return var5;
                }
                case 17: {
                    var4 = 8 + -(this.field_o & 7);
                    var5 = 0;
                    this.field_o = this.field_o + param0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var4 < param0) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var4 == param0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var5 + (this.field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                    if (var6 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return var5;
                }
                case 23: {
                    incrementValue$3 = var3;
                    var3++;
                    var5 = var5 + ((ek.field_d[var4] & this.field_k[incrementValue$3]) << param0 - var4);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                    return var5;
                }
                case 26: {
                    if (var6 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var4 == param0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5 = var5 + (this.field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                    if (var6 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void l(int param0) {
        if (param0 != 255) {
          field_l = (sf) null;
          af.a(ef.field_j, true, oa.field_o, (byte) 54);
          ud.field_c = true;
          return;
        } else {
          af.a(ef.field_j, true, oa.field_o, (byte) 54);
          ud.field_c = true;
          return;
        }
    }

    ih(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 66) {
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
                        ih.j(-43);
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
                        var5_int = 0;
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
                        if (param1 <= var5_int) {
                            statePc = 14;
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
                        fieldTemp$1 = this.field_i;
                        this.field_i = this.field_i + 1;
                        param3[param2 + var5_int] = (byte)(this.field_k[fieldTemp$1] + -this.field_n.a(995108848));
                        var5_int++;
                        if (var6 == 0) {
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
                        if (var6 == 0) {
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var5);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("ih.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param3 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int[] param0, byte param1) {
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
              this.field_n = new pc(param0);
              if (param1 == 12) {
                break L1;
              } else {
                this.e(-95, -126);
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

            stackIn_5_1 = new StringBuilder().append("ih.E(");

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
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_m = "Flea Circus";
    }
}
