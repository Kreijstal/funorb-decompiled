/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static sa field_a;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = ah.a(var4, param0, (byte) 56).getFile();
              eo.a(param0, new Object[]{"home", var3 + "home.ws"}, false, "updatelinks");
              eo.a(param0, new Object[]{"gamelist", var3 + "togamelist.ws"}, false, "updatelinks");
              if (param1 != 49) {
                return;
              }
              eo.a(param0, new Object[]{"serverlist", var3 + "toserverlist.ws"}, false, "updatelinks");
              eo.a(param0, new Object[]{"options", var3 + "options.ws"}, false, "updatelinks");
              eo.a(param0, new Object[]{"terms", var3 + "terms.ws"}, false, "updatelinks");
              eo.a(param0, new Object[]{"privacy", var3 + "privacy.ws"}, false, "updatelinks");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("bb.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -34) {
          ei var2 = (ei) null;
          bb.a(-19, (ei) null, -1.1091806888580322f, (ei) null, true, (byte) 52, (ei) null, (ei) null);
          return;
        }
    }

    final static ei a(int param0, ei param1, float param2, ei param3, boolean param4, byte param5, ei param6, ei param7) {
        ei stackIn_6_0 = null;
        ei stackIn_9_0 = null;
        ei stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        boolean stackIn_21_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_34_0 = false;
        boolean stackIn_35_0 = false;
        boolean stackIn_36_0 = false;
        int stackIn_36_1 = 0;
        int stackIn_40_0 = 0;
        ei stackIn_44_0 = null;
        ei stackIn_47_0 = null;
        ei stackIn_51_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var8 = null;
        ei var9 = null;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        ha var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        ei var16 = null;
        ei var17 = null;
        ei var18 = null;
        Object var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 < -39) {
                            statePc = 3;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                bb.a(-105);
                                statePc = 3;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var18 = new ei();
                        if (!param4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        statePc = ((Object) stateCaught_3 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_3);
                        }
                        caughtException = stateCaught_3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_6_0 = (ei) (param1);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        statePc = ((Object) stateCaught_4 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_4);
                        }
                        caughtException = stateCaught_4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = (ei) (param3);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var17 = stackIn_6_0;
                        var9 = var17;
                        if (!param4) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        statePc = ((Object) stateCaught_6 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_6);
                        }
                        caughtException = stateCaught_6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_9_0 = (ei) (param6);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = (ei) (param7);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var16 = stackIn_9_0;
                        var10 = var16;
                        var11 = param4 ? 1 : 0;
                        var12 = param4 ? 1 : 0;
                        if (var16.field_e == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0 >= 0) {
                            /* Inlined CFG state: 13. */
                            {
                                fc.a(2, (float)var17.field_e, param2, var17, var18);
                                statePc = 14;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                fc.a(2, 0.0f, param2, var17, var18);
                                statePc = 14;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = (ei) (var18);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    stackIn_18_0 = var10;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackIn_18_0 = (ei) (var19);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        statePc = ((Object) stateCaught_17 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_17);
                        }
                        caughtException = stateCaught_17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (((ei) (stackIn_18_0)).field_e <= param0) {
                            /* Inlined CFG state: 20. */
                            {
                                fc.a(2, (float)var9.field_e, param2, var9, var18);
                                param2 = 0.0f;
                                stackIn_22_0 = param4;
                                stackIn_21_0 = stackIn_22_0;
                                if (var11 != 0) {
                                    /* Inlined CFG state: 22. */
                                    {
                                        stackIn_23_0 = stackIn_22_0;
                                        stackIn_23_1 = 0;
                                        statePc = 23;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 21. */
                                    {
                                        stackIn_23_0 = stackIn_21_0;
                                        stackIn_23_1 = 1;
                                        statePc = 23;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 19. */
                            {
                                statePc = 25;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_18) {
                        statePc = ((Object) stateCaught_18 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_18);
                        }
                        caughtException = stateCaught_18;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((stackIn_23_0 ? 1 : 0) != stackIn_23_1) {
                            statePc = 50;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 24. */
                            {
                                kj.field_r = true;
                                param0 = param0 - ((ei) (var10)).field_e;
                                statePc = 25;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_23) {
                        statePc = ((Object) stateCaught_23 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_23);
                        }
                        caughtException = stateCaught_23;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 > param0) {
                            /* Inlined CFG state: 27. */
                            {
                                fc.a(2, 0.0f, param2, var9, var18);
                                param2 = (float)var9.field_e;
                                if (param4) {
                                    /* Inlined CFG state: 29. */
                                    {
                                        stackIn_30_0 = 0;
                                        statePc = 30;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 28. */
                                    {
                                        stackIn_30_0 = 1;
                                        statePc = 30;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 26. */
                            {
                                statePc = 32;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_25) {
                        statePc = ((Object) stateCaught_25 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_25);
                        }
                        caughtException = stateCaught_25;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 != var11) {
                            statePc = 50;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 31. */
                            {
                                kj.field_r = true;
                                param0 = param0 + ((ei) (var10)).field_e;
                                statePc = 32;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_30) {
                        statePc = ((Object) stateCaught_30 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_30);
                        }
                        caughtException = stateCaught_30;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var13 = (ha) (((ei) (var10)).field_b[param0]);
                        var14 = var13.field_m;
                        fc.a(2, var14, param2, var9, var18);
                        if (var13.field_l) {
                            statePc = 50;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_35_0 = var13.field_s.field_r;
                        stackIn_34_0 = stackIn_35_0;
                        if (param4) {
                            /* Inlined CFG state: 35. */
                            {
                                stackIn_36_0 = stackIn_35_0;
                                stackIn_36_1 = 0;
                                statePc = 36;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 34. */
                            {
                                stackIn_36_0 = stackIn_34_0;
                                stackIn_36_1 = 1;
                                statePc = 36;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((stackIn_36_0 ? 1 : 0) != stackIn_36_1) {
                            statePc = 41;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 37. */
                            {
                                if (var12 != 0) {
                                    /* Inlined CFG state: 39. */
                                    {
                                        stackIn_40_0 = 0;
                                        statePc = 40;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 38. */
                                    {
                                        stackIn_40_0 = 1;
                                        statePc = 40;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12 = stackIn_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        statePc = ((Object) stateCaught_40 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_40);
                        }
                        caughtException = stateCaught_40;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var13.field_l = true;
                        var13.field_s.field_l = true;
                        param4 = var13.field_s.field_r;
                        param2 = var13.field_s.field_m;
                        if (!param4) {
                            /* Inlined CFG state: 43. */
                            {
                                stackIn_44_0 = (ei) (param7);
                                statePc = 44;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 42. */
                            {
                                stackIn_44_0 = (ei) (param6);
                                statePc = 44;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_41) {
                        statePc = ((Object) stateCaught_41 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_41);
                        }
                        caughtException = stateCaught_41;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var19 = stackIn_44_0;
                        var10 = var19;
                        if (param4) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        statePc = ((Object) stateCaught_44 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_44);
                        }
                        caughtException = stateCaught_44;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_47_0 = (ei) (param3);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        statePc = ((Object) stateCaught_45 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_45);
                        }
                        caughtException = stateCaught_45;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = (ei) (param1);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        statePc = ((Object) stateCaught_46 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_46);
                        }
                        caughtException = stateCaught_46;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9 = stackIn_47_0;
                        param0 = var13.field_s.field_q;
                        if (var12 == 0) {
                            /* Inlined CFG state: 49. */
                            {
                                param0--;
                                statePc = 17;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 48. */
                            {
                                param0++;
                                statePc = 17;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_47) {
                        statePc = ((Object) stateCaught_47 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_47);
                        }
                        caughtException = stateCaught_47;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = (ei) (var18);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        statePc = ((Object) stateCaught_50 instanceof RuntimeException ? 52 : -1);
                        if (statePc == -1) {
                            throw bb.<RuntimeException>$cfr$sneakyThrow(stateCaught_50);
                        }
                        caughtException = stateCaught_50;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return stackIn_51_0;
                }
                case 52: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_54_0 = (RuntimeException) (var8);
                    stackIn_53_0 = stackIn_54_0;
                    stackIn_54_1 = new StringBuilder().append("bb.C(").append(param0).append(',');
                    stackIn_53_1 = stackIn_54_1;
                    if (param1 == null) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = stackIn_53_0;
                    stackIn_55_1 = stackIn_53_1;
                    stackIn_55_2 = "{...}";
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = stackIn_54_0;
                    stackIn_55_1 = stackIn_54_1;
                    stackIn_55_2 = "null";
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = stackIn_55_0;
                    stackIn_56_0 = stackIn_57_0;
                    stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param2).append(',');
                    stackIn_56_1 = stackIn_57_1;
                    if (param3 == null) {
                        /* Inlined CFG state: 57. */
                        {
                            stackIn_58_0 = stackIn_57_0;
                            stackIn_58_1 = stackIn_57_1;
                            stackIn_58_2 = "null";
                            statePc = 58;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 56. */
                        {
                            stackIn_58_0 = stackIn_56_0;
                            stackIn_58_1 = stackIn_56_1;
                            stackIn_58_2 = "{...}";
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                }
                case 58: {
                    stackIn_60_0 = stackIn_58_0;
                    stackIn_59_0 = stackIn_60_0;
                    stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_59_1 = stackIn_60_1;
                    if (param6 == null) {
                        /* Inlined CFG state: 60. */
                        {
                            stackIn_61_0 = stackIn_60_0;
                            stackIn_61_1 = stackIn_60_1;
                            stackIn_61_2 = "null";
                            statePc = 61;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 59. */
                        {
                            stackIn_61_0 = stackIn_59_0;
                            stackIn_61_1 = stackIn_59_1;
                            stackIn_61_2 = "{...}";
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                }
                case 61: {
                    stackIn_63_0 = stackIn_61_0;
                    stackIn_62_0 = stackIn_63_0;
                    stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
                    stackIn_62_1 = stackIn_63_1;
                    if (param7 == null) {
                        /* Inlined CFG state: 63. */
                        {
                            stackIn_64_0 = stackIn_63_0;
                            stackIn_64_1 = stackIn_63_1;
                            stackIn_64_2 = "null";
                            statePc = 64;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 62. */
                        {
                            stackIn_64_0 = stackIn_62_0;
                            stackIn_64_1 = stackIn_62_1;
                            stackIn_64_2 = "{...}";
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                }
                case 64: {
                    throw kk.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized static long b(int param0) {
        long var1 = 0L;
        long var1Lifetime1;
        if (param0 != -1) {
          ei var3 = (ei) null;
          bb.a(112, (ei) null, -1.1291340589523315f, (ei) null, true, (byte) 49, (ei) null, (ei) null);
          var1 = System.currentTimeMillis();
          if (ka.field_c > var1) {
            dg.field_d = dg.field_d + (-var1 + ka.field_c);
            ka.field_c = var1;
            return var1 + dg.field_d;
          }
          ka.field_c = var1;
          return var1 + dg.field_d;
        }
        var1Lifetime1 = System.currentTimeMillis();
        if (ka.field_c <= var1Lifetime1) {
          ka.field_c = var1Lifetime1;
          return var1Lifetime1 + dg.field_d;
        }
        dg.field_d = dg.field_d + (-var1Lifetime1 + ka.field_c);
        ka.field_c = var1Lifetime1;
        return var1Lifetime1 + dg.field_d;
    }

    final static hj[] a(int param0, byte param1) {
        hj[] var4 = new hj[9];
        hj[] var2 = var4;
        var4[4] = mk.a(param0, -61, 64);
        int var3 = -88 % ((-70 - param1) / 56);
        return var2;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
