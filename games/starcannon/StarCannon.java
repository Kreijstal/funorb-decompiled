/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class StarCannon extends ag {
    private int field_D;
    static int[] field_y;
    static String field_C;
    static int field_z;
    private int field_B;
    static char field_E;
    public static int field_A;

    private final void t(int param0) {
        if (null != fb.field_g) {
          vb.a(fb.field_g, 30962);
          fb.field_g = null;
          tc.j(param0 ^ -23491);
        }
        lj.field_h = b.a(false, 1);
        nd.field_p = b.a(false, 2);
        if (param0 != -23523) {
          return;
        }
        se.field_l = b.a(false, 3);
        jg.field_F = b.a(false, 4);
        cb.field_c = b.a(false, 5);
        ej.a(fi.field_f, lf.field_eb, param0 + 23396);
    }

    private final void b(int param0, int param1) {
        id dupTemp$2 = null;
        id dupTemp$3 = null;
        d stackIn_3_0 = null;
        d stackIn_14_0 = null;
        Object stackIn_27_0 = null;
        d stackIn_27_1 = null;
        d stackIn_37_0 = null;
        Object stackIn_48_0 = null;
        d stackIn_48_1 = null;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        d stackIn_147_0 = null;
        Object stackIn_152_0 = null;
        d stackIn_152_1 = null;
        d stackIn_158_0 = null;
        Object stackIn_163_0 = null;
        d stackIn_163_1 = null;
        int statePc = 0;
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        id[] var10_ref_id__ = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        id[] var14 = null;
        bf var15 = null;
        String var16 = null;
        String var17 = null;
        int[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = field_A;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 >= 4000) {
                        /* Inlined CFG state: 8. */
                        {
                            param0 = 100 - param0 >> 2;
                            if (qc.field_d < 1) {
                                /* Inlined CFG state: 11. */
                                {
                                    var3 = 0;
                                    statePc = 12;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 9. */
                                {
                                    fh.field_q.d(0, vd.field_j, 640, 480, 128);
                                    fh.field_q.d(0, -480 + vd.field_j, 640, 480, 128);
                                    statePc = 19;
                                    continue stateLoop;
                                }
                            }
                        }
                    } else {
                        /* Inlined CFG state: 2. */
                        {
                            stackIn_147_0 = qc.field_c[var3];
                            stackIn_3_0 = stackIn_147_0;
                            if (false) {
                                statePc = 147;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 3. */
                                {
                                    if (stackIn_3_0 == null) {
                                        statePc = 7;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 4. */
                                        {
                                            if (qc.field_c[var3].field_h == 4) {
                                                /* Inlined CFG state: 6. */
                                                {
                                                    qc.field_c[var3].a(320 - fi.field_e.field_f, 123);
                                                    statePc = 7;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                statePc = 7;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 7: {
                    var3++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 12: {
                    if (var3 >= 4000) {
                        statePc = 19;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 13. */
                        {
                            stackIn_147_0 = qc.field_c[var3];
                            stackIn_14_0 = stackIn_147_0;
                            if (false) {
                                statePc = 147;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 14. */
                                {
                                    if (stackIn_14_0 == null) {
                                        statePc = 18;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 15. */
                                        {
                                            if (qc.field_c[var3].field_h == 3) {
                                                /* Inlined CFG state: 17. */
                                                {
                                                    qc.field_c[var3].a(320 - fi.field_e.field_f, -91);
                                                    statePc = 18;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                statePc = 18;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 18: {
                    var3++;
                    statePc = 12;
                    continue stateLoop;
                }
                case 19: {
                    if (param1 == 7306) {
                        /* Inlined CFG state: 21. */
                        {
                            var15 = (bf) (kh.field_y.c(-3905));
                            statePc = 22;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 20. */
                        {
                            return;
                        }
                    }
                }
                case 22: {
                    if (var15 == null) {
                        /* Inlined CFG state: 24. */
                        {
                            var3 = 0;
                            statePc = 25;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 23. */
                        {
                            var15.a(65535, 320 - fi.field_e.field_f);
                            var15 = (bf) (kh.field_y.a(-16913));
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                }
                case 25: {
                    if (var3 >= 4000) {
                        /* Inlined CFG state: 34. */
                        {
                            var3 = 0;
                            statePc = 35;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 26. */
                        {
                            stackIn_163_0 = null;
                            stackIn_27_0 = stackIn_163_0;
                            stackIn_163_1 = qc.field_c[var3];
                            stackIn_27_1 = stackIn_163_1;
                            if (false) {
                                statePc = 163;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 27. */
                                {
                                    if (stackIn_27_0 == stackIn_27_1) {
                                        statePc = 33;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 28. */
                                        {
                                            if (qc.field_c[var3].field_h == 2) {
                                                statePc = 33;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 29. */
                                                {
                                                    if (qc.field_c[var3].field_h == 3) {
                                                        statePc = 33;
                                                    } else {
                                                        statePc = 30;
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
                case 30: {
                    if (qc.field_c[var3].field_h != 4) {
                        /* Inlined CFG state: 32. */
                        {
                            qc.field_c[var3].a(-fi.field_e.field_f + 320, 54);
                            statePc = 33;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var3++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 35: {
                    if (var3 >= 4000) {
                        /* Inlined CFG state: 42. */
                        {
                            if (qc.field_d == 2) {
                                /* Inlined CFG state: 44. */
                                {
                                    gi.a(param1 - 7302);
                                    statePc = 45;
                                    continue stateLoop;
                                }
                            } else {
                                statePc = 45;
                                continue stateLoop;
                            }
                        }
                    } else {
                        /* Inlined CFG state: 36. */
                        {
                            stackIn_147_0 = qc.field_c[var3];
                            stackIn_37_0 = stackIn_147_0;
                            if (false) {
                                statePc = 147;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 37. */
                                {
                                    if (stackIn_37_0 == null) {
                                        statePc = 41;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 38. */
                                        {
                                            if (qc.field_c[var3].field_h == 2) {
                                                /* Inlined CFG state: 40. */
                                                {
                                                    qc.field_c[var3].b(-fi.field_e.field_f + 320, 128);
                                                    qc.field_c[var3].a(-fi.field_e.field_f + 320, param1 ^ 7322);
                                                    statePc = 41;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                statePc = 41;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 41: {
                    var3++;
                    statePc = 35;
                    continue stateLoop;
                }
                case 45: {
                    var3 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var3 >= 4000) {
                        statePc = 53;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 47. */
                        {
                            /* Sequential CFG blocks: 47, 48. */
                            {
                                stackIn_48_0 = null;
                                stackIn_48_1 = qc.field_c[var3];
                            }
                            {
                                if (stackIn_48_0 == stackIn_48_1) {
                                    statePc = 52;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 49. */
                                    {
                                        if (2 == qc.field_c[var3].field_h) {
                                            /* Inlined CFG state: 51. */
                                            {
                                                qc.field_c[var3].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                                                qc.field_c[var3].a(320 - fi.field_e.field_f, -56);
                                                statePc = 52;
                                                continue stateLoop;
                                            }
                                        } else {
                                            statePc = 52;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 52: {
                    var3++;
                    statePc = 46;
                    continue stateLoop;
                }
                case 53: {
                    if (gj.field_c > -1) {
                        /* Inlined CFG state: 55. */
                        {
                            var3 = af.field_y.a(vk.field_w);
                            ba.a(24, gb.field_v, (byte) -127, -var3 + 604 - 17, 17 + var3, 455 + param0);
                            nb.a(param0 + 455, (byte) 122, var3 + 17, ma.field_e, -17 - var3 + 604, 128, 24);
                            af.field_y.c(vk.field_w, 596, 472 + param0, 16777215, -1);
                            ba.a(24, ma.field_a, (byte) 21, 604, 35, 455 + param0);
                            nb.a(455 + param0, (byte) 122, 35, ha.field_a, 604, 128, 24);
                            vb.field_l.e(609, param0 + 460);
                            af.field_y.a(Integer.toString(gj.field_c), 626, 472 + param0, 16777215, -1);
                            var4_ref_String = be.field_b;
                            var5 = 65535;
                            var6 = 32896;
                            if (qb.field_e != 1) {
                                statePc = 57;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 56. */
                                {
                                    var5 = 65280;
                                    var6 = 32768;
                                    var4_ref_String = b.field_d;
                                    statePc = 57;
                                    continue stateLoop;
                                }
                            }
                        }
                    } else {
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 57: {
                    if (qb.field_e == 2) {
                        /* Inlined CFG state: 59. */
                        {
                            var4_ref_String = ve.field_g;
                            var5 = 16776960;
                            var6 = 16711680;
                            statePc = 60;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    var7 = 6;
                    if (rj.field_h != 1) {
                        statePc = 62;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 61. */
                        {
                            var7 = 10;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                }
                case 62: {
                    if (rj.field_h == 2) {
                        /* Inlined CFG state: 64. */
                        {
                            var7 = 16;
                            statePc = 65;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    if (3 == rj.field_h) {
                        /* Inlined CFG state: 67. */
                        {
                            var7 = 17;
                            statePc = 68;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var3 = af.field_y.a(var4_ref_String);
                    ba.a(24, gb.field_v, (byte) -122, 1, var3 + 17, 455 + param0);
                    nb.a(param0 + 455, (byte) 122, var3 + 17, ma.field_e, 1, 128, 24);
                    af.field_y.a(var4_ref_String, 10, 472 + param0, 16777215, -1);
                    var8 = 23 + var3;
                    ba.a(24, ma.field_a, (byte) -115, var8 - 5, 10 + var7 * 5, param0 + 455);
                    nb.a(param0 + 455, (byte) 122, 10 + var7 * 5, ha.field_a, var8 - 5, 128, 24);
                    var9 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var7 <= var9) {
                        /* Inlined CFG state: 76. */
                        {
                            stackIn_77_0 = ~ie.field_C;
                            stackIn_77_1 = -1;
                            statePc = 77;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 70. */
                        {
                            stackIn_77_0 = ~var9;
                            stackIn_71_0 = stackIn_77_0;
                            stackIn_77_1 = ~sd.field_c;
                            stackIn_71_1 = stackIn_77_1;
                            if (false) {
                                statePc = 77;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 71. */
                                {
                                    if (stackIn_71_0 <= stackIn_71_1) {
                                        /* Inlined CFG state: 74. */
                                        {
                                            ki.d(var8, 465 + param0, 4, 4, var5);
                                            statePc = 75;
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 72. */
                                        {
                                            ki.d(var8, 460 + param0, 4, 14, var5);
                                            statePc = 75;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 75: {
                    var8 += 5;
                    var9++;
                    statePc = 69;
                    continue stateLoop;
                }
                case 77: {
                    if (stackIn_77_0 >= stackIn_77_1) {
                        statePc = 79;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 78. */
                        {
                            var9 = -(af.field_y.field_p / 2) + af.field_w[16 + qb.field_e].field_e - 16;
                            dupTemp$2 = af.field_w[qb.field_e + 16];
                            dupTemp$2.field_f = dupTemp$2.field_f + var9;
                            var16 = p.field_e;
                            var14 = new id[1];
                            var10_ref_id__ = var14;
                            var14[0] = af.field_w[16 + qb.field_e];
                            af.field_y.a(var10_ref_id__, (int[]) null);
                            af.field_y.a(var16, 319, 48, var6, -1, 256 - param0 * 10);
                            af.field_y.a(var16, 321, 48, var5, -1, -(param0 * 10) + 256);
                            af.field_y.a(var16, 320, 47, var5, -1, -(10 * param0) + 256);
                            af.field_y.a(var16, 320, 49, var6, -1, -(param0 * 10) + 256);
                            af.field_y.a(var16, 320, 48, 16777215, -1, -(param0 * 10) + 256);
                            dupTemp$3 = af.field_w[qb.field_e + 16];
                            dupTemp$3.field_f = dupTemp$3.field_f - var9;
                            statePc = 79;
                            continue stateLoop;
                        }
                    }
                }
                case 79: {
                    var9 = 10 * ia.field_k;
                    if (nf.field_l == 0) {
                        /* Inlined CFG state: 81. */
                        {
                            var9 = var9 >> 2;
                            statePc = 82;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    if (nf.field_l == 2) {
                        /* Inlined CFG state: 84. */
                        {
                            var9 = var9 << 1;
                            statePc = 85;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    if (!a.field_a) {
                        /* Inlined CFG state: 87. */
                        {
                            var3 = af.field_y.a(rd.field_o);
                            ba.a(24, gb.field_v, (byte) -118, -var3 + 311, 17 + var3, -param0 + 1);
                            nb.a(1 - param0, (byte) 122, var3 + 17, ma.field_e, 311 - var3, 128, 24);
                            af.field_y.c(rd.field_o, 320, -param0 + 18, 16777215, -1);
                            var17 = Integer.toString(var9);
                            var3 = 11 + af.field_y.a(var17);
                            var11 = 5 - var3 % 5;
                            if (var11 < 5) {
                                /* Inlined CFG state: 89. */
                                {
                                    var3 = var3 + var11;
                                    statePc = 90;
                                    continue stateLoop;
                                }
                            } else {
                                statePc = 90;
                                continue stateLoop;
                            }
                        }
                    } else {
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    ba.a(24, ma.field_a, (byte) -113, 328, var3, -param0 + 1);
                    nb.a(-param0 + 1, (byte) 122, var3, ha.field_a, 328, 128, 24);
                    af.field_y.a(var17, 333, -param0 + 18, 16777215, -1);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (ua.field_c >= -2) {
                        statePc = 116;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 92. */
                        {
                            if (gj.field_c != 0) {
                                statePc = 95;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 93. */
                                {
                                    if (fi.field_e.field_k != 0) {
                                        statePc = 95;
                                    } else {
                                        statePc = 116;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 95: {
                    var10_ref_String = "";
                    if (rj.field_h == 0) {
                        /* Inlined CFG state: 97. */
                        {
                            var10_ref_String = eg.field_i;
                            statePc = 98;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    if (rj.field_h == 1) {
                        /* Inlined CFG state: 100. */
                        {
                            var10_ref_String = ig.field_c;
                            statePc = 101;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 101: {
                    if (2 == rj.field_h) {
                        /* Inlined CFG state: 103. */
                        {
                            var10_ref_String = qc.field_a;
                            statePc = 104;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 104: {
                    if (3 != rj.field_h) {
                        statePc = 107;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 105. */
                        {
                            if (nf.field_l != 2) {
                                statePc = 107;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 106. */
                                {
                                    var10_ref_String = vf.field_a;
                                    statePc = 107;
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 107: {
                    if (rj.field_h != 4) {
                        statePc = 115;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 108. */
                        {
                            if (u.field_d <= 0) {
                                /* Inlined CFG state: 114. */
                                {
                                    var10_ref_String = bc.field_l + var9 + sb.field_o;
                                    statePc = 115;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 109. */
                                {
                                    if (nf.field_l == 0) {
                                        /* Inlined CFG state: 113. */
                                        {
                                            var10_ref_String = d.field_n + var9 + jf.field_b;
                                            statePc = 115;
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 110. */
                                        {
                                            if (1 == nf.field_l) {
                                                /* Inlined CFG state: 112. */
                                                {
                                                    var10_ref_String = d.field_n + var9 + eh.field_c;
                                                    statePc = 115;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                /* Inlined CFG state: 111. */
                                                {
                                                    var10_ref_String = jg.field_I + var9;
                                                    statePc = 115;
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
                case 115: {
                    af.field_y.a(var10_ref_String, 0, 0, 640, 480, 16777215, -1, -(10 * param0) + 256, 1, 1, af.field_y.field_p);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (tj.field_C > 0) {
                        /* Inlined CFG state: 118. */
                        {
                            var3 = 255 * dl.field_a / tj.field_C;
                            var4 = 0;
                            var5 = 0;
                            var6 = 0;
                            if (var3 >= 128) {
                                /* Inlined CFG state: 120. */
                                {
                                    var5 = 255;
                                    var4 = -(var3 * 2) + 256 + 255;
                                    statePc = 121;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 119. */
                                {
                                    var4 = 255;
                                    var5 = var3 * 2;
                                    statePc = 121;
                                    continue stateLoop;
                                }
                            }
                        }
                    } else {
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 121: {
                    var6 = (var4 << 16) + (var5 << 8);
                    var7 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var7 >= var3) {
                        /* Inlined CFG state: 131. */
                        {
                            af.field_y.a(s.field_h, 319, 38, 0, -1, var3);
                            af.field_y.a(s.field_h, 321, 38, 0, -1, var3);
                            af.field_y.a(s.field_h, 320, 37, 0, -1, var3);
                            af.field_y.a(s.field_h, 320, 39, 0, -1, var3);
                            af.field_y.a(s.field_h, 320, 38, 16777215, -1, var3);
                            statePc = 132;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 123. */
                        {
                            stackIn_133_0 = ~var7;
                            stackIn_124_0 = stackIn_133_0;
                            stackIn_133_1 = -11;
                            stackIn_124_1 = stackIn_133_1;
                            if (false) {
                                statePc = 133;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 124. */
                                {
                                    if (stackIn_124_0 > stackIn_124_1) {
                                        statePc = 129;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 125. */
                                        {
                                            if (var7 > -10 + var3) {
                                                statePc = 129;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 126. */
                                                {
                                                    if (10 != var7) {
                                                        statePc = 130;
                                                    } else {
                                                        statePc = 127;
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
                case 127: {
                    ki.d(-(var3 >> 1) + (320 + var7) - 5, 27, 10 + (var3 - 20), 11, var6);
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    ki.c(320 + (var7 - (var3 >> 1)), 32, 5, var6, 255 - Math.abs(var7 - (var3 >> 1)));
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var7++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_133_0 = 0;
                    stackIn_133_1 = fi.field_e.field_k;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0 != stackIn_133_1) {
                        statePc = 144;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 134. */
                        {
                            if (gj.field_c != 0) {
                                statePc = 144;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 135. */
                                {
                                    if (fi.field_e.field_r >= 25) {
                                        /* Inlined CFG state: 137. */
                                        {
                                            if (165 >= fi.field_e.field_r) {
                                                /* Inlined CFG state: 139. */
                                                {
                                                    var3 = 100;
                                                    statePc = 140;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                /* Inlined CFG state: 138. */
                                                {
                                                    var3 = 190 - fi.field_e.field_r << 2;
                                                    statePc = 140;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    } else {
                                        /* Inlined CFG state: 136. */
                                        {
                                            var3 = fi.field_e.field_r << 2;
                                            statePc = 140;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 140: {
                    var4 = a.field_b.a(ne.field_i);
                    var5 = -60 + (-var4 + 640) >> 1;
                    var6 = -var5 + 640;
                    var7 = var6 - var5;
                    var8 = 210;
                    var9 = 270;
                    var10 = var9 + var8 >> 1;
                    var9 = (var10 * (-var3 + 100) + var3 * var9) / 100;
                    var8 = (var8 * var3 + var10 * (100 - var3)) / 100;
                    var11 = var9 + (-var8 + 5);
                    if (var11 <= 0) {
                        statePc = 144;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 141. */
                        {
                            var21 = new int[4];
                            ki.a(var21);
                            ki.c(var5, var8, var5 + var7, var8 + var11);
                            ki.b(var5 + 19, 14 + var8, var7 - 38, -28 + var11, 0, 128);
                            ba.a(var11, rd.field_p, (byte) 115, var5, var7, var8);
                            sb.a(true, var7, 10596798, 0, var8, 16711680, var5, var11 >> 1);
                            sb.a(true, var7, 0, 10596798, (var11 >> 1) + var8, 16711680, var5, -(var11 >> 1) + var11);
                            ki.c(var5 + 19, var8 + 14, var7 + (var5 - 19), -14 + (var11 + var8));
                            a.field_b.b(ne.field_i, 320, (a.field_b.field_p - a.field_b.field_q >> 1) + 240, 16777215, -1);
                            ki.b(var21);
                            statePc = 144;
                            continue stateLoop;
                        }
                    }
                }
                case 144: {
                    return;
                }
                case 147: {
                    ((d) (Object) stackIn_147_0).a(320 - fi.field_e.field_f, -56);
                    statePc = 151;
                    continue stateLoop;
                }
                case 148: {
                    qc.field_c[var3].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                    stackIn_147_0 = qc.field_c[var3];
                    statePc = 147;
                    continue stateLoop;
                }
                case 149: {
                    if (2 == qc.field_c[var3].field_h) {
                        statePc = 148;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    /* Sequential CFG blocks: 151, 155. */
                    {
                        var3++;
                    }
                    {
                        if (var3 >= 4000) {
                            statePc = 53;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 154. */
                            {
                                stackIn_152_0 = null;
                                stackIn_152_1 = qc.field_c[var3];
                                statePc = 152;
                                continue stateLoop;
                            }
                        }
                    }
                }
                case 152: {
                    if (stackIn_152_0 == stackIn_152_1) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 158: {
                    ((d) (Object) stackIn_158_0).a(320 - fi.field_e.field_f, -56);
                    statePc = 162;
                    continue stateLoop;
                }
                case 159: {
                    qc.field_c[var3].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                    stackIn_158_0 = qc.field_c[var3];
                    statePc = 158;
                    continue stateLoop;
                }
                case 160: {
                    if (2 == qc.field_c[var3].field_h) {
                        statePc = 159;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    /* Sequential CFG blocks: 162, 166. */
                    {
                        var3++;
                    }
                    {
                        if (var3 >= 4000) {
                            statePc = 53;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 165. */
                            {
                                stackIn_163_0 = null;
                                stackIn_163_1 = qc.field_c[var3];
                                statePc = 163;
                                continue stateLoop;
                            }
                        }
                    }
                }
                case 163: {
                    if (stackIn_163_0 == stackIn_163_1) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        gj.field_c = gj.field_c + 1;
        dg.field_l = 0;
        mj.a(96, 12, 0, 23, 100);
        mj.a(255, 12, 1200, 45, 100);
        if (!param0) {
          this.q(-66);
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param0) {
          field_E = 'B';
        }
        if (param2) {
          var4++;
        }
        return el.field_A[var4];
    }

    final void n(int param0) {
        int var3;
        var3 = field_A;
        if (ha.field_c != 0) {
          if (ha.field_c == 1) {
            pf.field_d = pf.field_d + 1;
            dg.field_l = 0;
            ha.field_c = 2;
            mj.a(96, 12, 0, 31, 100);
            mj.a(255, 12, 1200, 36, 100);
          } else {
            if (1 < ha.field_c) {
              ha.field_c = ha.field_c + 1;
              pf.field_d = pf.field_d + 1;
              if (ha.field_c == 5) {
                li.a(-115, new bf(0, -128, -40, 14));
                li.a(-126, new bf(0, -128, 40, 14));
                if (hh.field_c == 1) {
                  ph.a(249, false, 6);
                }
              }
              dg.field_l = 0;
              mj.a(96, param0 + 12, 0, 31, 100);
              mj.a(255, 12, 1200, 36, 100);
            }
          }
        } else {
          pf.field_d = pf.field_d + 1;
          ha.field_c = 1;
          li.a(-119, new bf(0, -128, -24, 6));
          li.a(param0 ^ -124, new bf(0, -128, 24, 6));
          dg.field_l = 0;
          mj.a(96, 12, 0, 31, 100);
          mj.a(255, 12, 1200, 36, 100);
        }
        if (param0 != 0) {
          field_E = 'ﾌ';
        }
    }

    final void q(int param0) {
        int var3;
        ue var4;
        var3 = field_A;
        if (param0 != -19049) {
          var4 = (ue) null;
          StarCannon.a((ue) null, false, 0, (ue) null, (ue) null);
        }
        if (bf.field_w != 0) {
          if (bf.field_w != 1) {
            if (bf.field_w >= 4) {
              if (hh.field_c == 0) {
                hh.field_c = 1;
                li.a(param0 ^ 18960, new bf(0, -128, 0, 13));
                dg.field_l = 0;
                mj.a(96, 12, 0, 46, 100);
                mj.a(255, param0 ^ -19045, 1200, 38, 100);
                if (ha.field_c == 5) {
                  ph.a(249, false, 6);
                }
              }
            } else {
              bf.field_w = bf.field_w + 1;
              dg.field_l = 0;
              pf.field_d = pf.field_d + 1;
              mj.a(96, 12, 0, 29, 100);
              mj.a(255, 12, 1200, 40, 100);
            }
          } else {
            bf.field_w = 2;
            dg.field_l = 0;
            pf.field_d = pf.field_d + 1;
            mj.a(96, 12, 0, 29, 100);
            mj.a(255, 12, 1200, 40, 100);
          }
        } else {
          bf.field_w = 1;
          pf.field_d = pf.field_d + 1;
          li.a(-121, new bf(0, -128, 0, 8));
          dg.field_l = 0;
          mj.a(96, 12, 0, 29, 100);
          mj.a(255, param0 ^ -19045, 1200, 40, 100);
        }
    }

    public final void init() {
        this.a(-15028, 10, "starcannon");
    }

    private final void p(int param0) {
        bf stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        bf stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        bf stackIn_63_0 = null;
        boolean stackIn_64_1 = false;
        bf stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        int var2;
        int var3;
        int var4;
        Object var5;
        bf var6;
        int var7;
        bf var7_ref_bf;
        bf var8;
        int var9;
        bf var7_ref_bfLifetime1;
        var9 = field_A;
        var2 = ua.field_c + 5;
        if ((5 + ue.field_c[rj.field_h]) < var2 &&
          ue.field_c[rj.field_h] >= ua.field_c) {
          var2 = 5 + ue.field_c[rj.field_h];
        }
        L1: {
          var3 = sh.b(-126, 640);
          var4 = -64 + fi.field_e.field_f + sh.b(38, 128);
          var5 = null;
          var7 = var2;
          if (var7 != 1 &&
            var7 != 2 &&
            var7 != 3) {
            if (4 == var7) {
              nf.field_e = var2 * 25 + 75;
              kh.field_y.b(122, new bf(var3, -64, var4, 4));
            } else {
              if (var7 == 5) {
                nf.field_e = 0;
                var4 = sh.b(param0 + 129, 128) + (var3 - 64);
                for (var7 = 0; var7 < 5; var7++) {
                  var8 = new bf(var3, 64 * -var7 - 64, var4, 2);
                  var8.field_h = (bf) (var5);
                  stackIn_43_0 = var8;
                  stackIn_44_1 = (var7 != 1) && (var7 != 4);
                  stackIn_43_0.field_p = stackIn_44_1;
                  if (var7 == 0) {
                    var5 = var8;
                  }
                  kh.field_y.b(param0 ^ -138, var8);
                }
              } else if (9 != var7 &&
                11 != var7) {
                if (var7 == 6) {
                  nf.field_e = nf.field_e + 250;
                  var7_ref_bf = new bf(320, -256, var4, 11);
                  kh.field_y.b(param0 ^ -170, var7_ref_bf);
                  dg.field_l = 0;
                  ua.field_c = 2;
                  mj.a(255, 12, 0, 41, 100);
                  ti.field_f.a(kc.field_P);
                  kc.field_P.f();
                  kc.field_P = fl.field_h;
                  ti.field_f.b(kc.field_P);
                  kc.field_P.a(mc.field_b);
                  break L1;
                }
                if (var7 == 10) {
                  nf.field_e = nf.field_e + 250;
                  var7_ref_bfLifetime1 = new bf(320, -256, var4, 15);
                  kh.field_y.b(69, var7_ref_bfLifetime1);
                  dg.field_l = 0;
                  ua.field_c = 6;
                  mj.a(255, 12, 0, 41, 100);
                  ti.field_f.a(kc.field_P);
                  kc.field_P.f();
                  kc.field_P = fl.field_h;
                  ti.field_f.b(kc.field_P);
                  kc.field_P.a(mc.field_b);
                  break L1;
                }
                if (7 == var7) {
                  nf.field_e = 0;
                  for (var7 = 0; var7 < 5; var7++) {
                    var8 = new bf(var3, 64 * -var7 - 64, var4, 1);
                    stackIn_63_0 = var8;
                    stackIn_64_1 = (var7 != 1) && (var7 != 4);
                    stackIn_63_0.field_p = stackIn_64_1;
                    kh.field_y.b(101, var8);
                  }
                  break L1;
                }
                if (var7 != 8 &&
                  var7 != 13) {
                  if (var7 != 12 &&
                    14 != var7) {
                    if ((var7 == 15)) {
                      var6 = new bf(320, -256, var4, 16);
                      kh.field_y.b(97, var6);
                      tj.field_C = var6.field_k;
                      ua.field_c = 1 + ue.field_c[rj.field_h];
                      dg.field_l = 0;
                      pf.field_d = pf.field_d + 1;
                      mj.a(255, param0 ^ -244, 0, 41, 100);
                      ti.field_f.a(kc.field_P);
                      kc.field_P.f();
                      kc.field_P = fl.field_h;
                      ti.field_f.b(kc.field_P);
                      kc.field_P.a(mc.field_b);
                    }
                  } else {
                    nf.field_e = 175;
                    kh.field_y.b(82, new bf(var3, -64, var4, 4));
                  }
                  break L1;
                }
                nf.field_e = 0;
                var4 = sh.b(-128, 128) + (var3 - 64);
                for (var7 = 0; 5 > var7; var7++) {
                  var8 = new bf(var3, 64 * -var7 - 64, var4, 2);
                  stackIn_71_0 = var8;
                  stackIn_72_1 = (1 != var7) && (var7 != 4);
                  stackIn_71_0.field_p = stackIn_72_1;
                  var8.field_h = (bf) (var5);
                  if (var7 == 0) {
                    var5 = var8;
                  }
                  kh.field_y.b(param0 ^ -145, var8);
                }
              } else {
                nf.field_e = 0;
                for (var7 = -8; var7 < 8; var7++) {
                  var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 + var7 * 24, 1);
                  stackIn_53_0 = var8;
                  stackIn_54_1 = (1 != var7) && (var7 != 4);
                  stackIn_53_0.field_p = stackIn_54_1;
                  kh.field_y.b(123, var8);
                }
                break L1;
              }
            }
            break L1;
          }
          nf.field_e = var2 * 25 + 75;
          kh.field_y.b(122, new bf(var3, -64, var4, 4));
        }
        if (param0 != -256) {
          field_y = (int[]) null;
        }
    }

    private final void o(int param0) {
        int stackIn_50_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_1 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        bf var6;
        int var7;
        Object var7_ref;
        bf var8;
        int var8_int;
        bf var9;
        int var10;
        int var7Lifetime1;
        int var8_intLifetime1;
        Object var7_refLifetime1;
        bf var8Lifetime1;
        bf var9Lifetime1;
        bf var8Lifetime2;
        var10 = field_A;
        var2 = sh.b(-128, 3) + ua.field_c;
        if (ue.field_c[rj.field_h] < var2 &&
          ue.field_c[rj.field_h] >= ua.field_c) {
          var2 = ue.field_c[rj.field_h];
        }
        if (param0 != 0) {
          field_C = (String) null;
        }
        var3 = sh.b(-126, 640);
        var4 = -64 + (fi.field_e.field_f + sh.b(91, 128));
        if (var2 == 6 &&
          gi.field_g) {
          var2 = 12;
        }
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted0 = true;
        var7 = var2;
        if (0 == var7) {
          var4 = var3;
        } else {
          if (var7 != 1) {
            boolean decompiledFrameCompleted1 = true;
            if (var7 != 2 &&
              var7 != 5) {
              if (var7 != 3 &&
                var7 != 9 &&
                var7 != 11) {
                if (4 != var7 &&
                  10 != var7) {
                  if (var7 == 6) {
                    nf.field_e = 100;
                    var7_ref = null;
                    var8_int = 0;
                    while (true) {
                      stackIn_70_0 = var8_int;
                      if (nf.field_l == 2) {
                        stackIn_71_1 = 2;
                      } else {
                        stackIn_71_1 = 1;
                      }
                      if (stackIn_70_0 >= stackIn_71_1) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      var9 = new bf(var3, -var8_int * 64 - 64, sh.b(param0 + 76, 128) - 64, 5);
                      var9.field_h = (bf) (var7_ref);
                      var9.field_p = true;
                      kh.field_y.b(125, var9);
                      var7_ref = var9;
                      var8_int++;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    if (var7 == 7) {
                      nf.field_e = 0;
                      for (var7 = 0; var7 < 5; var7++) {
                        kh.field_y.b(126, new bf(var3, -64 + 64 * -var7, var4, 1));
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var7 != 8 &&
                        var7 != 13) {
                        if (var7 != 12 &&
                          var7 != 14) {
                          if ((var7 == 15)) {
                            var6 = new bf(320, -256, var4, 11);
                            kh.field_y.b(101, var6);
                            tj.field_C = var6.field_k;
                            ua.field_c = 1 + ue.field_c[rj.field_h];
                            pf.field_d = pf.field_d + 1;
                            dg.field_l = 0;
                            mj.a(255, 12, 0, 41, 100);
                            ti.field_f.a(kc.field_P);
                            kc.field_P.f();
                            kc.field_P = fl.field_h;
                            ti.field_f.b(kc.field_P);
                            kc.field_P.a(mc.field_b);
                          }
                        } else {
                          nf.field_e = 175;
                          kh.field_y.b(77, new bf(var3, -64, var4, 4));
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var5 = null;
                        nf.field_e = 0;
                        var4 = -64 + var3 + sh.b(-127, 128);
                        var7 = 0;
                        while (true) {
                          stackIn_82_0 = ~var7;
                          if (2 == nf.field_l) {
                            stackIn_83_1 = 10;
                          } else {
                            stackIn_83_1 = 5;
                          }
                          if (stackIn_82_0 <= ~stackIn_83_1) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var8 = new bf(var3, -var7 * 64 - 64, var4, 2);
                          var8.field_h = (bf) (var5);
                          if (var7 == 0) {
                            var5 = var8;
                          }
                          kh.field_y.b(param0 + 69, var8);
                          var7++;
                        }
                      }
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0)) {
                  nf.field_e = 0;
                  for (var7 = 0; var7 < 5; var7++) {
                    kh.field_y.b(param0 ^ 74, new bf(var3, -var7 * 64 - 64, var3, 1));
                  }
                }
              } else {
                nf.field_e = 0;
                for (var7 = -8; var7 < 8; var7++) {
                  var8Lifetime2 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 + var7 * 24, 1);
                  var8Lifetime2.field_p = true;
                  kh.field_y.b(107, var8Lifetime2);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1)) {
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              nf.field_e = 0;
              var7_refLifetime1 = null;
              var8_intLifetime1 = 0;
              while (true) {
                stackIn_50_0 = ~var8_intLifetime1;
                if (nf.field_l == 2) {
                  stackIn_51_1 = 10;
                } else {
                  stackIn_51_1 = 5;
                }
                if (stackIn_50_0 <= ~stackIn_51_1) {
                  break;
                }
                var9Lifetime1 = new bf(var3, -var8_intLifetime1 * 64 - 64, var4, 2);
                var9Lifetime1.field_h = (bf) (var7_refLifetime1);
                var9Lifetime1.field_p = true;
                kh.field_y.b(param0 ^ 102, var9Lifetime1);
                if (var8_intLifetime1 == 0) {
                  var7_refLifetime1 = var9Lifetime1;
                }
                var8_intLifetime1++;
              }
            }
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
          }
        }
        if ((decompiledFrameRemainder0) &&
          (decompiledFrameCompleted0)) {
          nf.field_e = 0;
          for (var7Lifetime1 = 0; var7Lifetime1 < 5; var7Lifetime1++) {
            var8Lifetime1 = new bf(var3, -64 + 64 * -var7Lifetime1, var4, 1);
            var8Lifetime1.field_p = true;
            kh.field_y.b(65, var8Lifetime1);
          }
        }

    }

    final void b(int param0) {
        boolean stackIn_6_1 = false;
        boolean stackIn_39_1 = false;
        int var2;
        int var3;
        int var4;
        Object var5;
        hb var5_ref;
        int var2Lifetime1;
        var5 = null;
        var4 = field_A;
        nb.field_f.d();
        ea.field_d.d();
        if (null != n.field_a &&
          n.field_a.field_b) {
          re.a(0);
          le.b(-36);
        }
        stackIn_6_1 = (n.field_a != null);
        this.b(stackIn_6_1, -1);
        if (param0 != 320) {
          this.a(-100);
        }
        if (fa.field_E) {
          this.t(-23523);
          fa.field_E = false;
        }
        if (le.c(4)) {
          this.f((byte) -90);
          if (le.c(4)) {
            if (!ai.a((byte) -78)) {
              return;
            }
            this.c(false, -1444);
            return;
          }
        }
        if (!ld.field_ib) {
          this.c(true, param0 ^ -1252);
        } else {
          if (null != oh.field_a) {
            if (oh.field_a.field_n) {
              eb.field_c = eb.field_c | oh.field_a.field_k;
              jg.field_H = jg.field_H & ~oh.field_a.field_k;
              oh.field_a = null;
              jj.i(122);
              cf.e((byte) -117);
              if (field_z == 5 &&
                jg.field_H == 0) {
                field_z = 2;
                od.a(param0 ^ -312, 2, false);
              }
            }
          } else {
            if (!gh.f(-23093)) {
              if (cb.a(false)) {
                stackIn_39_1 = (null != n.field_a);
                var2 = u.a((ag) (this), stackIn_39_1, (byte) 112);
                if (var2 == 1) {
                  re.a(0);
                }
                if (var2 == 2) {
                  if (null != n.field_a) {
                    re.a(0);
                  }
                  nh.a(ll.b(72), 337033697);
                }
                if (2364824 == var2) {
                  ie.g(-1);
                }
              } else {
                this.b(true);
              }
            } else {
              if (nh.field_e != 0) {
                this.b(true);
              } else {
                var2 = bd.b(31380);
                if (var2 == 2) {
                  re.a(0);
                }
                if (var2 == 3) {
                  hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, a.field_b, param0 - 331, 12, true);
                }
                if (var2 == 4) {
                  vc.a(0, (byte) 60, 0);
                }
                if (!gh.f(param0 - 23413)) {
                  fg.field_a[field_z].b(true, 0);
                }
              }
            }
          }
        }
        if (!wk.a(34)) {
          while (true) {
            var5_ref = (hb) (bh.field_e.a((byte) 39));
            if (var5_ref == null) {
              break;
            }
            sb.a(4, (byte) -41, var5_ref);
          }
        }
        nf.a(0, (byte) 95);
        while (ll.a(s.field_k, (byte) -99)) {
          this.a(true);
        }
        var2Lifetime1 = 0;
        if (se.b((byte) -91)) {
          var3 = this.h((byte) 58);
          if (var3 == 2) {
            var2Lifetime1 = 1;
          }
        }
        if (var2Lifetime1 != 0) {
          ai.a(10, (hl[]) null, 240, af.field_y.field_r, (hl[]) null, a.field_b.field_q + a.field_b.field_r, a.field_b, 10, af.field_y, 320, 10, af.field_y.field_q + af.field_y.field_r, 25574, a.field_b.field_r);
        }
    }

    private final void c(boolean param0, int param1) {
        hl dupTemp$0 = null;
        int var8 = 0;
        int var7 = 0;
        Object var3;
        ja var3_ref;
        int var4_int;
        hl[] var4;
        id[] var4_array;
        int var5_int;
        hl var5;
        Object var5_ref;
        hl var6_ref_hl;
        int var6;
        hl var7_ref_hl;
        hl var8_ref_hl;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        hl[] var15;
        hl[] var16;
        hl var17;
        hl[] var18;
        int[] var19;
        hl[] var20;
        hl var21;
        hl[] var22;
        hl var23;
        int[] var24;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5_intLifetime1;
        int var11Lifetime1;
        var12 = field_A;
        if (param1 != -1444) {
          this.b(66);
        }
        o.a(false);
        if (param0) {
          ne.b(lh.field_I, 150);
        }
        if (null == gf.field_c) {
          if (lj.field_h.b((byte) 118) &&
            lj.field_h.a(param1 + 31185)) {
            if (nd.field_p.b((byte) 95) &&
              nd.field_p.a(29741)) {
              if (se.field_l.b((byte) 109) &&
                se.field_l.a(29741)) {
                if (jg.field_F.b((byte) 119) &&
                  jg.field_F.a(29741)) {
                  if (cb.field_c.b((byte) 127) &&
                    cb.field_c.a(29741)) {
                    if (fi.field_f.b((byte) 103) &&
                      fi.field_f.a("basic", -9883)) {
                      ma.a(fa.field_z, -13923, 70.0f);
                      this.d((byte) 22);
                      if (!param0) {
                        return;
                      }
                      jj.i(param1 ^ -1478);
                      gf.field_c = new ud[48];
                      gf.field_c[0] = aj.a(lj.field_h, "", "SC_bossdamage").a();
                      gf.field_c[1] = aj.a(lj.field_h, "", "SC_bossdestroy").a();
                      gf.field_c[2] = aj.a(lj.field_h, "", "SC_collect1").a();
                      gf.field_c[7] = aj.a(lj.field_h, "", "SC_enemydamage2").a();
                      gf.field_c[8] = aj.a(lj.field_h, "", "SC_enemydamage3").a();
                      gf.field_c[9] = aj.a(lj.field_h, "", "SC_enemydestroy3").a();
                      gf.field_c[10] = aj.a(lj.field_h, "", "SC_enemydestroy4").a();
                      gf.field_c[3] = aj.a(lj.field_h, "", "SC_enemyfire1").a();
                      gf.field_c[4] = aj.a(lj.field_h, "", "SC_enemyfire2").a();
                      gf.field_c[5] = aj.a(lj.field_h, "", "SC_enemyfire3").a();
                      gf.field_c[6] = aj.a(lj.field_h, "", "SC_enemyfire4").a();
                      gf.field_c[19] = aj.a(lj.field_h, "", "SC_playerdestroy").a();
                      gf.field_c[20] = aj.a(lj.field_h, "", "SC_backcannon").a();
                      gf.field_c[21] = aj.a(lj.field_h, "", "SC_FOLLOWERFIRE").a();
                      gf.field_c[11] = aj.a(lj.field_h, "", "SC_playerfire1").a();
                      gf.field_c[12] = aj.a(lj.field_h, "", "SC_playerfire2").a();
                      gf.field_c[13] = aj.a(lj.field_h, "", "SC_helix_1").a();
                      gf.field_c[14] = aj.a(lj.field_h, "", "SC_helix_2").a();
                      gf.field_c[15] = aj.a(lj.field_h, "", "SC_helix_3").a();
                      gf.field_c[16] = aj.a(lj.field_h, "", "SC_lance_1").a();
                      gf.field_c[17] = aj.a(lj.field_h, "", "SC_lance_2").a();
                      gf.field_c[18] = aj.a(lj.field_h, "", "SC_lance_3").a();
                      gf.field_c[22] = aj.a(lj.field_h, "", "SC_rewind_activated_part1").a();
                      gf.field_c[23] = aj.a(lj.field_h, "", "SC_rewind_installed").a();
                      gf.field_c[24] = aj.a(lj.field_h, "", "SC_seekermine_explode").a();
                      gf.field_c[25] = aj.a(lj.field_h, "", "SC_shield_discharged").a();
                      gf.field_c[26] = aj.a(lj.field_h, "", "SC_shield_rearm").a();
                      gf.field_c[27] = aj.a(lj.field_h, "", "SC_shieldburst").a();
                      gf.field_c[28] = aj.a(lj.field_h, "", "SC_thruster_upgrade").a();
                      gf.field_c[29] = aj.a(lj.field_h, "", "SC_rearcannon_upgrade").a();
                      gf.field_c[30] = aj.a(lj.field_h, "", "SC_shield_upgraded").a();
                      gf.field_c[31] = aj.a(lj.field_h, "", "SC_sidecannons_upgrade").a();
                      gf.field_c[46] = aj.a(lj.field_h, "", "SC_xenon_operational").a();
                      gf.field_c[47] = aj.a(lj.field_h, "", "SC_xenonbeamshot").a();
                      gf.field_c[32] = nj.a(nd.field_p, "", "SC_systems malfunction").c();
                      gf.field_c[39] = nj.a(nd.field_p, "", "SC_VOC_54321").c();
                      gf.field_c[40] = nj.a(nd.field_p, "", "SC_VOC_back cannons upgraded").c();
                      gf.field_c[41] = nj.a(nd.field_p, "", "SC_VOC_hostile mothership approaching").c();
                      gf.field_c[42] = nj.a(nd.field_p, "", "SC_VOC_powerup collected").c();
                      gf.field_c[43] = nj.a(nd.field_p, "", "SC_VOC_returning to normal space").c();
                      gf.field_c[44] = nj.a(nd.field_p, "", "SC_VOC_rewind module activated").c();
                      gf.field_c[45] = nj.a(nd.field_p, "", "SC_VOC_rewind module installed").c();
                      gf.field_c[33] = nj.a(nd.field_p, "", "SC_VOC_shield discharged").c();
                      gf.field_c[34] = nj.a(nd.field_p, "", "SC_VOC_shield rearmed").c();
                      gf.field_c[35] = nj.a(nd.field_p, "", "SC_VOC_shields upgraded").c();
                      gf.field_c[36] = nj.a(nd.field_p, "", "SC_VOC_side cannons upgraded").c();
                      gf.field_c[37] = nj.a(nd.field_p, "", "SC_VOC_thrusters upgraded").c();
                      gf.field_c[38] = nj.a(nd.field_p, "", "SC_VOC_zenon beam operational").c();
                      nd.a(272, -3763, 3278, 39);
                      nd.a(0, -3763, 300, 11);
                      nd.a(0, -3763, 300, 12);
                      nd.a(50, -3763, 300, 16);
                      nd.a(0, param1 - 2319, 100, 17);
                      nd.a(0, param1 ^ 2833, 100, 18);
                      tc.j(param1 ^ -1412);
                      return;
                    }
                    ma.a(bh.a(n.field_f, fi.field_f, (byte) -38, ae.field_a, "basic"), -13923, 60.0f);
                    return;
                  }
                  ma.a(bh.a(s.field_g, cb.field_c, (byte) -38, sj.field_D, ""), -13923, 50.0f);
                  return;
                }
                ma.a(bh.a(n.field_f, jg.field_F, (byte) -38, ae.field_a, ""), param1 - 12479, 40.0f);
                return;
              }
              ma.a(bh.a(kc.field_U, se.field_l, (byte) -38, ia.field_l, ""), -13923, 30.0f);
              return;
            }
            ma.a(bh.a(lc.field_ib, nd.field_p, (byte) -38, bd.field_g, ""), -13923, 20.0f);
            return;
          }
          ma.a(bh.a(lc.field_ib, lj.field_h, (byte) -38, bd.field_g, ""), param1 ^ 13249, 10.0f);
          return;
        }
        if (null != se.field_l) {
          ma.a(nc.field_d, -13923, 75.0f);
          this.d((byte) 22);
          var3_ref = new ja(lj.field_h, nd.field_p);
          fb.field_t = dl.a(var3_ref, (byte) 84, "music/star cannon level 1 final", "", se.field_l);
          qf.field_i = dl.a(var3_ref, (byte) 66, "music/star cannon level 2 final", "", se.field_l);
          r.field_b = dl.a(var3_ref, (byte) -82, "music/star cannon boss final", "", se.field_l);
          nd.field_p = null;
          se.field_l = null;
          lj.field_h = null;
          tc.j(32);
          return;
        }
        if (fl.field_f == null) {
          ma.a(sj.field_C, -13923, 80.0f);
          this.d((byte) 22);
          gg.field_f = ob.a("smlships", 126, "", jg.field_F);
          nd.field_j = ob.a("destroyer", -121, "", jg.field_F);
          qc.field_e = ob.a("cruiser", param1 ^ -1484, "", jg.field_F);
          gf.field_a = ob.a("cannoneer", 116, "", jg.field_F);
          dl.field_c = ob.a("playership", param1 + 1407, "", jg.field_F);
          vc.field_m = ob.a("addons", 126, "", jg.field_F);
          ob.a("glows", 118, "", jg.field_F);
          sj.field_E = ob.a("boss", -36, "", jg.field_F);
          fg.field_c = ob.a("boss2", param1 ^ 1474, "", jg.field_F);
          v.field_d = ob.a("boss3", 95, "", jg.field_F);
          af.field_w = fg.a(jg.field_F, "powerorbs", "", false);
          var15 = ob.a("shots", -75, "", jg.field_F);
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            jg.field_C[var4_int] = var15[var4_int];
          }
          var16 = ob.a("shots2", -120, "", jg.field_F);
          for (var4_intLifetime1 = 0; var4_intLifetime1 < 5; var4_intLifetime1++) {
            jg.field_C[var4_intLifetime1 + 5] = var16[var4_intLifetime1];
          }
          var3 = null;
          ie.field_B = ob.a("explosion", 120, "", jg.field_F);
          ad.field_z = ob.a("explosionb", -63, "", jg.field_F);
          oh.field_d = ob.a("explosionc", -105, "", jg.field_F);
          el.field_H = new hl[5];
          for (var4_intLifetime2 = 0; var4_intLifetime2 < 5; var4_intLifetime2++) {
            dupTemp$0 = new hl(32, 32);
            el.field_H[var4_intLifetime2] = dupTemp$0;
            var17 = dupTemp$0;
            var17.e();
            gg.field_f[-var4_intLifetime2 + 24].b(0, 0);
            var17.d();
          }
          hg.field_y.b(param1 + 1333);
          fl.field_f = ob.a("debris", 96, "", jg.field_F);
          var4 = new hl[40];
          for (var5_int = 0; var5_int < 4; var5_int++) {
            var4[36 + var5_int] = fl.field_f[var5_int + 12];
          }
          var13 = 0;
          var5_intLifetime1 = var13;
          while (var13 < 12) {
            var4[var13] = fl.field_f[var13];
            var4[12 + var13] = fl.field_f[var13].c();
            var4[12 + var13].a();
            var4[24 + var13] = fl.field_f[var13].c();
            var4[24 + var13].b();
            var13++;
          }
          fl.field_f = var4;
          ma.field_e = ob.a("fr_thin_sqr_in", -49, "", jg.field_F);
          gb.field_v = ob.a("fr_thin_sqr_ex", 119, "", jg.field_F);
          ha.field_a = ob.a("fr_grid_sql_in", 119, "", jg.field_F);
          ma.field_a = ob.a("fr_grid_sql_ex", 119, "", jg.field_F);
          var5 = ma.field_a[6];
          var6_ref_hl = ma.field_a[7];
          ma.field_a[8].field_q = 4;
          var6_ref_hl.field_q = 4;
          var5.field_q = 4;
          var7_ref_hl = ha.field_a[6];
          ha.field_a[8].field_q = 4;
          var8_ref_hl = ha.field_a[7];
          var8_ref_hl.field_q = 4;
          var7_ref_hl.field_q = 4;
          vb.field_l = vk.a("", param1 ^ -1534, "life_icon", jg.field_F);
          pk.field_e = vk.a("", 41, "main_border", jg.field_F);
          hf.field_i = vk.a("", 45, "main_inner", jg.field_F);
          rd.field_p = ob.a("menu_border", param1 ^ -1532, "", jg.field_F);
          jk.field_f = ob.a("menu_innerborder", 98, "", jg.field_F);
          var18 = ob.a("headers", 117, "", jg.field_F);
          fh.field_r[0] = var18[0];
          fh.field_r[3] = var18[3];
          fh.field_r[4] = var18[4];
          fh.field_r[2] = var18[2];
          fh.field_r[1] = var18[1];
          fh.field_r[5] = var18[5];
          var24 = new int[256];
          var19 = var24;
          var10 = var19;
          for (var11 = 0; 256 > var11; var11++) {
            var10[var11] = w.a(var11 << 7, 65303) + var11;
          }
          var14 = 0;
          var11Lifetime1 = var14;
          while (var14 < 8) {
            if (fh.field_r[var14] != null) {
              rh.field_f[var14] = cl.a(5, fh.field_r[var14], true, false, var24, 255);
            }
            var14++;
          }
          tc.j(param1 + 1476);
          return;
        }
        if (null == kj.field_y[3]) {
          ma.a(sj.field_C, -13923, 90.0f);
          this.d((byte) 22);
          vk.a("", 93, "mainmenubar", jg.field_F);
          ie.field_A = ob.a("zenon", 102, "", jg.field_F);
          vk.a("", 120, "moon", jg.field_F);
          vk.a("", param1 ^ -1487, "stars", jg.field_F);
          fh.field_q = vk.a("", param1 + 1531, "nebula", jg.field_F);
          gj.field_e = vk.a("", 125, "titlepic", jg.field_F);
          gb.field_r = vk.a("", 91, "title2", jg.field_F);
          ea.field_b[0] = vk.a("", 54, "sp0", jg.field_F);
          ea.field_b[1] = vk.a("", 116, "sp1", jg.field_F);
          ea.field_b[2] = vk.a("", 52, "sp2", jg.field_F);
          ea.field_b[3] = vk.a("", param1 + 1531, "sp3", jg.field_F);
          ea.field_b[4] = vk.a("", 43, "sp4", jg.field_F);
          ea.field_b[5] = vk.a("", 44, "sp5", jg.field_F);
          ea.field_b[6] = vk.a("", 93, "sp6", jg.field_F);
          ea.field_b[7] = vk.a("", param1 + 1497, "sp7", jg.field_F);
          ea.field_b[8] = vk.a("", 36, "sp8", jg.field_F);
          eb.field_b[0] = vk.a("", 47, "s0", jg.field_F);
          eb.field_b[1] = vk.a("", 107, "s1", jg.field_F);
          eb.field_b[2] = vk.a("", 86, "s2", jg.field_F);
          eb.field_b[3] = vk.a("", 23, "s3", jg.field_F);
          eb.field_b[4] = vk.a("", 20, "s4", jg.field_F);
          eb.field_b[5] = vk.a("", 82, "s5", jg.field_F);
          eb.field_b[6] = vk.a("", dg.a(param1, -1506), "s6", jg.field_F);
          eb.field_b[7] = vk.a("", dg.a(param1, -1419), "s7", jg.field_F);
          eb.field_b[8] = vk.a("", dg.a(param1, -1423), "s8", jg.field_F);
          eb.field_b[9] = vk.a("", 124, "s9", jg.field_F);
          eb.field_b[10] = vk.a("", param1 + 1532, "s10", jg.field_F);
          eb.field_b[11] = vk.a("", 21, "s11", jg.field_F);
          eb.field_b[12] = vk.a("", dg.a(param1, -1478), "s12", jg.field_F);
          eb.field_b[13] = vk.a("", param1 + 1523, "s13", jg.field_F);
          kj.field_y[0] = vk.a("", 76, "ap0", jg.field_F);
          kj.field_y[1] = vk.a("", 69, "ap1", jg.field_F);
          kj.field_y[2] = vk.a("", dg.a(param1, -1497), "ap2", jg.field_F);
          kj.field_y[3] = vk.a("", 100, "ap3", jg.field_F);
          tc.j(32);
          return;
        }
        ma.a(sj.field_C, -13923, 95.0f);
        this.d((byte) 22);
        af.field_y = od.a("", jg.field_F, "b12", param1 + 1443, cb.field_c);
        a.field_b = od.a("", jg.field_F, "font", -1, cb.field_c);
        var20 = ob.a("screenshots", -105, "", jg.field_F);
        kk.a(vk.a("", 59, "mbfg", jg.field_F), -60, wc.field_g);
        ta.a(vk.a("", param1 ^ -1510, "mb_logo", jg.field_F), param1 + 1319);
        ed.a(0, 125, 123, a.field_b, 1500, -52, 9, 9, 16777215, 0, vk.a("", 60, "mbpb", jg.field_F));
        te.a(126, var20);
        lf.field_eb = null;
        var4_array = new id[1];
        var4_array[0] = af.field_w[16 + qb.field_e];
        af.field_y.a(var4_array, (int[]) null);
        lf.field_V = vk.a("basic", 111, "unachieved", fi.field_f);
        li.a(lf.field_V, (byte) -100);
        sc.field_a = vk.a("basic", param1 ^ -1517, "locked", fi.field_f);
        li.a(sc.field_a, (byte) -100);
        var21 = vk.a("basic", 104, "orbcoin", fi.field_f);
        var6 = a.field_b.field_p + a.field_b.field_q;
        el.field_J = new hl(var6, var6);
        el.field_J.e();
        var21.d(0, 0, var6, var6);
        j.field_c = ob.a("achievements_lrg", param1 + 1366, "", jg.field_F);
        var5_ref = null;
        var22 = j.field_c;
        for (var8 = 0; var8 < var22.length; var8++) {
          var23 = var22[var8];
          li.a(var23, (byte) -100);
        }
        hg.field_y.b(-83);
        jl.field_j = 5;
        fi.field_f = null;
        ia.field_k = 0;
        jg.field_F = null;
        tg.field_y = 10;
        tj.field_G = 0;
        pf.field_d = 1;
        bf.field_w = 0;
        ha.field_c = 0;
        gj.field_c = -1;
        jk.field_j = 0;
        eg.field_l = 128;
        ua.field_c = -2;
        ha.field_d = 0;
        vb.field_m = 1;
        cg.field_e = 0;
        ui.field_p = 0;
        kd.field_C = -1;
        fi.field_e = new bf(256, 256, 256, 0);
        fi.field_e.field_r = 256;
        fi.field_e.field_k = 0;
        kh.field_y.a(-71, fi.field_e);
        u.field_b = 0;
        ed.field_n = 0;
        ig.field_h = 0;
        hc.field_c = 0;
        nf.field_e = 0;
        eg.field_f = new wd(fb.field_t);
        gd.field_a = new wd(qf.field_i);
        fl.field_h = new wd(r.field_b);
        kc.field_P = eg.field_f;
        kc.field_P.a(mc.field_b);
        ti.field_f.b(kc.field_P);
        ne.a(50, 39);
        qd.a(1, 50);
        fg.field_a = new jl[8];
        pc.a(-5695);
        for (var7 = 0; var7 < 8; var7++) {
          fg.field_a[var7] = new jl(var7);
        }
        if (!wk.a(45)) {
          oh.field_a = og.a(4, (byte) 113);
        }
        ld.field_ib = true;
        tc.j(param1 + 1476);
        return;
    }

    private final void m(byte param0) {
        fj dupTemp$0 = null;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        bf stackIn_106_0 = null;
        bf stackIn_106_1 = null;
        int stackIn_154_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        boolean stackIn_348_0 = false;
        int stackIn_353_0 = 0;
        int stackIn_460_0 = 0;
        int stackIn_513_0 = 0;
        int stackIn_513_1 = 0;
        int stackIn_549_0 = 0;
        int stackIn_549_1 = 0;
        boolean stackOut_347_0;
        Object var2;
        int var2_int;
        bf var2_ref;
        int var3;
        bf var3_ref_bf;
        int var4;
        bf var4_ref_bf;
        int var5_int;
        bf var5;
        int var6_int;
        bf var6;
        int var7;
        int var8;
        bf var9;
        bf var10;
        ud var11;
        fj var12;
        bf var13;
        bf var35;
        int[] var78;
        int[] var79;
        int[] var80;
        int[] var81;
        int[] var82;
        int[] var83;
        int[] var84;
        int[] var85;
        int[] var86;
        int[] var87;
        int[] var88;
        int[] var89;
        int[] var90;
        int[] var91;
        int[] var92;
        int[] var93;
        int[] var94;
        int[] var95;
        int[] var96;
        int[] var97;
        int[] var98;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        int var3Lifetime7;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5_intLifetime1;
        int var4Lifetime3;
        int var5_intLifetime2;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        int var3Lifetime5Lifetime1;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var5_intLifetime1Lifetime1;
        bf stackIn_106_0Lifetime1;
        bf stackIn_106_1Lifetime1;
        bf var2_refLifetime1;
        bf var3_ref_bfLifetime1;
        bf var5Lifetime1;
        int stackIn_103_0Lifetime1;
        int stackIn_103_1Lifetime1;
        int stackIn_159_0Lifetime1;
        int stackIn_159_1Lifetime1;
        int stackIn_353_0Lifetime1;
        int stackIn_513_0Lifetime1;
        int stackIn_513_1Lifetime1;
        int stackIn_549_0Lifetime1;
        int stackIn_549_1Lifetime1;
        int var3Lifetime1Lifetime1Lifetime1;
        int var3Lifetime1Lifetime1Lifetime2;
        int var3Lifetime1Lifetime2Lifetime1;
        int var3Lifetime1Lifetime2Lifetime2;
        int var4Lifetime1Lifetime1Lifetime1;
        var2 = null;
        var8 = field_A;
        if (ie.field_C > 0) {
          ie.field_C = ie.field_C - 1;
        }
        if (gj.field_c == -1) {
          var2_int = 0;
          if (0 == ia.field_k &&
            0 != jg.field_H) {
          }
          if (!wk.a(86)) {
            if (0 >= jg.field_H) {
              if (0 < kd.field_C) {
                var2_int = 2;
              }
            } else {
              var2_int = 5;
            }
          } else {
            if (!(ia.field_k <= 0) ||
              !(jg.field_H <= 0)) {
              var2_int = 6;
            }
          }
          od.a(-126, var2_int, false);
        }
        if (tj.field_G > 0) {
          fi.field_e.field_k = 1;
          ha.field_d = 0;
          ui.field_p = eg.field_l - 32;
          tj.field_G = tj.field_G - 1;
          if (0 >= tj.field_G) {
            ui.field_p = 0;
            mj.a(255, 12, 0, 43, 100);
          }
        }
        if (fi.field_e.field_k <= 0) {
          if (gj.field_c < 0) {
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 4000; var2_intLifetime1++) {
              qc.field_c[var2_intLifetime1] = null;
            }
            var2_ref = (bf) (kh.field_y.c(-3905));
            while (var2_ref != null) {
              stackIn_106_0 = fi.field_e;
              stackIn_106_1 = var2_ref;
              if (stackIn_106_0 != stackIn_106_1) {
                var2_ref.b(4);
              }
              var2_ref = (bf) (kh.field_y.a(-16913));
            }
          }
        } else {
          if (gi.field_g &&
            2 <= ua.field_c &&
            rj.field_h == 0) {
            ia.field_k = ia.field_k + 1;
            fc.field_e = fc.field_e + 2;
          }
          if (ui.field_p > 0) {
            ui.field_p = ui.field_p + 8;
            if (ui.field_p > eg.field_l) {
              dg.field_l = 0;
              ui.field_p = 0;
              mj.a(96, 12, 0, 25, 100);
              mj.a(255, 12, 0, 33, 100);
            }
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 4000; var2_intLifetime1++) {
              if (qc.field_c[var2_intLifetime1] != null &&
                qc.field_c[var2_intLifetime1].field_h == 2) {
                var3 = qc.field_c[var2_intLifetime1].field_d - fi.field_e.field_f;
                var4 = qc.field_c[var2_intLifetime1].field_q - fi.field_e.field_u;
                var5_int = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
                if (var5_int < ui.field_p) {
                  qc.field_c[var2_intLifetime1].field_h = 0;
                  qc.field_c[var2_intLifetime1].field_p = 64;
                }
              }
            }
            var2_ref = (bf) (kh.field_y.c(-3905));
            while (var2_ref != null) {
              stackIn_106_0 = fi.field_e;
              stackIn_106_1 = var2_ref;
              if (stackIn_106_0 != stackIn_106_1) {
                var3 = var2_ref.field_f - fi.field_e.field_f;
                var4Lifetime3 = -fi.field_e.field_u + var2_ref.field_u;
                var5_intLifetime2 = (int)Math.sqrt((double)(var4Lifetime3 * var4Lifetime3 + var3 * var3));
                for (var6_int = 0; ui.field_p > var6_int; var6_int++) {
                  stackIn_103_0 = var6_int;
                  stackIn_103_1 = var5_intLifetime2;
                  if (stackIn_103_0 > stackIn_103_1 &&
                    var2_ref.field_q != 10 && (var2_ref.field_q != 22 ||
                    !(var2_ref.field_l >= 36) ||
                    !(39 >= var2_ref.field_l))) {
                    if (var3 < 0) {
                      var2_ref.field_f = var2_ref.field_f - 1;
                    }
                    if (0 < var3) {
                      var2_ref.field_f = var2_ref.field_f + 1;
                    }
                    if (var4Lifetime3 < 0) {
                      var2_ref.field_u = var2_ref.field_u - 1;
                    }
                    if (0 < var4Lifetime3) {
                      var2_ref.field_u = var2_ref.field_u + 1;
                    }
                  }
                }
              }
              var2_ref = (bf) (kh.field_y.a(-16913));
            }
          } else {
            if (ha.field_d > 0) {
              var2_intLifetime1 = vb.field_m + 1;
              if (4 == vb.field_m) {
                var2_intLifetime1++;
              }
              if (vb.field_m == 5) {
                var2_intLifetime1 += 2;
              }
              ha.field_d = ha.field_d - var2_intLifetime1;
              if (null == ah.field_a &&
                vb.field_m < 4) {
                var3 = 0;
                if (vb.field_m == 2) {
                  var3 = 28665;
                }
                if (3 == vb.field_m) {
                  var3 = 42997;
                }
                var11 = gf.field_c[39];
                dupTemp$0 = fj.a(var11, 100, 255 * nb.field_g / 100);
                var12 = dupTemp$0;
                ah.field_a = dupTemp$0;
                var12.d(var3);
                var6_int = (var2_intLifetime1 + ha.field_d - 1) / var2_intLifetime1;
                var7 = -300 + (var6_int * 20 - (var11.field_i.length - var3) * 1000 / var11.field_j);
                if (var7 > 0) {
                  ok.field_tb = eg.a(29723, var7, ah.field_a);
                  jk.field_k.b(ok.field_tb);
                } else {
                  jk.field_k.b(ah.field_a);
                }
              }
              if (ha.field_d <= 0) {
                ha.field_d = 0;
                dg.field_l = 0;
                mj.a(255, 12, 0, 34, 100);
                mj.a(96, 12, 0, 26, 100);
                ok.field_tb = null;
                ah.field_a = null;
              }
            }
          }
        }
        var2_refLifetime1 = fi.field_e;
        stackIn_103_0Lifetime1 = 10;
        stackIn_103_1Lifetime1 = u.field_b;
        if (stackIn_103_0Lifetime1 < stackIn_103_1Lifetime1) {
          u.field_b = 0;
          stackIn_106_0Lifetime1 = var2_refLifetime1;
          stackIn_106_1Lifetime1 = var2_refLifetime1;
          stackIn_106_0Lifetime1.field_k = stackIn_106_1Lifetime1.field_k + 1;
        }
        if (0 > var2_refLifetime1.field_f) {
          var2_refLifetime1.field_f = 0;
          var2_refLifetime1.field_n = 50;
        }
        if (u.field_b < -100) {
          u.field_b = -100;
        }
        if (var2_refLifetime1.field_f > 640) {
          var2_refLifetime1.field_f = 640;
          var2_refLifetime1.field_n = -50;
        }
        if (var2_refLifetime1.field_u < 0) {
          var2_refLifetime1.field_z = 50;
          var2_refLifetime1.field_u = 0;
        }
        if (var2_refLifetime1.field_u > 448) {
          var2_refLifetime1.field_z = -50;
          var2_refLifetime1.field_u = 448;
        }
        if (ig.field_h > 8) {
          ig.field_h = sh.b(-6, 4);
        }
        vd.field_j = vd.field_j + 3;
        hc.field_c = hc.field_c + 1;
        ed.field_n = ed.field_n + 1;
        if (ge.field_c[0] == 2 ||
          ge.field_c[0] == 7 ||
          ge.field_c[0] == 12 ||
          !(ua.field_c >= -2)) {
          vd.field_j = vd.field_j + 9;
          hc.field_c = hc.field_c + 3;
          if (ua.field_c < -2) {
            hc.field_c = hc.field_c + 3;
            ed.field_n = ed.field_n + 2;
            vd.field_j = vd.field_j + 9;
          }
        }
        if (ed.field_n > 1028) {
          if (ua.field_c < ue.field_c[rj.field_h]) {
            ua.field_c = ua.field_c + 1;
            if (ua.field_c == 9) {
              var3_ref_bf = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
              var3_ref_bf.field_l = 5;
              kh.field_y.b(97, var3_ref_bf);
            }
            if (rj.field_h == 0) {
              nf.field_e = -50;
              if (10 == ua.field_c ||
                ua.field_c == 12) {
                var3Lifetime1 = sh.b(113, 640);
                var4Lifetime1 = -64 + (fi.field_e.field_f + sh.b(-126, 128));
                for (var5_intLifetime1 = 0; var5_intLifetime1 < 5; var5_intLifetime1++) {
                  var6 = new bf(var3Lifetime1, -var5_intLifetime1 * 64 - 64, var4Lifetime1, 17);
                  var6.field_o = sh.b(-127, 32);
                  kh.field_y.b(114, var6);
                }
              }
            }
            if (rj.field_h == 1) {
              if (ua.field_c == 4) {
                for (var3Lifetime1Lifetime1 = 36; var3Lifetime1Lifetime1 < 40; var3Lifetime1Lifetime1++) {
                  stackIn_159_0 = -1;
                  stackIn_159_1 = ~(1 & var3Lifetime1Lifetime1);
                  stackIn_154_0 = (stackIn_159_0 != stackIn_159_1) ? 424 : 296;
                  var4Lifetime1Lifetime1 = stackIn_154_0;
                  stackIn_157_0 = (var3Lifetime1Lifetime1 >= 38) ? -128 : -256;
                  var5_intLifetime1Lifetime1 = stackIn_157_0;
                  var13 = new bf(var4Lifetime1Lifetime1, var5_intLifetime1Lifetime1, var4Lifetime1Lifetime1, 22);
                  li.a(-126, var13);
                  var13.field_l = var3Lifetime1Lifetime1;
                  var13.field_n = 0;
                  var13.field_z = 32;
                }
              }
              stackIn_159_0Lifetime1 = 5;
              stackIn_159_1Lifetime1 = ua.field_c;
              if (stackIn_159_0Lifetime1 == stackIn_159_1Lifetime1 ||
                ua.field_c == 15) {
                nf.field_e = -250;
                for (var3Lifetime1Lifetime1Lifetime1 = 0; 25 > var3Lifetime1Lifetime1Lifetime1; var3Lifetime1Lifetime1Lifetime1++) {
                  kh.field_y.b(99, new bf(sh.b(-128, 640), -var3Lifetime1Lifetime1Lifetime1 * 25 - 128, sh.b(60, 128) + fi.field_e.field_f - 64, 18));
                }
              }
              if (4 == ua.field_c ||
                ua.field_c == 6 ||
                ua.field_c == 8 ||
                ua.field_c == 10 ||
                ua.field_c == 12 ||
                ua.field_c == 14) {
                var3Lifetime1Lifetime1Lifetime2 = -300 + (900 * sh.b(45, 2) + 320);
                for (var4Lifetime1Lifetime1Lifetime1 = 0; var4Lifetime1Lifetime1Lifetime1 < 5; var4Lifetime1Lifetime1Lifetime1++) {
                  var5 = new bf(var3Lifetime1Lifetime1Lifetime2, 64 * -var4Lifetime1Lifetime1Lifetime1 - 64, var3Lifetime1Lifetime1Lifetime2, 17);
                  var5.field_o = sh.b(-127, 32);
                  kh.field_y.b(121, var5);
                }
              }
            }
            if (2 == rj.field_h) {
              if (ua.field_c == 5 ||
                10 == ua.field_c ||
                ua.field_c == 15) {
                nf.field_e = -150;
                for (var3Lifetime1Lifetime2 = 0; 25 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
                  kh.field_y.b(119, new bf(sh.b(76, 640), -128 + -var3Lifetime1Lifetime2 * 25, -64 + sh.b(-30, 128) + fi.field_e.field_f, 18));
                }
              }
              if (ua.field_c == 16) {
                for (var3Lifetime1Lifetime2Lifetime1 = 48; var3Lifetime1Lifetime2Lifetime1 < 640; var3Lifetime1Lifetime2Lifetime1 += 96) {
                  var4_ref_bf = new bf(var3Lifetime1Lifetime2Lifetime1, -64 - Math.abs(-320 + var3Lifetime1Lifetime2Lifetime1), var3Lifetime1Lifetime2Lifetime1, 21);
                  var4_ref_bf.field_o = sh.b(-127, 32);
                  kh.field_y.b(57, var4_ref_bf);
                }
              }
              if (ua.field_c >= 4 &&
                ua.field_c <= 14 &&
                0 == (ua.field_c & 1)) {
                var3Lifetime1Lifetime2Lifetime2 = sh.b(-128, 2) * 900 + 20;
                for (var4Lifetime1Lifetime2 = 0; var4Lifetime1Lifetime2 < 5; var4Lifetime1Lifetime2++) {
                  var5Lifetime1 = new bf(var3Lifetime1Lifetime2Lifetime2, -var4Lifetime1Lifetime2 * 64 - 64, var3Lifetime1Lifetime2Lifetime2, 17);
                  var5Lifetime1.field_o = sh.b(-126, 32);
                  kh.field_y.b(89, var5Lifetime1);
                }
              }
            }
            if (3 == rj.field_h && (ua.field_c == 5 ||
              ua.field_c == 10)) {
              for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 25; var3Lifetime1Lifetime3++) {
                kh.field_y.b(115, new bf(sh.b(-126, 640), -128 + 25 * -var3Lifetime1Lifetime3, sh.b(8, 128) - (-fi.field_e.field_f + 64), 18));
              }
            }
            if (ua.field_c == -2 &&
              rj.field_h > 0) {
              dg.field_l = 0;
              mj.a(255, 12, 0, 43, 100);
            }
          }
          ed.field_n = sh.b(64, 640);
          if (0 == rj.field_h ||
            rj.field_h == 3) {
            if (ua.field_c <= 0) {
              if (2 == ge.field_c[0]) {
                var78 = ge.field_c;
                ge.field_c[1] = 1;
                var78[0] = 1;
              }
              if (ge.field_c[0] == 7) {
                ge.field_c[1] = 6;
                var79 = ge.field_c;
                var79[0] = 6;
              }
              if (12 == ge.field_c[0]) {
                ge.field_c[1] = 11;
                var80 = ge.field_c;
                var80[0] = 11;
              }
            }
            if (0 <= ua.field_c &&
              ua.field_c <= 12 &&
              (1 & ua.field_c) == 0) {
              gd.field_d = (ua.field_c >> 1) + 2;
              v.a(new d(sh.b(-127, 640), -156, 0, 128 + sh.b(-127, 256), 16777215, 4), -4001);
            }
            if (ua.field_c == 12) {
              ge.field_c[1] = 3;
              var81 = ge.field_c;
              var81[0] = 3;
            }
            if (13 == ua.field_c) {
              ge.field_c[1] = 1;
              var82 = ge.field_c;
              var82[0] = 1;
            }
          }
          if (rj.field_h == 1) {
            if (ua.field_c <= 0) {
              if (ge.field_c[0] == 2) {
                var83 = ge.field_c;
                ge.field_c[1] = 1;
                var83[0] = 1;
              }
              if (ge.field_c[0] == 7) {
                ge.field_c[1] = 6;
                var84 = ge.field_c;
                var84[0] = 6;
              }
              if (ge.field_c[0] == 12) {
                var85 = ge.field_c;
                ge.field_c[1] = 11;
                var85[0] = 11;
              }
            }
            if (1 == ua.field_c) {
              ge.field_c[0] = 4;
            }
            if (3 == ua.field_c) {
              var86 = ge.field_c;
              ge.field_c[1] = 3;
              var86[0] = 3;
            }
            if (ua.field_c == 6) {
              ge.field_c[1] = 1;
              var87 = ge.field_c;
              var87[0] = 1;
            }
            if (ua.field_c == 8) {
              ge.field_c[1] = 5;
            }
            if (9 == ua.field_c) {
              var88 = ge.field_c;
              ge.field_c[1] = 13;
              var88[0] = 13;
            }
            if (ua.field_c == 12) {
              ge.field_c[1] = 11;
              var89 = ge.field_c;
              var89[0] = 11;
            }
            if (ua.field_c == 14) {
              ge.field_c[1] = 9;
            }
            if (ua.field_c == 15) {
              ge.field_c[1] = 8;
              var90 = ge.field_c;
              var90[0] = 8;
            }
            if (ua.field_c == 18) {
              ge.field_c[1] = 6;
              var91 = ge.field_c;
              var91[0] = 6;
            }
            if (ua.field_c == 20) {
              ge.field_c[0] = 10;
            }
          }
          if (rj.field_h == 2) {
            if (0 >= ua.field_c) {
              if (2 == ge.field_c[0]) {
                ge.field_c[1] = 1;
                var92 = ge.field_c;
                var92[0] = 1;
              }
              if (7 == ge.field_c[0]) {
                var93 = ge.field_c;
                ge.field_c[1] = 6;
                var93[0] = 6;
              }
              if (ge.field_c[0] == 12) {
                ge.field_c[1] = 11;
                var94 = ge.field_c;
                var94[0] = 11;
              }
            }
            if (4 == ua.field_c) {
              gd.field_d = 9;
              v.a(new d(sh.b(-128, 640), -156, 0, sh.b(107, 256) + 128, 16777215, 4), -4001);
            }
            if (ua.field_c == 5) {
              ge.field_c[1] = 8;
              var95 = ge.field_c;
              var95[0] = 8;
            }
            if (ua.field_c == 9) {
              var96 = ge.field_c;
              ge.field_c[1] = 6;
              var96[0] = 6;
            }
            if (ua.field_c == 10) {
              gd.field_d = 10;
              v.a(new d(sh.b(8, 640), -156, 0, sh.b(-128, 256) + 128, 16777215, 4), -4001);
            }
            if (ua.field_c == 11) {
              var97 = ge.field_c;
              ge.field_c[1] = 13;
              var97[0] = 13;
            }
            if (ua.field_c == 15) {
              var98 = ge.field_c;
              ge.field_c[1] = 11;
              var98[0] = 11;
            }
            if (ua.field_c == 16) {
              gd.field_d = 11;
              v.a(new d(sh.b(-8, 640), -156, 0, sh.b(118, 256) + 128, 16777215, 4), -4001);
            }
            if (19 == ua.field_c) {
              gd.field_d = 12;
              v.a(new d(sh.b(-128, 640), -156, 0, 128 + sh.b(2, 256), 16777215, 4), -4001);
            }
          }
        }
        if (gf.field_b > 0 &&
          rj.field_h < 3) {
          kk.field_d = kk.field_d - 1;
          if (kk.field_d <= 0) {
            kk.field_d = 50;
            gf.field_b = gf.field_b - 1;
            var3_ref_bfLifetime1 = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
            if (gf.field_b == 0) {
              var3_ref_bfLifetime1.field_l = 4;
            }
            if (gf.field_b == 1) {
              var3_ref_bfLifetime1.field_l = 0;
            }
            kh.field_y.b(69, var3_ref_bfLifetime1);
          }
        }
        if (ia.field_k >= tg.field_y) {
          if (tg.field_y < 1000) {
            if (tg.field_y <= 0) {
              var3Lifetime2 = tg.field_y + 10;
            } else {
              var3Lifetime2 = tg.field_y + (tg.field_y << 1) / 3;
            }
          } else {
            var3Lifetime2 = 500 + tg.field_y;
          }
          var4Lifetime2 = sh.b(-128, 640);
          tg.field_y = var3Lifetime2;
          kh.field_y.b(60, new bf(var4Lifetime2, -32, var4Lifetime2, 10));
        }
        if ((rj.field_h == 2 ||
          rj.field_h == 3) &&
          0 >= u.field_d) {
          il.field_i = il.field_i + (rj.field_h - 4);
          rj.field_h = 4;
        }
        if (rj.field_h == 3 &&
          nf.field_l < 2) {
          il.field_i = il.field_i + (-4 + rj.field_h);
          rj.field_h = 4;
        }
        if (ua.field_c <= ue.field_c[rj.field_h] &&
          fi.field_e.field_k > 0) {
          nf.field_e = nf.field_e + 2;
        }
        if (nf.field_e > 200) {
          if (rj.field_h == 0) {
            this.o(0);
          }
          if (rj.field_h == 1) {
            this.l((byte) 91);
          }
          if (2 == rj.field_h) {
            this.k((byte) 104);
          }
          if (rj.field_h == 3) {
            this.p(-256);
          }
        }
        if (dg.field_l < 96) {
          dg.field_l = dg.field_l + 1;
        }
        dl.field_a = 0;
        var3Lifetime3 = -64 / ((38 - param0) / 48);
        var9 = (bf) (kh.field_y.c(-3905));
        while (var9 != null) {
          stackOut_347_0 = var9.a(qc.field_c, this, 114);
          stackIn_353_0 = stackOut_347_0 ? 1 : 0;
          stackIn_348_0 = stackOut_347_0;
          if (!stackIn_348_0) {
            var9.b(4);
          }
          var9 = (bf) (kh.field_y.a(-16913));
        }
        stackIn_353_0Lifetime1 = -1;
        if (stackIn_353_0Lifetime1 > ~tj.field_G) {
          fi.field_e.field_k = 1;
        }
        for (var3Lifetime4 = 0; 4000 > var3Lifetime4; var3Lifetime4++) {
          if (null != qc.field_c[var3Lifetime4] &&
            null == qc.field_c[var3Lifetime4].a((byte) 108)) {
            qc.field_c[var3Lifetime4] = null;
            if (var3Lifetime4 < fi.field_d) {
              fi.field_d = var3Lifetime4;
            }
          }
        }
        if (vb.field_m > 0) {
          var35 = fi.field_e;
          if (rj.field_h < 4) {
            if (fi.field_e.field_k > 0) {
              if (wc.field_c[96]) {
                var35.field_n = var35.field_n - (jl.field_j + 3);
                if (var35.field_n < -250) {
                  var35.field_n = -250;
                }
                if (var35.field_n > 0) {
                  var35.field_n = var35.field_n * 95 / 100;
                }
              }
              if (wc.field_c[98]) {
                var35.field_z = var35.field_z - (jl.field_j + 3);
                if (var35.field_z < -250) {
                  var35.field_z = -250;
                }
                if (0 < var35.field_z) {
                  var35.field_z = -(var35.field_z * 95) / 100;
                }
              }
              if (wc.field_c[97]) {
                var35.field_n = var35.field_n + (3 + jl.field_j);
                if (var35.field_n > 250) {
                  var35.field_n = 250;
                }
                if (var35.field_n < 0) {
                  var35.field_n = 95 * var35.field_n / 100;
                }
              }
              if (!wc.field_c[96] &&
                !wc.field_c[97]) {
                var35.field_n = 90 * var35.field_n / 100;
              }
              if (wc.field_c[99]) {
                var35.field_z = var35.field_z + (3 + jl.field_j);
                if (var35.field_z > 120) {
                  var35.field_z = 120;
                }
                if (0 > var35.field_z) {
                  var35.field_z = 95 * var35.field_z / 100;
                }
              }
              if ((wc.field_c[82] ||
                wc.field_c[83]) &&
                var35.field_j == 0) {
                gi.field_g = false;
                u.field_b = u.field_b - 2;
                var35.field_j = 1;
              }
              if (!wc.field_c[98] &&
                !wc.field_c[99]) {
                var35.field_z = var35.field_z * 90 / 100;
              }
            }
          } else {
            var35.field_z = var35.field_z - (jl.field_j + 3);
            if (var35.field_z < -250) {
              var35.field_z = -250;
            }
            var35.field_f = (9 * var35.field_f + 320) / 10;
            if (var35.field_z > 0) {
              var35.field_z = -(95 * var35.field_z) / 100;
            }
            if (this.field_D < 250) {
              this.field_D = this.field_D + 1;
              var35.field_u = (320 + var35.field_u * 9) / 10;
              var35.field_z = 0;
            }
            if (this.field_D >= 250 &&
              64 > var35.field_u) {
              tj.field_G = 0;
              gj.field_c = -1;
              il.field_i = il.field_i + rj.field_h;
              var35.field_k = -1;
              this.field_D = 0;
              rj.field_h = 0;
              if (field_z == -1) {
                for (var3Lifetime5 = 0; var3Lifetime5 < 4000; var3Lifetime5++) {
                  qc.field_c[var3Lifetime5] = null;
                }
                var10 = (bf) (kh.field_y.c(-3905));
                while (var10 != null) {
                  if (fi.field_e != var10) {
                    var10.b(4);
                  }
                  var10 = (bf) (kh.field_y.a(-16913));
                }
                if (kd.field_C == 0 &&
                  jg.field_H == 0) {
                }
                hh.field_c = 0;
                bf.field_w = 0;
                ha.field_c = 0;
                jl.field_j = 5;
                vb.field_m = 2;
                var3Lifetime5Lifetime1 = 0;
                if (wk.a(108)) {
                  if (!(kd.field_C <= 0) ||
                    !(0 >= jg.field_H)) {
                    var3Lifetime5Lifetime1 = 6;
                  }
                } else {
                  pg.a(true, (byte) -121);
                  sa.a(nf.field_l + na.field_a * 3, 23820);
                  fc.field_e = fc.field_e - (ia.field_k << 1);
                  ia.field_k = 0;
                  if (jg.field_H <= 0) {
                    if (kd.field_C > 0) {
                      var3Lifetime5Lifetime1 = 2;
                    }
                  } else {
                    var3Lifetime5Lifetime1 = 5;
                  }
                }
                od.a(-106, var3Lifetime5Lifetime1, false);
              }
            }
          }
        }
        if (!(tj.field_G > 1000) ||
          !(se.field_m > 2)) {
          if ((2 == se.field_m) &&
            (ua.field_c == 20)) {
            tj.field_G = 0;
            hc.field_e = "hahahah";
          }
        } else {
          tj.field_G = 0;
          hc.field_e = "hahahah";
        }
        while (ad.e((byte) 103)) {
          stackIn_513_0 = ~field_E;
          stackIn_513_1 = -1;
          if (stackIn_513_0 < stackIn_513_1) {
            hc.field_e = hc.field_e.substring(1) + field_E;
            if ((!(se.field_m >= 2) ||
              !(ua.field_c >= 20) &&
              2 == se.field_m) && 2 <= ad.field_y) {
              stackIn_460_0 = (!a.field_a) ? 0 : 1;
              var3Lifetime6 = stackIn_460_0;
              if (hc.field_e.equalsIgnoreCase("thunder")) {
                cg.field_e = 7;
                a.field_a = true;
              }
              if (hc.field_e.equalsIgnoreCase("beeswax")) {
                tj.field_G = 10000;
                a.field_a = true;
              }
              if (hc.field_e.equalsIgnoreCase("diewell")) {
                ua.field_c = -1 + ue.field_c[rj.field_h];
                a.field_a = true;
                hc.field_e = "hahahah";
              }
              if (hc.field_e.equalsIgnoreCase("donefor")) {
                pf.field_d = 1000;
                a.field_a = true;
                jk.field_j = 0;
              }
              if (hc.field_e.equalsIgnoreCase("xebeams")) {
                hh.field_c = 1;
                kh.field_y.b(70, new bf(0, -128, 0, 13));
                a.field_a = true;
              }
              if (hc.field_e.equalsIgnoreCase("levskip")) {
                il.field_i = il.field_i + (rj.field_h - 2);
                u.field_d = 1;
                rj.field_h = 2;
                a.field_a = true;
                hc.field_e = "hahahah";
              }
              if (a.field_a &&
                var3Lifetime6 == 0) {
                fc.field_e = fc.field_e + 1;
                il.field_i = il.field_i + 1;
              }
            }
          }
          if (13 == lb.field_B) {
            if (rj.field_h != 4) {
              if (fi.field_e.field_k == 0 &&
                gj.field_c == 0) {
                if (25 > fi.field_e.field_r) {
                  fi.field_e.field_r = -fi.field_e.field_r + 192;
                } else if (!(fi.field_e.field_r >= 167)) {
                  fi.field_e.field_r = 167;
                }
              } else {
                od.a(-99, 1, false);
              }
              pg.a(true, (byte) -87);
              return;
            }
            fi.field_e.field_u = 32;
          }
          if (ad.field_y >= 2) {
            if (lb.field_B == 32) {
              if (qb.field_e != 0) {
                sd.field_c = 0;
                qb.field_e = 0;
              } else {
                sd.field_c = sd.field_c + 1;
              }
            }
            if (lb.field_B == 33) {
              if (qb.field_e != 1) {
                sd.field_c = 0;
                qb.field_e = 1;
              } else {
                sd.field_c = sd.field_c + 1;
              }
            }
            if (lb.field_B == 34) {
              if (2 == qb.field_e) {
                sd.field_c = sd.field_c + 1;
              } else {
                sd.field_c = 0;
                qb.field_e = 2;
              }
            }
          }
          if (gj.field_c != -1) {
            continue;
          }
          hc.field_e = "hahahah";
          cg.field_e = 0;
        }
        hc.field_c = hc.field_c + 1;
        vd.field_j = vd.field_j + 3;
        stackIn_513_0Lifetime1 = 2;
        stackIn_513_1Lifetime1 = ad.field_y;
        if (stackIn_513_0Lifetime1 <= stackIn_513_1Lifetime1 &&
          cg.field_e == 7) {
          jl.field_j = 20;
          il.field_i = il.field_i + 1;
          fc.field_e = fc.field_e + 1;
          vb.field_m = 20;
          a.field_a = true;
        }
        if (hc.field_c > 240) {
          qd.field_E[2] = qd.field_E[1];
          hc.field_c = hc.field_c - 240;
          qd.field_E[1] = qd.field_E[0];
          qd.field_E[0] = ge.field_c[0];
          qd.field_E[5] = qd.field_E[4];
          qd.field_E[4] = qd.field_E[3];
          qd.field_E[3] = ge.field_c[1];
          for (var3Lifetime7 = 0; var3Lifetime7 < 2; var3Lifetime7++) {
            stackIn_549_0 = ge.field_c[var3Lifetime7];
            stackIn_549_1 = 1;
            if (stackIn_549_0 == stackIn_549_1) {
              ge.field_c[var3Lifetime7] = 0;
            }
            if (ge.field_c[var3Lifetime7] == 3) {
              ge.field_c[var3Lifetime7] = 2;
            }
            if (ge.field_c[var3Lifetime7] == 4) {
              ge.field_c[var3Lifetime7] = 0;
            }
            if (ge.field_c[var3Lifetime7] == 5) {
              ge.field_c[var3Lifetime7] = 0;
            }
            if (ge.field_c[var3Lifetime7] == 6) {
              ge.field_c[var3Lifetime7] = 0;
            }
            if (8 == ge.field_c[var3Lifetime7]) {
              ge.field_c[var3Lifetime7] = 7;
            }
            if (ge.field_c[var3Lifetime7] == 9) {
              ge.field_c[var3Lifetime7] = 0;
            }
            if (10 == ge.field_c[var3Lifetime7]) {
              ge.field_c[var3Lifetime7] = 0;
            }
            if (ge.field_c[var3Lifetime7] == 11) {
              ge.field_c[var3Lifetime7] = 0;
            }
            if (ge.field_c[var3Lifetime7] == 13) {
              ge.field_c[var3Lifetime7] = 12;
            }
          }
        }
        stackIn_549_0Lifetime1 = vd.field_j;
        stackIn_549_1Lifetime1 = 480;
        if (stackIn_549_0Lifetime1 > stackIn_549_1Lifetime1) {
          vd.field_j = vd.field_j - 480;
        }
        if (0 > gj.field_c &&
          !bi.field_b) {
          lc.field_gb = lc.field_gb + 1;
          if (1280 < lc.field_gb) {
            lc.field_gb = -640;
          }
        }
        pg.a(true, (byte) -104);
        return;
    }

    final void s(int param0) {
        jl.field_j = jl.field_j + 5;
        dg.field_l = 0;
        mj.a(96, 12, 0, 28, 100);
        if (param0 != -9) {
          return;
        }
        mj.a(255, 12, 1200, 37, 100);
    }

    final void u(int param0) {
        vb.field_m = vb.field_m + 1;
        dg.field_l = 0;
        mj.a(96, param0 - 88, 0, 30, 100);
        mj.a(255, param0 ^ 104, 1200, 35, param0);
    }

    private final void l(byte param0) {
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        bf stackIn_65_0 = null;
        boolean stackIn_66_1 = false;
        int stackIn_77_0 = 0;
        int stackIn_78_1 = 0;
        bf stackIn_82_0 = null;
        boolean stackIn_83_1 = false;
        int stackIn_106_0 = 0;
        int stackIn_107_1 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        int var6;
        int var7;
        int var8;
        bf var9;
        int var10;
        bf var11;
        int var11_int;
        int var12;
        bf var13;
        bf var14;
        bf var15;
        var12 = field_A;
        var2 = sh.b(param0 - 31, 3) + ua.field_c;
        if (var2 > ue.field_c[rj.field_h] &&
          ua.field_c <= ue.field_c[rj.field_h]) {
          var2 = ue.field_c[rj.field_h];
        }
        if (param0 != 91) {
          this.l((byte) 51);
        }
        L2: {
          var3 = sh.b(35, 640);
          var4 = -64 + fi.field_e.field_f + sh.b(param0 ^ -39, 128);
          var5 = null;
          var10 = var2;
          if (var10 != 0 &&
            1 != var10 &&
            var10 != 4) {
            if (var10 == 5) {
              nf.field_e = 0;
              for (var10 = 0; var10 < 5; var10++) {
                kh.field_y.b(108, new bf(var3, 64 * -var10 - 64, var4, 1));
              }
            } else {
              boolean decompiledFrameCompleted0 = true;
              if (2 != var10 &&
                var10 != 6 &&
                var10 != 11 &&
                var10 != 13) {
                if (var10 != 3 &&
                  var10 != 16) {
                  if (var10 == 8) {
                    nf.field_e = 0;
                    for (var10 = -8; var10 <= 8; var10++) {
                      kh.field_y.b(86, new bf(320 + var10 * 24, -Math.abs(-64 + 64 * var10), 320 + 24 * var10, 1));
                    }
                  } else {
                    if (var10 == 18) {
                      var6 = -64;
                      nf.field_e = 0;
                      if (sh.b(param0 + 31, 2) == 0) {
                        var8 = 24;
                        var7 = 80;
                      } else {
                        var7 = 560;
                        var8 = -24;
                      }
                      for (var10 = -10; var10 <= 10; var10++) {
                        var11 = new bf(var7, var6, 640 - var7, 17);
                        var11.field_p = true;
                        var7 = var7 + var8;
                        var6 -= 16;
                        kh.field_y.b(param0 ^ 29, var11);
                      }
                    } else {
                      if (7 != var10 &&
                        var10 != 15 &&
                        var10 != 19) {
                        if (var10 != 9 &&
                          var10 != 14) {
                          if (10 == var10) {
                            nf.field_e = 50;
                            var10 = 0;
                            while (true) {
                              stackIn_106_0 = var10;
                              if (nf.field_l == 2) {
                                stackIn_107_1 = 10;
                              } else {
                                stackIn_107_1 = 5;
                              }
                              if (stackIn_106_0 >= stackIn_107_1) {
                                break L2;
                              }
                              kh.field_y.b(70, new bf(var3, -64 + -var10 * 64, var4, 4));
                              var10++;
                            }
                          }
                          switch (var10) {
                            case 12:
                              nf.field_e = -50;
                              kh.field_y.b(78, new bf(var3, -64, var3, 12));
                              break L2;
                            case 17:
                              nf.field_e = -50;
                              kh.field_y.b(61, new bf(32, -64, 32, 12));
                              kh.field_y.b(84, new bf(608, -64, 608, 12));
                              break L2;
                            default:
                              break L2;
                            case 20:
                              var9 = new bf(320, -256, var4, 15);
                              kh.field_y.b(param0 - 7, var9);
                              tj.field_C = var9.field_k;
                              ua.field_c = ue.field_c[rj.field_h] + 1;
                              pf.field_d = pf.field_d + 1;
                              dg.field_l = 0;
                              mj.a(255, 12, 0, 41, 100);
                              ti.field_f.a(kc.field_P);
                              kc.field_P.f();
                              kc.field_P = fl.field_h;
                              ti.field_f.b(kc.field_P);
                              kc.field_P.a(mc.field_b);
                              break L2;
                          }
                        }
                        nf.field_e = 0;
                        for (var10 = 0; var10 < 5; var10++) {
                          kh.field_y.b(95, new bf(var3, -64 + -var10 * 64, var4, 1));
                          kh.field_y.b(94, new bf(-var3 + 640, 64 * -var10 - 64, -var4 + 640, 1));
                        }
                      } else {
                        nf.field_e = 150;
                        kh.field_y.b(81, new bf(var3, -64, var4, 3));
                      }
                    }
                  }
                  break L2;
                }
                nf.field_e = 100;
                var10 = 0;
                while (true) {
                  stackIn_77_0 = ~var10;
                  if (2 == nf.field_l) {
                    stackIn_78_1 = 2;
                  } else {
                    stackIn_78_1 = 1;
                  }
                  if (stackIn_77_0 <= ~stackIn_78_1) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var11 = new bf(var3, -64 + -var10 * 64, sh.b(77, 128) - 64, 5);
                  var11.field_h = (bf) (var5);
                  if (3 == var2) {
                    stackIn_82_0 = var11;
                    stackIn_83_1 = (nf.field_l != 2);
                    stackIn_82_0.field_p = stackIn_83_1;
                  }
                  var5 = var11;
                  kh.field_y.b(59, var11);
                  var10++;
                }
              }
              if (decompiledFrameCompleted0) {
                nf.field_e = 0;
                var10 = 0;
                while (true) {
                  stackIn_60_0 = (2 == nf.field_l) ? 10 : 5;
                  if (stackIn_60_0 <= var10) {
                    break;
                  }
                  var15 = new bf(var3, -64 + -var10 * 64, var4, 2);
                  if (2 == var2) {
                    stackIn_65_0 = var15;
                    stackIn_66_1 = (nf.field_l != 2);
                    stackIn_65_0.field_p = stackIn_66_1;
                  }
                  var15.field_h = (bf) (var5);
                  if (var10 == 0) {
                    var5 = var15;
                  }
                  if (!var15.field_p) {
                    var15.field_i = -64 + (var3 + sh.b(-127, 128));
                  }
                  kh.field_y.b(param0 ^ 22, var15);
                  var10++;
                }
              }
            }
            break L2;
          }
          if (ua.field_c >= 4) {
            nf.field_e = 0;
            for (var10 = -3; var10 < 4; var10++) {
              kh.field_y.b(param0 ^ 5, new bf(24 * var10 + 320, -Math.abs(var10 * 64 - 64), var10 * 7680, 1));
            }
          } else {
            var13 = new bf(var3, -64, var4, 22);
            li.a(param0 - 207, var13);
            var13.field_n = sh.b(-128, 16) - 8;
            var13.field_z = sh.b(-127, 64) + 32;
            var13.field_l = sh.b(param0 - 219, 36);
            if (sh.b(26, 2) != 0) {
              stackIn_47_0 = 640 - sh.b(-128, 128);
            } else {
              stackIn_47_0 = sh.b(param0 - 217, 128);
            }
            var11_int = stackIn_47_0;
            var14 = new bf(var11_int, -128, var4, 22);
            li.a(-120, var14);
            var14.field_n = sh.b(51, 16) - 8;
            var14.field_z = sh.b(-126, 64) + 32;
            var14.field_l = sh.b(-126, 36);
            nf.field_e = var2 * 30 - (-25 - 50 * nf.field_l);
            kh.field_y.b(param0 + 3, new bf(128 + sh.b(11, 384), -128, fi.field_e.field_f, 1));
          }
        }
    }

    final void c(byte param0) {
        StarCannon.r(122);
        bj.a(-1);
        eb.a(true);
        pb.a(91);
        rd.e(-29826);
        bg.a(-115);
        lj.b(87);
        pc.b(-76);
        ag.j((byte) 39);
        ii.b((byte) 70);
        th.c(1719);
        gg.b((byte) 121);
        wk.a(true);
        gj.a(15686);
        ki.a();
        ue.b(0);
        qe.a();
        oh.a(-1);
        ec.a(82);
        rb.g((byte) -59);
        dd.a(-121);
        qa.a(-5504);
        mf.a(23675);
        kg.a((byte) 103);
        r.a(-76);
        ce.a(30518);
        j.a(-3);
        ri.a(-15552);
        fb.a(-113);
        nb.a(572996488);
        pk.a(4);
        qi.b(0);
        vf.a(false);
        fi.a(0);
        tk.a(-124);
        cg.a(89);
        qc.a(-1);
        bb.b(2);
        bf.a(15415);
        d.a(32);
        jl.a(0);
        m.b(-98);
        lh.a((byte) -113);
        wd.c();
        df.a();
        eh.g((byte) 101);
        ef.a((byte) 27);
        td.c(-12539);
        sb.b(105);
        ed.b((byte) -61);
        rf.b(false);
        ui.d((byte) -80);
        uh.b((byte) -115);
        md.a(-27240);
        int var2 = 82 / ((param0 + 63) / 62);
        n.f(0);
        gi.b(640);
        wc.c(-1);
        bi.b(0);
        ck.a(false);
        gf.a((byte) -126);
        sd.a(false);
        sc.a(0);
        wg.a((byte) -117);
        be.a(20342);
        tc.g(-14528);
        ok.i((byte) -90);
        lf.e(false);
        lc.m(-11147);
        ph.m(-1);
        kh.h((byte) 126);
        db.a(-117);
        rg.k(-128);
        hg.a(false);
        ma.a((byte) 67);
        sg.a(false);
        g.b(-12837);
        ak.a((byte) 94);
        nc.b((byte) 59);
        ti.a((byte) 13);
        je.a();
        nj.a();
        l.a();
        ja.a((byte) 80);
        ih.b((byte) -125);
        jf.a(true);
        ua.a(128);
        ne.a(-109);
        ia.k(36);
        fc.a(20811);
        u.a(2);
        hc.a(false);
        sa.a(30334);
        v.a((byte) -63);
        s.a((byte) -104);
        hh.a((byte) -22);
        vh.h((byte) -98);
        jh.b(126);
        ra.d((byte) 108);
        tg.h(-64);
        t.c((byte) 113);
        cb.b(0);
        la.a((byte) 1);
        ik.d(0);
        jb.a(-730625660);
        pd.a((byte) 98);
        vj.e(true);
        fg.a((byte) 6);
        hd.a((byte) 125);
        gl.a();
        fd.a(-12241);
        kl.a(21367);
        lb.a((byte) -49);
        ll.a(-1);
        ee.a((byte) 79);
        wi.b(64);
        bl.a(-29584);
        ac.a((byte) -77);
        a.a(-1);
        pe.a((byte) 93);
        ca.a(true);
        ai.a(0);
        hi.a((byte) 56);
        te.a(-1);
        dl.a(true);
        kk.a((byte) 63);
        nk.a();
        fk.a(-4918);
        va.b((byte) 80);
        mc.a((byte) 40);
        ea.a((byte) 48);
        ni.a(-81);
        w.b(3);
        eg.a((byte) -118);
        ci.a(-124);
        bd.a((byte) -74);
        uj.c((byte) -44);
        dk.a(-115);
        kf.a(0);
        kc.a(false);
        qd.h((byte) -37);
        vk.e((byte) 73);
        ba.c(125);
        dh.a((byte) -107);
        na.a(426388817);
        ff.f(-75);
        rc.a((byte) -14);
        ta.a(-32769);
        gd.a((byte) 123);
        ha.a((byte) -62);
        b.a(true);
        ic.a((byte) -120);
        wj.a(false);
        oe.b(12);
        le.a(-11434);
        hf.b(-22720);
        mg.c(0);
        jk.a(-124);
        nf.b(-109);
        ad.f((byte) -95);
        fe.f((byte) 73);
        qj.l(-102);
        fa.a(1851621384);
        kd.a(-16);
        ab.e((byte) 119);
        jg.e(934716193);
        pa.f(-200);
        gh.e(13329);
        qf.d((byte) 100);
        vg.b(-117);
        jj.a(0);
        el.e((byte) 115);
        sj.f((byte) 126);
        h.a();
        li.b(-23);
        se.c((byte) -2);
        ij.b(20756);
        ve.a(32729);
        tj.g(-123);
        af.g(9392);
        o.a(4432);
        ek.a(false);
        bh.a(-110);
        mi.d(1);
        ej.f(99);
        fl.e(115);
        cd.a(8192);
        wh.a(true);
        ob.d(-18147);
        rh.a(false);
        gb.b(122);
        fh.b((byte) -46);
        sh.b(4);
        tf.a(18172);
        ie.h(24288);
        vc.b((byte) 35);
        re.d(0);
        hj.a((byte) -45);
        ld.g(8240);
        oj.d(-113);
        ah.a(-91);
        rj.a(-1);
        hb.a(9681);
        pf.a(true);
        ig.a(-1);
        qb.a(-115);
        ge.a(45);
        q.b((byte) 119);
        kj.a(0);
        mj.a(true);
        od.a(83);
        cl.d((byte) 121);
        vd.a(32);
        ae.a((byte) 64);
        bc.b((byte) -128);
        we.b((byte) 95);
        dg.d(124);
        of.a(true);
        il.b(2147483647);
        nh.a(false);
        nd.g(0);
        cc.e((byte) -98);
        cf.f(1);
        di.f(24979);
        vb.e((byte) 114);
        og.a((byte) 92);
        oi.a(false);
        p.a(11);
        uc.e(1);
        sk.a(false);
        this.field_u = null;
    }

    final void d(byte param0) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        Object stackIn_7_1 = null;
        boolean stackIn_8_2 = false;
        boolean stackIn_88_0 = false;
        Object var2;
        int var3_int;
        wf var3;
        int var4;
        int var5;
        int var6;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var3_intLifetime1Lifetime1;
        var6 = field_A;
        if (n.field_a != null) {
          stackIn_3_0 = n.field_a;
        } else {
          stackIn_3_0 = kj.field_E;
        }
        var2 = stackIn_3_0;
        if (le.c(4)) {
          stackIn_7_0 = 320;
          stackIn_7_1 = var2;
          if (n.field_a != null) {
            stackIn_8_2 = true;
          } else {
            stackIn_8_2 = dl.field_d;
          }
          ee.a(stackIn_7_0, (java.awt.Canvas) (stackIn_7_1), stackIn_8_2);
          return;
        }
        if (param0 != 22) {
          this.l((byte) -102);
        }
        if (!ld.field_ib) {
          oi.a((java.awt.Canvas) (var2), (byte) -128);
          return;
        }
        if (oh.field_a != null) {
          ma.a(q.field_i, -13923, 100.0f);
          oi.a((java.awt.Canvas) (var2), (byte) 72);
          return;
        }
        if (qc.field_d == 0) {
          ki.b();
        } else {
          var3_int = (320 - fi.field_e.field_f) / 48;
          eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
          eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
          eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
          var3_int += 320;
          eb.field_b[qd.field_E[5]].a(var3_int, hc.field_c + 240, 320, 240);
          eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
          eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
          var3_int += 320;
          eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
          eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
          eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
          var3_int -= 960;
          eb.field_b[qd.field_E[5]].a(var3_int, 240 + hc.field_c, 320, 240);
          eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
          eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
        }
        if (gj.field_c == -1) {
          if (50 <= cd.field_c) {
            gb.field_r.d(-gb.field_r.field_x + 640 >> 1, 0);
          } else {
            gj.field_e.d(-gj.field_e.field_x + 640 >> 1, 0);
            if (25 >= cd.field_c &&
              field_z != -2) {
              gb.field_r.e(640 - gb.field_r.field_x >> 1, 0, -(cd.field_c * 10) + 250);
            }
            if (cd.field_c > 25) {
              gb.field_r.e(-gb.field_r.field_x + 640 >> 1, 0, -250 + 10 * cd.field_c);
            }
          }
        }
        if (pa.field_L != field_z) {
          if (cd.field_c <= 25) {
            var3_intLifetime1 = -cd.field_c + 25 << 2;
            if (-1 == field_z) {
              this.b(var3_intLifetime1, 7306);
            }
            if (pa.field_L == -1) {
              this.b(-var3_intLifetime1 + 100, 7306);
            }
            if (3 == pa.field_L &&
              1 == field_z) {
              this.b(0, 7306);
            }
            if (pa.field_L == 1 &&
              field_z == 3) {
              this.b(0, param0 + 7284);
            }
            if (field_z >= 0) {
              fg.field_a[field_z].a(320, var3_intLifetime1);
            }
          }
          if (cd.field_c > 25 &&
            pa.field_L >= 0) {
            var3_intLifetime1Lifetime1 = -25 + cd.field_c << 2;
            if (pa.field_L == -1) {
              this.b(var3_intLifetime1Lifetime1, 7306);
            }
            if (field_z == -1) {
              this.b(-var3_intLifetime1Lifetime1 + 100, 7306);
            }
            if (pa.field_L == 3 &&
              field_z == 1) {
              this.b(0, 7306);
            }
            if (1 == pa.field_L &&
              3 == field_z) {
              this.b(0, 7306);
            }
            fg.field_a[pa.field_L].a(320, var3_intLifetime1Lifetime1);
          }
        } else {
          if (field_z == -1) {
            this.b(100, 7306);
          } else {
            if (field_z == 1) {
              this.b(0, 7306);
            }
            if (3 == field_z &&
              lf.field_cb == 1) {
              this.b(0, 7306);
            }
            fg.field_a[field_z].a(320, 100);
          }
        }
        var3 = (wf) (pk.field_a.c(-3905));
        if (var3 != null) {
          var5 = this.field_B;
          if (80 <= var5) {
            if (230 <= var5) {
              var4 = -(var5 / 2) + 123;
            } else {
              var4 = 8;
            }
          } else {
            var4 = var5 / 2 - 32;
          }
          j.field_c[var3.field_g].c(8, var4);
          af.field_y.a(di.field_j[var3.field_g], 48, var4 + af.field_y.field_p, 65535, -1);
        }
        if (nh.field_e != 0) {
          var4Lifetime1 = 256 * jb.field_e / 50;
          if (0 < var4Lifetime1) {
            ki.b(0, 0, ki.field_j, ki.field_f, 0, var4Lifetime1);
          }
        }
        if (gh.f(-23093)) {
          ki.b(0, 0, 640, 480, 0, 128);
          ki.d(-12 + (-(ii.a(6940) / 2) + 320), -12 - wc.d(20) / 2 + 240, 24 + ii.a(6940), 24 + wc.d(20), 0);
          fg.a(32513, jk.field_f, 12, 12);
        }
        if (cb.a(false) &&
          !gh.f(param0 ^ -23075)) {
          stackIn_88_0 = (n.field_a != null);
          jf.a(stackIn_88_0, param0 ^ 106);
        }
        dd.a((java.awt.Canvas) (var2), 0, 0, -23466);
        return;
    }

    final void f(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = field_A;
        this.a(9, 9, 0, 8, true, 6, false, 7);
        hh.field_b = new hl[9];
        for (var2 = 0; var2 < 9; var2++) {
          hh.field_b[var2] = new hl(1, 1);
          hh.field_b[var2].field_B[0] = 65535;
        }
        var2Lifetime1 = 60 % ((param0 + 23) / 47);
        sb.field_m = 33023;
        hh.field_b[4] = null;
        ig.field_b = 16777215;
        sd.field_a = 33023;
        df.a(22050, false, 10);
        nb.field_f = df.a(nb.field_e, (java.awt.Component) ((Object) kj.field_E), 0, 512);
        ea.field_d = df.a(nb.field_e, (java.awt.Component) ((Object) kj.field_E), 1, 22050);
        jk.field_k = new vi();
        ti.field_f = new vi();
        nb.field_f.a(jk.field_k);
        ea.field_d.a(ti.field_f);
        se.field_m = 0;
        bi.field_b = false;
        mc.field_b = 128;
        dg.field_l = 0;
        nb.field_g = 64;
        lc.field_gb = -2048;
        nf.field_l = 0;
        ua.field_c = -2;
        qc.field_d = 2;
        this.a(false, false, false, true, -752);
        wa.a(0, -75, 16777215, 0, rj.field_l, (java.applet.Applet) (this));
    }

    final void a(int param0) {
        if (n.field_a != null) {
          re.a(param0 ^ -25109);
        }
        if (null != nb.field_f) {
          nb.field_f.b();
        }
        if (null != ea.field_d) {
          ea.field_d.b();
        }
        la.a(2);
        if (param0 != -25109) {
          this.m((byte) 25);
        }
    }

    public static void r(int param0) {
        field_C = null;
        if (param0 <= 121) {
          return;
        }
        field_y = null;
    }

    private final void b(boolean param0) {
        int fieldTemp$0 = 0;
        int var3;
        var3 = field_A;
        oe.field_a = oe.field_a - 1;
        ja.field_d = ja.field_d + 1;
        if (kg.field_a != 0) {
          na.field_d = na.field_d + fc.field_e;
          il.field_i = il.field_i + 2;
          oe.field_a = oe.field_a + 1;
          ja.field_d = ja.field_d + 1;
          fc.field_e = fc.field_e - jl.field_d * fc.field_e;
        }
        if (wc.field_c[98]) {
          jl.field_d = jl.field_d + pe.field_d;
          ja.field_d = ja.field_d + 5;
          oe.field_a = oe.field_a + 5;
          il.field_i = il.field_i + 10;
          fc.field_e = fc.field_e - pe.field_d * na.field_d;
        }
        if (wc.field_c[99]) {
          oe.field_a = oe.field_a + 3;
          na.field_d = na.field_d - kc.field_Q;
          fc.field_e = fc.field_e + jl.field_d * kc.field_Q;
          ja.field_d = ja.field_d + 7;
          il.field_i = il.field_i + 10;
        }
        if (wc.field_c[84]) {
          fc.field_e = fc.field_e - na.field_d;
          jl.field_d = jl.field_d + 1;
          oe.field_a = oe.field_a + 10;
          ja.field_d = ja.field_d - 10;
        }
        va.field_f = va.field_f + 1;
        se.field_u = 256;
        if (5 < va.field_f) {
          va.field_f = va.field_f - 5;
          pd.field_a = pd.field_a + 1;
          if (pd.field_a >= 5) {
            pd.field_a = pd.field_a - 5;
          }
        }
        if (null != pk.field_a.c(-3905)) {
          fieldTemp$0 = this.field_B + 1;
          this.field_B = this.field_B + 1;
          if (fieldTemp$0 == 335) {
            this.field_B = 0;
            pk.field_a.a((byte) 39);
          }
        }
        if (nh.field_e != 0) {
          if (1 == nh.field_e) {
            jb.field_e = jb.field_e + 1;
            if (jb.field_e == 50) {
              if (!gh.f(-23093)) {
                pk.b(0);
              } else {
                mf.a((byte) -58);
              }
              nh.field_e = 2;
            }
          } else {
            if (nh.field_e != 2) {
              jb.field_e = jb.field_e - 1;
              if (jb.field_e == 0) {
                nh.field_e = 0;
              }
            } else {
              if (wk.a(77)) {
                field_z = vj.field_ab;
              } else {
                oh.field_a = og.a(4, (byte) 113);
                sa.a(nf.field_l + na.field_a * 3, 23820);
                field_z = ff.field_o;
              }
              if (gh.f(-23093)) {
                hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, a.field_b, -11, 12, false);
              }
              nh.field_e = 3;
              pa.field_L = field_z;
            }
          }
        } else {
          if (pa.field_L == field_z) {
            if (field_z != -1) {
              fg.field_a[field_z].b(0);
            } else {
              this.m((byte) 110);
            }
          } else {
            cd.field_c = cd.field_c + 1;
            if (25 <= cd.field_c &&
              -1 == pa.field_L) {
              cd.field_c = 50;
            }
            if (cd.field_c >= 50) {
              field_z = pa.field_L;
            }
          }
        }
        if (!param0) {
          this.t(-117);
        }
    }

    public StarCannon() {
        this.field_D = 0;
        this.field_B = 0;
    }

    final static void a(ue param0, boolean param1, int param2, ue param3, ue param4) {
        try {
          qa.field_a = uf.a("", 15);
          if (param2 != -20169) {
            field_E = 's';
          }
          qa.field_a.a(false, false);
          fc.a(param0, param4, (byte) 95, param3);
          td.b(30000);
          ie.field_x = cl.field_k;
          uh.field_k = cl.field_k;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "StarCannon.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k(byte param0) {
        int stackIn_58_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_104_0 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        bf var6;
        int var7;
        int var8;
        bf var8_ref_bf;
        int var9;
        int var10;
        bf var11;
        int var12;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        bf var11Lifetime1;
        int var8Lifetime1Lifetime1;
        var12 = field_A;
        var2 = sh.b(-127, 3) + ua.field_c;
        if (ue.field_c[rj.field_h] < var2 &&
          ua.field_c <= ue.field_c[rj.field_h]) {
          var2 = ue.field_c[rj.field_h];
        }
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted2 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var3 = sh.b(-126, 640);
        var4 = -64 + fi.field_e.field_f + sh.b(-127, 128);
        var5 = null;
        var7 = var2;
        if (var7 != 0 &&
          3 != var7) {
          if (var7 == 10) {
            nf.field_e = 0;
            var7 = -64;
            if (sh.b(-126, 2) == 0) {
              var8 = 80;
              var9 = 24;
            } else {
              var9 = -24;
              var8 = 560;
            }
            for (var10 = -10; 10 >= var10; var10++) {
              var11 = new bf(var8, var7, 640 - var8, 17);
              var7 -= 16;
              var11.field_p = true;
              var8 = var8 + var9;
              kh.field_y.b(107, var11);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var7 != 1 &&
              11 != var7 &&
              var7 != 5) {
              if (2 != var7 &&
                var7 != 9) {
                if (var7 != 4 &&
                  var7 != 15) {
                  if (var7 != 6 &&
                    19 != var7) {
                    if (7 == var7) {
                      nf.field_e = 0;
                      kh.field_y.b(73, new bf(var3, -64, var4, 3));
                      kh.field_y.b(64, new bf(640 - var3, -64, 640 - var3, 21));
                    } else {
                      if (var7 != 8 &&
                        var7 != 14) {
                        if (var7 != 12 &&
                          var7 != 16) {
                          if (13 == var7) {
                            nf.field_e = -50;
                            var7 = sh.b(-126, 180) + 32;
                            kh.field_y.b(74, new bf(var7, -64, var7, 12));
                            var7 = 608 - sh.b(-128, 180);
                            kh.field_y.b(56, new bf(var7, -64, var7, 12));
                          } else {
                            if (var7 == 17) {
                              nf.field_e = -50;
                              kh.field_y.b(82, new bf(32, -64, 32, 21));
                              if (sh.b(34, 2) == 0) {
                                kh.field_y.b(91, new bf(320, -32, 320, 18));
                                kh.field_y.b(67, new bf(320, -96, 320, 18));
                                kh.field_y.b(79, new bf(320, -160, 320, 18));
                              } else {
                                kh.field_y.b(69, new bf(320, -96, 320, 21));
                              }
                              kh.field_y.b(106, new bf(608, -64, 608, 21));
                            } else {
                              if (18 == var7) {
                                nf.field_e = 150;
                                kh.field_y.b(76, new bf(var3, -64, var4, 3));
                                var7 = 0;
                                while (true) {
                                  stackIn_104_0 = (2 == nf.field_l) ? 2 : 1;
                                  if (stackIn_104_0 <= var7) {
                                    kh.field_y.b(107, new bf(-var3 + 640, -64, 640 - var4, 3));
                                    decompiledFrameCompleted2 = false;
                                    break;
                                  }
                                  kh.field_y.b(112, new bf(320, 64 * -var7 - 128, 320, 3));
                                  var7++;
                                }
                              }
                              if ((decompiledFrameCompleted2) &&
                                ((20 == var7))) {
                                var6 = new bf(320, -256, var4, 16);
                                kh.field_y.b(88, var6);
                                tj.field_C = var6.field_k;
                                ua.field_c = 1 + ue.field_c[rj.field_h];
                                pf.field_d = pf.field_d + 1;
                                dg.field_l = 0;
                                mj.a(255, 12, 0, 41, 100);
                                ti.field_f.a(kc.field_P);
                                kc.field_P.f();
                                kc.field_P = fl.field_h;
                                ti.field_f.b(kc.field_P);
                                kc.field_P.a(mc.field_b);
                              }
                            }
                          }
                        } else {
                          nf.field_e = 100;
                          kh.field_y.b(75, new bf(var3, -64, -64 + sh.b(-1, 128), 5));
                        }
                      } else {
                        nf.field_e = 0;
                        var7 = 0;
                        if (sh.b(62, 2) != 0) {
                          var9Lifetime1 = -24;
                          var8Lifetime1 = 560;
                        } else {
                          var8Lifetime1 = 80;
                          var9Lifetime1 = 24;
                        }
                        for (var10Lifetime1 = -10; var10Lifetime1 <= 10; var10Lifetime1++) {
                          var11Lifetime1 = new bf(var8Lifetime1, var7, 640 - var8Lifetime1, 17);
                          var7 -= 16;
                          var11Lifetime1.field_p = true;
                          var8Lifetime1 = var8Lifetime1 + var9Lifetime1;
                          kh.field_y.b(100, var11Lifetime1);
                        }
                        var8Lifetime1Lifetime1 = 64 + sh.b(100, 512);
                        kh.field_y.b(95, new bf(var8Lifetime1Lifetime1, -96, var8Lifetime1Lifetime1, 21));
                      }
                    }
                  } else {
                    nf.field_e = 0;
                    for (var7 = 0; 5 > var7; var7++) {
                      kh.field_y.b(117, new bf(var3, -64 + -var7 * 64, var4, 1));
                    }
                    kh.field_y.b(122, new bf(-var3 + 640, -64, -var3 + 640, 21));
                  }
                } else {
                  nf.field_e = 0;
                  for (var7 = 0; 5 > var7; var7++) {
                    kh.field_y.b(81, new bf(var3, -64 + -var7 * 64, var4, 1));
                  }
                  kh.field_y.b(57, new bf(640 - var3, -64, -var4 + 640, 3));
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted2);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted2)) {
                nf.field_e = 175;
                var7 = 0;
                while (true) {
                  stackIn_67_0 = var7;
                  if (2 != nf.field_l) {
                    stackIn_68_1 = 5;
                  } else {
                    stackIn_68_1 = 10;
                  }
                  if (stackIn_67_0 >= stackIn_68_1) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  kh.field_y.b(63, new bf(var3, -64 + 64 * -var7, var4, 4));
                  var7++;
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted2) &&
              (decompiledFrameCompleted1)) {
              nf.field_e = 0;
              var4 = var3 + sh.b(-24, 128) - 64;
              var7 = 0;
              while (true) {
                stackIn_58_0 = ~var7;
                if (nf.field_l == 2) {
                  stackIn_59_1 = 10;
                } else {
                  stackIn_59_1 = 5;
                }
                if (stackIn_58_0 <= ~stackIn_59_1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var8_ref_bf = new bf(var3, -64 + 64 * -var7, var4, 2);
                var8_ref_bf.field_h = (bf) (var5);
                kh.field_y.b(115, var8_ref_bf);
                if (var7 == 0) {
                  var5 = var8_ref_bf;
                }
                var7++;
              }
            }
          }
        }
        if ((decompiledFrameRemainder0) &&
          (decompiledFrameCompleted2) &&
          (decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          nf.field_e = 0;
          for (var7Lifetime1 = -8; var7Lifetime1 < 8; var7Lifetime1++) {
            kh.field_y.b(88, new bf(320 + var7Lifetime1 * 24, -Math.abs(-64 + var7Lifetime1 * 64), 24 * var7Lifetime1 + 320, 1));
          }
        }
        if (param0 < 79) {
          this.o(112);
        }
    }

    static {
        field_y = new int[8192];
        field_C = "Menu";
        field_z = -2;
    }
}
