/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hh extends IOException {
    static int field_f;
    static nb field_c;
    static ri[] field_a;
    static hr[] field_e;
    static String field_b;
    static al field_d;

    final static void a(boolean param0, int param1, java.awt.Color param2, boolean param3, String param4) {
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
                    try {
                        var10 = qn.field_f.getGraphics();
                        if (null == f.field_s) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        f.field_s = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var10.setColor(java.awt.Color.black);
                        var10.fillRect(0, 0, gi.field_h, wq.field_b);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null != gf.field_a) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        gf.field_a = qn.field_f.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11 = gf.field_a.getGraphics();
                        var11.setColor(param2);
                        var11.drawRect(0, 0, 303, 33);
                        var11.fillRect(2, 2, param1 * 3, 30);
                        var11.setColor(java.awt.Color.black);
                        var11.drawRect(1, 1, 301, 31);
                        var11.fillRect(param1 * 3 + 2, 2, 300 + -(3 * param1), 30);
                        var11.setFont(f.field_s);
                        if (param0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = null;
                        hh.a(true, -9, (java.awt.Color) null, true, (String) null);
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
                        var11.setColor(java.awt.Color.white);
                        var11.drawString(param4, (-(param4.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var10.drawImage(gf.field_a, gi.field_h / 2 + -152, -18 + wq.field_b / 2, (java.awt.image.ImageObserver) null);
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
                        var7 = -152 + gi.field_h / 2;
                        var8 = wq.field_b / 2 + -18;
                        var10.setColor(param2);
                        var10.drawRect(var7, var8, 303, 33);
                        var10.fillRect(2 + var7, var8 + 2, 3 * param1, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(var7 + 1, 1 + var8, 301, 31);
                        var10.fillRect(param1 * 3 + (var7 + 2), var8 - -2, 300 - param1 * 3, 30);
                        var10.setFont(f.field_s);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param4, var7 + (304 + -(param4.length() * 6)) / 2, 22 + var8);
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
                        if (vk.field_d == null) {
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
                        var10.setFont(f.field_s);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(vk.field_d, gi.field_h / 2 - vk.field_d.length() * 6 / 2, wq.field_b / 2 + -26);
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    qn.field_f.repaint();
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

    hh(String param0) {
        super(param0);
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        int var1 = -11 % ((param0 - 24) / 60);
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new nb(2);
        field_b = "Connection lost. <%0>";
    }
}
