/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_a;
    static kk field_b;

    final static void a(boolean param0, int param1, java.awt.Color param2, String param3, byte param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = ki.field_f.getGraphics();
                        if (dc.field_s != null) {
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
                        dc.field_s = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param4 <= -43) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (!param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, og.field_pb, wf.field_b);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param2 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param2 = new java.awt.Color(140, 17, 17);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (hb.field_i != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        hb.field_i = ki.field_f.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = hb.field_i.getGraphics();
                        var10.setColor(param2);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param1, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(2 - -(3 * param1), 2, -(3 * param1) + 300, 30);
                        var10.setFont(dc.field_s);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param3, (304 + -(param3.length() * 6)) / 2, 22);
                        boolean discarded$2 = var9.drawImage(hb.field_i, og.field_pb / 2 - 152, wf.field_b / 2 - 18, (java.awt.image.ImageObserver) null);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = -152 + og.field_pb / 2;
                        var8 = wf.field_b / 2 + -18;
                        var9.setColor(param2);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(var7 + 2, var8 - -2, param1 * 3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                        var9.fillRect(var7 - -2 + param1 * 3, 2 + var8, -(3 * param1) + 300, 30);
                        var9.setFont(dc.field_s);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param3, var7 + (304 - param3.length() * 6) / 2, 22 + var8);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null != fk.field_c) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        return;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9.setFont(dc.field_s);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(fk.field_c, og.field_pb / 2 + -(6 * fk.field_c.length() / 2), wf.field_b / 2 + -26);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    var5 = (Exception) (Object) caughtException;
                    ki.field_f.repaint();
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) hd.field_p);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hd.field_p);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) hd.field_p);
        if (param0 >= -99) {
          fb.a(-114);
          db.field_bb = 0;
          return;
        } else {
          db.field_bb = 0;
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 30580) {
            field_a = -63;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
    }
}
