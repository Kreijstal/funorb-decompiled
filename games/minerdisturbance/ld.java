/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends sb {
    static int field_B;
    private mf field_v;
    static ea field_x;
    static int field_w;
    private int field_z;
    private int field_y;
    static String[] field_A;

    final void b(int[] param0, int param1) {
        try {
            this.field_v = new mf(param0);
            int var3_int = -24 % ((param1 - 64) / 40);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ld.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MinerDisturbance.field_ab;
                    if (param1 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_B = -32;
                    statePc = 8;
                    continue stateLoop;
                }
                case 2: {
                    var4 = param2.indexOf(param3);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == -1) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param2 = param2.substring(0, var4) + param0 + param2.substring(param3.length() + var4);
                    stackIn_7_0 = (String) (param2);
                    stackIn_5_0 = stackIn_7_0;
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = ((String) (Object) stackIn_5_0).indexOf(param3, var4 + param0.length());
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = (String) (param2);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    var4 = param2.indexOf(param3);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var4 == -1) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    param2 = param2.substring(0, var4) + param0 + param2.substring(param3.length() + var4);
                    stackIn_13_0 = (String) (param2);
                    stackIn_11_0 = stackIn_13_0;
                    if (var5 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = ((String) (Object) stackIn_11_0).indexOf(param3, var4 + param0.length());
                    if (var5 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (String) (param2);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return stackIn_13_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        this.field_u[this.field_o] = (byte) 0;
        if (!param0) {
          this.f((byte) 79);
          this.field_z = 8;
          return;
        } else {
          this.field_z = 8;
          return;
        }
    }

    final void n(int param0) {
        if (!(8 <= this.field_z)) {
            this.field_z = 8;
            this.field_o = this.field_o + 1;
        }
        int var2 = 55 / ((param0 - -5) / 39);
    }

    ld(byte[] param0) {
        super(param0);
    }

    final int e(byte param0) {
        int fieldTemp$1 = 0;
        if (param0 != 0) {
          return -16;
        } else {
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          return this.field_u[fieldTemp$1] + -this.field_v.b(4) & 255;
        }
    }

    final int c(byte param0, int param1) {
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
                    var6 = MinerDisturbance.field_ab;
                    if (param0 < -64) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_B = -20;
                    statePc = 17;
                    continue stateLoop;
                }
                case 2: {
                    var3 = this.field_y >> 242816483;
                    var4 = -(7 & this.field_y) + 8;
                    this.field_y = this.field_y + param1;
                    var5 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param1 > var4) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param1 != var4) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = var5 + (pl.field_b[var4] & this.field_u[var3]);
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return var5;
                }
                case 9: {
                    incrementValue$2 = var3;
                    var3++;
                    var5 = var5 + ((this.field_u[incrementValue$2] & pl.field_b[var4]) << -var4 + param1);
                    param1 = param1 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
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
                    if (param1 != var4) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5 = var5 + (pl.field_b[var4] & this.field_u[var3]);
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return var5;
                }
                case 17: {
                    var3 = this.field_y >> 242816483;
                    var4 = -(7 & this.field_y) + 8;
                    this.field_y = this.field_y + param1;
                    var5 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (param1 > var4) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (param1 != var4) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var5 + (pl.field_b[var4] & this.field_u[var3]);
                    if (var6 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return var5;
                }
                case 23: {
                    incrementValue$3 = var3;
                    var3++;
                    var5 = var5 + ((this.field_u[incrementValue$3] & pl.field_b[var4]) << -var4 + param1);
                    param1 = param1 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
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
                    if (param1 != var4) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5 = var5 + (pl.field_b[var4] & this.field_u[var3]);
                    if (var6 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
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

    final void d(byte param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 >= -42) {
          field_x = (ea) null;
          fieldTemp$2 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$2] = (byte)(param1 + this.field_v.b(4));
          return;
        } else {
          fieldTemp$3 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$3] = (byte)(param1 + this.field_v.b(4));
          return;
        }
    }

    final void o(int param0) {
        this.field_o = (7 + this.field_y) / 8;
        int var2 = -128 % ((param0 - -39) / 54);
    }

    final void f(byte param0) {
        if (param0 != 16) {
          field_w = -62;
          this.field_y = 8 * this.field_o;
          return;
        } else {
          this.field_y = 8 * this.field_o;
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MinerDisturbance.field_ab;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = -2 / ((62 - param1) / 47);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 <= var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$1 = this.field_o;
                        this.field_o = this.field_o + 1;
                        param0[var5_int + param3] = (byte)(this.field_u[fieldTemp$1] + -this.field_v.b(4));
                        var5_int++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var5);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("ld.K(");
                    stackIn_9_1 = stackIn_10_1;
                    if (param0 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ld(int param0) {
        super(param0);
    }

    public static void d(boolean param0) {
        if (param0) {
            return;
        }
        field_A = null;
        field_x = null;
    }

    final void a(int param0, byte param1, int param2) {
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MinerDisturbance.field_ab;
                    if (param1 == 14) {
                        statePc = 20;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_x = (ea) null;
                    param0 = param0 & pl.field_b[param2];
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_z < param2) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (param2 != this.field_z) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    fieldTemp$10 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$10] = (byte)(this.field_u[fieldTemp$10] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    return;
                }
                case 5: {
                    this.field_z = this.field_z - param2;
                    this.field_u[this.field_o] = (byte)(this.field_u[this.field_o] + (param0 << this.field_z));
                    if (var5 != 0) {
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
                    fieldTemp$11 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$11] = (byte)(this.field_u[fieldTemp$11] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    return;
                }
                case 9: {
                    param2 = param2 - this.field_z;
                    fieldTemp$12 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$12] = (byte)(this.field_u[fieldTemp$12] + (param0 >>> param2));
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    if (var5 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_z = 8;
                    return;
                }
                case 11: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (param2 != this.field_z) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    fieldTemp$13 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$13] = (byte)(this.field_u[fieldTemp$13] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    return;
                }
                case 15: {
                    this.field_z = this.field_z - param2;
                    this.field_u[this.field_o] = (byte)(this.field_u[this.field_o] + (param0 << this.field_z));
                    if (var5 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    fieldTemp$14 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$14] = (byte)(this.field_u[fieldTemp$14] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    this.field_z = 8;
                    return;
                }
                case 19: {
                    return;
                }
                case 20: {
                    param0 = param0 & pl.field_b[param2];
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (this.field_z >= param2) {
                        statePc = 29;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    param2 = param2 - this.field_z;
                    fieldTemp$15 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$15] = (byte)(this.field_u[fieldTemp$15] + (param0 >>> param2));
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    if (var5 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var5 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (param2 == this.field_z) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_z = this.field_z - param2;
                    this.field_u[this.field_o] = (byte)(this.field_u[this.field_o] + (param0 << this.field_z));
                    if (var5 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    fieldTemp$16 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$16] = (byte)(this.field_u[fieldTemp$16] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    return;
                }
                case 27: {
                    fieldTemp$17 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$17] = (byte)(this.field_u[fieldTemp$17] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    return;
                }
                case 28: {
                    return;
                }
                case 29: {
                    if (param2 == this.field_z) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_z = this.field_z - param2;
                    this.field_u[this.field_o] = (byte)(this.field_u[this.field_o] + (param0 << this.field_z));
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    fieldTemp$18 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$18] = (byte)(this.field_u[fieldTemp$18] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    this.field_z = 8;
                    return;
                }
                case 32: {
                    fieldTemp$19 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_u[fieldTemp$19] = (byte)(this.field_u[fieldTemp$19] + param0);
                    this.field_u[this.field_o] = (byte) 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    this.field_z = 8;
                    return;
                }
                case 34: {
                    this.field_z = 8;
                    return;
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_B = 0;
        field_w = 50;
        field_A = new String[]{"Mega Miner", "Magma Miner", "Pit Lord", "6M Crew Member", "Iron Pick", "Silver Helm", "Golden Rope", "Effluvium Canary", "Diamond Boots", "Slayer of the Myth", "Volcanic Delver", "Aqua Miner", "Demolition Miner", "Minted Miner", "Arctic Explorer", "Iceman", "Polar Prince", "King of the Snowmen", "Freezium Lamp", "Oil Sheik", "Frozen Blubber", "Save the Walrus", "Found the King", "Pick Up a Penguin", "Snow Way Out", "Taking the Mick", "Size 12 Carbon Footprint", "Seen It All", "On the Rocks", "Meteoric Rise", "Just For the Thrill", "Major Disturbance", "Tremors", "Play With Fire"};
    }
}
