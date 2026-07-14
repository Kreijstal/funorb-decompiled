/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    static int field_e;
    private int field_b;
    static int field_d;
    static String field_c;
    private int field_a;
    private hd field_f;
    private hd field_g;

    final static void a(ni param0, int param1) {
        if (param1 != -28711) {
            Object var3 = null;
            String discarded$0 = ln.a(-57, (String) null, -45);
        }
        wa.field_j.a((qb) (Object) param0);
    }

    final static String a(int param0, String param1, int param2) {
        String var3 = null;
        var3 = bh.a(125, param0);
        if (var3 == null) {
          return param1;
        } else {
          if (param2 != 255) {
            return null;
          } else {
            return jk.a(new String[1], var3, 30496);
          }
        }
    }

    final byte[] a(int param0, int param1) {
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
            int var17 = 0;
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            byte[] stackIn_48_0 = null;
            byte[] stackIn_49_0 = null;
            Object stackIn_51_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            byte[] stackOut_47_0 = null;
            byte[] stackOut_48_0 = null;
            Object stackOut_50_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var19 = DungeonAssault.field_K;
                        var3 = (Object) (Object) ((ln) this).field_f;
                        // monitorenter ((ln) this).field_f
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + param0 * 6) ^ -1L) >= (((ln) this).field_g.a((byte) -92) ^ -1L)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_2 instanceof IOException ? 50 : 52);
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
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((ln) this).field_g.a((long)(6 * param0), -26296);
                            ((ln) this).field_g.a(0, -1, un.field_c, 6);
                            var4_int = ((255 & un.field_c[0]) << -1462858384) + (((un.field_c[1] & 255) << -788749752) - -(un.field_c[2] & 255));
                            var5 = (un.field_c[5] & 255) + (((un.field_c[4] & 255) << 1148357992) + ((un.field_c[3] & 255) << -2120662384));
                            if ((var4_int ^ -1) <= -1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4_int <= ((ln) this).field_b) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = null;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            // monitorexit var3
                            stackOut_9_0 = stackIn_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return (byte[]) (Object) stackIn_10_0;
                    }
                    case 11: {
                        try {
                            if ((var5 ^ -1) < -1) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((long)var5 ^ -1L) >= (((ln) this).field_f.a((byte) -92) / 520L ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            // monitorexit var3
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (byte[]) (Object) stackIn_16_0;
                    }
                    case 17: {
                        try {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = -83 / ((-59 - param1) / 54);
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var7 >= var4_int) {
                                statePc = 47;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var5 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((ln) this).field_f.a((long)(var5 * 520), -26296);
                            var10 = var4_int + -var7;
                            if ((param0 ^ -1) >= -65536) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var15 = 10;
                            if (510 >= var10) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var10 = 510;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ln) this).field_f.a(0, -1, un.field_c, var15 + var10);
                            var13 = ((255 & un.field_c[6]) << 2049609680) - (-((un.field_c[7] & 255) << -1692605240) + -(un.field_c[8] & 255));
                            var14 = 255 & un.field_c[9];
                            var11 = (un.field_c[3] & 255) + ((65280 & un.field_c[2] << 1801615208) + (-16777216 & un.field_c[0] << 1188319192) + ((un.field_c[1] & 255) << -724508368));
                            var12 = ((un.field_c[4] & 255) << 762675880) + (255 & un.field_c[5]);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-513 <= (var10 ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var10 = 512;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var15 = 8;
                            ((ln) this).field_f.a(0, -1, un.field_c, var15 + var10);
                            var11 = (65280 & un.field_c[0] << -1113447160) - -(255 & un.field_c[1]);
                            var14 = 255 & un.field_c[7];
                            var13 = ((un.field_c[5] & 255) << -916305912) + (((un.field_c[4] & 255) << -1785412368) + (255 & un.field_c[6]));
                            var12 = (un.field_c[3] & 255) + (65280 & un.field_c[2] << -1546843992);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var11 == param0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var9 == var12) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var14 == ((ln) this).field_a) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (0 <= var13) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((long)var13 <= ((ln) this).field_f.a((byte) -92) / 520L) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var16 = var15 + var10;
                            var5 = var13;
                            var9++;
                            var17 = var15;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var16 <= var17) {
                                statePc = 18;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var7++;
                            var6[var7] = un.field_c[var17];
                            var17++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackOut_47_0 = (byte[]) var6;
                            stackIn_48_0 = stackOut_47_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            // monitorexit var3
                            stackOut_48_0 = (byte[]) (Object) stackIn_48_0;
                            stackIn_49_0 = stackOut_48_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        return stackIn_49_0;
                    }
                    case 50: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_50_0 = null;
                            stackIn_51_0 = stackOut_50_0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        return (byte[]) (Object) stackIn_51_0;
                    }
                    case 52: {
                        try {
                            var18 = caughtException;
                            // monitorexit var3
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        throw (RuntimeException) (Object) var18;
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

    final static void a(long param0, byte param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param0);
        } catch (InterruptedException interruptedException) {
        }
        if (param1 > -41) {
            field_d = -95;
        }
    }

    final static cd a(byte param0) {
        String var1 = vl.c(param0 + -29335);
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        if (param0 != -120) {
            field_e = -79;
        }
        return new cd(vl.c(param0 + -29335), pi.c(-555));
    }

    public static void b(int param0) {
        if (param0 != 1148357992) {
            field_c = null;
        }
        field_c = null;
    }

    private final boolean a(boolean param0, int param1, int param2, boolean param3, byte[] param4) {
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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = DungeonAssault.field_K;
                        var6 = (Object) (Object) ((ln) this).field_f;
                        // monitorenter ((ln) this).field_f
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param3) {
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
                            var7_int = (int)((((ln) this).field_f.a((byte) -92) - -519L) / 520L);
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 14;
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
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((((ln) this).field_g.a((byte) -92) ^ -1L) <= ((long)(6 * param2 + 6) ^ -1L)) {
                                statePc = 8;
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
                            stackOut_5_0 = 0;
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var6
                            stackOut_6_0 = stackIn_6_0;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            ((ln) this).field_g.a((long)(param2 * 6), -26296);
                            ((ln) this).field_g.a(0, -1, un.field_c, 6);
                            var7_int = ((255 & un.field_c[4]) << 1348346536) + ((255 & un.field_c[3]) << 1204158256) - -(255 & un.field_c[5]);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (((long)var7_int ^ -1L) < (((ln) this).field_f.a((byte) -92) / 520L ^ -1L)) {
                                statePc = 11;
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
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
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
                            // monitorexit var6
                            stackOut_12_0 = stackIn_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            un.field_c[5] = (byte)var7_int;
                            un.field_c[3] = (byte)(var7_int >> -1698558448);
                            un.field_c[4] = (byte)(var7_int >> -826552312);
                            un.field_c[2] = (byte)param1;
                            un.field_c[0] = (byte)(param1 >> -61021776);
                            un.field_c[1] = (byte)(param1 >> -749040408);
                            ((ln) this).field_g.a((long)(6 * param2), -26296);
                            ((ln) this).field_g.a(0, -91, 6, un.field_c);
                            var8 = 0;
                            if (param0) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((ln) this).field_b = 88;
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
                            var9 = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var8 >= param1) {
                                statePc = 60;
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
                            var10 = 0;
                            if (param3) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((ln) this).field_f.a((long)(520 * var7_int), -26296);
                            if (65535 >= param2) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((ln) this).field_f.a(0, -1, un.field_c, 10);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var11 = ((un.field_c[1] & 255) << -745070736) + ((-16777216 & un.field_c[0] << -913247752) + (un.field_c[2] << -35779800 & 65280) - -(un.field_c[3] & 255));
                            var10 = (un.field_c[7] << -1302838360 & 65280) + ((un.field_c[6] & 255) << -202881328) + (255 & un.field_c[8]);
                            var12 = ((255 & un.field_c[4]) << -595437304) + (255 & un.field_c[5]);
                            var13 = 255 & un.field_c[9];
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((ln) this).field_f.a(0, -1, un.field_c, 8);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var12 = (65280 & un.field_c[2] << -2076167608) - -(un.field_c[3] & 255);
                            var13 = un.field_c[7] & 255;
                            var10 = (un.field_c[4] << 725757616 & 16711680) + (((un.field_c[5] & 255) << 1580256360) + (255 & un.field_c[6]));
                            var11 = (un.field_c[1] & 255) + (un.field_c[0] << -924064856 & 65280);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var11 != param2) {
                                statePc = 33;
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
                            if (var9 != var12) {
                                statePc = 33;
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
                            if (((ln) this).field_a == var13) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
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
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var6
                            stackOut_34_0 = stackIn_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        try {
                            if (-1 < (var10 ^ -1)) {
                                statePc = 39;
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
                            if (((ln) this).field_f.a((byte) -92) / 520L >= (long)var10) {
                                statePc = 42;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
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
                            stackOut_39_0 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var6
                            stackOut_40_0 = stackIn_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (0 == var10) {
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
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10 = (int)((519L + ((ln) this).field_f.a((byte) -92)) / 520L);
                            param3 = false;
                            if (var10 != 0) {
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
                            if (var10 == var7_int) {
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
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var10++;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-513 > -var8 + param1) {
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
                            var10 = 0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-65536 < param2) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            un.field_c[2] = (byte)(var9 >> -383385144);
                            un.field_c[6] = (byte)var10;
                            un.field_c[5] = (byte)(var10 >> 1778938760);
                            un.field_c[1] = (byte)param2;
                            un.field_c[4] = (byte)(var10 >> 1275520304);
                            un.field_c[7] = (byte)((ln) this).field_a;
                            un.field_c[3] = (byte)var9;
                            un.field_c[0] = (byte)(param2 >> 706354440);
                            ((ln) this).field_f.a((long)(520 * var7_int), -26296);
                            ((ln) this).field_f.a(0, -97, 8, un.field_c);
                            var11 = -var8 + param1;
                            if (-513 <= (var11 ^ -1)) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var11 = 512;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((ln) this).field_f.a(var8, -125, var11, param4);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            un.field_c[1] = (byte)(param2 >> -1248707792);
                            un.field_c[7] = (byte)(var10 >> 199949032);
                            un.field_c[5] = (byte)var9;
                            un.field_c[6] = (byte)(var10 >> -678543280);
                            un.field_c[4] = (byte)(var9 >> -1875261528);
                            un.field_c[3] = (byte)param2;
                            un.field_c[0] = (byte)(param2 >> 1709216056);
                            un.field_c[9] = (byte)((ln) this).field_a;
                            un.field_c[2] = (byte)(param2 >> -536568184);
                            un.field_c[8] = (byte)var10;
                            ((ln) this).field_f.a((long)(var7_int * 520), -26296);
                            ((ln) this).field_f.a(0, -116, 10, un.field_c);
                            var11 = -var8 + param1;
                            if ((var11 ^ -1) < -511) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var11 = 510;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((ln) this).field_f.a(var8, -106, var11, param4);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 17;
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

    public final String toString() {
        return "" + ((ln) this).field_a;
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
                    if (param3 == -29447) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    var5 = (Object) (Object) ((ln) this).field_f;
                    // monitorenter ((ln) this).field_f
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (param2 < 0) {
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
                        if (((ln) this).field_b < param2) {
                            statePc = 6;
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
                        statePc = 7;
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
                        var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
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
                        var6 = this.a(true, param2, param1, false, param0) ? 1 : 0;
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

    final static boolean a(int param0) {
        if (param0 != 255) {
            return false;
        }
        return bl.field_r.b((byte) 113);
    }

    ln(int param0, hd param1, hd param2, int param3) {
        ((ln) this).field_b = 65000;
        ((ln) this).field_f = null;
        ((ln) this).field_g = null;
        ((ln) this).field_f = param1;
        ((ln) this).field_g = param2;
        ((ln) this).field_a = param0;
        ((ln) this).field_b = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Use this alternative as your account name";
    }
}
