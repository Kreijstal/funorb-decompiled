/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf extends ch {
    static char[] field_q;
    static String[] field_w;
    static nm field_r;
    static String field_t;
    static gf[] field_p;
    static String field_v;
    private ll field_s;
    static String field_u;

    final void b(byte param0) {
        if (!(((uf) this).field_s == null)) {
            ((uf) this).field_s.b(122);
        }
        int var2 = 90 % ((param0 - -57) / 40);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                if (param0 != 13) {
                    field_u = null;
                }
                param1.getAppletContext().showDocument(nn.a(110, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ee var2_ref = null;
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
            ee var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_44_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_83_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_82_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = MinerDisturbance.field_ab;
                        if (((uf) this).field_s != null) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = sf.a((byte) 103);
                        var4 = (int)(var2_long + -((uf) this).field_e);
                        if (var4 <= 200) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((uf) this).field_e = var2_long;
                        ((uf) this).field_d = ((uf) this).field_d + var4;
                        if (((uf) this).field_d <= 30000) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((uf) this).field_s.b(91);
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
                        ((uf) this).field_s = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((uf) this).field_s) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (0 != ((uf) this).a(-11975)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (((uf) this).b(1461895584) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return true;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        try {
                            ((uf) this).field_s.a((byte) 124);
                            var2_ref = (ee) (Object) ((uf) this).field_n.a(87);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var2_ref == null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((uf) this).field_k.field_o = 0;
                            ((uf) this).field_k.c(1, 25564);
                            ((uf) this).field_k.a(-107, var2_ref.field_p);
                            ((uf) this).field_s.a((byte) 100, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
                            ((uf) this).field_i.a((al) (Object) var2_ref, false);
                            var2_ref = (ee) (Object) ((uf) this).field_n.d(-68);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var2_ref = (ee) (Object) ((uf) this).field_l.a(117);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2_ref == null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((uf) this).field_k.field_o = 0;
                            ((uf) this).field_k.c(0, 25564);
                            ((uf) this).field_k.a(-82, var2_ref.field_p);
                            ((uf) this).field_s.a((byte) 93, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
                            ((uf) this).field_m.a((al) (Object) var2_ref, false);
                            var2_ref = (ee) (Object) ((uf) this).field_l.d(126);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var3_int = 96 / ((param0 - 52) / 60);
                            var2_int = 0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 82;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3_int = ((uf) this).field_s.c(0);
                            if (var3_int > -1) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-1 == var3_int) {
                                statePc = 82;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((uf) this).field_d = 0;
                            var4 = 0;
                            if (((uf) this).field_c != null) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var4 = 10;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (0 == ((uf) this).field_c.field_D) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var4 = 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((var4 ^ -1) >= -1) {
                                statePc = 65;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var5 = var4 - ((uf) this).field_a.field_o;
                            if (var3_int < var5) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var5 = var3_int;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            ((uf) this).field_s.a(false, ((uf) this).field_a.field_u, ((uf) this).field_a.field_o, var5);
                            if (((uf) this).field_b == 0) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var6 = 0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var5 <= var6) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((uf) this).field_a.field_u[((uf) this).field_a.field_o + var6] = (byte)eg.a((int) ((uf) this).field_a.field_u[((uf) this).field_a.field_o + var6], (int) ((uf) this).field_b);
                            var6++;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((uf) this).field_a.field_o = ((uf) this).field_a.field_o + var5;
                            if (((uf) this).field_a.field_o < var4) {
                                statePc = 81;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (null != ((uf) this).field_c) {
                                statePc = 60;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((uf) this).field_a.field_o = 0;
                            var6 = ((uf) this).field_a.d((byte) -54);
                            var7 = ((uf) this).field_a.b((byte) 49);
                            var8 = ((uf) this).field_a.d((byte) -54);
                            var9 = ((uf) this).field_a.b((byte) 83);
                            var10 = var8 & 127;
                            if ((128 & var8) == 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            stackOut_43_0 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var11 = stackIn_44_0;
                            var12 = ((long)var6 << 430441184) - -(long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 50;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var14_ref = (ee) (Object) ((uf) this).field_i.a(-78);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var14_ref == null) {
                                statePc = 54;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var14_ref.field_p != var12) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var14_ref = (ee) (Object) ((uf) this).field_i.d(126);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var14_ref = (ee) (Object) ((uf) this).field_m.a(-123);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var14_ref == null) {
                                statePc = 54;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var14_ref.field_p == var12) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var14_ref = (ee) (Object) ((uf) this).field_m.d(-128);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var14_ref != null) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (-1 == (var10 ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackOut_57_0 = 9;
                            stackIn_59_0 = stackOut_57_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 5;
                            stackIn_59_0 = stackOut_58_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var15 = stackIn_59_0;
                            ((uf) this).field_c = var14_ref;
                            ((uf) this).field_c.field_G = new sb(((uf) this).field_c.field_I + var15 + var9);
                            ((uf) this).field_c.field_G.c(var10, 25564);
                            ((uf) this).field_c.field_G.a((byte) 92, var9);
                            ((uf) this).field_a.field_o = 0;
                            ((uf) this).field_c.field_D = 10;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((uf) this).field_c.field_D != 0) {
                                statePc = 64;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (((uf) this).field_a.field_u[0] == -1) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((uf) this).field_c = null;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((uf) this).field_a.field_o = 0;
                            ((uf) this).field_c.field_D = 1;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var5 = ((uf) this).field_c.field_G.field_u.length + -((uf) this).field_c.field_I;
                            var6 = 512 - ((uf) this).field_c.field_D;
                            if (var6 > var5 + -((uf) this).field_c.field_G.field_o) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var6 = var5 + -((uf) this).field_c.field_G.field_o;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var6 = var3_int;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((uf) this).field_s.a(false, ((uf) this).field_c.field_G.field_u, ((uf) this).field_c.field_G.field_o, var6);
                            if (-1 != (((uf) this).field_b ^ -1)) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var17 >= var6) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((uf) this).field_c.field_G.field_u[((uf) this).field_c.field_G.field_o - -var17] = (byte)eg.a((int) ((uf) this).field_c.field_G.field_u[((uf) this).field_c.field_G.field_o + var17], (int) ((uf) this).field_b);
                            var17++;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((uf) this).field_c.field_D = ((uf) this).field_c.field_D + var6;
                            ((uf) this).field_c.field_G.field_o = ((uf) this).field_c.field_G.field_o + var6;
                            if (((uf) this).field_c.field_G.field_o == var5) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if ((((uf) this).field_c.field_D ^ -1) == -513) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((uf) this).field_c.field_D = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((uf) this).field_c.a((byte) -119);
                            ((uf) this).field_c.field_C = false;
                            ((uf) this).field_c = null;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var2_int++;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackOut_82_0 = 1;
                            stackIn_83_0 = stackOut_82_0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        return stackIn_83_0 != 0;
                    }
                    case 84: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        try {
                            ((uf) this).field_s.b(122);
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        ((uf) this).field_s = null;
                        ((uf) this).field_j = -2;
                        ((uf) this).field_o = ((uf) this).field_o + 1;
                        if (((uf) this).a(-11975) != 0) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (((uf) this).b(1461895584) == 0) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        return false;
                    }
                    case 91: {
                        return false;
                    }
                    case 92: {
                        return true;
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

    final void d(int param0) {
        try {
            ((uf) this).field_s.b(124);
        } catch (Exception exception) {
        }
        ((uf) this).field_o = ((uf) this).field_o + 1;
        ((uf) this).field_j = -1;
        ((uf) this).field_s = null;
        ((uf) this).field_b = (byte)(int)(Math.random() * 255.0 + 1.0);
        if (param0 != 20) {
            ((uf) this).field_s = null;
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_v = null;
        field_r = null;
        field_q = null;
        field_u = null;
        if (param0 != 200) {
            uf.f(119);
        }
        field_w = null;
        field_p = null;
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            sb stackIn_3_0 = null;
            sb stackIn_4_0 = null;
            sb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            sb stackOut_2_0 = null;
            sb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            sb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((uf) this).field_s) {
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
                            ((uf) this).field_k.field_o = 0;
                            stackOut_2_0 = ((uf) this).field_k;
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
                            stackOut_3_0 = (sb) (Object) stackIn_3_0;
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
                            stackOut_4_0 = (sb) (Object) stackIn_4_0;
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
                            ((sb) (Object) stackIn_5_0).c(stackIn_5_1, 25564);
                            ((uf) this).field_k.a(-116, 0L);
                            ((uf) this).field_s.a((byte) 120, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
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
                            ((uf) this).field_s.b(97);
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
                        ((uf) this).field_s = null;
                        ((uf) this).field_o = ((uf) this).field_o + 1;
                        ((uf) this).field_j = -2;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param1 == -18232) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        field_w = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((uf) this).field_s) {
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
                            ((uf) this).field_k.field_o = 0;
                            ((uf) this).field_k.c(6, 25564);
                            ((uf) this).field_k.a(3, (byte) -113);
                            ((uf) this).field_k.b((byte) 124, 0);
                            ((uf) this).field_s.a((byte) 107, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
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
                            ((uf) this).field_s.b(101);
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
                        ((uf) this).field_o = ((uf) this).field_o + 1;
                        ((uf) this).field_j = -2;
                        ((uf) this).field_s = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (param0 <= -85) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((uf) this).d(-28);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
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

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            ee var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = MinerDisturbance.field_ab;
                        if (((uf) this).field_s != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((uf) this).field_s.b(param2 + -24355);
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
                        ((uf) this).field_s = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((uf) this).field_s = (ll) param0;
                        this.e(-101);
                        this.a(param1, -18232);
                        if (param2 == 24458) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        ((uf) this).field_c = null;
                        ((uf) this).field_a.field_o = 0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (ee) (Object) ((uf) this).field_i.c(8192);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((uf) this).field_n.a((al) (Object) var4_ref2, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (ee) (Object) ((uf) this).field_m.c(8192);
                        if (var4_ref2 == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((uf) this).field_l.a((al) (Object) var4_ref2, false);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        if (-1 != (((uf) this).field_b ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((uf) this).field_k.field_o = 0;
                            ((uf) this).field_k.c(4, 25564);
                            ((uf) this).field_k.c((int) ((uf) this).field_b, param2 ^ 15446);
                            ((uf) this).field_k.a((byte) 105, 0);
                            ((uf) this).field_s.a((byte) 106, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        try {
                            ((uf) this).field_s.b(95);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((uf) this).field_j = -2;
                        ((uf) this).field_s = null;
                        ((uf) this).field_o = ((uf) this).field_o + 1;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((uf) this).field_d = 0;
                        ((uf) this).field_e = sf.a((byte) -45);
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

    public uf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_t = "Type your age in years";
        field_q = new char[]{(char)13, (char)10};
        field_p = new gf[1000];
        field_v = "Press <img=18> to continue.";
        field_u = "The micro drill! Its ultra lightweight frame allows you to mine in mid-air or while swimming. If you're a miner on the move, make this a priority purchase.";
    }
}
