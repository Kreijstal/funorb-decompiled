/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ir {
    private long field_f;
    private long field_j;
    static String[][] field_p;
    private int field_o;
    private byte[] field_k;
    private long field_d;
    private long field_e;
    private long field_m;
    static int field_n;
    static int field_h;
    static String field_b;
    private long field_g;
    static String field_i;
    static vh field_a;
    private v field_l;
    private byte[] field_c;
    private int field_q;

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ir) this).field_e < ((ir) this).field_f - -(long)param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((ir) this).field_e = ((ir) this).field_f - -(long)param0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((ir) this).field_j == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((ir) this).field_f ^ -1L) > (((ir) this).field_j ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((ir) this).field_f ^ -1L) < (((ir) this).field_j + (long)((ir) this).field_q ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(false);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-1L == ((ir) this).field_j) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((long)((ir) this).field_k.length + ((ir) this).field_j ^ -1L) > (((ir) this).field_f - -(long)param0 ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = (int)(-((ir) this).field_f - (-((ir) this).field_j - (long)((ir) this).field_k.length));
                        qn.a(param1, param2, ((ir) this).field_k, (int)(((ir) this).field_f + -((ir) this).field_j), var5_int);
                        param0 = param0 - var5_int;
                        ((ir) this).field_f = ((ir) this).field_f + (long)var5_int;
                        param2 = param2 + var5_int;
                        ((ir) this).field_q = ((ir) this).field_k.length;
                        this.a(false);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((ir) this).field_k.length >= param0) {
                            statePc = 38;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((ir) this).field_f == ((ir) this).field_g) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((ir) this).field_l.a(-1, ((ir) this).field_f);
                        ((ir) this).field_g = ((ir) this).field_f;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ir) this).field_l.a(param2, 25354, param0, param1);
                        ((ir) this).field_g = ((ir) this).field_g + (long)param0;
                        if (((ir) this).field_g > ((ir) this).field_m) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((ir) this).field_m = ((ir) this).field_g;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        if ((((ir) this).field_d ^ -1L) < (((ir) this).field_f ^ -1L)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((long)((ir) this).field_o + ((ir) this).field_d ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = ((ir) this).field_f;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((ir) this).field_f > ((ir) this).field_d) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((ir) this).field_f - -(long)param0 ^ -1L) < (((ir) this).field_d ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((ir) this).field_d;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = -1L;
                        if ((((ir) this).field_d ^ -1L) <= (((ir) this).field_f - -(long)param0 ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((long)param0 + ((ir) this).field_f ^ -1L) < (((ir) this).field_d + (long)((ir) this).field_o ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7 = (long)param0 + ((ir) this).field_f;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((long)((ir) this).field_o + ((ir) this).field_d ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((ir) this).field_f + (long)param0 >= ((ir) this).field_d - -(long)((ir) this).field_o) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7 = ((ir) this).field_d - -(long)((ir) this).field_o;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(var7 + -var5_long);
                        qn.a(param1, (int)((long)param2 + (var5_long - ((ir) this).field_f)), ((ir) this).field_c, (int)(-((ir) this).field_d + var5_long), var9);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((ir) this).field_f = ((ir) this).field_f + (long)param0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return;
                }
                case 38: {
                    try {
                        if ((param0 ^ -1) < param3) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (0L == (((ir) this).field_j ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((ir) this).field_j = ((ir) this).field_f;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        qn.a(param1, param2, ((ir) this).field_k, (int)(-((ir) this).field_j + ((ir) this).field_f), param0);
                        ((ir) this).field_f = ((ir) this).field_f + (long)param0;
                        if (((long)((ir) this).field_q ^ -1L) <= (((ir) this).field_f - ((ir) this).field_j ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((ir) this).field_q = (int)(((ir) this).field_f - ((ir) this).field_j);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return;
                }
                case 46: {
                    var5 = (IOException) (Object) caughtException;
                    ((ir) this).field_g = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) throws IOException {
        this.a(false);
        ((ir) this).field_l.c((byte) 101);
        if (param0 <= 34) {
            ir.a((byte) -96);
        }
    }

    private final void c(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pool.field_O;
        ((ir) this).field_o = 0;
        if (param0 != -28) {
        }
        if (!(((ir) this).field_f == ((ir) this).field_g)) {
            ((ir) this).field_l.a(-1, ((ir) this).field_f);
            ((ir) this).field_g = ((ir) this).field_f;
        }
        ((ir) this).field_d = ((ir) this).field_f;
        while (((ir) this).field_o < ((ir) this).field_c.length) {
            var2 = -((ir) this).field_o + ((ir) this).field_c.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((ir) this).field_l.a(((ir) this).field_c, 20859, var2, ((ir) this).field_o);
            if (var3 == -1) {
                break;
            }
            ((ir) this).field_o = ((ir) this).field_o + var3;
            ((ir) this).field_g = ((ir) this).field_g + (long)var3;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
            throw new IOException();
        }
        if (param0 != 0) {
            return;
        }
        ((ir) this).field_f = param1;
    }

    final static double[][] a(int param0, double[] param1) {
        if (param0 > -90) {
          return null;
        } else {
          return new double[][]{param1, new double[6]};
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 + param2 > param3.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((ir) this).field_j ^ -1L) == 0L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((ir) this).field_j > ((ir) this).field_f) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((long)param1 + ((ir) this).field_f ^ -1L) < ((long)((ir) this).field_q + ((ir) this).field_j ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qn.a(((ir) this).field_k, (int)(-((ir) this).field_j + ((ir) this).field_f), param3, param2, param1);
                        ((ir) this).field_f = ((ir) this).field_f + (long)param1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((ir) this).field_f;
                        var7 = param2;
                        var8 = param1;
                        if ((((ir) this).field_d ^ -1L) < (((ir) this).field_f ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((ir) this).field_d - -(long)((ir) this).field_o ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = (int)((long)((ir) this).field_o - (-((ir) this).field_d + ((ir) this).field_f));
                        if (var9_int <= param1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        qn.a(((ir) this).field_c, (int)(-((ir) this).field_d + ((ir) this).field_f), param3, param2, var9_int);
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
                        ((ir) this).field_f = ((ir) this).field_f + (long)var9_int;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 < -109) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((ir) this).field_c.length >= param1) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ir) this).field_l.a(-1, ((ir) this).field_f);
                        ((ir) this).field_g = ((ir) this).field_f;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param1 <= 0) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int = ((ir) this).field_l.a(param3, 20859, param1, param2);
                        if (0 == (var9_int ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((ir) this).field_f = ((ir) this).field_f + (long)var9_int;
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        ((ir) this).field_g = ((ir) this).field_g + (long)var9_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (0 >= param1) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.c((byte) -28);
                        var9_int = param1;
                        if (var9_int <= ((ir) this).field_o) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = ((ir) this).field_o;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        qn.a(((ir) this).field_c, 0, param3, param2, var9_int);
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        ((ir) this).field_f = ((ir) this).field_f + (long)var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1L == ((ir) this).field_j) {
                            statePc = 51;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((ir) this).field_j ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param1 <= 0) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9_int = (int)(-((ir) this).field_f + ((ir) this).field_j) + param2;
                        if (var9_int <= param1 + param2) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_int = param1 + param2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param2 >= var9_int) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param2++;
                        param3[param2] = (byte) 0;
                        param1--;
                        ((ir) this).field_f = ((ir) this).field_f + 1L;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (var5_long > ((ir) this).field_j) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((long)var8 + var5_long <= ((ir) this).field_j) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = ((ir) this).field_j;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var5_long ^ -1L) > (((ir) this).field_j ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((long)((ir) this).field_q + ((ir) this).field_j <= var5_long) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = var5_long;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var5_long >= (long)((ir) this).field_q + ((ir) this).field_j) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long - -(long)var8 ^ -1L) <= (((ir) this).field_j + (long)((ir) this).field_q ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5_long - -(long)var8 <= ((ir) this).field_j) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((long)((ir) this).field_q + ((ir) this).field_j ^ -1L) > ((long)var8 + var5_long ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = var5_long - -(long)var8;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = ((ir) this).field_j + (long)((ir) this).field_q;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var9 >= var11) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var13 = (int)(-var9 + var11);
                        qn.a(((ir) this).field_k, (int)(-((ir) this).field_j + var9), param3, var7 + (int)(-var5_long + var9), var13);
                        if ((((ir) this).field_f ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param1 = (int)((long)param1 - (var11 - ((ir) this).field_f));
                        ((ir) this).field_f = var11;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var5 = (IOException) (Object) caughtException;
                    ((ir) this).field_g = -1L;
                    throw var5;
                }
                case 51: {
                    if (param1 > 0) {
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
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_a = null;
        int var1 = -55 / ((62 - param0) / 40);
        field_p = null;
        field_b = null;
    }

    final long d(byte param0) {
        if (param0 != 17) {
            Object var3 = null;
            double[][] discarded$0 = ir.a(54, (double[]) null);
        }
        return ((ir) this).field_e;
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 < 65) {
            ((ir) this).field_e = 36L;
        }
        ((ir) this).a((byte) -126, param1.length, 0, param1);
    }

    private final void a(boolean param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          if ((((ir) this).field_j ^ -1L) != 0L) {
            L1: {
              if ((((ir) this).field_j ^ -1L) == (((ir) this).field_g ^ -1L)) {
                break L1;
              } else {
                ((ir) this).field_l.a(-1, ((ir) this).field_j);
                ((ir) this).field_g = ((ir) this).field_j;
                break L1;
              }
            }
            L2: {
              ((ir) this).field_l.a(0, 25354, ((ir) this).field_q, ((ir) this).field_k);
              ((ir) this).field_g = ((ir) this).field_g + (long)((ir) this).field_q;
              if ((((ir) this).field_m ^ -1L) <= (((ir) this).field_g ^ -1L)) {
                break L2;
              } else {
                ((ir) this).field_m = ((ir) this).field_g;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((((ir) this).field_d ^ -1L) < (((ir) this).field_j ^ -1L)) {
                  break L4;
                } else {
                  if (((ir) this).field_j >= ((ir) this).field_d - -(long)((ir) this).field_o) {
                    break L4;
                  } else {
                    var2 = ((ir) this).field_j;
                    break L3;
                  }
                }
              }
              if ((((ir) this).field_j ^ -1L) < (((ir) this).field_d ^ -1L)) {
                break L3;
              } else {
                if ((((ir) this).field_d ^ -1L) <= ((long)((ir) this).field_q + ((ir) this).field_j ^ -1L)) {
                  break L3;
                } else {
                  var2 = ((ir) this).field_d;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((((ir) this).field_d ^ -1L) <= ((long)((ir) this).field_q + ((ir) this).field_j ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((ir) this).field_q + ((ir) this).field_j <= ((ir) this).field_d + (long)((ir) this).field_o) {
                    var4 = (long)((ir) this).field_q + ((ir) this).field_j;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((long)((ir) this).field_o + ((ir) this).field_d ^ -1L) >= (((ir) this).field_j ^ -1L)) {
                break L5;
              } else {
                if (((ir) this).field_j + (long)((ir) this).field_q >= (long)((ir) this).field_o + ((ir) this).field_d) {
                  var4 = ((ir) this).field_d + (long)((ir) this).field_o;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (var4 > var2) {
                  var6 = (int)(var4 + -var2);
                  qn.a(((ir) this).field_k, (int)(var2 + -((ir) this).field_j), ((ir) this).field_c, (int)(var2 - ((ir) this).field_d), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((ir) this).field_q = 0;
            ((ir) this).field_j = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (!param0) {
            break L8;
          } else {
            ir.a((byte) 126);
            break L8;
          }
        }
    }

    ir(v param0, int param1, int param2) throws IOException {
        ((ir) this).field_j = -1L;
        ((ir) this).field_d = -1L;
        ((ir) this).field_q = 0;
        ((ir) this).field_l = param0;
        ((ir) this).field_m = param0.a(false);
        ((ir) this).field_e = param0.a(false);
        ((ir) this).field_f = 0L;
        ((ir) this).field_c = new byte[param1];
        ((ir) this).field_k = new byte[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20;
        field_i = "Please try again in a few minutes.";
    }
}
