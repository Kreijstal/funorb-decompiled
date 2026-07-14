/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    static h field_a;
    static String field_b;
    private ud field_j;
    private int field_d;
    private ud field_g;
    static int field_i;
    private int field_e;
    static String field_f;
    static boolean field_h;
    static String field_c;

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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_45_0 = null;
            Object stackIn_46_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_45_0 = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_54_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = HoldTheLine.field_D;
                        var3 = (Object) (Object) ((sk) this).field_g;
                        // monitorenter ((sk) this).field_g
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((long)(param1 * 6 - -6) <= ((sk) this).field_j.c(-32261)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((sk) this).field_j.a(25971, (long)(param1 * 6));
                            ((sk) this).field_j.a(-1, 0, 6, oi.field_d);
                            var4_int = (16711680 & oi.field_d[0] << -1392673552) + ((oi.field_d[1] & 255) << 1406431368) - -(oi.field_d[2] & 255);
                            var5 = ((255 & oi.field_d[3]) << 576014896) - -((oi.field_d[4] & 255) << -349680472) + (255 & oi.field_d[5]);
                            if (var4_int >= 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4_int <= ((sk) this).field_e) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
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
                            statePc = (stateCaught_11 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((long)var5 ^ -1L) >= (((sk) this).field_g.c(-32261) / 520L ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_14 instanceof IOException ? 54 : 56);
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
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (byte[]) (Object) stackIn_16_0;
                    }
                    case 17: {
                        try {
                            if (param0 > 99) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((sk) this).field_j = null;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 51;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var5 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((sk) this).field_g.a(25971, (long)(var5 * 520));
                            var9 = var4_int - var7;
                            if (-65536 > (param1 ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((var9 ^ -1) >= -513) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var9 = 512;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = 8;
                            ((sk) this).field_g.a(-1, 0, var9 + var14, oi.field_d);
                            var13 = 255 & oi.field_d[7];
                            var12 = (oi.field_d[6] & 255) + (oi.field_d[4] << -1903646384 & 16711680) + (oi.field_d[5] << -1646403032 & 65280);
                            var11 = ((255 & oi.field_d[2]) << 157308296) - -(255 & oi.field_d[3]);
                            var10 = ((255 & oi.field_d[0]) << -403667032) - -(oi.field_d[1] & 255);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-511 > (var9 ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var9 = 510;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var14 = 10;
                            ((sk) this).field_g.a(-1, 0, var14 + var9, oi.field_d);
                            var11 = (65280 & oi.field_d[4] << 2015576840) - -(oi.field_d[5] & 255);
                            var13 = 255 & oi.field_d[9];
                            var12 = (255 & oi.field_d[8]) + (65280 & oi.field_d[7] << -525608024) + ((oi.field_d[6] & 255) << 1133494032);
                            var10 = (oi.field_d[0] << 169215288 & -16777216) - -((oi.field_d[1] & 255) << 1561477584) - (-(65280 & oi.field_d[2] << 1597021736) - (255 & oi.field_d[3]));
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var10 == param1) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var11 == var8) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((sk) this).field_d == var13) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (-1 >= (var12 ^ -1)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (((sk) this).field_g.c(-32261) / 520L >= (long)var12) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            stackOut_44_0 = null;
                            stackIn_45_0 = stackOut_44_0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            // monitorexit var3
                            stackOut_45_0 = stackIn_45_0;
                            stackIn_46_0 = stackOut_45_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        return (byte[]) (Object) stackIn_46_0;
                    }
                    case 47: {
                        try {
                            var15 = var14 + var9;
                            var16 = var14;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var16 >= var15) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var7++;
                            var6[var7] = oi.field_d[var16];
                            var16++;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var5 = var12;
                            var8++;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackOut_51_0 = (byte[]) var6;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            // monitorexit var3
                            stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        return stackIn_53_0;
                    }
                    case 54: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_54_0 = null;
                            stackIn_55_0 = stackOut_54_0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        return (byte[]) (Object) stackIn_55_0;
                    }
                    case 56: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 57: {
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

    public final String toString() {
        return "" + ((sk) this).field_d;
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -75 / ((param0 - 56) / 32);
        field_c = null;
        field_f = null;
        field_a = null;
    }

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!qh.c(-105)) {
            L1: {
              kl.field_q.a(cm.a((byte) 110, jb.field_U, lb.field_x), cm.a((byte) 110, rf.field_X, nc.field_g), 4);
              if (!kl.field_q.a(-1)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            L2: {
              if (param0 == 18) {
                break L2;
              } else {
                sk.a(-123);
                break L2;
              }
            }
            L3: {
              var3 = 0;
              if (var1 != 0) {
                if (0 <= kl.field_q.field_g) {
                  L4: {
                    var3 = ii.field_e[kl.field_q.field_g];
                    if (2 == var3) {
                      break L4;
                    } else {
                      if (5 == var3) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ah.b(false);
                  break L3;
                } else {
                  if (2 == pa.field_h) {
                    break L3;
                  } else {
                    ah.b(false);
                    break L3;
                  }
                }
              } else {
                if (var2 == 0) {
                  break L3;
                } else {
                  if (2 == pa.field_h) {
                    break L3;
                  } else {
                    ah.b(false);
                    break L3;
                  }
                }
              }
            }
            L5: {
              if (0 != var3) {
                break L5;
              } else {
                if (-3 == (pa.field_h ^ -1)) {
                  var4 = bb.b(param0 ^ -19) - cg.field_g;
                  var6 = (int)((10999L - var4) / 1000L);
                  if (-1 > (var6 ^ -1)) {
                    break L5;
                  } else {
                    pe.a(5, true, (byte) -121);
                    var3 = 2;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            return var3;
          } else {
            L6: {
              kl.field_q.b(-1);
              if (kl.field_q.a(-1)) {
                var1 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            if ((aa.field_n ^ -1) == -14) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int param2, boolean param3, byte[] param4) {
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
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_66_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = HoldTheLine.field_D;
                        var6 = (Object) (Object) ((sk) this).field_g;
                        // monitorenter ((sk) this).field_g
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param3) {
                                statePc = 12;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((long)(6 + 6 * param0) ^ -1L) >= (((sk) this).field_j.c(-32261) ^ -1L)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            // monitorexit var6
                            stackOut_4_0 = stackIn_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((sk) this).field_j.a(25971, (long)(6 * param0));
                            ((sk) this).field_j.a(-1, 0, 6, oi.field_d);
                            var7_int = (255 & oi.field_d[5]) + ((oi.field_d[3] & 255) << -1898349200) - -(65280 & oi.field_d[4] << 1433861768);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if ((long)var7_int <= ((sk) this).field_g.c(-32261) / 520L) {
                                statePc = 15;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var6
                            stackOut_10_0 = stackIn_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((((sk) this).field_g.c(-32261) - -519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var7_int = 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            oi.field_d[2] = (byte)param1;
                            oi.field_d[5] = (byte)var7_int;
                            oi.field_d[4] = (byte)(var7_int >> 1838104552);
                            oi.field_d[3] = (byte)(var7_int >> 1082711120);
                            oi.field_d[0] = (byte)(param1 >> 1217279120);
                            oi.field_d[1] = (byte)(param1 >> 1415340424);
                            ((sk) this).field_j.a(25971, (long)(param0 * 6));
                            ((sk) this).field_j.a((byte) 125, 6, 0, oi.field_d);
                            if (param2 > 73) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            field_c = null;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var8 = 0;
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (param1 <= var8) {
                                statePc = 62;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var10 = 0;
                            if (!param3) {
                                statePc = 43;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((sk) this).field_g.a(25971, (long)(520 * var7_int));
                            if ((param0 ^ -1) < -65536) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((sk) this).field_g.a(-1, 0, 8, oi.field_d);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof EOFException ? 24 : (stateCaught_22 instanceof IOException ? 65 : 67));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var13 = 255 & oi.field_d[7];
                            var12 = (oi.field_d[3] & 255) + (65280 & oi.field_d[2] << 1876676328);
                            var10 = (255 & oi.field_d[6]) + ((oi.field_d[4] & 255) << -1224615056) - -(65280 & oi.field_d[5] << -75069880);
                            var11 = (255 & oi.field_d[1]) + ((oi.field_d[0] & 255) << 175163464);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((sk) this).field_g.a(-1, 0, 10, oi.field_d);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof EOFException ? 28 : (stateCaught_26 instanceof IOException ? 65 : 67));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var11 = (oi.field_d[3] & 255) + ((oi.field_d[0] & 255) << 283333176) + (((oi.field_d[1] & 255) << -1687685072) - -((oi.field_d[2] & 255) << -2092447192));
                            var12 = (oi.field_d[5] & 255) + ((255 & oi.field_d[4]) << 1685115112);
                            var13 = oi.field_d[9] & 255;
                            var10 = (255 & oi.field_d[8]) + (16711680 & oi.field_d[6] << 131443312) - -(65280 & oi.field_d[7] << -457816952);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var11 != param0) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var12 != var9) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (((sk) this).field_d != var13) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var6
                            stackOut_35_0 = stackIn_35_0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0 != 0;
                    }
                    case 37: {
                        try {
                            if ((var10 ^ -1) > -1) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((long)var10 ^ -1L) >= (((sk) this).field_g.c(-32261) / 520L ^ -1L)) {
                                statePc = 43;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            stackOut_40_0 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var6
                            stackOut_41_0 = stackIn_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        return stackIn_42_0 != 0;
                    }
                    case 43: {
                        try {
                            if (0 != var10) {
                                statePc = 50;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10 = (int)((519L + ((sk) this).field_g.c(-32261)) / 520L);
                            param3 = false;
                            if (var10 == 0) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var10++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var10 == var7_int) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var10++;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (512 < param1 + -var8) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var10 = 0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (65535 >= param0) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            oi.field_d[3] = (byte)param0;
                            oi.field_d[0] = (byte)(param0 >> 1038566328);
                            oi.field_d[2] = (byte)(param0 >> 1170419432);
                            oi.field_d[1] = (byte)(param0 >> -1422991920);
                            oi.field_d[8] = (byte)var10;
                            oi.field_d[4] = (byte)(var9 >> 1213872424);
                            oi.field_d[5] = (byte)var9;
                            oi.field_d[6] = (byte)(var10 >> -332753776);
                            oi.field_d[9] = (byte)((sk) this).field_d;
                            oi.field_d[7] = (byte)(var10 >> 1128915752);
                            ((sk) this).field_g.a(25971, (long)(var7_int * 520));
                            ((sk) this).field_g.a((byte) 126, 10, 0, oi.field_d);
                            var11 = -var8 + param1;
                            if (var11 > 510) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var11 = 510;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((sk) this).field_g.a((byte) 125, var11, var8, param4);
                            var8 = var8 + var11;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            oi.field_d[6] = (byte)var10;
                            oi.field_d[0] = (byte)(param0 >> -553860632);
                            oi.field_d[3] = (byte)var9;
                            oi.field_d[2] = (byte)(var9 >> -589194232);
                            oi.field_d[1] = (byte)param0;
                            oi.field_d[5] = (byte)(var10 >> -1773330488);
                            oi.field_d[7] = (byte)((sk) this).field_d;
                            oi.field_d[4] = (byte)(var10 >> -46801136);
                            ((sk) this).field_g.a(25971, (long)(520 * var7_int));
                            ((sk) this).field_g.a((byte) 126, 8, 0, oi.field_d);
                            var11 = param1 - var8;
                            if ((var11 ^ -1) < -513) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var11 = 512;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ((sk) this).field_g.a((byte) 126, var11, var8, param4);
                            var8 = var8 + var11;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackOut_62_0 = 1;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            // monitorexit var6
                            stackOut_63_0 = stackIn_63_0;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        return stackIn_64_0 != 0;
                    }
                    case 65: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_65_0 = 0;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        return stackIn_66_0 != 0;
                    }
                    case 67: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 68: {
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

    final boolean a(byte[] param0, int param1, int param2, boolean param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        Object var8 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((sk) this).field_g;
                    // monitorenter ((sk) this).field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param2 ^ -1) > -1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((sk) this).field_e < param2) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = null;
                        boolean discarded$3 = this.a(-91, 110, -101, false, (byte[]) null);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = this.a(param1, param2, 113, true, param0) ? 1 : 0;
                        if (var6 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = this.a(param1, param2, 96, false, param0) ? 1 : 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        stackOut_9_0 = var6;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    sk(int param0, ud param1, ud param2, int param3) {
        ((sk) this).field_j = null;
        ((sk) this).field_g = null;
        ((sk) this).field_e = 65000;
        ((sk) this).field_e = param3;
        ((sk) this).field_g = param1;
        ((sk) this).field_j = param2;
        ((sk) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Connection restored.";
        field_a = new h();
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_f = "Beat your competitors around <col=1>8</col> laps of the course to progress through the game.<br><br>Power-ups scattered around the course will give bonuses to those cars that collect them.";
        field_h = false;
    }
}
