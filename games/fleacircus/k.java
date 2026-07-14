/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class k {
    private long field_k;
    private byte[] field_f;
    private long field_g;
    private int field_h;
    static int[] field_l;
    static bi[] field_c;
    private long field_n;
    private rl field_m;
    private byte[] field_b;
    private int field_i;
    private long field_j;
    static int field_a;
    private long field_d;
    static String field_e;
    private long field_o;

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
                    var14 = fleas.field_A ? 1 : 0;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param2 + (param1 + -param0.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param3 == 6520) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((k) this).field_n = -84L;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((k) this).field_j == -1L) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((k) this).field_d < ((k) this).field_j) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((long)((k) this).field_h + ((k) this).field_j >= (long)param2 + ((k) this).field_d) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        dm.a(((k) this).field_b, (int)(-((k) this).field_j + ((k) this).field_d), param0, param1, param2);
                        ((k) this).field_d = ((k) this).field_d + (long)param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var5_long = ((k) this).field_d;
                        var7 = param1;
                        var8 = param2;
                        if ((((k) this).field_d ^ -1L) > (((k) this).field_g ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((long)((k) this).field_i + ((k) this).field_g ^ -1L) >= (((k) this).field_d ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)((k) this).field_i - (-((k) this).field_g + ((k) this).field_d));
                        if (param2 >= var9_int) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        dm.a(((k) this).field_f, (int)(-((k) this).field_g + ((k) this).field_d), param0, param1, var9_int);
                        param2 = param2 - var9_int;
                        param1 = param1 + var9_int;
                        ((k) this).field_d = ((k) this).field_d + (long)var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2 > ((k) this).field_f.length) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((param2 ^ -1) >= -1) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.b(98);
                        var9_int = param2;
                        if (((k) this).field_i >= var9_int) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int = ((k) this).field_i;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dm.a(((k) this).field_f, 0, param0, param1, var9_int);
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        ((k) this).field_d = ((k) this).field_d + (long)var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((k) this).field_m.a(((k) this).field_d, (byte) -127);
                        ((k) this).field_k = ((k) this).field_d;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (0 >= param2) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = ((k) this).field_m.a(param0, param1, 0, param2);
                        if (0 != (var9_int ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((k) this).field_k = ((k) this).field_k + (long)var9_int;
                        ((k) this).field_d = ((k) this).field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1L != ((k) this).field_j) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((k) this).field_d ^ -1L) <= (((k) this).field_j ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 >= param2) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9_int = (int)(-((k) this).field_d + ((k) this).field_j) + param1;
                        if (param2 + param1 >= var9_int) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var9_int <= param1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param1++;
                        param0[param1] = (byte) 0;
                        param2--;
                        ((k) this).field_d = ((k) this).field_d + 1L;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((k) this).field_j ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((long)var8 + var5_long > ((k) this).field_j) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (((k) this).field_j > var5_long) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var5_long ^ -1L) > (((k) this).field_j + (long)((k) this).field_h ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = var5_long;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = ((k) this).field_j;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var5_long ^ -1L) <= (((k) this).field_j - -(long)((k) this).field_h ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) <= (((k) this).field_j - -(long)((k) this).field_h ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((long)var8 + var5_long <= ((k) this).field_j) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) < (((k) this).field_j + (long)((k) this).field_h ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = (long)((k) this).field_h + ((k) this).field_j;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var11 <= var9) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (int)(-var9 + var11);
                        dm.a(((k) this).field_b, (int)(var9 - ((k) this).field_j), param0, var7 - -(int)(var9 - var5_long), var13);
                        if ((var11 ^ -1L) < (((k) this).field_d ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param2 = (int)((long)param2 - (var11 - ((k) this).field_d));
                        ((k) this).field_d = var11;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5 = (IOException) (Object) caughtException;
                    ((k) this).field_k = -1L;
                    throw var5;
                }
                case 56: {
                    if (param2 > 0) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    throw new EOFException();
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        if (param0 != -40) {
            field_a = 108;
        }
        df.field_b.d(param2, param1);
        if (!param3) {
        } else {
            var4 = 2 * (bf.field_b % df.field_b.field_w);
            if (df.field_b.field_w <= var4) {
                var4 = -var4 - (-df.field_b.field_w - df.field_b.field_w);
            }
            if (var4 < 10) {
                var4 = 10;
            } else {
                if (!(-40 + df.field_b.field_w >= var4)) {
                    var4 = -40 + df.field_b.field_w;
                }
            }
            qe.a(0, 30, df.field_b, 0, var4, param1, 80, 5120, param2);
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = -66 / ((29 - param3) / 41);
                        if (((k) this).field_o < (long)param2 + ((k) this).field_d) {
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
                        ((k) this).field_o = ((k) this).field_d + (long)param2;
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
                        if (((k) this).field_j == -1L) {
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
                        if ((((k) this).field_d ^ -1L) > (((k) this).field_j ^ -1L)) {
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
                        if (((k) this).field_d > ((k) this).field_j - -(long)((k) this).field_h) {
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
                        this.a((byte) -109);
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
                        if (((k) this).field_j == -1L) {
                            statePc = 12;
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
                        if (((k) this).field_d - -(long)param2 <= ((k) this).field_j - -(long)((k) this).field_b.length) {
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
                        var6_int = (int)(-((k) this).field_d - (-((k) this).field_j - (long)((k) this).field_b.length));
                        dm.a(param1, param0, ((k) this).field_b, (int)(-((k) this).field_j + ((k) this).field_d), var6_int);
                        param0 = param0 + var6_int;
                        ((k) this).field_d = ((k) this).field_d + (long)var6_int;
                        param2 = param2 - var6_int;
                        ((k) this).field_h = ((k) this).field_b.length;
                        this.a((byte) 41);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((k) this).field_b.length < param2) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((k) this).field_d == ((k) this).field_k) {
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
                        ((k) this).field_m.a(((k) this).field_d, (byte) -114);
                        ((k) this).field_k = ((k) this).field_d;
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
                        ((k) this).field_m.a((byte) 110, param2, param0, param1);
                        ((k) this).field_k = ((k) this).field_k + (long)param2;
                        if (((k) this).field_n < ((k) this).field_k) {
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
                        ((k) this).field_n = ((k) this).field_k;
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
                        var6 = -1L;
                        var8 = -1L;
                        if (((k) this).field_d < ((k) this).field_g) {
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
                        if ((((k) this).field_g + (long)((k) this).field_i ^ -1L) >= (((k) this).field_d ^ -1L)) {
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
                        var6 = ((k) this).field_d;
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
                        if ((((k) this).field_g ^ -1L) > (((k) this).field_d ^ -1L)) {
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
                        if ((((k) this).field_g ^ -1L) > ((long)param2 + ((k) this).field_d ^ -1L)) {
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
                        var6 = ((k) this).field_g;
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
                        if ((((k) this).field_g ^ -1L) <= ((long)param2 + ((k) this).field_d ^ -1L)) {
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
                        if ((long)((k) this).field_i + ((k) this).field_g < ((k) this).field_d - -(long)param2) {
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
                        var8 = (long)param2 + ((k) this).field_d;
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
                        if (((k) this).field_d >= (long)((k) this).field_i + ((k) this).field_g) {
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
                        if (((long)((k) this).field_i + ((k) this).field_g ^ -1L) >= (((k) this).field_d + (long)param2 ^ -1L)) {
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
                        var8 = ((k) this).field_g + (long)((k) this).field_i;
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
                        if (0L <= (var6 ^ -1L)) {
                            statePc = 37;
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
                        if ((var6 ^ -1L) > (var8 ^ -1L)) {
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10 = (int)(-var6 + var8);
                        dm.a(param1, (int)((long)param0 - (-var6 - -((k) this).field_d)), ((k) this).field_f, (int)(-((k) this).field_g + var6), var10);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((k) this).field_d = ((k) this).field_d + (long)param2;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (param2 > 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((((k) this).field_j ^ -1L) != 0L) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((k) this).field_j = ((k) this).field_d;
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
                        dm.a(param1, param0, ((k) this).field_b, (int)(-((k) this).field_j + ((k) this).field_d), param2);
                        ((k) this).field_d = ((k) this).field_d + (long)param2;
                        if (((long)((k) this).field_h ^ -1L) <= (((k) this).field_d - ((k) this).field_j ^ -1L)) {
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
                        ((k) this).field_h = (int)(((k) this).field_d + -((k) this).field_j);
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
                    ((k) this).field_k = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        if (param0 != -28354) {
            return;
        }
        if (!(sg.field_h == null)) {
            sg.field_h.h(param0 ^ -28354);
            sg.field_h = null;
        }
    }

    public static void a(int param0) {
        if (param0 != -40) {
            k.c(70);
        }
        field_e = null;
        field_l = null;
        field_c = null;
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          var2 = 50 / ((param0 - -24) / 54);
          if (-1L != ((k) this).field_j) {
            L1: {
              if ((((k) this).field_k ^ -1L) == (((k) this).field_j ^ -1L)) {
                break L1;
              } else {
                ((k) this).field_m.a(((k) this).field_j, (byte) -114);
                ((k) this).field_k = ((k) this).field_j;
                break L1;
              }
            }
            L2: {
              ((k) this).field_m.a((byte) 109, ((k) this).field_h, 0, ((k) this).field_b);
              ((k) this).field_k = ((k) this).field_k + (long)((k) this).field_h;
              if (((k) this).field_k > ((k) this).field_n) {
                ((k) this).field_n = ((k) this).field_k;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if ((((k) this).field_j ^ -1L) > (((k) this).field_g ^ -1L)) {
                  break L4;
                } else {
                  if (((k) this).field_j >= ((k) this).field_g - -(long)((k) this).field_i) {
                    break L4;
                  } else {
                    var3 = ((k) this).field_j;
                    break L3;
                  }
                }
              }
              if ((((k) this).field_j ^ -1L) < (((k) this).field_g ^ -1L)) {
                break L3;
              } else {
                if (((long)((k) this).field_h + ((k) this).field_j ^ -1L) >= (((k) this).field_g ^ -1L)) {
                  break L3;
                } else {
                  var3 = ((k) this).field_g;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((((k) this).field_g ^ -1L) <= ((long)((k) this).field_h + ((k) this).field_j ^ -1L)) {
                  break L6;
                } else {
                  if (((long)((k) this).field_h + ((k) this).field_j ^ -1L) >= (((k) this).field_g - -(long)((k) this).field_i ^ -1L)) {
                    var5 = (long)((k) this).field_h + ((k) this).field_j;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((long)((k) this).field_i + ((k) this).field_g ^ -1L) >= (((k) this).field_j ^ -1L)) {
                break L5;
              } else {
                if (((long)((k) this).field_h + ((k) this).field_j ^ -1L) <= (((k) this).field_g + (long)((k) this).field_i ^ -1L)) {
                  var5 = ((k) this).field_g + (long)((k) this).field_i;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var3 <= -1L) {
                break L7;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  dm.a(((k) this).field_b, (int)(var3 - ((k) this).field_j), ((k) this).field_f, (int)(-((k) this).field_g + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((k) this).field_h = 0;
            ((k) this).field_j = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 < 47) {
            k.a(92, 3, 126, true);
        }
        ((k) this).field_i = 0;
        if (!((((k) this).field_d ^ -1L) == (((k) this).field_k ^ -1L))) {
            ((k) this).field_m.a(((k) this).field_d, (byte) -121);
            ((k) this).field_k = ((k) this).field_d;
        }
        ((k) this).field_g = ((k) this).field_d;
        while (((k) this).field_f.length > ((k) this).field_i) {
            var2 = -((k) this).field_i + ((k) this).field_f.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((k) this).field_m.a(((k) this).field_f, ((k) this).field_i, 0, var2);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((k) this).field_k = ((k) this).field_k + (long)var3;
            ((k) this).field_i = ((k) this).field_i + var3;
        }
    }

    final static void a(int param0, wk param1) {
        uc.a((byte) 5, true, param1);
        if (param0 != 0) {
            k.a(-15, -38, 84, true);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (-1L < (param1 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            if (param0 <= -103) {
              break L0;
            } else {
              ((k) this).field_b = null;
              break L0;
            }
          }
          ((k) this).field_d = param1;
          return;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((k) this).a(param1, 0, param1.length, 6520);
        if (param0 != 631) {
            ((k) this).field_b = null;
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) 74);
        if (param0 != -70) {
            k.a(-30, -73, -71, false);
        }
        ((k) this).field_m.b(-1);
    }

    final long c(byte param0) {
        if (param0 >= -46) {
            return 49L;
        }
        return ((k) this).field_o;
    }

    k(rl param0, int param1, int param2) throws IOException {
        ((k) this).field_g = -1L;
        ((k) this).field_h = 0;
        ((k) this).field_j = -1L;
        ((k) this).field_m = param0;
        ((k) this).field_n = param0.c(2049105808);
        ((k) this).field_o = param0.c(2049105808);
        ((k) this).field_b = new byte[param2];
        ((k) this).field_f = new byte[param1];
        ((k) this).field_d = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_a = 16777215;
        field_e = "Please try again in a few minutes.";
    }
}
