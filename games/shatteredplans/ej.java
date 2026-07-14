/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej {
    private int field_a;
    static int field_m;
    static String field_f;
    private byte[] field_k;
    private int field_b;
    private long field_g;
    private ra field_c;
    private long field_h;
    static String field_j;
    private long field_d;
    private long field_l;
    private long field_n;
    private long field_i;
    private byte[] field_o;
    static int field_e;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_40_0 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_58_0 = null;
        long stackIn_67_0 = 0L;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        Object stackOut_6_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_39_0 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_57_0 = null;
        long stackOut_66_0 = 0L;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((long)param1 + ((ej) this).field_d ^ -1L) < (((ej) this).field_h ^ -1L)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((ej) this).field_h = ((ej) this).field_d - -(long)param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0L == (((ej) this).field_n ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof IOException ? 9 : 90);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof IOException ? 9 : 90);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((ej) this).field_n > ((ej) this).field_d) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof IOException ? 13 : 90);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof IOException ? 13 : 90);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof IOException ? 13 : 90);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof IOException ? 13 : 90);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((ej) this).field_n + (long)((ej) this).field_b < ((ej) this).field_d) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof IOException ? 15 : 90);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof IOException ? 15 : 90);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof IOException ? 15 : 90);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof IOException ? 15 : 90);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.e(-117);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0L == (((ej) this).field_n ^ -1L)) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof IOException ? 20 : 90);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (((ej) this).field_d - -(long)param1 <= (long)((ej) this).field_o.length + ((ej) this).field_n) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof IOException ? 20 : 90);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_int = (int)((long)((ej) this).field_o.length - -((ej) this).field_n - ((ej) this).field_d);
                        ps.a(param3, param2, ((ej) this).field_o, (int)(-((ej) this).field_n + ((ej) this).field_d), var5_int);
                        ((ej) this).field_d = ((ej) this).field_d + (long)var5_int;
                        param1 = param1 - var5_int;
                        param2 = param2 + var5_int;
                        ((ej) this).field_b = ((ej) this).field_o.length;
                        this.e(-117);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5_int = -125 % ((32 - param0) / 43);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((ej) this).field_o.length ^ -1) <= (param1 ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof IOException ? 26 : 90);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((ej) this).field_g != ((ej) this).field_d) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof IOException ? 28 : 90);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof IOException ? 28 : 90);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof IOException ? 28 : 90);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof IOException ? 28 : 90);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((ej) this).field_c.a(((ej) this).field_d, (byte) 59);
                        ((ej) this).field_g = ((ej) this).field_d;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((ej) this).field_c.a(param3, param1, (byte) 11, param2);
                        ((ej) this).field_g = ((ej) this).field_g + (long)param1;
                        if ((((ej) this).field_g ^ -1L) >= (((ej) this).field_l ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof IOException ? 33 : 90);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((ej) this).field_l = ((ej) this).field_g;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof IOException ? 33 : 90);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6 = -1L;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((((ej) this).field_d ^ -1L) > (((ej) this).field_i ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof IOException ? 38 : 90);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (((ej) this).field_d >= ((ej) this).field_i - -(long)((ej) this).field_a) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof IOException ? 38 : 90);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var6 = ((ej) this).field_d;
                        stackOut_39_0 = var11;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof IOException ? 43 : 90);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((((ej) this).field_i ^ -1L) > (((ej) this).field_d ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof IOException ? 46 : 90);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof IOException ? 46 : 90);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof IOException ? 46 : 90);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((ej) this).field_i >= ((ej) this).field_d - -(long)param1) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof IOException ? 46 : 90);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = ((ej) this).field_i;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var8 = -1L;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (((ej) this).field_d + (long)param1 <= ((ej) this).field_i) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof IOException ? 53 : 90);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = this;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof IOException ? 53 : 90);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((long)((ej) this).field_a + ((ej) this).field_i >= ((ej) this).field_d + (long)param1) {
                            statePc = 64;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof IOException ? 56 : 90);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof IOException ? 56 : 90);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof IOException ? 56 : 90);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (((ej) this).field_i - -(long)((ej) this).field_a <= ((ej) this).field_d) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof IOException ? 60 : 90);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof IOException ? 60 : 90);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof IOException ? 60 : 90);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = this;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof IOException ? 60 : 90);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((((ej) this).field_d + (long)param1 ^ -1L) <= ((long)((ej) this).field_a + ((ej) this).field_i ^ -1L)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof IOException ? 62 : 90);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof IOException ? 62 : 90);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof IOException ? 62 : 90);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof IOException ? 62 : 90);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var8 = (long)((ej) this).field_a + ((ej) this).field_i;
                        if (var11 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var8 = (long)param1 + ((ej) this).field_d;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (0L <= (var6 ^ -1L)) {
                            statePc = 73;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof IOException ? 69 : 90);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = var6;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof IOException ? 69 : 90);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 < var8) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = (stateCaught_67 instanceof IOException ? 71 : 90);
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = (stateCaught_68 instanceof IOException ? 71 : 90);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof IOException ? 71 : 90);
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof IOException ? 71 : 90);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var10 = (int)(var8 + -var6);
                        ps.a(param3, (int)(var6 + (long)param2 - ((ej) this).field_d), ((ej) this).field_k, (int)(var6 + -((ej) this).field_i), var10);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        ((ej) this).field_d = ((ej) this).field_d + (long)param1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 74: {
                    return;
                }
                case 75: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (-1L != ((ej) this).field_n) {
                            statePc = 82;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ((ej) this).field_n = ((ej) this).field_d;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ps.a(param3, param2, ((ej) this).field_o, (int)(-((ej) this).field_n + ((ej) this).field_d), param1);
                        ((ej) this).field_d = ((ej) this).field_d + (long)param1;
                        if ((long)((ej) this).field_b < ((ej) this).field_d + -((ej) this).field_n) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = (stateCaught_82 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = (stateCaught_83 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((ej) this).field_b = (int)(-((ej) this).field_n + ((ej) this).field_d);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = (stateCaught_85 instanceof IOException ? 88 : 90);
                        continue stateLoop;
                    }
                }
                case 86: {
                    return;
                }
                case 87: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var5 = (IOException) (Object) caughtException;
                        ((ej) this).field_g = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    try {
                        stackOut_91_0 = (RuntimeException) var5_ref;
                        stackOut_91_1 = new StringBuilder().append("ej.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_94_0 = stackOut_91_0;
                        stackIn_94_1 = stackOut_91_1;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        if (param3 == null) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
                        stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
                        stackOut_92_2 = "{...}";
                        stackIn_95_0 = stackOut_92_0;
                        stackIn_95_1 = stackOut_92_1;
                        stackIn_95_2 = stackOut_92_2;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 94: {
                    stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
                    stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
                    stackOut_94_2 = "null";
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    stackIn_95_2 = stackOut_94_2;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    throw r.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + 41);
                }
                case 96: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        try {
            field_f = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ej.C(" + param0 + 41);
        }
    }

    private final void a(int param0) throws IOException {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ej) this).field_a = 0;
                        if ((((ej) this).field_d ^ -1L) == (((ej) this).field_g ^ -1L)) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((ej) this).field_c.a(((ej) this).field_d, (byte) 98);
                        ((ej) this).field_g = ((ej) this).field_d;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 < -107) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        ((ej) this).field_i = ((ej) this).field_d;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((((ej) this).field_k.length ^ -1) >= (((ej) this).field_a ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = ((ej) this).field_k.length - ((ej) this).field_a;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var2_int ^ -1) >= -200000001) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2_int = 200000000;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = ((ej) this).field_c.a(var2_int, ((ej) this).field_a, 0, ((ej) this).field_k);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var3 ^ -1) == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ej) this).field_a = ((ej) this).field_a + var3;
                        ((ej) this).field_g = ((ej) this).field_g + (long)var3;
                        if (var4 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) runtimeException, "ej.B(" + param0 + 41);
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        hd var1 = null;
        int var2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (cb.field_h == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var1 = (hd) (Object) cb.field_h.d(0);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var1 != null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1.field_h = var1.field_h + 1;
                        if (-301 != (var1.field_h + 1 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ra.field_e = ra.field_e + (float)var1.field_i.field_w;
                        var1.b((byte) -63);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var1 = (hd) (Object) cb.field_h.a((byte) -71);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null == var1) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var1.field_h = var1.field_h + 1;
                        stackOut_14_0 = var1.field_h + 1;
                        stackOut_14_1 = 75;
                        stackIn_23_0 = stackOut_14_0;
                        stackIn_23_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var2 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 <= stackIn_15_1) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var1.field_h = 75;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var1 = (hd) (Object) cb.field_h.a((byte) -71);
                        if (var2 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = param0;
                        stackOut_22_1 = -126;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 <= stackIn_23_1) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        field_m = 62;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0.0f < ra.field_e) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ra.field_e = ra.field_e * 0.8999999761581421f;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) runtimeException, "ej.G(" + param0 + 41);
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_6_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_67_0 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_81_0 = null;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        Object stackOut_5_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_66_0 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_80_0 = null;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.length >= param0 + param3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param3 + param0));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0L == (((ej) this).field_n ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof IOException ? 8 : 108);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof IOException ? 8 : 108);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((ej) this).field_d < ((ej) this).field_n) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof IOException ? 11 : 108);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof IOException ? 11 : 108);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof IOException ? 11 : 108);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((long)((ej) this).field_b + ((ej) this).field_n ^ -1L) > (((ej) this).field_d + (long)param0 ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof IOException ? 11 : 108);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ps.a(((ej) this).field_o, (int)(-((ej) this).field_n + ((ej) this).field_d), param1, param3, param0);
                        ((ej) this).field_d = ((ej) this).field_d + (long)param0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var5_long = ((ej) this).field_d;
                        var7 = param3;
                        var8 = param0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((ej) this).field_i > ((ej) this).field_d) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((long)((ej) this).field_a + ((ej) this).field_i <= ((ej) this).field_d) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = (int)((long)((ej) this).field_a + (-((ej) this).field_d + ((ej) this).field_i));
                        if ((param0 ^ -1) <= (var9 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = param0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ps.a(((ej) this).field_k, (int)(((ej) this).field_d + -((ej) this).field_i), param1, param3, var9);
                        ((ej) this).field_d = ((ej) this).field_d + (long)var9;
                        param0 = param0 - var9;
                        param3 = param3 + var9;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = 87 % ((param2 - 2) / 39);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0 > ((ej) this).field_k.length) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 44;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.a(-110);
                        var10_int = param0;
                        if (var10_int <= ((ej) this).field_a) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10_int = ((ej) this).field_a;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ps.a(((ej) this).field_k, 0, param1, param3, var10_int);
                        ((ej) this).field_d = ((ej) this).field_d + (long)var10_int;
                        param0 = param0 - var10_int;
                        param3 = param3 + var10_int;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var15 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((ej) this).field_c.a(((ej) this).field_d, (byte) 108);
                        ((ej) this).field_g = ((ej) this).field_d;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10_int = ((ej) this).field_c.a(param0, param3, 0, param1);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 0;
                        stackOut_36_1 = var10_int ^ -1;
                        stackIn_104_0 = stackOut_36_0;
                        stackIn_104_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (var15 != 0) {
                            statePc = 104;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 != stackIn_37_1) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var15 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param0 = param0 - var10_int;
                        ((ej) this).field_g = ((ej) this).field_g + (long)var10_int;
                        ((ej) this).field_d = ((ej) this).field_d + (long)var10_int;
                        param3 = param3 + var10_int;
                        if (var15 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((ej) this).field_n == -1L) {
                            statePc = 101;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((ej) this).field_n <= ((ej) this).field_d) {
                            statePc = 61;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = param0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((stackIn_49_0 ^ -1) < -1) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var10_int = (int)(-((ej) this).field_d + ((ej) this).field_n) + param3;
                        if ((param0 + param3 ^ -1) <= (var10_int ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var10_int = param0 + param3;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var10_int <= param3) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param0--;
                        param3++;
                        param1[param3] = (byte) 0;
                        ((ej) this).field_d = ((ej) this).field_d + 1L;
                        if (var15 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var15 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = -1L;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (((ej) this).field_n < var5_long) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (((ej) this).field_n >= var5_long + (long)var8) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var10 = ((ej) this).field_n;
                        stackOut_66_0 = var15;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = (stateCaught_67 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((((ej) this).field_n ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 78;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = (stateCaught_68 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = this;
                        stackIn_72_0 = stackOut_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (((long)((ej) this).field_b + ((ej) this).field_n ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var10 = var5_long;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12 = -1L;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (((long)((ej) this).field_b + ((ej) this).field_n ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackOut_80_0 = this;
                        stackIn_81_0 = stackOut_80_0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (((ej) this).field_n - -(long)((ej) this).field_b <= (long)var8 + var5_long) {
                            statePc = 91;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = (stateCaught_81 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = (stateCaught_82 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((((ej) this).field_n ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 92;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = (stateCaught_84 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = (stateCaught_85 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if ((long)var8 + var5_long > ((ej) this).field_n + (long)((ej) this).field_b) {
                            statePc = 92;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = (stateCaught_87 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = (stateCaught_88 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var12 = var5_long - -(long)var8;
                        if (var15 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = (stateCaught_90 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var12 = ((ej) this).field_n + (long)((ej) this).field_b;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = (stateCaught_91 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (-1L >= var10) {
                            statePc = 101;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = (stateCaught_92 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if ((var10 ^ -1L) <= (var12 ^ -1L)) {
                            statePc = 101;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = (stateCaught_93 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = (stateCaught_94 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var14 = (int)(var12 - var10);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = (stateCaught_96 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ps.a(((ej) this).field_o, (int)(var10 - ((ej) this).field_n), param1, var7 - -(int)(var10 - var5_long), var14);
                        if (((ej) this).field_d < var12) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = (stateCaught_97 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = (stateCaught_98 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param0 = (int)((long)param0 - (var12 + -((ej) this).field_d));
                        ((ej) this).field_d = var12;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = (stateCaught_100 instanceof IOException ? 102 : 108);
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var5 = (IOException) (Object) caughtException;
                        ((ej) this).field_g = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackOut_103_0 = param0 ^ -1;
                        stackOut_103_1 = -1;
                        stackIn_104_0 = stackOut_103_0;
                        stackIn_104_1 = stackOut_103_1;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (stackIn_104_0 >= stackIn_104_1) {
                            statePc = 114;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = (stateCaught_104 instanceof IOException ? 106 : 108);
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = (stateCaught_105 instanceof IOException ? 106 : 108);
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 108: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    try {
                        stackOut_109_0 = (RuntimeException) var5_ref;
                        stackOut_109_1 = new StringBuilder().append("ej.L(").append(param0).append(44);
                        stackIn_112_0 = stackOut_109_0;
                        stackIn_112_1 = stackOut_109_1;
                        stackIn_110_0 = stackOut_109_0;
                        stackIn_110_1 = stackOut_109_1;
                        if (param1 == null) {
                            statePc = 112;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
                        stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
                        stackOut_110_2 = "{...}";
                        stackIn_113_0 = stackOut_110_0;
                        stackIn_113_1 = stackOut_110_1;
                        stackIn_113_2 = stackOut_110_2;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 112: {
                    stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                    stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                    stackOut_112_2 = "null";
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    throw r.a((Throwable) (Object) stackIn_113_0, stackIn_113_2 + 44 + param2 + 44 + param3 + 41);
                }
                case 114: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, boolean param1) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof RuntimeException ? 5 : 2);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 3: {
                    try {
                        ((ej) this).a(param0.length, param0, (byte) -83, 0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) runtimeException;
                        stackOut_6_1 = new StringBuilder().append("ej.F(");
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (param0 == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                        stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                        stackOut_7_2 = "{...}";
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 9: {
                    stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                    stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                    stackOut_9_2 = "null";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (bj.field_K == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        hs.a((java.awt.Canvas) (Object) bj.field_K, (byte) 9);
                        bj.field_K.a(fa.field_W, -17115);
                        bj.field_K = null;
                        if (null != bh.field_p) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        bh.field_p.c(-119);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_j = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        tm.field_i.requestFocus();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var1, "ej.E(" + param0 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long a(byte param0) {
        RuntimeException var2 = null;
        long stackIn_5_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_4_0 = 0L;
        try {
          try {
            L0: {
              if (param0 <= -65) {
                break L0;
              } else {
                ((ej) this).field_g = -112L;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((ej) this).field_h;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0L;
    }

    final void a(byte param0, long param1) throws IOException {
        try {
            int var4_int = 25 % ((param0 - 26) / 38);
            // iflt L28
            ((ej) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ej.K(" + param0 + 44 + param1 + 41);
        }
    }

    final void b(byte param0) throws IOException {
        try {
            this.e(85);
            int var2_int = 115 % ((param0 - 72) / 44);
            ((ej) this).field_c.c(10);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ej.I(" + param0 + 41);
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        sl var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        rk var4 = null;
        int var4_int = 0;
        aq var5_ref_aq = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = sa.field_a;
                        if (param0 == -523) {
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
                    return;
                }
                case 3: {
                    try {
                        var2 = var1_ref.j(-78);
                        var3 = var1_ref.j(-127);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2 ^ -1) == -1) {
                            statePc = 28;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (1 != var2) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int = var1_ref.d((byte) -122);
                        var5_ref_aq = (aq) (Object) dc.field_E.d(0);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5_ref_aq == null) {
                            statePc = 18;
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
                        stackOut_10_0 = var5_ref_aq.field_m;
                        stackOut_10_1 = var3;
                        stackIn_22_0 = stackOut_10_0;
                        stackIn_22_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var8 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 != stackIn_11_1) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var5_ref_aq.field_l ^ -1) == (var4_int ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5_ref_aq = (aq) (Object) dc.field_E.a((byte) -71);
                        if (var8 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null == var5_ref_aq) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = param0;
                        stackOut_21_1 = 611;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        q.g(stackIn_22_0 ^ stackIn_22_1);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        var5_ref_aq.b((byte) -119);
                        if (var8 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        jq.a(-29901, (Throwable) null, "LR1: " + w.a(16738));
                        q.g(-113);
                        if (var8 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = (rk) (Object) na.field_J.d(0);
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
                        if (var4 == null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        q.g(-108);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return;
                }
                case 34: {
                    try {
                        var5 = rr.field_t - var1_ref.field_j;
                        var6 = var4.field_i;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var5 > var6.length << -128158270) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var5 = var6.length << -1941591678;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var5 ^ -1) >= (var7 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var6[var7 >> -774035742] = var6[var7 >> -774035742] + (var1_ref.j(-106) << (we.a(3, var7) << 1022333384));
                        var7++;
                        if (var8 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var8 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4.b((byte) -86);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var1, "ej.M(" + param0 + 41);
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) throws IOException {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int stackIn_19_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_32_0 = 0;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = -106 / ((-62 - param0) / 53);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0L != (((ej) this).field_n ^ -1L)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((ej) this).field_g ^ -1L) != (((ej) this).field_n ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((ej) this).field_c.a(((ej) this).field_n, (byte) 33);
                        ((ej) this).field_g = ((ej) this).field_n;
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
                        ((ej) this).field_c.a(((ej) this).field_o, ((ej) this).field_b, (byte) 11, 0);
                        ((ej) this).field_g = ((ej) this).field_g + (long)((ej) this).field_b;
                        if ((((ej) this).field_l ^ -1L) <= (((ej) this).field_g ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ej) this).field_l = ((ej) this).field_g;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = -1L;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((ej) this).field_i > ((ej) this).field_n) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((ej) this).field_n >= (long)((ej) this).field_a + ((ej) this).field_i) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3 = ((ej) this).field_n;
                        stackOut_18_0 = var8;
                        stackIn_19_0 = stackOut_18_0;
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
                        if (stackIn_19_0 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((ej) this).field_n > ((ej) this).field_i) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((ej) this).field_n + (long)((ej) this).field_b ^ -1L) >= (((ej) this).field_i ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
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
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var3 = ((ej) this).field_i;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5 = -1L;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((ej) this).field_i ^ -1L) <= (((ej) this).field_n - -(long)((ej) this).field_b ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((ej) this).field_i - -(long)((ej) this).field_a ^ -1L) > (((ej) this).field_n - -(long)((ej) this).field_b ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5 = (long)((ej) this).field_b + ((ej) this).field_n;
                        stackOut_32_0 = var8;
                        stackIn_33_0 = stackOut_32_0;
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
                        if (stackIn_33_0 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (((long)((ej) this).field_a + ((ej) this).field_i ^ -1L) >= (((ej) this).field_n ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (((long)((ej) this).field_b + ((ej) this).field_n ^ -1L) > (((ej) this).field_i - -(long)((ej) this).field_a ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var5 = ((ej) this).field_i - -(long)((ej) this).field_a;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-1L >= var3) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var5 ^ -1L) >= (var3 ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7 = (int)(var5 + -var3);
                        ps.a(((ej) this).field_o, (int)(-((ej) this).field_n + var3), ((ej) this).field_k, (int)(var3 - ((ej) this).field_i), var7);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((ej) this).field_b = 0;
                        ((ej) this).field_n = -1L;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var2, "ej.D(" + param0 + 41);
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ej(ra param0, int param1, int param2) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((ej) this).field_b = 0;
                    ((ej) this).field_i = -1L;
                    ((ej) this).field_n = -1L;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ej) this).field_c = param0;
                        ((ej) this).field_l = param0.b(3);
                        ((ej) this).field_h = param0.b(3);
                        ((ej) this).field_o = new byte[param2];
                        ((ej) this).field_k = new byte[param1];
                        ((ej) this).field_d = 0L;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("ej.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
                }
                case 9: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, boolean param1, sr param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object stackIn_4_0 = null;
        boolean stackIn_14_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        sr stackIn_40_0 = null;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Object stackOut_3_0 = null;
        boolean stackOut_13_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_36_0 = 0;
        sr stackOut_39_0 = null;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = rj.c(param0 ^ -85, (param4 - param3) * 3);
                        var6 = 3 * param3;
                        ah.g((byte) 111);
                        var7 = -10 + var5_int;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param2.field_o ^ -1) >= -1) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = null;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == (Object) (Object) param2.field_p) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        mf.e(param0 ^ -97);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        qj.field_e = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var8 ^ -1) <= (param2.field_u ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param2.field_s[var8];
                        var10 = param2.field_i[var8];
                        var11 = param2.field_B[var8];
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = param1;
                        stackIn_49_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = ul.field_Cb[var9];
                        var13 = he.field_i[var9];
                        var14 = -var12 + ul.field_Cb[var10];
                        var15 = -var12 + ul.field_Cb[var11];
                        var16 = he.field_i[var10] - var13;
                        var17 = -var13 + he.field_i[var11];
                        if (-1 >= (var17 * var14 + -(var16 * var15) ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = no.field_c[var9];
                        if (2147483647 == (var12 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = no.field_c[var10];
                        if ((var13 ^ -1) == 2147483647) {
                            statePc = 47;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14 = no.field_c[var11];
                        if (var14 == -2147483648) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var15 = var13 + var12 - (-var14 - -var6);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7 >= 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = var15 << -var7;
                        stackIn_26_0 = stackOut_23_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = var15 >> var7;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16 = -stackIn_26_0 + -1 + gd.field_b.length;
                        var17 = gd.field_b[var16];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-1 == (var17 >> 207627044 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16--;
                        stackOut_28_0 = var16;
                        stackIn_37_0 = stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if (var19 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 >= 0) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var17 = gd.field_b[var16];
                        if (var19 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = (var16 << -930331132) - -var17;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var18 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        jl.field_M[var18] = var8;
                        gd.field_b[var16] = var17 - -1;
                        if (-1 <= (param2.field_o ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = (sr) param2;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0.field_p == null) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        uo.field_h[param2.field_p[var8]] = uo.field_h[param2.field_p[var8]] + 1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        qj.field_e = qj.field_e + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = param2.field_o ^ -1;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 >= -1) {
                            statePc = 60;
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
                        if (param2.field_p == null) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (uo.field_h.length <= var9) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var10 = uo.field_h[var9];
                        uo.field_h[var9] = var8;
                        var8 = var8 + var10;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var9++;
                        if (var19 != 0) {
                            statePc = 71;
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
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (param0 == -27) {
                            statePc = 71;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        field_j = null;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    try {
                        stackOut_66_0 = (RuntimeException) var5;
                        stackOut_66_1 = new StringBuilder().append("ej.H(").append(param0).append(44).append(param1).append(44);
                        stackIn_69_0 = stackOut_66_0;
                        stackIn_69_1 = stackOut_66_1;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        if (param2 == null) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                        stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                        stackOut_67_2 = "{...}";
                        stackIn_70_0 = stackOut_67_0;
                        stackIn_70_1 = stackOut_67_1;
                        stackIn_70_2 = stackOut_67_2;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 69: {
                    stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                    stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                    stackOut_69_2 = "null";
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    stackIn_70_2 = stackOut_69_2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    throw r.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 44 + param3 + 44 + param4 + 41);
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Reject <%0> from this game";
        field_j = ".";
        field_e = -1;
    }
}
