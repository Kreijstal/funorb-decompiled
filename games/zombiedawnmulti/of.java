/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class of {
    private long field_m;
    static ja[] field_e;
    private long field_j;
    private byte[] field_i;
    private long field_b;
    private int field_n;
    private long field_c;
    private mc field_o;
    static ja field_k;
    private int field_a;
    static ma field_d;
    private long field_h;
    private byte[] field_f;
    static String field_p;
    static int field_g;
    private long field_l;

    final void a(long param0, byte param1) throws IOException {
        if (param1 != -70) {
            java.awt.Component var5 = (java.awt.Component) null;
            of.a(-66, (java.awt.Component) null);
        }
        if ((param0 ^ -1L) > -1L) {
            throw new IOException();
        }
        this.field_h = param0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2.length >= param0 + param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param1 - (-param0 + param2.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == this.field_m) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((this.field_m ^ -1L) < (this.field_h ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_h - -(long)param0 > (long)this.field_a + this.field_m) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        d.a(this.field_f, (int)(this.field_h - this.field_m), param2, param1, param0);
                        this.field_h = this.field_h + (long)param0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_int = -124 / ((param3 - -37) / 57);
                        var6 = this.field_h;
                        var8 = param1;
                        var9 = param0;
                        if ((this.field_h ^ -1L) > (this.field_l ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((this.field_l + (long)this.field_n ^ -1L) < (this.field_h ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10_int = (int)(-this.field_h + (this.field_l + (long)this.field_n));
                        if ((param0 ^ -1) > (var10_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10_int = param0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        d.a(this.field_i, (int)(-this.field_l + this.field_h), param2, param1, var10_int);
                        this.field_h = this.field_h + (long)var10_int;
                        param1 = param1 + var10_int;
                        param0 = param0 - var10_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((this.field_i.length ^ -1) > (param0 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 < param0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.b(-8855);
                        var10_int = param0;
                        if ((var10_int ^ -1) >= (this.field_n ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10_int = this.field_n;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        d.a(this.field_i, 0, param2, param1, var10_int);
                        param0 = param0 - var10_int;
                        param1 = param1 + var10_int;
                        this.field_h = this.field_h + (long)var10_int;
                        if (var15 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_o.a((byte) -127, this.field_h);
                        this.field_c = this.field_h;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param0 <= 0) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10_int = this.field_o.a(param0, param2, -1, param1);
                        stackIn_27_0 = var10_int ^ -1;
                        stackIn_24_0 = stackIn_27_0;
                        if (var15 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        param0 = param0 - var10_int;
                        this.field_h = this.field_h + (long)var10_int;
                        this.field_c = this.field_c + (long)var10_int;
                        param1 = param1 + var10_int;
                        if (var15 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = (0L < (this.field_m ^ -1L) ? -1 : (0L == (this.field_m ^ -1L) ? 0 : 1));
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((this.field_m ^ -1L) >= (this.field_h ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-1 > (param0 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var10_int = param1 + (int)(-this.field_h + this.field_m);
                        if (param1 + param0 >= var10_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10_int = param1 + param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var10_int <= param1) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = ((Object) stateCaught_35 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param0--;
                        incrementValue$0 = param1;
                        param1++;
                        param2[incrementValue$0] = (byte) 0;
                        this.field_h = this.field_h + 1L;
                        if (var15 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = ((Object) stateCaught_36 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var15 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = ((Object) stateCaught_38 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var10 = -1L;
                        if ((var6 ^ -1L) < (this.field_m ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_m < var6 + (long)var9) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = ((Object) stateCaught_41 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var6 ^ -1L) > (this.field_m ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = ((Object) stateCaught_42 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (((long)this.field_a + this.field_m ^ -1L) < (var6 ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = ((Object) stateCaught_43 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = ((Object) stateCaught_44 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var10 = var6;
                        if (var15 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = ((Object) stateCaught_45 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10 = this.field_m;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = ((Object) stateCaught_46 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var12 = -1L;
                        if ((var6 ^ -1L) <= (this.field_m - -(long)this.field_a ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = ((Object) stateCaught_47 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((long)var9 + var6 < (long)this.field_a + this.field_m) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = ((Object) stateCaught_48 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var12 = (long)this.field_a + this.field_m;
                        if (var15 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = ((Object) stateCaught_49 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((this.field_m ^ -1L) <= (var6 + (long)var9 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = ((Object) stateCaught_50 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (((long)this.field_a + this.field_m ^ -1L) <= (var6 + (long)var9 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = ((Object) stateCaught_51 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var12 = var6 + (long)var9;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-1L >= var10) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var12 > var10) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var14 = (int)(-var10 + var12);
                        d.a(this.field_f, (int)(-this.field_m + var10), param2, (int)(-var6 + var10) + var8, var14);
                        if (this.field_h < var12) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = ((Object) stateCaught_57 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = ((Object) stateCaught_58 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        param0 = (int)((long)param0 - (var12 - this.field_h));
                        this.field_h = var12;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = ((Object) stateCaught_59 instanceof IOException ? 61 : 66);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var5 = (IOException) ((Object) caughtException);
                        this.field_c = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((param0 ^ -1) < -1) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_68_0 = (RuntimeException) (var5_ref);
                    stackIn_67_0 = stackIn_68_0;
                    stackIn_68_1 = new StringBuilder().append("of.L(").append(param0).append(',').append(param1).append(',');
                    stackIn_67_1 = stackIn_68_1;
                    if (param2 == null) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_69_2 = "{...}";
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_69_2 = "null";
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    throw fa.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param3 + ')');
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(byte param0) {
        we.field_k = new th();
        if (param0 < 97) {
            java.awt.Component var2 = (java.awt.Component) null;
            of.a(116, (java.awt.Component) null);
        }
    }

    final void a(byte param0) throws IOException {
        this.c((byte) -23);
        this.field_o.b((byte) 38);
        if (param0 >= -84) {
            of.a(-119);
        }
    }

    private final void c(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_m == -1L) {
            break L0;
          } else {
            L1: {
              if ((this.field_c ^ -1L) == (this.field_m ^ -1L)) {
                break L1;
              } else {
                this.field_o.a((byte) -127, this.field_m);
                this.field_c = this.field_m;
                break L1;
              }
            }
            L2: {
              this.field_o.a((byte) 74, 0, this.field_a, this.field_f);
              this.field_c = this.field_c + (long)this.field_a;
              if ((this.field_c ^ -1L) < (this.field_b ^ -1L)) {
                this.field_b = this.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  var2 = -1L;
                  var4 = -1L;
                  if ((this.field_m ^ -1L) > (this.field_l ^ -1L)) {
                    break L5;
                  } else {
                    if ((this.field_m ^ -1L) > ((long)this.field_n + this.field_l ^ -1L)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (this.field_l < this.field_m) {
                  break L3;
                } else {
                  if (((long)this.field_a + this.field_m ^ -1L) >= (this.field_l ^ -1L)) {
                    break L3;
                  } else {
                    var2 = this.field_l;
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var2 = this.field_m;
              break L3;
            }
            L6: {
              L7: {
                L8: {
                  if ((this.field_l ^ -1L) <= ((long)this.field_a + this.field_m ^ -1L)) {
                    break L8;
                  } else {
                    if ((long)this.field_n + this.field_l >= this.field_m - -(long)this.field_a) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (this.field_l + (long)this.field_n <= this.field_m) {
                  break L6;
                } else {
                  if (this.field_m - -(long)this.field_a >= this.field_l + (long)this.field_n) {
                    var4 = this.field_l - -(long)this.field_n;
                    if (var7 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              var4 = this.field_m - -(long)this.field_a;
              break L6;
            }
            L9: {
              if (0L <= (var2 ^ -1L)) {
                break L9;
              } else {
                if (var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  d.a(this.field_f, (int)(-this.field_m + var2), this.field_i, (int)(-this.field_l + var2), var6);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            this.field_a = 0;
            this.field_m = -1L;
            break L0;
          }
        }
        L10: {
          if (param0 == -23) {
            break L10;
          } else {
            of.a(34);
            break L10;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_j < this.field_h - -(long)param1) {
                    this.field_j = this.field_h + (long)param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0L == (this.field_m ^ -1L)) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_m > this.field_h) {
                        break L4;
                      } else {
                        if ((this.field_h ^ -1L) >= ((long)this.field_a + this.field_m ^ -1L)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.c((byte) -23);
                    break L3;
                  }
                }
                L5: {
                  if (this.field_m == (long)param0) {
                    break L5;
                  } else {
                    if (this.field_h - -(long)param1 > (long)this.field_f.length + this.field_m) {
                      var5_int = (int)(-this.field_h + (this.field_m + (long)this.field_f.length));
                      d.a(param3, param2, this.field_f, (int)(this.field_h + -this.field_m), var5_int);
                      param2 = param2 + var5_int;
                      param1 = param1 - var5_int;
                      this.field_h = this.field_h + (long)var5_int;
                      this.field_a = this.field_f.length;
                      this.c((byte) -23);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if ((param1 ^ -1) < (this.field_f.length ^ -1)) {
                  L6: {
                    if ((this.field_h ^ -1L) == (this.field_c ^ -1L)) {
                      break L6;
                    } else {
                      this.field_o.a((byte) -126, this.field_h);
                      this.field_c = this.field_h;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_o.a((byte) 110, param2, param1, param3);
                    this.field_c = this.field_c + (long)param1;
                    if (this.field_b < this.field_c) {
                      this.field_b = this.field_c;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      if ((this.field_l ^ -1L) < (this.field_h ^ -1L)) {
                        break L9;
                      } else {
                        if (this.field_h >= this.field_l + (long)this.field_n) {
                          break L9;
                        } else {
                          var5_long = this.field_h;
                          if (var10 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (this.field_h > this.field_l) {
                      break L8;
                    } else {
                      if (this.field_l < (long)param1 + this.field_h) {
                        var5_long = this.field_l;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      L12: {
                        var7 = -1L;
                        if (this.field_l >= (long)param1 + this.field_h) {
                          break L12;
                        } else {
                          if ((this.field_l - -(long)this.field_n ^ -1L) <= (this.field_h - -(long)param1 ^ -1L)) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (this.field_h >= this.field_l - -(long)this.field_n) {
                        break L10;
                      } else {
                        if (this.field_l - -(long)this.field_n <= this.field_h + (long)param1) {
                          var7 = this.field_l - -(long)this.field_n;
                          if (var10 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                    var7 = (long)param1 + this.field_h;
                    break L10;
                  }
                  L13: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L13;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(var7 + -var5_long);
                        d.a(param3, (int)(-this.field_h + (var5_long + (long)param2)), this.field_i, (int)(-this.field_l + var5_long), var9);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_h = this.field_h + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (0 < param1) {
                    L14: {
                      if ((this.field_m ^ -1L) != 0L) {
                        break L14;
                      } else {
                        this.field_m = this.field_h;
                        break L14;
                      }
                    }
                    L15: {
                      d.a(param3, param2, this.field_f, (int)(this.field_h - this.field_m), param1);
                      this.field_h = this.field_h + (long)param1;
                      if ((long)this.field_a >= -this.field_m + this.field_h) {
                        break L15;
                      } else {
                        this.field_a = (int)(this.field_h - this.field_m);
                        break L15;
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
              this.field_c = -1L;
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
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var5_ref);

            stackIn_53_1 = new StringBuilder().append("of.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L16;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L16;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
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

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            this.a(param0.length, 0, param0, -117);
            int var3_int = -85 % ((70 - param1) / 44);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "of.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void b(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_n = 0;
          if ((this.field_h ^ -1L) == (this.field_c ^ -1L)) {
            break L0;
          } else {
            this.field_o.a((byte) -128, this.field_h);
            this.field_c = this.field_h;
            break L0;
          }
        }
        this.field_l = this.field_h;
        L1: while (true) {
          L2: {
            L3: {
              if ((this.field_n ^ -1) <= (this.field_i.length ^ -1)) {
                break L3;
              } else {
                var2 = -this.field_n + this.field_i.length;
                stackIn_12_0 = -200000001;

                stackIn_12_1 = var2 ^ -1;

                if (var4 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_12_0 > stackIn_12_1) {
                      var2 = 200000000;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3 = this.field_o.a(var2, this.field_i, -1, this.field_n);
                  if (-1 == var3) {
                    break L3;
                  } else {
                    this.field_c = this.field_c + (long)var3;
                    this.field_n = this.field_n + var3;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackIn_12_0 = param0;
            stackIn_12_1 = -8855;
            break L2;
          }
          L5: {
            if (stackIn_12_0 == stackIn_12_1) {
              break L5;
            } else {
              of.d(56);
              break L5;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_g = 68;
        }
        field_k = null;
        field_p = null;
        field_d = null;
        field_e = null;
    }

    final long c(int param0) {
        if (param0 != -1) {
            this.field_j = -25L;
        }
        return this.field_j;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(on.field_Z);
            param1.removeMouseMotionListener(on.field_Z);
            param1.removeFocusListener(on.field_Z);
            hh.field_e = 0;
            if (param0 != -1693) {
                field_e = (ja[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "of.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    of(mc param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_a = 0;
        this.field_l = -1L;
        try {
            this.field_o = param0;
            dupTemp$0 = param0.a(-111);
            this.field_b = dupTemp$0;
            this.field_j = dupTemp$0;
            this.field_f = new byte[param2];
            this.field_i = new byte[param1];
            this.field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static gh d(int param0) {
        if (mp.field_b == id.field_B) {
            throw new IllegalStateException();
        }
        if (param0 != 0) {
            return (gh) null;
        }
        if (oi.field_j != id.field_B) {
            return null;
        }
        id.field_B = mp.field_b;
        return iq.field_c;
    }

    static {
        field_e = new ja[5];
        field_p = "Friends";
        field_d = new ma();
    }
}
