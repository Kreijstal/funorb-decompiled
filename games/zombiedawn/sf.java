/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sf {
    private long field_g;
    private long field_h;
    private byte[] field_b;
    private long field_c;
    private int field_a;
    static vo field_n;
    static pf field_j;
    private int field_m;
    private long field_e;
    static int[] field_d;
    private long field_l;
    private byte[] field_i;
    private long field_f;
    private qn field_k;

    public static void c(int param0) {
        field_n = null;
        field_j = null;
        if (param0 != 0) {
            field_j = null;
        }
        field_d = null;
    }

    final void a(int param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          L0: {
            ((sf) this).field_e = param1;
            if (param0 == 0) {
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != 463) {
            sf.c(64);
        }
        this.a((byte) -115);
        ((sf) this).field_k.c(-88);
    }

    final long a(int param0) {
        if (param0 != -1) {
            ((sf) this).field_l = 45L;
        }
        return ((sf) this).field_g;
    }

    final void a(int param0, boolean param1, int param2, byte[] param3) throws IOException {
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
                    var14 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 + param0 > param3.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param0 + (param2 + -param3.length));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((sf) this).field_h ^ -1L) == 0L) {
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
                        if ((((sf) this).field_e ^ -1L) > (((sf) this).field_h ^ -1L)) {
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
                        if ((((sf) this).field_h + (long)((sf) this).field_m ^ -1L) <= ((long)param0 + ((sf) this).field_e ^ -1L)) {
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
                        gp.a(((sf) this).field_b, (int)(-((sf) this).field_h + ((sf) this).field_e), param3, param2, param0);
                        ((sf) this).field_e = ((sf) this).field_e + (long)param0;
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
                        var5_long = ((sf) this).field_e;
                        var7 = param2;
                        if (!param1) {
                            statePc = 12;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = param0;
                        if (((sf) this).field_e < ((sf) this).field_l) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((sf) this).field_l + (long)((sf) this).field_a <= ((sf) this).field_e) {
                            statePc = 18;
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
                        var9_int = (int)((long)((sf) this).field_a - (-((sf) this).field_l + ((sf) this).field_e));
                        if (var9_int > param0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9_int = param0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        gp.a(((sf) this).field_i, (int)(-((sf) this).field_l + ((sf) this).field_e), param3, param2, var9_int);
                        param2 = param2 + var9_int;
                        ((sf) this).field_e = ((sf) this).field_e + (long)var9_int;
                        param0 = param0 - var9_int;
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
                        if (param0 <= ((sf) this).field_i.length) {
                            statePc = 23;
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
                        ((sf) this).field_k.a((byte) -113, ((sf) this).field_e);
                        ((sf) this).field_c = ((sf) this).field_e;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (0 >= param0) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((sf) this).field_k.a(param2, param3, param0, (byte) -118);
                        if (0 == (var9_int ^ -1)) {
                            statePc = 27;
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
                        param0 = param0 - var9_int;
                        ((sf) this).field_c = ((sf) this).field_c + (long)var9_int;
                        ((sf) this).field_e = ((sf) this).field_e + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0 >= param0) {
                            statePc = 27;
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
                        this.a(true);
                        var9_int = param0;
                        if (var9_int <= ((sf) this).field_a) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((sf) this).field_a;
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
                        gp.a(((sf) this).field_i, 0, param3, param2, var9_int);
                        param0 = param0 - var9_int;
                        ((sf) this).field_e = ((sf) this).field_e + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0L != (((sf) this).field_h ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((sf) this).field_e ^ -1L) <= (((sf) this).field_h ^ -1L)) {
                            statePc = 36;
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
                        if (param0 <= 0) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = (int)(-((sf) this).field_e + ((sf) this).field_h) + param2;
                        if (var9_int > param2 - -param0) {
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param0 + param2;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
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
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param2++;
                        param3[param2] = (byte) 0;
                        param0--;
                        ((sf) this).field_e = ((sf) this).field_e + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        if ((var5_long ^ -1L) < (((sf) this).field_h ^ -1L)) {
                            statePc = 39;
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
                        if (((long)var8 + var5_long ^ -1L) >= (((sf) this).field_h ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = ((sf) this).field_h;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long ^ -1L) > (((sf) this).field_h ^ -1L)) {
                            statePc = 42;
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
                        if ((long)((sf) this).field_m + ((sf) this).field_h <= var5_long) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = var5_long;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = -1L;
                        if (((sf) this).field_h + (long)((sf) this).field_m <= var5_long) {
                            statePc = 45;
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
                        if ((var5_long + (long)var8 ^ -1L) > ((long)((sf) this).field_m + ((sf) this).field_h ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = ((sf) this).field_h + (long)((sf) this).field_m;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((sf) this).field_h >= var5_long - -(long)var8) {
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
                        if (var5_long - -(long)var8 > ((sf) this).field_h + (long)((sf) this).field_m) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
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
                        if (var9 < var11) {
                            statePc = 51;
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
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (int)(var11 + -var9);
                        gp.a(((sf) this).field_b, (int)(var9 + -((sf) this).field_h), param3, var7 + (int)(-var5_long + var9), var13);
                        if (var11 <= ((sf) this).field_e) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param0 = (int)((long)param0 - (var11 + -((sf) this).field_e));
                        ((sf) this).field_e = var11;
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
                    ((sf) this).field_c = -1L;
                    throw var5;
                }
                case 55: {
                    if ((param0 ^ -1) < -1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return;
                }
                case 57: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((sf) this).a(param1.length, false, 0, param1);
        int var3 = 105 / ((-64 - param0) / 58);
    }

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
                    var10 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((sf) this).field_e + (long)param3 ^ -1L) >= (((sf) this).field_g ^ -1L)) {
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
                        ((sf) this).field_g = ((sf) this).field_e + (long)param3;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((sf) this).field_h == -1L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((sf) this).field_h > ((sf) this).field_e) {
                            statePc = 7;
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
                        if (((sf) this).field_e > ((sf) this).field_h - -(long)((sf) this).field_m) {
                            statePc = 7;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a((byte) -115);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((((sf) this).field_h ^ -1L) == 0L) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((long)param3 + ((sf) this).field_e > ((sf) this).field_h + (long)((sf) this).field_b.length) {
                            statePc = 11;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)(((sf) this).field_h - (((sf) this).field_e - (long)((sf) this).field_b.length));
                        gp.a(param1, param2, ((sf) this).field_b, (int)(-((sf) this).field_h + ((sf) this).field_e), var5_int);
                        param2 = param2 + var5_int;
                        ((sf) this).field_e = ((sf) this).field_e + (long)var5_int;
                        param3 = param3 - var5_int;
                        ((sf) this).field_m = ((sf) this).field_b.length;
                        this.a((byte) -115);
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
                        if (param3 > ((sf) this).field_b.length) {
                            statePc = 14;
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
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((sf) this).field_c ^ -1L) != (((sf) this).field_e ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((sf) this).field_k.a((byte) -104, ((sf) this).field_e);
                        ((sf) this).field_c = ((sf) this).field_e;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((sf) this).field_k.a(0, param3, param1, param2);
                        ((sf) this).field_c = ((sf) this).field_c + (long)param3;
                        if ((((sf) this).field_f ^ -1L) <= (((sf) this).field_c ^ -1L)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((sf) this).field_f = ((sf) this).field_c;
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
                        if ((((sf) this).field_e ^ -1L) > (((sf) this).field_l ^ -1L)) {
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
                        if (((long)((sf) this).field_a + ((sf) this).field_l ^ -1L) < (((sf) this).field_e ^ -1L)) {
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
                        if (((sf) this).field_e > ((sf) this).field_l) {
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
                        if (((long)param3 + ((sf) this).field_e ^ -1L) >= (((sf) this).field_l ^ -1L)) {
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
                        var5_long = ((sf) this).field_l;
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
                        var5_long = ((sf) this).field_e;
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
                        var7 = -1L;
                        if (((sf) this).field_l >= ((sf) this).field_e - -(long)param3) {
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
                        if ((long)((sf) this).field_a + ((sf) this).field_l < ((sf) this).field_e - -(long)param3) {
                            statePc = 29;
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
                        var7 = (long)param3 + ((sf) this).field_e;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((sf) this).field_e >= (long)((sf) this).field_a + ((sf) this).field_l) {
                            statePc = 32;
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
                        if ((long)param3 + ((sf) this).field_e < (long)((sf) this).field_a + ((sf) this).field_l) {
                            statePc = 32;
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
                        var7 = (long)((sf) this).field_a + ((sf) this).field_l;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-1L >= var5_long) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var7 > var5_long) {
                            statePc = 35;
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(var7 - var5_long);
                        gp.a(param1, (int)(-((sf) this).field_e + (long)param2 - -var5_long), ((sf) this).field_i, (int)(-((sf) this).field_l + var5_long), var9);
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
                        ((sf) this).field_e = ((sf) this).field_e + (long)param3;
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
                        if (0 < param3) {
                            statePc = 40;
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
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((sf) this).field_h ^ -1L) != 0L) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((sf) this).field_h = ((sf) this).field_e;
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
                        gp.a(param1, param2, ((sf) this).field_b, (int)(((sf) this).field_e + -((sf) this).field_h), param3);
                        ((sf) this).field_e = ((sf) this).field_e + (long)param3;
                        if ((-((sf) this).field_h + ((sf) this).field_e ^ -1L) < ((long)((sf) this).field_m ^ -1L)) {
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
                        ((sf) this).field_m = (int)(((sf) this).field_e - ((sf) this).field_h);
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
                        if (param0 >= 40) {
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
                        sf.c(17);
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
                    ((sf) this).field_c = -1L;
                    throw var5;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        if (param0 == -115) {
          L0: {
            if (0L == (((sf) this).field_h ^ -1L)) {
              break L0;
            } else {
              L1: {
                if ((((sf) this).field_c ^ -1L) == (((sf) this).field_h ^ -1L)) {
                  break L1;
                } else {
                  ((sf) this).field_k.a((byte) -104, ((sf) this).field_h);
                  ((sf) this).field_c = ((sf) this).field_h;
                  break L1;
                }
              }
              L2: {
                ((sf) this).field_k.a(0, ((sf) this).field_m, ((sf) this).field_b, 0);
                ((sf) this).field_c = ((sf) this).field_c + (long)((sf) this).field_m;
                if ((((sf) this).field_c ^ -1L) < (((sf) this).field_f ^ -1L)) {
                  ((sf) this).field_f = ((sf) this).field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if (((sf) this).field_h < ((sf) this).field_l) {
                    break L4;
                  } else {
                    if ((((sf) this).field_h ^ -1L) > ((long)((sf) this).field_a + ((sf) this).field_l ^ -1L)) {
                      var2 = ((sf) this).field_h;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if ((((sf) this).field_h ^ -1L) < (((sf) this).field_l ^ -1L)) {
                  break L3;
                } else {
                  if ((((sf) this).field_l ^ -1L) > (((sf) this).field_h + (long)((sf) this).field_m ^ -1L)) {
                    var2 = ((sf) this).field_l;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if ((((sf) this).field_l ^ -1L) <= (((sf) this).field_h - -(long)((sf) this).field_m ^ -1L)) {
                    break L6;
                  } else {
                    if (((long)((sf) this).field_a + ((sf) this).field_l ^ -1L) > (((sf) this).field_h - -(long)((sf) this).field_m ^ -1L)) {
                      break L6;
                    } else {
                      var4 = ((sf) this).field_h - -(long)((sf) this).field_m;
                      break L5;
                    }
                  }
                }
                if (((sf) this).field_h >= ((sf) this).field_l - -(long)((sf) this).field_a) {
                  break L5;
                } else {
                  if (((long)((sf) this).field_a + ((sf) this).field_l ^ -1L) >= ((long)((sf) this).field_m + ((sf) this).field_h ^ -1L)) {
                    var4 = (long)((sf) this).field_a + ((sf) this).field_l;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (0L <= (var2 ^ -1L)) {
                  break L7;
                } else {
                  if (var4 <= var2) {
                    break L7;
                  } else {
                    var6 = (int)(var4 + -var2);
                    gp.a(((sf) this).field_b, (int)(var2 - ((sf) this).field_h), ((sf) this).field_i, (int)(-((sf) this).field_l + var2), var6);
                    break L7;
                  }
                }
              }
              ((sf) this).field_m = 0;
              ((sf) this).field_h = -1L;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        ((sf) this).field_a = 0;
        if (!(((sf) this).field_c == ((sf) this).field_e)) {
            ((sf) this).field_k.a((byte) -101, ((sf) this).field_e);
            ((sf) this).field_c = ((sf) this).field_e;
        }
        ((sf) this).field_l = ((sf) this).field_e;
        while (((sf) this).field_i.length > ((sf) this).field_a) {
            var2 = ((sf) this).field_i.length - ((sf) this).field_a;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((sf) this).field_k.a(((sf) this).field_a, ((sf) this).field_i, var2, (byte) -103);
            if ((var3 ^ -1) == 0) {
                break;
            }
            ((sf) this).field_a = ((sf) this).field_a + var3;
            ((sf) this).field_c = ((sf) this).field_c + (long)var3;
        }
        if (!param0) {
        }
    }

    sf(qn param0, int param1, int param2) throws IOException {
        ((sf) this).field_h = -1L;
        ((sf) this).field_m = 0;
        ((sf) this).field_l = -1L;
        ((sf) this).field_k = param0;
        ((sf) this).field_f = param0.b(100);
        ((sf) this).field_g = param0.b(100);
        ((sf) this).field_i = new byte[param1];
        ((sf) this).field_b = new byte[param2];
        ((sf) this).field_e = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = null;
        field_d = new int[]{26, 182, 370, 463};
    }
}
