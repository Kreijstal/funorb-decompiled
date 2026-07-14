/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pb extends rc {
    static tf field_t;
    volatile boolean field_u;
    boolean field_q;
    static String field_o;
    static int field_r;
    static long[] field_p;
    static String field_v;
    boolean field_n;
    static int[] field_m;
    static float field_s;

    final static void a(int param0, java.awt.Color param1, boolean param2, boolean param3, String param4) {
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
                        var9 = f.field_kb.getGraphics();
                        if (null != hh.field_a) {
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
                        hh.field_a = new java.awt.Font("Helvetica", 1, 13);
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
                        if (!param2) {
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
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, kh.field_d, ok.field_c);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 != null) {
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
                        param1 = new java.awt.Color(140, 17, 17);
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
                        if (null == ff.field_a) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ff.field_a = f.field_kb.createImage(304, 34);
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
                        var10 = ff.field_a.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param0, 30);
                        var10.setColor(java.awt.Color.black);
                        if (!param3) {
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
                    return;
                }
                case 11: {
                    try {
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param0 + 2, 2, 300 + -(3 * param0), 30);
                        var10.setFont(hh.field_a);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(ff.field_a, kh.field_d / 2 - 152, ok.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
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
                        var7 = kh.field_d / 2 + -152;
                        var8 = ok.field_c / 2 + -18;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(var7 + 2, 2 + var8, 3 * param0, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, 1 + var8, 301, 31);
                        var9.fillRect(param0 * 3 + (2 + var7), 2 + var8, -(param0 * 3) + 300, 30);
                        var9.setFont(hh.field_a);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param4, (-(6 * param4.length()) + 304) / 2 + var7, 22 + var8);
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
                        if (wh.field_q == null) {
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
                        var9.setFont(hh.field_a);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(wh.field_q, kh.field_d / 2 + -(6 * wh.field_q.length() / 2), -26 + ok.field_c / 2);
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var5 = (Exception) (Object) caughtException;
                    f.field_kb.repaint();
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

    abstract byte[] e(int param0);

    public static void f(int param0) {
        field_o = null;
        field_t = null;
        field_p = null;
        field_m = null;
        field_v = null;
        if (param0 != 31735) {
            Object var2 = null;
            pb.a(68, (java.awt.Color) null, true, true, (String) null);
        }
    }

    abstract int g(int param0);

    pb() {
        ((pb) this).field_u = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new tf();
        field_o = "Type your age in years";
        field_m = new int[256];
        field_v = "Accept";
        field_p = new long[32];
    }
}
