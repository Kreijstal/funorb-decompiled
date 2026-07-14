/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uo {
    private long field_g;
    private long field_q;
    private long field_p;
    static dj field_b;
    private byte[] field_k;
    private int field_c;
    private byte[] field_l;
    private long field_f;
    private lj field_h;
    private long field_o;
    private long field_n;
    private int field_e;
    static int field_i;
    static int field_j;
    static String field_d;
    static sb field_m;
    static int field_a;

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
                    var10 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((uo) this).field_n + (long)param0 <= ((uo) this).field_o) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((uo) this).field_o = ((uo) this).field_n - -(long)param0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((uo) this).field_g == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((uo) this).field_g <= ((uo) this).field_n) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a((byte) 28);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((uo) this).field_n ^ -1L) >= (((uo) this).field_g - -(long)((uo) this).field_c ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a((byte) 28);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((uo) this).field_g == -1L) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((long)param0 + ((uo) this).field_n ^ -1L) >= (((uo) this).field_g - -(long)((uo) this).field_l.length ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)((long)((uo) this).field_l.length + (((uo) this).field_g + -((uo) this).field_n));
                        qb.a(param3, param1, ((uo) this).field_l, (int)(((uo) this).field_n - ((uo) this).field_g), var5_int);
                        param1 = param1 + var5_int;
                        param0 = param0 - var5_int;
                        ((uo) this).field_n = ((uo) this).field_n + (long)var5_int;
                        ((uo) this).field_c = ((uo) this).field_l.length;
                        this.a((byte) 28);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((uo) this).field_l.length < param0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((uo) this).field_p ^ -1L) == (((uo) this).field_n ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((uo) this).field_h.a(false, ((uo) this).field_n);
                        ((uo) this).field_p = ((uo) this).field_n;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((uo) this).field_h.a(param0, param3, param1, -80);
                        ((uo) this).field_p = ((uo) this).field_p + (long)param0;
                        if (((uo) this).field_p > ((uo) this).field_q) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((uo) this).field_q = ((uo) this).field_p;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        if ((((uo) this).field_n ^ -1L) > (((uo) this).field_f ^ -1L)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((uo) this).field_n >= (long)((uo) this).field_e + ((uo) this).field_f) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = ((uo) this).field_n;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((uo) this).field_f < ((uo) this).field_n) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((uo) this).field_f ^ -1L) > ((long)param0 + ((uo) this).field_n ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((uo) this).field_f;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = -1L;
                        if ((((uo) this).field_f ^ -1L) <= (((uo) this).field_n + (long)param0 ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((long)param0 + ((uo) this).field_n ^ -1L) >= (((uo) this).field_f + (long)((uo) this).field_e ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((long)((uo) this).field_e + ((uo) this).field_f ^ -1L) >= (((uo) this).field_n ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((((uo) this).field_n + (long)param0 ^ -1L) > (((uo) this).field_f - -(long)((uo) this).field_e ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = (long)((uo) this).field_e + ((uo) this).field_f;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7 = ((uo) this).field_n + (long)param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 48;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        qb.a(param3, (int)((long)param1 + var5_long + -((uo) this).field_n), ((uo) this).field_k, (int)(var5_long - ((uo) this).field_f), var9);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((uo) this).field_n = ((uo) this).field_n + (long)param0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return;
                }
                case 38: {
                    try {
                        if (param2 <= -67) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return;
                }
                case 40: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-1L == ((uo) this).field_g) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((uo) this).field_g = ((uo) this).field_n;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        qb.a(param3, param1, ((uo) this).field_l, (int)(((uo) this).field_n + -((uo) this).field_g), param0);
                        ((uo) this).field_n = ((uo) this).field_n + (long)param0;
                        if (-((uo) this).field_g + ((uo) this).field_n > (long)((uo) this).field_c) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((uo) this).field_c = (int)(-((uo) this).field_g + ((uo) this).field_n);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return;
                }
                case 48: {
                    var5 = (IOException) (Object) caughtException;
                    ((uo) this).field_p = -1L;
                    throw var5;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
                    var14 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.length >= param3 - -param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param0.length + param3 + param2);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0L == (((uo) this).field_g ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((uo) this).field_g ^ -1L) < (((uo) this).field_n ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((long)param2 + ((uo) this).field_n ^ -1L) >= ((long)((uo) this).field_c + ((uo) this).field_g ^ -1L)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qb.a(((uo) this).field_l, (int)(-((uo) this).field_g + ((uo) this).field_n), param0, param3, param2);
                        ((uo) this).field_n = ((uo) this).field_n + (long)param2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((uo) this).field_n;
                        var7 = param3;
                        var8 = param2;
                        if ((((uo) this).field_n ^ -1L) > (((uo) this).field_f ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((uo) this).field_n >= ((uo) this).field_f + (long)((uo) this).field_e) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = (int)((long)((uo) this).field_e - (((uo) this).field_n - ((uo) this).field_f));
                        if (var9_int <= param2) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = param2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        qb.a(((uo) this).field_k, (int)(((uo) this).field_n + -((uo) this).field_f), param0, param3, var9_int);
                        param3 = param3 + var9_int;
                        ((uo) this).field_n = ((uo) this).field_n + (long)var9_int;
                        param2 = param2 - var9_int;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((uo) this).field_k.length < param2) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 < param2) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.c(200000000);
                        var9_int = param2;
                        if (((uo) this).field_e >= var9_int) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int = ((uo) this).field_e;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        qb.a(((uo) this).field_k, 0, param0, param3, var9_int);
                        param3 = param3 + var9_int;
                        ((uo) this).field_n = ((uo) this).field_n + (long)var9_int;
                        param2 = param2 - var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((uo) this).field_h.a(false, ((uo) this).field_n);
                        ((uo) this).field_p = ((uo) this).field_n;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9_int = ((uo) this).field_h.a(false, param3, param2, param0);
                        if (-1 != var9_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((uo) this).field_n = ((uo) this).field_n + (long)var9_int;
                        param3 = param3 + var9_int;
                        param2 = param2 - var9_int;
                        ((uo) this).field_p = ((uo) this).field_p + (long)var9_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param1 == 24) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        if (((uo) this).field_g != -1L) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((uo) this).field_n ^ -1L) <= (((uo) this).field_g ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 < param2) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param3 + (int)(((uo) this).field_g - ((uo) this).field_n);
                        if (param3 + param2 < var9_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param3 + param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param3 >= var9_int) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param2--;
                        param3++;
                        param0[param3] = (byte) 0;
                        ((uo) this).field_n = ((uo) this).field_n + 1L;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = -1L;
                        if ((((uo) this).field_g ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((uo) this).field_g ^ -1L) > ((long)var8 + var5_long ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((uo) this).field_g ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var5_long ^ -1L) > (((uo) this).field_g - -(long)((uo) this).field_c ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = var5_long;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9 = ((uo) this).field_g;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = -1L;
                        if (var5_long >= ((uo) this).field_g + (long)((uo) this).field_c) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((long)((uo) this).field_c + ((uo) this).field_g ^ -1L) < (var5_long + (long)var8 ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)((uo) this).field_c + ((uo) this).field_g;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var5_long - -(long)var8 <= ((uo) this).field_g) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((long)var8 + var5_long <= ((uo) this).field_g - -(long)((uo) this).field_c) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11 = var5_long + (long)var8;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (-1L >= var9) {
                            statePc = 60;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var11 > var9) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13 = (int)(-var9 + var11);
                        qb.a(((uo) this).field_l, (int)(-((uo) this).field_g + var9), param0, (int)(-var5_long + var9) + var7, var13);
                        if (var11 > ((uo) this).field_n) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param2 = (int)((long)param2 - (-((uo) this).field_n + var11));
                        ((uo) this).field_n = var11;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var5 = (IOException) (Object) caughtException;
                    ((uo) this).field_p = -1L;
                    throw var5;
                }
                case 60: {
                    if (0 >= param2) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    throw new EOFException();
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            Object var3 = null;
            el discarded$0 = uo.a(-117, (String) null);
        }
        this.a((byte) 28);
        ((uo) this).field_h.b(-5317);
    }

    final long a(int param0) {
        if (param0 < 38) {
            ((uo) this).field_k = null;
        }
        return ((uo) this).field_o;
    }

    public static void b(int param0) {
        field_m = null;
        int var1 = 19 / ((35 - param0) / 50);
        field_d = null;
        field_b = null;
    }

    final static el a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (param0 != -58) {
            field_a = 111;
        }
        int var2 = param1.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return gm.field_f;
    }

    final void a(long param0, int param1) throws IOException {
        int var4 = 32 / ((param1 - 60) / 35);
        if (param0 < 0L) {
            throw new IOException();
        }
        ((uo) this).field_n = param0;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (0L != (((uo) this).field_g ^ -1L)) {
            L1: {
              if (((uo) this).field_g == ((uo) this).field_p) {
                break L1;
              } else {
                ((uo) this).field_h.a(false, ((uo) this).field_g);
                ((uo) this).field_p = ((uo) this).field_g;
                break L1;
              }
            }
            L2: {
              ((uo) this).field_h.a(((uo) this).field_c, ((uo) this).field_l, 0, -120);
              ((uo) this).field_p = ((uo) this).field_p + (long)((uo) this).field_c;
              if (((uo) this).field_q < ((uo) this).field_p) {
                ((uo) this).field_q = ((uo) this).field_p;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((uo) this).field_g < ((uo) this).field_f) {
                  break L4;
                } else {
                  if ((((uo) this).field_g ^ -1L) <= (((uo) this).field_f - -(long)((uo) this).field_e ^ -1L)) {
                    break L4;
                  } else {
                    var2 = ((uo) this).field_g;
                    break L3;
                  }
                }
              }
              if ((((uo) this).field_g ^ -1L) < (((uo) this).field_f ^ -1L)) {
                break L3;
              } else {
                if (((uo) this).field_f < (long)((uo) this).field_c + ((uo) this).field_g) {
                  var2 = ((uo) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((uo) this).field_f >= (long)((uo) this).field_c + ((uo) this).field_g) {
                  break L6;
                } else {
                  if ((((uo) this).field_f - -(long)((uo) this).field_e ^ -1L) <= (((uo) this).field_g + (long)((uo) this).field_c ^ -1L)) {
                    var4 = (long)((uo) this).field_c + ((uo) this).field_g;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((((uo) this).field_g ^ -1L) <= ((long)((uo) this).field_e + ((uo) this).field_f ^ -1L)) {
                break L5;
              } else {
                if (((uo) this).field_g + (long)((uo) this).field_c < ((uo) this).field_f + (long)((uo) this).field_e) {
                  break L5;
                } else {
                  var4 = ((uo) this).field_f - -(long)((uo) this).field_e;
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
                  var6 = (int)(var4 + -var2);
                  qb.a(((uo) this).field_l, (int)(var2 + -((uo) this).field_g), ((uo) this).field_k, (int)(-((uo) this).field_f + var2), var6);
                  break L7;
                }
              }
            }
            ((uo) this).field_c = 0;
            ((uo) this).field_g = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 == 28) {
            break L8;
          } else {
            uo.b(9);
            break L8;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        ((uo) this).a(param0, (byte) 24, param0.length, 0);
        if (param1 != 0) {
            uo.b(-16);
        }
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        ((uo) this).field_e = 0;
        if ((((uo) this).field_n ^ -1L) != (((uo) this).field_p ^ -1L)) {
            ((uo) this).field_h.a(false, ((uo) this).field_n);
            ((uo) this).field_p = ((uo) this).field_n;
        }
        if (param0 != 200000000) {
            uo.b(1);
        }
        ((uo) this).field_f = ((uo) this).field_n;
        while (((uo) this).field_e < ((uo) this).field_k.length) {
            var2 = ((uo) this).field_k.length - ((uo) this).field_e;
            if (!(var2 >= -200000001)) {
                var2 = 200000000;
            }
            var3 = ((uo) this).field_h.a(false, ((uo) this).field_e, var2, ((uo) this).field_k);
            if (0 == var3) {
                break;
            }
            ((uo) this).field_e = ((uo) this).field_e + var3;
            ((uo) this).field_p = ((uo) this).field_p + (long)var3;
        }
    }

    uo(lj param0, int param1, int param2) throws IOException {
        ((uo) this).field_g = -1L;
        ((uo) this).field_f = -1L;
        ((uo) this).field_c = 0;
        ((uo) this).field_h = param0;
        ((uo) this).field_q = param0.b((byte) -25);
        ((uo) this).field_o = param0.b((byte) -25);
        ((uo) this).field_l = new byte[param2];
        ((uo) this).field_k = new byte[param1];
        ((uo) this).field_n = 0L;
    }

    final static void b(boolean param0) {
        he.field_f = null;
        if (param0) {
            uo.b(-78);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new dj();
        field_a = 0;
        field_d = "Hide lobby chat";
    }
}
