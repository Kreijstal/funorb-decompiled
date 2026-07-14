/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge extends qd implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static hh field_p;
    static int field_i;
    static String field_m;
    static boolean field_n;
    static bi[] field_l;
    private java.awt.image.ImageConsumer field_o;
    private java.awt.image.ColorModel field_j;
    static bi[] field_k;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(String param0, int param1, boolean param2, int param3, java.awt.Color param4) {
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
                        var9 = tm.field_i.getGraphics();
                        if (ha.field_a == null) {
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
                        ha.field_a = new java.awt.Font("Helvetica", 1, 13);
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
                        if (!param2) {
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
                        var9.fillRect(0, 0, me.field_e, nn.field_b);
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
                        if (rm.field_a == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        rm.field_a = tm.field_i.createImage(304, 34);
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
                        var10 = rm.field_a.getGraphics();
                        var10.setColor(param4);
                        var10.drawRect(0, param3, 303, 33);
                        var10.fillRect(2, 2, 3 * param1, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param1 + 2, 2, 300 + -(param1 * 3), 30);
                        var10.setFont(ha.field_a);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (-(6 * param0.length()) + 304) / 2, 22);
                        boolean discarded$2 = var9.drawImage(rm.field_a, me.field_e / 2 - 152, -18 + nn.field_b / 2, (java.awt.image.ImageObserver) null);
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
                        var7 = me.field_e / 2 - 152;
                        var8 = nn.field_b / 2 - 18;
                        var9.setColor(param4);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, 2 + var8, 3 * param1, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, var8 - -1, 301, 31);
                        var9.fillRect(param1 * 3 + (var7 + 2), 2 + var8, 300 - 3 * param1, 30);
                        var9.setFont(ha.field_a);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, (304 + -(6 * param0.length())) / 2 + var7, 22 + var8);
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
                        if (gd.field_a != null) {
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9.setFont(ha.field_a);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(gd.field_a, me.field_e / 2 - 6 * gd.field_a.length() / 2, -26 + nn.field_b / 2);
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
                    tm.field_i.repaint();
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

    final static void a(int[] param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var12 = -param8;
        L0: while (true) {
          if (var12 >= 0) {
            L1: {
              if (param4 == -28646) {
                break L1;
              } else {
                ge.a(69);
                break L1;
              }
            }
            return;
          } else {
            var13 = -param5;
            L2: while (true) {
              if (0 <= var13) {
                param1 = param1 + param7;
                param6 = param6 + param9;
                var12++;
                continue L0;
              } else {
                param1++;
                param3 = param0[param1];
                if (param3 != 0) {
                  if (255 != param3) {
                    var11 = 255 & param3;
                    var10 = param2[param6];
                    param6++;
                    param2[param6] = ee.a(we.a(16711935, we.a(16711935, var10) * var11 >> -2103339224), we.a(16711920, we.a(var10, 65280) * var11) >> -28786776);
                    var13++;
                    continue L2;
                  } else {
                    param6++;
                    var13++;
                    continue L2;
                  }
                } else {
                  param6++;
                  var13++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((ge) this).field_o;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    private final synchronized void b(int param0) {
        if (((ge) this).field_o == null) {
            return;
        }
        if (param0 < 23) {
            Object var3 = null;
            ((ge) this).startProduction((java.awt.image.ImageConsumer) null);
        }
        ((ge) this).field_o.setPixels(0, 0, ((ge) this).field_g, ((ge) this).field_d, ((ge) this).field_j, ((ge) this).field_c, 0, ((ge) this).field_g);
        ((ge) this).field_o.imageComplete(2);
    }

    final void a(int param0, java.awt.Component param1, byte param2, int param3) {
        ((ge) this).field_d = param0;
        ((ge) this).field_g = param3;
        ((ge) this).field_c = new int[param0 * param3 + 1];
        ((ge) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((ge) this).field_b = param1.createImage((java.awt.image.ImageProducer) this);
        this.b(88);
        boolean discarded$0 = param1.prepareImage(((ge) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(111);
        boolean discarded$1 = param1.prepareImage(((ge) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(49);
        boolean discarded$8 = param1.prepareImage(((ge) this).field_b, (java.awt.image.ImageObserver) this);
        ((ge) this).a((byte) 109);
        if (param2 > -91) {
            field_m = null;
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (param0 != -134) {
            Object var3 = null;
            ge.a((String) null, -93, true, -3, (java.awt.Color) null);
        }
        if (!(!param1.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (param1.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (param1.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (param1.equals((Object) (Object) "C")) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    public static void a(int param0) {
        if (param0 != 6) {
            Object var2 = null;
            ge.a((int[]) null, -98, (int[]) null, -45, 88, 3, -20, 17, 70, -82);
        }
        field_p = null;
        field_l = null;
        field_m = null;
        field_k = null;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((ge) this).field_o)) {
            ((ge) this).field_o = null;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((ge) this).addConsumer(param0);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((ge) this).field_o = param0;
        param0.setDimensions(((ge) this).field_g, ((ge) this).field_d);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((ge) this).field_j);
        param0.setHints(14);
    }

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        this.b(101);
        if (param2 >= -56) {
            ge.a(-40);
        }
        boolean discarded$0 = param0.drawImage(((ge) this).field_b, param1, param3, (java.awt.image.ImageObserver) this);
    }

    ge() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "to return to the normal view.";
        field_n = true;
    }
}
