/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us extends gn {
    static String field_f;
    static String field_g;
    static int field_j;
    static int field_k;
    static int[] field_i;
    static int field_e;
    static String[] field_h;

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 < -69) {
                break L0;
              } else {
                field_g = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ck.field_d;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    final static void g(byte param0) {
        Object var1_ref2 = null;
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        String var3 = null;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        var1_ref2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == et.field_d) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        kb.h(-92);
                        if (-1 != (mc.field_a ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var1_ref2 = null;
                        var2 = je.a(false);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var2 ^ -1) != 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_ref = rr.field_g[var2];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 <= -75) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        ul.a((byte) -126, var1_ref);
                        if (-1 == var2) {
                            statePc = 41;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = dd.field_f;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((stackIn_14_0 ^ -1) > -61) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = ep.field_c[var2];
                        var4 = pb.field_C.b(var3, mc.field_a + -44);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (dd.field_f > 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6 = 60;
                        var7 = dd.field_f;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var3.length() < 70) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6 = 10;
                        var7 = Math.max(0, var6 - (60 - var7));
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8 = (-var7 + var6) * var3.length() / var6;
                        var3_ref = var3.substring(0, var8);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var4 == 1) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = -3;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == (var4 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = 0;
                        stackIn_38_0 = stackOut_34_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 6;
                        stackIn_38_0 = stackOut_36_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = 16;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var5 = stackIn_38_0;
                        var3_ref = wj.a("</>", "</shad></col>", true, wj.a("<>", "<col=ffff00><shad=010101>", true, var3_ref));
                        int discarded$1 = pb.field_C.a(var3_ref, (-mc.field_a + 640 >> -1128845375) - -72, -10 + (var5 - -458) + -48, -44 + mc.field_a - 50, 48, 16777215, -1, 0, 0, 16);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var1, "us.C(" + param0 + 41);
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(byte param0) {
        try {
            field_h = null;
            field_f = null;
            field_g = null;
            field_i = null;
            int var1_int = 36 % ((-42 - param0) / 32);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "us.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Player Shop";
        field_f = "Loading sound effects";
        field_e = 50;
        field_h = new String[]{"Empty", "Increases POW by 2.", "Increases POW by 4.", "Increases POW by 7.", "Increases TCK by 2.", "Increases TCK by 4.", "Increases TCK by 7.", "Increases SPD by 2.", "Increases SPD by 4.", "Increases SPD by 7.", "Increases POW by 2.<br>Decreases TCK by 2.", "Increases POW by 4.<br>Decreases TCK by 2.", "Increases POW by 4.<br>Increases TCK by 2.", "Increases POW by 7.<br>Decreases TCK by 2.", "Increases POW by 7.<br>Increases TCK by 2.", "Increases POW by 7.<br>Increases TCK by 4.", "Increases POW by 2.<br>Decreases SPD by 2.", "Increases POW by 4.<br>Decreases SPD by 2.", "Increases POW by 4.<br>Increases SPD by 2.", "Increases POW by 7.<br>Decreases SPD by 2.", "Increases POW by 7.<br>Increases SPD by 2.", "Increases POW by 7.<br>Increases SPD by 4.", "Increases SPD by 2.<br>Decreases TCK by 2.", "Increases SPD by 4.<br>Decreases TCK by 2.", "Increases SPD by 4.<br>Increases TCK by 2.", "Increases SPD by 7.<br>Decreases TCK by 2.", "Increases SPD by 7.<br>Increases TCK by 2.", "Increases SPD by 7.<br>Increases TCK by 4.", "Increases SPD by 2.<br>Decreases POW by 2.", "Increases SPD by 4.<br>Decreases POW by 2.", "Increases SPD by 4.<br>Increases POW by 2.", "Increases SPD by 7.<br>Decreases POW by 2.", "Increases SPD by 7.<br>Increases POW by 2.", "Increases SPD by 7.<br>Increases POW by 4.", "Increases TCK by 2.<br>Decreases SPD by 2.", "Increases TCK by 4.<br>Decreases SPD by 2.", "Increases TCK by 4.<br>Increases SPD by 2.", "Increases TCK by 7.<br>Decreases SPD by 2.", "Increases TCK by 7.<br>Increases SPD by 2.", "Increases TCK by 7.<br>Increases SPD by 4.", "Increases TCK by 2.<br>Decreases POW by 2.", "Increases TCK by 4.<br>Decreases POW by 2.", "Increases TCK by 4.<br>Increases POW by 2.", "Increases TCK by 7.<br>Decreases POW by 2.", "Increases TCK by 7.<br>Increases POW by 2.", "Increases TCK by 7.<br>Increases POW by 4.", "Increases EXP gained by this player by 2%.", "Increases EXP gained by this player by 4%.", "Increases EXP gained by this player by 6%.", "Increases EXP gained by this player by 8%.", "Increases money won by your team at the end of a game by 1%.", "Increases money won by your team at the end of a game by 2%.", "Increases money won by your team at the end of a game by 3%.", "Increases money won by your team at the end of a game by 4%.", "Tackles will not affect players on the same team.", "This player is not affected by tackles from team-mates.", "All players on your team are unaffected by tackles from team-mates.", "Tackled players remain on the ground for two times longer than normal. Does not stack.", "Tackled players remain on the ground for three times longer than normal. Does not stack.", "This player can tackle like a Tank.", "This player can shoot like a Hotshot.", "This player can sprint-dash like a Ranger.", "This player can turn while sprint-dashing.", "Type 'WHEREAMI' in unrated games to activate cheat.", "Type 'MUSHROOM' in unrated games to activate cheat.", "Type 'MOONWALK' in unrated games to activate cheat.", "Type 'AIRPLANE' in unrated games to activate cheat.", "Type 'ATOMBALL' in unrated games to activate cheat.", "Type 'TRAMLINE' in unrated games to activate cheat.", "Type 'TORQUING' in unrated games to activate cheat.", "Type 'MOONBALL' in unrated games to activate cheat.", "Type 'ASTEROID' in unrated games to activate cheat.", "Type 'PUMPKINS' in unrated games to activate cheat.", "Only active between the 28th of October and the 11th of November."};
    }
}
