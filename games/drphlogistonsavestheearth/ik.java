/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ik {
    private int field_e;
    static bb field_d;
    private ge field_g;
    private ge field_c;
    private int field_a;
    static he[] field_f;
    static nh field_b;
    static String field_h;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = ik.a((String) null, (byte) -116);
        }
        field_h = null;
        field_b = null;
        field_d = null;
    }

    final boolean a(byte param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((ik) this).field_c;
                    // monitorenter ((ik) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 > param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((ik) this).field_e < param1) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = -74 % ((23 - param0) / 56);
                        var7 = this.a(param3, (byte) -15, param2, true, param1) ? 1 : 0;
                        if (var7 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = this.a(param3, (byte) -15, param2, false, param1) ? 1 : 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        // monitorexit var5
                        stackOut_7_0 = var7;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var8 = caughtException;
                        // monitorexit var5
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == 11755) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        if (0 > vb.field_n) {
          return;
        } else {
          L1: {
            var3 = param1 - 135;
            var4 = -35 + param2;
            var5 = 256;
            if (vb.field_n < 75) {
              var5 = (vb.field_n << 931841896) / 75;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (200 >= vb.field_n) {
              break L2;
            } else {
              var5 = (250 - vb.field_n << 406487016) / 50;
              break L2;
            }
          }
          L3: {
            aj.a(bb.field_f, (byte) 91);
            uc.b();
            wj.c();
            ah.g((byte) -104);
            if (256 <= var5) {
              break L3;
            } else {
              wj.d(0, 0, wj.field_k, wj.field_c, 0, -var5 + 256);
              break L3;
            }
          }
          L4: {
            cl.d((byte) -106);
            if (150 <= vb.field_n) {
              ji.field_b.e(var3 - -15, var4 - -10, var5);
              break L4;
            } else {
              bb.field_f.b(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = -125 + vb.field_n;
            if (var6 <= 0) {
              break L5;
            } else {
              if ((var6 ^ -1) <= -51) {
                break L5;
              } else {
                if ((var6 ^ -1) > -21) {
                  var7 = var6 * 256 / 20;
                  vh.field_f.a(var3, var4, var7);
                  break L5;
                } else {
                  if (30 > var6) {
                    vh.field_f.a(var3, var4, 256);
                    break L5;
                  } else {
                    var7 = (-(256 * var6) + 12800) / 20;
                    vh.field_f.a(var3, var4, var7);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = vb.field_n - 140;
            if (0 < var6) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              vb.field_s.e(15 + var3, 10 + var4, var5 * var7 >> 1190765672);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    public final String toString() {
        return "" + ((ik) this).field_a;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_42_0 = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_51_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        var3 = (Object) (Object) ((ik) this).field_c;
                        // monitorenter ((ik) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ik) this).field_g.b(true) >= (long)(6 + param0 * 6)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((ik) this).field_g.a((long)(param0 * 6), (byte) -63);
                            ((ik) this).field_g.a(0, ma.field_yb, 6, param1 + -105);
                            var4_int = (ma.field_yb[1] << -1718113592 & 65280) + (((255 & ma.field_yb[0]) << 49331280) + (ma.field_yb[2] & 255));
                            var5 = (ma.field_yb[5] & 255) + ((ma.field_yb[4] & 255) << 650862664) + (ma.field_yb[param1] << -1161438256 & 16711680);
                            if (var4_int >= 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((ik) this).field_e >= var4_int) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (0 < var5) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((long)var5 ^ -1L) >= (((ik) this).field_c.b(true) / 520L ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 51 : 53);
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
                            statePc = (stateCaught_14 instanceof IOException ? 51 : 53);
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
                            statePc = 53;
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
                            var8 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 48;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 51 : 53);
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
                            statePc = (stateCaught_19 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((ik) this).field_c.a((long)(var5 * 520), (byte) -63);
                            var9 = var4_int + -var7;
                            if (param0 < -65536) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var14 = 8;
                            if (-513 >= var9) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var9 = 512;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ik) this).field_c.a(0, ma.field_yb, var14 + var9, param1 + -114);
                            var11 = (255 & ma.field_yb[3]) + ((255 & ma.field_yb[2]) << 252600488);
                            var12 = (ma.field_yb[5] << -1489920120 & 65280) + ((ma.field_yb[4] & 255) << 344646416) - -(255 & ma.field_yb[6]);
                            var13 = 255 & ma.field_yb[7];
                            var10 = (ma.field_yb[1] & 255) + (65280 & ma.field_yb[0] << 1028758024);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = 10;
                            if (510 >= var9) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var9 = 510;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((ik) this).field_c.a(0, ma.field_yb, var14 + var9, -103);
                            var13 = 255 & ma.field_yb[9];
                            var10 = (ma.field_yb[3] & 255) + (ma.field_yb[0] << 1427491544 & -16777216) + (16711680 & ma.field_yb[1] << -1204071376) - -((255 & ma.field_yb[2]) << -337689112);
                            var12 = ((255 & ma.field_yb[7]) << -850041496) + ((255 & ma.field_yb[6]) << -1281546832) + (255 & ma.field_yb[8]);
                            var11 = (65280 & ma.field_yb[4] << 1756786536) - -(ma.field_yb[5] & 255);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var10 == param0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var11 == var8) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var13 == ((ik) this).field_a) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (0 <= var12) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((((ik) this).field_c.b(true) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            stackOut_41_0 = null;
                            stackIn_42_0 = stackOut_41_0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            // monitorexit var3
                            stackOut_42_0 = stackIn_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return (byte[]) (Object) stackIn_43_0;
                    }
                    case 44: {
                        try {
                            var15 = var9 + var14;
                            var16 = var14;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var16 >= var15) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var7++;
                            var6[var7] = ma.field_yb[var16];
                            var16++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var5 = var12;
                            var8++;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = (byte[]) var6;
                            stackIn_49_0 = stackOut_48_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            // monitorexit var3
                            stackOut_49_0 = (byte[]) (Object) stackIn_49_0;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        return stackIn_50_0;
                    }
                    case 51: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_51_0 = null;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        return (byte[]) (Object) stackIn_52_0;
                    }
                    case 53: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 54: {
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

    private final boolean a(int param0, byte param1, byte[] param2, boolean param3, int param4) {
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
            int stackIn_17_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_68_0 = 0;
            int stackIn_70_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_67_0 = 0;
            int stackOut_69_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        var6 = (Object) (Object) ((ik) this).field_c;
                        // monitorenter ((ik) this).field_c
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
                            statePc = (stateCaught_1 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if ((((ik) this).field_g.b(true) ^ -1L) <= ((long)(param0 * 6 + 6) ^ -1L)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 69 : 71);
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
                            statePc = (stateCaught_3 instanceof IOException ? 69 : 71);
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
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((ik) this).field_g.a((long)(param0 * 6), (byte) -63);
                            ((ik) this).field_g.a(0, ma.field_yb, 6, -111);
                            var7_int = ((255 & ma.field_yb[4]) << 451544872) + ((ma.field_yb[3] << -306560368 & 16711680) + (255 & ma.field_yb[5]));
                            if (var7_int <= 0) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((long)var7_int ^ -1L) >= (((ik) this).field_c.b(true) / 520L ^ -1L)) {
                                statePc = 15;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 69 : 71);
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
                            statePc = (stateCaught_9 instanceof IOException ? 69 : 71);
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
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((((ik) this).field_c.b(true) + 519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 69 : 71);
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
                            statePc = (stateCaught_14 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ma.field_yb[4] = (byte)(var7_int >> -1572422104);
                            ma.field_yb[5] = (byte)var7_int;
                            ma.field_yb[1] = (byte)(param4 >> -215439352);
                            ma.field_yb[0] = (byte)(param4 >> 2006607568);
                            ma.field_yb[3] = (byte)(var7_int >> 1728766448);
                            ma.field_yb[2] = (byte)param4;
                            ((ik) this).field_g.a((long)(6 * param0), (byte) -63);
                            if (param1 == -15) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            // monitorexit var6
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        try {
                            ((ik) this).field_g.a(6, 0, 18017, ma.field_yb);
                            var8 = 0;
                            var9 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param4 <= var8) {
                                statePc = 66;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var10 = 0;
                            if (!param3) {
                                statePc = 45;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((ik) this).field_c.a((long)(520 * var7_int), (byte) -63);
                            if (param0 > 65535) {
                                statePc = 28;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((ik) this).field_c.a(0, ma.field_yb, 8, param1 ^ 109);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 69 : 71));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var10 = (ma.field_yb[6] & 255) + (((255 & ma.field_yb[4]) << -152982448) - -((ma.field_yb[5] & 255) << 1395270696));
                            var13 = 255 & ma.field_yb[7];
                            var11 = (65280 & ma.field_yb[0] << -1814538936) + (ma.field_yb[1] & 255);
                            var12 = (255 & ma.field_yb[3]) + ((255 & ma.field_yb[2]) << -91975768);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((ik) this).field_c.a(0, ma.field_yb, 10, -122);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof EOFException ? 30 : (stateCaught_28 instanceof IOException ? 69 : 71));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var10 = (16711680 & ma.field_yb[6] << 922571824) + ((ma.field_yb[7] & 255) << -1367732952) - -(255 & ma.field_yb[8]);
                            var12 = (ma.field_yb[5] & 255) + (65280 & ma.field_yb[4] << -218582104);
                            var13 = 255 & ma.field_yb[9];
                            var11 = (ma.field_yb[3] & 255) + (ma.field_yb[2] << -2067599064 & 65280) + (((255 & ma.field_yb[1]) << 18944624) + ((ma.field_yb[0] & 255) << -1100759752));
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (param0 != var11) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var12 != var9) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((ik) this).field_a != var13) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var6
                            stackOut_37_0 = stackIn_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0 != 0;
                    }
                    case 39: {
                        try {
                            if (var10 < 0) {
                                statePc = 42;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((ik) this).field_c.b(true) / 520L >= (long)var10) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var6
                            stackOut_43_0 = stackIn_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return stackIn_44_0 != 0;
                    }
                    case 45: {
                        try {
                            if (var10 == 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param3 = false;
                            var10 = (int)((((ik) this).field_c.b(true) + 519L) / 520L);
                            if (var10 == 0) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 69 : 71);
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
                            statePc = (stateCaught_49 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var7_int == var10) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var10++;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (512 >= param4 - var8) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var10 = 0;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if ((param0 ^ -1) < -65536) {
                                statePc = 61;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ma.field_yb[1] = (byte)param0;
                            ma.field_yb[0] = (byte)(param0 >> 736789576);
                            ma.field_yb[2] = (byte)(var9 >> 52007432);
                            ma.field_yb[6] = (byte)var10;
                            ma.field_yb[4] = (byte)(var10 >> 940258960);
                            ma.field_yb[5] = (byte)(var10 >> -2063749688);
                            ma.field_yb[7] = (byte)((ik) this).field_a;
                            ma.field_yb[3] = (byte)var9;
                            ((ik) this).field_c.a((long)(520 * var7_int), (byte) -63);
                            ((ik) this).field_c.a(8, 0, 18017, ma.field_yb);
                            var11 = -var8 + param4;
                            if (var11 > 512) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 69 : 71);
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
                            statePc = (stateCaught_59 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ((ik) this).field_c.a(var11, var8, param1 + 18032, param2);
                            var8 = var8 + var11;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            ma.field_yb[4] = (byte)(var9 >> 336350376);
                            ma.field_yb[0] = (byte)(param0 >> -759729320);
                            ma.field_yb[9] = (byte)((ik) this).field_a;
                            ma.field_yb[5] = (byte)var9;
                            ma.field_yb[8] = (byte)var10;
                            ma.field_yb[2] = (byte)(param0 >> 2086334856);
                            ma.field_yb[3] = (byte)param0;
                            ma.field_yb[6] = (byte)(var10 >> 529863248);
                            ma.field_yb[1] = (byte)(param0 >> 590220752);
                            ma.field_yb[7] = (byte)(var10 >> 2004654376);
                            ((ik) this).field_c.a((long)(var7_int * 520), (byte) -63);
                            ((ik) this).field_c.a(10, 0, 18017, ma.field_yb);
                            var11 = -var8 + param4;
                            if (-511 > (var11 ^ -1)) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var11 = 510;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            ((ik) this).field_c.a(var11, var8, 18017, param2);
                            var8 = var8 + var11;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackOut_66_0 = 1;
                            stackIn_67_0 = stackOut_66_0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof IOException ? 69 : 71);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            // monitorexit var6
                            stackOut_67_0 = stackIn_67_0;
                            stackIn_68_0 = stackOut_67_0;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        return stackIn_68_0 != 0;
                    }
                    case 69: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_69_0 = 0;
                            stackIn_70_0 = stackOut_69_0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        return stackIn_70_0 != 0;
                    }
                    case 71: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 72: {
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

    ik(int param0, ge param1, ge param2, int param3) {
        ((ik) this).field_e = 65000;
        ((ik) this).field_c = null;
        ((ik) this).field_g = null;
        ((ik) this).field_e = param3;
        ((ik) this).field_c = param1;
        ((ik) this).field_g = param2;
        ((ik) this).field_a = param0;
    }

    final static boolean a(String param0, byte param1) {
        if (param1 > -106) {
            return false;
        }
        return null != pa.a(param0, (byte) 67) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bb();
        field_h = "Medium";
    }
}
