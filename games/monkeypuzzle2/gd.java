/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String field_a;

    public static void a(int param0) {
        int var1 = 112 / ((param0 - 69) / 54);
        field_a = null;
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != hj.field_D) {
              try {
                L0: {
                  hj.field_D.a((byte) 89, 0L);
                  hj.field_D.a(MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h, (byte) 34, 24);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                if (param0 != -594181854) {
                  gd.b(-122);
                  return;
                } else {
                  return;
                }
              }
              L1: {
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                if (param0 == -594181854) {
                  break L1;
                } else {
                  gd.b(-122);
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                if (param0 == -594181854) {
                  break L2;
                } else {
                  gd.b(-122);
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bk var4_ref_bk = null;
        int var4 = 0;
        int var5_int = 0;
        wf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hb var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 8) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var10 = MonkeyPuzzle2.field_D;
                        var2 = var10.a((byte) 114);
                        var3 = var10.a((byte) 114);
                        if (0 != var2) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_ref_bk = (bk) ((Object) wg.field_k.a((byte) -117));
                        if (var4_ref_bk == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        gk.a(-1);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_int = -var10.field_h + rc.field_f;
                        var12 = var4_ref_bk.field_g;
                        var11 = var12;
                        var6 = var11;
                        if (var12.length << -150891774 < var5_int) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = var12.length << -594181854;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5_int <= var7) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6[var7 >> -2053077342] = var6[var7 >> -2053077342] + (var10.a((byte) 114) << ch.a(var7 << 613902696, 768));
                        var7++;
                        if (var8 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_ref_bk.c(-19822);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (1 != var2) {
                            statePc = 32;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = var10.h(-129);
                        var5 = (wf) ((Object) k.field_l.a((byte) -117));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var5 == null) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_29_0 = var5.field_e;
                        stackIn_22_0 = stackIn_29_0;
                        if (var8 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != var3) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5.field_f != var4) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5 = (wf) ((Object) k.field_l.d((byte) 63));
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var5 != null) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = -1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        gk.a(stackIn_29_0);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return;
                }
                case 31: {
                    try {
                        var5.c(param0 + -19830);
                        if (var8 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        kk.a("LR1: " + bh.a((byte) -128), (byte) 118, (Throwable) null);
                        gk.a(-1);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "gd.A(" + param0 + ')');
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = "Unpacking graphics";
    }
}
