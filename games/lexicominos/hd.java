/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static r field_a;

    public static void a(int param0) {
        if (param0 > -100) {
            Object var2 = null;
            hd.a(-104, (byte) 63, (String) null, true, (java.awt.Color) null);
        }
        field_a = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = Lexicominos.field_L ? 1 : 0;
        if (param4 != 0) {
            field_a = null;
        }
        for (var10 = -param3; 0 > var10; var10++) {
            param6[param1] = param0[(param2 >> 2090415284) * param8 + param7];
            param2 = param2 + param9;
            param1 = param1 + param5;
        }
    }

    final static void a(int param0, byte param1, String param2, boolean param3, java.awt.Color param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = ug.field_y.getGraphics();
                        if (null == af.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        af.field_a = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!param3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, u.field_sb, bk.field_d);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param4 != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param4 = new java.awt.Color(140, 17, 17);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (wb.field_g != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        wb.field_g = ug.field_y.createImage(304, 34);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = wb.field_g.getGraphics();
                        var10.setColor(param4);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param0, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(2 - -(3 * param0), 2, 300 - param0 * 3, 30);
                        var10.setFont(af.field_a);
                        if (param1 == -90) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_a = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(wb.field_g, -152 + u.field_sb / 2, bk.field_d / 2 + -18, (java.awt.image.ImageObserver) null);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = u.field_sb / 2 - 152;
                        var8 = bk.field_d / 2 + -18;
                        var9.setColor(param4);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 - -2, 3 * param0, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, 1 + var8, 301, 31);
                        var9.fillRect(param0 * 3 + 2 + var7, var8 + 2, 300 - 3 * param0, 30);
                        var9.setFont(af.field_a);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param2, (-(param2.length() * 6) + 304) / 2 + var7, 22 + var8);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (null == of.field_c) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9.setFont(af.field_a);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(of.field_c, u.field_sb / 2 + -(6 * of.field_c.length() / 2), bk.field_d / 2 - 26);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var5 = (Exception) (Object) caughtException;
                    ug.field_y.repaint();
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, int param1) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = param0.charAt(0);
        int var3 = 1;
        if (param1 != 17) {
            hd.a(89);
        }
        while (var3 < param0.length()) {
            if (!(param0.charAt(var3) == var2)) {
                return false;
            }
            var3++;
        }
        return true;
    }

    static {
    }
}
