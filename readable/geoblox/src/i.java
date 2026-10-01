/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static Sprite avatarMaskRaster;

    public static void a(boolean param0) {
        try {
            avatarMaskRaster = null;
            if (param0) {
                avatarMaskRaster = (Sprite) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "i.A(" + param0 + ')');
        }
    }

    final static GameplayEntity a(byte param0) {
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        Object var2 = null;
        GameplayEntity var3 = null;
        float var4 = 0.0f;
        int var5 = 0;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var1_float = 1.401298464324817e-45f;
            var2 = null;
            var3 = (GameplayEntity) ((Object) a.attachedEntities.lastForIteration(false));
            if (param0 >= -127) {
              i.a(false);
            }
            L2: while (null != var3) {
              var4 = (-240.0f + var3.positionY) * (-240.0f + var3.positionY) + (-320.0f + var3.positionX) * (var3.positionX - 320.0f);
              if (var1_float < var4) {
                var1_float = var4;
                var2 = var3;
              }
              var3 = (GameplayEntity) ((Object) a.attachedEntities.previousForIteration(0));
              if (var5 == 0) {
                continue L2;
              }
              break;
            }
            stackIn_11_0 = var2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "i.D(" + param0 + ')');
        }
        return (GameplayEntity) ((Object) stackIn_11_0);
    }

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            sh.field_y.a(param3, var4, param0, 0);
            var5 = 56 % ((-32 - param1) / 59);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var4_ref2);

          stackIn_7_1 = new StringBuilder().append("i.C(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, byte param1, nf param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        boolean stackOut_10_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = hj.a((byte) 58, (param3 + -param0) * 3);
                        var6 = param0 * 3;
                        var7 = var5_int + -10;
                        oe.l(0);
                        if (param2.field_v <= 0) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != param2.field_n) {
                            /* Inlined CFG state: 7. */
                            {
                                ma.a((byte) -35);
                                statePc = 8;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 3. */
                            {
                                /* Sequential CFG blocks: 3, 5. */
                                {
                                }
                                {
                                    statePc = 8;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ch.field_b = 0;
                        var8 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var8 >= param2.field_f) {
                            statePc = 48;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 10. */
                            {
                                var9 = param2.field_r[var8];
                                var10 = param2.field_B[var8];
                                var11 = param2.field_c[var8];
                                stackOut_10_0 = param4;
                                stackIn_49_0 = stackOut_10_0 ? 1 : 0;
                                stackIn_11_0 = stackOut_10_0;
                                if (var19 != 0) {
                                    statePc = 49;
                                } else {
                                    statePc = 11;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 15;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                /* Sequential CFG blocks: 12, 14. */
                                {
                                }
                                {
                                    var12 = sh.field_x[var9];
                                    var13 = dj.field_N[var9];
                                    var14 = sh.field_x[var10] + -var12;
                                    var15 = sh.field_x[var11] - var12;
                                    var16 = dj.field_N[var10] + -var13;
                                    var17 = -var13 + dj.field_N[var11];
                                    if (-(var16 * var15) + var14 * var17 >= 0) {
                                        statePc = 47;
                                    } else {
                                        statePc = 15;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = bj.field_j[var9];
                        if (-2147483648 != var12) {
                            statePc = 19;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 16. */
                            {
                                if (var19 == 0) {
                                    statePc = 47;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 17. */
                                    {
                                        statePc = 19;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = bj.field_j[var10];
                        if (-2147483648 != var13) {
                            statePc = 23;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 20. */
                            {
                                if (var19 == 0) {
                                    statePc = 47;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 21. */
                                    {
                                        statePc = 23;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = bj.field_j[var11];
                        if (2147483647 == (var14 ^ -1)) {
                            statePc = 47;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 24. */
                            {
                                var15 = var13 + (var12 - -var14 + -var6);
                                if (var7 < 0) {
                                    /* Inlined CFG state: 27. */
                                    {
                                        stackIn_28_0 = var15 << -var7;
                                        statePc = 28;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 25. */
                                    {
                                        stackIn_28_0 = var15 >> var7;
                                        statePc = 28;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16 = -stackIn_28_0 + (-1 + ch.field_d.length);
                        var17 = ch.field_d[var16];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var17 >> -961128636 == 0) {
                            statePc = 38;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 30. */
                            {
                                var16--;
                                stackIn_39_0 = var16;
                                stackIn_31_0 = stackIn_39_0;
                                if (var19 != 0) {
                                    statePc = 39;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 31. */
                                    {
                                        if (stackIn_31_0 >= 0) {
                                            statePc = 37;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 32. */
                                            {
                                                /* Sequential CFG blocks: 32, 34. */
                                                {
                                                }
                                                {
                                                    System.err.println("Out of range!");
                                                    if (var19 == 0) {
                                                        statePc = 47;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 35. */
                                                        {
                                                            statePc = 37;
                                                            continue stateLoop;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var17 = ch.field_d[var16];
                        if (var19 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = (var16 << 1208896516) + var17;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var18 = stackIn_39_0;
                        pj.field_i[var18] = var8;
                        ch.field_d[var16] = 1 + var17;
                        if (0 >= param2.field_v) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null != param2.field_n) {
                            /* Inlined CFG state: 45. */
                            {
                                dupTemp$0 = param2.field_n[var8];
                                uh.field_x[dupTemp$0] = uh.field_x[dupTemp$0] + 1;
                                statePc = 46;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 41. */
                            {
                                /* Sequential CFG blocks: 41, 43. */
                                {
                                }
                                {
                                    statePc = 46;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ch.field_b = ch.field_b + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = -1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 <= (param2.field_v ^ -1)) {
                            statePc = 61;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 50. */
                            {
                                if (null != param2.field_n) {
                                    /* Inlined CFG state: 55. */
                                    {
                                        var8 = 0;
                                        var9 = 0;
                                        statePc = 56;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 51. */
                                    {
                                        /* Sequential CFG blocks: 51, 53. */
                                        {
                                        }
                                        {
                                            statePc = 61;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (uh.field_x.length <= var9) {
                            statePc = 61;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 57. */
                            {
                                var10 = uh.field_x[var9];
                                uh.field_x[var9] = var8;
                                var8 = var8 + var10;
                                var9++;
                                if (var19 != 0) {
                                    statePc = 70;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 58. */
                                    {
                                        if (var19 == 0) {
                                            statePc = 56;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 59. */
                                            {
                                                statePc = 61;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param1 == 22) {
                            statePc = 70;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 62. */
                            {
                                avatarMaskRaster = (Sprite) null;
                                statePc = 70;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_68_0 = (RuntimeException) (var5);
                    stackIn_66_0 = stackIn_68_0;
                    stackIn_68_1 = new StringBuilder().append("i.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_66_1 = stackIn_68_1;
                    if (param2 == null) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_69_2 = "{...}";
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_69_2 = "null";
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    throw t.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
