/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class hb {
    private long field_i;
    private long field_e;
    private byte[] field_k;
    private long field_d;
    static double field_n;
    static String field_l;
    private byte[] field_g;
    private long field_a;
    static String[] field_m;
    private sg field_o;
    private int field_h;
    private long field_f;
    private int field_c;
    private long field_b;
    static String field_j;

    final void a(long param0, byte param1) throws IOException {
        if (param1 != 45) {
            return;
        }
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        ((hb) this).field_e = param0;
    }

    final void d(boolean param0) throws IOException {
        if (param0) {
            return;
        }
        this.b(83);
        ((hb) this).field_o.a((byte) 7);
    }

    final void b(byte[] param0, int param1, int param2, int param3) throws IOException {
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
                    var14 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.length < param3 + param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param2 - -param3 - param0.length);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((hb) this).field_d ^ -1L) == 0L) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((hb) this).field_e ^ -1L) > (((hb) this).field_d ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((hb) this).field_d - -(long)((hb) this).field_c >= (long)param3 + ((hb) this).field_e) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        fk.a(((hb) this).field_g, (int)(-((hb) this).field_d + ((hb) this).field_e), param0, param2, param3);
                        ((hb) this).field_e = ((hb) this).field_e + (long)param3;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var5_long = ((hb) this).field_e;
                        var7 = param2;
                        var8 = param3;
                        if (((hb) this).field_e < ((hb) this).field_f) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((hb) this).field_e < (long)((hb) this).field_h + ((hb) this).field_f) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)((hb) this).field_h + (((hb) this).field_f + -((hb) this).field_e));
                        if (param3 >= var9_int) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param3;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        fk.a(((hb) this).field_k, (int)(((hb) this).field_e - ((hb) this).field_f), param0, param2, var9_int);
                        param3 = param3 - var9_int;
                        ((hb) this).field_e = ((hb) this).field_e + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param3 > ((hb) this).field_k.length) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 < param3) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.c(true);
                        var9_int = param3;
                        if (((hb) this).field_h < var9_int) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((hb) this).field_h;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        fk.a(((hb) this).field_k, 0, param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        ((hb) this).field_e = ((hb) this).field_e + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((hb) this).field_o.a(((hb) this).field_e, (byte) 101);
                        ((hb) this).field_a = ((hb) this).field_e;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 <= param3) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((hb) this).field_o.a(-1, param2, param3, param0);
                        if (0 != var9_int) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((hb) this).field_e = ((hb) this).field_e + (long)var9_int;
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        ((hb) this).field_a = ((hb) this).field_a + (long)var9_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1L == ((hb) this).field_d) {
                            statePc = 57;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((hb) this).field_e ^ -1L) <= (((hb) this).field_d ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((param3 ^ -1) < -1) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param2 + (int)(-((hb) this).field_e + ((hb) this).field_d);
                        if (param3 + param2 >= var9_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param2 - -param3;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param2 >= var9_int) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param3--;
                        param2++;
                        param0[param2] = (byte) 0;
                        ((hb) this).field_e = ((hb) this).field_e + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (((hb) this).field_d < var5_long) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((((hb) this).field_d ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long < ((hb) this).field_d) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((hb) this).field_d + (long)((hb) this).field_c ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = var5_long;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = ((hb) this).field_d;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((long)((hb) this).field_c + ((hb) this).field_d <= var5_long) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var5_long - -(long)var8 < ((hb) this).field_d + (long)((hb) this).field_c) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = (long)((hb) this).field_c + ((hb) this).field_d;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var5_long - -(long)var8 ^ -1L) >= (((hb) this).field_d ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((((hb) this).field_d - -(long)((hb) this).field_c ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 57;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var9 < var11) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13 = (int)(-var9 + var11);
                        fk.a(((hb) this).field_g, (int)(-((hb) this).field_d + var9), param0, var7 - -(int)(var9 + -var5_long), var13);
                        if ((((hb) this).field_e ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        param3 = (int)((long)param3 - (var11 + -((hb) this).field_e));
                        ((hb) this).field_e = var11;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var5 = (IOException) (Object) caughtException;
                    ((hb) this).field_a = -1L;
                    throw var5;
                }
                case 57: {
                    if (param1 < -63) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    ((hb) this).field_d = -60L;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (param3 <= 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    throw new EOFException();
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        ((hb) this).field_h = 0;
        if ((((hb) this).field_a ^ -1L) != (((hb) this).field_e ^ -1L)) {
            ((hb) this).field_o.a(((hb) this).field_e, (byte) 91);
            ((hb) this).field_a = ((hb) this).field_e;
        }
        ((hb) this).field_f = ((hb) this).field_e;
        if (!param0) {
            return;
        }
        while (((hb) this).field_h < ((hb) this).field_k.length) {
            var2 = ((hb) this).field_k.length - ((hb) this).field_h;
            if (-200000001 > (var2 ^ -1)) {
                var2 = 200000000;
            }
            var3 = ((hb) this).field_o.a(-1, ((hb) this).field_h, var2, ((hb) this).field_k);
            if (-1 == var3) {
                break;
            }
            ((hb) this).field_h = ((hb) this).field_h + var3;
            ((hb) this).field_a = ((hb) this).field_a + (long)var3;
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        rb var3_ref_rb = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_149_0 = 0;
        int stackIn_225_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          if (-11 < (vk.field_p ^ -1)) {
            break L0;
          } else {
            if (0 == (1 << kb.field_b & fa.field_f)) {
              L1: {
                ic.field_t = ic.field_t + (bi.field_i >>> 2085217675 << kb.field_b);
                fa.field_f = fa.field_f | 1 << kb.field_b;
                lc.field_h = lc.field_h | 1 << kb.field_b;
                var1 = ii.a(fa.field_f & 255, 126);
                vk.a(246, (byte) 89, 9);
                if (var1 != 4) {
                  break L1;
                } else {
                  vk.a(245, (byte) 89, 10);
                  break L1;
                }
              }
              if (8 != var1) {
                break L0;
              } else {
                vk.a(244, (byte) 89, 11);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (25 <= vk.field_p) {
            L3: {
              if (0 == (1 << 8 + kb.field_b & fa.field_f)) {
                L4: {
                  ic.field_t = ic.field_t + (bi.field_i >>> 1251658219 << kb.field_b + 8);
                  fa.field_f = fa.field_f | 1 << kb.field_b + 8;
                  lc.field_h = lc.field_h | 1 << kb.field_b + 8;
                  var1 = ii.a(fa.field_f & 65280, 127);
                  vk.a(243, (byte) 89, 12);
                  if (var1 == -5) {
                    vk.a(242, (byte) 89, 13);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (-9 == var1) {
                  vk.a(241, (byte) 89, 14);
                  break L3;
                } else {
                  if (-51 < (vk.field_p ^ -1)) {
                    break L2;
                  } else {
                    if ((fa.field_f & 65536) != 0) {
                      break L2;
                    } else {
                      lc.field_h = lc.field_h | 65536;
                      fa.field_f = fa.field_f | 65536;
                      ic.field_t = ic.field_t + (bi.field_i >>> -953749301 << -440625296);
                      vk.a(240, (byte) 89, 15);
                      break L2;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            if (-51 < (vk.field_p ^ -1)) {
              break L2;
            } else {
              if ((fa.field_f & 65536) != 0) {
                break L2;
              } else {
                lc.field_h = lc.field_h | 65536;
                fa.field_f = fa.field_f | 65536;
                ic.field_t = ic.field_t + (bi.field_i >>> -953749301 << -440625296);
                vk.a(240, (byte) 89, 15);
                break L2;
              }
            }
          } else {
            if (-51 < (vk.field_p ^ -1)) {
              break L2;
            } else {
              if ((fa.field_f & 65536) != 0) {
                break L2;
              } else {
                lc.field_h = lc.field_h | 65536;
                fa.field_f = fa.field_f | 65536;
                ic.field_t = ic.field_t + (bi.field_i >>> -953749301 << -440625296);
                vk.a(240, (byte) 89, 15);
                break L2;
              }
            }
          }
        }
        L5: {
          if (vk.field_p <= oa.field_m) {
            break L5;
          } else {
            oa.field_m = vk.field_p;
            break L5;
          }
        }
        L6: {
          var1 = 0;
          if (kf.field_G != null) {
            var2 = 0;
            L7: while (true) {
              if (kf.field_G.length <= var2) {
                break L6;
              } else {
                var3_ref_rb = kf.field_G[var2];
                if (var3_ref_rb != null) {
                  if (var3_ref_rb.field_j >= 25) {
                    if (var3_ref_rb.field_j <= 30) {
                      var1 = 1;
                      break L6;
                    } else {
                      var2++;
                      continue L7;
                    }
                  } else {
                    var2++;
                    continue L7;
                  }
                } else {
                  var2++;
                  continue L7;
                }
              }
            }
          } else {
            break L6;
          }
        }
        L8: {
          L9: {
            if (pg.field_e) {
              break L9;
            } else {
              if (lk.field_b < qh.field_a[kb.field_b]) {
                break L9;
              } else {
                if (var1 != 0) {
                  break L9;
                } else {
                  if ((kd.field_a ^ -1) != 0) {
                    break L9;
                  } else {
                    if (uf.field_p >= 0) {
                      L10: {
                        jg.field_b = jg.field_b + 1;
                        if (jg.field_b > 50) {
                          break L10;
                        } else {
                          if (kb.field_b == 7) {
                            break L10;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L11: {
                        L12: {
                          jg.field_b = 0;
                          kh.field_d = 255;
                          if ((kb.field_b ^ -1) == -8) {
                            break L12;
                          } else {
                            L13: {
                              if ((kb.field_b ^ -1) != -3) {
                                break L13;
                              } else {
                                if (ob.field_l < -1) {
                                  break L13;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            gb.a(true, 5, -128);
                            break L11;
                          }
                        }
                        L14: {
                          lk.field_e = lk.field_e + oa.field_m * 100;
                          ic.field_t = ic.field_t - 100 * oa.field_m;
                          if (-8 != kb.field_b) {
                            break L14;
                          } else {
                            lk.field_e = lk.field_e + 5000;
                            ic.field_t = ic.field_t - 5000;
                            break L14;
                          }
                        }
                        me.a(false);
                        gb.a(true, 6, -128);
                        pk.a((byte) -96, 5, false);
                        break L11;
                      }
                      vk.field_p = 0;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
          }
          if (jg.field_b > 0) {
            jg.field_b = jg.field_b - 1;
            break L8;
          } else {
            break L8;
          }
        }
        L15: {
          if (param0) {
            break L15;
          } else {
            field_j = null;
            break L15;
          }
        }
        L16: {
          cb.field_a = 15 * cb.field_a / 16 + -1;
          if (0 >= ia.field_hb) {
            break L16;
          } else {
            if (0 == kd.field_a) {
              L17: {
                L18: {
                  ia.field_hb = ia.field_hb + 1;
                  if (50 >= ia.field_hb) {
                    break L18;
                  } else {
                    if (7 > kb.field_b) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                if (-101 >= ia.field_hb) {
                  break L16;
                } else {
                  break L17;
                }
              }
              ia.field_hb = 0;
              vk.field_p = 0;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L19: {
          if (cb.field_a >= 0) {
            break L19;
          } else {
            cb.field_a = 0;
            break L19;
          }
        }
        L20: {
          if (0 <= ve.field_b) {
            pl.field_a = 0;
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (cb.field_a <= -129) {
            break L21;
          } else {
            if (0 >= vk.field_p) {
              break L21;
            } else {
              cb.field_a = 128;
              break L21;
            }
          }
        }
        L22: {
          if (-1 < pl.field_a) {
            ci.field_ib = 256;
            ic.field_t = ic.field_t - pl.field_a;
            lk.field_e = lk.field_e + pl.field_a;
            pl.field_a = 0;
            me.a(false);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          ci.field_ib = 15 * ci.field_ib / 16 - 1;
          if (-1 >= (ci.field_ib ^ -1)) {
            break L23;
          } else {
            ci.field_ib = 0;
            break L23;
          }
        }
        L24: {
          if (0 >= fg.field_a) {
            break L24;
          } else {
            fg.field_a = fg.field_a - 1;
            if (0 >= fg.field_a) {
              bi.field_h = bi.field_h - 1;
              if ((bi.field_h ^ -1) < -1) {
                fg.field_a = 500;
                break L24;
              } else {
                break L24;
              }
            } else {
              break L24;
            }
          }
        }
        L25: {
          if (ci.field_ib < 128) {
            ci.field_ib = 128;
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          if (vk.field_p < 25) {
            break L26;
          } else {
            if (bi.field_h > -3) {
              fg.field_a = 500;
              bi.field_h = 2;
              mb.a(param0, 1, 256);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L27: {
          if (-11 <= vk.field_p) {
            fg.field_a = 500;
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          if (vk.field_p < 10) {
            break L28;
          } else {
            if ((bi.field_h ^ -1) > -2) {
              fg.field_a = 1500;
              bi.field_h = 1;
              mb.a(param0, 0, 256);
              break L28;
            } else {
              break L28;
            }
          }
        }
        L29: {
          if (pg.field_e) {
            vk.field_p = 0;
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          L31: {
            L32: {
              if (!pg.field_e) {
                break L32;
              } else {
                if ((kd.field_a ^ -1) != 0) {
                  break L31;
                } else {
                  break L32;
                }
              }
            }
            if (0 > ve.field_b) {
              break L30;
            } else {
              break L31;
            }
          }
          lk.field_b = 0;
          break L30;
        }
        L33: {
          if (qh.field_a[kb.field_b] <= lk.field_b) {
            if (uf.field_p <= 0) {
              break L33;
            } else {
              L34: {
                if (200 > wc.field_c) {
                  break L34;
                } else {
                  break L34;
                }
              }
              wc.field_c = wc.field_c + 1;
              break L33;
            }
          } else {
            if (uf.field_p <= 0) {
              break L33;
            } else {
              if (200 <= wc.field_c) {
                break L33;
              } else {
                wc.field_c = wc.field_c + 1;
                break L33;
              }
            }
          }
        }
        L35: {
          if (!pg.field_e) {
            break L35;
          } else {
            if (-1 == kd.field_a) {
              L36: {
                if (ve.field_b >= 0) {
                  break L36;
                } else {
                  if (of.field_g > 50) {
                    k.field_c = k.field_c + 1;
                    break L36;
                  } else {
                    break L36;
                  }
                }
              }
              L37: {
                of.field_g = of.field_g + 1;
                if (-51 <= (of.field_g ^ -1)) {
                  rb discarded$2 = m.a(10, -ea.field_p[kb.field_b] + (720 + bk.a(128, jb.field_g, (byte) 47)) - 64 << 1226965956, bk.a(128, jb.field_g, (byte) -46) + -64 << -2060847036, (byte) -6, 0, 0);
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (50 >= of.field_g) {
                  break L38;
                } else {
                  L39: {
                    if (-2 == (hg.field_F ^ -1)) {
                      break L39;
                    } else {
                      if (fh.field_d[84]) {
                        break L39;
                      } else {
                        if (fh.field_d[83]) {
                          break L39;
                        } else {
                          break L38;
                        }
                      }
                    }
                  }
                  of.field_g = 501;
                  break L38;
                }
              }
              if (of.field_g > 500) {
                L40: {
                  uf.field_p = uf.field_p - 1;
                  if ((kb.field_b ^ -1) == -8) {
                    break L40;
                  } else {
                    if (0 > uf.field_p) {
                      break L40;
                    } else {
                      break L35;
                    }
                  }
                }
                L41: {
                  kh.field_d = 255;
                  if (il.b(507)) {
                    gb.a(true, 8, -128);
                    break L41;
                  } else {
                    ah.b(true);
                    kh.field_c = null;
                    if (jl.field_d != 0) {
                      gb.a(true, 7, -127);
                      break L41;
                    } else {
                      gb.a(true, 2, -128);
                      break L41;
                    }
                  }
                }
                L42: {
                  if ((ob.field_l ^ -1) >= -1) {
                    stackOut_148_0 = 9;
                    stackIn_149_0 = stackOut_148_0;
                    break L42;
                  } else {
                    stackOut_147_0 = 0;
                    stackIn_149_0 = stackOut_147_0;
                    break L42;
                  }
                }
                fb.field_c = stackIn_149_0;
                var2 = 0;
                L43: while (true) {
                  if (var2 >= kf.field_G.length) {
                    ve.field_b = 240;
                    pk.a((byte) -96, 4, false);
                    break L35;
                  } else {
                    kf.field_G[var2] = null;
                    var2++;
                    continue L43;
                  }
                }
              } else {
                break L35;
              }
            } else {
              break L35;
            }
          }
        }
        L44: {
          if (ve.field_b < 0) {
            break L44;
          } else {
            lk.field_b = 0;
            break L44;
          }
        }
        L45: {
          if (!pg.field_e) {
            of.field_g = 0;
            break L45;
          } else {
            break L45;
          }
        }
        L46: {
          L47: {
            if (0 == kd.field_a) {
              break L47;
            } else {
              if (pg.field_e) {
                break L47;
              } else {
                if (-1 <= ve.field_b) {
                  break L47;
                } else {
                  break L46;
                }
              }
            }
          }
          L48: {
            if (100 >= mf.field_A) {
              break L48;
            } else {
              L49: {
                if (!pg.field_e) {
                  break L49;
                } else {
                  L50: {
                    if (-1 == kd.field_a) {
                      break L50;
                    } else {
                      if (pg.field_e) {
                        break L49;
                      } else {
                        break L50;
                      }
                    }
                  }
                  if (ve.field_b >= 0) {
                    break L49;
                  } else {
                    break L48;
                  }
                }
              }
              L51: {
                var2 = bk.a(5, jb.field_g, (byte) -52);
                if (-1 != kb.field_b) {
                  break L51;
                } else {
                  if (-1 == var2) {
                    var2 = 1;
                    break L51;
                  } else {
                    break L51;
                  }
                }
              }
              L52: {
                if (0 != kb.field_b) {
                  break L52;
                } else {
                  if ((var2 ^ -1) <= -4) {
                    var2 = 1;
                    break L52;
                  } else {
                    break L52;
                  }
                }
              }
              L53: {
                if (kb.field_b != 1) {
                  break L53;
                } else {
                  if (var2 < 4) {
                    break L53;
                  } else {
                    var2 = 2;
                    break L53;
                  }
                }
              }
              L54: {
                if (ib.field_h >= kb.field_b) {
                  break L54;
                } else {
                  if (bk.a(2, jb.field_g, (byte) 76) != 0) {
                    break L54;
                  } else {
                    if (qh.field_a[kb.field_b] - 50 >= lk.field_b) {
                      break L54;
                    } else {
                      if (0 >= kb.field_b) {
                        break L54;
                      } else {
                        var2 = 5;
                        break L54;
                      }
                    }
                  }
                }
              }
              L55: {
                if (-1 + (qh.field_a[kb.field_b] + -lk.field_b) >= var2) {
                  break L55;
                } else {
                  var2 = -1 + -lk.field_b + qh.field_a[kb.field_b];
                  break L55;
                }
              }
              L56: {
                if (var2 >= 0) {
                  break L56;
                } else {
                  var2 = 0;
                  break L56;
                }
              }
              L57: {
                var3 = 1;
                if (0 != var2) {
                  break L57;
                } else {
                  L58: {
                    if (!pg.field_e) {
                      lk.field_b = lk.field_b + 1;
                      break L58;
                    } else {
                      break L58;
                    }
                  }
                  mf.field_A = mf.field_A - (25 + kb.field_b);
                  var3 = 64;
                  break L57;
                }
              }
              L59: {
                if (var2 == 1) {
                  var3 = 32;
                  mf.field_A = mf.field_A - (30 - -(2 * kb.field_b));
                  if (!pg.field_e) {
                    lk.field_b = lk.field_b + 2;
                    break L59;
                  } else {
                    break L59;
                  }
                } else {
                  break L59;
                }
              }
              L60: {
                if (var2 != 2) {
                  break L60;
                } else {
                  var3 = 24;
                  mf.field_A = mf.field_A - (kb.field_b * 3 + 35);
                  if (!pg.field_e) {
                    lk.field_b = lk.field_b + 3;
                    break L60;
                  } else {
                    break L60;
                  }
                }
              }
              L61: {
                if (3 != var2) {
                  break L61;
                } else {
                  L62: {
                    var3 = 16;
                    if (pg.field_e) {
                      break L62;
                    } else {
                      lk.field_b = lk.field_b + 4;
                      break L62;
                    }
                  }
                  mf.field_A = mf.field_A - (40 + 4 * kb.field_b);
                  break L61;
                }
              }
              L63: {
                if (4 == var2) {
                  L64: {
                    var3 = 8;
                    if (pg.field_e) {
                      break L64;
                    } else {
                      lk.field_b = lk.field_b + 5;
                      break L64;
                    }
                  }
                  mf.field_A = mf.field_A - (45 - -(5 * kb.field_b));
                  break L63;
                } else {
                  break L63;
                }
              }
              L65: {
                if ((var2 ^ -1) == -6) {
                  ib.field_h = ib.field_h + 1;
                  mf.field_A = mf.field_A - (kb.field_b * 5 + 50);
                  var3 = 8;
                  if (pg.field_e) {
                    break L65;
                  } else {
                    lk.field_b = lk.field_b + 6;
                    break L65;
                  }
                } else {
                  break L65;
                }
              }
              L66: {
                var3 -= 8;
                var3 = var3 + kb.field_b;
                var4 = -640 + bk.a(1280, jb.field_g, (byte) 91) << 1816205508;
                var5 = -2048;
                var6 = (bk.a(1280, jb.field_g, (byte) 51) - 640 << 1219100612) * (-kb.field_b + 7) / 7;
                if (var2 == -6) {
                  var6 = 0;
                  break L66;
                } else {
                  break L66;
                }
              }
              L67: {
                if (-1 > ve.field_b) {
                  break L67;
                } else {
                  L68: {
                    if (var4 >= 0) {
                      stackOut_224_0 = var6 / 5 - 5120;
                      stackIn_225_0 = stackOut_224_0;
                      break L68;
                    } else {
                      stackOut_223_0 = -5120 + var6 / 3;
                      stackIn_225_0 = stackOut_223_0;
                      break L68;
                    }
                  }
                  var6 = stackIn_225_0;
                  break L67;
                }
              }
              var7 = 11520;
              var8 = var6 + -var4;
              var9 = var7 - var5;
              var10 = (int)Math.sqrt((double)(var8 * var8 - -(var9 * var9)));
              rb discarded$3 = m.a(var2 + 25, var5, var4, (byte) -6, var9 * var3 / var10, var3 * var8 / var10);
              break L48;
            }
          }
          L69: {
            if (-1 <= (f.field_d ^ -1)) {
              break L69;
            } else {
              f.field_d = f.field_d - 1;
              break L69;
            }
          }
          L70: {
            vk.b((byte) -126);
            if (!pg.field_e) {
              break L70;
            } else {
              if ((f.field_d ^ -1) < -1) {
                pg.field_e = false;
                break L70;
              } else {
                break L70;
              }
            }
          }
          if (!pg.field_e) {
            break L46;
          } else {
            if (0 < uf.field_p) {
              f.field_d = 250;
              uf.field_p = uf.field_p - 1;
              pg.field_e = false;
              break L46;
            } else {
              break L46;
            }
          }
        }
        L71: {
          L72: {
            if (pg.field_e) {
              break L72;
            } else {
              if (-1 != kd.field_a) {
                break L72;
              } else {
                break L71;
              }
            }
          }
          si.field_E = (si.field_E * 9 - -240) / 10;
          wd.field_c = 9 * wd.field_c / 10;
          break L71;
        }
        L73: {
          L74: {
            L75: {
              if (pg.field_e) {
                break L75;
              } else {
                if (kd.field_a == 0) {
                  break L74;
                } else {
                  break L75;
                }
              }
            }
            if (ve.field_b < 0) {
              break L73;
            } else {
              break L74;
            }
          }
          L76: {
            var2 = gb.field_j;
            if (-1 <= var2) {
              break L76;
            } else {
              var2 = 0;
              break L76;
            }
          }
          L77: {
            var3 = ad.field_m;
            if (640 <= var2) {
              var2 = 639;
              break L77;
            } else {
              break L77;
            }
          }
          L78: {
            if (var3 < 0) {
              var3 = 0;
              break L78;
            } else {
              break L78;
            }
          }
          L79: {
            if (-481 >= var3) {
              var3 = 479;
              break L79;
            } else {
              break L79;
            }
          }
          L80: {
            if (kd.field_a != -1) {
              break L80;
            } else {
              L81: {
                if (0 < gb.field_j) {
                  break L81;
                } else {
                  if (0 == wb.field_c) {
                    break L80;
                  } else {
                    break L81;
                  }
                }
              }
              si.field_E = (var3 / 2 + 9 * si.field_E) / 10;
              wd.field_c = (9 * wd.field_c + (var2 + -320)) / 10;
              break L80;
            }
          }
          be.c(false);
          break L73;
        }
        L82: {
          if (kd.field_a != -1) {
            break L82;
          } else {
            L83: while (true) {
              if (!wk.a((byte) -56)) {
                break L82;
              } else {
                if (13 == el.field_n) {
                  if (pg.field_e) {
                    f.field_d = 0;
                    of.field_g = 500;
                    continue L83;
                  } else {
                    gb.a(true, 1, -128);
                    continue L83;
                  }
                } else {
                  continue L83;
                }
              }
            }
          }
        }
        L84: {
          if (!fh.field_d[82]) {
            break L84;
          } else {
            if (el.field_n != 80) {
              break L84;
            } else {
              if (pg.field_e) {
                break L84;
              } else {
                if (-1 != kd.field_a) {
                  break L84;
                } else {
                  if ((lh.field_s ^ -1) > -3) {
                    break L84;
                  } else {
                    L85: {
                      kh.field_d = 255;
                      gb.a(false, 5, -127);
                      lc.field_p = lc.field_p + 1;
                      ic.field_t = ic.field_t - 1;
                      vk.field_p = 0;
                      oa.field_n = true;
                      if ((1 + kb.field_b ^ -1) > -9) {
                        lk.field_b = qh.field_a[kb.field_b];
                        var2 = -ud.field_k + (-100 + qh.field_a[1 + kb.field_b]);
                        bi.field_i = bi.field_i + var2;
                        lc.field_p = lc.field_p + var2 * (lc.field_h >>> 1245842065);
                        ud.field_k = qh.field_a[1 + kb.field_b] + -100;
                        break L85;
                      } else {
                        L86: {
                          lk.field_e = lk.field_e + oa.field_m * 100;
                          ic.field_t = ic.field_t - (oa.field_m * 100 + 5000);
                          lk.field_e = lk.field_e + 5000;
                          me.a(false);
                          if (!il.b(507)) {
                            ah.b(param0);
                            kh.field_c = null;
                            break L86;
                          } else {
                            break L86;
                          }
                        }
                        gb.a(true, 6, -127);
                        pk.a((byte) -96, 5, false);
                        break L85;
                      }
                    }
                    lk.field_f = 0;
                    break L84;
                  }
                }
              }
            }
          }
        }
        L87: {
          if (2 > lh.field_s) {
            if ((lh.field_s ^ -1) <= -3) {
              if (!fh.field_d[33]) {
                break L87;
              } else {
                bi.field_h = 2;
                oa.field_n = true;
                fg.field_a = 500;
                ic.field_t = ic.field_t - 1;
                lc.field_p = lc.field_p + 1;
                break L87;
              }
            } else {
              if ((lh.field_s ^ -1) > -3) {
                break L87;
              } else {
                if (!fh.field_d[33]) {
                  break L87;
                } else {
                  bi.field_h = 2;
                  oa.field_n = true;
                  fg.field_a = 500;
                  ic.field_t = ic.field_t - 1;
                  lc.field_p = lc.field_p + 1;
                  break L87;
                }
              }
            }
          } else {
            if ((lh.field_s ^ -1) <= -3) {
              if (!fh.field_d[33]) {
                break L87;
              } else {
                bi.field_h = 2;
                oa.field_n = true;
                fg.field_a = 500;
                ic.field_t = ic.field_t - 1;
                lc.field_p = lc.field_p + 1;
                break L87;
              }
            } else {
              if ((lh.field_s ^ -1) > -3) {
                break L87;
              } else {
                if (!fh.field_d[33]) {
                  break L87;
                } else {
                  bi.field_h = 2;
                  oa.field_n = true;
                  fg.field_a = 500;
                  ic.field_t = ic.field_t - 1;
                  lc.field_p = lc.field_p + 1;
                  break L87;
                }
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_j = null;
        field_m = null;
        field_l = null;
        if (!param0) {
            field_l = null;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
                    var10 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((hb) this).field_e + (long)param2 ^ -1L) >= (((hb) this).field_i ^ -1L)) {
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
                        ((hb) this).field_i = (long)param2 + ((hb) this).field_e;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((hb) this).field_d == -1L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((hb) this).field_e ^ -1L) > (((hb) this).field_d ^ -1L)) {
                            statePc = 7;
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
                        if ((((hb) this).field_d - -(long)((hb) this).field_c ^ -1L) <= (((hb) this).field_e ^ -1L)) {
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.b(param1 ^ -20344);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((((hb) this).field_d ^ -1L) == 0L) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((hb) this).field_d - -(long)((hb) this).field_g.length < (long)param2 + ((hb) this).field_e) {
                            statePc = 11;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)((long)((hb) this).field_g.length + (((hb) this).field_d + -((hb) this).field_e));
                        fk.a(param0, param3, ((hb) this).field_g, (int)(((hb) this).field_e - ((hb) this).field_d), var5_int);
                        param2 = param2 - var5_int;
                        ((hb) this).field_e = ((hb) this).field_e + (long)var5_int;
                        param3 = param3 + var5_int;
                        ((hb) this).field_c = ((hb) this).field_g.length;
                        this.b(116);
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
                        if (((hb) this).field_g.length < param2) {
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((hb) this).field_e ^ -1L) == (((hb) this).field_a ^ -1L)) {
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
                        ((hb) this).field_o.a(((hb) this).field_e, (byte) 116);
                        ((hb) this).field_a = ((hb) this).field_e;
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
                        ((hb) this).field_o.a(param2, param0, -1, param3);
                        ((hb) this).field_a = ((hb) this).field_a + (long)param2;
                        if ((((hb) this).field_b ^ -1L) <= (((hb) this).field_a ^ -1L)) {
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
                        ((hb) this).field_b = ((hb) this).field_a;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((((hb) this).field_f ^ -1L) < (((hb) this).field_e ^ -1L)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((long)((hb) this).field_h + ((hb) this).field_f > ((hb) this).field_e) {
                            statePc = 24;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((((hb) this).field_f ^ -1L) > (((hb) this).field_e ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((hb) this).field_e + (long)param2 <= ((hb) this).field_f) {
                            statePc = 25;
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
                        var5_long = ((hb) this).field_f;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((hb) this).field_e;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (((hb) this).field_f >= (long)param2 + ((hb) this).field_e) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((hb) this).field_f - -(long)((hb) this).field_h ^ -1L) > (((hb) this).field_e - -(long)param2 ^ -1L)) {
                            statePc = 28;
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
                        var7 = (long)param2 + ((hb) this).field_e;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((hb) this).field_e >= (long)((hb) this).field_h + ((hb) this).field_f) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((hb) this).field_f - -(long)((hb) this).field_h > (long)param2 + ((hb) this).field_e) {
                            statePc = 31;
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
                        var7 = ((hb) this).field_f + (long)((hb) this).field_h;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        fk.a(param0, (int)(-((hb) this).field_e + (var5_long + (long)param3)), ((hb) this).field_k, (int)(-((hb) this).field_f + var5_long), var9);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((hb) this).field_e = ((hb) this).field_e + (long)param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if (param1 == -20291) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((hb) this).field_k = null;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param2 <= 0) {
                            statePc = 47;
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
                        if ((((hb) this).field_d ^ -1L) == 0L) {
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((hb) this).field_d = ((hb) this).field_e;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        fk.a(param0, param3, ((hb) this).field_g, (int)(-((hb) this).field_d + ((hb) this).field_e), param2);
                        ((hb) this).field_e = ((hb) this).field_e + (long)param2;
                        if (-((hb) this).field_d + ((hb) this).field_e > (long)((hb) this).field_c) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((hb) this).field_c = (int)(((hb) this).field_e + -((hb) this).field_d);
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
                    ((hb) this).field_a = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        if (param0 <= 3) {
        }
        ((hb) this).b(param1, -90, 0, param1.length);
    }

    final long a(int param0) {
        if (param0 != 33) {
            ((hb) this).field_c = 27;
        }
        return ((hb) this).field_i;
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          if ((((hb) this).field_d ^ -1L) == 0L) {
            break L0;
          } else {
            L1: {
              if ((((hb) this).field_d ^ -1L) == (((hb) this).field_a ^ -1L)) {
                break L1;
              } else {
                ((hb) this).field_o.a(((hb) this).field_d, (byte) 72);
                ((hb) this).field_a = ((hb) this).field_d;
                break L1;
              }
            }
            L2: {
              ((hb) this).field_o.a(((hb) this).field_c, ((hb) this).field_g, -1, 0);
              ((hb) this).field_a = ((hb) this).field_a + (long)((hb) this).field_c;
              if ((((hb) this).field_b ^ -1L) > (((hb) this).field_a ^ -1L)) {
                ((hb) this).field_b = ((hb) this).field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((((hb) this).field_f ^ -1L) < (((hb) this).field_d ^ -1L)) {
                  break L4;
                } else {
                  if (((long)((hb) this).field_h + ((hb) this).field_f ^ -1L) >= (((hb) this).field_d ^ -1L)) {
                    break L4;
                  } else {
                    var2 = ((hb) this).field_d;
                    break L3;
                  }
                }
              }
              if ((((hb) this).field_f ^ -1L) > (((hb) this).field_d ^ -1L)) {
                break L3;
              } else {
                if (((hb) this).field_d - -(long)((hb) this).field_c > ((hb) this).field_f) {
                  var2 = ((hb) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((long)((hb) this).field_c + ((hb) this).field_d ^ -1L) >= (((hb) this).field_f ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((hb) this).field_h + ((hb) this).field_f < ((hb) this).field_d + (long)((hb) this).field_c) {
                    break L6;
                  } else {
                    var4 = ((hb) this).field_d + (long)((hb) this).field_c;
                    break L5;
                  }
                }
              }
              if (((long)((hb) this).field_h + ((hb) this).field_f ^ -1L) >= (((hb) this).field_d ^ -1L)) {
                break L5;
              } else {
                if (((long)((hb) this).field_h + ((hb) this).field_f ^ -1L) < (((hb) this).field_d + (long)((hb) this).field_c ^ -1L)) {
                  break L5;
                } else {
                  var4 = (long)((hb) this).field_h + ((hb) this).field_f;
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if (var2 < var4) {
                  var6 = (int)(-var2 + var4);
                  fk.a(((hb) this).field_g, (int)(var2 - ((hb) this).field_d), ((hb) this).field_k, (int)(var2 + -((hb) this).field_f), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((hb) this).field_c = 0;
            ((hb) this).field_d = -1L;
            break L0;
          }
        }
        L8: {
          if (param0 > 31) {
            break L8;
          } else {
            ((hb) this).field_a = -125L;
            break L8;
          }
        }
    }

    hb(sg param0, int param1, int param2) throws IOException {
        ((hb) this).field_d = -1L;
        ((hb) this).field_f = -1L;
        ((hb) this).field_c = 0;
        ((hb) this).field_o = param0;
        ((hb) this).field_b = param0.a(-1);
        ((hb) this).field_i = param0.a(-1);
        ((hb) this).field_e = 0L;
        ((hb) this).field_g = new byte[param2];
        ((hb) this).field_k = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "achievements to collect";
        field_m = new String[]{"Order of the Moon", "Order of the Planet", "Order of the System", "Order of the Galaxy", "Order of the Universe", "Solar Squire", "Solar Knight", "Solar Prince", "Solar King", "Combo Bonus", "Combo Collector", "Combo Champion", "Mega Bonus", "Mega Collector", "Mega Champion", "Ultimate Bonus"};
        field_j = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_n = 0.0;
    }
}
