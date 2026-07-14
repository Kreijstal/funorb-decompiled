/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im {
    private long field_a;
    private byte[] field_o;
    private long field_d;
    static fe[] field_c;
    static int field_h;
    private long field_e;
    private bj field_f;
    private long field_k;
    private long field_n;
    private long field_i;
    private int field_l;
    private byte[] field_m;
    private int field_b;
    static boolean field_g;
    static cr field_j;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
                    var10 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((im) this).field_d + (long)param1 > ((im) this).field_a) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((im) this).field_a = ((im) this).field_d - -(long)param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if ((((im) this).field_e ^ -1L) == 0L) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((im) this).field_e > ((im) this).field_d) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((im) this).field_d > (long)((im) this).field_l + ((im) this).field_e) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.a((byte) 58);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((im) this).field_e == -1L) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((long)param1 + ((im) this).field_d <= ((im) this).field_e - -(long)((im) this).field_m.length) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)(-((im) this).field_d - (-((im) this).field_e - (long)((im) this).field_m.length));
                        qq.a(param3, param2, ((im) this).field_m, (int)(((im) this).field_d + -((im) this).field_e), var5_int);
                        ((im) this).field_d = ((im) this).field_d + (long)var5_int;
                        param1 = param1 - var5_int;
                        param2 = param2 + var5_int;
                        ((im) this).field_l = ((im) this).field_m.length;
                        this.a((byte) 100);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((im) this).field_m.length < param1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((im) this).field_n == ((im) this).field_d) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((im) this).field_f.a(((im) this).field_d, false);
                        ((im) this).field_n = ((im) this).field_d;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((im) this).field_f.a(param1, param2, param3, false);
                        ((im) this).field_n = ((im) this).field_n + (long)param1;
                        if (((im) this).field_i < ((im) this).field_n) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((im) this).field_i = ((im) this).field_n;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = -1L;
                        if ((((im) this).field_k ^ -1L) < (((im) this).field_d ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((long)((im) this).field_b + ((im) this).field_k ^ -1L) >= (((im) this).field_d ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((im) this).field_d;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((im) this).field_k < ((im) this).field_d) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((((im) this).field_k ^ -1L) > (((im) this).field_d + (long)param1 ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_long = ((im) this).field_k;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7 = -1L;
                        if ((((im) this).field_d + (long)param1 ^ -1L) >= (((im) this).field_k ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((im) this).field_k - -(long)((im) this).field_b >= ((im) this).field_d + (long)param1) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((((im) this).field_k + (long)((im) this).field_b ^ -1L) >= (((im) this).field_d ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (((im) this).field_d + (long)param1 >= ((im) this).field_k + (long)((im) this).field_b) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
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
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var7 <= var5_long) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        qq.a(param3, (int)((long)param2 - (-var5_long - -((im) this).field_d)), ((im) this).field_o, (int)(-((im) this).field_k + var5_long), var9);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((im) this).field_d = ((im) this).field_d + (long)param1;
                        return;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7 = (long)((im) this).field_b + ((im) this).field_k;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7 = (long)param1 + ((im) this).field_d;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var7 <= var5_long) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        qq.a(param3, (int)((long)param2 - (-var5_long - -((im) this).field_d)), ((im) this).field_o, (int)(-((im) this).field_k + var5_long), var9);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((im) this).field_d = ((im) this).field_d + (long)param1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    try {
                        if ((param1 ^ -1) < -1) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((im) this).field_e == -1L) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((im) this).field_e = ((im) this).field_d;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        qq.a(param3, param2, ((im) this).field_m, (int)(((im) this).field_d - ((im) this).field_e), param1);
                        ((im) this).field_d = ((im) this).field_d + (long)param1;
                        if (((long)((im) this).field_l ^ -1L) <= (((im) this).field_d - ((im) this).field_e ^ -1L)) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((im) this).field_l = (int)(-((im) this).field_e + ((im) this).field_d);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return;
                }
                case 52: {
                    var5 = (IOException) (Object) caughtException;
                    ((im) this).field_n = -1L;
                    throw var5;
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
                    var14 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 + param1 <= param2.length) {
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
                        throw new ArrayIndexOutOfBoundsException(param1 + (param3 + -param2.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((im) this).field_e ^ -1L) == 0L) {
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
                        if ((((im) this).field_d ^ -1L) > (((im) this).field_e ^ -1L)) {
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
                        if ((long)((im) this).field_l + ((im) this).field_e >= (long)param3 + ((im) this).field_d) {
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
                        qq.a(((im) this).field_m, (int)(-((im) this).field_e + ((im) this).field_d), param2, param1, param3);
                        ((im) this).field_d = ((im) this).field_d + (long)param3;
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
                        var5_long = ((im) this).field_d;
                        if (param0 < -82) {
                            statePc = 11;
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
                    return;
                }
                case 11: {
                    try {
                        var7 = param1;
                        var8 = param3;
                        if (((im) this).field_k > ((im) this).field_d) {
                            statePc = 18;
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
                        if (((im) this).field_d < ((im) this).field_k - -(long)((im) this).field_b) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = (int)((long)((im) this).field_b - (((im) this).field_d + -((im) this).field_k));
                        if (var9_int > param3) {
                            statePc = 16;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9_int = param3;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        qq.a(((im) this).field_o, (int)(((im) this).field_d - ((im) this).field_k), param2, param1, var9_int);
                        param1 = param1 + var9_int;
                        param3 = param3 - var9_int;
                        ((im) this).field_d = ((im) this).field_d + (long)var9_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param3 > ((im) this).field_o.length) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param3 > 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.d(-122);
                        var9_int = param3;
                        if (((im) this).field_b < var9_int) {
                            statePc = 23;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = ((im) this).field_b;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        qq.a(((im) this).field_o, 0, param2, param1, var9_int);
                        param1 = param1 + var9_int;
                        ((im) this).field_d = ((im) this).field_d + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((im) this).field_f.a(((im) this).field_d, false);
                        ((im) this).field_n = ((im) this).field_d;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9_int = ((im) this).field_f.a(param3, (byte) -84, param2, param1);
                        if ((var9_int ^ -1) != 0) {
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((im) this).field_n = ((im) this).field_n + (long)var9_int;
                        param1 = param1 + var9_int;
                        ((im) this).field_d = ((im) this).field_d + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((((im) this).field_e ^ -1L) != 0L) {
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
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((((im) this).field_e ^ -1L) >= (((im) this).field_d ^ -1L)) {
                            statePc = 40;
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
                        if (-1 > (param3 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9_int = (int)(-((im) this).field_d + ((im) this).field_e) + param1;
                        if (param1 + param3 < var9_int) {
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
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9_int = param1 - -param3;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var9_int <= param1) {
                            statePc = 40;
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
                        param3--;
                        param1++;
                        param2[param1] = (byte) 0;
                        ((im) this).field_d = ((im) this).field_d + 1L;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((im) this).field_e ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 43;
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
                        if ((((im) this).field_e ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
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
                        var9 = ((im) this).field_e;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var5_long < ((im) this).field_e) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((long)((im) this).field_l + ((im) this).field_e ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = var5_long;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((im) this).field_e + (long)((im) this).field_l <= var5_long) {
                            statePc = 49;
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
                        if (((long)((im) this).field_l + ((im) this).field_e ^ -1L) >= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) >= (((im) this).field_e ^ -1L)) {
                            statePc = 54;
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
                        if (((long)var8 + var5_long ^ -1L) >= (((im) this).field_e - -(long)((im) this).field_l ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = (long)((im) this).field_l + ((im) this).field_e;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var9 ^ -1L) >= 0L) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var11 <= var9) {
                            statePc = 60;
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
                        var13 = (int)(-var9 + var11);
                        qq.a(((im) this).field_m, (int)(var9 + -((im) this).field_e), param2, (int)(var9 - var5_long) + var7, var13);
                        if ((((im) this).field_d ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param3 = (int)((long)param3 - (-((im) this).field_d + var11));
                        ((im) this).field_d = var11;
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
                    ((im) this).field_n = -1L;
                    throw var5;
                }
                case 60: {
                    if (-1 > (param3 ^ -1)) {
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
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long c(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = im.a(90);
        }
        return ((im) this).field_a;
    }

    final void b(int param0) throws IOException {
        this.a((byte) 31);
        if (param0 != -22473) {
            ((im) this).field_e = -20L;
        }
        ((im) this).field_f.a(0);
    }

    final void a(int param0, long param1) throws IOException {
        if (!((param1 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        if (param0 != -23669) {
            field_h = 5;
        }
        ((im) this).field_d = param1;
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((im) this).a(-102, param0, param1, param1.length);
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
            im.e(-33);
        }
        return !hj.field_b ? true : false;
    }

    public static void e(int param0) {
        if (param0 < 7) {
            return;
        }
        field_c = null;
        field_j = null;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if ((((im) this).field_e ^ -1L) != 0L) {
            L1: {
              if (((im) this).field_n != ((im) this).field_e) {
                ((im) this).field_f.a(((im) this).field_e, false);
                ((im) this).field_n = ((im) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((im) this).field_f.a(((im) this).field_l, 0, ((im) this).field_m, false);
              ((im) this).field_n = ((im) this).field_n + (long)((im) this).field_l;
              if (((im) this).field_n <= ((im) this).field_i) {
                break L2;
              } else {
                ((im) this).field_i = ((im) this).field_n;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((((im) this).field_k ^ -1L) < (((im) this).field_e ^ -1L)) {
                  break L4;
                } else {
                  if (((im) this).field_e >= (long)((im) this).field_b + ((im) this).field_k) {
                    break L4;
                  } else {
                    var2 = ((im) this).field_e;
                    break L3;
                  }
                }
              }
              if ((((im) this).field_k ^ -1L) > (((im) this).field_e ^ -1L)) {
                break L3;
              } else {
                if (((im) this).field_k < (long)((im) this).field_l + ((im) this).field_e) {
                  var2 = ((im) this).field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((((im) this).field_k ^ -1L) <= ((long)((im) this).field_l + ((im) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  if (((im) this).field_k + (long)((im) this).field_b < ((im) this).field_e - -(long)((im) this).field_l) {
                    break L6;
                  } else {
                    var4 = ((im) this).field_e - -(long)((im) this).field_l;
                    break L5;
                  }
                }
              }
              if (((long)((im) this).field_b + ((im) this).field_k ^ -1L) >= (((im) this).field_e ^ -1L)) {
                break L5;
              } else {
                if ((((im) this).field_k + (long)((im) this).field_b ^ -1L) >= (((im) this).field_e - -(long)((im) this).field_l ^ -1L)) {
                  var4 = (long)((im) this).field_b + ((im) this).field_k;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(var4 - var2);
                  qq.a(((im) this).field_m, (int)(-((im) this).field_e + var2), ((im) this).field_o, (int)(var2 + -((im) this).field_k), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((im) this).field_l = 0;
            ((im) this).field_e = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 >= 20) {
            break L8;
          } else {
            break L8;
          }
        }
    }

    im(bj param0, int param1, int param2) throws IOException {
        ((im) this).field_k = -1L;
        ((im) this).field_l = 0;
        ((im) this).field_e = -1L;
        ((im) this).field_f = param0;
        ((im) this).field_i = param0.b(0);
        ((im) this).field_a = param0.b(0);
        ((im) this).field_m = new byte[param2];
        ((im) this).field_o = new byte[param1];
        ((im) this).field_d = 0L;
    }

    private final void d(int param0) throws IOException {
        int var3 = 0;
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        ((im) this).field_b = 0;
        if ((((im) this).field_n ^ -1L) != (((im) this).field_d ^ -1L)) {
            ((im) this).field_f.a(((im) this).field_d, false);
            ((im) this).field_n = ((im) this).field_d;
        }
        ((im) this).field_k = ((im) this).field_d;
        int var2 = 15 % ((param0 - 69) / 57);
        while (((im) this).field_o.length > ((im) this).field_b) {
            var3 = -((im) this).field_b + ((im) this).field_o.length;
            if (!(var3 <= 200000000)) {
                var3 = 200000000;
            }
            var4 = ((im) this).field_f.a(var3, (byte) -90, ((im) this).field_o, ((im) this).field_b);
            if (0 == (var4 ^ -1)) {
                break;
            }
            ((im) this).field_b = ((im) this).field_b + var4;
            ((im) this).field_n = ((im) this).field_n + (long)var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 480;
    }
}
