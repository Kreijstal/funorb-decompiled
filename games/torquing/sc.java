/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends hn implements fp, ng {
    private nm field_C;
    private rb field_D;
    private lg field_E;

    private final String h(int param0) {
        if (param0 != -29996) {
            Object var3 = null;
            ((sc) this).a((byte) -117, (lg) null, -25, -101, -74);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    sc(nm param0) {
        super(0, 0, 288, 0, (el) null);
        ((sc) this).field_C = param0;
        ((sc) this).field_E = new lg(vd.field_d, (ca) null);
        ((sc) this).field_E.field_q = (el) (Object) new rf();
        String var7 = ff.a(new String[2], 0, md.field_d);
        int var3 = 20;
        pc var4 = new pc(dg.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, dg.field_e.field_x, -1, 2147483647, true);
        ((sc) this).field_D = new rb(var7, (el) (Object) var4);
        ((sc) this).field_D.field_n = "";
        ((sc) this).field_D.a(0, (byte) -115, jp.field_e);
        ((sc) this).field_D.a(1, (byte) -93, jp.field_e);
        ((sc) this).field_D.field_p = -40 + ((sc) this).field_p;
        ((sc) this).field_D.field_t = (ca) this;
        ((sc) this).field_D.a((byte) 46, 26, ((sc) this).field_p - 40, var3);
        var3 = var3 + (15 + ((sc) this).field_D.field_o);
        ((sc) this).a((gm) (Object) ((sc) this).field_D, -6938);
        int var5 = 4;
        int var6 = 200;
        ((sc) this).field_E.a((byte) -97, 300 + -var6 >> -456922623, var3, 40, var6);
        ((sc) this).field_E.field_t = (ca) this;
        ((sc) this).a((gm) (Object) ((sc) this).field_E, -6938);
        ((sc) this).a((byte) -49, 0, 0, var3 - (-55 + -var5), 300);
    }

    final static void a(int param0, java.awt.Color param1, boolean param2, byte param3, String param4) {
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
                        var9 = k.field_d.getGraphics();
                        if (vb.field_d == null) {
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
                        vb.field_d = new java.awt.Font("Helvetica", 1, 13);
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
                        if (param2) {
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
                        statePc = 6;
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
                        var9.fillRect(0, 0, wk.field_d, ul.field_a);
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
                        if (param1 != null) {
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
                        param1 = new java.awt.Color(140, 17, 17);
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
                        if (of.field_u == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        of.field_u = k.field_d.createImage(304, 34);
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
                        var10 = of.field_u.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, param0 * 3, 30);
                        var7 = 19 % ((-41 - param3) / 52);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(param0 * 3 + 2, 2, -(param0 * 3) + 300, 30);
                        var10.setFont(vb.field_d);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(of.field_u, wk.field_d / 2 + -152, -18 + ul.field_a / 2, (java.awt.image.ImageObserver) null);
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
                        var7 = -152 + wk.field_d / 2;
                        var8 = ul.field_a / 2 + -18;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 + 2, 3 * param0, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, 1 + var8, 301, 31);
                        var9.fillRect(2 + (var7 + 3 * param0), var8 - -2, 300 - param0 * 3, 30);
                        var9.setFont(vb.field_d);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param4, var7 - -((-(6 * param4.length()) + 304) / 2), var8 - -22);
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
                        if (null == rh.field_a) {
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
                        var9.setFont(vb.field_d);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(rh.field_a, wk.field_d / 2 - rh.field_a.length() * 6 / 2, ul.field_a / 2 + -26);
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var5 = (Exception) (Object) caughtException;
                    k.field_d.repaint();
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

    public final void a(byte param0, int param1, int param2, rb param3) {
        int var6 = 0;
        var6 = Torquing.field_u;
        if (param0 > 106) {
          if (param2 != 0) {
            if (1 != param2) {
              if (2 == param2) {
                d.a("conduct.ws", (byte) 31);
                return;
              } else {
                return;
              }
            } else {
              d.a("privacy.ws", (byte) 31);
              return;
            }
          } else {
            d.a("terms.ws", (byte) 31);
            return;
          }
        } else {
          return;
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        if (param0 >= -85) {
          L0: {
            ((sc) this).field_C = null;
            if (param1 == ((sc) this).field_E) {
              m.c(-119);
              ((sc) this).field_C.b(true);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param1 == ((sc) this).field_E) {
              m.c(-119);
              ((sc) this).field_C.b(true);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, 98)) {
          return true;
        } else {
          if (param0 == 98) {
            return ((sc) this).a((byte) 19, param1);
          } else {
            var5 = -40 % ((-33 - param3) / 57);
            if (99 == param0) {
              return ((sc) this).b(param1, -9928);
            } else {
              return false;
            }
          }
        }
    }

    private final String i(int param0) {
        if (param0 <= 117) {
            ((sc) this).field_E = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    static {
    }
}
