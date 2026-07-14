/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private byte[] field_e;
    private long field_k;
    private int field_j;
    private long field_m;
    private byte[] field_l;
    private long field_a;
    private long field_d;
    private long field_b;
    private int field_f;
    private fm field_g;
    private long field_c;
    static int[] field_h;
    static String field_i;

    final void c(int param0) throws IOException {
        this.a(0);
        ((pf) this).field_g.b(0);
        if (param0 >= -77) {
            ((pf) this).field_a = -48L;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
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
                    var10 = Confined.field_J ? 1 : 0;
                    if (param1 == 9) {
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
                        if ((((pf) this).field_c - -(long)param0 ^ -1L) < (((pf) this).field_m ^ -1L)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((pf) this).field_m = (long)param0 + ((pf) this).field_c;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((pf) this).field_a == -1L) {
                            statePc = 11;
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
                        if ((((pf) this).field_c ^ -1L) <= (((pf) this).field_a ^ -1L)) {
                            statePc = 8;
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
                        this.a(0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((pf) this).field_c <= ((pf) this).field_a + (long)((pf) this).field_f) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
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
                        this.a(0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (0L == (((pf) this).field_a ^ -1L)) {
                            statePc = 15;
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
                        if (((long)((pf) this).field_l.length + ((pf) this).field_a ^ -1L) > ((long)param0 + ((pf) this).field_c ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int = (int)(((pf) this).field_a - (((pf) this).field_c - (long)((pf) this).field_l.length));
                        lj.a(param3, param2, ((pf) this).field_l, (int)(((pf) this).field_c + -((pf) this).field_a), var5_int);
                        param0 = param0 - var5_int;
                        param2 = param2 + var5_int;
                        ((pf) this).field_c = ((pf) this).field_c + (long)var5_int;
                        ((pf) this).field_f = ((pf) this).field_l.length;
                        this.a(0);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((pf) this).field_l.length < param0) {
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((((pf) this).field_c ^ -1L) != (((pf) this).field_b ^ -1L)) {
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
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((pf) this).field_g.a(-54, ((pf) this).field_c);
                        ((pf) this).field_b = ((pf) this).field_c;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((pf) this).field_g.a(-20832, param0, param3, param2);
                        ((pf) this).field_b = ((pf) this).field_b + (long)param0;
                        if (((pf) this).field_k < ((pf) this).field_b) {
                            statePc = 22;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((pf) this).field_k = ((pf) this).field_b;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = -1L;
                        if (((pf) this).field_c < ((pf) this).field_d) {
                            statePc = 26;
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
                        if (((long)((pf) this).field_j + ((pf) this).field_d ^ -1L) < (((pf) this).field_c ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((pf) this).field_d < ((pf) this).field_c) {
                            statePc = 30;
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
                        if (((pf) this).field_c - -(long)param0 <= ((pf) this).field_d) {
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
                        var5_long = ((pf) this).field_d;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5_long = ((pf) this).field_c;
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
                        var7 = -1L;
                        if (((long)param0 + ((pf) this).field_c ^ -1L) >= (((pf) this).field_d ^ -1L)) {
                            statePc = 33;
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
                        if ((((pf) this).field_c + (long)param0 ^ -1L) < (((pf) this).field_d + (long)((pf) this).field_j ^ -1L)) {
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
                        var7 = ((pf) this).field_c + (long)param0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (((pf) this).field_c >= (long)((pf) this).field_j + ((pf) this).field_d) {
                            statePc = 37;
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
                        if (((pf) this).field_c + (long)param0 >= (long)((pf) this).field_j + ((pf) this).field_d) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7 = ((pf) this).field_d - -(long)((pf) this).field_j;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (0L <= (var5_long ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 40;
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
                        var9 = (int)(var7 - var5_long);
                        lj.a(param3, (int)((long)param2 + var5_long - ((pf) this).field_c), ((pf) this).field_e, (int)(var5_long + -((pf) this).field_d), var9);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((pf) this).field_c = ((pf) this).field_c + (long)param0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return;
                }
                case 42: {
                    try {
                        if (param0 > 0) {
                            statePc = 44;
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
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-1L == ((pf) this).field_a) {
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
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((pf) this).field_a = ((pf) this).field_c;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        lj.a(param3, param2, ((pf) this).field_l, (int)(((pf) this).field_c + -((pf) this).field_a), param0);
                        ((pf) this).field_c = ((pf) this).field_c + (long)param0;
                        if ((-((pf) this).field_a + ((pf) this).field_c ^ -1L) >= ((long)((pf) this).field_f ^ -1L)) {
                            statePc = 49;
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
                        ((pf) this).field_f = (int)(-((pf) this).field_a + ((pf) this).field_c);
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
                    ((pf) this).field_b = -1L;
                    throw var5;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, long param1) throws IOException {
        Object var5 = null;
        if (0L > param1) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == 123) {
              break L0;
            } else {
              var5 = null;
              String discarded$2 = pf.a(-121, (CharSequence[]) null);
              break L0;
            }
          }
          ((pf) this).field_c = param1;
          return;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 != 11739) {
            Object var3 = null;
            String discarded$0 = pf.a(-18, (CharSequence[]) null);
        }
        return fc.a(param1, -2, 0, param1.length);
    }

    final long b(byte param0) {
        if (param0 < 95) {
            Object var3 = null;
            String discarded$0 = pf.a(-91, (CharSequence[]) null);
        }
        return ((pf) this).field_m;
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
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
                    var14 = Confined.field_J ? 1 : 0;
                    if (param2 > 83) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((pf) this).field_g = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        if (param1.length >= param0 + param3) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param0 + (param3 - param1.length));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((pf) this).field_a ^ -1L) == 0L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((pf) this).field_c < ((pf) this).field_a) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((long)param3 + ((pf) this).field_c ^ -1L) < (((pf) this).field_a + (long)((pf) this).field_f ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        lj.a(((pf) this).field_l, (int)(((pf) this).field_c + -((pf) this).field_a), param1, param0, param3);
                        ((pf) this).field_c = ((pf) this).field_c + (long)param3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((pf) this).field_c;
                        var7 = param0;
                        var8 = param3;
                        if ((((pf) this).field_c ^ -1L) > (((pf) this).field_d ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((pf) this).field_c ^ -1L) > (((pf) this).field_d - -(long)((pf) this).field_j ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)((pf) this).field_j + (((pf) this).field_d + -((pf) this).field_c));
                        if (param3 >= var9_int) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = param3;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        lj.a(((pf) this).field_e, (int)(-((pf) this).field_d + ((pf) this).field_c), param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((pf) this).field_c = ((pf) this).field_c + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((pf) this).field_e.length < param3) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.a((byte) -55);
                        var9_int = param3;
                        if (var9_int <= ((pf) this).field_j) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int = ((pf) this).field_j;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        lj.a(((pf) this).field_e, 0, param1, param0, var9_int);
                        ((pf) this).field_c = ((pf) this).field_c + (long)var9_int;
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((pf) this).field_g.a(100, ((pf) this).field_c);
                        ((pf) this).field_b = ((pf) this).field_c;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9_int = ((pf) this).field_g.a(false, param1, param0, param3);
                        if (var9_int != -1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        ((pf) this).field_b = ((pf) this).field_b + (long)var9_int;
                        ((pf) this).field_c = ((pf) this).field_c + (long)var9_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((((pf) this).field_a ^ -1L) != 0L) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((pf) this).field_c ^ -1L) <= (((pf) this).field_a ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1 > (param3 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9_int = param0 - -(int)(((pf) this).field_a + -((pf) this).field_c);
                        if (var9_int > param3 + param0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param0 - -param3;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param0 >= var9_int) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param0++;
                        param1[param0] = (byte) 0;
                        param3--;
                        ((pf) this).field_c = ((pf) this).field_c + 1L;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = -1L;
                        if (var5_long > ((pf) this).field_a) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((((pf) this).field_a ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((pf) this).field_a ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((long)((pf) this).field_f + ((pf) this).field_a <= var5_long) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
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
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = ((pf) this).field_a;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = -1L;
                        if (((pf) this).field_a + (long)((pf) this).field_f <= var5_long) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) <= (((pf) this).field_a + (long)((pf) this).field_f ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((pf) this).field_a ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((pf) this).field_a + (long)((pf) this).field_f >= (long)var8 + var5_long) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = (long)((pf) this).field_f + ((pf) this).field_a;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var9 ^ -1L) > (var11 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13 = (int)(-var9 + var11);
                        lj.a(((pf) this).field_l, (int)(-((pf) this).field_a + var9), param1, var7 + (int)(var9 - var5_long), var13);
                        if ((var11 ^ -1L) < (((pf) this).field_c ^ -1L)) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param3 = (int)((long)param3 - (var11 - ((pf) this).field_c));
                        ((pf) this).field_c = var11;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var5 = (IOException) (Object) caughtException;
                    ((pf) this).field_b = -1L;
                    throw var5;
                }
                case 58: {
                    if (-1 > (param3 ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 61;
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

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != -4) {
            return;
        }
        ((pf) this).a(0, param0, (byte) 123, param0.length);
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        ((pf) this).field_j = 0;
        if (((pf) this).field_c != ((pf) this).field_b) {
            ((pf) this).field_g.a(-125, ((pf) this).field_c);
            ((pf) this).field_b = ((pf) this).field_c;
        }
        if (param0 >= -31) {
            ((pf) this).field_e = null;
        }
        ((pf) this).field_d = ((pf) this).field_c;
        while (((pf) this).field_j < ((pf) this).field_e.length) {
            var2 = ((pf) this).field_e.length - ((pf) this).field_j;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((pf) this).field_g.a(false, ((pf) this).field_e, ((pf) this).field_j, var2);
            if ((var3 ^ -1) == 0) {
                break;
            }
            ((pf) this).field_j = ((pf) this).field_j + var3;
            ((pf) this).field_b = ((pf) this).field_b + (long)var3;
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          if (-1L != ((pf) this).field_a) {
            L1: {
              if ((((pf) this).field_b ^ -1L) != (((pf) this).field_a ^ -1L)) {
                ((pf) this).field_g.a(113, ((pf) this).field_a);
                ((pf) this).field_b = ((pf) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((pf) this).field_g.a(-20832, ((pf) this).field_f, ((pf) this).field_l, 0);
              ((pf) this).field_b = ((pf) this).field_b + (long)((pf) this).field_f;
              if ((((pf) this).field_k ^ -1L) > (((pf) this).field_b ^ -1L)) {
                ((pf) this).field_k = ((pf) this).field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((pf) this).field_d > ((pf) this).field_a) {
                  break L4;
                } else {
                  if (((long)((pf) this).field_j + ((pf) this).field_d ^ -1L) >= (((pf) this).field_a ^ -1L)) {
                    break L4;
                  } else {
                    var2 = ((pf) this).field_a;
                    break L3;
                  }
                }
              }
              if (((pf) this).field_a > ((pf) this).field_d) {
                break L3;
              } else {
                if ((((pf) this).field_d ^ -1L) <= (((pf) this).field_a - -(long)((pf) this).field_f ^ -1L)) {
                  break L3;
                } else {
                  var2 = ((pf) this).field_d;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((((pf) this).field_d ^ -1L) <= ((long)((pf) this).field_f + ((pf) this).field_a ^ -1L)) {
                  break L6;
                } else {
                  if ((((pf) this).field_a - -(long)((pf) this).field_f ^ -1L) < (((pf) this).field_d + (long)((pf) this).field_j ^ -1L)) {
                    break L6;
                  } else {
                    var4 = ((pf) this).field_a - -(long)((pf) this).field_f;
                    break L5;
                  }
                }
              }
              if ((long)((pf) this).field_j + ((pf) this).field_d <= ((pf) this).field_a) {
                break L5;
              } else {
                if (((long)((pf) this).field_j + ((pf) this).field_d ^ -1L) >= (((pf) this).field_a + (long)((pf) this).field_f ^ -1L)) {
                  var4 = (long)((pf) this).field_j + ((pf) this).field_d;
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
                if ((var2 ^ -1L) > (var4 ^ -1L)) {
                  var6 = (int)(var4 - var2);
                  lj.a(((pf) this).field_l, (int)(var2 + -((pf) this).field_a), ((pf) this).field_e, (int)(var2 - ((pf) this).field_d), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((pf) this).field_f = 0;
            ((pf) this).field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 == 0) {
            break L8;
          } else {
            ((pf) this).field_f = -20;
            break L8;
          }
        }
    }

    public static void b(int param0) {
        if (param0 > -42) {
            return;
        }
        field_i = null;
        field_h = null;
    }

    pf(fm param0, int param1, int param2) throws IOException {
        ((pf) this).field_a = -1L;
        ((pf) this).field_f = 0;
        ((pf) this).field_d = -1L;
        ((pf) this).field_g = param0;
        ((pf) this).field_k = param0.a((byte) -115);
        ((pf) this).field_m = param0.a((byte) -115);
        ((pf) this).field_l = new byte[param2];
        ((pf) this).field_c = 0L;
        ((pf) this).field_e = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{0, 0, 640, 0, 640, 376, 0, 376};
        field_i = "Hold <col=FFFFFF>Ctrl</col> to fire!";
    }
}
