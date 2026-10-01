/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends hf {
    int field_l;
    int field_j;
    static boolean field_m;
    int field_h;
    static ue field_i;
    static int[] field_o;
    int field_g;
    int field_n;
    static int field_k;
    int field_f;

    final static void a(int[] param0, int[] param1, nf param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param0[3] >> 1604177954;
                        var22 = param0[4] >> -601843294;
                        var23 = param0[5] >> 1561916130;
                        var24 = param0[6] >> 1828652418;
                        var25 = param0[7] >> 1034390082;
                        var26 = param0[8] >> 1374033378;
                        var27 = param0[9] >> -300988766;
                        var28 = param0[10] >> 1540449442;
                        var13 = var25 * param1[4] + (param1[3] * var24 + var26 * param1[5]) >> 189687758;
                        var29 = param0[11] >> -813805182;
                        var12 = param1[3] * var21 + var22 * param1[4] + var23 * param1[5] >> 831938606;
                        var18 = param1[11] * var23 + (param1[10] * var22 + param1[9] * var21) >> -332276338;
                        var15 = param1[6] * var21 - (-(param1[7] * var22) - param1[8] * var23) >> -1094580338;
                        var16 = var25 * param1[7] + (var24 * param1[6] - -(var26 * param1[8])) >> -1328139538;
                        var14 = var29 * param1[5] + param1[3] * var27 - -(param1[4] * var28) >> -621399346;
                        var19 = param1[10] * var25 + var24 * param1[9] - -(param1[11] * var26) >> 1136247918;
                        var20 = var27 * param1[9] + var28 * param1[10] + param1[11] * var29 >> 567641038;
                        var17 = param1[8] * var29 + param1[6] * var27 + var28 * param1[7] >> -1243864626;
                        var21 = param1[0] - param0[0];
                        var22 = -param0[1] + param1[1];
                        var23 = param1[2] + -param0[2];
                        var9 = param0[3] * var21 - (-(var22 * param0[4]) - param0[5] * var23) >> -ok.field_g + 16;
                        var10 = var23 * param0[8] + (var21 * param0[6] + var22 * param0[7]) >> 16 - ok.field_g;
                        var11 = param0[11] * var23 + var21 * param0[9] - -(var22 * param0[10]) >> -733721424;
                        if (param3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        p.b(-2);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var21 = mh.field_d;
                        var22 = mh.field_i;
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2.field_o <= var23) {
                            statePc = 26;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 6. */
                            {
                                var24 = param2.field_O[var23];
                                var25 = param2.field_q[var23];
                                var26 = param2.field_K[var23];
                                var27 = (var24 * var12 + var25 * var15 - -(var18 * var26) >> -ok.field_g + 16) + var9;
                                var28 = var10 + (var13 * var24 + var25 * var16 + var26 * var19 >> 16 - ok.field_g);
                                var29 = var11 + (var26 * var20 + var14 * var24 + var17 * var25 >> -405245680);
                                stackIn_66_0 = -51;
                                stackIn_7_0 = stackIn_66_0;
                                stackIn_66_1 = var29 ^ -1;
                                stackIn_7_1 = stackIn_66_1;
                                if (var30 != 0) {
                                    statePc = 66;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 7. */
                                    {
                                        if (stackIn_7_0 < stackIn_7_1) {
                                            statePc = 19;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 8. */
                                            {
                                                /* Sequential CFG blocks: 8, 10. */
                                                {
                                                }
                                                {
                                                    sh.field_x[var23] = var27 / var29 + var21;
                                                    dj.field_N[var23] = var22 - -(var28 / var29);
                                                    if ((var29 ^ -1) <= (var7_int ^ -1)) {
                                                        statePc = 14;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 11. */
                                                        {
                                                            /* Sequential CFG blocks: 11, 13. */
                                                            {
                                                            }
                                                            {
                                                                var7_int = var29;
                                                                statePc = 14;
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
                        }
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 < var29) {
                            /* Inlined CFG state: 17. */
                            {
                                var8 = var29;
                                statePc = 18;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 15. */
                            {
                                statePc = 18;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        bj.field_j[var23] = var29;
                        if (var30 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        bj.field_j[var23] = -2147483648;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param4) {
                            /* Inlined CFG state: 24. */
                            {
                                a.field_c[var23] = var27 >> ok.field_g;
                                uk.field_i[var23] = var28 >> ok.field_g;
                                gf.field_b[var23] = var29;
                                statePc = 25;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 22. */
                            {
                                statePc = 25;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null == param2.field_L) {
                            statePc = 57;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                if (param2.field_d == null) {
                                    statePc = 57;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 28. */
                                    {
                                        /* Sequential CFG blocks: 28, 30. */
                                        {
                                        }
                                        {
                                            if (param2.field_C == null) {
                                                statePc = 57;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 31. */
                                                {
                                                    /* Sequential CFG blocks: 31, 33. */
                                                    {
                                                    }
                                                    {
                                                        if (param2.field_x == null) {
                                                            statePc = 57;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 34. */
                                                            {
                                                                /* Sequential CFG blocks: 34, 36. */
                                                                {
                                                                }
                                                                {
                                                                    if (null == param2.field_a) {
                                                                        statePc = 57;
                                                                    } else {
                                                                        statePc = 37;
                                                                    }
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
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        /* Sequential CFG blocks: 37, 39. */
                        {
                        }
                        {
                            if (param2.field_y == null) {
                                statePc = 57;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 40. */
                                {
                                    /* Sequential CFG blocks: 40, 42. */
                                    {
                                    }
                                    {
                                        if (param2.field_l == null) {
                                            statePc = 57;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 43. */
                                            {
                                                /* Sequential CFG blocks: 43, 45. */
                                                {
                                                }
                                                {
                                                    if (null == param2.field_p) {
                                                        statePc = 57;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 46. */
                                                        {
                                                            /* Sequential CFG blocks: 46, 48. */
                                                            {
                                                            }
                                                            {
                                                                if (param2.field_b == null) {
                                                                    statePc = 57;
                                                                    continue stateLoop;
                                                                } else {
                                                                    /* Inlined CFG state: 49. */
                                                                    {
                                                                        /* Sequential CFG blocks: 49, 51. */
                                                                        {
                                                                        }
                                                                        {
                                                                            var23 = 0;
                                                                            statePc = 52;
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
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((var23 ^ -1) <= (param2.field_f ^ -1)) {
                            statePc = 57;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 53. */
                            {
                                var24 = param2.field_L[var23];
                                var25 = param2.field_d[var23];
                                var26 = param2.field_C[var23];
                                ii.field_d[var23] = (var12 * var24 - (-(var15 * var25) - var18 * var26) >> -1375996560) + var9;
                                pg.field_d[var23] = var10 - -(var26 * var19 + var16 * var25 + var24 * var13 >> -1919419088);
                                kf.field_a[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> -221692912) + var11;
                                var24 = param2.field_x[var23];
                                var25 = param2.field_a[var23];
                                var26 = param2.field_y[var23];
                                qf.field_Y[var23] = (var15 * var25 + var12 * var24 + var26 * var18 >> 1214427504) + var9;
                                ac.field_w[var23] = var10 + (var19 * var26 + var25 * var16 + var13 * var24 >> -1193027216);
                                vk.field_c[var23] = (var26 * var20 + var24 * var14 + var17 * var25 >> 310379984) + var11;
                                var24 = param2.field_l[var23];
                                var25 = param2.field_p[var23];
                                var26 = param2.field_b[var23];
                                qe.field_c[var23] = (var25 * var15 + (var12 * var24 + var26 * var18) >> 354874064) + var9;
                                ba.field_h[var23] = var10 - -(var24 * var13 + (var16 * var25 + var19 * var26) >> 37747088);
                                hg.field_c[var23] = var11 + (var26 * var20 + var25 * var17 + var14 * var24 >> -990149552);
                                var23++;
                                if (var30 != 0) {
                                    statePc = 81;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 54. */
                                    {
                                        if (var30 == 0) {
                                            statePc = 52;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 55. */
                                            {
                                                statePc = 57;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (!param6) {
                            statePc = 65;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 58. */
                            {
                                var9 = param1[3];
                                var10 = param1[4];
                                var11 = param1[5];
                                var12 = param1[6];
                                var13 = param1[7];
                                var14 = param1[8];
                                var15 = param1[9];
                                var16 = param1[10];
                                var17 = param1[11];
                                var18 = 0;
                                statePc = 59;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((param2.field_m ^ -1) >= (var18 ^ -1)) {
                            statePc = 65;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 60. */
                            {
                                stackIn_66_0 = ok.field_h.length;
                                stackIn_61_0 = stackIn_66_0;
                                stackIn_66_1 = var18;
                                stackIn_61_1 = stackIn_66_1;
                                if (var30 != 0) {
                                    statePc = 66;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 61. */
                                    {
                                        if (stackIn_61_0 <= stackIn_61_1) {
                                            statePc = 65;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 62. */
                                            {
                                                /* Sequential CFG blocks: 62, 64. */
                                                {
                                                }
                                                {
                                                    var19 = param2.field_M[var18];
                                                    var20 = param2.field_t[var18];
                                                    var21 = param2.field_i[var18];
                                                    ok.field_h[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> -1454237424;
                                                    oa.field_f[var18] = var16 * var21 + (var19 * var10 - -(var20 * var13)) >> 1561811952;
                                                    gi.field_b[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> -765753584;
                                                    var18++;
                                                    if (var30 == 0) {
                                                        statePc = 59;
                                                    } else {
                                                        statePc = 65;
                                                    }
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = var7_int;
                        stackIn_66_1 = 22;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        i.a(stackIn_66_0, (byte) stackIn_66_1, param2, var8, param5);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_71_0 = (RuntimeException) (var7);
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_71_1 = new StringBuilder().append("p.B(");
                    stackIn_69_1 = stackIn_71_1;
                    if (param0 == null) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_72_2 = "{...}";
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_72_2 = "null";
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_0 = stackIn_75_0;
                    stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
                    stackIn_73_1 = stackIn_75_1;
                    if (param1 == null) {
                        /* Inlined CFG state: 75. */
                        {
                            stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
                            stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
                            stackIn_76_2 = "null";
                            statePc = 76;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 73. */
                        {
                            stackIn_76_0 = (RuntimeException) ((Object) stackIn_73_0);
                            stackIn_76_1 = (StringBuilder) ((Object) stackIn_73_1);
                            stackIn_76_2 = "{...}";
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_0 = stackIn_79_0;
                    stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');
                    stackIn_77_1 = stackIn_79_1;
                    if (param2 == null) {
                        /* Inlined CFG state: 79. */
                        {
                            stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
                            stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
                            stackIn_80_2 = "null";
                            statePc = 80;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 77. */
                        {
                            stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                            stackIn_80_1 = (StringBuilder) ((Object) stackIn_77_1);
                            stackIn_80_2 = "{...}";
                            statePc = 80;
                            continue stateLoop;
                        }
                    }
                }
                case 80: {
                    throw t.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -21) {
            field_k = 120;
          }
          field_o = null;
          field_i = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "p.A(" + param0 + ')');
        }
    }

    p(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            this.field_f = param2;
            this.field_g = param3;
            this.field_n = param5;
            this.field_j = param4;
            this.field_h = param1;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "p.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_i = (ue) null;
          }
          var2 = fh.a(rh.a(param0, -48), -78);
          if (null == var2) {
            var2 = "";
          }
          stackIn_6_0 = (String) (var2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var2_ref);

          stackIn_10_1 = new StringBuilder().append("p.C(");

          if (param0 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    static {
    }
}
