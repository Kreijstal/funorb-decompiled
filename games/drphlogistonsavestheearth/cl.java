/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cl extends gb {
    static int field_o;
    static nh field_p;
    static String field_q;
    static nh field_s;
    private qe field_r;
    static he[] field_n;
    static he field_t;

    final static nh[] a(String param0, vj param1, int param2, String param3) {
        if (param2 >= -113) {
            field_s = null;
        }
        int var4 = param1.a(param0, (byte) -83);
        int var5 = param1.a((byte) -99, param3, var4);
        return vh.a(param1, var4, -114, var5);
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            IOException var5_ref = null;
            cm var5_ref2 = null;
            Exception var6 = null;
            int var7 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        var4 = 2 % ((param2 - -59) / 40);
                        if (((cl) this).field_r == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((cl) this).field_r.b(50);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((cl) this).field_r = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((cl) this).field_r = (qe) param0;
                        this.e(6);
                        this.a(param1, 0);
                        ((cl) this).field_g.field_j = 0;
                        ((cl) this).field_d = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var5_ref2 = (cm) (Object) ((cl) this).field_m.d(5518);
                        if (var5_ref2 != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((cl) this).field_i.a((uh) (Object) var5_ref2, 0);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 9: {
                        var5_ref2 = (cm) (Object) ((cl) this).field_b.d(5518);
                        if (var5_ref2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((cl) this).field_f.a((uh) (Object) var5_ref2, 0);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        if (((cl) this).field_a == 0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((cl) this).field_l.field_j = 0;
                            ((cl) this).field_l.c(4, (byte) -96);
                            ((cl) this).field_l.c((int) ((cl) this).field_a, (byte) -126);
                            ((cl) this).field_l.a(0, (byte) 120);
                            ((cl) this).field_r.a(((cl) this).field_l.field_h.length, -30537, ((cl) this).field_l.field_h, 0);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var5_ref = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((cl) this).field_r.b(50);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var6 = (Exception) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((cl) this).field_h = -2;
                        ((cl) this).field_r = null;
                        ((cl) this).field_c = ((cl) this).field_c + 1;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((cl) this).field_j = 0;
                        ((cl) this).field_k = la.a(false);
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

    final static void d(byte param0) {
        ek var1 = (ek) (Object) hl.field_c.a((byte) -106);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        wj.a(var1.field_i, var1.field_u, var1.field_r);
        wj.f(var1.field_j, var1.field_k, var1.field_o, var1.field_s);
        var1.field_i = null;
        if (param0 > -64) {
            field_n = null;
        }
        tg.field_g.a((gi) (Object) var1, 255);
    }

    public cl() {
    }

    final boolean b(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            cm var2_ref = null;
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
            cm var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            Object var17 = null;
            int stackIn_65_0 = 0;
            hl stackIn_67_0 = null;
            hl stackIn_68_0 = null;
            hl stackIn_69_0 = null;
            int stackIn_69_1 = 0;
            int stackIn_84_0 = 0;
            int stackIn_93_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            hl stackOut_66_0 = null;
            hl stackOut_67_0 = null;
            int stackOut_67_1 = 0;
            hl stackOut_68_0 = null;
            int stackOut_68_1 = 0;
            int stackOut_82_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_92_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        if (null == ((cl) this).field_r) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = la.a(param0);
                        var4 = (int)(-((cl) this).field_k + var2_long);
                        ((cl) this).field_k = var2_long;
                        if (200 < var4) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((cl) this).field_j = ((cl) this).field_j + var4;
                        if (30000 >= ((cl) this).field_j) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((cl) this).field_r.b(50);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((cl) this).field_r = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((cl) this).field_r) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (((cl) this).c((byte) -123) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 == ((cl) this).a(114)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return false;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        return true;
                    }
                    case 15: {
                        try {
                            ((cl) this).field_r.b((byte) -13);
                            var2_ref = (cm) (Object) ((cl) this).field_i.a(true);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var2_ref == null) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((cl) this).field_l.field_j = 0;
                            ((cl) this).field_l.c(1, (byte) -117);
                            ((cl) this).field_l.a(1992910808, var2_ref.field_t);
                            ((cl) this).field_r.a(((cl) this).field_l.field_h.length, -30537, ((cl) this).field_l.field_h, 0);
                            ((cl) this).field_m.a((uh) (Object) var2_ref, 0);
                            var2_ref = (cm) (Object) ((cl) this).field_i.c(91);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var2_ref = (cm) (Object) ((cl) this).field_f.a(true);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 94;
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
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((cl) this).field_l.field_j = 0;
                            ((cl) this).field_l.c(0, (byte) -90);
                            ((cl) this).field_l.a(1992910808, var2_ref.field_t);
                            ((cl) this).field_r.a(((cl) this).field_l.field_h.length, -30537, ((cl) this).field_l.field_h, 0);
                            ((cl) this).field_b.a((uh) (Object) var2_ref, 0);
                            var2_ref = (cm) (Object) ((cl) this).field_f.c(-124);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (!param0) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var17 = null;
                            nh[] discarded$1 = cl.a((String) null, (vj) null, 114, (String) null);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 92;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_int = ((cl) this).field_r.a((byte) -122);
                            if (-1 > var3_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var3_int == 0) {
                                statePc = 92;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((cl) this).field_j = 0;
                            var4 = 0;
                            if (null == ((cl) this).field_d) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((cl) this).field_d.field_O == 0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (0 < var4) {
                                statePc = 51;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = -((cl) this).field_d.field_N + ((cl) this).field_d.field_K.field_h.length;
                            var6 = -((cl) this).field_d.field_O + 512;
                            if (-((cl) this).field_d.field_K.field_j + var5 < var6) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6 = -((cl) this).field_d.field_K.field_j + var5;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var3_int < var6) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6 = var3_int;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((cl) this).field_r.a((byte) -14, ((cl) this).field_d.field_K.field_h, ((cl) this).field_d.field_K.field_j, var6);
                            if (((cl) this).field_a != 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var7 = 0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var6 <= var7) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((cl) this).field_d.field_K.field_h[((cl) this).field_d.field_K.field_j + var7] = (byte)qk.a((int) ((cl) this).field_d.field_K.field_h[((cl) this).field_d.field_K.field_j + var7], (int) ((cl) this).field_a);
                            var7++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((cl) this).field_d.field_K.field_j = ((cl) this).field_d.field_K.field_j + var6;
                            ((cl) this).field_d.field_O = ((cl) this).field_d.field_O + var6;
                            if (((cl) this).field_d.field_K.field_j != var5) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((cl) this).field_d.f(64);
                            ((cl) this).field_d.field_u = false;
                            ((cl) this).field_d = null;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((((cl) this).field_d.field_O ^ -1) == -513) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((cl) this).field_d.field_O = 0;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = -((cl) this).field_g.field_j + var4;
                            if (var3_int < var5) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var5 = var3_int;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((cl) this).field_r.a((byte) -14, ((cl) this).field_g.field_h, ((cl) this).field_g.field_j, var5);
                            if (((cl) this).field_a != 0) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var6 = 0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var5 <= var6) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((cl) this).field_g.field_h[((cl) this).field_g.field_j + var6] = (byte)qk.a((int) ((cl) this).field_g.field_h[((cl) this).field_g.field_j + var6], (int) ((cl) this).field_a);
                            var6++;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((cl) this).field_g.field_j = ((cl) this).field_g.field_j + var5;
                            if (var4 <= ((cl) this).field_g.field_j) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (null != ((cl) this).field_d) {
                                statePc = 85;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((cl) this).field_g.field_j = 0;
                            var6 = ((cl) this).field_g.l(31760);
                            var7 = ((cl) this).field_g.h(-121);
                            var8 = ((cl) this).field_g.l(31760);
                            var9 = ((cl) this).field_g.h(119);
                            var10 = 127 & var8;
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var11 = stackIn_65_0;
                            var12 = (long)var7 + ((long)var6 << -247226336);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackOut_66_0 = ((cl) this).field_m;
                            stackIn_68_0 = stackOut_66_0;
                            stackIn_67_0 = stackOut_66_0;
                            if (param0) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            stackOut_67_0 = (hl) (Object) stackIn_67_0;
                            stackOut_67_1 = 1;
                            stackIn_69_0 = stackOut_67_0;
                            stackIn_69_1 = stackOut_67_1;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackOut_68_0 = (hl) (Object) stackIn_68_0;
                            stackOut_68_1 = 0;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var14_ref = (cm) (Object) ((hl) (Object) stackIn_69_0).a(stackIn_69_1 != 0);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var14_ref == null) {
                                statePc = 78;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var14_ref.field_t == var12) {
                                statePc = 78;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var14_ref = (cm) (Object) ((cl) this).field_m.c(89);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var14_ref = (cm) (Object) ((cl) this).field_b.a(true);
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var14_ref == null) {
                                statePc = 78;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var12 != var14_ref.field_t) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var14_ref = (cm) (Object) ((cl) this).field_b.c(114);
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (var14_ref == null) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((cl) this).field_d = var14_ref;
                            if (var10 != 0) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackOut_82_0 = 5;
                            stackIn_84_0 = stackOut_82_0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackOut_83_0 = 9;
                            stackIn_84_0 = stackOut_83_0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var15 = stackIn_84_0;
                            ((cl) this).field_d.field_K = new od(((cl) this).field_d.field_N + var9 + var15);
                            ((cl) this).field_d.field_K.c(var10, (byte) -99);
                            ((cl) this).field_d.field_K.a(var9, (byte) 107);
                            ((cl) this).field_g.field_j = 0;
                            ((cl) this).field_d.field_O = 10;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (0 == ((cl) this).field_d.field_O) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (((cl) this).field_g.field_h[0] != -1) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ((cl) this).field_d.field_O = 1;
                            ((cl) this).field_g.field_j = 0;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            ((cl) this).field_d = null;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            stackOut_92_0 = 1;
                            stackIn_93_0 = stackOut_92_0;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        return stackIn_93_0 != 0;
                    }
                    case 94: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 95: {
                        try {
                            ((cl) this).field_r.b(50);
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 98;
                        continue stateLoop;
                    }
                    case 98: {
                        ((cl) this).field_c = ((cl) this).field_c + 1;
                        ((cl) this).field_h = -2;
                        ((cl) this).field_r = null;
                        if (0 != ((cl) this).c((byte) -82)) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    }
                    case 99: {
                        if (-1 != (((cl) this).a(105) ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    }
                    case 100: {
                        return true;
                    }
                    case 101: {
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

    public static void d(int param0) {
        field_p = null;
        field_t = null;
        field_n = null;
        field_q = null;
        if (param0 != 0) {
            field_p = null;
        }
        field_s = null;
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            od stackIn_3_0 = null;
            od stackIn_4_0 = null;
            od stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            od stackOut_2_0 = null;
            od stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            od stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((cl) this).field_r != null) {
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
                            ((cl) this).field_l.field_j = param1;
                            stackOut_2_0 = ((cl) this).field_l;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_3_0 = stackOut_2_0;
                            if (param0) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (od) (Object) stackIn_3_0;
                            stackOut_3_1 = 3;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (od) (Object) stackIn_4_0;
                            stackOut_4_1 = 2;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((od) (Object) stackIn_5_0).c(stackIn_5_1, (byte) -96);
                            ((cl) this).field_l.a(1992910808, 0L);
                            ((cl) this).field_r.a(((cl) this).field_l.field_h.length, -30537, ((cl) this).field_l.field_h, 0);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            ((cl) this).field_r.b(50);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        ((cl) this).field_h = -2;
                        ((cl) this).field_c = ((cl) this).field_c + 1;
                        ((cl) this).field_r = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
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

    final void b(byte param0) {
        try {
            ((cl) this).field_r.b(50);
        } catch (Exception exception) {
        }
        if (param0 != 122) {
            return;
        }
        ((cl) this).field_c = ((cl) this).field_c + 1;
        ((cl) this).field_r = null;
        ((cl) this).field_h = -1;
        ((cl) this).field_a = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final void a(byte param0) {
        int var2 = -8 / ((65 - param0) / 58);
        if (!(null == ((cl) this).field_r)) {
            ((cl) this).field_r.b(50);
        }
    }

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((cl) this).field_r) {
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
                            ((cl) this).field_l.field_j = 0;
                            ((cl) this).field_l.c(param0, (byte) -92);
                            ((cl) this).field_l.a(3, false);
                            ((cl) this).field_l.c(0, -17402);
                            ((cl) this).field_r.a(((cl) this).field_l.field_h.length, param0 + -30543, ((cl) this).field_l.field_h, 0);
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
                            ((cl) this).field_r.b(50);
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
                        ((cl) this).field_r = null;
                        ((cl) this).field_h = -2;
                        ((cl) this).field_c = ((cl) this).field_c + 1;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = null;
        field_q = "Not yet achieved";
        field_p = null;
    }
}
