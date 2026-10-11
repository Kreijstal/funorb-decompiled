/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_b;
    static wd field_a;
    static boolean field_c;

    final static int a(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sb.field_d = sb.field_d + 65536;
                        if (param0 == 586) {
                            statePc = 4;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                stackIn_3_0 = -4;
                                statePc = 3;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    stackIn_6_0 = sb.field_d;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackIn_6_0 = sb.field_d;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (uf.a(stackIn_6_0, fl.field_V, 65535) < 65536) {
                            /* Inlined CFG state: 8. */
                            {
                                var2_int = -1;
                                if (null != f.field_d) {
                                    statePc = 12;
                                } else {
                                    statePc = 9;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 7. */
                            {
                                sb.field_d = sb.field_d - fl.field_V;
                                hj.field_c = hj.field_c + 1;
                                statePc = 5;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_6) {
                        statePc = ((Object) stateCaught_6 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_6);
                        }
                        caughtException = stateCaught_6;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (dc.field_s != null) {
                            /* Inlined CFG state: 11. */
                            {
                                var2_int = dc.field_s.length;
                                statePc = 13;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 10. */
                            {
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int = f.field_d.length;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        statePc = ((Object) stateCaught_12 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_12);
                        }
                        caughtException = stateCaught_12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 != var2_int) {
                            /* Inlined CFG state: 15. */
                            {
                                if (fl.field_u > od.field_j) {
                                    /* Inlined CFG state: 17. */
                                    {
                                        od.field_j = od.field_j + 1;
                                        if (fl.field_M >= od.field_j) {
                                            statePc = 22;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 18. */
                                            {
                                                if (null == f.field_d) {
                                                    statePc = 21;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 19. */
                                                    {
                                                        if (null != f.field_d[ej.field_c]) {
                                                            statePc = 22;
                                                        } else {
                                                            statePc = 20;
                                                        }
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 16. */
                                    {
                                        statePc = 26;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 14. */
                            {
                                statePc = 37;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        od.field_j = od.field_j - 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        statePc = ((Object) stateCaught_21 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_21);
                        }
                        caughtException = stateCaught_21;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (od.field_j < fl.field_u) {
                            statePc = 26;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 23. */
                            {
                                if (null == f.field_d[(1 + ej.field_c) % var2_int]) {
                                    /* Inlined CFG state: 25. */
                                    {
                                        od.field_j = od.field_j - 1;
                                        statePc = 26;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 24. */
                                    {
                                        statePc = 26;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_22) {
                        statePc = ((Object) stateCaught_22 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_22);
                        }
                        caughtException = stateCaught_22;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (fl.field_u <= od.field_j) {
                            /* Inlined CFG state: 28. */
                            {
                                ra.field_o = ej.field_c;
                                if (ei.field_j) {
                                    /* Inlined CFG state: 31. */
                                    {
                                        ej.field_c = ej.field_c + 1;
                                        if (ej.field_c < var2_int) {
                                            statePc = 33;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 32. */
                                            {
                                                ej.field_c = ej.field_c - var2_int;
                                                statePc = 33;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 29. */
                                    {
                                        ej.field_c = ej.field_c - 1;
                                        if (ej.field_c >= 0) {
                                            statePc = 33;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 30. */
                                            {
                                                ej.field_c = ej.field_c + var2_int;
                                                statePc = 33;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                statePc = 34;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        od.field_j = od.field_j - fl.field_u;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (fl.field_M < od.field_j) {
                            /* Inlined CFG state: 36. */
                            {
                                ei.field_j = true;
                                statePc = 37;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 35. */
                            {
                                statePc = 37;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_34) {
                        statePc = ((Object) stateCaught_34 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                        }
                        caughtException = stateCaught_34;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null != ra.field_p) {
                            /* Inlined CFG state: 39. */
                            {
                                var3 = 357 - ra.field_p.field_s / 2;
                                var4 = 0;
                                if (w.field_c == 0) {
                                    statePc = 51;
                                } else {
                                    statePc = 40;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 38. */
                            {
                                statePc = 62;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (dh.field_b <= var3) {
                            statePc = 51;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 41. */
                            {
                                if (var3 + ra.field_p.field_p > dh.field_b) {
                                    /* Inlined CFG state: 43. */
                                    {
                                        if (tf.field_e <= -ra.field_p.field_z + 269) {
                                            statePc = 47;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 44. */
                                            {
                                                if (tf.field_e < 269) {
                                                    /* Inlined CFG state: 46. */
                                                    {
                                                        od.field_j = fl.field_u;
                                                        var4 = 1;
                                                        ei.field_j = false;
                                                        statePc = 47;
                                                        continue stateLoop;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 45. */
                                                    {
                                                        statePc = 47;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 42. */
                                    {
                                        statePc = 51;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_40) {
                        statePc = ((Object) stateCaught_40 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_40);
                        }
                        caughtException = stateCaught_40;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (tf.field_e <= 586) {
                            statePc = 51;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 48. */
                            {
                                if (586 + ra.field_p.field_z > tf.field_e) {
                                    /* Inlined CFG state: 50. */
                                    {
                                        ei.field_j = true;
                                        var4 = 1;
                                        od.field_j = fl.field_u;
                                        statePc = 51;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 49. */
                                    {
                                        statePc = 51;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_47) {
                        statePc = ((Object) stateCaught_47 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_47);
                        }
                        caughtException = stateCaught_47;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var4 != 0) {
                            statePc = 62;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 52. */
                            {
                                if (fl.field_M >= od.field_j) {
                                    statePc = 62;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 53. */
                                    {
                                        if (fi.field_B <= var3) {
                                            statePc = 62;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 54. */
                                            {
                                                if (ra.field_p.field_p + var3 <= fi.field_B) {
                                                    statePc = 62;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 55. */
                                                    {
                                                        if (pg.field_n <= -ra.field_p.field_z + 269) {
                                                            statePc = 59;
                                                        } else {
                                                            statePc = 56;
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
                    } catch (Throwable stateCaught_51) {
                        statePc = ((Object) stateCaught_51 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_51);
                        }
                        caughtException = stateCaught_51;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (pg.field_n < 269) {
                            /* Inlined CFG state: 58. */
                            {
                                od.field_j = fl.field_M;
                                statePc = 59;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 57. */
                            {
                                statePc = 59;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_56) {
                        statePc = ((Object) stateCaught_56 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_56);
                        }
                        caughtException = stateCaught_56;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (586 >= pg.field_n) {
                            statePc = 62;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 60. */
                            {
                                if (ra.field_p.field_z + 586 <= pg.field_n) {
                                    statePc = 62;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 61. */
                                    {
                                        od.field_j = fl.field_M;
                                        statePc = 62;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_59) {
                        statePc = ((Object) stateCaught_59 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_59);
                        }
                        caughtException = stateCaught_59;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!param1) {
                            statePc = 85;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 63. */
                            {
                                jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 - 668, wc.a(29292, dh.field_b, tf.field_e));
                                if (!jj.field_d.b(param0 ^ -587)) {
                                    statePc = 71;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 64. */
                                    {
                                        if (jj.field_d.field_g != 0) {
                                            /* Inlined CFG state: 67. */
                                            {
                                                if (jj.field_d.field_g != 1) {
                                                    statePc = 71;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 68. */
                                                    {
                                                        stackIn_69_0 = 2;
                                                        statePc = 69;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        } else {
                                            /* Inlined CFG state: 65. */
                                            {
                                                stackIn_66_0 = 3;
                                                statePc = 66;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_62) {
                        statePc = ((Object) stateCaught_62 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_62);
                        }
                        caughtException = stateCaught_62;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return stackIn_66_0;
                }
                case 69: {
                    return stackIn_69_0;
                }
                case 71: {
                    try {
                        if (!ae.a(103)) {
                            statePc = 85;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 72. */
                            {
                                jj.field_d.a((byte) 11, 0);
                                if (!jj.field_d.b(-1)) {
                                    statePc = 81;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 73. */
                                    {
                                        if (jj.field_d.field_g == 0) {
                                            /* Inlined CFG state: 75. */
                                            {
                                                stackIn_76_0 = 3;
                                                statePc = 76;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 74. */
                                            {
                                                /* Sequential CFG blocks: 74, 77. */
                                                {
                                                }
                                                {
                                                    if (1 == jj.field_d.field_g) {
                                                        /* Inlined CFG state: 79. */
                                                        {
                                                            stackIn_80_0 = 1;
                                                            statePc = 80;
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 78. */
                                                        {
                                                            statePc = 81;
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
                    } catch (Throwable stateCaught_71) {
                        statePc = ((Object) stateCaught_71 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_71);
                        }
                        caughtException = stateCaught_71;
                        continue stateLoop;
                    }
                }
                case 76: {
                    return stackIn_76_0;
                }
                case 80: {
                    return stackIn_80_0;
                }
                case 81: {
                    try {
                        if (13 == vk.field_r) {
                            /* Inlined CFG state: 83. */
                            {
                                stackIn_84_0 = 1;
                                statePc = 84;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 82. */
                            {
                                statePc = 71;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_81) {
                        statePc = ((Object) stateCaught_81 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_81);
                        }
                        caughtException = stateCaught_81;
                        continue stateLoop;
                    }
                }
                case 84: {
                    return stackIn_84_0;
                }
                case 85: {
                    try {
                        stackIn_86_0 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        statePc = ((Object) stateCaught_85 instanceof RuntimeException ? 87 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_85);
                        }
                        caughtException = stateCaught_85;
                        continue stateLoop;
                    }
                }
                case 86: {
                    return stackIn_86_0;
                }
                case 87: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw bd.a((Throwable) ((Object) var2), "kd.A(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != 24188) {
          kd.a(58, false);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Please check if address is correct";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
