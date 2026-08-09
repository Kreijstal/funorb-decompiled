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
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
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
                        statePc = ((Object) stateCaught_1 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param2 + (param1 + -param0.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof IOException ? 60 : 65);
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
                        statePc = ((Object) stateCaught_3 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_n = -84L;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_j == -1L) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_d < this.field_j) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((long)this.field_h + this.field_j >= (long)param2 + this.field_d) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        dm.a(this.field_b, (int)(-this.field_j + this.field_d), param0, param1, param2);
                        this.field_d = this.field_d + (long)param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var5_long = this.field_d;
                        var7 = param1;
                        var8 = param2;
                        if ((this.field_d ^ -1L) > (this.field_g ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((long)this.field_i + this.field_g ^ -1L) >= (this.field_d ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)this.field_i - (-this.field_g + this.field_d));
                        if (param2 >= var9_int) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof IOException ? 60 : 65);
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
                        statePc = ((Object) stateCaught_14 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        dm.a(this.field_f, (int)(-this.field_g + this.field_d), param0, param1, var9_int);
                        param2 = param2 - var9_int;
                        param1 = param1 + var9_int;
                        this.field_d = this.field_d + (long)var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2 > this.field_f.length) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((param2 ^ -1) >= -1) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.b(98);
                        var9_int = param2;
                        if (this.field_i >= var9_int) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int = this.field_i;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dm.a(this.field_f, 0, param0, param1, var9_int);
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        this.field_d = this.field_d + (long)var9_int;
                        if (var14 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_m.a(this.field_d, (byte) -127);
                        this.field_k = this.field_d;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (0 >= param2) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = this.field_m.a(param0, param1, 0, param2);
                        stackIn_32_0 = 0;
                        stackIn_24_0 = stackIn_32_0;
                        stackIn_32_1 = var9_int ^ -1;
                        stackIn_24_1 = stackIn_32_1;
                        if (var14 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 != stackIn_24_1) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var14 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_k = this.field_k + (long)var9_int;
                        this.field_d = this.field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1L != this.field_j) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((this.field_d ^ -1L) <= (this.field_j ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = 0;
                        stackIn_32_1 = param2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 >= stackIn_32_1) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = (int)(-this.field_d + this.field_j) + param1;
                        if (param2 + param1 >= var9_int) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param1 + param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var9_int <= param1) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = ((Object) stateCaught_35 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        incrementValue$0 = param1;
                        param1++;
                        param0[incrementValue$0] = (byte) 0;
                        param2--;
                        this.field_d = this.field_d + 1L;
                        if (var14 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = ((Object) stateCaught_36 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = ((Object) stateCaught_38 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((this.field_j ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((long)var8 + var5_long > this.field_j) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = ((Object) stateCaught_41 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (this.field_j > var5_long) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = ((Object) stateCaught_42 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long ^ -1L) > (this.field_j + (long)this.field_h ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = ((Object) stateCaught_43 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = ((Object) stateCaught_44 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = var5_long;
                        if (var14 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = ((Object) stateCaught_45 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = this.field_j;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = ((Object) stateCaught_46 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var5_long ^ -1L) <= (this.field_j - -(long)this.field_h ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = ((Object) stateCaught_47 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) <= (this.field_j - -(long)this.field_h ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = ((Object) stateCaught_48 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = ((Object) stateCaught_49 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((long)var8 + var5_long <= this.field_j) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = ((Object) stateCaught_50 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) < (this.field_j + (long)this.field_h ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = ((Object) stateCaught_51 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = (long)var8 + var5_long;
                        if (var14 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = (long)this.field_h + this.field_j;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var11 <= var9) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var13 = (int)(-var9 + var11);
                        dm.a(this.field_b, (int)(var9 - this.field_j), param0, var7 - -(int)(var9 - var5_long), var13);
                        if ((var11 ^ -1L) < (this.field_d ^ -1L)) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = ((Object) stateCaught_57 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        param2 = (int)((long)param2 - (var11 - this.field_d));
                        this.field_d = var11;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = ((Object) stateCaught_58 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var5 = (IOException) ((Object) caughtException);
                        this.field_k = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param2 > 0) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_67_0 = (RuntimeException) (var5_ref);
                    stackIn_66_0 = stackIn_67_0;
                    stackIn_67_1 = new StringBuilder().append("k.I(");
                    stackIn_66_1 = stackIn_67_1;
                    if (param0 == null) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_68_2 = "{...}";
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_68_2 = "null";
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    throw pf.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4;
        L0: {
          if (param0 == -40) {
            break L0;
          } else {
            field_a = 108;
            break L0;
          }
        }
        L1: {
          df.field_b.d(param2, param1);
          if (param3) {
            L2: {
              var4 = 2 * (bf.field_b % df.field_b.field_w);
              if (df.field_b.field_w > var4) {
                break L2;
              } else {
                var4 = -var4 - (-df.field_b.field_w - df.field_b.field_w);
                break L2;
              }
            }
            L3: {
              L4: {
                if (var4 >= 10) {
                  break L4;
                } else {
                  var4 = 10;
                  if (!fleas.field_A) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (-40 + df.field_b.field_w < var4) {
                var4 = -40 + df.field_b.field_w;
                break L3;
              } else {
                break L3;
              }
            }
            qe.a(0, 30, df.field_b, 0, var4, param1, 80, 5120, param2);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var5_int = -66 / ((29 - param3) / 41);
                  if (this.field_o < (long)param2 + this.field_d) {
                    this.field_o = this.field_d + (long)param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_j == -1L) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_d ^ -1L) > (this.field_j ^ -1L)) {
                        break L4;
                      } else {
                        if (this.field_d > this.field_j - -(long)this.field_h) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a((byte) -109);
                    break L3;
                  }
                }
                L5: {
                  if (this.field_j == -1L) {
                    break L5;
                  } else {
                    if (this.field_d - -(long)param2 <= this.field_j - -(long)this.field_b.length) {
                      break L5;
                    } else {
                      var6_int = (int)(-this.field_d - (-this.field_j - (long)this.field_b.length));
                      dm.a(param1, param0, this.field_b, (int)(-this.field_j + this.field_d), var6_int);
                      param0 = param0 + var6_int;
                      this.field_d = this.field_d + (long)var6_int;
                      param2 = param2 - var6_int;
                      this.field_h = this.field_b.length;
                      this.a((byte) 41);
                      break L5;
                    }
                  }
                }
                if (this.field_b.length < param2) {
                  L6: {
                    if (this.field_d == this.field_k) {
                      break L6;
                    } else {
                      this.field_m.a(this.field_d, (byte) -114);
                      this.field_k = this.field_d;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_m.a((byte) 110, param2, param0, param1);
                    this.field_k = this.field_k + (long)param2;
                    if (this.field_n < this.field_k) {
                      this.field_n = this.field_k;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var6 = -1L;
                      var8 = -1L;
                      if (this.field_d < this.field_g) {
                        break L9;
                      } else {
                        if ((this.field_g + (long)this.field_i ^ -1L) >= (this.field_d ^ -1L)) {
                          break L9;
                        } else {
                          var6 = this.field_d;
                          if (var11 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if ((this.field_g ^ -1L) > (this.field_d ^ -1L)) {
                      break L8;
                    } else {
                      if ((this.field_g ^ -1L) > ((long)param2 + this.field_d ^ -1L)) {
                        var6 = this.field_g;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if ((this.field_g ^ -1L) <= ((long)param2 + this.field_d ^ -1L)) {
                        break L11;
                      } else {
                        if ((long)this.field_i + this.field_g < this.field_d - -(long)param2) {
                          break L11;
                        } else {
                          var8 = (long)param2 + this.field_d;
                          if (var11 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (this.field_d >= (long)this.field_i + this.field_g) {
                      break L10;
                    } else {
                      if (((long)this.field_i + this.field_g ^ -1L) >= (this.field_d + (long)param2 ^ -1L)) {
                        var8 = this.field_g + (long)this.field_i;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (0L <= (var6 ^ -1L)) {
                      break L12;
                    } else {
                      if ((var6 ^ -1L) > (var8 ^ -1L)) {
                        var10 = (int)(-var6 + var8);
                        dm.a(param1, (int)((long)param0 - (-var6 - -this.field_d)), this.field_f, (int)(-this.field_g + var6), var10);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.field_d = this.field_d + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (param2 > 0) {
                    L13: {
                      if ((this.field_j ^ -1L) != 0L) {
                        break L13;
                      } else {
                        this.field_j = this.field_d;
                        break L13;
                      }
                    }
                    L14: {
                      dm.a(param1, param0, this.field_b, (int)(-this.field_j + this.field_d), param2);
                      this.field_d = this.field_d + (long)param2;
                      if (((long)this.field_h ^ -1L) <= (this.field_d - this.field_j ^ -1L)) {
                        break L14;
                      } else {
                        this.field_h = (int)(this.field_d + -this.field_j);
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_k = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var5_ref);

            stackIn_51_1 = new StringBuilder().append("k.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L15;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L15;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
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
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          var2 = 50 / ((param0 - -24) / 54);
          if (-1L != this.field_j) {
            L1: {
              if ((this.field_k ^ -1L) == (this.field_j ^ -1L)) {
                break L1;
              } else {
                this.field_m.a(this.field_j, (byte) -114);
                this.field_k = this.field_j;
                break L1;
              }
            }
            L2: {
              this.field_m.a((byte) 109, this.field_h, 0, this.field_b);
              this.field_k = this.field_k + (long)this.field_h;
              if (this.field_k > this.field_n) {
                this.field_n = this.field_k;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if ((this.field_j ^ -1L) > (this.field_g ^ -1L)) {
                  break L4;
                } else {
                  if (this.field_j >= this.field_g - -(long)this.field_i) {
                    break L4;
                  } else {
                    var3 = this.field_j;
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if ((this.field_j ^ -1L) < (this.field_g ^ -1L)) {
                break L3;
              } else {
                if (((long)this.field_h + this.field_j ^ -1L) >= (this.field_g ^ -1L)) {
                  break L3;
                } else {
                  var3 = this.field_g;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                L7: {
                  if ((this.field_g ^ -1L) <= ((long)this.field_h + this.field_j ^ -1L)) {
                    break L7;
                  } else {
                    if (((long)this.field_h + this.field_j ^ -1L) >= (this.field_g - -(long)this.field_i ^ -1L)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (((long)this.field_i + this.field_g ^ -1L) >= (this.field_j ^ -1L)) {
                  break L5;
                } else {
                  if (((long)this.field_h + this.field_j ^ -1L) <= (this.field_g + (long)this.field_i ^ -1L)) {
                    var5 = this.field_g + (long)this.field_i;
                    if (var8 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var5 = (long)this.field_h + this.field_j;
              break L5;
            }
            L8: {
              if (var3 <= -1L) {
                break L8;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  dm.a(this.field_b, (int)(var3 - this.field_j), this.field_f, (int)(-this.field_g + var3), var7);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_h = 0;
            this.field_j = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final void b(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          if (param0 >= 47) {
            break L0;
          } else {
            k.a(92, 3, 126, true);
            break L0;
          }
        }
        L1: {
          this.field_i = 0;
          if ((this.field_d ^ -1L) != (this.field_k ^ -1L)) {
            this.field_m.a(this.field_d, (byte) -121);
            this.field_k = this.field_d;
            break L1;
          } else {
            break L1;
          }
        }
        this.field_g = this.field_d;
        L2: while (true) {
          L3: {
            if (this.field_f.length <= this.field_i) {
              break L3;
            } else {
              var2 = -this.field_i + this.field_f.length;
              if (var4 != 0) {
                break L3;
              } else {
                L4: {
                  if (200000000 < var2) {
                    var2 = 200000000;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var3 = this.field_m.a(this.field_f, this.field_i, 0, var2);
                  if (0 != (var3 ^ -1)) {
                    break L5;
                  } else {
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_k = this.field_k + (long)var3;
                this.field_i = this.field_i + var3;
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, wk param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              uc.a((byte) 5, true, param1);
              if (param0 == 0) {
                break L1;
              } else {
                k.a(-15, -38, 84, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("k.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
              this.field_b = (byte[]) null;
              break L0;
            }
          }
          this.field_d = param1;
          return;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.a(param1, 0, param1.length, 6520);
              if (param0 == 631) {
                break L1;
              } else {
                this.field_b = (byte[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("k.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) 74);
        if (param0 != -70) {
            k.a(-30, -73, -71, false);
        }
        this.field_m.b(-1);
    }

    final long c(byte param0) {
        if (param0 >= -46) {
            return 49L;
        }
        return this.field_o;
    }

    k(rl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_g = -1L;
        this.field_h = 0;
        this.field_j = -1L;
        try {
            this.field_m = param0;
            dupTemp$0 = param0.c(2049105808);
            this.field_n = dupTemp$0;
            this.field_o = dupTemp$0;
            this.field_b = new byte[param2];
            this.field_f = new byte[param1];
            this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = new int[8192];
        field_a = 16777215;
        field_e = "Please try again in a few minutes.";
    }
}
