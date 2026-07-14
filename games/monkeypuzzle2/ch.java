/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ch {
    private pl field_b;
    private long field_n;
    private long field_h;
    private int field_m;
    private long field_a;
    private int field_l;
    private long field_e;
    private long field_g;
    private byte[] field_k;
    private long field_f;
    static java.awt.Color field_i;
    private byte[] field_c;
    static ad field_j;
    static lk field_d;

    final void a(int param0, byte[] param1) throws IOException {
        ((ch) this).a(param1, param1.length, 0, (byte) 117);
        if (param0 != 3805) {
            ((ch) this).field_k = null;
        }
    }

    final static void b(int param0) {
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        em.field_B = 480;
        fg.field_b = 0;
        while ((mb.field_e.b(127) ^ -1) < -1) {
            ug discarded$0 = mb.field_e.d(4011);
        }
        if (param0 > -106) {
            field_j = null;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
                    var10 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ch) this).field_h - -(long)param3 > ((ch) this).field_n) {
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
                        ((ch) this).field_n = (long)param3 + ((ch) this).field_h;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((ch) this).field_a ^ -1L) == 0L) {
                            statePc = 10;
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
                        if (((ch) this).field_h >= ((ch) this).field_a) {
                            statePc = 7;
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
                        this.b((byte) -109);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((long)((ch) this).field_l + ((ch) this).field_a >= ((ch) this).field_h) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.b((byte) -109);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0L == (((ch) this).field_a ^ -1L)) {
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
                        if (((ch) this).field_a + (long)((ch) this).field_c.length < (long)param3 + ((ch) this).field_h) {
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)(-((ch) this).field_h - (-((ch) this).field_a - (long)((ch) this).field_c.length));
                        gl.a(param0, param1, ((ch) this).field_c, (int)(((ch) this).field_h + -((ch) this).field_a), var5_int);
                        ((ch) this).field_h = ((ch) this).field_h + (long)var5_int;
                        param1 = param1 + var5_int;
                        param3 = param3 - var5_int;
                        ((ch) this).field_l = ((ch) this).field_c.length;
                        this.b((byte) -109);
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
                        if (((ch) this).field_c.length >= param3) {
                            statePc = 41;
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
                        if ((((ch) this).field_h ^ -1L) == (((ch) this).field_g ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ch) this).field_b.a(0, ((ch) this).field_h);
                        ((ch) this).field_g = ((ch) this).field_h;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ch) this).field_b.a(param1, (byte) 68, param0, param3);
                        ((ch) this).field_g = ((ch) this).field_g + (long)param3;
                        if ((((ch) this).field_f ^ -1L) <= (((ch) this).field_g ^ -1L)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((ch) this).field_f = ((ch) this).field_g;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if (((ch) this).field_h < ((ch) this).field_e) {
                            statePc = 22;
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
                        if ((((ch) this).field_h ^ -1L) > (((ch) this).field_e + (long)((ch) this).field_m ^ -1L)) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((ch) this).field_h ^ -1L) < (((ch) this).field_e ^ -1L)) {
                            statePc = 27;
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
                        if (((long)param3 + ((ch) this).field_h ^ -1L) < (((ch) this).field_e ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((ch) this).field_e;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_long = ((ch) this).field_h;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((ch) this).field_h - -(long)param3 ^ -1L) >= (((ch) this).field_e ^ -1L)) {
                            statePc = 30;
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
                        if ((((ch) this).field_h - -(long)param3 ^ -1L) >= ((long)((ch) this).field_m + ((ch) this).field_e ^ -1L)) {
                            statePc = 34;
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
                        if ((long)((ch) this).field_m + ((ch) this).field_e <= ((ch) this).field_h) {
                            statePc = 35;
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
                        if ((((ch) this).field_e + (long)((ch) this).field_m ^ -1L) >= (((ch) this).field_h + (long)param3 ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7 = (long)((ch) this).field_m + ((ch) this).field_e;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = ((ch) this).field_h + (long)param3;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (0L <= (var5_long ^ -1L)) {
                            statePc = 39;
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
                        if (var7 > var5_long) {
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
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        gl.a(param0, (int)(-((ch) this).field_h + (var5_long + (long)param1)), ((ch) this).field_k, (int)(-((ch) this).field_e + var5_long), var9);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((ch) this).field_h = ((ch) this).field_h + (long)param3;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return;
                }
                case 41: {
                    try {
                        if (param2 >= 31) {
                            statePc = 43;
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
                    return;
                }
                case 43: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 51;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((((ch) this).field_a ^ -1L) != 0L) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((ch) this).field_a = ((ch) this).field_h;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        gl.a(param0, param1, ((ch) this).field_c, (int)(((ch) this).field_h - ((ch) this).field_a), param3);
                        ((ch) this).field_h = ((ch) this).field_h + (long)param3;
                        if ((long)((ch) this).field_l < -((ch) this).field_a + ((ch) this).field_h) {
                            statePc = 48;
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
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((ch) this).field_l = (int)(((ch) this).field_h - ((ch) this).field_a);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return;
                }
                case 50: {
                    var5 = (IOException) (Object) caughtException;
                    ((ch) this).field_g = -1L;
                    throw var5;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -9 % ((param0 - 10) / 63);
        field_d = null;
        field_j = null;
    }

    final long c(byte param0) {
        if (param0 > -66) {
            return -86L;
        }
        return ((ch) this).field_n;
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param3 > 18) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        if (param0.length >= param1 + param2) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param0.length + (param2 + param1));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((ch) this).field_a == -1L) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((ch) this).field_h < ((ch) this).field_a) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((ch) this).field_h - -(long)param1 ^ -1L) >= ((long)((ch) this).field_l + ((ch) this).field_a ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        gl.a(((ch) this).field_c, (int)(-((ch) this).field_a + ((ch) this).field_h), param0, param2, param1);
                        ((ch) this).field_h = ((ch) this).field_h + (long)param1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var5_long = ((ch) this).field_h;
                        var7 = param2;
                        var8 = param1;
                        if (((ch) this).field_h < ((ch) this).field_e) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((long)((ch) this).field_m + ((ch) this).field_e ^ -1L) < (((ch) this).field_h ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)((ch) this).field_m - ((ch) this).field_h - -((ch) this).field_e);
                        if (param1 >= var9_int) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        gl.a(((ch) this).field_k, (int)(((ch) this).field_h + -((ch) this).field_e), param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        ((ch) this).field_h = ((ch) this).field_h + (long)var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param1 <= ((ch) this).field_k.length) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ch) this).field_b.a(0, ((ch) this).field_h);
                        ((ch) this).field_g = ((ch) this).field_h;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param1 <= 0) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int = ((ch) this).field_b.a(param2, param0, (byte) -128, param1);
                        if (0 == (var9_int ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param2 = param2 + var9_int;
                        ((ch) this).field_g = ((ch) this).field_g + (long)var9_int;
                        param1 = param1 - var9_int;
                        ((ch) this).field_h = ((ch) this).field_h + (long)var9_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 > (param1 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a(-119);
                        var9_int = param1;
                        if (((ch) this).field_m >= var9_int) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = ((ch) this).field_m;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        gl.a(((ch) this).field_k, 0, param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        ((ch) this).field_h = ((ch) this).field_h + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((ch) this).field_a ^ -1L) != 0L) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((ch) this).field_h ^ -1L) <= (((ch) this).field_a ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((param1 ^ -1) < -1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = (int)(-((ch) this).field_h + ((ch) this).field_a) + param2;
                        if (var9_int <= param2 + param1) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param1 + param2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param2 >= var9_int) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param1--;
                        param2++;
                        param0[param2] = (byte) 0;
                        ((ch) this).field_h = ((ch) this).field_h + 1L;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((ch) this).field_a ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((((ch) this).field_a ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = ((ch) this).field_a;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (((ch) this).field_a > var5_long) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((((ch) this).field_a - -(long)((ch) this).field_l ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = var5_long;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((((ch) this).field_a - -(long)((ch) this).field_l ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) <= ((long)((ch) this).field_l + ((ch) this).field_a ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) >= (((ch) this).field_a ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((ch) this).field_a - -(long)((ch) this).field_l < var5_long - -(long)var8) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = var5_long + (long)var8;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = ((ch) this).field_a - -(long)((ch) this).field_l;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-1L >= var9) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var9 ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var13 = (int)(var11 - var9);
                        gl.a(((ch) this).field_c, (int)(var9 - ((ch) this).field_a), param0, var7 - -(int)(-var5_long + var9), var13);
                        if ((((ch) this).field_h ^ -1L) > (var11 ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param1 = (int)((long)param1 - (-((ch) this).field_h + var11));
                        ((ch) this).field_h = var11;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var5 = (IOException) (Object) caughtException;
                    ((ch) this).field_g = -1L;
                    throw var5;
                }
                case 55: {
                    if (0 < param1) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    throw new EOFException();
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ((ch) this).field_m = 0;
        if (param0 > -111) {
          return;
        } else {
          L0: {
            if (((ch) this).field_h != ((ch) this).field_g) {
              ((ch) this).field_b.a(0, ((ch) this).field_h);
              ((ch) this).field_g = ((ch) this).field_h;
              break L0;
            } else {
              break L0;
            }
          }
          ((ch) this).field_e = ((ch) this).field_h;
          L1: while (true) {
            L2: {
              if (((ch) this).field_k.length <= ((ch) this).field_m) {
                break L2;
              } else {
                L3: {
                  var2 = ((ch) this).field_k.length + -((ch) this).field_m;
                  if (var2 <= 200000000) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = ((ch) this).field_b.a(((ch) this).field_m, ((ch) this).field_k, (byte) -126, var2);
                if (var3 != -1) {
                  ((ch) this).field_m = ((ch) this).field_m + var3;
                  ((ch) this).field_g = ((ch) this).field_g + (long)var3;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        }
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == -109) {
            break L0;
          } else {
            var8 = null;
            rb discarded$1 = ch.a((String) null, 104);
            break L0;
          }
        }
        L1: {
          if (((ch) this).field_a != -1L) {
            L2: {
              if (((ch) this).field_g != ((ch) this).field_a) {
                ((ch) this).field_b.a(0, ((ch) this).field_a);
                ((ch) this).field_g = ((ch) this).field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((ch) this).field_b.a(0, (byte) 68, ((ch) this).field_c, ((ch) this).field_l);
              ((ch) this).field_g = ((ch) this).field_g + (long)((ch) this).field_l;
              if (((ch) this).field_f >= ((ch) this).field_g) {
                break L3;
              } else {
                ((ch) this).field_f = ((ch) this).field_g;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if (((ch) this).field_a < ((ch) this).field_e) {
                  break L5;
                } else {
                  if ((((ch) this).field_e - -(long)((ch) this).field_m ^ -1L) < (((ch) this).field_a ^ -1L)) {
                    var2 = ((ch) this).field_a;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if ((((ch) this).field_e ^ -1L) > (((ch) this).field_a ^ -1L)) {
                break L4;
              } else {
                if (((ch) this).field_e >= (long)((ch) this).field_l + ((ch) this).field_a) {
                  break L4;
                } else {
                  var2 = ((ch) this).field_e;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if ((((ch) this).field_a - -(long)((ch) this).field_l ^ -1L) >= (((ch) this).field_e ^ -1L)) {
                  break L7;
                } else {
                  if ((((ch) this).field_e - -(long)((ch) this).field_m ^ -1L) <= (((ch) this).field_a + (long)((ch) this).field_l ^ -1L)) {
                    var4 = (long)((ch) this).field_l + ((ch) this).field_a;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if ((((ch) this).field_a ^ -1L) <= ((long)((ch) this).field_m + ((ch) this).field_e ^ -1L)) {
                break L6;
              } else {
                if ((((ch) this).field_e - -(long)((ch) this).field_m ^ -1L) >= ((long)((ch) this).field_l + ((ch) this).field_a ^ -1L)) {
                  var4 = ((ch) this).field_e - -(long)((ch) this).field_m;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if ((var2 ^ -1L) >= 0L) {
                break L8;
              } else {
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  gl.a(((ch) this).field_c, (int)(var2 - ((ch) this).field_a), ((ch) this).field_k, (int)(-((ch) this).field_e + var2), var6);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            ((ch) this).field_a = -1L;
            ((ch) this).field_l = 0;
            break L1;
          } else {
            break L1;
          }
        }
    }

    ch(pl param0, int param1, int param2) throws IOException {
        ((ch) this).field_e = -1L;
        ((ch) this).field_l = 0;
        ((ch) this).field_a = -1L;
        ((ch) this).field_b = param0;
        ((ch) this).field_f = param0.c((byte) 124);
        ((ch) this).field_n = param0.c((byte) 124);
        ((ch) this).field_h = 0L;
        ((ch) this).field_k = new byte[param1];
        ((ch) this).field_c = new byte[param2];
    }

    final void a(byte param0, long param1) throws IOException {
        if (!(-1L >= (param1 ^ -1L))) {
            throw new IOException();
        }
        ((ch) this).field_h = param1;
        if (param0 < 82) {
            ch.b(-87);
        }
    }

    final static rb a(String param0, int param1) {
        String var2 = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != pj.field_a) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var6 = (CharSequence) (Object) param0;
              var2 = pl.a((byte) 109, var6);
              if (param1 == -1) {
                if (var2 != null) {
                  var3 = (rb) (Object) pj.field_a.a((long)var2.hashCode(), false);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_db;
                      var4 = pl.a((byte) 126, var7);
                      if (var4.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (rb) (Object) pj.field_a.b(-34);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        this.b((byte) -109);
        ((ch) this).field_b.a(19808);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new java.awt.Color(10040319);
    }
}
