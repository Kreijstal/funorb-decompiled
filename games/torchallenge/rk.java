/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;

final class rk {
    private long field_i;
    static cf field_n;
    private int field_l;
    private long field_b;
    private long field_q;
    static int[] field_a;
    private long field_k;
    private byte[] field_r;
    private byte[] field_d;
    private nd field_j;
    private int field_f;
    private long field_m;
    private long field_o;
    static sl field_g;
    static String field_h;
    static int[] field_p;
    static boolean field_e;
    static String field_c;

    final long a(int param0) {
        int var2 = 25 % ((param0 - -62) / 44);
        return ((rk) this).field_m;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
                    var10 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((rk) this).field_m >= ((rk) this).field_q - -(long)param3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((rk) this).field_m = (long)param3 + ((rk) this).field_q;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((rk) this).field_o ^ -1L) == 0L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((rk) this).field_q ^ -1L) > (((rk) this).field_o ^ -1L)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((rk) this).field_q > ((rk) this).field_o - -(long)((rk) this).field_l) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a(true);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0L == (((rk) this).field_o ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((long)param3 + ((rk) this).field_q > ((rk) this).field_o + (long)((rk) this).field_d.length) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)((long)((rk) this).field_d.length - -((rk) this).field_o - ((rk) this).field_q);
                        he.a(param2, param1, ((rk) this).field_d, (int)(-((rk) this).field_o + ((rk) this).field_q), var5_int);
                        ((rk) this).field_q = ((rk) this).field_q + (long)var5_int;
                        param3 = param3 - var5_int;
                        param1 = param1 + var5_int;
                        ((rk) this).field_l = ((rk) this).field_d.length;
                        this.a(true);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((rk) this).field_d.length < param3) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((rk) this).field_q ^ -1L) == (((rk) this).field_b ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((rk) this).field_j.a(((rk) this).field_q, false);
                        ((rk) this).field_b = ((rk) this).field_q;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((rk) this).field_j.a(param2, param1, param3, (byte) -59);
                        ((rk) this).field_b = ((rk) this).field_b + (long)param3;
                        if (((rk) this).field_b <= ((rk) this).field_k) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((rk) this).field_k = ((rk) this).field_b;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_long = -1L;
                        if ((((rk) this).field_q ^ -1L) > (((rk) this).field_i ^ -1L)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (((rk) this).field_i + (long)((rk) this).field_f > ((rk) this).field_q) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((rk) this).field_i < ((rk) this).field_q) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((rk) this).field_i ^ -1L) > (((rk) this).field_q + (long)param3 ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((rk) this).field_i;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((rk) this).field_q;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = -1L;
                        if (((rk) this).field_q - -(long)param3 <= ((rk) this).field_i) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((long)((rk) this).field_f + ((rk) this).field_i >= (long)param3 + ((rk) this).field_q) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((rk) this).field_q >= (long)((rk) this).field_f + ((rk) this).field_i) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((long)param3 + ((rk) this).field_q < (long)((rk) this).field_f + ((rk) this).field_i) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = ((rk) this).field_i + (long)((rk) this).field_f;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7 = ((rk) this).field_q - -(long)param3;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var7 > var5_long) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        he.a(param2, (int)(var5_long + (long)param1 + -((rk) this).field_q), ((rk) this).field_r, (int)(var5_long + -((rk) this).field_i), var9);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((rk) this).field_q = ((rk) this).field_q + (long)param3;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (param0 == -4573) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        rk.b(false);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-1 <= (param3 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((rk) this).field_o != -1L) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((rk) this).field_o = ((rk) this).field_q;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        he.a(param2, param1, ((rk) this).field_d, (int)(((rk) this).field_q + -((rk) this).field_o), param3);
                        ((rk) this).field_q = ((rk) this).field_q + (long)param3;
                        if (((long)((rk) this).field_l ^ -1L) <= (((rk) this).field_q - ((rk) this).field_o ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((rk) this).field_l = (int)(-((rk) this).field_o + ((rk) this).field_q);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return;
                }
                case 47: {
                    var5 = (IOException) (Object) caughtException;
                    ((rk) this).field_b = -1L;
                    throw var5;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        field_g = null;
        field_p = null;
        field_h = null;
        field_n = null;
        if (!param0) {
            field_n = null;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
                    var14 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3.length >= param1 + param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param0 - (-param1 - -param3.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((rk) this).field_o) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((rk) this).field_o > ((rk) this).field_q) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((rk) this).field_o + (long)((rk) this).field_l ^ -1L) > (((rk) this).field_q + (long)param1 ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        he.a(((rk) this).field_d, (int)(((rk) this).field_q + -((rk) this).field_o), param3, param0, param1);
                        ((rk) this).field_q = ((rk) this).field_q + (long)param1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_long = ((rk) this).field_q;
                        var7 = param0;
                        var8 = param1;
                        if ((((rk) this).field_q ^ -1L) > (((rk) this).field_i ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((rk) this).field_q >= ((rk) this).field_i + (long)((rk) this).field_f) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9_int = (int)((long)((rk) this).field_f + -((rk) this).field_q + ((rk) this).field_i);
                        if (var9_int <= param1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = param1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        he.a(((rk) this).field_r, (int)(((rk) this).field_q - ((rk) this).field_i), param3, param0, var9_int);
                        param1 = param1 - var9_int;
                        ((rk) this).field_q = ((rk) this).field_q + (long)var9_int;
                        param0 = param0 + var9_int;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((rk) this).field_r.length < param1) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.b((byte) -127);
                        var9_int = param1;
                        if (((rk) this).field_f < var9_int) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9_int = ((rk) this).field_f;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        he.a(((rk) this).field_r, 0, param3, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((rk) this).field_q = ((rk) this).field_q + (long)var9_int;
                        param1 = param1 - var9_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((rk) this).field_j.a(((rk) this).field_q, false);
                        ((rk) this).field_b = ((rk) this).field_q;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param1 <= 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((rk) this).field_j.a(param0, param1, false, param3);
                        if (0 != (var9_int ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param1 = param1 - var9_int;
                        ((rk) this).field_b = ((rk) this).field_b + (long)var9_int;
                        ((rk) this).field_q = ((rk) this).field_q + (long)var9_int;
                        param0 = param0 + var9_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1L == ((rk) this).field_o) {
                            statePc = 50;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (((rk) this).field_o <= ((rk) this).field_q) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1 > (param1 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9_int = (int)(((rk) this).field_o - ((rk) this).field_q) + param0;
                        if (param1 + param0 < var9_int) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9_int = param1 + param0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param0 >= var9_int) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        param0++;
                        param3[param0] = (byte) 0;
                        param1--;
                        ((rk) this).field_q = ((rk) this).field_q + 1L;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((rk) this).field_o ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((((rk) this).field_o ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = ((rk) this).field_o;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var5_long < ((rk) this).field_o) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((long)((rk) this).field_l + ((rk) this).field_o <= var5_long) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = var5_long;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long ^ -1L) <= (((rk) this).field_o - -(long)((rk) this).field_l ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((rk) this).field_o + (long)((rk) this).field_l ^ -1L) < (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = (long)((rk) this).field_l + ((rk) this).field_o;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((rk) this).field_o >= var5_long - -(long)var8) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) < (((rk) this).field_o - -(long)((rk) this).field_l ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var9 ^ -1L) >= 0L) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var9 >= var11) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var13 = (int)(var11 + -var9);
                        he.a(((rk) this).field_d, (int)(var9 - ((rk) this).field_o), param3, (int)(-var5_long + var9) + var7, var13);
                        if (((rk) this).field_q < var11) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param1 = (int)((long)param1 - (var11 - ((rk) this).field_q));
                        ((rk) this).field_q = var11;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param2 >= 5) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var5 = (IOException) (Object) caughtException;
                    ((rk) this).field_b = -1L;
                    throw var5;
                }
                case 54: {
                    if (0 < param1) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    throw new EOFException();
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        if (param1 != 0) {
            return;
        }
        ((rk) this).field_q = param0;
    }

    final static int a(byte param0, int[] param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        var3 = 5;
        var5 = 34 % ((param0 - -42) / 63);
        var4 = 0;
        L0: while (true) {
          if (6 <= var4) {
            return var2;
          } else {
            var6 = 0;
            L1: while (true) {
              if (var6 >= var3) {
                var4++;
                continue L0;
              } else {
                if (-1 > (1 << var6 & param1[var4] ^ -1)) {
                  var2++;
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (0L != (((rk) this).field_o ^ -1L)) {
            L1: {
              if ((((rk) this).field_o ^ -1L) == (((rk) this).field_b ^ -1L)) {
                break L1;
              } else {
                ((rk) this).field_j.a(((rk) this).field_o, false);
                ((rk) this).field_b = ((rk) this).field_o;
                break L1;
              }
            }
            L2: {
              ((rk) this).field_j.a(((rk) this).field_d, 0, ((rk) this).field_l, (byte) -59);
              ((rk) this).field_b = ((rk) this).field_b + (long)((rk) this).field_l;
              if ((((rk) this).field_b ^ -1L) < (((rk) this).field_k ^ -1L)) {
                ((rk) this).field_k = ((rk) this).field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((((rk) this).field_i ^ -1L) < (((rk) this).field_o ^ -1L)) {
                  break L4;
                } else {
                  if ((((rk) this).field_i + (long)((rk) this).field_f ^ -1L) < (((rk) this).field_o ^ -1L)) {
                    var2 = ((rk) this).field_o;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((rk) this).field_i < ((rk) this).field_o) {
                break L3;
              } else {
                if ((long)((rk) this).field_l + ((rk) this).field_o > ((rk) this).field_i) {
                  var2 = ((rk) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((rk) this).field_o + (long)((rk) this).field_l <= ((rk) this).field_i) {
                  break L6;
                } else {
                  if (((long)((rk) this).field_l + ((rk) this).field_o ^ -1L) < ((long)((rk) this).field_f + ((rk) this).field_i ^ -1L)) {
                    break L6;
                  } else {
                    var4 = (long)((rk) this).field_l + ((rk) this).field_o;
                    break L5;
                  }
                }
              }
              if (((long)((rk) this).field_f + ((rk) this).field_i ^ -1L) >= (((rk) this).field_o ^ -1L)) {
                break L5;
              } else {
                if ((((rk) this).field_i + (long)((rk) this).field_f ^ -1L) >= (((rk) this).field_o + (long)((rk) this).field_l ^ -1L)) {
                  var4 = ((rk) this).field_i - -(long)((rk) this).field_f;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  he.a(((rk) this).field_d, (int)(-((rk) this).field_o + var2), ((rk) this).field_r, (int)(var2 - ((rk) this).field_i), var6);
                  break L7;
                }
              }
            }
            ((rk) this).field_l = 0;
            ((rk) this).field_o = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0) {
            break L8;
          } else {
            var8 = null;
            java.net.URL discarded$1 = rk.a((String) null, -7, (String) null, -38, (java.net.URL) null);
            break L8;
          }
        }
    }

    final void a(byte param0) throws IOException {
        this.a(true);
        if (param0 != -57) {
            Object var3 = null;
            rk.a((byte) 19, (java.awt.Canvas) null);
        }
        ((rk) this).field_j.a((byte) 47);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        sd.a((byte) 69, (java.awt.Component) (Object) param1);
        kb.a((byte) -25, (java.awt.Component) (Object) param1);
        int var2 = 59 / ((24 - param0) / 36);
        if (ef.field_l != null) {
            ef.field_l.a((byte) 118, (java.awt.Component) (Object) param1);
        }
    }

    private final void b(byte param0) throws IOException {
        int var3 = 0;
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        ((rk) this).field_f = 0;
        int var2 = -29 % ((param0 - 36) / 57);
        if (!(((rk) this).field_q == ((rk) this).field_b)) {
            ((rk) this).field_j.a(((rk) this).field_q, false);
            ((rk) this).field_b = ((rk) this).field_q;
        }
        ((rk) this).field_i = ((rk) this).field_q;
        while (((rk) this).field_r.length > ((rk) this).field_f) {
            var3 = -((rk) this).field_f + ((rk) this).field_r.length;
            if (!(200000000 >= var3)) {
                var3 = 200000000;
            }
            var4 = ((rk) this).field_j.a(((rk) this).field_f, var3, false, ((rk) this).field_r);
            // if_icmpeq L153
            ((rk) this).field_b = ((rk) this).field_b + (long)var4;
            ((rk) this).field_f = ((rk) this).field_f + var4;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        ((rk) this).a(0, param1.length, (byte) 125, param1);
        if (param0 > -92) {
            field_e = false;
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            var9 = TorChallenge.field_F ? 1 : 0;
            if (param3 == -1) {
              var5 = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                    break L1;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((var7_int ^ -1) <= -1) {
                      if ((param1 ^ -1) > -1) {
                        var6 = var7_int;
                        continue L0;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var5.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (-1 < (var7_int ^ -1)) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if ((var7_int ^ -1) <= -1) {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int ^ -1) <= -1) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if (param1 <= 0) {
                    break L6;
                  } else {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                    break L6;
                  }
                }
                L7: {
                  if (param2 == null) {
                    break L7;
                  } else {
                    if (param2.length() < -1) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param0 == null) {
                    break L8;
                  } else {
                    if (-1 < param0.length()) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param0);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (var5.length() <= var6) {
                    StringBuilder discarded$16 = var7.append(47);
                    break L9;
                  } else {
                    StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                    break L9;
                  }
                }
                try {
                  stackOut_41_0 = new java.net.URL(param4, var7.toString());
                  stackIn_42_0 = stackOut_41_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_42_0;
                }
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rk(nd param0, int param1, int param2) throws IOException {
        ((rk) this).field_l = 0;
        ((rk) this).field_i = -1L;
        ((rk) this).field_o = -1L;
        ((rk) this).field_j = param0;
        ((rk) this).field_k = param0.a(true);
        ((rk) this).field_m = param0.a(true);
        ((rk) this).field_d = new byte[param2];
        ((rk) this).field_q = 0L;
        ((rk) this).field_r = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{4, 8};
        field_n = new cf();
        field_e = true;
        field_c = "Email is valid";
        field_h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
