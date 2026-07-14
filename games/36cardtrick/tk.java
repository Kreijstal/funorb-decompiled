/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk {
    static int field_c;
    private wk field_n;
    private long field_g;
    private int field_m;
    private long field_f;
    private long field_p;
    private long field_k;
    private long field_i;
    private byte[] field_h;
    private byte[] field_e;
    static int field_a;
    static java.applet.Applet field_o;
    private int field_d;
    private long field_j;
    static ml field_b;
    static String field_l;
    static boolean field_q;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
                    var14 = Main.field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.length < param3 + param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param3 + param2));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == -118) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if ((((tk) this).field_g ^ -1L) == 0L) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((tk) this).field_i ^ -1L) > (((tk) this).field_g ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((long)((tk) this).field_d + ((tk) this).field_g >= ((tk) this).field_i - -(long)param3) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        og.a(((tk) this).field_h, (int)(-((tk) this).field_g + ((tk) this).field_i), param1, param2, param3);
                        ((tk) this).field_i = ((tk) this).field_i + (long)param3;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        var5_long = ((tk) this).field_i;
                        var7 = param2;
                        var8 = param3;
                        if ((((tk) this).field_i ^ -1L) > (((tk) this).field_p ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((((tk) this).field_i ^ -1L) <= (((tk) this).field_p + (long)((tk) this).field_m ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = (int)(((tk) this).field_p - (((tk) this).field_i - (long)((tk) this).field_m));
                        if (var9_int > param3) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        og.a(((tk) this).field_e, (int)(((tk) this).field_i + -((tk) this).field_p), param1, param2, var9_int);
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        ((tk) this).field_i = ((tk) this).field_i + (long)var9_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param3 > ((tk) this).field_e.length) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((param3 ^ -1) < -1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.b(param0 + 118);
                        var9_int = param3;
                        if (((tk) this).field_m < var9_int) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = ((tk) this).field_m;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        og.a(((tk) this).field_e, 0, param1, param2, var9_int);
                        ((tk) this).field_i = ((tk) this).field_i + (long)var9_int;
                        param2 = param2 + var9_int;
                        param3 = param3 - var9_int;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((tk) this).field_n.a(((tk) this).field_i, false);
                        ((tk) this).field_f = ((tk) this).field_i;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param3 <= 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9_int = ((tk) this).field_n.a(param3, param1, param2, param0 + 117);
                        if (-1 == var9_int) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((tk) this).field_f = ((tk) this).field_f + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((tk) this).field_i = ((tk) this).field_i + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((tk) this).field_g ^ -1L) != 0L) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((tk) this).field_i >= ((tk) this).field_g) {
                            statePc = 38;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param3 > 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = (int)(-((tk) this).field_i + ((tk) this).field_g) + param2;
                        if (param3 + param2 >= var9_int) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9_int = param3 + param2;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var9_int <= param2) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        param2++;
                        param1[param2] = (byte) 0;
                        param3--;
                        ((tk) this).field_i = ((tk) this).field_i + 1L;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (var5_long > ((tk) this).field_g) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((long)var8 + var5_long > ((tk) this).field_g) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5_long < ((tk) this).field_g) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5_long < (long)((tk) this).field_d + ((tk) this).field_g) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9 = var5_long;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = ((tk) this).field_g;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var5_long >= ((tk) this).field_g + (long)((tk) this).field_d) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((long)var8 + var5_long < (long)((tk) this).field_d + ((tk) this).field_g) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = ((tk) this).field_g - -(long)((tk) this).field_d;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var5_long - -(long)var8 ^ -1L) >= (((tk) this).field_g ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((((tk) this).field_g - -(long)((tk) this).field_d ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = var5_long + (long)var8;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1L >= var9) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var11 <= var9) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13 = (int)(var11 - var9);
                        og.a(((tk) this).field_h, (int)(var9 - ((tk) this).field_g), param1, (int)(var9 - var5_long) + var7, var13);
                        if (((tk) this).field_i >= var11) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param3 = (int)((long)param3 - (-((tk) this).field_i + var11));
                        ((tk) this).field_i = var11;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var5 = (IOException) (Object) caughtException;
                    ((tk) this).field_f = -1L;
                    throw var5;
                }
                case 59: {
                    if (-1 > (param3 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 62;
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
                    var10 = Main.field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((tk) this).field_j ^ -1L) > (((tk) this).field_i + (long)param2 ^ -1L)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((tk) this).field_j = (long)param2 + ((tk) this).field_i;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((tk) this).field_g ^ -1L) == 0L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((tk) this).field_g ^ -1L) < (((tk) this).field_i ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((tk) this).field_i ^ -1L) < ((long)((tk) this).field_d + ((tk) this).field_g ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.c(param3 + 102);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((long)param3 == ((tk) this).field_g) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((long)((tk) this).field_h.length + ((tk) this).field_g >= (long)param2 + ((tk) this).field_i) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)((long)((tk) this).field_h.length + -((tk) this).field_i + ((tk) this).field_g);
                        og.a(param0, param1, ((tk) this).field_h, (int)(-((tk) this).field_g + ((tk) this).field_i), var5_int);
                        param2 = param2 - var5_int;
                        param1 = param1 + var5_int;
                        ((tk) this).field_i = ((tk) this).field_i + (long)var5_int;
                        ((tk) this).field_d = ((tk) this).field_h.length;
                        this.c(-122);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((tk) this).field_h.length < param2) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((tk) this).field_i ^ -1L) == (((tk) this).field_f ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((tk) this).field_n.a(((tk) this).field_i, false);
                        ((tk) this).field_f = ((tk) this).field_i;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((tk) this).field_n.b(param1, param0, 0, param2);
                        ((tk) this).field_f = ((tk) this).field_f + (long)param2;
                        if ((((tk) this).field_f ^ -1L) >= (((tk) this).field_k ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((tk) this).field_k = ((tk) this).field_f;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_long = -1L;
                        if ((((tk) this).field_i ^ -1L) > (((tk) this).field_p ^ -1L)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (((tk) this).field_p + (long)((tk) this).field_m <= ((tk) this).field_i) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_long = ((tk) this).field_i;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((tk) this).field_i > ((tk) this).field_p) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((tk) this).field_i - -(long)param2 <= ((tk) this).field_p) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((tk) this).field_p;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = -1L;
                        if (((long)param2 + ((tk) this).field_i ^ -1L) >= (((tk) this).field_p ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (((long)((tk) this).field_m + ((tk) this).field_p ^ -1L) <= (((tk) this).field_i - -(long)param2 ^ -1L)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((tk) this).field_i ^ -1L) <= (((tk) this).field_p + (long)((tk) this).field_m ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((tk) this).field_i - -(long)param2 < (long)((tk) this).field_m + ((tk) this).field_p) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7 = (long)((tk) this).field_m + ((tk) this).field_p;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = (long)param2 + ((tk) this).field_i;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (0L <= (var5_long ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        og.a(param0, (int)((long)param1 + (var5_long + -((tk) this).field_i)), ((tk) this).field_e, (int)(var5_long + -((tk) this).field_p), var9);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((tk) this).field_i = ((tk) this).field_i + (long)param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if (0 < param2) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (((tk) this).field_g == -1L) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((tk) this).field_g = ((tk) this).field_i;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        og.a(param0, param1, ((tk) this).field_h, (int)(((tk) this).field_i + -((tk) this).field_g), param2);
                        ((tk) this).field_i = ((tk) this).field_i + (long)param2;
                        if (((long)((tk) this).field_d ^ -1L) > (((tk) this).field_i + -((tk) this).field_g ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((tk) this).field_d = (int)(((tk) this).field_i - ((tk) this).field_g);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return;
                }
                case 45: {
                    var5 = (IOException) (Object) caughtException;
                    ((tk) this).field_f = -1L;
                    throw var5;
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long b(byte param0) {
        if (param0 != -95) {
            return 121L;
        }
        return ((tk) this).field_j;
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((tk) this).a((byte) -118, param1, param0, param1.length);
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Main.field_T;
          if (-1L != ((tk) this).field_g) {
            L1: {
              if (((tk) this).field_f == ((tk) this).field_g) {
                break L1;
              } else {
                ((tk) this).field_n.a(((tk) this).field_g, false);
                ((tk) this).field_f = ((tk) this).field_g;
                break L1;
              }
            }
            L2: {
              ((tk) this).field_n.b(0, ((tk) this).field_h, 0, ((tk) this).field_d);
              ((tk) this).field_f = ((tk) this).field_f + (long)((tk) this).field_d;
              if ((((tk) this).field_k ^ -1L) <= (((tk) this).field_f ^ -1L)) {
                break L2;
              } else {
                ((tk) this).field_k = ((tk) this).field_f;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                var4 = -1L;
                if ((((tk) this).field_p ^ -1L) < (((tk) this).field_g ^ -1L)) {
                  break L4;
                } else {
                  if ((((tk) this).field_g ^ -1L) > (((tk) this).field_p - -(long)((tk) this).field_m ^ -1L)) {
                    var2_long = ((tk) this).field_g;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((tk) this).field_g ^ -1L) < (((tk) this).field_p ^ -1L)) {
                break L3;
              } else {
                if ((((tk) this).field_p ^ -1L) > (((tk) this).field_g + (long)((tk) this).field_d ^ -1L)) {
                  var2_long = ((tk) this).field_p;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((((tk) this).field_g - -(long)((tk) this).field_d ^ -1L) >= (((tk) this).field_p ^ -1L)) {
                  break L6;
                } else {
                  if (((long)((tk) this).field_m + ((tk) this).field_p ^ -1L) <= ((long)((tk) this).field_d + ((tk) this).field_g ^ -1L)) {
                    var4 = (long)((tk) this).field_d + ((tk) this).field_g;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((tk) this).field_g >= (long)((tk) this).field_m + ((tk) this).field_p) {
                break L5;
              } else {
                if (((tk) this).field_g + (long)((tk) this).field_d >= ((tk) this).field_p + (long)((tk) this).field_m) {
                  var4 = ((tk) this).field_p - -(long)((tk) this).field_m;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((var2_long ^ -1L) >= 0L) {
                break L7;
              } else {
                if (var2_long < var4) {
                  var6 = (int)(var4 + -var2_long);
                  og.a(((tk) this).field_h, (int)(var2_long + -((tk) this).field_g), ((tk) this).field_e, (int)(-((tk) this).field_p + var2_long), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((tk) this).field_g = -1L;
            ((tk) this).field_d = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = -69 / ((param0 - 38) / 54);
    }

    final static void a(java.awt.Canvas param0, int param1) {
        if (param1 != -1) {
            return;
        }
        oc.a((java.awt.Component) (Object) param0, (byte) 6);
        qa.a((java.awt.Component) (Object) param0, (byte) 119);
        if (Main.field_V != null) {
            Main.field_V.a(0, (java.awt.Component) (Object) param0);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_o = null;
        field_b = null;
        if (param0 != -1) {
            field_q = false;
        }
    }

    tk(wk param0, int param1, int param2) throws IOException {
        ((tk) this).field_g = -1L;
        ((tk) this).field_p = -1L;
        ((tk) this).field_d = 0;
        ((tk) this).field_n = param0;
        ((tk) this).field_k = param0.a(11311);
        ((tk) this).field_j = param0.a(11311);
        ((tk) this).field_i = 0L;
        ((tk) this).field_h = new byte[param2];
        ((tk) this).field_e = new byte[param1];
    }

    final void a(byte param0) throws IOException {
        this.c(-44);
        if (param0 > -25) {
            field_c = -80;
        }
        ((tk) this).field_n.a((byte) 15);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Main.field_T;
        ((tk) this).field_m = param0;
        if (!((((tk) this).field_f ^ -1L) == (((tk) this).field_i ^ -1L))) {
            ((tk) this).field_n.a(((tk) this).field_i, false);
            ((tk) this).field_f = ((tk) this).field_i;
        }
        ((tk) this).field_p = ((tk) this).field_i;
        while (((tk) this).field_m < ((tk) this).field_e.length) {
            var2 = ((tk) this).field_e.length - ((tk) this).field_m;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((tk) this).field_n.a(var2, ((tk) this).field_e, ((tk) this).field_m, -1);
            // if_icmpeq L143
            ((tk) this).field_m = ((tk) this).field_m + var3;
            ((tk) this).field_f = ((tk) this).field_f + (long)var3;
        }
    }

    final void a(long param0, int param1) throws IOException {
        int var4 = -66 / ((-27 - param1) / 35);
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        ((tk) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 1;
        field_a = 1;
        field_b = new ml();
        field_q = false;
        field_l = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
