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
          MatchingFieldValidator.a(fb.field_g, 30962);
          fb.field_g = null;
          ModalDialogHost.j(param0 ^ -23491);
        }
        lj.field_h = b.a(false, 1);
        AccountNameAvailabilityValidator.field_p = b.a(false, 2);
        if (param0 != -23523) {
          return;
        }
        RichTextLayout.field_l = b.a(false, 3);
        jg.field_F = b.a(false, 4);
        BoundedRandomAccessFile.field_c = b.a(false, 5);
        ej.a(FrameTimer.field_f, ProgressDialog.field_eb, param0 + 23396);
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
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = field_A;
                    var3 = 0;
                    statePc = 1;
                    continue scanLoop1;
                }
                case 1: {
                    if (var3 >= 4000) {
                        /* Inlined CFG state: 8. */
                        {
                            param0 = 100 - param0 >> 2;
                            if (FullscreenFocusCanvas.field_d < 1) {
                                /* Inlined CFG state: 11. */
                                {
                                    var3 = 0;
                                    statePc = 12;
                                    continue scanLoop1;
                                }
                            } else {
                                /* Inlined CFG state: 9. */
                                {
                                    fh.field_q.drawScaledAlpha(0, vd.field_j, 640, 480, 128);
                                    fh.field_q.drawScaledAlpha(0, -480 + vd.field_j, 640, 480, 128);
                                    statePc = 19;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        /* Inlined CFG state: 2. */
                        {
                            stackIn_147_0 = FullscreenFocusCanvas.field_c[var3];
                            stackIn_3_0 = stackIn_147_0;
                            if (false) {
                                statePc = 147;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 3. */
                                {
                                    if (stackIn_3_0 == null) {
                                        statePc = 7;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 4. */
                                        {
                                            if (FullscreenFocusCanvas.field_c[var3].field_h == 4) {
                                                /* Inlined CFG state: 6. */
                                                {
                                                    FullscreenFocusCanvas.field_c[var3].a(320 - FrameTimer.field_e.field_f, 123);
                                                    statePc = 7;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                statePc = 7;
                                                continue scanLoop1;
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
                    continue scanLoop1;
                }
                case 12: {
                    if (var3 >= 4000) {
                        statePc = 19;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 13. */
                        {
                            stackIn_147_0 = FullscreenFocusCanvas.field_c[var3];
                            stackIn_14_0 = stackIn_147_0;
                            if (false) {
                                statePc = 147;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 14. */
                                {
                                    if (stackIn_14_0 == null) {
                                        statePc = 18;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 15. */
                                        {
                                            if (FullscreenFocusCanvas.field_c[var3].field_h == 3) {
                                                /* Inlined CFG state: 17. */
                                                {
                                                    FullscreenFocusCanvas.field_c[var3].a(320 - FrameTimer.field_e.field_f, -91);
                                                    statePc = 18;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                statePc = 18;
                                                continue scanLoop1;
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
                    continue scanLoop1;
                }
                case 19: {
                    if (param1 == 7306) {
                        /* Inlined CFG state: 21. */
                        {
                            var15 = (bf) (AccountRegistrationPanel.field_y.beginForward(-3905));
                            statePc = 22;
                            continue scanLoop1;
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
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 23. */
                        {
                            var15.a(65535, 320 - FrameTimer.field_e.field_f);
                            var15 = (bf) (AccountRegistrationPanel.field_y.nextForward(-16913));
                            statePc = 22;
                            continue scanLoop1;
                        }
                    }
                }
                case 25: {
                    if (var3 >= 4000) {
                        /* Inlined CFG state: 34. */
                        {
                            var3 = 0;
                            statePc = 35;
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 26. */
                        {
                            stackIn_163_0 = null;
                            stackIn_27_0 = stackIn_163_0;
                            stackIn_163_1 = FullscreenFocusCanvas.field_c[var3];
                            stackIn_27_1 = stackIn_163_1;
                            if (false) {
                                statePc = 163;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 27. */
                                {
                                    if (stackIn_27_0 == stackIn_27_1) {
                                        statePc = 33;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 28. */
                                        {
                                            if (FullscreenFocusCanvas.field_c[var3].field_h == 2) {
                                                statePc = 33;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 29. */
                                                {
                                                    if (FullscreenFocusCanvas.field_c[var3].field_h == 3) {
                                                        statePc = 33;
                                                    } else {
                                                        statePc = 30;
                                                    }
                                                    continue scanLoop1;
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
                    if (FullscreenFocusCanvas.field_c[var3].field_h != 4) {
                        /* Inlined CFG state: 32. */
                        {
                            FullscreenFocusCanvas.field_c[var3].a(-FrameTimer.field_e.field_f + 320, 54);
                            statePc = 33;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 33;
                        continue scanLoop1;
                    }
                }
                case 33: {
                    var3++;
                    statePc = 25;
                    continue scanLoop1;
                }
                case 35: {
                    if (var3 >= 4000) {
                        /* Inlined CFG state: 42. */
                        {
                            if (FullscreenFocusCanvas.field_d == 2) {
                                /* Inlined CFG state: 44. */
                                {
                                    gi.a(param1 - 7302);
                                    statePc = 45;
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 45;
                                continue scanLoop1;
                            }
                        }
                    } else {
                        /* Inlined CFG state: 36. */
                        {
                            stackIn_147_0 = FullscreenFocusCanvas.field_c[var3];
                            stackIn_37_0 = stackIn_147_0;
                            if (false) {
                                statePc = 147;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 37. */
                                {
                                    if (stackIn_37_0 == null) {
                                        statePc = 41;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 38. */
                                        {
                                            if (FullscreenFocusCanvas.field_c[var3].field_h == 2) {
                                                /* Inlined CFG state: 40. */
                                                {
                                                    FullscreenFocusCanvas.field_c[var3].b(-FrameTimer.field_e.field_f + 320, 128);
                                                    FullscreenFocusCanvas.field_c[var3].a(-FrameTimer.field_e.field_f + 320, param1 ^ 7322);
                                                    statePc = 41;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                statePc = 41;
                                                continue scanLoop1;
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
                    continue scanLoop1;
                }
                case 45: {
                    var3 = 0;
                    statePc = 46;
                    continue scanLoop1;
                }
                case 46: {
                    if (var3 >= 4000) {
                        statePc = 53;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 47. */
                        {
                            /* Sequential CFG blocks: 47, 48. */
                            {
                                stackIn_48_0 = null;
                                stackIn_48_1 = FullscreenFocusCanvas.field_c[var3];
                            }
                            {
                                if (stackIn_48_0 == stackIn_48_1) {
                                    statePc = 52;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 49. */
                                    {
                                        if (2 == FullscreenFocusCanvas.field_c[var3].field_h) {
                                            /* Inlined CFG state: 51. */
                                            {
                                                FullscreenFocusCanvas.field_c[var3].b(-FrameTimer.field_e.field_f + 320, param1 ^ 7178);
                                                FullscreenFocusCanvas.field_c[var3].a(320 - FrameTimer.field_e.field_f, -56);
                                                statePc = 52;
                                                continue scanLoop1;
                                            }
                                        } else {
                                            statePc = 52;
                                            continue scanLoop1;
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
                    continue scanLoop1;
                }
                case 53: {
                    if (MouseWheelSource.field_c > -1) {
                        /* Inlined CFG state: 55. */
                        {
                            var3 = DropTargetWidgetContainer.field_y.stringWidth(DequeWidgetContainer.field_w);
                            ba.a(24, gb.field_v, (byte) -127, -var3 + 604 - 17, 17 + var3, 455 + param0);
                            nb.a(param0 + 455, (byte) 122, var3 + 17, ma.field_e, -17 - var3 + 604, 128, 24);
                            DropTargetWidgetContainer.field_y.drawRightAligned(DequeWidgetContainer.field_w, 596, 472 + param0, 16777215, -1);
                            ba.a(24, ma.field_a, (byte) 21, 604, 35, 455 + param0);
                            nb.a(455 + param0, (byte) 122, 35, ha.field_a, 604, 128, 24);
                            MatchingFieldValidator.field_l.draw(609, param0 + 460);
                            DropTargetWidgetContainer.field_y.drawString(Integer.toString(MouseWheelSource.field_c), 626, 472 + param0, 16777215, -1);
                            var4_ref_String = be.field_b;
                            var5 = 65535;
                            var6 = 32896;
                            if (qb.field_e != 1) {
                                statePc = 57;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 56. */
                                {
                                    var5 = 65280;
                                    var6 = 32768;
                                    var4_ref_String = b.field_d;
                                    statePc = 57;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        statePc = 116;
                        continue scanLoop1;
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
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 60;
                        continue scanLoop1;
                    }
                }
                case 60: {
                    var7 = 6;
                    if (rj.field_h != 1) {
                        statePc = 62;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 61. */
                        {
                            var7 = 10;
                            statePc = 62;
                            continue scanLoop1;
                        }
                    }
                }
                case 62: {
                    if (rj.field_h == 2) {
                        /* Inlined CFG state: 64. */
                        {
                            var7 = 16;
                            statePc = 65;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 65;
                        continue scanLoop1;
                    }
                }
                case 65: {
                    if (3 == rj.field_h) {
                        /* Inlined CFG state: 67. */
                        {
                            var7 = 17;
                            statePc = 68;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 68;
                        continue scanLoop1;
                    }
                }
                case 68: {
                    var3 = DropTargetWidgetContainer.field_y.stringWidth(var4_ref_String);
                    ba.a(24, gb.field_v, (byte) -122, 1, var3 + 17, 455 + param0);
                    nb.a(param0 + 455, (byte) 122, var3 + 17, ma.field_e, 1, 128, 24);
                    DropTargetWidgetContainer.field_y.drawString(var4_ref_String, 10, 472 + param0, 16777215, -1);
                    var8 = 23 + var3;
                    ba.a(24, ma.field_a, (byte) -115, var8 - 5, 10 + var7 * 5, param0 + 455);
                    nb.a(param0 + 455, (byte) 122, 10 + var7 * 5, ha.field_a, var8 - 5, 128, 24);
                    var9 = 0;
                    statePc = 69;
                    continue scanLoop1;
                }
                case 69: {
                    if (var7 <= var9) {
                        /* Inlined CFG state: 76. */
                        {
                            stackIn_77_0 = ~AlphaWidgetContainer.field_C;
                            stackIn_77_1 = -1;
                            statePc = 77;
                            continue scanLoop1;
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
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 71. */
                                {
                                    if (stackIn_71_0 <= stackIn_71_1) {
                                        /* Inlined CFG state: 74. */
                                        {
                                            SoftwareRasterizer.fillRectangle(var8, 465 + param0, 4, 4, var5);
                                            statePc = 75;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        /* Inlined CFG state: 72. */
                                        {
                                            SoftwareRasterizer.fillRectangle(var8, 460 + param0, 4, 14, var5);
                                            statePc = 75;
                                            continue scanLoop1;
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
                    continue scanLoop1;
                }
                case 77: {
                    if (stackIn_77_0 >= stackIn_77_1) {
                        statePc = 79;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 78. */
                        {
                            var9 = -(DropTargetWidgetContainer.field_y.field_p / 2) + DropTargetWidgetContainer.field_w[16 + qb.field_e].field_e - 16;
                            dupTemp$2 = DropTargetWidgetContainer.field_w[qb.field_e + 16];
                            dupTemp$2.field_f = dupTemp$2.field_f + var9;
                            var16 = p.field_e;
                            var14 = new id[1];
                            var10_ref_id__ = var14;
                            var14[0] = DropTargetWidgetContainer.field_w[16 + qb.field_e];
                            DropTargetWidgetContainer.field_y.setInlineSprites(var10_ref_id__, (int[]) null);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(var16, 319, 48, var6, -1, 256 - param0 * 10);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(var16, 321, 48, var5, -1, -(param0 * 10) + 256);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(var16, 320, 47, var5, -1, -(10 * param0) + 256);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(var16, 320, 49, var6, -1, -(param0 * 10) + 256);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(var16, 320, 48, 16777215, -1, -(param0 * 10) + 256);
                            dupTemp$3 = DropTargetWidgetContainer.field_w[qb.field_e + 16];
                            dupTemp$3.field_f = dupTemp$3.field_f - var9;
                            statePc = 79;
                            continue scanLoop1;
                        }
                    }
                }
                case 79: {
                    var9 = 10 * BitPacketBuffer.field_k;
                    if (nf.field_l == 0) {
                        /* Inlined CFG state: 81. */
                        {
                            var9 = var9 >> 2;
                            statePc = 82;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 82;
                        continue scanLoop1;
                    }
                }
                case 82: {
                    if (nf.field_l == 2) {
                        /* Inlined CFG state: 84. */
                        {
                            var9 = var9 << 1;
                            statePc = 85;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 85;
                        continue scanLoop1;
                    }
                }
                case 85: {
                    if (!a.field_a) {
                        /* Inlined CFG state: 87. */
                        {
                            var3 = DropTargetWidgetContainer.field_y.stringWidth(rd.field_o);
                            ba.a(24, gb.field_v, (byte) -118, -var3 + 311, 17 + var3, -param0 + 1);
                            nb.a(1 - param0, (byte) 122, var3 + 17, ma.field_e, 311 - var3, 128, 24);
                            DropTargetWidgetContainer.field_y.drawRightAligned(rd.field_o, 320, -param0 + 18, 16777215, -1);
                            var17 = Integer.toString(var9);
                            var3 = 11 + DropTargetWidgetContainer.field_y.stringWidth(var17);
                            var11 = 5 - var3 % 5;
                            if (var11 < 5) {
                                /* Inlined CFG state: 89. */
                                {
                                    var3 = var3 + var11;
                                    statePc = 90;
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 90;
                                continue scanLoop1;
                            }
                        }
                    } else {
                        statePc = 91;
                        continue scanLoop1;
                    }
                }
                case 90: {
                    ba.a(24, ma.field_a, (byte) -113, 328, var3, -param0 + 1);
                    nb.a(-param0 + 1, (byte) 122, var3, ha.field_a, 328, 128, 24);
                    DropTargetWidgetContainer.field_y.drawString(var17, 333, -param0 + 18, 16777215, -1);
                    statePc = 91;
                    continue scanLoop1;
                }
                case 91: {
                    if (ua.field_c >= -2) {
                        statePc = 116;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 92. */
                        {
                            if (MouseWheelSource.field_c != 0) {
                                statePc = 95;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 93. */
                                {
                                    if (FrameTimer.field_e.field_k != 0) {
                                        statePc = 95;
                                    } else {
                                        statePc = 116;
                                    }
                                    continue scanLoop1;
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
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 98;
                        continue scanLoop1;
                    }
                }
                case 98: {
                    if (rj.field_h == 1) {
                        /* Inlined CFG state: 100. */
                        {
                            var10_ref_String = AccountServiceResult.field_c;
                            statePc = 101;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 101;
                        continue scanLoop1;
                    }
                }
                case 101: {
                    if (2 == rj.field_h) {
                        /* Inlined CFG state: 103. */
                        {
                            var10_ref_String = FullscreenFocusCanvas.field_a;
                            statePc = 104;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 104;
                        continue scanLoop1;
                    }
                }
                case 104: {
                    if (3 != rj.field_h) {
                        statePc = 107;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 105. */
                        {
                            if (nf.field_l != 2) {
                                statePc = 107;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 106. */
                                {
                                    var10_ref_String = vf.field_a;
                                    statePc = 107;
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 107: {
                    if (rj.field_h != 4) {
                        statePc = 115;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 108. */
                        {
                            if (u.field_d <= 0) {
                                /* Inlined CFG state: 114. */
                                {
                                    var10_ref_String = bc.field_l + var9 + BufferedSocket.field_o;
                                    statePc = 115;
                                    continue scanLoop1;
                                }
                            } else {
                                /* Inlined CFG state: 109. */
                                {
                                    if (nf.field_l == 0) {
                                        /* Inlined CFG state: 113. */
                                        {
                                            var10_ref_String = d.field_n + var9 + jf.field_b;
                                            statePc = 115;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        /* Inlined CFG state: 110. */
                                        {
                                            if (1 == nf.field_l) {
                                                /* Inlined CFG state: 112. */
                                                {
                                                    var10_ref_String = d.field_n + var9 + eh.field_c;
                                                    statePc = 115;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                /* Inlined CFG state: 111. */
                                                {
                                                    var10_ref_String = jg.field_I + var9;
                                                    statePc = 115;
                                                    continue scanLoop1;
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
                    DropTargetWidgetContainer.field_y.drawParagraphAlpha(var10_ref_String, 0, 0, 640, 480, 16777215, -1, -(10 * param0) + 256, 1, 1, DropTargetWidgetContainer.field_y.field_p);
                    statePc = 116;
                    continue scanLoop1;
                }
                case 116: {
                    if (DraggableWidgetContainer.field_C > 0) {
                        /* Inlined CFG state: 118. */
                        {
                            var3 = 255 * dl.field_a / DraggableWidgetContainer.field_C;
                            var4 = 0;
                            var5 = 0;
                            var6 = 0;
                            if (var3 >= 128) {
                                /* Inlined CFG state: 120. */
                                {
                                    var5 = 255;
                                    var4 = -(var3 * 2) + 256 + 255;
                                    statePc = 121;
                                    continue scanLoop1;
                                }
                            } else {
                                /* Inlined CFG state: 119. */
                                {
                                    var4 = 255;
                                    var5 = var3 * 2;
                                    statePc = 121;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        statePc = 132;
                        continue scanLoop1;
                    }
                }
                case 121: {
                    var6 = (var4 << 16) + (var5 << 8);
                    var7 = 0;
                    statePc = 122;
                    continue scanLoop1;
                }
                case 122: {
                    if (var7 >= var3) {
                        /* Inlined CFG state: 131. */
                        {
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(s.field_h, 319, 38, 0, -1, var3);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(s.field_h, 321, 38, 0, -1, var3);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(s.field_h, 320, 37, 0, -1, var3);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(s.field_h, 320, 39, 0, -1, var3);
                            DropTargetWidgetContainer.field_y.drawCentredAlpha(s.field_h, 320, 38, 16777215, -1, var3);
                            statePc = 132;
                            continue scanLoop1;
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
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 124. */
                                {
                                    if (stackIn_124_0 > stackIn_124_1) {
                                        statePc = 129;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 125. */
                                        {
                                            if (var7 > -10 + var3) {
                                                statePc = 129;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 126. */
                                                {
                                                    if (10 != var7) {
                                                        statePc = 130;
                                                    } else {
                                                        statePc = 127;
                                                    }
                                                    continue scanLoop1;
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
                    SoftwareRasterizer.fillRectangle(-(var3 >> 1) + (320 + var7) - 5, 27, 10 + (var3 - 20), 11, var6);
                    statePc = 130;
                    continue scanLoop1;
                }
                case 129: {
                    SoftwareRasterizer.fillCircleAlpha(320 + (var7 - (var3 >> 1)), 32, 5, var6, 255 - Math.abs(var7 - (var3 >> 1)));
                    statePc = 130;
                    continue scanLoop1;
                }
                case 130: {
                    var7++;
                    statePc = 122;
                    continue scanLoop1;
                }
                case 132: {
                    stackIn_133_0 = 0;
                    stackIn_133_1 = FrameTimer.field_e.field_k;
                    statePc = 133;
                    continue scanLoop1;
                }
                case 133: {
                    if (stackIn_133_0 != stackIn_133_1) {
                        statePc = 144;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 134. */
                        {
                            if (MouseWheelSource.field_c != 0) {
                                statePc = 144;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 135. */
                                {
                                    if (FrameTimer.field_e.field_r >= 25) {
                                        /* Inlined CFG state: 137. */
                                        {
                                            if (165 >= FrameTimer.field_e.field_r) {
                                                /* Inlined CFG state: 139. */
                                                {
                                                    var3 = 100;
                                                    statePc = 140;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                /* Inlined CFG state: 138. */
                                                {
                                                    var3 = 190 - FrameTimer.field_e.field_r << 2;
                                                    statePc = 140;
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    } else {
                                        /* Inlined CFG state: 136. */
                                        {
                                            var3 = FrameTimer.field_e.field_r << 2;
                                            statePc = 140;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 140: {
                    var4 = a.field_b.stringWidth(ne.field_i);
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
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 141. */
                        {
                            var21 = new int[4];
                            SoftwareRasterizer.saveClip(var21);
                            SoftwareRasterizer.intersectClip(var5, var8, var5 + var7, var8 + var11);
                            SoftwareRasterizer.fillRectangleAlpha(var5 + 19, 14 + var8, var7 - 38, -28 + var11, 0, 128);
                            ba.a(var11, rd.field_p, (byte) 115, var5, var7, var8);
                            BufferedSocket.a(true, var7, 10596798, 0, var8, 16711680, var5, var11 >> 1);
                            BufferedSocket.a(true, var7, 0, 10596798, (var11 >> 1) + var8, 16711680, var5, -(var11 >> 1) + var11);
                            SoftwareRasterizer.intersectClip(var5 + 19, var8 + 14, var7 + (var5 - 19), -14 + (var11 + var8));
                            a.field_b.drawCentred(ne.field_i, 320, (a.field_b.field_p - a.field_b.field_q >> 1) + 240, 16777215, -1);
                            SoftwareRasterizer.restoreClip(var21);
                            statePc = 144;
                            continue scanLoop1;
                        }
                    }
                }
                case 144: {
                    return;
                }
                case 147: {
                    ((d) (Object) stackIn_147_0).a(320 - FrameTimer.field_e.field_f, -56);
                    statePc = 151;
                    continue scanLoop1;
                }
                case 148: {
                    FullscreenFocusCanvas.field_c[var3].b(-FrameTimer.field_e.field_f + 320, param1 ^ 7178);
                    stackIn_147_0 = FullscreenFocusCanvas.field_c[var3];
                    statePc = 147;
                    continue scanLoop1;
                }
                case 149: {
                    if (2 == FullscreenFocusCanvas.field_c[var3].field_h) {
                        statePc = 148;
                    } else {
                        statePc = 151;
                    }
                    continue scanLoop1;
                }
                case 151: {
                    /* Sequential CFG blocks: 151, 155. */
                    {
                        var3++;
                    }
                    {
                        if (var3 >= 4000) {
                            statePc = 53;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 154. */
                            {
                                stackIn_152_0 = null;
                                stackIn_152_1 = FullscreenFocusCanvas.field_c[var3];
                                statePc = 152;
                                continue scanLoop1;
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
                    continue scanLoop1;
                }
                case 158: {
                    ((d) (Object) stackIn_158_0).a(320 - FrameTimer.field_e.field_f, -56);
                    statePc = 162;
                    continue scanLoop1;
                }
                case 159: {
                    FullscreenFocusCanvas.field_c[var3].b(-FrameTimer.field_e.field_f + 320, param1 ^ 7178);
                    stackIn_158_0 = FullscreenFocusCanvas.field_c[var3];
                    statePc = 158;
                    continue scanLoop1;
                }
                case 160: {
                    if (2 == FullscreenFocusCanvas.field_c[var3].field_h) {
                        statePc = 159;
                    } else {
                        statePc = 162;
                    }
                    continue scanLoop1;
                }
                case 162: {
                    /* Sequential CFG blocks: 162, 166. */
                    {
                        var3++;
                    }
                    {
                        if (var3 >= 4000) {
                            statePc = 53;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 165. */
                            {
                                stackIn_163_0 = null;
                                stackIn_163_1 = FullscreenFocusCanvas.field_c[var3];
                                statePc = 163;
                                continue scanLoop1;
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
                    continue scanLoop1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        MouseWheelSource.field_c = MouseWheelSource.field_c + 1;
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
            AccountRequestState.field_d = AccountRequestState.field_d + 1;
            dg.field_l = 0;
            ha.field_c = 2;
            mj.a(96, 12, 0, 31, 100);
            mj.a(255, 12, 1200, 36, 100);
          } else {
            if (1 < ha.field_c) {
              ha.field_c = ha.field_c + 1;
              AccountRequestState.field_d = AccountRequestState.field_d + 1;
              if (ha.field_c == 5) {
                li.a(-115, new bf(0, -128, -40, 14));
                li.a(-126, new bf(0, -128, 40, 14));
                if (hh.field_c == 1) {
                  ProgressMessageDialog.a(249, false, 6);
                }
              }
              dg.field_l = 0;
              mj.a(96, param0 + 12, 0, 31, 100);
              mj.a(255, 12, 1200, 36, 100);
            }
          }
        } else {
          AccountRequestState.field_d = AccountRequestState.field_d + 1;
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
        ResourceArchive var4;
        var3 = field_A;
        if (param0 != -19049) {
          var4 = (ResourceArchive) null;
          StarCannon.a((ResourceArchive) null, false, 0, (ResourceArchive) null, (ResourceArchive) null);
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
                  ProgressMessageDialog.a(249, false, 6);
                }
              }
            } else {
              bf.field_w = bf.field_w + 1;
              dg.field_l = 0;
              AccountRequestState.field_d = AccountRequestState.field_d + 1;
              mj.a(96, 12, 0, 29, 100);
              mj.a(255, 12, 1200, 40, 100);
            }
          } else {
            bf.field_w = 2;
            dg.field_l = 0;
            AccountRequestState.field_d = AccountRequestState.field_d + 1;
            mj.a(96, 12, 0, 29, 100);
            mj.a(255, 12, 1200, 40, 100);
          }
        } else {
          bf.field_w = 1;
          AccountRequestState.field_d = AccountRequestState.field_d + 1;
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
        if ((5 + ResourceArchive.field_c[rj.field_h]) < var2 &&
          ResourceArchive.field_c[rj.field_h] >= ua.field_c) {
          var2 = 5 + ResourceArchive.field_c[rj.field_h];
        }
        regionExit1: {
          var3 = sh.b(-126, 640);
          var4 = -64 + FrameTimer.field_e.field_f + sh.b(38, 128);
          var5 = null;
          var7 = var2;
          if (var7 != 1 &&
            var7 != 2 &&
            var7 != 3) {
            if (4 == var7) {
              nf.field_e = var2 * 25 + 75;
              AccountRegistrationPanel.field_y.addLast(122, new bf(var3, -64, var4, 4));
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
                  AccountRegistrationPanel.field_y.addLast(param0 ^ -138, var8);
                }
              } else if (9 != var7 &&
                11 != var7) {
                if (var7 == 6) {
                  nf.field_e = nf.field_e + 250;
                  var7_ref_bf = new bf(320, -256, var4, 11);
                  AccountRegistrationPanel.field_y.addLast(param0 ^ -170, var7_ref_bf);
                  dg.field_l = 0;
                  ua.field_c = 2;
                  mj.a(255, 12, 0, 41, 100);
                  ti.field_f.removeOwnedListener(ResizableModalDialog.field_P);
                  ResizableModalDialog.field_P.f();
                  ResizableModalDialog.field_P = fl.field_h;
                  ti.field_f.addListener(ResizableModalDialog.field_P);
                  ResizableModalDialog.field_P.a(mc.field_b);
                  break regionExit1;
                }
                if (var7 == 10) {
                  nf.field_e = nf.field_e + 250;
                  var7_ref_bfLifetime1 = new bf(320, -256, var4, 15);
                  AccountRegistrationPanel.field_y.addLast(69, var7_ref_bfLifetime1);
                  dg.field_l = 0;
                  ua.field_c = 6;
                  mj.a(255, 12, 0, 41, 100);
                  ti.field_f.removeOwnedListener(ResizableModalDialog.field_P);
                  ResizableModalDialog.field_P.f();
                  ResizableModalDialog.field_P = fl.field_h;
                  ti.field_f.addListener(ResizableModalDialog.field_P);
                  ResizableModalDialog.field_P.a(mc.field_b);
                  break regionExit1;
                }
                if (7 == var7) {
                  nf.field_e = 0;
                  for (var7 = 0; var7 < 5; var7++) {
                    var8 = new bf(var3, 64 * -var7 - 64, var4, 1);
                    stackIn_63_0 = var8;
                    stackIn_64_1 = (var7 != 1) && (var7 != 4);
                    stackIn_63_0.field_p = stackIn_64_1;
                    AccountRegistrationPanel.field_y.addLast(101, var8);
                  }
                  break regionExit1;
                }
                if (var7 != 8 &&
                  var7 != 13) {
                  if (var7 != 12 &&
                    14 != var7) {
                    if ((var7 == 15)) {
                      var6 = new bf(320, -256, var4, 16);
                      AccountRegistrationPanel.field_y.addLast(97, var6);
                      DraggableWidgetContainer.field_C = var6.field_k;
                      ua.field_c = 1 + ResourceArchive.field_c[rj.field_h];
                      dg.field_l = 0;
                      AccountRequestState.field_d = AccountRequestState.field_d + 1;
                      mj.a(255, param0 ^ -244, 0, 41, 100);
                      ti.field_f.removeOwnedListener(ResizableModalDialog.field_P);
                      ResizableModalDialog.field_P.f();
                      ResizableModalDialog.field_P = fl.field_h;
                      ti.field_f.addListener(ResizableModalDialog.field_P);
                      ResizableModalDialog.field_P.a(mc.field_b);
                    }
                  } else {
                    nf.field_e = 175;
                    AccountRegistrationPanel.field_y.addLast(82, new bf(var3, -64, var4, 4));
                  }
                  break regionExit1;
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
                  AccountRegistrationPanel.field_y.addLast(param0 ^ -145, var8);
                }
              } else {
                nf.field_e = 0;
                for (var7 = -8; var7 < 8; var7++) {
                  var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 + var7 * 24, 1);
                  stackIn_53_0 = var8;
                  stackIn_54_1 = (1 != var7) && (var7 != 4);
                  stackIn_53_0.field_p = stackIn_54_1;
                  AccountRegistrationPanel.field_y.addLast(123, var8);
                }
                break regionExit1;
              }
            }
            break regionExit1;
          }
          nf.field_e = var2 * 25 + 75;
          AccountRegistrationPanel.field_y.addLast(122, new bf(var3, -64, var4, 4));
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
        if (ResourceArchive.field_c[rj.field_h] < var2 &&
          ResourceArchive.field_c[rj.field_h] >= ua.field_c) {
          var2 = ResourceArchive.field_c[rj.field_h];
        }
        if (param0 != 0) {
          field_C = (String) null;
        }
        var3 = sh.b(-126, 640);
        var4 = -64 + (FrameTimer.field_e.field_f + sh.b(91, 128));
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
                      AccountRegistrationPanel.field_y.addLast(125, var9);
                      var7_ref = var9;
                      var8_int++;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    if (var7 == 7) {
                      nf.field_e = 0;
                      for (var7 = 0; var7 < 5; var7++) {
                        AccountRegistrationPanel.field_y.addLast(126, new bf(var3, -64 + 64 * -var7, var4, 1));
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
                            AccountRegistrationPanel.field_y.addLast(101, var6);
                            DraggableWidgetContainer.field_C = var6.field_k;
                            ua.field_c = 1 + ResourceArchive.field_c[rj.field_h];
                            AccountRequestState.field_d = AccountRequestState.field_d + 1;
                            dg.field_l = 0;
                            mj.a(255, 12, 0, 41, 100);
                            ti.field_f.removeOwnedListener(ResizableModalDialog.field_P);
                            ResizableModalDialog.field_P.f();
                            ResizableModalDialog.field_P = fl.field_h;
                            ti.field_f.addListener(ResizableModalDialog.field_P);
                            ResizableModalDialog.field_P.a(mc.field_b);
                          }
                        } else {
                          nf.field_e = 175;
                          AccountRegistrationPanel.field_y.addLast(77, new bf(var3, -64, var4, 4));
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
                          AccountRegistrationPanel.field_y.addLast(param0 + 69, var8);
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
                    AccountRegistrationPanel.field_y.addLast(param0 ^ 74, new bf(var3, -var7 * 64 - 64, var3, 1));
                  }
                }
              } else {
                nf.field_e = 0;
                for (var7 = -8; var7 < 8; var7++) {
                  var8Lifetime2 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 + var7 * 24, 1);
                  var8Lifetime2.field_p = true;
                  AccountRegistrationPanel.field_y.addLast(107, var8Lifetime2);
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
                AccountRegistrationPanel.field_y.addLast(param0 ^ 102, var9Lifetime1);
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
            AccountRegistrationPanel.field_y.addLast(65, var8Lifetime1);
          }
        }

    }

    final void updateClient(int param0) {
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
        nb.field_f.serviceOutput();
        ea.field_d.serviceOutput();
        if (null != n.field_a &&
          n.field_a.focusLost) {
          re.a(0);
          ProxyAuthenticationRequiredException.b(-36);
        }
        stackIn_6_1 = (n.field_a != null);
        this.b(stackIn_6_1, -1);
        if (param0 != 320) {
          this.disposeClient(-100);
        }
        if (StripedProgressWidget.field_E) {
          this.t(-23523);
          StripedProgressWidget.field_E = false;
        }
        if (ProxyAuthenticationRequiredException.c(4)) {
          this.f((byte) -90);
          if (ProxyAuthenticationRequiredException.c(4)) {
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
              RegistrationAgreementPane.i(122);
              ConfirmedEmailAvailabilityValidator.e((byte) -117);
              if (field_z == 5 &&
                jg.field_H == 0) {
                field_z = 2;
                od.a(param0 ^ -312, 2, false);
              }
            }
          } else {
            if (!gh.f(-23093)) {
              if (BoundedRandomAccessFile.a(false)) {
                stackIn_39_1 = (null != n.field_a);
                var2 = u.a((ag) (this), stackIn_39_1, (byte) 112);
                if (var2 == 1) {
                  re.a(0);
                }
                if (var2 == 2) {
                  if (null != n.field_a) {
                    re.a(0);
                  }
                  TextLineMetrics.a(ll.b(72), 337033697);
                }
                if (2364824 == var2) {
                  AlphaWidgetContainer.clearStaticReferences(-1);
                }
              } else {
                this.b(true);
              }
            } else {
              if (TextLineMetrics.field_e != 0) {
                this.b(true);
              } else {
                var2 = TextLayout.b(31380);
                if (var2 == 2) {
                  re.a(0);
                }
                if (var2 == 3) {
                  NanoFrameTimer.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, a.field_b, param0 - 331, 12, true);
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
        if (!MouseInput.a(34)) {
          while (true) {
            var5_ref = (hb) (SecondaryNodeDeque.field_e.removeFirst((byte) 39));
            if (var5_ref == null) {
              break;
            }
            BufferedSocket.a(4, (byte) -41, var5_ref);
          }
        }
        nf.a(0, (byte) 95);
        while (ll.a(s.field_k, (byte) -99)) {
          this.a(true);
        }
        var2Lifetime1 = 0;
        if (RichTextLayout.b((byte) -91)) {
          var3 = this.h((byte) 58);
          if (var3 == 2) {
            var2Lifetime1 = 1;
          }
        }
        if (var2Lifetime1 != 0) {
          ai.a(10, (Sprite[]) null, 240, DropTargetWidgetContainer.field_y.field_r, (Sprite[]) null, a.field_b.field_q + a.field_b.field_r, a.field_b, 10, DropTargetWidgetContainer.field_y, 320, 10, DropTargetWidgetContainer.field_y.field_q + DropTargetWidgetContainer.field_y.field_r, 25574, a.field_b.field_r);
        }
    }

    private final void c(boolean param0, int param1) {
        Sprite dupTemp$0 = null;
        int var8 = 0;
        int var7 = 0;
        Object var3;
        SoundCache var3_ref;
        int var4_int;
        Sprite[] var4;
        id[] var4_array;
        int var5_int;
        Sprite var5;
        Object var5_ref;
        Sprite var6_ref_hl;
        int var6;
        Sprite var7_ref_hl;
        Sprite var8_ref_hl;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        Sprite[] var15;
        Sprite[] var16;
        Sprite var17;
        Sprite[] var18;
        int[] var19;
        Sprite[] var20;
        Sprite var21;
        Sprite[] var22;
        Sprite var23;
        int[] var24;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5_intLifetime1;
        int var11Lifetime1;
        var12 = field_A;
        if (param1 != -1444) {
          this.updateClient(66);
        }
        o.a(false);
        if (param0) {
          ne.b(lh.field_I, 150);
        }
        if (null == gf.field_c) {
          if (lj.field_h.ensureIndexLoaded((byte) 118) &&
            lj.field_h.tryLoadAllGroups(param1 + 31185)) {
            if (AccountNameAvailabilityValidator.field_p.ensureIndexLoaded((byte) 95) &&
              AccountNameAvailabilityValidator.field_p.tryLoadAllGroups(29741)) {
              if (RichTextLayout.field_l.ensureIndexLoaded((byte) 109) &&
                RichTextLayout.field_l.tryLoadAllGroups(29741)) {
                if (jg.field_F.ensureIndexLoaded((byte) 119) &&
                  jg.field_F.tryLoadAllGroups(29741)) {
                  if (BoundedRandomAccessFile.field_c.ensureIndexLoaded((byte) 127) &&
                    BoundedRandomAccessFile.field_c.tryLoadAllGroups(29741)) {
                    if (FrameTimer.field_f.ensureIndexLoaded((byte) 103) &&
                      FrameTimer.field_f.tryLoadGroupByName("basic", -9883)) {
                      ma.a(StripedProgressWidget.field_z, -13923, 70.0f);
                      this.renderClientFrame((byte) 22);
                      if (!param0) {
                        return;
                      }
                      RegistrationAgreementPane.i(param1 ^ -1478);
                      gf.field_c = new PcmSample[48];
                      gf.field_c[0] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_bossdamage").toPcmSample();
                      gf.field_c[1] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_bossdestroy").toPcmSample();
                      gf.field_c[2] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_collect1").toPcmSample();
                      gf.field_c[7] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemydamage2").toPcmSample();
                      gf.field_c[8] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemydamage3").toPcmSample();
                      gf.field_c[9] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemydestroy3").toPcmSample();
                      gf.field_c[10] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemydestroy4").toPcmSample();
                      gf.field_c[3] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemyfire1").toPcmSample();
                      gf.field_c[4] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemyfire2").toPcmSample();
                      gf.field_c[5] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemyfire3").toPcmSample();
                      gf.field_c[6] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_enemyfire4").toPcmSample();
                      gf.field_c[19] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_playerdestroy").toPcmSample();
                      gf.field_c[20] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_backcannon").toPcmSample();
                      gf.field_c[21] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_FOLLOWERFIRE").toPcmSample();
                      gf.field_c[11] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_playerfire1").toPcmSample();
                      gf.field_c[12] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_playerfire2").toPcmSample();
                      gf.field_c[13] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_helix_1").toPcmSample();
                      gf.field_c[14] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_helix_2").toPcmSample();
                      gf.field_c[15] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_helix_3").toPcmSample();
                      gf.field_c[16] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_lance_1").toPcmSample();
                      gf.field_c[17] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_lance_2").toPcmSample();
                      gf.field_c[18] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_lance_3").toPcmSample();
                      gf.field_c[22] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_rewind_activated_part1").toPcmSample();
                      gf.field_c[23] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_rewind_installed").toPcmSample();
                      gf.field_c[24] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_seekermine_explode").toPcmSample();
                      gf.field_c[25] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_shield_discharged").toPcmSample();
                      gf.field_c[26] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_shield_rearm").toPcmSample();
                      gf.field_c[27] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_shieldburst").toPcmSample();
                      gf.field_c[28] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_thruster_upgrade").toPcmSample();
                      gf.field_c[29] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_rearcannon_upgrade").toPcmSample();
                      gf.field_c[30] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_shield_upgraded").toPcmSample();
                      gf.field_c[31] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_sidecannons_upgrade").toPcmSample();
                      gf.field_c[46] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_xenon_operational").toPcmSample();
                      gf.field_c[47] = SynthesizedSoundEffect.loadByName(lj.field_h, "", "SC_xenonbeamshot").toPcmSample();
                      gf.field_c[32] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_systems malfunction").decodeAllToPcm();
                      gf.field_c[39] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_54321").decodeAllToPcm();
                      gf.field_c[40] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_back cannons upgraded").decodeAllToPcm();
                      gf.field_c[41] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_hostile mothership approaching").decodeAllToPcm();
                      gf.field_c[42] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_powerup collected").decodeAllToPcm();
                      gf.field_c[43] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_returning to normal space").decodeAllToPcm();
                      gf.field_c[44] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_rewind module activated").decodeAllToPcm();
                      gf.field_c[45] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_rewind module installed").decodeAllToPcm();
                      gf.field_c[33] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_shield discharged").decodeAllToPcm();
                      gf.field_c[34] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_shield rearmed").decodeAllToPcm();
                      gf.field_c[35] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_shields upgraded").decodeAllToPcm();
                      gf.field_c[36] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_side cannons upgraded").decodeAllToPcm();
                      gf.field_c[37] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_thrusters upgraded").decodeAllToPcm();
                      gf.field_c[38] = VorbisSample.loadByName(AccountNameAvailabilityValidator.field_p, "", "SC_VOC_zenon beam operational").decodeAllToPcm();
                      AccountNameAvailabilityValidator.a(272, -3763, 3278, 39);
                      AccountNameAvailabilityValidator.a(0, -3763, 300, 11);
                      AccountNameAvailabilityValidator.a(0, -3763, 300, 12);
                      AccountNameAvailabilityValidator.a(50, -3763, 300, 16);
                      AccountNameAvailabilityValidator.a(0, param1 - 2319, 100, 17);
                      AccountNameAvailabilityValidator.a(0, param1 ^ 2833, 100, 18);
                      ModalDialogHost.j(param1 ^ -1412);
                      return;
                    }
                    ma.a(SecondaryNodeDeque.a(n.field_f, FrameTimer.field_f, (byte) -38, FullscreenNoticeType.field_a, "basic"), -13923, 60.0f);
                    return;
                  }
                  ma.a(SecondaryNodeDeque.a(s.field_g, BoundedRandomAccessFile.field_c, (byte) -38, sj.field_D, ""), -13923, 50.0f);
                  return;
                }
                ma.a(SecondaryNodeDeque.a(n.field_f, jg.field_F, (byte) -38, FullscreenNoticeType.field_a, ""), param1 - 12479, 40.0f);
                return;
              }
              ma.a(SecondaryNodeDeque.a(ResizableModalDialog.field_U, RichTextLayout.field_l, (byte) -38, BitPacketBuffer.field_l, ""), -13923, 30.0f);
              return;
            }
            ma.a(SecondaryNodeDeque.a(StandardContentDialog.field_ib, AccountNameAvailabilityValidator.field_p, (byte) -38, TextLayout.field_g, ""), -13923, 20.0f);
            return;
          }
          ma.a(SecondaryNodeDeque.a(StandardContentDialog.field_ib, lj.field_h, (byte) -38, TextLayout.field_g, ""), param1 ^ 13249, 10.0f);
          return;
        }
        if (null != RichTextLayout.field_l) {
          ma.a(GzipDecompressor.field_d, -13923, 75.0f);
          this.renderClientFrame((byte) 22);
          var3_ref = new SoundCache(lj.field_h, AccountNameAvailabilityValidator.field_p);
          fb.field_t = dl.a(var3_ref, (byte) 84, "music/star cannon level 1 final", "", RichTextLayout.field_l);
          TextFieldValidator.field_i = dl.a(var3_ref, (byte) 66, "music/star cannon level 2 final", "", RichTextLayout.field_l);
          r.field_b = dl.a(var3_ref, (byte) -82, "music/star cannon boss final", "", RichTextLayout.field_l);
          AccountNameAvailabilityValidator.field_p = null;
          RichTextLayout.field_l = null;
          lj.field_h = null;
          ModalDialogHost.j(32);
          return;
        }
        if (fl.field_f == null) {
          ma.a(sj.field_C, -13923, 80.0f);
          this.renderClientFrame((byte) 22);
          gg.field_f = SecondaryNodeDequeIterator.a("smlships", 126, "", jg.field_F);
          AccountNameAvailabilityValidator.field_j = SecondaryNodeDequeIterator.a("destroyer", -121, "", jg.field_F);
          FullscreenFocusCanvas.field_e = SecondaryNodeDequeIterator.a("cruiser", param1 ^ -1484, "", jg.field_F);
          gf.field_a = SecondaryNodeDequeIterator.a("cannoneer", 116, "", jg.field_F);
          dl.field_c = SecondaryNodeDequeIterator.a("playership", param1 + 1407, "", jg.field_F);
          vc.field_m = SecondaryNodeDequeIterator.a("addons", 126, "", jg.field_F);
          SecondaryNodeDequeIterator.a("glows", 118, "", jg.field_F);
          sj.field_E = SecondaryNodeDequeIterator.a("boss", -36, "", jg.field_F);
          fg.field_c = SecondaryNodeDequeIterator.a("boss2", param1 ^ 1474, "", jg.field_F);
          v.field_d = SecondaryNodeDequeIterator.a("boss3", 95, "", jg.field_F);
          DropTargetWidgetContainer.field_w = fg.a(jg.field_F, "powerorbs", "", false);
          var15 = SecondaryNodeDequeIterator.a("shots", -75, "", jg.field_F);
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            jg.field_C[var4_int] = var15[var4_int];
          }
          var16 = SecondaryNodeDequeIterator.a("shots2", -120, "", jg.field_F);
          for (var4_intLifetime1 = 0; var4_intLifetime1 < 5; var4_intLifetime1++) {
            jg.field_C[var4_intLifetime1 + 5] = var16[var4_intLifetime1];
          }
          var3 = null;
          AlphaWidgetContainer.field_B = SecondaryNodeDequeIterator.a("explosion", 120, "", jg.field_F);
          LabeledWidgetContainer.field_z = SecondaryNodeDequeIterator.a("explosionb", -63, "", jg.field_F);
          oh.field_d = SecondaryNodeDequeIterator.a("explosionc", -105, "", jg.field_F);
          el.field_H = new Sprite[5];
          for (var4_intLifetime2 = 0; var4_intLifetime2 < 5; var4_intLifetime2++) {
            dupTemp$0 = new Sprite(32, 32);
            el.field_H[var4_intLifetime2] = dupTemp$0;
            var17 = dupTemp$0;
            var17.bindAsRenderTarget();
            gg.field_f[-var4_intLifetime2 + 24].drawFlippedVertical(0, 0);
            var17.trimTransparentBorders();
          }
          DisplayNameSelectionPanel.field_y.setAsRasterTarget(param1 + 1333);
          fl.field_f = SecondaryNodeDequeIterator.a("debris", 96, "", jg.field_F);
          var4 = new Sprite[40];
          for (var5_int = 0; var5_int < 4; var5_int++) {
            var4[36 + var5_int] = fl.field_f[var5_int + 12];
          }
          var13 = 0;
          var5_intLifetime1 = var13;
          while (var13 < 12) {
            var4[var13] = fl.field_f[var13];
            var4[12 + var13] = fl.field_f[var13].copy();
            var4[12 + var13].rotateClockwise();
            var4[24 + var13] = fl.field_f[var13].copy();
            var4[24 + var13].rotateCounterclockwise();
            var13++;
          }
          fl.field_f = var4;
          ma.field_e = SecondaryNodeDequeIterator.a("fr_thin_sqr_in", -49, "", jg.field_F);
          gb.field_v = SecondaryNodeDequeIterator.a("fr_thin_sqr_ex", 119, "", jg.field_F);
          ha.field_a = SecondaryNodeDequeIterator.a("fr_grid_sql_in", 119, "", jg.field_F);
          ma.field_a = SecondaryNodeDequeIterator.a("fr_grid_sql_ex", 119, "", jg.field_F);
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
          MatchingFieldValidator.field_l = DequeWidgetContainer.a("", param1 ^ -1534, "life_icon", jg.field_F);
          pk.field_e = DequeWidgetContainer.a("", 41, "main_border", jg.field_F);
          NanoFrameTimer.field_i = DequeWidgetContainer.a("", 45, "main_inner", jg.field_F);
          rd.field_p = SecondaryNodeDequeIterator.a("menu_border", param1 ^ -1532, "", jg.field_F);
          jk.field_f = SecondaryNodeDequeIterator.a("menu_innerborder", 98, "", jg.field_F);
          var18 = SecondaryNodeDequeIterator.a("headers", 117, "", jg.field_F);
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
          ModalDialogHost.j(param1 + 1476);
          return;
        }
        if (null == DialogMessagePane.field_y[3]) {
          ma.a(sj.field_C, -13923, 90.0f);
          this.renderClientFrame((byte) 22);
          DequeWidgetContainer.a("", 93, "mainmenubar", jg.field_F);
          AlphaWidgetContainer.field_A = SecondaryNodeDequeIterator.a("zenon", 102, "", jg.field_F);
          DequeWidgetContainer.a("", 120, "moon", jg.field_F);
          DequeWidgetContainer.a("", param1 ^ -1487, "stars", jg.field_F);
          fh.field_q = DequeWidgetContainer.a("", param1 + 1531, "nebula", jg.field_F);
          MouseWheelSource.field_e = DequeWidgetContainer.a("", 125, "titlepic", jg.field_F);
          gb.field_r = DequeWidgetContainer.a("", 91, "title2", jg.field_F);
          ea.field_b[0] = DequeWidgetContainer.a("", 54, "sp0", jg.field_F);
          ea.field_b[1] = DequeWidgetContainer.a("", 116, "sp1", jg.field_F);
          ea.field_b[2] = DequeWidgetContainer.a("", 52, "sp2", jg.field_F);
          ea.field_b[3] = DequeWidgetContainer.a("", param1 + 1531, "sp3", jg.field_F);
          ea.field_b[4] = DequeWidgetContainer.a("", 43, "sp4", jg.field_F);
          ea.field_b[5] = DequeWidgetContainer.a("", 44, "sp5", jg.field_F);
          ea.field_b[6] = DequeWidgetContainer.a("", 93, "sp6", jg.field_F);
          ea.field_b[7] = DequeWidgetContainer.a("", param1 + 1497, "sp7", jg.field_F);
          ea.field_b[8] = DequeWidgetContainer.a("", 36, "sp8", jg.field_F);
          eb.field_b[0] = DequeWidgetContainer.a("", 47, "s0", jg.field_F);
          eb.field_b[1] = DequeWidgetContainer.a("", 107, "s1", jg.field_F);
          eb.field_b[2] = DequeWidgetContainer.a("", 86, "s2", jg.field_F);
          eb.field_b[3] = DequeWidgetContainer.a("", 23, "s3", jg.field_F);
          eb.field_b[4] = DequeWidgetContainer.a("", 20, "s4", jg.field_F);
          eb.field_b[5] = DequeWidgetContainer.a("", 82, "s5", jg.field_F);
          eb.field_b[6] = DequeWidgetContainer.a("", dg.a(param1, -1506), "s6", jg.field_F);
          eb.field_b[7] = DequeWidgetContainer.a("", dg.a(param1, -1419), "s7", jg.field_F);
          eb.field_b[8] = DequeWidgetContainer.a("", dg.a(param1, -1423), "s8", jg.field_F);
          eb.field_b[9] = DequeWidgetContainer.a("", 124, "s9", jg.field_F);
          eb.field_b[10] = DequeWidgetContainer.a("", param1 + 1532, "s10", jg.field_F);
          eb.field_b[11] = DequeWidgetContainer.a("", 21, "s11", jg.field_F);
          eb.field_b[12] = DequeWidgetContainer.a("", dg.a(param1, -1478), "s12", jg.field_F);
          eb.field_b[13] = DequeWidgetContainer.a("", param1 + 1523, "s13", jg.field_F);
          DialogMessagePane.field_y[0] = DequeWidgetContainer.a("", 76, "ap0", jg.field_F);
          DialogMessagePane.field_y[1] = DequeWidgetContainer.a("", 69, "ap1", jg.field_F);
          DialogMessagePane.field_y[2] = DequeWidgetContainer.a("", dg.a(param1, -1497), "ap2", jg.field_F);
          DialogMessagePane.field_y[3] = DequeWidgetContainer.a("", 100, "ap3", jg.field_F);
          ModalDialogHost.j(32);
          return;
        }
        ma.a(sj.field_C, -13923, 95.0f);
        this.renderClientFrame((byte) 22);
        DropTargetWidgetContainer.field_y = od.a("", jg.field_F, "b12", param1 + 1443, BoundedRandomAccessFile.field_c);
        a.field_b = od.a("", jg.field_F, "font", -1, BoundedRandomAccessFile.field_c);
        var20 = SecondaryNodeDequeIterator.a("screenshots", -105, "", jg.field_F);
        ByteStorage.a(DequeWidgetContainer.a("", 59, "mbfg", jg.field_F), -60, wc.field_g);
        ta.a(DequeWidgetContainer.a("", param1 ^ -1510, "mb_logo", jg.field_F), param1 + 1319);
        DelayedPcmStream.a(0, 125, 123, a.field_b, 1500, -52, 9, 9, 16777215, 0, DequeWidgetContainer.a("", 60, "mbpb", jg.field_F));
        te.a(126, var20);
        ProgressDialog.field_eb = null;
        var4_array = new id[1];
        var4_array[0] = DropTargetWidgetContainer.field_w[16 + qb.field_e];
        DropTargetWidgetContainer.field_y.setInlineSprites(var4_array, (int[]) null);
        ProgressDialog.field_V = DequeWidgetContainer.a("basic", 111, "unachieved", FrameTimer.field_f);
        li.a(ProgressDialog.field_V, (byte) -100);
        sc.field_a = DequeWidgetContainer.a("basic", param1 ^ -1517, "locked", FrameTimer.field_f);
        li.a(sc.field_a, (byte) -100);
        var21 = DequeWidgetContainer.a("basic", 104, "orbcoin", FrameTimer.field_f);
        var6 = a.field_b.field_p + a.field_b.field_q;
        el.field_J = new Sprite(var6, var6);
        el.field_J.bindAsRenderTarget();
        var21.drawDownscaledAreaAveraged(0, 0, var6, var6);
        j.field_c = SecondaryNodeDequeIterator.a("achievements_lrg", param1 + 1366, "", jg.field_F);
        var5_ref = null;
        var22 = j.field_c;
        for (var8 = 0; var8 < var22.length; var8++) {
          var23 = var22[var8];
          li.a(var23, (byte) -100);
        }
        DisplayNameSelectionPanel.field_y.setAsRasterTarget(-83);
        jl.field_j = 5;
        FrameTimer.field_f = null;
        BitPacketBuffer.field_k = 0;
        jg.field_F = null;
        DiskArchiveRequest.field_y = 10;
        DraggableWidgetContainer.field_G = 0;
        AccountRequestState.field_d = 1;
        bf.field_w = 0;
        ha.field_c = 0;
        MouseWheelSource.field_c = -1;
        jk.field_j = 0;
        eg.field_l = 128;
        ua.field_c = -2;
        ha.field_d = 0;
        MatchingFieldValidator.field_m = 1;
        cg.field_e = 0;
        SpriteState.field_p = 0;
        NameSuggestionsPanel.field_C = -1;
        FrameTimer.field_e = new bf(256, 256, 256, 0);
        FrameTimer.field_e.field_r = 256;
        FrameTimer.field_e.field_k = 0;
        AccountRegistrationPanel.field_y.addFirst(-71, FrameTimer.field_e);
        u.field_b = 0;
        DelayedPcmStream.field_n = 0;
        AccountServiceResult.field_h = 0;
        hc.field_c = 0;
        nf.field_e = 0;
        eg.field_f = new wd(fb.field_t);
        gd.field_a = new wd(TextFieldValidator.field_i);
        fl.field_h = new wd(r.field_b);
        ResizableModalDialog.field_P = eg.field_f;
        ResizableModalDialog.field_P.a(mc.field_b);
        ti.field_f.addListener(ResizableModalDialog.field_P);
        ne.a(50, 39);
        ModalDialog.a(1, 50);
        fg.field_a = new jl[8];
        pc.a(-5695);
        for (var7 = 0; var7 < 8; var7++) {
          fg.field_a[var7] = new jl(var7);
        }
        if (!MouseInput.a(45)) {
          oh.field_a = og.a(4, (byte) 113);
        }
        ld.field_ib = true;
        ModalDialogHost.j(param1 + 1476);
        return;
    }

    private final void m(byte param0) {
        PcmSampleStream dupTemp$0 = null;
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
        PcmSample var11;
        PcmSampleStream var12;
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
        if (AlphaWidgetContainer.field_C > 0) {
          AlphaWidgetContainer.field_C = AlphaWidgetContainer.field_C - 1;
        }
        if (MouseWheelSource.field_c == -1) {
          var2_int = 0;
          if (0 == BitPacketBuffer.field_k &&
            0 != jg.field_H) {
          }
          if (!MouseInput.a(86)) {
            if (0 >= jg.field_H) {
              if (0 < NameSuggestionsPanel.field_C) {
                var2_int = 2;
              }
            } else {
              var2_int = 5;
            }
          } else {
            if (!(BitPacketBuffer.field_k <= 0) ||
              !(jg.field_H <= 0)) {
              var2_int = 6;
            }
          }
          od.a(-126, var2_int, false);
        }
        if (DraggableWidgetContainer.field_G > 0) {
          FrameTimer.field_e.field_k = 1;
          ha.field_d = 0;
          SpriteState.field_p = eg.field_l - 32;
          DraggableWidgetContainer.field_G = DraggableWidgetContainer.field_G - 1;
          if (0 >= DraggableWidgetContainer.field_G) {
            SpriteState.field_p = 0;
            mj.a(255, 12, 0, 43, 100);
          }
        }
        if (FrameTimer.field_e.field_k <= 0) {
          if (MouseWheelSource.field_c < 0) {
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 4000; var2_intLifetime1++) {
              FullscreenFocusCanvas.field_c[var2_intLifetime1] = null;
            }
            var2_ref = (bf) (AccountRegistrationPanel.field_y.beginForward(-3905));
            while (var2_ref != null) {
              stackIn_106_0 = FrameTimer.field_e;
              stackIn_106_1 = var2_ref;
              if (stackIn_106_0 != stackIn_106_1) {
                var2_ref.unlink(4);
              }
              var2_ref = (bf) (AccountRegistrationPanel.field_y.nextForward(-16913));
            }
          }
        } else {
          if (gi.field_g &&
            2 <= ua.field_c &&
            rj.field_h == 0) {
            BitPacketBuffer.field_k = BitPacketBuffer.field_k + 1;
            fc.field_e = fc.field_e + 2;
          }
          if (SpriteState.field_p > 0) {
            SpriteState.field_p = SpriteState.field_p + 8;
            if (SpriteState.field_p > eg.field_l) {
              dg.field_l = 0;
              SpriteState.field_p = 0;
              mj.a(96, 12, 0, 25, 100);
              mj.a(255, 12, 0, 33, 100);
            }
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 4000; var2_intLifetime1++) {
              if (FullscreenFocusCanvas.field_c[var2_intLifetime1] != null &&
                FullscreenFocusCanvas.field_c[var2_intLifetime1].field_h == 2) {
                var3 = FullscreenFocusCanvas.field_c[var2_intLifetime1].field_d - FrameTimer.field_e.field_f;
                var4 = FullscreenFocusCanvas.field_c[var2_intLifetime1].field_q - FrameTimer.field_e.field_u;
                var5_int = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
                if (var5_int < SpriteState.field_p) {
                  FullscreenFocusCanvas.field_c[var2_intLifetime1].field_h = 0;
                  FullscreenFocusCanvas.field_c[var2_intLifetime1].field_p = 64;
                }
              }
            }
            var2_ref = (bf) (AccountRegistrationPanel.field_y.beginForward(-3905));
            while (var2_ref != null) {
              stackIn_106_0 = FrameTimer.field_e;
              stackIn_106_1 = var2_ref;
              if (stackIn_106_0 != stackIn_106_1) {
                var3 = var2_ref.field_f - FrameTimer.field_e.field_f;
                var4Lifetime3 = -FrameTimer.field_e.field_u + var2_ref.field_u;
                var5_intLifetime2 = (int)Math.sqrt((double)(var4Lifetime3 * var4Lifetime3 + var3 * var3));
                for (var6_int = 0; SpriteState.field_p > var6_int; var6_int++) {
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
              var2_ref = (bf) (AccountRegistrationPanel.field_y.nextForward(-16913));
            }
          } else {
            if (ha.field_d > 0) {
              var2_intLifetime1 = MatchingFieldValidator.field_m + 1;
              if (4 == MatchingFieldValidator.field_m) {
                var2_intLifetime1++;
              }
              if (MatchingFieldValidator.field_m == 5) {
                var2_intLifetime1 += 2;
              }
              ha.field_d = ha.field_d - var2_intLifetime1;
              if (null == ah.field_a &&
                MatchingFieldValidator.field_m < 4) {
                var3 = 0;
                if (MatchingFieldValidator.field_m == 2) {
                  var3 = 28665;
                }
                if (3 == MatchingFieldValidator.field_m) {
                  var3 = 42997;
                }
                var11 = gf.field_c[39];
                dupTemp$0 = PcmSampleStream.createForPlaybackRate(var11, 100, 255 * nb.field_g / 100);
                var12 = dupTemp$0;
                ah.field_a = dupTemp$0;
                var12.setSamplePosition(var3);
                var6_int = (var2_intLifetime1 + ha.field_d - 1) / var2_intLifetime1;
                var7 = -300 + (var6_int * 20 - (var11.field_i.length - var3) * 1000 / var11.field_j);
                if (var7 > 0) {
                  AccountCreationResultPanel.field_tb = eg.a(29723, var7, ah.field_a);
                  jk.field_k.addChildStream(AccountCreationResultPanel.field_tb);
                } else {
                  jk.field_k.addChildStream(ah.field_a);
                }
              }
              if (ha.field_d <= 0) {
                ha.field_d = 0;
                dg.field_l = 0;
                mj.a(255, 12, 0, 34, 100);
                mj.a(96, 12, 0, 26, 100);
                AccountCreationResultPanel.field_tb = null;
                ah.field_a = null;
              }
            }
          }
        }
        var2_refLifetime1 = FrameTimer.field_e;
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
        if (AccountServiceResult.field_h > 8) {
          AccountServiceResult.field_h = sh.b(-6, 4);
        }
        vd.field_j = vd.field_j + 3;
        hc.field_c = hc.field_c + 1;
        DelayedPcmStream.field_n = DelayedPcmStream.field_n + 1;
        if (ge.field_c[0] == 2 ||
          ge.field_c[0] == 7 ||
          ge.field_c[0] == 12 ||
          !(ua.field_c >= -2)) {
          vd.field_j = vd.field_j + 9;
          hc.field_c = hc.field_c + 3;
          if (ua.field_c < -2) {
            hc.field_c = hc.field_c + 3;
            DelayedPcmStream.field_n = DelayedPcmStream.field_n + 2;
            vd.field_j = vd.field_j + 9;
          }
        }
        if (DelayedPcmStream.field_n > 1028) {
          if (ua.field_c < ResourceArchive.field_c[rj.field_h]) {
            ua.field_c = ua.field_c + 1;
            if (ua.field_c == 9) {
              var3_ref_bf = new bf(FrameTimer.field_e.field_f, -32, FrameTimer.field_e.field_f, 10);
              var3_ref_bf.field_l = 5;
              AccountRegistrationPanel.field_y.addLast(97, var3_ref_bf);
            }
            if (rj.field_h == 0) {
              nf.field_e = -50;
              if (10 == ua.field_c ||
                ua.field_c == 12) {
                var3Lifetime1 = sh.b(113, 640);
                var4Lifetime1 = -64 + (FrameTimer.field_e.field_f + sh.b(-126, 128));
                for (var5_intLifetime1 = 0; var5_intLifetime1 < 5; var5_intLifetime1++) {
                  var6 = new bf(var3Lifetime1, -var5_intLifetime1 * 64 - 64, var4Lifetime1, 17);
                  var6.field_o = sh.b(-127, 32);
                  AccountRegistrationPanel.field_y.addLast(114, var6);
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
                  AccountRegistrationPanel.field_y.addLast(99, new bf(sh.b(-128, 640), -var3Lifetime1Lifetime1Lifetime1 * 25 - 128, sh.b(60, 128) + FrameTimer.field_e.field_f - 64, 18));
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
                  AccountRegistrationPanel.field_y.addLast(121, var5);
                }
              }
            }
            if (2 == rj.field_h) {
              if (ua.field_c == 5 ||
                10 == ua.field_c ||
                ua.field_c == 15) {
                nf.field_e = -150;
                for (var3Lifetime1Lifetime2 = 0; 25 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
                  AccountRegistrationPanel.field_y.addLast(119, new bf(sh.b(76, 640), -128 + -var3Lifetime1Lifetime2 * 25, -64 + sh.b(-30, 128) + FrameTimer.field_e.field_f, 18));
                }
              }
              if (ua.field_c == 16) {
                for (var3Lifetime1Lifetime2Lifetime1 = 48; var3Lifetime1Lifetime2Lifetime1 < 640; var3Lifetime1Lifetime2Lifetime1 += 96) {
                  var4_ref_bf = new bf(var3Lifetime1Lifetime2Lifetime1, -64 - Math.abs(-320 + var3Lifetime1Lifetime2Lifetime1), var3Lifetime1Lifetime2Lifetime1, 21);
                  var4_ref_bf.field_o = sh.b(-127, 32);
                  AccountRegistrationPanel.field_y.addLast(57, var4_ref_bf);
                }
              }
              if (ua.field_c >= 4 &&
                ua.field_c <= 14 &&
                0 == (ua.field_c & 1)) {
                var3Lifetime1Lifetime2Lifetime2 = sh.b(-128, 2) * 900 + 20;
                for (var4Lifetime1Lifetime2 = 0; var4Lifetime1Lifetime2 < 5; var4Lifetime1Lifetime2++) {
                  var5Lifetime1 = new bf(var3Lifetime1Lifetime2Lifetime2, -var4Lifetime1Lifetime2 * 64 - 64, var3Lifetime1Lifetime2Lifetime2, 17);
                  var5Lifetime1.field_o = sh.b(-126, 32);
                  AccountRegistrationPanel.field_y.addLast(89, var5Lifetime1);
                }
              }
            }
            if (3 == rj.field_h && (ua.field_c == 5 ||
              ua.field_c == 10)) {
              for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 25; var3Lifetime1Lifetime3++) {
                AccountRegistrationPanel.field_y.addLast(115, new bf(sh.b(-126, 640), -128 + 25 * -var3Lifetime1Lifetime3, sh.b(8, 128) - (-FrameTimer.field_e.field_f + 64), 18));
              }
            }
            if (ua.field_c == -2 &&
              rj.field_h > 0) {
              dg.field_l = 0;
              mj.a(255, 12, 0, 43, 100);
            }
          }
          DelayedPcmStream.field_n = sh.b(64, 640);
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
          ByteStorage.field_d = ByteStorage.field_d - 1;
          if (ByteStorage.field_d <= 0) {
            ByteStorage.field_d = 50;
            gf.field_b = gf.field_b - 1;
            var3_ref_bfLifetime1 = new bf(FrameTimer.field_e.field_f, -32, FrameTimer.field_e.field_f, 10);
            if (gf.field_b == 0) {
              var3_ref_bfLifetime1.field_l = 4;
            }
            if (gf.field_b == 1) {
              var3_ref_bfLifetime1.field_l = 0;
            }
            AccountRegistrationPanel.field_y.addLast(69, var3_ref_bfLifetime1);
          }
        }
        if (BitPacketBuffer.field_k >= DiskArchiveRequest.field_y) {
          if (DiskArchiveRequest.field_y < 1000) {
            if (DiskArchiveRequest.field_y <= 0) {
              var3Lifetime2 = DiskArchiveRequest.field_y + 10;
            } else {
              var3Lifetime2 = DiskArchiveRequest.field_y + (DiskArchiveRequest.field_y << 1) / 3;
            }
          } else {
            var3Lifetime2 = 500 + DiskArchiveRequest.field_y;
          }
          var4Lifetime2 = sh.b(-128, 640);
          DiskArchiveRequest.field_y = var3Lifetime2;
          AccountRegistrationPanel.field_y.addLast(60, new bf(var4Lifetime2, -32, var4Lifetime2, 10));
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
        if (ua.field_c <= ResourceArchive.field_c[rj.field_h] &&
          FrameTimer.field_e.field_k > 0) {
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
        var9 = (bf) (AccountRegistrationPanel.field_y.beginForward(-3905));
        while (var9 != null) {
          stackOut_347_0 = var9.a(FullscreenFocusCanvas.field_c, this, 114);
          stackIn_353_0 = stackOut_347_0 ? 1 : 0;
          stackIn_348_0 = stackOut_347_0;
          if (!stackIn_348_0) {
            var9.unlink(4);
          }
          var9 = (bf) (AccountRegistrationPanel.field_y.nextForward(-16913));
        }
        stackIn_353_0Lifetime1 = -1;
        if (stackIn_353_0Lifetime1 > ~DraggableWidgetContainer.field_G) {
          FrameTimer.field_e.field_k = 1;
        }
        for (var3Lifetime4 = 0; 4000 > var3Lifetime4; var3Lifetime4++) {
          if (null != FullscreenFocusCanvas.field_c[var3Lifetime4] &&
            null == FullscreenFocusCanvas.field_c[var3Lifetime4].a((byte) 108)) {
            FullscreenFocusCanvas.field_c[var3Lifetime4] = null;
            if (var3Lifetime4 < FrameTimer.field_d) {
              FrameTimer.field_d = var3Lifetime4;
            }
          }
        }
        if (MatchingFieldValidator.field_m > 0) {
          var35 = FrameTimer.field_e;
          if (rj.field_h < 4) {
            if (FrameTimer.field_e.field_k > 0) {
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
              DraggableWidgetContainer.field_G = 0;
              MouseWheelSource.field_c = -1;
              il.field_i = il.field_i + rj.field_h;
              var35.field_k = -1;
              this.field_D = 0;
              rj.field_h = 0;
              if (field_z == -1) {
                for (var3Lifetime5 = 0; var3Lifetime5 < 4000; var3Lifetime5++) {
                  FullscreenFocusCanvas.field_c[var3Lifetime5] = null;
                }
                var10 = (bf) (AccountRegistrationPanel.field_y.beginForward(-3905));
                while (var10 != null) {
                  if (FrameTimer.field_e != var10) {
                    var10.unlink(4);
                  }
                  var10 = (bf) (AccountRegistrationPanel.field_y.nextForward(-16913));
                }
                if (NameSuggestionsPanel.field_C == 0 &&
                  jg.field_H == 0) {
                }
                hh.field_c = 0;
                bf.field_w = 0;
                ha.field_c = 0;
                jl.field_j = 5;
                MatchingFieldValidator.field_m = 2;
                var3Lifetime5Lifetime1 = 0;
                if (MouseInput.a(108)) {
                  if (!(NameSuggestionsPanel.field_C <= 0) ||
                    !(0 >= jg.field_H)) {
                    var3Lifetime5Lifetime1 = 6;
                  }
                } else {
                  pg.a(true, (byte) -121);
                  sa.a(nf.field_l + na.field_a * 3, 23820);
                  fc.field_e = fc.field_e - (BitPacketBuffer.field_k << 1);
                  BitPacketBuffer.field_k = 0;
                  if (jg.field_H <= 0) {
                    if (NameSuggestionsPanel.field_C > 0) {
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
        if (!(DraggableWidgetContainer.field_G > 1000) ||
          !(RichTextLayout.field_m > 2)) {
          if ((2 == RichTextLayout.field_m) &&
            (ua.field_c == 20)) {
            DraggableWidgetContainer.field_G = 0;
            hc.field_e = "hahahah";
          }
        } else {
          DraggableWidgetContainer.field_G = 0;
          hc.field_e = "hahahah";
        }
        while (LabeledWidgetContainer.e((byte) 103)) {
          stackIn_513_0 = ~field_E;
          stackIn_513_1 = -1;
          if (stackIn_513_0 < stackIn_513_1) {
            hc.field_e = hc.field_e.substring(1) + field_E;
            if ((!(RichTextLayout.field_m >= 2) ||
              !(ua.field_c >= 20) &&
              2 == RichTextLayout.field_m) && 2 <= LabeledWidgetContainer.field_y) {
              stackIn_460_0 = (!a.field_a) ? 0 : 1;
              var3Lifetime6 = stackIn_460_0;
              if (hc.field_e.equalsIgnoreCase("thunder")) {
                cg.field_e = 7;
                a.field_a = true;
              }
              if (hc.field_e.equalsIgnoreCase("beeswax")) {
                DraggableWidgetContainer.field_G = 10000;
                a.field_a = true;
              }
              if (hc.field_e.equalsIgnoreCase("diewell")) {
                ua.field_c = -1 + ResourceArchive.field_c[rj.field_h];
                a.field_a = true;
                hc.field_e = "hahahah";
              }
              if (hc.field_e.equalsIgnoreCase("donefor")) {
                AccountRequestState.field_d = 1000;
                a.field_a = true;
                jk.field_j = 0;
              }
              if (hc.field_e.equalsIgnoreCase("xebeams")) {
                hh.field_c = 1;
                AccountRegistrationPanel.field_y.addLast(70, new bf(0, -128, 0, 13));
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
              if (FrameTimer.field_e.field_k == 0 &&
                MouseWheelSource.field_c == 0) {
                if (25 > FrameTimer.field_e.field_r) {
                  FrameTimer.field_e.field_r = -FrameTimer.field_e.field_r + 192;
                } else if (!(FrameTimer.field_e.field_r >= 167)) {
                  FrameTimer.field_e.field_r = 167;
                }
              } else {
                od.a(-99, 1, false);
              }
              pg.a(true, (byte) -87);
              return;
            }
            FrameTimer.field_e.field_u = 32;
          }
          if (LabeledWidgetContainer.field_y >= 2) {
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
          if (MouseWheelSource.field_c != -1) {
            continue;
          }
          hc.field_e = "hahahah";
          cg.field_e = 0;
        }
        hc.field_c = hc.field_c + 1;
        vd.field_j = vd.field_j + 3;
        stackIn_513_0Lifetime1 = 2;
        stackIn_513_1Lifetime1 = LabeledWidgetContainer.field_y;
        if (stackIn_513_0Lifetime1 <= stackIn_513_1Lifetime1 &&
          cg.field_e == 7) {
          jl.field_j = 20;
          il.field_i = il.field_i + 1;
          fc.field_e = fc.field_e + 1;
          MatchingFieldValidator.field_m = 20;
          a.field_a = true;
        }
        if (hc.field_c > 240) {
          ModalDialog.field_E[2] = ModalDialog.field_E[1];
          hc.field_c = hc.field_c - 240;
          ModalDialog.field_E[1] = ModalDialog.field_E[0];
          ModalDialog.field_E[0] = ge.field_c[0];
          ModalDialog.field_E[5] = ModalDialog.field_E[4];
          ModalDialog.field_E[4] = ModalDialog.field_E[3];
          ModalDialog.field_E[3] = ge.field_c[1];
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
        if (0 > MouseWheelSource.field_c &&
          !bi.field_b) {
          StandardContentDialog.field_gb = StandardContentDialog.field_gb + 1;
          if (1280 < StandardContentDialog.field_gb) {
            StandardContentDialog.field_gb = -640;
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
        MatchingFieldValidator.field_m = MatchingFieldValidator.field_m + 1;
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
        if (var2 > ResourceArchive.field_c[rj.field_h] &&
          ua.field_c <= ResourceArchive.field_c[rj.field_h]) {
          var2 = ResourceArchive.field_c[rj.field_h];
        }
        if (param0 != 91) {
          this.l((byte) 51);
        }
        regionExit1: {
          var3 = sh.b(35, 640);
          var4 = -64 + FrameTimer.field_e.field_f + sh.b(param0 ^ -39, 128);
          var5 = null;
          var10 = var2;
          if (var10 != 0 &&
            1 != var10 &&
            var10 != 4) {
            if (var10 == 5) {
              nf.field_e = 0;
              for (var10 = 0; var10 < 5; var10++) {
                AccountRegistrationPanel.field_y.addLast(108, new bf(var3, 64 * -var10 - 64, var4, 1));
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
                      AccountRegistrationPanel.field_y.addLast(86, new bf(320 + var10 * 24, -Math.abs(-64 + 64 * var10), 320 + 24 * var10, 1));
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
                        AccountRegistrationPanel.field_y.addLast(param0 ^ 29, var11);
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
                                break regionExit1;
                              }
                              AccountRegistrationPanel.field_y.addLast(70, new bf(var3, -64 + -var10 * 64, var4, 4));
                              var10++;
                            }
                          }
                          switch (var10) {
                            case 12:
                              nf.field_e = -50;
                              AccountRegistrationPanel.field_y.addLast(78, new bf(var3, -64, var3, 12));
                              break regionExit1;
                            case 17:
                              nf.field_e = -50;
                              AccountRegistrationPanel.field_y.addLast(61, new bf(32, -64, 32, 12));
                              AccountRegistrationPanel.field_y.addLast(84, new bf(608, -64, 608, 12));
                              break regionExit1;
                            default:
                              break regionExit1;
                            case 20:
                              var9 = new bf(320, -256, var4, 15);
                              AccountRegistrationPanel.field_y.addLast(param0 - 7, var9);
                              DraggableWidgetContainer.field_C = var9.field_k;
                              ua.field_c = ResourceArchive.field_c[rj.field_h] + 1;
                              AccountRequestState.field_d = AccountRequestState.field_d + 1;
                              dg.field_l = 0;
                              mj.a(255, 12, 0, 41, 100);
                              ti.field_f.removeOwnedListener(ResizableModalDialog.field_P);
                              ResizableModalDialog.field_P.f();
                              ResizableModalDialog.field_P = fl.field_h;
                              ti.field_f.addListener(ResizableModalDialog.field_P);
                              ResizableModalDialog.field_P.a(mc.field_b);
                              break regionExit1;
                          }
                        }
                        nf.field_e = 0;
                        for (var10 = 0; var10 < 5; var10++) {
                          AccountRegistrationPanel.field_y.addLast(95, new bf(var3, -64 + -var10 * 64, var4, 1));
                          AccountRegistrationPanel.field_y.addLast(94, new bf(-var3 + 640, 64 * -var10 - 64, -var4 + 640, 1));
                        }
                      } else {
                        nf.field_e = 150;
                        AccountRegistrationPanel.field_y.addLast(81, new bf(var3, -64, var4, 3));
                      }
                    }
                  }
                  break regionExit1;
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
                  AccountRegistrationPanel.field_y.addLast(59, var11);
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
                  AccountRegistrationPanel.field_y.addLast(param0 ^ 22, var15);
                  var10++;
                }
              }
            }
            break regionExit1;
          }
          if (ua.field_c >= 4) {
            nf.field_e = 0;
            for (var10 = -3; var10 < 4; var10++) {
              AccountRegistrationPanel.field_y.addLast(param0 ^ 5, new bf(24 * var10 + 320, -Math.abs(var10 * 64 - 64), var10 * 7680, 1));
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
            AccountRegistrationPanel.field_y.addLast(param0 + 3, new bf(128 + sh.b(11, 384), -128, FrameTimer.field_e.field_f, 1));
          }
        }
    }

    final void clearClientResources(byte param0) {
        StarCannon.clearStaticReferences(122);
        bj.resetStaticState(-1);
        eb.a(true);
        pb.clearStaticReferences(91);
        rd.clearStaticReferences(-29826);
        KeyboardInput.clearStaticReferences(-115);
        lj.clearStaticReferences(87);
        pc.clearStaticReferences(-76);
        ag.clearStaticReferences((byte) 39);
        ClientException.b((byte) 70);
        GameApplet.c(1719);
        gg.clearStaticReferences((byte) 121);
        MouseInput.clearStaticReferences(true);
        MouseWheelSource.clearStaticReferences(15686);
        SoftwareRasterizer.clearStaticReferences();
        ResourceArchive.clearStaticReferences(0);
        BitmapFont.clearStaticReferences();
        oh.clearStaticReferences(-1);
        ec.clearStaticReferences(82);
        PacketBuffer.clearStaticReferences((byte) -59);
        dd.clearStaticReferences(-121);
        qa.clearStaticReferences(-5504);
        mf.clearStaticReferences(23675);
        kg.clearStaticReferences((byte) 103);
        r.resetStaticState(-76);
        ce.clearStaticReferences(30518);
        j.a(-3);
        ri.clearStaticReferences(-15552);
        fb.clearStaticReferences(-113);
        nb.clearStaticReferences(572996488);
        pk.clearStaticReferences(4);
        qi.clearStaticReferences(0);
        vf.clearStaticReferences(false);
        FrameTimer.a(0);
        AwtRasterBuffer.clearDeclaredStaticReferences(-124);
        cg.clearStaticReferences(89);
        FullscreenFocusCanvas.a(-1);
        bb.clearStaticReferences(2);
        bf.resetStaticState(15415);
        d.a(32);
        jl.clearStaticReferences(0);
        m.b(-98);
        lh.a((byte) -113);
        wd.clearStaticReferences();
        AudioOutput.clearStaticReferences();
        eh.g((byte) 101);
        DiskCacheWorker.resetStaticState((byte) 27);
        BufferedRandomAccessFile.clearStaticReferences(-12539);
        BufferedSocket.resetStaticState(105);
        DelayedPcmStream.clearStaticReferences((byte) -61);
        IntrusiveNode.clearDeclaredStaticReferences(false);
        SpriteState.d((byte) -80);
        DualLinkNode.clearStaticReferences((byte) -115);
        md.clearStaticReferences(-27240);
        int var2 = 82 / ((param0 + 63) / 62);
        n.clearStaticReferences(0);
        gi.b(640);
        wc.clearStaticReferences(-1);
        bi.b(0);
        PcmOutputWorker.clearStaticReferences(false);
        gf.clearStaticReferences((byte) -126);
        sd.resetStaticState(false);
        sc.clearStaticReferences(0);
        wg.clearStaticReferences((byte) -117);
        be.clearStaticReferences(20342);
        ModalDialogHost.clearStaticReferences(-14528);
        AccountCreationResultPanel.clearStaticReferences((byte) -90);
        ProgressDialog.clearStaticReferences(false);
        StandardContentDialog.m(-11147);
        ProgressMessageDialog.clearDeclaredStaticReferences(-1);
        AccountRegistrationPanel.clearStaticReferences((byte) 126);
        GuestPlayConfirmationForm.clearStaticReferences(-117);
        LoginPanel.clearStaticReferences(-128);
        DisplayNameSelectionPanel.clearStaticReferences(false);
        ma.clearStaticReferences((byte) 67);
        sg.clearStaticReferences(false);
        g.clearStaticReferences(-12837);
        ak.clearStaticReferences((byte) 94);
        GzipDecompressor.clearStaticReferences((byte) 59);
        ti.a((byte) 13);
        SynthesizerVoice.clearStaticReferences();
        VorbisSample.clearStaticReferences();
        VorbisFloor.clearStaticReferences();
        SoundCache.clearStaticReferences((byte) 80);
        ih.clearStaticReferences((byte) -125);
        jf.a(true);
        ua.clearStaticReferences(128);
        ne.a(-109);
        BitPacketBuffer.clearStaticReferences(36);
        fc.resetStaticState(20811);
        u.resetStaticState(2);
        hc.a(false);
        sa.clearStaticReferences(30334);
        v.clearStaticReferences((byte) -63);
        s.clearStaticReferences((byte) -104);
        hh.a((byte) -22);
        vh.h((byte) -98);
        jh.b(126);
        NetworkArchiveRequest.clearDeclaredStaticReferences((byte) 108);
        DiskArchiveRequest.clearDeclaredStaticReferences(-64);
        t.clearStaticReferences((byte) 113);
        BoundedRandomAccessFile.clearStaticReferences(0);
        la.clearStaticReferences((byte) 1);
        ArchiveRequest.clearStaticReferences(0);
        IsaacRandom.clearStaticReferences(-730625660);
        pd.resetStaticState((byte) 98);
        FullscreenStatusDialog.resetStaticState(true);
        fg.clearStaticReferences((byte) 6);
        DefaultTextWidgetRenderer.resetStaticState((byte) 125);
        gl.clearStaticReferences();
        fd.clearStaticReferences(-12241);
        kl.clearStaticReferences(21367);
        lb.a((byte) -49);
        ll.clearStaticReferences(-1);
        ee.clearStaticReferences((byte) 79);
        wi.clearStaticReferences(64);
        bl.a(-29584);
        ac.clearStaticReferences((byte) -77);
        a.a(-1);
        pe.clearStaticReferences((byte) 93);
        ca.clearStaticReferences(true);
        ai.clearStaticReferences(0);
        DelegatingCanvas.clearStaticReferences((byte) 56);
        te.a(-1);
        dl.clearStaticReferences(true);
        ByteStorage.resetStaticState((byte) 63);
        Bzip2Decompressor.clearStaticReferences();
        Bzip2State.clearStaticReferences(-4918);
        va.clearStaticReferences((byte) 80);
        mc.a((byte) 40);
        ea.clearStaticReferences((byte) 48);
        ni.clearStaticReferences(-81);
        w.clearStaticReferences(3);
        eg.clearStaticReferences((byte) -118);
        ci.clearStaticReferences(-124);
        TextLayout.clearStaticReferences((byte) -74);
        UiWidget.c((byte) -44);
        InteractiveWidget.clearStaticReferences(-115);
        SingleChildWidgetContainer.resetStaticState(0);
        ResizableModalDialog.releaseDeclaredStaticReferences(false);
        ModalDialog.clearDeclaredStaticReferences((byte) -37);
        DequeWidgetContainer.e((byte) 73);
        ba.clearStaticReferences(125);
        dh.clearStaticReferences((byte) -107);
        na.resetStaticState(426388817);
        ff.f(-75);
        rc.clearStaticReferences((byte) -14);
        ta.resetStaticState(-32769);
        gd.a((byte) 123);
        ha.clearStaticReferences((byte) -62);
        b.clearStaticReferences(true);
        ic.clearStaticReferences((byte) -120);
        wj.a(false);
        oe.b(12);
        ProxyAuthenticationRequiredException.clearStaticReferences(-11434);
        NanoFrameTimer.b(-22720);
        ImageProducerRasterBuffer.clearStaticReferences(0);
        jk.clearStaticReferences(-124);
        nf.clearStaticReferences(-109);
        LabeledWidgetContainer.clearStaticReferences((byte) -95);
        EditableTextField.clearStaticReferences((byte) 73);
        ContentTransitionDialog.clearStaticReferences(-102);
        StripedProgressWidget.clearStaticReferences(1851621384);
        NameSuggestionsPanel.clearStaticReferences(-16);
        RichTextWidget.clearDeclaredStaticReferences((byte) 119);
        jg.e(934716193);
        pa.f(-200);
        gh.resetStaticState(13329);
        TextFieldValidator.d((byte) 100);
        vg.clearStaticReferences(-117);
        RegistrationAgreementPane.clearStaticReferences(0);
        el.clearStaticReferences((byte) 115);
        sj.clearStaticReferences((byte) 126);
        SoundFilter.clearStaticReferences();
        li.clearStaticReferences(-23);
        RichTextLayout.clearDeclaredStaticReferences((byte) -2);
        DirectByteStorage.clearStaticReferences(20756);
        ve.resetStaticState(32729);
        DraggableWidgetContainer.clearStaticReferences(-123);
        DropTargetWidgetContainer.resetDeclaredStaticState(9392);
        o.clearStaticReferences(4432);
        IterableNodeHashTable.a(false);
        SecondaryNodeDeque.clearStaticReferences(-110);
        mi.clearStaticReferences(1);
        ej.clearDeclaredStaticReferences(99);
        fl.clearStaticReferences(115);
        cd.clearStaticReferences(8192);
        NodeHashTableIterator.a(true);
        SecondaryNodeDequeIterator.d(-18147);
        rh.clearStaticReferences(false);
        gb.clearStaticReferences(122);
        fh.clearStaticReferences((byte) -46);
        sh.b(4);
        tf.clearStaticReferences(18172);
        AlphaWidgetContainer.h(24288);
        vc.clearStaticReferences((byte) 35);
        re.clearStaticReferences(0);
        hj.resetStaticState((byte) -45);
        ld.clearDeclaredStaticReferences(8240);
        oj.d(-113);
        ah.clearStaticReferences(-91);
        rj.clearStaticReferences(-1);
        hb.a(9681);
        AccountRequestState.releaseStatics(true);
        AccountServiceResult.clearStaticReferences(-1);
        qb.resetStaticState(-115);
        ge.a(45);
        q.clearStaticReferences((byte) 119);
        DialogMessagePane.clearStaticReferences(0);
        mj.clearStaticReferences(true);
        od.clearStaticReferences(83);
        cl.clearStaticReferences((byte) 121);
        vd.clearStaticReferences(32);
        FullscreenNoticeType.clearStaticReferences((byte) 64);
        bc.clearStaticReferences((byte) -128);
        we.b((byte) 95);
        dg.clearStaticReferences(124);
        of.clearStaticReferences(true);
        il.clearStaticReferences(2147483647);
        TextLineMetrics.resetStaticState(false);
        AccountNameAvailabilityValidator.resetStaticState(0);
        PasswordValidator.clearStaticReferences((byte) -98);
        ConfirmedEmailAvailabilityValidator.clearDeclaredStaticReferences(1);
        AgeValidator.clearDeclaredStaticReferences(24979);
        MatchingFieldValidator.e((byte) 114);
        og.clearStaticReferences((byte) 92);
        TextHotspotBounds.a(false);
        p.a(11);
        DebouncedFieldValidator.clearStaticReferences(1);
        sk.a(false);
        this.field_u = null;
    }

    final void renderClientFrame(byte param0) {
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
          stackIn_3_0 = DialogMessagePane.field_E;
        }
        var2 = stackIn_3_0;
        if (ProxyAuthenticationRequiredException.c(4)) {
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
          TextHotspotBounds.a((java.awt.Canvas) (var2), (byte) -128);
          return;
        }
        if (oh.field_a != null) {
          ma.a(q.field_i, -13923, 100.0f);
          TextHotspotBounds.a((java.awt.Canvas) (var2), (byte) 72);
          return;
        }
        if (FullscreenFocusCanvas.field_d == 0) {
          SoftwareRasterizer.clearRaster();
        } else {
          var3_int = (320 - FrameTimer.field_e.field_f) / 48;
          eb.field_b[ModalDialog.field_E[2]].drawScaled(var3_int, 240 + hc.field_c, 320, 240);
          eb.field_b[ModalDialog.field_E[1]].drawScaled(var3_int, hc.field_c, 320, 240);
          eb.field_b[ModalDialog.field_E[0]].drawScaled(var3_int, -240 + hc.field_c, 320, 240);
          var3_int += 320;
          eb.field_b[ModalDialog.field_E[5]].drawScaled(var3_int, hc.field_c + 240, 320, 240);
          eb.field_b[ModalDialog.field_E[4]].drawScaled(var3_int, hc.field_c, 320, 240);
          eb.field_b[ModalDialog.field_E[3]].drawScaled(var3_int, -240 + hc.field_c, 320, 240);
          var3_int += 320;
          eb.field_b[ModalDialog.field_E[2]].drawScaled(var3_int, 240 + hc.field_c, 320, 240);
          eb.field_b[ModalDialog.field_E[1]].drawScaled(var3_int, hc.field_c, 320, 240);
          eb.field_b[ModalDialog.field_E[0]].drawScaled(var3_int, -240 + hc.field_c, 320, 240);
          var3_int -= 960;
          eb.field_b[ModalDialog.field_E[5]].drawScaled(var3_int, 240 + hc.field_c, 320, 240);
          eb.field_b[ModalDialog.field_E[4]].drawScaled(var3_int, hc.field_c, 320, 240);
          eb.field_b[ModalDialog.field_E[3]].drawScaled(var3_int, -240 + hc.field_c, 320, 240);
        }
        if (MouseWheelSource.field_c == -1) {
          if (50 <= cd.field_c) {
            gb.field_r.drawOpaque(-gb.field_r.field_x + 640 >> 1, 0);
          } else {
            MouseWheelSource.field_e.drawOpaque(-MouseWheelSource.field_e.field_x + 640 >> 1, 0);
            if (25 >= cd.field_c &&
              field_z != -2) {
              gb.field_r.drawWithOpacity(640 - gb.field_r.field_x >> 1, 0, -(cd.field_c * 10) + 250);
            }
            if (cd.field_c > 25) {
              gb.field_r.drawWithOpacity(-gb.field_r.field_x + 640 >> 1, 0, -250 + 10 * cd.field_c);
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
              ProgressDialog.field_cb == 1) {
              this.b(0, 7306);
            }
            fg.field_a[field_z].a(320, 100);
          }
        }
        var3 = (wf) (pk.field_a.beginForward(-3905));
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
          j.field_c[var3.field_g].drawQuarterSizeAveraged(8, var4);
          DropTargetWidgetContainer.field_y.drawString(AgeValidator.field_j[var3.field_g], 48, var4 + DropTargetWidgetContainer.field_y.field_p, 65535, -1);
        }
        if (TextLineMetrics.field_e != 0) {
          var4Lifetime1 = 256 * IsaacRandom.field_e / 50;
          if (0 < var4Lifetime1) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_f, 0, var4Lifetime1);
          }
        }
        if (gh.f(-23093)) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 128);
          SoftwareRasterizer.fillRectangle(-12 + (-(ClientException.a(6940) / 2) + 320), -12 - wc.d(20) / 2 + 240, 24 + ClientException.a(6940), 24 + wc.d(20), 0);
          fg.a(32513, jk.field_f, 12, 12);
        }
        if (BoundedRandomAccessFile.a(false) &&
          !gh.f(param0 ^ -23075)) {
          stackIn_88_0 = (n.field_a != null);
          jf.a(stackIn_88_0, param0 ^ 106);
        }
        dd.a((java.awt.Canvas) (var2), 0, 0, -23466);
        return;
    }

    final void initializeClient(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = field_A;
        this.a(9, 9, 0, 8, true, 6, false, 7);
        hh.field_b = new Sprite[9];
        for (var2 = 0; var2 < 9; var2++) {
          hh.field_b[var2] = new Sprite(1, 1);
          hh.field_b[var2].field_B[0] = 65535;
        }
        var2Lifetime1 = 60 % ((param0 + 23) / 47);
        BufferedSocket.field_m = 33023;
        hh.field_b[4] = null;
        AccountServiceResult.field_b = 16777215;
        sd.field_a = 33023;
        AudioOutput.configureAudio(22050, false, 10);
        nb.field_f = AudioOutput.createOutput(nb.field_e, (java.awt.Component) ((Object) DialogMessagePane.field_E), 0, 512);
        ea.field_d = AudioOutput.createOutput(nb.field_e, (java.awt.Component) ((Object) DialogMessagePane.field_E), 1, 22050);
        jk.field_k = new PcmStreamMixer();
        ti.field_f = new PcmStreamMixer();
        nb.field_f.setRootStream(jk.field_k);
        ea.field_d.setRootStream(ti.field_f);
        RichTextLayout.field_m = 0;
        bi.field_b = false;
        mc.field_b = 128;
        dg.field_l = 0;
        nb.field_g = 64;
        StandardContentDialog.field_gb = -2048;
        nf.field_l = 0;
        ua.field_c = -2;
        FullscreenFocusCanvas.field_d = 2;
        this.a(false, false, false, true, -752);
        wa.a(0, -75, 16777215, 0, rj.field_l, (java.applet.Applet) (this));
    }

    final void disposeClient(int param0) {
        if (n.field_a != null) {
          re.a(param0 ^ -25109);
        }
        if (null != nb.field_f) {
          nb.field_f.dispose();
        }
        if (null != ea.field_d) {
          ea.field_d.dispose();
        }
        la.a(2);
        if (param0 != -25109) {
          this.m((byte) 25);
        }
    }

    public static void clearStaticReferences(int param0) {
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
        SoundCache.field_d = SoundCache.field_d + 1;
        if (kg.field_a != 0) {
          na.field_d = na.field_d + fc.field_e;
          il.field_i = il.field_i + 2;
          oe.field_a = oe.field_a + 1;
          SoundCache.field_d = SoundCache.field_d + 1;
          fc.field_e = fc.field_e - jl.field_d * fc.field_e;
        }
        if (wc.field_c[98]) {
          jl.field_d = jl.field_d + pe.field_d;
          SoundCache.field_d = SoundCache.field_d + 5;
          oe.field_a = oe.field_a + 5;
          il.field_i = il.field_i + 10;
          fc.field_e = fc.field_e - pe.field_d * na.field_d;
        }
        if (wc.field_c[99]) {
          oe.field_a = oe.field_a + 3;
          na.field_d = na.field_d - ResizableModalDialog.field_Q;
          fc.field_e = fc.field_e + jl.field_d * ResizableModalDialog.field_Q;
          SoundCache.field_d = SoundCache.field_d + 7;
          il.field_i = il.field_i + 10;
        }
        if (wc.field_c[84]) {
          fc.field_e = fc.field_e - na.field_d;
          jl.field_d = jl.field_d + 1;
          oe.field_a = oe.field_a + 10;
          SoundCache.field_d = SoundCache.field_d - 10;
        }
        va.field_f = va.field_f + 1;
        RichTextLayout.field_u = 256;
        if (5 < va.field_f) {
          va.field_f = va.field_f - 5;
          pd.field_a = pd.field_a + 1;
          if (pd.field_a >= 5) {
            pd.field_a = pd.field_a - 5;
          }
        }
        if (null != pk.field_a.beginForward(-3905)) {
          fieldTemp$0 = this.field_B + 1;
          this.field_B = this.field_B + 1;
          if (fieldTemp$0 == 335) {
            this.field_B = 0;
            pk.field_a.removeFirst((byte) 39);
          }
        }
        if (TextLineMetrics.field_e != 0) {
          if (1 == TextLineMetrics.field_e) {
            IsaacRandom.field_e = IsaacRandom.field_e + 1;
            if (IsaacRandom.field_e == 50) {
              if (!gh.f(-23093)) {
                pk.b(0);
              } else {
                mf.a((byte) -58);
              }
              TextLineMetrics.field_e = 2;
            }
          } else {
            if (TextLineMetrics.field_e != 2) {
              IsaacRandom.field_e = IsaacRandom.field_e - 1;
              if (IsaacRandom.field_e == 0) {
                TextLineMetrics.field_e = 0;
              }
            } else {
              if (MouseInput.a(77)) {
                field_z = FullscreenStatusDialog.field_ab;
              } else {
                oh.field_a = og.a(4, (byte) 113);
                sa.a(nf.field_l + na.field_a * 3, 23820);
                field_z = ff.field_o;
              }
              if (gh.f(-23093)) {
                NanoFrameTimer.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, a.field_b, -11, 12, false);
              }
              TextLineMetrics.field_e = 3;
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

    final static void a(ResourceArchive param0, boolean param1, int param2, ResourceArchive param3, ResourceArchive param4) {
        try {
          qa.field_a = SectorCacheStore.a("", 15);
          if (param2 != -20169) {
            field_E = 's';
          }
          qa.field_a.a(false, false);
          fc.a(param0, param4, (byte) 95, param3);
          BufferedRandomAccessFile.b(30000);
          AlphaWidgetContainer.field_x = cl.field_k;
          DualLinkNode.field_k = cl.field_k;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "StarCannon.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
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
        if (ResourceArchive.field_c[rj.field_h] < var2 &&
          ua.field_c <= ResourceArchive.field_c[rj.field_h]) {
          var2 = ResourceArchive.field_c[rj.field_h];
        }
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted2 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var3 = sh.b(-126, 640);
        var4 = -64 + FrameTimer.field_e.field_f + sh.b(-127, 128);
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
              AccountRegistrationPanel.field_y.addLast(107, var11);
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
                      AccountRegistrationPanel.field_y.addLast(73, new bf(var3, -64, var4, 3));
                      AccountRegistrationPanel.field_y.addLast(64, new bf(640 - var3, -64, 640 - var3, 21));
                    } else {
                      if (var7 != 8 &&
                        var7 != 14) {
                        if (var7 != 12 &&
                          var7 != 16) {
                          if (13 == var7) {
                            nf.field_e = -50;
                            var7 = sh.b(-126, 180) + 32;
                            AccountRegistrationPanel.field_y.addLast(74, new bf(var7, -64, var7, 12));
                            var7 = 608 - sh.b(-128, 180);
                            AccountRegistrationPanel.field_y.addLast(56, new bf(var7, -64, var7, 12));
                          } else {
                            if (var7 == 17) {
                              nf.field_e = -50;
                              AccountRegistrationPanel.field_y.addLast(82, new bf(32, -64, 32, 21));
                              if (sh.b(34, 2) == 0) {
                                AccountRegistrationPanel.field_y.addLast(91, new bf(320, -32, 320, 18));
                                AccountRegistrationPanel.field_y.addLast(67, new bf(320, -96, 320, 18));
                                AccountRegistrationPanel.field_y.addLast(79, new bf(320, -160, 320, 18));
                              } else {
                                AccountRegistrationPanel.field_y.addLast(69, new bf(320, -96, 320, 21));
                              }
                              AccountRegistrationPanel.field_y.addLast(106, new bf(608, -64, 608, 21));
                            } else {
                              if (18 == var7) {
                                nf.field_e = 150;
                                AccountRegistrationPanel.field_y.addLast(76, new bf(var3, -64, var4, 3));
                                var7 = 0;
                                while (true) {
                                  stackIn_104_0 = (2 == nf.field_l) ? 2 : 1;
                                  if (stackIn_104_0 <= var7) {
                                    AccountRegistrationPanel.field_y.addLast(107, new bf(-var3 + 640, -64, 640 - var4, 3));
                                    decompiledFrameCompleted2 = false;
                                    break;
                                  }
                                  AccountRegistrationPanel.field_y.addLast(112, new bf(320, 64 * -var7 - 128, 320, 3));
                                  var7++;
                                }
                              }
                              if ((decompiledFrameCompleted2) &&
                                ((20 == var7))) {
                                var6 = new bf(320, -256, var4, 16);
                                AccountRegistrationPanel.field_y.addLast(88, var6);
                                DraggableWidgetContainer.field_C = var6.field_k;
                                ua.field_c = 1 + ResourceArchive.field_c[rj.field_h];
                                AccountRequestState.field_d = AccountRequestState.field_d + 1;
                                dg.field_l = 0;
                                mj.a(255, 12, 0, 41, 100);
                                ti.field_f.removeOwnedListener(ResizableModalDialog.field_P);
                                ResizableModalDialog.field_P.f();
                                ResizableModalDialog.field_P = fl.field_h;
                                ti.field_f.addListener(ResizableModalDialog.field_P);
                                ResizableModalDialog.field_P.a(mc.field_b);
                              }
                            }
                          }
                        } else {
                          nf.field_e = 100;
                          AccountRegistrationPanel.field_y.addLast(75, new bf(var3, -64, -64 + sh.b(-1, 128), 5));
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
                          AccountRegistrationPanel.field_y.addLast(100, var11Lifetime1);
                        }
                        var8Lifetime1Lifetime1 = 64 + sh.b(100, 512);
                        AccountRegistrationPanel.field_y.addLast(95, new bf(var8Lifetime1Lifetime1, -96, var8Lifetime1Lifetime1, 21));
                      }
                    }
                  } else {
                    nf.field_e = 0;
                    for (var7 = 0; 5 > var7; var7++) {
                      AccountRegistrationPanel.field_y.addLast(117, new bf(var3, -64 + -var7 * 64, var4, 1));
                    }
                    AccountRegistrationPanel.field_y.addLast(122, new bf(-var3 + 640, -64, -var3 + 640, 21));
                  }
                } else {
                  nf.field_e = 0;
                  for (var7 = 0; 5 > var7; var7++) {
                    AccountRegistrationPanel.field_y.addLast(81, new bf(var3, -64 + -var7 * 64, var4, 1));
                  }
                  AccountRegistrationPanel.field_y.addLast(57, new bf(640 - var3, -64, -var4 + 640, 3));
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
                  AccountRegistrationPanel.field_y.addLast(63, new bf(var3, -64 + 64 * -var7, var4, 4));
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
                AccountRegistrationPanel.field_y.addLast(115, var8_ref_bf);
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
            AccountRegistrationPanel.field_y.addLast(88, new bf(320 + var7Lifetime1 * 24, -Math.abs(-64 + var7Lifetime1 * 64), 24 * var7Lifetime1 + 320, 1));
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
