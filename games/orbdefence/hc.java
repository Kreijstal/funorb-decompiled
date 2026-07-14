/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ca {
    static int field_j;
    static hj field_i;
    static int field_f;
    byte[] field_m;
    int field_g;
    long field_h;
    static hj field_l;
    static String field_k;

    final static void a(byte param0, boolean param1, String param2, int param3, java.awt.Color param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 < -33) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    hc.a((byte) -33, true, (String) null, -40, (java.awt.Color) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        var10 = tf.field_f.getGraphics();
                        if (null != e.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        e.field_a = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10.setColor(java.awt.Color.black);
                        var10.fillRect(0, 0, bd.field_k, th.field_e);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param4 != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param4 = new java.awt.Color(140, 17, 17);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (gj.field_f == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        gj.field_f = tf.field_f.createImage(304, 34);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = gj.field_f.getGraphics();
                        var11.setColor(param4);
                        var11.drawRect(0, 0, 303, 33);
                        var11.fillRect(2, 2, 3 * param3, 30);
                        var11.setColor(java.awt.Color.black);
                        var11.drawRect(1, 1, 301, 31);
                        var11.fillRect(2 + 3 * param3, 2, 300 - 3 * param3, 30);
                        var11.setFont(e.field_a);
                        var11.setColor(java.awt.Color.white);
                        var11.drawString(param2, (-(6 * param2.length()) + 304) / 2, 22);
                        boolean discarded$1 = var10.drawImage(gj.field_f, bd.field_k / 2 + -152, -18 + th.field_e / 2, (java.awt.image.ImageObserver) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = bd.field_k / 2 - 152;
                        var8 = -18 + th.field_e / 2;
                        var10.setColor(param4);
                        var10.drawRect(var7, var8, 303, 33);
                        var10.fillRect(2 + var7, 2 + var8, 3 * param3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(var7 + 1, 1 + var8, 301, 31);
                        var10.fillRect(3 * param3 + (2 + var7), 2 + var8, 300 - param3 * 3, 30);
                        var10.setFont(e.field_a);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param2, var7 - -((304 - 6 * param2.length()) / 2), var8 + 22);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == nl.field_a) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10.setFont(e.field_a);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(nl.field_a, bd.field_k / 2 + -(nl.field_a.length() * 6 / 2), th.field_e / 2 + -26);
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    tf.field_f.repaint();
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_l = null;
        field_i = null;
        if (param0 != 31) {
            Object var2 = null;
            hc.a((byte) -112, true, (String) null, 45, (java.awt.Color) null);
        }
    }

    hc(long param0, int param1, byte[] param2) {
        ((hc) this).field_m = param2;
        ((hc) this).field_h = param0;
        ((hc) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Not yet achieved";
    }
}
