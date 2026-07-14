/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.applet.Applet;

final class np {
    private int field_h;
    private ir field_i;
    static String field_a;
    static int field_d;
    static String field_c;
    private ir field_f;
    static String field_g;
    private int field_b;
    static String field_e;

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        field_g = null;
        field_a = null;
        if (!param0) {
            Object var2 = null;
            int discarded$0 = np.a(true, (String) null, true, true, -64, (String) null);
        }
    }

    final byte[] a(byte param0, int param1) {
        try {
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_47_0 = null;
            Object stackIn_48_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_47_0 = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_56_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Pool.field_O;
                        var3 = (Object) (Object) ((np) this).field_i;
                        // monitorenter ((np) this).field_i
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((((np) this).field_f.d((byte) 17) ^ -1L) <= ((long)(6 + param1 * 6) ^ -1L)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var3
                            stackOut_3_0 = stackIn_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((np) this).field_f.a(0, (long)(param1 * 6));
                            if (param0 == -110) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = null;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            // monitorexit var3
                            stackOut_7_0 = stackIn_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return (byte[]) (Object) stackIn_8_0;
                    }
                    case 9: {
                        try {
                            ((np) this).field_f.a((byte) -111, 6, 0, dg.field_S);
                            var4_int = (dg.field_S[2] & 255) + (16711680 & dg.field_S[0] << 474515088) + (dg.field_S[1] << -2063113848 & 65280);
                            var5 = (255 & dg.field_S[5]) + (dg.field_S[3] << -1736479280 & 16711680) - -(dg.field_S[4] << 1304009224 & 65280);
                            if (var4_int >= 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var4_int <= ((np) this).field_b) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-1 > (var5 ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (((np) this).field_i.d((byte) 17) / 520L >= (long)var5) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = null;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            // monitorexit var3
                            stackOut_19_0 = stackIn_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return (byte[]) (Object) stackIn_20_0;
                    }
                    case 21: {
                        try {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var7 >= var4_int) {
                                statePc = 53;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var5 != 0) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((np) this).field_i.a(param0 ^ -110, (long)(520 * var5));
                            var9 = var4_int - var7;
                            if (65535 >= param1) {
                                statePc = 32;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var9 ^ -1) < -511) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var9 = 510;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var14 = 10;
                            ((np) this).field_i.a((byte) -126, var9 + var14, 0, dg.field_S);
                            var12 = (dg.field_S[7] << -1372757816 & 65280) + (16711680 & dg.field_S[6] << -1444683920) + (255 & dg.field_S[8]);
                            var13 = dg.field_S[9] & 255;
                            var11 = (255 & dg.field_S[5]) + (dg.field_S[4] << 456538728 & 65280);
                            var10 = (dg.field_S[3] & 255) + (-16777216 & dg.field_S[0] << 2001184440) - -((dg.field_S[1] & 255) << -183335760) + ((dg.field_S[2] & 255) << 723552488);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((var9 ^ -1) >= -513) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var9 = 512;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var14 = 8;
                            ((np) this).field_i.a((byte) -115, var14 + var9, 0, dg.field_S);
                            var12 = (dg.field_S[5] << -2061837656 & 65280) + (dg.field_S[4] << 1768258640 & 16711680) - -(dg.field_S[6] & 255);
                            var11 = ((dg.field_S[2] & 255) << 1605382184) - -(dg.field_S[3] & 255);
                            var13 = dg.field_S[7] & 255;
                            var10 = (dg.field_S[1] & 255) + (65280 & dg.field_S[0] << -2094406968);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var10 == param1) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var11 == var8) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var13 == ((np) this).field_h) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if ((var12 ^ -1) <= -1) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if ((long)var12 <= ((np) this).field_i.d((byte) 17) / 520L) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackOut_46_0 = null;
                            stackIn_47_0 = stackOut_46_0;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            // monitorexit var3
                            stackOut_47_0 = stackIn_47_0;
                            stackIn_48_0 = stackOut_47_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        return (byte[]) (Object) stackIn_48_0;
                    }
                    case 49: {
                        try {
                            var15 = var14 + var9;
                            var16 = var14;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var15 <= var16) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var7++;
                            var6[var7] = dg.field_S[var16];
                            var16++;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var8++;
                            var5 = var12;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            stackOut_53_0 = (byte[]) var6;
                            stackIn_54_0 = stackOut_53_0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            // monitorexit var3
                            stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                            stackIn_55_0 = stackOut_54_0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        return stackIn_55_0;
                    }
                    case 56: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_56_0 = null;
                            stackIn_57_0 = stackOut_56_0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        return (byte[]) (Object) stackIn_57_0;
                    }
                    case 58: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        throw (RuntimeException) (Object) var17;
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

    final static String a(boolean param0, oq param1) {
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        if (param0) {
          return null;
        } else {
          var5 = new StringBuilder(2 * param1.field_v);
          var2 = var5;
          var3 = 0;
          L0: while (true) {
            if (param1.field_v <= var3) {
              return var2.toString();
            } else {
              var4 = 255 & param1.field_t[var3];
              StringBuilder discarded$2 = var5.append(ec.field_j[var4 >> -210964092 & 15]);
              StringBuilder discarded$3 = var5.append(ec.field_j[15 & var4]);
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((np) this).field_i;
                    // monitorenter ((np) this).field_i
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -12875) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_d = 96;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1 < (param2 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 <= ((np) this).field_b) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = this.a(param0, param2, true, param3, (byte) 93) ? 1 : 0;
                        if (var6 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = this.a(param0, param2, false, param3, (byte) 93) ? 1 : 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        stackOut_10_0 = var6;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, int param1, boolean param2, byte[] param3, byte param4) {
        try {
            Object var6 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            int stackIn_7_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Pool.field_O;
                        var6 = (Object) (Object) ((np) this).field_i;
                        // monitorenter ((np) this).field_i
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7_int = (int)((519L + ((np) this).field_i.d((byte) 17)) / 520L);
                            if (var7_int != 0) {
                                statePc = 15;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7_int = 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((long)(6 + param0 * 6) > ((np) this).field_f.d((byte) 17)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            // monitorexit var6
                            stackOut_7_0 = stackIn_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            ((np) this).field_f.a(0, (long)(param0 * 6));
                            ((np) this).field_f.a((byte) -110, 6, 0, dg.field_S);
                            var7_int = (dg.field_S[5] & 255) + (16711680 & dg.field_S[3] << 613994640) + (dg.field_S[4] << -1707825688 & 65280);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if ((long)var7_int <= ((np) this).field_i.d((byte) 17) / 520L) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            // monitorexit var6
                            stackOut_13_0 = stackIn_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            dg.field_S[3] = (byte)(var7_int >> 1500914800);
                            dg.field_S[2] = (byte)param1;
                            dg.field_S[0] = (byte)(param1 >> 12353904);
                            dg.field_S[1] = (byte)(param1 >> -222958776);
                            dg.field_S[4] = (byte)(var7_int >> 1796002408);
                            dg.field_S[5] = (byte)var7_int;
                            ((np) this).field_f.a(0, (long)(param0 * 6));
                            ((np) this).field_f.a(6, dg.field_S, 0, -1);
                            var8 = 0;
                            var9 = 0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var8 >= param1) {
                                statePc = 58;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var10 = 0;
                            if (param2) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((np) this).field_i.a(param4 ^ 93, (long)(520 * var7_int));
                            if (65535 >= param0) {
                                statePc = 24;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((np) this).field_i.a((byte) -118, 10, 0, dg.field_S);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof EOFException ? 22 : (stateCaught_20 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var11 = (dg.field_S[3] & 255) + ((65280 & dg.field_S[2] << -2115165400) + ((dg.field_S[0] << -286328680 & -16777216) - -(16711680 & dg.field_S[1] << -406034640)));
                            var12 = (65280 & dg.field_S[4] << 1621663048) + (dg.field_S[5] & 255);
                            var10 = (16711680 & dg.field_S[6] << 1762986576) - (-(65280 & dg.field_S[7] << -2053667960) - (dg.field_S[8] & 255));
                            var13 = 255 & dg.field_S[9];
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((np) this).field_i.a((byte) -110, 8, 0, dg.field_S);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var12 = (dg.field_S[3] & 255) + (65280 & dg.field_S[2] << -169796888);
                            var10 = ((255 & dg.field_S[5]) << -1767406104) + ((16711680 & dg.field_S[4] << 1036563312) + (255 & dg.field_S[6]));
                            var11 = (dg.field_S[0] << -170939704 & 65280) + (255 & dg.field_S[1]);
                            var13 = dg.field_S[7] & 255;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var11 != param0) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var12 != var9) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var13 == ((np) this).field_h) {
                                statePc = 35;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var6
                            stackOut_33_0 = stackIn_33_0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0 != 0;
                    }
                    case 35: {
                        try {
                            if (0 > var10) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (((np) this).field_i.d((byte) 17) / 520L >= (long)var10) {
                                statePc = 41;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            stackOut_38_0 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var6
                            stackOut_39_0 = stackIn_39_0;
                            stackIn_40_0 = stackOut_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        return stackIn_40_0 != 0;
                    }
                    case 41: {
                        try {
                            if (-1 != (var10 ^ -1)) {
                                statePc = 46;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param2 = false;
                            var10 = (int)((((np) this).field_i.d((byte) 17) + 519L) / 520L);
                            if (var10 != 0) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var10++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var10 != var7_int) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var10++;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (param1 + -var8 > 512) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var10 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((param0 ^ -1) >= -65536) {
                                statePc = 53;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            dg.field_S[7] = (byte)(var10 >> 1702366760);
                            dg.field_S[9] = (byte)((np) this).field_h;
                            dg.field_S[3] = (byte)param0;
                            dg.field_S[8] = (byte)var10;
                            dg.field_S[2] = (byte)(param0 >> -701734744);
                            dg.field_S[4] = (byte)(var9 >> 1904038344);
                            dg.field_S[0] = (byte)(param0 >> 191655096);
                            dg.field_S[1] = (byte)(param0 >> 1402166704);
                            dg.field_S[6] = (byte)(var10 >> 644621680);
                            dg.field_S[5] = (byte)var9;
                            ((np) this).field_i.a(0, (long)(520 * var7_int));
                            ((np) this).field_i.a(10, dg.field_S, 0, param4 + -94);
                            var11 = -var8 + param1;
                            if ((var11 ^ -1) < -511) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var11 = 510;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((np) this).field_i.a(var11, param3, var8, -1);
                            var8 = var8 + var11;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            dg.field_S[0] = (byte)(param0 >> -1499984568);
                            dg.field_S[1] = (byte)param0;
                            dg.field_S[5] = (byte)(var10 >> -1603904472);
                            dg.field_S[6] = (byte)var10;
                            dg.field_S[2] = (byte)(var9 >> 1832633384);
                            dg.field_S[3] = (byte)var9;
                            dg.field_S[7] = (byte)((np) this).field_h;
                            dg.field_S[4] = (byte)(var10 >> 1781651216);
                            ((np) this).field_i.a(0, (long)(520 * var7_int));
                            ((np) this).field_i.a(8, dg.field_S, 0, -1);
                            var11 = -var8 + param1;
                            if (-513 > (var11 ^ -1)) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var11 = 512;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((np) this).field_i.a(var11, param3, var8, -1);
                            var8 = var8 + var11;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var7_int = var10;
                            var9++;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (param4 == 93) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            np.a(false);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            // monitorexit var6
                            stackOut_61_0 = stackIn_61_0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        return stackIn_62_0 != 0;
                    }
                    case 63: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_63_0 = 0;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        return stackIn_64_0 != 0;
                    }
                    case 65: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        throw (RuntimeException) (Object) var15;
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

    final static int a(boolean param0, String param1, boolean param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            int stackIn_41_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            ml stackIn_63_0 = null;
            java.applet.Applet stackIn_63_1 = null;
            ml stackIn_64_0 = null;
            java.applet.Applet stackIn_64_1 = null;
            ml stackIn_65_0 = null;
            java.applet.Applet stackIn_65_1 = null;
            int stackIn_65_2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            ml stackOut_62_0 = null;
            java.applet.Applet stackOut_62_1 = null;
            ml stackOut_64_0 = null;
            java.applet.Applet stackOut_64_1 = null;
            int stackOut_64_2 = 0;
            ml stackOut_63_0 = null;
            java.applet.Applet stackOut_63_1 = null;
            int stackOut_63_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Pool.field_O;
                        if (null == jd.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (sa.a((byte) 65, param2)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (tl.field_J == no.field_h) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = null;
                        hn.field_c = bi.a(hm.field_a, -16595, param5, false, (String) null);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        hn.field_c = kb.a(false, param1, -5790, param5);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ej.field_j.field_v = 0;
                        ej.field_j.a(14, false);
                        ej.field_j.a(hn.field_c.b((byte) -101).field_c, false);
                        de.a(-1, 0);
                        tl.field_J = vn.field_d;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (vn.field_d == tl.field_J) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (!lq.b((byte) 87, 1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var6 = kn.field_e.g(-82);
                        if (var6 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        uq.field_c = var6;
                        of.field_Pb = -1;
                        tl.field_J = hm.field_k;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        tl.field_J = fr.field_o;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        kn.field_e.field_v = 0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (fr.field_o == tl.field_J) {
                            statePc = 19;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (!lq.b((byte) 43, 8)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        Pool.field_Q = kn.field_e.h(-412303328);
                        kn.field_e.field_v = 0;
                        pj.a(param2, hn.field_c, param3, -98300704, param4);
                        tl.field_J = wo.field_g;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (tl.field_J == wo.field_g) {
                            statePc = 23;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (lq.b((byte) 79, 1)) {
                            statePc = 25;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var6 = kn.field_e.g(-110);
                        kn.field_e.field_v = 0;
                        ri.field_N = null;
                        uq.field_c = var6;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (1 == var6) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (var6 == 8) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        tl.field_J = hm.field_k;
                        of.field_Pb = -1;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 29: {
                        dn.c(-115);
                        we.field_e = false;
                        return var6;
                    }
                    case 30: {
                        of.field_Pb = -1;
                        tl.field_J = ff.field_b;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (ff.field_b == tl.field_J) {
                            statePc = 33;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (wf.a((byte) 39)) {
                            statePc = 35;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        hm.field_a = kn.field_e.h(-412303328);
                        ei.field_E = param5;
                        hq.field_i = kn.field_e.g(-68);
                        ta.field_f = kn.field_e.g(-105);
                        mp.field_V = kn.field_e.d(-1034);
                        var12 = kn.field_e.m(108);
                        var7 = kn.field_e.g(-76);
                        if (0 != (1 & var7)) {
                            statePc = 37;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        ke.a(100);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (-1 == (16 & var7)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        nm.field_b = stackIn_41_0 != 0;
                        if (param2) {
                            statePc = 54;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        if (-1 == (8 & var7)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 44: {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        ea.field_z = stackIn_45_0 != 0;
                        if ((4 & var7) == -1) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        fq.field_Gb = stackIn_48_0 != 0;
                        if (-1 == (2 & var7)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        hr.field_y = stackIn_51_0 != 0;
                        if (ea.field_z) {
                            statePc = 53;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        hr.field_y = true;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (!hk.field_s) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        int discarded$12 = kn.field_e.g(-114);
                        int discarded$13 = kn.field_e.g(-99);
                        int discarded$14 = kn.field_e.b(true);
                        va.field_X = kn.field_e.d(-1034);
                        sn.field_n = new byte[va.field_X];
                        var8 = 0;
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 56: {
                        if (va.field_X <= var8) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        sn.field_n[var8] = kn.field_e.e((byte) 105);
                        var8++;
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 58: {
                        di.field_j = kn.field_e.j(-22);
                        var13 = (CharSequence) (Object) di.field_j;
                        oj.field_y = hq.a(101, var13);
                        no.field_l = kn.field_e.g(-126);
                        tl.field_J = ta.field_a;
                        if (hn.field_c.b((byte) -110) == dg.field_L) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        if (hn.field_c.b((byte) 37) == rp.field_b) {
                            statePc = 61;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        ug.field_v.a(hk.d(105), true);
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 62: {
                        stackOut_62_0 = eo.field_Xb;
                        stackOut_62_1 = hk.d(78);
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_64_1 = stackOut_62_1;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        if (param0) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        stackOut_63_0 = (ml) (Object) stackIn_63_0;
                        stackOut_63_1 = (java.applet.Applet) (Object) stackIn_63_1;
                        stackOut_63_2 = 1;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        stackIn_65_2 = stackOut_63_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 64: {
                        stackOut_64_0 = (ml) (Object) stackIn_64_0;
                        stackOut_64_1 = (java.applet.Applet) (Object) stackIn_64_1;
                        stackOut_64_2 = 0;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        stackIn_65_2 = stackOut_64_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        ((ml) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_65_2 != 0);
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        we.field_e = false;
                        if (var12 == null) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        fg.a(hk.d(100), -124, var12);
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if (-1 > (mp.field_V ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        if (fq.field_Gb) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        try {
                            Object discarded$15 = mo.a((byte) 126, "unzap", hk.d(125));
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        var8_ref_Throwable = caughtException;
                        statePc = 77;
                        continue stateLoop;
                    }
                    case 74: {
                        try {
                            Object discarded$16 = mo.a("zap", new Object[1], 105, hk.d(107));
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        var8_ref_Throwable = caughtException;
                        statePc = 77;
                        continue stateLoop;
                    }
                    case 77: {
                        if (mp.field_V <= 0) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        bf.field_g = true;
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 79: {
                        ej.field_j.b(32, Pool.field_L);
                        var8 = 0;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        if (-5 >= (var8 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        Pool.field_L[var8] = Pool.field_L[var8] + 50;
                        var8++;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 82: {
                        kn.field_e.b(32, Pool.field_L);
                        return uq.field_c;
                    }
                    case 83: {
                        if (!param0) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        var10 = null;
                        int discarded$17 = np.a(true, (String) null, false, false, 59, (String) null);
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        if (tl.field_J != hm.field_k) {
                            statePc = 98;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        if (wf.a((byte) 39)) {
                            statePc = 88;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        dn.c(-64);
                        if (uq.field_c == -8) {
                            statePc = 92;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (-8 != uq.field_c) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        uq.field_c = 3;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        ke.field_g = kn.field_e.j(-51);
                        we.field_e = false;
                        return uq.field_c;
                    }
                    case 92: {
                        if (we.field_e) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        we.field_e = true;
                        return -1;
                    }
                    case 94: {
                        if (-8 != uq.field_c) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        uq.field_c = 3;
                        statePc = 96;
                        continue stateLoop;
                    }
                    case 96: {
                        ke.field_g = kn.field_e.j(-51);
                        we.field_e = false;
                        return uq.field_c;
                    }
                    case 98: {
                        if (null == jd.field_c) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    }
                    case 99: {
                        return -1;
                    }
                    case 100: {
                        if (we.field_e) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    }
                    case 101: {
                        var6 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var6;
                        return -1;
                    }
                    case 102: {
                        if (30000L >= bf.d((byte) 118)) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    }
                    case 103: {
                        ke.field_g = wd.field_Rb;
                        statePc = 105;
                        continue stateLoop;
                    }
                    case 104: {
                        ke.field_g = er.field_Q;
                        statePc = 105;
                        continue stateLoop;
                    }
                    case 105: {
                        we.field_e = false;
                        return 3;
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

    public final String toString() {
        return "" + ((np) this).field_h;
    }

    np(int param0, ir param1, ir param2, int param3) {
        ((np) this).field_f = null;
        ((np) this).field_i = null;
        ((np) this).field_b = 65000;
        ((np) this).field_i = param1;
        ((np) this).field_f = param2;
        ((np) this).field_h = param0;
        ((np) this).field_b = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has dropped out.";
        field_g = "No options available";
        field_e = "Achieved";
    }
}
