/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl implements Iterator {
    private tc field_d;
    static wk field_e;
    private int field_b;
    private tc field_c;
    static String field_a;
    static String field_f;
    static me field_i;
    private m field_g;
    static String field_h;

    public final void remove() {
        if (!(((tl) this).field_c != null)) {
            throw new IllegalStateException();
        }
        ((tl) this).field_c.d(42);
        ((tl) this).field_c = null;
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
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
                        var9 = si.field_b.getGraphics();
                        if (null != lf.field_g) {
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
                        lf.field_g = new java.awt.Font("Helvetica", 1, 13);
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
                        if (!param3) {
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
                        var9.fillRect(0, 0, bn.field_b, dt.field_a);
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
                        if (gp.field_e != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        gp.field_e = si.field_b.createImage(304, 34);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = gp.field_e.getGraphics();
                        var10.setColor(param1);
                        if (param0 == -5790) {
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
                    return;
                }
                case 10: {
                    try {
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param4, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(param4 * 3 + 2, 2, 300 + -(param4 * 3), 30);
                        var10.setFont(lf.field_g);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param2, (304 - 6 * param2.length()) / 2, 22);
                        boolean discarded$2 = var9.drawImage(gp.field_e, -152 + bn.field_b / 2, dt.field_a / 2 + -18, (java.awt.image.ImageObserver) null);
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
                        var7 = bn.field_b / 2 - 152;
                        var8 = -18 + dt.field_a / 2;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 - -2, param4 * 3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                        var9.fillRect(param4 * 3 + 2 + var7, var8 + 2, -(param4 * 3) + 300, 30);
                        var9.setFont(lf.field_g);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, 22 + var8);
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
                        if (an.field_G != null) {
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
                        var9.setFont(lf.field_g);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(an.field_G, bn.field_b / 2 + -(an.field_G.length() * 6 / 2), dt.field_a / 2 + -26);
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
                    si.field_b.repaint();
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(byte param0) {
        qn.b();
        if (param0 != -90) {
            field_i = null;
            ll.field_Rb.c(2);
            return;
        }
        ll.field_Rb.c(2);
    }

    public final Object next() {
        int var2 = 0;
        tc var3 = null;
        tc var4 = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((tl) this).field_g.field_c[((tl) this).field_b - 1] == ((tl) this).field_d) {
          L0: while (true) {
            if (((tl) this).field_g.field_d > ((tl) this).field_b) {
              ((tl) this).field_b = ((tl) this).field_b + 1;
              var3 = ((tl) this).field_g.field_c[((tl) this).field_b].field_b;
              if (var3 != ((tl) this).field_g.field_c[-1 + ((tl) this).field_b]) {
                ((tl) this).field_c = var3;
                ((tl) this).field_d = var3.field_b;
                return (Object) (Object) var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((tl) this).field_d;
          ((tl) this).field_d = var4.field_b;
          ((tl) this).field_c = var4;
          return (Object) (Object) var4;
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((tl) this).field_g.field_c[-1 + ((tl) this).field_b] == ((tl) this).field_d) {
          L0: while (true) {
            if (((tl) this).field_b < ((tl) this).field_g.field_d) {
              ((tl) this).field_b = ((tl) this).field_b + 1;
              if (((tl) this).field_g.field_c[((tl) this).field_b].field_b != ((tl) this).field_g.field_c[((tl) this).field_b - 1]) {
                ((tl) this).field_d = ((tl) this).field_g.field_c[((tl) this).field_b + -1].field_b;
                return true;
              } else {
                ((tl) this).field_d = ((tl) this).field_g.field_c[((tl) this).field_b - 1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0, kl param1, kl param2) {
        jj.field_c = param2;
        up.field_e = param1;
        if (param0 <= -117) {
            return;
        }
        field_a = null;
    }

    public static void a(byte param0) {
        field_a = null;
        field_i = null;
        int var1 = -28 % ((param0 - -69) / 51);
        field_f = null;
        field_e = null;
        field_h = null;
    }

    private final void c(byte param0) {
        ((tl) this).field_c = null;
        ((tl) this).field_d = ((tl) this).field_g.field_c[0].field_b;
        if (param0 >= -85) {
          ((tl) this).field_c = null;
          ((tl) this).field_b = 1;
          return;
        } else {
          ((tl) this).field_b = 1;
          return;
        }
    }

    tl(m param0) {
        ((tl) this).field_c = null;
        ((tl) this).field_g = param0;
        this.c((byte) -101);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_f = "Rune";
        field_i = new me(6, 0, 4, 2);
        field_h = "Log in / Create account";
    }
}
