/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me {
    static ea[] field_k;
    private byte[] field_o;
    private long field_g;
    private long field_b;
    static int field_j;
    private an field_f;
    private long field_n;
    private byte[] field_a;
    private long field_d;
    static String field_l;
    static int field_h;
    private int field_c;
    private long field_i;
    private long field_e;
    private int field_m;

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        if (param0 < 105) {
            return;
        }
        ((me) this).field_g = param1;
    }

    final static int[] a(int param0, int[] param1, int[] param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param0 != 8) {
            field_k = null;
        }
        int[] var6 = new int[8];
        int[] var3 = var6;
        for (var4 = 0; 8 > var4; var4++) {
            var6[var4] = c.a(param1[var4], param2[var4] ^ -1);
        }
        return var3;
    }

    final long a(byte param0) {
        if (param0 >= -35) {
            field_k = null;
        }
        return ((me) this).field_b;
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) throws IOException {
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
                    var10 = MinerDisturbance.field_ab;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param1 + ((me) this).field_g > ((me) this).field_b) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((me) this).field_b = ((me) this).field_g - -(long)param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((me) this).field_e == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((me) this).field_e > ((me) this).field_g) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((me) this).field_g ^ -1L) < (((me) this).field_e - -(long)((me) this).field_c ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(26021);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0L == (((me) this).field_e ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((me) this).field_e - -(long)((me) this).field_a.length >= ((me) this).field_g - -(long)param1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)((long)((me) this).field_a.length + (((me) this).field_e + -((me) this).field_g));
                        ai.a(param0, param2, ((me) this).field_a, (int)(((me) this).field_g + -((me) this).field_e), var5_int);
                        ((me) this).field_g = ((me) this).field_g + (long)var5_int;
                        param1 = param1 - var5_int;
                        param2 = param2 + var5_int;
                        ((me) this).field_c = ((me) this).field_a.length;
                        this.a(26021);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param1 <= ((me) this).field_a.length) {
                            statePc = 38;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((me) this).field_g != ((me) this).field_d) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((me) this).field_f.a(0, ((me) this).field_g);
                        ((me) this).field_d = ((me) this).field_g;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((me) this).field_f.a(param2, param1, param0, 107);
                        ((me) this).field_d = ((me) this).field_d + (long)param1;
                        if (((me) this).field_n < ((me) this).field_d) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((me) this).field_n = ((me) this).field_d;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if (((me) this).field_g < ((me) this).field_i) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((long)((me) this).field_m + ((me) this).field_i > ((me) this).field_g) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((me) this).field_i < ((me) this).field_g) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((me) this).field_i ^ -1L) <= (((me) this).field_g - -(long)param1 ^ -1L)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((me) this).field_i;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((me) this).field_g;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((me) this).field_g + (long)param1 ^ -1L) >= (((me) this).field_i ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((me) this).field_g - -(long)param1 ^ -1L) >= ((long)((me) this).field_m + ((me) this).field_i ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((me) this).field_i + (long)((me) this).field_m ^ -1L) >= (((me) this).field_g ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((me) this).field_g + (long)param1 < (long)((me) this).field_m + ((me) this).field_i) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = ((me) this).field_i + (long)((me) this).field_m;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7 = ((me) this).field_g - -(long)param1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var5_long <= -1L) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
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
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        ai.a(param0, (int)((long)param2 - (-var5_long + ((me) this).field_g)), ((me) this).field_o, (int)(-((me) this).field_i + var5_long), var9);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((me) this).field_g = ((me) this).field_g + (long)param1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return;
                }
                case 38: {
                    try {
                        if (0 >= param1) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((((me) this).field_e ^ -1L) == 0L) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((me) this).field_e = ((me) this).field_g;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ai.a(param0, param2, ((me) this).field_a, (int)(-((me) this).field_e + ((me) this).field_g), param1);
                        ((me) this).field_g = ((me) this).field_g + (long)param1;
                        if ((long)((me) this).field_c < ((me) this).field_g - ((me) this).field_e) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((me) this).field_c = (int)(((me) this).field_g + -((me) this).field_e);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return;
                }
                case 46: {
                    try {
                        if (param3) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        me.a(108, true);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var5 = (IOException) (Object) caughtException;
                    ((me) this).field_d = -1L;
                    throw var5;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        int var1 = 63 % ((50 - param0) / 63);
        field_l = null;
        field_k = null;
    }

    final void a(byte[] param0, int param1) throws IOException {
        ((me) this).a(param0, 0, param0.length, -1);
        if (param1 <= 111) {
            me.a(-92, true);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
                    var14 = MinerDisturbance.field_ab;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.length >= param2 + param1) {
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
                        throw new ArrayIndexOutOfBoundsException(param2 + param1 + -param0.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((me) this).field_e == (long)param3) {
                            statePc = 9;
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
                        if ((((me) this).field_e ^ -1L) < (((me) this).field_g ^ -1L)) {
                            statePc = 9;
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
                        if ((((me) this).field_e - -(long)((me) this).field_c ^ -1L) <= ((long)param2 + ((me) this).field_g ^ -1L)) {
                            statePc = 7;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ai.a(((me) this).field_a, (int)(-((me) this).field_e + ((me) this).field_g), param0, param1, param2);
                        ((me) this).field_g = ((me) this).field_g + (long)param2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((me) this).field_g;
                        var7 = param1;
                        var8 = param2;
                        if (((me) this).field_g < ((me) this).field_i) {
                            statePc = 15;
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
                        if (((long)((me) this).field_m + ((me) this).field_i ^ -1L) >= (((me) this).field_g ^ -1L)) {
                            statePc = 15;
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
                        var9_int = (int)(((me) this).field_i + -((me) this).field_g + (long)((me) this).field_m);
                        if (var9_int > param2) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = param2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ai.a(((me) this).field_o, (int)(((me) this).field_g - ((me) this).field_i), param0, param1, var9_int);
                        ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((me) this).field_o.length >= param2) {
                            statePc = 21;
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
                        ((me) this).field_f.a(0, ((me) this).field_g);
                        ((me) this).field_d = ((me) this).field_g;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int = ((me) this).field_f.b(32, param2, param0, param1);
                        if (var9_int != -1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((me) this).field_d = ((me) this).field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                        param2 = param2 - var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (0 >= param2) {
                            statePc = 26;
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
                        this.c(20);
                        var9_int = param2;
                        if (var9_int > ((me) this).field_m) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = ((me) this).field_m;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ai.a(((me) this).field_o, 0, param0, param1, var9_int);
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (0L == (((me) this).field_e ^ -1L)) {
                            statePc = 54;
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
                        if ((((me) this).field_e ^ -1L) >= (((me) this).field_g ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1 > (param2 ^ -1)) {
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9_int = param1 - -(int)(-((me) this).field_g + ((me) this).field_e);
                        if (var9_int <= param1 + param2) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = param1 + param2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param1 >= var9_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param1++;
                        param0[param1] = (byte) 0;
                        param2--;
                        ((me) this).field_g = ((me) this).field_g + 1L;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((me) this).field_e ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 37;
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
                        if (var5_long - -(long)var8 > ((me) this).field_e) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((((me) this).field_e ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 41;
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
                        if (var5_long >= ((me) this).field_e - -(long)((me) this).field_c) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = var5_long;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = ((me) this).field_e;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5_long >= (long)((me) this).field_c + ((me) this).field_e) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) > ((long)((me) this).field_c + ((me) this).field_e ^ -1L)) {
                            statePc = 44;
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
                        var11 = ((me) this).field_e - -(long)((me) this).field_c;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((long)var8 + var5_long <= ((me) this).field_e) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((long)((me) this).field_c + ((me) this).field_e ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 47;
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
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var9 ^ -1L) >= 0L) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var13 = (int)(-var9 + var11);
                        ai.a(((me) this).field_a, (int)(-((me) this).field_e + var9), param0, var7 - -(int)(-var5_long + var9), var13);
                        if (var11 <= ((me) this).field_g) {
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
                        param2 = (int)((long)param2 - (var11 - ((me) this).field_g));
                        ((me) this).field_g = var11;
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
                    ((me) this).field_d = -1L;
                    throw var5;
                }
                case 54: {
                    if (param2 > 0) {
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

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          if (0L == (((me) this).field_e ^ -1L)) {
            break L0;
          } else {
            L1: {
              if ((((me) this).field_d ^ -1L) == (((me) this).field_e ^ -1L)) {
                break L1;
              } else {
                ((me) this).field_f.a(0, ((me) this).field_e);
                ((me) this).field_d = ((me) this).field_e;
                break L1;
              }
            }
            L2: {
              ((me) this).field_f.a(0, ((me) this).field_c, ((me) this).field_a, param0 + -25931);
              ((me) this).field_d = ((me) this).field_d + (long)((me) this).field_c;
              if (((me) this).field_n >= ((me) this).field_d) {
                break L2;
              } else {
                ((me) this).field_n = ((me) this).field_d;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((((me) this).field_e ^ -1L) > (((me) this).field_i ^ -1L)) {
                  break L4;
                } else {
                  if (((long)((me) this).field_m + ((me) this).field_i ^ -1L) < (((me) this).field_e ^ -1L)) {
                    var2 = ((me) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((me) this).field_e ^ -1L) < (((me) this).field_i ^ -1L)) {
                break L3;
              } else {
                if (((long)((me) this).field_c + ((me) this).field_e ^ -1L) < (((me) this).field_i ^ -1L)) {
                  var2 = ((me) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((me) this).field_i >= (long)((me) this).field_c + ((me) this).field_e) {
                  break L6;
                } else {
                  if ((long)((me) this).field_c + ((me) this).field_e <= ((me) this).field_i + (long)((me) this).field_m) {
                    var4 = ((me) this).field_e - -(long)((me) this).field_c;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((me) this).field_e >= ((me) this).field_i + (long)((me) this).field_m) {
                break L5;
              } else {
                if ((long)((me) this).field_m + ((me) this).field_i > ((me) this).field_e - -(long)((me) this).field_c) {
                  break L5;
                } else {
                  var4 = (long)((me) this).field_m + ((me) this).field_i;
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (var2 >= var4) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  ai.a(((me) this).field_a, (int)(-((me) this).field_e + var2), ((me) this).field_o, (int)(-((me) this).field_i + var2), var6);
                  break L7;
                }
              }
            }
            ((me) this).field_e = -1L;
            ((me) this).field_c = 0;
            break L0;
          }
        }
        L8: {
          if (param0 == 26021) {
            break L8;
          } else {
            ((me) this).field_m = 24;
            break L8;
          }
        }
    }

    private final void c(int param0) throws IOException {
        int var3 = 0;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        ((me) this).field_m = 0;
        if (!((((me) this).field_d ^ -1L) == (((me) this).field_g ^ -1L))) {
            ((me) this).field_f.a(0, ((me) this).field_g);
            ((me) this).field_d = ((me) this).field_g;
        }
        ((me) this).field_i = ((me) this).field_g;
        int var2 = 94 % ((-66 - param0) / 53);
        while (((me) this).field_o.length > ((me) this).field_m) {
            var3 = -((me) this).field_m + ((me) this).field_o.length;
            if (!(200000000 >= var3)) {
                var3 = 200000000;
            }
            var4 = ((me) this).field_f.b(6, var3, ((me) this).field_o, ((me) this).field_m);
            // ifeq L161
            ((me) this).field_m = ((me) this).field_m + var4;
            ((me) this).field_d = ((me) this).field_d + (long)var4;
        }
    }

    final void b(int param0) throws IOException {
        this.a(param0 ^ -7618);
        ((me) this).field_f.b(-110);
        if (param0 != -30821) {
            me.a(-62, false);
        }
    }

    final static void a(int param0, boolean param1) {
        if (-1 == (param0 ^ -1)) {
            mm.a(false, df.field_b, 2, 1, true, 2);
        }
        if (!(1 != param0)) {
            mm.a(false, hl.field_a, 2, 1, true, 2);
        }
        if (param1) {
            me.a(7, false);
        }
    }

    me(an param0, int param1, int param2) throws IOException {
        ((me) this).field_c = 0;
        ((me) this).field_e = -1L;
        ((me) this).field_i = -1L;
        ((me) this).field_f = param0;
        ((me) this).field_n = param0.a((byte) 122);
        ((me) this).field_b = param0.a((byte) 122);
        ((me) this).field_o = new byte[param1];
        ((me) this).field_g = 0L;
        ((me) this).field_a = new byte[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_l = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_k = new ea[2];
    }
}
