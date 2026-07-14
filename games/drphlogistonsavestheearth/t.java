/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static he[] field_c;
    static int field_b;
    static he field_a;
    static nh field_d;

    final static void a(boolean param0, int param1, String param2, int param3, java.awt.Color param4) {
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
                        var9 = n.field_g.getGraphics();
                        if (bd.field_S != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        bd.field_S = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, fg.field_h, bh.field_a);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
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
                        statePc = 16;
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (ac.field_h != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ac.field_h = n.field_g.createImage(304, 34);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = ac.field_h.getGraphics();
                        var10.setColor(param4);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, param1 * 3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(param1 * 3 + 2, 2, 300 - param1 * 3, 30);
                        var10.setFont(bd.field_S);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                        boolean discarded$2 = var9.drawImage(ac.field_h, -152 + fg.field_h / 2, bh.field_a / param3 - 18, (java.awt.image.ImageObserver) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = fg.field_h / 2 - 152;
                        var8 = -18 + bh.field_a / 2;
                        var9.setColor(param4);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(var7 + 2, 2 + var8, 3 * param1, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 - -1, 1 + var8, 301, 31);
                        var9.fillRect(param1 * 3 + (2 + var7), 2 + var8, -(3 * param1) + 300, 30);
                        var9.setFont(bd.field_S);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, var8 + 22);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null != pc.field_d) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9.setFont(bd.field_S);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(pc.field_d, fg.field_h / 2 + -(pc.field_d.length() * 6 / 2), bh.field_a / 2 - 26);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    var5 = (Exception) (Object) caughtException;
                    n.field_g.repaint();
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 >= -88) {
          var2 = null;
          t.a(true, -56, (String) null, 9, (java.awt.Color) null);
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = 1;
        L0: while (true) {
          if (-2 <= (param0 ^ -1)) {
            if (1 != param0) {
              if (param1 != -103) {
                field_b = -110;
                return var3;
              } else {
                return var3;
              }
            } else {
              return var3 * param2;
            }
          } else {
            L1: {
              if ((param0 & 1) != 0) {
                var3 = var3 * param2;
                break L1;
              } else {
                break L1;
              }
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
