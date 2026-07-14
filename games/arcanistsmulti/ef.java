/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ef extends lk {
    static String field_s;
    static int field_t;
    static String field_v;
    static String field_q;
    private k field_w;
    static boolean field_r;
    static vn field_u;

    final void a(byte param0) {
        try {
            ((ef) this).field_w.d(param0 ^ -23482);
        } catch (Exception exception) {
        }
        ((ef) this).field_o = -1;
        if (param0 != 0) {
            field_q = null;
        }
        ((ef) this).field_w = null;
        ((ef) this).field_i = ((ef) this).field_i + 1;
        ((ef) this).field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            Object var5 = null;
            wk stackIn_6_0 = null;
            wk stackIn_7_0 = null;
            wk stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            wk stackOut_5_0 = null;
            wk stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            wk stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ef) this).field_w == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            if (param0 < -41) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var5 = null;
                            ((ef) this).a(false, true, (Object) null);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((ef) this).field_c.field_g = 0;
                            stackOut_5_0 = ((ef) this).field_c;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (!param1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (wk) (Object) stackIn_6_0;
                            stackOut_6_1 = 2;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = (wk) (Object) stackIn_7_0;
                            stackOut_7_1 = 3;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((wk) (Object) stackIn_8_0).f(stackIn_8_1, (byte) -62);
                            ((ef) this).field_c.a((byte) -118, 0L);
                            ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 122, ((ef) this).field_c.field_j);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((ef) this).field_w.d(-23482);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        ((ef) this).field_o = -2;
                        ((ef) this).field_i = ((ef) this).field_i + 1;
                        ((ef) this).field_w = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        if (param0 != 16711422) {
            return;
        }
        if (!(null == ((ef) this).field_w)) {
            ((ef) this).field_w.d(param0 ^ -16688456);
        }
    }

    final void a(boolean param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            vk var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ArcanistsMulti.field_G ? 1 : 0;
                        if (((ef) this).field_w != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((ef) this).field_w.d(-23482);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((ef) this).field_w = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((ef) this).field_w = (k) param2;
                        this.d((byte) 113);
                        this.a(-101, param0);
                        ((ef) this).field_n = null;
                        ((ef) this).field_e.field_g = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (vk) (Object) ((ef) this).field_g.a((byte) 118);
                        if (var4_ref2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((ef) this).field_b.a((tf) (Object) var4_ref2, 15893);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (vk) (Object) ((ef) this).field_m.a((byte) 124);
                        if (var4_ref2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((ef) this).field_f.a((tf) (Object) var4_ref2, 15893);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        if (((ef) this).field_a == 0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((ef) this).field_c.field_g = 0;
                            ((ef) this).field_c.f(4, (byte) -116);
                            ((ef) this).field_c.f((int) ((ef) this).field_a, (byte) -67);
                            ((ef) this).field_c.a(0, (byte) -101);
                            ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 122, ((ef) this).field_c.field_j);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((ef) this).field_w.d(-23482);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((ef) this).field_i = ((ef) this).field_i + 1;
                        ((ef) this).field_o = -2;
                        ((ef) this).field_w = null;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((ef) this).field_k = 0;
                        if (param1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        field_q = null;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((ef) this).field_p = qj.b(-26572);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ll a(int[] param0, byte param1, ll param2) {
        int var3 = 15 / ((param1 - 29) / 49);
        ll var4 = new ll(0, 0, 0);
        var4.field_m = param2.field_m;
        var4.field_j = param2.field_j;
        var4.field_f = param2.field_f;
        var4.field_k = param2.field_k;
        var4.field_l = param0;
        var4.field_c = param2.field_c;
        var4.field_h = param2.field_h;
        var4.field_g = param2.field_g;
        return var4;
    }

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            vk var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            vk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_53_0 = 0;
            int stackIn_70_0 = 0;
            int stackIn_94_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_68_0 = 0;
            int stackOut_69_0 = 0;
            int stackOut_93_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ArcanistsMulti.field_G ? 1 : 0;
                        if (((ef) this).field_w != null) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = qj.b(-26572);
                        var4 = (int)(-((ef) this).field_p + var2_long);
                        ((ef) this).field_p = var2_long;
                        if (200 < var4) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = 200;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((ef) this).field_k = ((ef) this).field_k + var4;
                        if (-30001 <= (((ef) this).field_k ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ef) this).field_w.d(-23482);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((ef) this).field_w = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == ((ef) this).field_w) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((ef) this).b((byte) 88) == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        if (((ef) this).a(-89) == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    case 18: {
                        try {
                            ((ef) this).field_w.a(false);
                            var2_ref = (vk) (Object) ((ef) this).field_b.b(96);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2_ref == null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((ef) this).field_c.field_g = 0;
                            ((ef) this).field_c.f(1, (byte) -64);
                            ((ef) this).field_c.a((byte) -127, var2_ref.field_k);
                            ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 116, ((ef) this).field_c.field_j);
                            ((ef) this).field_g.a((tf) (Object) var2_ref, 15893);
                            var2_ref = (vk) (Object) ((ef) this).field_b.e(-30);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (param0 == -3145) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((ef) this).c(80);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_ref = (vk) (Object) ((ef) this).field_f.b(63);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2_ref == null) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((ef) this).field_c.field_g = 0;
                            ((ef) this).field_c.f(0, (byte) -68);
                            ((ef) this).field_c.a((byte) -121, var2_ref.field_k);
                            ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 116, ((ef) this).field_c.field_j);
                            ((ef) this).field_m.a((tf) (Object) var2_ref, 15893);
                            var2_ref = (vk) (Object) ((ef) this).field_f.e(param0 + 3265);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var2_int = 0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 93;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var3_int = ((ef) this).field_w.b(param0 ^ -3145);
                            if (0 > var3_int) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var3_int == 0) {
                                statePc = 93;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((ef) this).field_k = 0;
                            var4 = 0;
                            if (null == ((ef) this).field_n) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (((ef) this).field_n.field_x == -1) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var4 = 1;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var4 = 10;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (-1 >= var4) {
                                statePc = 77;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var5 = var4 - ((ef) this).field_e.field_g;
                            if (var3_int < var5) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var5 = var3_int;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((ef) this).field_w.a(((ef) this).field_e.field_j, (byte) -125, ((ef) this).field_e.field_g, var5);
                            if (0 != ((ef) this).field_a) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var6 = 0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var5 <= var6) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((ef) this).field_e.field_j[((ef) this).field_e.field_g + var6] = (byte)hh.a((int) ((ef) this).field_e.field_j[((ef) this).field_e.field_g + var6], (int) ((ef) this).field_a);
                            var6++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((ef) this).field_e.field_g = ((ef) this).field_e.field_g + var5;
                            if (((ef) this).field_e.field_g >= var4) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (((ef) this).field_n == null) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((ef) this).field_e.field_g = 0;
                            var6 = ((ef) this).field_e.e((byte) -104);
                            var7 = ((ef) this).field_e.d(-10674);
                            var8 = ((ef) this).field_e.e((byte) 63);
                            var9 = ((ef) this).field_e.d(-10674);
                            var10 = var8 & 127;
                            if ((var8 & 128) == 0) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackOut_51_0 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var11 = stackIn_53_0;
                            var12 = (long)var7 + ((long)var6 << -479851488);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 59;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var14_ref = (vk) (Object) ((ef) this).field_m.b(54);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var14_ref == null) {
                                statePc = 64;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_k ^ -1L)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var14_ref = (vk) (Object) ((ef) this).field_m.e(-6);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (vk) (Object) ((ef) this).field_g.b(54);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (var14_ref == null) {
                                statePc = 64;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if ((var14_ref.field_k ^ -1L) != (var12 ^ -1L)) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (vk) (Object) ((ef) this).field_g.e(124);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var14_ref == null) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            ((ef) this).field_n = var14_ref;
                            if (-1 != (var10 ^ -1)) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackOut_68_0 = 5;
                            stackIn_70_0 = stackOut_68_0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            stackOut_69_0 = 9;
                            stackIn_70_0 = stackOut_69_0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var15 = stackIn_70_0;
                            ((ef) this).field_n.field_A = new wk(var15 + (var9 - -((ef) this).field_n.field_y));
                            ((ef) this).field_n.field_A.f(var10, (byte) -62);
                            ((ef) this).field_n.field_A.a(var9, (byte) -101);
                            ((ef) this).field_e.field_g = 0;
                            ((ef) this).field_n.field_x = 10;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (-1 == (((ef) this).field_n.field_x ^ -1)) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (-1 == ((ef) this).field_e.field_j[0]) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((ef) this).field_n = null;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((ef) this).field_e.field_g = 0;
                            ((ef) this).field_n.field_x = 1;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var5 = ((ef) this).field_n.field_A.field_j.length + -((ef) this).field_n.field_y;
                            var6 = -((ef) this).field_n.field_x + 512;
                            if (var6 <= -((ef) this).field_n.field_A.field_g + var5) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var6 = -((ef) this).field_n.field_A.field_g + var5;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var6 = var3_int;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((ef) this).field_w.a(((ef) this).field_n.field_A.field_j, (byte) -123, ((ef) this).field_n.field_A.field_g, var6);
                            if (((ef) this).field_a != 0) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var6 <= var17) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((ef) this).field_n.field_A.field_j[((ef) this).field_n.field_A.field_g - -var17] = (byte)hh.a((int) ((ef) this).field_n.field_A.field_j[((ef) this).field_n.field_A.field_g + var17], (int) ((ef) this).field_a);
                            var17++;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            ((ef) this).field_n.field_x = ((ef) this).field_n.field_x + var6;
                            ((ef) this).field_n.field_A.field_g = ((ef) this).field_n.field_A.field_g + var6;
                            if (var5 == ((ef) this).field_n.field_A.field_g) {
                                statePc = 91;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if ((((ef) this).field_n.field_x ^ -1) == -513) {
                                statePc = 90;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            ((ef) this).field_n.field_x = 0;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            ((ef) this).field_n.a((byte) 88);
                            ((ef) this).field_n.field_p = false;
                            ((ef) this).field_n = null;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var2_int++;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            stackOut_93_0 = 1;
                            stackIn_94_0 = stackOut_93_0;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 95;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        return stackIn_94_0 != 0;
                    }
                    case 95: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 96;
                        continue stateLoop;
                    }
                    case 96: {
                        try {
                            ((ef) this).field_w.d(-23482);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 98;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 99;
                        continue stateLoop;
                    }
                    case 99: {
                        ((ef) this).field_w = null;
                        ((ef) this).field_o = -2;
                        ((ef) this).field_i = ((ef) this).field_i + 1;
                        if (((ef) this).b((byte) 88) == 0) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    }
                    case 100: {
                        return false;
                    }
                    case 101: {
                        if (((ef) this).a(-120) != 0) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    }
                    case 102: {
                        return true;
                    }
                    case 103: {
                        return false;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ef() {
    }

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            int var2_int = 0;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ef) this).field_w != null) {
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
                            ((ef) this).field_c.field_g = 0;
                            ((ef) this).field_c.f(6, (byte) -18);
                            var2_int = 1 % ((param0 - 54) / 43);
                            ((ef) this).field_c.a((byte) -120, 3);
                            ((ef) this).field_c.c(0, (byte) -66);
                            ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 117, ((ef) this).field_c.field_j);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((ef) this).field_w.d(-23482);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((ef) this).field_i = ((ef) this).field_i + 1;
                        ((ef) this).field_w = null;
                        ((ef) this).field_o = -2;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_u = null;
        field_q = null;
        field_s = null;
        field_v = null;
        if (param0 != -1) {
            ef.g(65);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Game options changed (<%0>)";
        field_s = "Quick Chat game";
        field_q = "Rating";
        field_r = true;
        field_u = new vn();
    }
}
