/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc {
    private int field_c;
    static String field_h;
    static String field_d;
    private ue field_g;
    static String field_f;
    static ru[][] field_j;
    static String field_k;
    private ue field_l;
    private int field_b;
    static ic field_a;
    static boolean field_e;
    static String field_i;

    final boolean a(int param0, int param1, byte[] param2, int param3) {
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
                    var5 = (Object) (Object) ((bc) this).field_l;
                    // monitorenter ((bc) this).field_l
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 < (param1 ^ -1)) {
                            statePc = 3;
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
                        if (((bc) this).field_c >= param1) {
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
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = this.a(param3, param2, true, param1, (byte) -52) ? 1 : 0;
                        var7 = -85 % ((param0 - -68) / 56);
                        if (var6 == 0) {
                            statePc = 6;
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
                        var6 = this.a(param3, param2, false, param1, (byte) 104) ? 1 : 0;
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
                        stackOut_7_0 = var6;
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

    final static void a(int param0) {
        if (param0 != 2858) {
            Object var2 = null;
            bc.a(-95, (mo) null);
        }
        ng.x(90);
    }

    final static void a(int param0, mo param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= lk.field_h) {
                am.field_D[param1.a(true)] = am.field_D[param1.a(true)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= lk.field_h) {
                    L3: {
                      lk.field_h = var2;
                      if (param0 == 3208) {
                        break L3;
                      } else {
                        field_k = null;
                        break L3;
                      }
                    }
                    lk.field_h = lk.field_h + 1;
                    an.field_F[lk.field_h] = param1;
                    return;
                  } else {
                    L4: {
                      if (param1.field_b != an.field_F[var3].field_b) {
                        break L4;
                      } else {
                        var4 = an.field_F[var3].a(true);
                        if (am.field_D[var4] > vj.field_g) {
                          am.field_D[var4] = am.field_D[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2++;
                    an.field_F[var2] = an.field_F[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param1.field_b == an.field_F[var2].field_b) {
                  am.field_D[an.field_F[var2].a(true)] = am.field_D[an.field_F[var2].a(true)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            am.field_D[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    private final boolean a(int param0, byte[] param1, boolean param2, int param3, byte param4) {
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
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_63_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
                        var6 = (Object) (Object) ((bc) this).field_l;
                        // monitorenter ((bc) this).field_l
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7_int = (int)((519L + ((bc) this).field_l.a(true)) / 520L);
                            if (-1 == (var7_int ^ -1)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7_int = 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((bc) this).field_g.a(true) < (long)(6 * param0 + 6)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var6
                            stackOut_8_0 = stackIn_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            ((bc) this).field_g.a(-1, (long)(param0 * 6));
                            ((bc) this).field_g.a(0, tn.field_db, (byte) -103, 6);
                            var7_int = ((255 & tn.field_db[3]) << -1536732848) - -(tn.field_db[4] << -1590498392 & 65280) - -(tn.field_db[5] & 255);
                            if (-1 <= (var7_int ^ -1)) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if ((long)var7_int <= ((bc) this).field_l.a(true) / 520L) {
                                statePc = 16;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var6
                            stackOut_14_0 = stackIn_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        try {
                            tn.field_db[2] = (byte)param3;
                            tn.field_db[5] = (byte)var7_int;
                            tn.field_db[3] = (byte)(var7_int >> 687875440);
                            tn.field_db[1] = (byte)(param3 >> -1659381336);
                            tn.field_db[4] = (byte)(var7_int >> -856363512);
                            var8 = 27 / ((66 - param4) / 35);
                            tn.field_db[0] = (byte)(param3 >> -2093889104);
                            ((bc) this).field_g.a(-1, (long)(param0 * 6));
                            ((bc) this).field_g.a(6, 0, (byte) 56, tn.field_db);
                            var9 = 0;
                            var10 = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param3 <= var9) {
                                statePc = 59;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var11 = 0;
                            if (!param2) {
                                statePc = 42;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((bc) this).field_l.a(-1, (long)(520 * var7_int));
                            if (65535 >= param0) {
                                statePc = 25;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((bc) this).field_l.a(0, tn.field_db, (byte) -103, 10);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var11 = (255 & tn.field_db[8]) + (16711680 & tn.field_db[6] << -1381243760) + (65280 & tn.field_db[7] << 2012773128);
                            var12 = (255 & tn.field_db[3]) + ((tn.field_db[1] << 279330320 & 16711680) + (((255 & tn.field_db[0]) << -432054408) - -((255 & tn.field_db[2]) << 106064616)));
                            var14 = tn.field_db[9] & 255;
                            var13 = ((255 & tn.field_db[4]) << 2082763560) - -(tn.field_db[5] & 255);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((bc) this).field_l.a(0, tn.field_db, (byte) -103, 8);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var13 = (tn.field_db[3] & 255) + (65280 & tn.field_db[2] << -950061176);
                            var11 = (255 & tn.field_db[6]) + ((16711680 & tn.field_db[4] << -2078564400) - -(tn.field_db[5] << -384822040 & 65280));
                            var12 = (255 & tn.field_db[1]) + ((255 & tn.field_db[0]) << -824812408);
                            var14 = tn.field_db[7] & 255;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (param0 != var12) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var10 != var13) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var14 == ((bc) this).field_b) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_33 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        try {
                            if (var11 < 0) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((bc) this).field_l.a(true) / 520L < (long)var11) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_39 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (-1 != var11) {
                                statePc = 48;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var11 = (int)((((bc) this).field_l.a(true) - -519L) / 520L);
                            param2 = false;
                            if (-1 != var11) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var11++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var7_int == var11) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var11++;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((param3 - var9 ^ -1) < -513) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var11 = 0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (param0 > 65535) {
                                statePc = 55;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            tn.field_db[2] = (byte)(var10 >> -189794744);
                            tn.field_db[0] = (byte)(param0 >> 1678634056);
                            tn.field_db[3] = (byte)var10;
                            tn.field_db[1] = (byte)param0;
                            tn.field_db[7] = (byte)((bc) this).field_b;
                            tn.field_db[4] = (byte)(var11 >> 1245661424);
                            tn.field_db[6] = (byte)var11;
                            tn.field_db[5] = (byte)(var11 >> 831654120);
                            ((bc) this).field_l.a(-1, (long)(var7_int * 520));
                            ((bc) this).field_l.a(8, 0, (byte) 44, tn.field_db);
                            var12 = param3 + -var9;
                            if ((var12 ^ -1) < -513) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var12 = 512;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((bc) this).field_l.a(var12, var9, (byte) 78, param1);
                            var9 = var9 + var12;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            tn.field_db[6] = (byte)(var11 >> 582524592);
                            tn.field_db[0] = (byte)(param0 >> 509524280);
                            tn.field_db[3] = (byte)param0;
                            tn.field_db[4] = (byte)(var10 >> -1165377176);
                            tn.field_db[9] = (byte)((bc) this).field_b;
                            tn.field_db[1] = (byte)(param0 >> 791356048);
                            tn.field_db[7] = (byte)(var11 >> -932251896);
                            tn.field_db[2] = (byte)(param0 >> -530339000);
                            tn.field_db[5] = (byte)var10;
                            tn.field_db[8] = (byte)var11;
                            ((bc) this).field_l.a(-1, (long)(var7_int * 520));
                            ((bc) this).field_l.a(10, 0, (byte) 63, tn.field_db);
                            var12 = -var9 + param3;
                            if (510 >= var12) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var12 = 510;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((bc) this).field_l.a(var12, var9, (byte) 110, param1);
                            var9 = var9 + var12;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var7_int = var11;
                            var10++;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackOut_59_0 = 1;
                            stackIn_60_0 = stackOut_59_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            // monitorexit var6
                            stackOut_60_0 = stackIn_60_0;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        return stackIn_61_0 != 0;
                    }
                    case 62: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_62_0 = 0;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        return stackIn_63_0 != 0;
                    }
                    case 64: {
                        try {
                            var16 = caughtException;
                            // monitorexit var6
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        throw (RuntimeException) (Object) var16;
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
        return "" + ((bc) this).field_b;
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_51_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = ArmiesOfGielinor.field_M ? 1 : 0;
                        var3 = (Object) (Object) ((bc) this).field_l;
                        // monitorenter ((bc) this).field_l
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 * param1 - -6) ^ -1L) >= (((bc) this).field_g.a(true) ^ -1L)) {
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
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var3
                            stackOut_3_0 = (Object) (Object) stackIn_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((bc) this).field_g.a(-1, (long)(6 * param1));
                            ((bc) this).field_g.a(0, tn.field_db, (byte) -103, 6);
                            var4_int = (tn.field_db[0] << -1931386480 & 16711680) + (tn.field_db[1] << 208955240 & 65280) - -(tn.field_db[2] & 255);
                            var5 = (tn.field_db[3] << -1862779824 & 16711680) - (-(65280 & tn.field_db[4] << -1893295704) + -(255 & tn.field_db[5]));
                            if (0 <= var4_int) {
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
                            if (var4_int <= ((bc) this).field_c) {
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
                            if (param0 < var5) {
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
                            if ((long)var5 <= ((bc) this).field_l.a(true) / 520L) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
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
                            if (-1 != (var5 ^ -1)) {
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
                            ((bc) this).field_l.a(-1, (long)(var5 * 520));
                            var9 = var4_int + -var7;
                            if (65535 < param1) {
                                statePc = 28;
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
                            if ((var9 ^ -1) < -513) {
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
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var9 = 512;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((bc) this).field_l.a(0, tn.field_db, (byte) -103, var14 + var9);
                            var10 = (255 & tn.field_db[1]) + ((tn.field_db[0] & 255) << 644079336);
                            var11 = (255 & tn.field_db[3]) + ((tn.field_db[2] & 255) << -1357958360);
                            var13 = tn.field_db[7] & 255;
                            var12 = (tn.field_db[6] & 255) + ((255 & tn.field_db[5]) << -599995064) + (16711680 & tn.field_db[4] << -1585123120);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var9 ^ -1) >= -511) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var9 = 510;
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
                            var14 = 10;
                            ((bc) this).field_l.a(0, tn.field_db, (byte) -103, var9 + var14);
                            var11 = (65280 & tn.field_db[4] << 2139212648) + (tn.field_db[5] & 255);
                            var13 = tn.field_db[9] & 255;
                            var12 = ((tn.field_db[7] & 255) << -815295032) + (16711680 & tn.field_db[6] << 1341775696) + (255 & tn.field_db[8]);
                            var10 = ((tn.field_db[0] & 255) << -980111784) - (-((tn.field_db[1] & 255) << 1912573744) + -((tn.field_db[2] & 255) << 623847944)) + (tn.field_db[3] & 255);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var10 == param1) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var8 == var11) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var13 == ((bc) this).field_b) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (0 <= var12) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((long)var12 <= ((bc) this).field_l.a(true) / 520L) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = null;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var3
                            stackOut_43_0 = (Object) (Object) stackIn_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return (byte[]) (Object) stackIn_44_0;
                    }
                    case 45: {
                        try {
                            var15 = var9 + var14;
                            var8++;
                            var5 = var12;
                            var16 = var14;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var16 >= var15) {
                                statePc = 18;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var7++;
                            var6[var7] = tn.field_db[var16];
                            var16++;
                            statePc = 46;
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
                        return (byte[]) (Object) stackIn_50_0;
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

    bc(int param0, ue param1, ue param2, int param3) {
        ((bc) this).field_c = 65000;
        ((bc) this).field_l = null;
        ((bc) this).field_g = null;
        ((bc) this).field_l = param1;
        ((bc) this).field_g = param2;
        ((bc) this).field_b = param0;
        ((bc) this).field_c = param3;
    }

    public static void b(int param0) {
        field_a = null;
        field_k = null;
        if (param0 != 1) {
            bc.b(11);
        }
        field_f = null;
        field_h = null;
        field_j = null;
        field_i = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invalid name";
        field_h = "Talons are of no use to ground units.";
        field_f = "Please wait";
        field_k = "Spectate <%0>'s game";
        field_i = "Unpacking graphics";
    }
}
